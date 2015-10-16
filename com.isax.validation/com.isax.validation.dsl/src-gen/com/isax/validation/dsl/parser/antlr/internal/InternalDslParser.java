package com.isax.validation.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.isax.validation.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start on'", "'for'", "'holds that'", "':'", "'define'", "'as'", "'*'", "','", "'where holds'", "'{'", "'}'", "'with property'", "'being'", "'('", "')'", "'or'", "'and'", "'implies'", "'=>'", "'not'", "'['", "']'", "'becomes'", "':='", "'in'", "'v'", "'n'", "'.'", "'each'", "'any'", "'must have'", "'must not have'", "'can have'", "'parent'", "'child'", "'ancestor'", "'descendant'", "'multiple parents'", "'multiple children'", "'multiple ancestors'", "'multiple descendants'", "'equals'", "'not equals'", "'greater than'", "'lesser than'", "'greater or equals than'", "'lesser or equals than'"
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
    public static final int T__57=57;
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
    public String getGrammarFileName() { return "../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Validator";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleValidator"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:68:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:69:2: (iv_ruleValidator= ruleValidator EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:70:2: iv_ruleValidator= ruleValidator EOF
            {
             newCompositeNode(grammarAccess.getValidatorRule()); 
            pushFollow(FOLLOW_ruleValidator_in_entryRuleValidator75);
            iv_ruleValidator=ruleValidator();

            state._fsp--;

             current =iv_ruleValidator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidator85); 

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
    // $ANTLR end "entryRuleValidator"


    // $ANTLR start "ruleValidator"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:77:1: ruleValidator returns [EObject current=null] : ( (lv_sentences_0_0= ruleSentence ) )+ ;
    public final EObject ruleValidator() throws RecognitionException {
        EObject current = null;

        EObject lv_sentences_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:80:28: ( ( (lv_sentences_0_0= ruleSentence ) )+ )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:81:1: ( (lv_sentences_0_0= ruleSentence ) )+
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:81:1: ( (lv_sentences_0_0= ruleSentence ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)||LA1_0==15||(LA1_0>=39 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:82:1: (lv_sentences_0_0= ruleSentence )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:82:1: (lv_sentences_0_0= ruleSentence )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:83:3: lv_sentences_0_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValidatorAccess().getSentencesSentenceParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSentence_in_ruleValidator130);
            	    lv_sentences_0_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValidatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentences",
            	            		lv_sentences_0_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleValidator"


    // $ANTLR start "entryRuleSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:107:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:108:2: (iv_ruleSentence= ruleSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:109:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_ruleSentence_in_entryRuleSentence166);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSentence176); 

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:116:1: ruleSentence returns [EObject current=null] : (this_StartOnSentence_0= ruleStartOnSentence | this_DefinitionSentence_1= ruleDefinitionSentence | this_ConstraintSentence_2= ruleConstraintSentence | this_PredicateDefinitionSentence_3= rulePredicateDefinitionSentence ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject this_StartOnSentence_0 = null;

        EObject this_DefinitionSentence_1 = null;

        EObject this_ConstraintSentence_2 = null;

        EObject this_PredicateDefinitionSentence_3 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:119:28: ( (this_StartOnSentence_0= ruleStartOnSentence | this_DefinitionSentence_1= ruleDefinitionSentence | this_ConstraintSentence_2= ruleConstraintSentence | this_PredicateDefinitionSentence_3= rulePredicateDefinitionSentence ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:120:1: (this_StartOnSentence_0= ruleStartOnSentence | this_DefinitionSentence_1= ruleDefinitionSentence | this_ConstraintSentence_2= ruleConstraintSentence | this_PredicateDefinitionSentence_3= rulePredicateDefinitionSentence )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:120:1: (this_StartOnSentence_0= ruleStartOnSentence | this_DefinitionSentence_1= ruleDefinitionSentence | this_ConstraintSentence_2= ruleConstraintSentence | this_PredicateDefinitionSentence_3= rulePredicateDefinitionSentence )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case 39:
            case 40:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            case 15:
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
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:121:5: this_StartOnSentence_0= ruleStartOnSentence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getStartOnSentenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStartOnSentence_in_ruleSentence223);
                    this_StartOnSentence_0=ruleStartOnSentence();

                    state._fsp--;

                     
                            current = this_StartOnSentence_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:131:5: this_DefinitionSentence_1= ruleDefinitionSentence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getDefinitionSentenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDefinitionSentence_in_ruleSentence250);
                    this_DefinitionSentence_1=ruleDefinitionSentence();

                    state._fsp--;

                     
                            current = this_DefinitionSentence_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:141:5: this_ConstraintSentence_2= ruleConstraintSentence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getConstraintSentenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstraintSentence_in_ruleSentence277);
                    this_ConstraintSentence_2=ruleConstraintSentence();

                    state._fsp--;

                     
                            current = this_ConstraintSentence_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:151:5: this_PredicateDefinitionSentence_3= rulePredicateDefinitionSentence
                    {
                     
                            newCompositeNode(grammarAccess.getSentenceAccess().getPredicateDefinitionSentenceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePredicateDefinitionSentence_in_ruleSentence304);
                    this_PredicateDefinitionSentence_3=rulePredicateDefinitionSentence();

                    state._fsp--;

                     
                            current = this_PredicateDefinitionSentence_3; 
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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleStartOnSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:167:1: entryRuleStartOnSentence returns [EObject current=null] : iv_ruleStartOnSentence= ruleStartOnSentence EOF ;
    public final EObject entryRuleStartOnSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartOnSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:168:2: (iv_ruleStartOnSentence= ruleStartOnSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:169:2: iv_ruleStartOnSentence= ruleStartOnSentence EOF
            {
             newCompositeNode(grammarAccess.getStartOnSentenceRule()); 
            pushFollow(FOLLOW_ruleStartOnSentence_in_entryRuleStartOnSentence339);
            iv_ruleStartOnSentence=ruleStartOnSentence();

            state._fsp--;

             current =iv_ruleStartOnSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartOnSentence349); 

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
    // $ANTLR end "entryRuleStartOnSentence"


    // $ANTLR start "ruleStartOnSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:176:1: ruleStartOnSentence returns [EObject current=null] : (otherlv_0= 'start on' ( (lv_definition_1_0= ruleNodeDefinition ) ) ) ;
    public final EObject ruleStartOnSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_definition_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:179:28: ( (otherlv_0= 'start on' ( (lv_definition_1_0= ruleNodeDefinition ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:180:1: (otherlv_0= 'start on' ( (lv_definition_1_0= ruleNodeDefinition ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:180:1: (otherlv_0= 'start on' ( (lv_definition_1_0= ruleNodeDefinition ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:180:3: otherlv_0= 'start on' ( (lv_definition_1_0= ruleNodeDefinition ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStartOnSentence386); 

                	newLeafNode(otherlv_0, grammarAccess.getStartOnSentenceAccess().getStartOnKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:184:1: ( (lv_definition_1_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:185:1: (lv_definition_1_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:185:1: (lv_definition_1_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:186:3: lv_definition_1_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getStartOnSentenceAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleStartOnSentence407);
            lv_definition_1_0=ruleNodeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartOnSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"definition",
                    		lv_definition_1_0, 
                    		"NodeDefinition");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleStartOnSentence"


    // $ANTLR start "entryRuleDefinitionSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:210:1: entryRuleDefinitionSentence returns [EObject current=null] : iv_ruleDefinitionSentence= ruleDefinitionSentence EOF ;
    public final EObject entryRuleDefinitionSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:211:2: (iv_ruleDefinitionSentence= ruleDefinitionSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:212:2: iv_ruleDefinitionSentence= ruleDefinitionSentence EOF
            {
             newCompositeNode(grammarAccess.getDefinitionSentenceRule()); 
            pushFollow(FOLLOW_ruleDefinitionSentence_in_entryRuleDefinitionSentence443);
            iv_ruleDefinitionSentence=ruleDefinitionSentence();

            state._fsp--;

             current =iv_ruleDefinitionSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSentence453); 

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
    // $ANTLR end "entryRuleDefinitionSentence"


    // $ANTLR start "ruleDefinitionSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:219:1: ruleDefinitionSentence returns [EObject current=null] : ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) ) ;
    public final EObject ruleDefinitionSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_quantification_0_0 = null;

        Enumerator lv_qualifier_2_0 = null;

        EObject lv_target_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:222:28: ( ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:223:1: ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:223:1: ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:223:2: ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:223:2: ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=39 && LA3_0<=40)) ) {
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
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:223:3: ( (lv_quantification_0_0= ruleQuantification ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:223:3: ( (lv_quantification_0_0= ruleQuantification ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:224:1: (lv_quantification_0_0= ruleQuantification )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:224:1: (lv_quantification_0_0= ruleQuantification )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:225:3: lv_quantification_0_0= ruleQuantification
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionSentenceAccess().getQuantificationQuantificationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantification_in_ruleDefinitionSentence500);
                    lv_quantification_0_0=ruleQuantification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefinitionSentenceRule());
                    	        }
                           		set(
                           			current, 
                           			"quantification",
                            		lv_quantification_0_0, 
                            		"Quantification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:242:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:242:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:243:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:243:1: (otherlv_1= RULE_ID )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:244:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionSentenceRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinitionSentence526); 

                    		newLeafNode(otherlv_1, grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:255:3: ( (lv_qualifier_2_0= ruleRelationQualifier ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:256:1: (lv_qualifier_2_0= ruleRelationQualifier )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:256:1: (lv_qualifier_2_0= ruleRelationQualifier )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:257:3: lv_qualifier_2_0= ruleRelationQualifier
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionSentenceAccess().getQualifierRelationQualifierEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationQualifier_in_ruleDefinitionSentence548);
            lv_qualifier_2_0=ruleRelationQualifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"qualifier",
                    		lv_qualifier_2_0, 
                    		"RelationQualifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:273:2: ( (lv_target_3_0= ruleTargetDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:274:1: (lv_target_3_0= ruleTargetDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:274:1: (lv_target_3_0= ruleTargetDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:275:3: lv_target_3_0= ruleTargetDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionSentenceAccess().getTargetTargetDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetDefinition_in_ruleDefinitionSentence569);
            lv_target_3_0=ruleTargetDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"target",
                    		lv_target_3_0, 
                    		"TargetDefinition");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDefinitionSentence"


    // $ANTLR start "entryRuleConstraintSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:299:1: entryRuleConstraintSentence returns [EObject current=null] : iv_ruleConstraintSentence= ruleConstraintSentence EOF ;
    public final EObject entryRuleConstraintSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:300:2: (iv_ruleConstraintSentence= ruleConstraintSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:301:2: iv_ruleConstraintSentence= ruleConstraintSentence EOF
            {
             newCompositeNode(grammarAccess.getConstraintSentenceRule()); 
            pushFollow(FOLLOW_ruleConstraintSentence_in_entryRuleConstraintSentence605);
            iv_ruleConstraintSentence=ruleConstraintSentence();

            state._fsp--;

             current =iv_ruleConstraintSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintSentence615); 

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
    // $ANTLR end "entryRuleConstraintSentence"


    // $ANTLR start "ruleConstraintSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:308:1: ruleConstraintSentence returns [EObject current=null] : (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? (otherlv_3= 'holds that' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) ) ;
    public final EObject ruleConstraintSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_quantifications_1_0 = null;

        EObject lv_nodes_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:311:28: ( (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? (otherlv_3= 'holds that' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:312:1: (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? (otherlv_3= 'holds that' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:312:1: (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? (otherlv_3= 'holds that' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:312:3: otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? (otherlv_3= 'holds that' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleConstraintSentence652); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintSentenceAccess().getForKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:316:1: ( (lv_quantifications_1_0= ruleQuantificationList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=39 && LA4_0<=40)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:317:1: (lv_quantifications_1_0= ruleQuantificationList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:317:1: (lv_quantifications_1_0= ruleQuantificationList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:318:3: lv_quantifications_1_0= ruleQuantificationList
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintSentenceAccess().getQuantificationsQuantificationListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantificationList_in_ruleConstraintSentence673);
                    lv_quantifications_1_0=ruleQuantificationList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintSentenceRule());
                    	        }
                           		set(
                           			current, 
                           			"quantifications",
                            		lv_quantifications_1_0, 
                            		"QuantificationList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:334:3: ( (lv_nodes_2_0= ruleNodeReferenceList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:335:1: (lv_nodes_2_0= ruleNodeReferenceList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:335:1: (lv_nodes_2_0= ruleNodeReferenceList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:336:3: lv_nodes_2_0= ruleNodeReferenceList
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintSentenceAccess().getNodesNodeReferenceListParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeReferenceList_in_ruleConstraintSentence695);
                    lv_nodes_2_0=ruleNodeReferenceList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintSentenceRule());
                    	        }
                           		set(
                           			current, 
                           			"nodes",
                            		lv_nodes_2_0, 
                            		"NodeReferenceList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:352:3: (otherlv_3= 'holds that' | otherlv_4= ':' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:352:5: otherlv_3= 'holds that'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleConstraintSentence709); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintSentenceAccess().getHoldsThatKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:357:7: otherlv_4= ':'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleConstraintSentence727); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstraintSentenceAccess().getColonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:361:2: ( (lv_predicate_5_0= rulePredicateExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:362:1: (lv_predicate_5_0= rulePredicateExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:362:1: (lv_predicate_5_0= rulePredicateExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:363:3: lv_predicate_5_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_ruleConstraintSentence749);
            lv_predicate_5_0=rulePredicateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_5_0, 
                    		"PredicateExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleConstraintSentence"


    // $ANTLR start "entryRulePredicateDefinitionSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:387:1: entryRulePredicateDefinitionSentence returns [EObject current=null] : iv_rulePredicateDefinitionSentence= rulePredicateDefinitionSentence EOF ;
    public final EObject entryRulePredicateDefinitionSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinitionSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:388:2: (iv_rulePredicateDefinitionSentence= rulePredicateDefinitionSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:389:2: iv_rulePredicateDefinitionSentence= rulePredicateDefinitionSentence EOF
            {
             newCompositeNode(grammarAccess.getPredicateDefinitionSentenceRule()); 
            pushFollow(FOLLOW_rulePredicateDefinitionSentence_in_entryRulePredicateDefinitionSentence785);
            iv_rulePredicateDefinitionSentence=rulePredicateDefinitionSentence();

            state._fsp--;

             current =iv_rulePredicateDefinitionSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateDefinitionSentence795); 

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
    // $ANTLR end "entryRulePredicateDefinitionSentence"


    // $ANTLR start "rulePredicateDefinitionSentence"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:396:1: rulePredicateDefinitionSentence returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) ) ;
    public final EObject rulePredicateDefinitionSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:399:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:400:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:400:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:400:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulePredicateDefinitionSentence832); 

                	newLeafNode(otherlv_0, grammarAccess.getPredicateDefinitionSentenceAccess().getDefineKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:404:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:405:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:405:1: (lv_name_1_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:406:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicateDefinitionSentence849); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPredicateDefinitionSentenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicateDefinitionSentenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:422:2: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:423:1: (lv_parameters_2_0= ruleParameterList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:423:1: (lv_parameters_2_0= ruleParameterList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:424:3: lv_parameters_2_0= ruleParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersParameterListParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_rulePredicateDefinitionSentence875);
                    lv_parameters_2_0=ruleParameterList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredicateDefinitionSentenceRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"ParameterList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:440:3: (otherlv_3= 'as' | otherlv_4= ':' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:440:5: otherlv_3= 'as'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulePredicateDefinitionSentence889); 

                        	newLeafNode(otherlv_3, grammarAccess.getPredicateDefinitionSentenceAccess().getAsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:445:7: otherlv_4= ':'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePredicateDefinitionSentence907); 

                        	newLeafNode(otherlv_4, grammarAccess.getPredicateDefinitionSentenceAccess().getColonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:449:2: ( (lv_predicate_5_0= rulePredicateExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:450:1: (lv_predicate_5_0= rulePredicateExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:450:1: (lv_predicate_5_0= rulePredicateExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:451:3: lv_predicate_5_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicateDefinitionSentence929);
            lv_predicate_5_0=rulePredicateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateDefinitionSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_5_0, 
                    		"PredicateExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePredicateDefinitionSentence"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:475:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:476:2: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:477:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition965);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;

             current =iv_ruleNodeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition975); 

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
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:484:1: ruleNodeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? ) ;
    public final EObject ruleNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_collection_1_0=null;
        EObject lv_selectors_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:487:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:488:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:488:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:488:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:488:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:489:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:489:1: (lv_name_0_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:490:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeDefinition1017); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNodeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:506:2: ( (lv_collection_1_0= '*' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:507:1: (lv_collection_1_0= '*' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:507:1: (lv_collection_1_0= '*' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:508:3: lv_collection_1_0= '*'
                    {
                    lv_collection_1_0=(Token)match(input,17,FOLLOW_17_in_ruleNodeDefinition1040); 

                            newLeafNode(lv_collection_1_0, grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "collection", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:521:3: ( (lv_selectors_2_0= ruleSelectorList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:522:1: (lv_selectors_2_0= ruleSelectorList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:522:1: (lv_selectors_2_0= ruleSelectorList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:523:3: lv_selectors_2_0= ruleSelectorList
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getSelectorsSelectorListParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorList_in_ruleNodeDefinition1075);
                    lv_selectors_2_0=ruleSelectorList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"selectors",
                            		lv_selectors_2_0, 
                            		"SelectorList");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleNodeReferenceList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:547:1: entryRuleNodeReferenceList returns [EObject current=null] : iv_ruleNodeReferenceList= ruleNodeReferenceList EOF ;
    public final EObject entryRuleNodeReferenceList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReferenceList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:548:2: (iv_ruleNodeReferenceList= ruleNodeReferenceList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:549:2: iv_ruleNodeReferenceList= ruleNodeReferenceList EOF
            {
             newCompositeNode(grammarAccess.getNodeReferenceListRule()); 
            pushFollow(FOLLOW_ruleNodeReferenceList_in_entryRuleNodeReferenceList1112);
            iv_ruleNodeReferenceList=ruleNodeReferenceList();

            state._fsp--;

             current =iv_ruleNodeReferenceList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeReferenceList1122); 

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
    // $ANTLR end "entryRuleNodeReferenceList"


    // $ANTLR start "ruleNodeReferenceList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:556:1: ruleNodeReferenceList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleNodeReferenceList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:559:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:560:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:560:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:560:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:560:2: ( (otherlv_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:561:1: (otherlv_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:561:1: (otherlv_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:562:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeReferenceListRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeReferenceList1167); 

            		newLeafNode(otherlv_0, grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:573:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:573:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleNodeReferenceList1180); 

            	        	newLeafNode(otherlv_1, grammarAccess.getNodeReferenceListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:577:1: ( (otherlv_2= RULE_ID ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:578:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:578:1: (otherlv_2= RULE_ID )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:579:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNodeReferenceListRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeReferenceList1200); 

            	    		newLeafNode(otherlv_2, grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleNodeReferenceList"


    // $ANTLR start "entryRuleTargetDefinition"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:598:1: entryRuleTargetDefinition returns [EObject current=null] : iv_ruleTargetDefinition= ruleTargetDefinition EOF ;
    public final EObject entryRuleTargetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetDefinition = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:599:2: (iv_ruleTargetDefinition= ruleTargetDefinition EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:600:2: iv_ruleTargetDefinition= ruleTargetDefinition EOF
            {
             newCompositeNode(grammarAccess.getTargetDefinitionRule()); 
            pushFollow(FOLLOW_ruleTargetDefinition_in_entryRuleTargetDefinition1238);
            iv_ruleTargetDefinition=ruleTargetDefinition();

            state._fsp--;

             current =iv_ruleTargetDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetDefinition1248); 

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
    // $ANTLR end "entryRuleTargetDefinition"


    // $ANTLR start "ruleTargetDefinition"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:607:1: ruleTargetDefinition returns [EObject current=null] : ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where holds' otherlv_3= '{' ( (lv_predicate_4_0= rulePredicateExpression ) ) otherlv_5= '}' )? (otherlv_6= 'with property' otherlv_7= '{' ( (lv_assignments_8_0= ruleAssignmentList ) ) otherlv_9= '}' )? ) ;
    public final EObject ruleTargetDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_axis_0_0 = null;

        EObject lv_definition_1_0 = null;

        EObject lv_predicate_4_0 = null;

        EObject lv_assignments_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:610:28: ( ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where holds' otherlv_3= '{' ( (lv_predicate_4_0= rulePredicateExpression ) ) otherlv_5= '}' )? (otherlv_6= 'with property' otherlv_7= '{' ( (lv_assignments_8_0= ruleAssignmentList ) ) otherlv_9= '}' )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:611:1: ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where holds' otherlv_3= '{' ( (lv_predicate_4_0= rulePredicateExpression ) ) otherlv_5= '}' )? (otherlv_6= 'with property' otherlv_7= '{' ( (lv_assignments_8_0= ruleAssignmentList ) ) otherlv_9= '}' )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:611:1: ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where holds' otherlv_3= '{' ( (lv_predicate_4_0= rulePredicateExpression ) ) otherlv_5= '}' )? (otherlv_6= 'with property' otherlv_7= '{' ( (lv_assignments_8_0= ruleAssignmentList ) ) otherlv_9= '}' )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:611:2: ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where holds' otherlv_3= '{' ( (lv_predicate_4_0= rulePredicateExpression ) ) otherlv_5= '}' )? (otherlv_6= 'with property' otherlv_7= '{' ( (lv_assignments_8_0= ruleAssignmentList ) ) otherlv_9= '}' )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:611:2: ( (lv_axis_0_0= ruleAxis ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:612:1: (lv_axis_0_0= ruleAxis )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:612:1: (lv_axis_0_0= ruleAxis )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:613:3: lv_axis_0_0= ruleAxis
            {
             
            	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getAxisAxisEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAxis_in_ruleTargetDefinition1294);
            lv_axis_0_0=ruleAxis();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_0_0, 
                    		"Axis");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:629:2: ( (lv_definition_1_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:630:1: (lv_definition_1_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:630:1: (lv_definition_1_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:631:3: lv_definition_1_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleTargetDefinition1315);
            lv_definition_1_0=ruleNodeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"definition",
                    		lv_definition_1_0, 
                    		"NodeDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:647:2: (otherlv_2= 'where holds' otherlv_3= '{' ( (lv_predicate_4_0= rulePredicateExpression ) ) otherlv_5= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:647:4: otherlv_2= 'where holds' otherlv_3= '{' ( (lv_predicate_4_0= rulePredicateExpression ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTargetDefinition1328); 

                        	newLeafNode(otherlv_2, grammarAccess.getTargetDefinitionAccess().getWhereHoldsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTargetDefinition1340); 

                        	newLeafNode(otherlv_3, grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:655:1: ( (lv_predicate_4_0= rulePredicateExpression ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:656:1: (lv_predicate_4_0= rulePredicateExpression )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:656:1: (lv_predicate_4_0= rulePredicateExpression )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:657:3: lv_predicate_4_0= rulePredicateExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getPredicatePredicateExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicateExpression_in_ruleTargetDefinition1361);
                    lv_predicate_4_0=rulePredicateExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTargetDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_4_0, 
                            		"PredicateExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleTargetDefinition1373); 

                        	newLeafNode(otherlv_5, grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:677:3: (otherlv_6= 'with property' otherlv_7= '{' ( (lv_assignments_8_0= ruleAssignmentList ) ) otherlv_9= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:677:5: otherlv_6= 'with property' otherlv_7= '{' ( (lv_assignments_8_0= ruleAssignmentList ) ) otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleTargetDefinition1388); 

                        	newLeafNode(otherlv_6, grammarAccess.getTargetDefinitionAccess().getWithPropertyKeyword_3_0());
                        
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleTargetDefinition1400); 

                        	newLeafNode(otherlv_7, grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:685:1: ( (lv_assignments_8_0= ruleAssignmentList ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:686:1: (lv_assignments_8_0= ruleAssignmentList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:686:1: (lv_assignments_8_0= ruleAssignmentList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:687:3: lv_assignments_8_0= ruleAssignmentList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignmentListParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentList_in_ruleTargetDefinition1421);
                    lv_assignments_8_0=ruleAssignmentList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTargetDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignments",
                            		lv_assignments_8_0, 
                            		"AssignmentList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleTargetDefinition1433); 

                        	newLeafNode(otherlv_9, grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_3_3());
                        

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
    // $ANTLR end "ruleTargetDefinition"


    // $ANTLR start "entryRuleSelectorList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:715:1: entryRuleSelectorList returns [EObject current=null] : iv_ruleSelectorList= ruleSelectorList EOF ;
    public final EObject entryRuleSelectorList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:716:2: (iv_ruleSelectorList= ruleSelectorList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:717:2: iv_ruleSelectorList= ruleSelectorList EOF
            {
             newCompositeNode(grammarAccess.getSelectorListRule()); 
            pushFollow(FOLLOW_ruleSelectorList_in_entryRuleSelectorList1471);
            iv_ruleSelectorList=ruleSelectorList();

            state._fsp--;

             current =iv_ruleSelectorList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorList1481); 

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
    // $ANTLR end "entryRuleSelectorList"


    // $ANTLR start "ruleSelectorList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:724:1: ruleSelectorList returns [EObject current=null] : ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleSelectorList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_selectors_1_0 = null;

        EObject lv_selectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:727:28: ( ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:728:1: ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:728:1: ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:728:2: (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:728:2: (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:728:4: otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSelectorList1519); 

                        	newLeafNode(otherlv_0, grammarAccess.getSelectorListAccess().getBeingKeyword_0_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:732:1: ( (lv_selectors_1_0= ruleSelectorListDef ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:733:1: (lv_selectors_1_0= ruleSelectorListDef )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:733:1: (lv_selectors_1_0= ruleSelectorListDef )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:734:3: lv_selectors_1_0= ruleSelectorListDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorListDef_in_ruleSelectorList1540);
                    lv_selectors_1_0=ruleSelectorListDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectorListRule());
                    	        }
                           		set(
                           			current, 
                           			"selectors",
                            		lv_selectors_1_0, 
                            		"SelectorListDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:751:6: (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:751:6: (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:751:8: otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleSelectorList1560); 

                        	newLeafNode(otherlv_2, grammarAccess.getSelectorListAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:755:1: ( (lv_selectors_3_0= ruleSelectorListDef ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:756:1: (lv_selectors_3_0= ruleSelectorListDef )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:756:1: (lv_selectors_3_0= ruleSelectorListDef )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:757:3: lv_selectors_3_0= ruleSelectorListDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorListDef_in_ruleSelectorList1581);
                    lv_selectors_3_0=ruleSelectorListDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectorListRule());
                    	        }
                           		set(
                           			current, 
                           			"selectors",
                            		lv_selectors_3_0, 
                            		"SelectorListDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleSelectorList1593); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectorListAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "ruleSelectorList"


    // $ANTLR start "entryRuleSelectorListDef"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:785:1: entryRuleSelectorListDef returns [EObject current=null] : iv_ruleSelectorListDef= ruleSelectorListDef EOF ;
    public final EObject entryRuleSelectorListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorListDef = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:786:2: (iv_ruleSelectorListDef= ruleSelectorListDef EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:787:2: iv_ruleSelectorListDef= ruleSelectorListDef EOF
            {
             newCompositeNode(grammarAccess.getSelectorListDefRule()); 
            pushFollow(FOLLOW_ruleSelectorListDef_in_entryRuleSelectorListDef1630);
            iv_ruleSelectorListDef=ruleSelectorListDef();

            state._fsp--;

             current =iv_ruleSelectorListDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorListDef1640); 

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
    // $ANTLR end "entryRuleSelectorListDef"


    // $ANTLR start "ruleSelectorListDef"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:794:1: ruleSelectorListDef returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= 'or' ( (lv_selectors_2_0= ruleSelector ) ) )* ) ;
    public final EObject ruleSelectorListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:797:28: ( ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= 'or' ( (lv_selectors_2_0= ruleSelector ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:798:1: ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= 'or' ( (lv_selectors_2_0= ruleSelector ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:798:1: ( ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= 'or' ( (lv_selectors_2_0= ruleSelector ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:798:2: ( (lv_selectors_0_0= ruleSelector ) ) (otherlv_1= 'or' ( (lv_selectors_2_0= ruleSelector ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:798:2: ( (lv_selectors_0_0= ruleSelector ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:799:1: (lv_selectors_0_0= ruleSelector )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:799:1: (lv_selectors_0_0= ruleSelector )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:800:3: lv_selectors_0_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleSelectorListDef1686);
            lv_selectors_0_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectorListDefRule());
            	        }
                   		add(
                   			current, 
                   			"selectors",
                    		lv_selectors_0_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:816:2: (otherlv_1= 'or' ( (lv_selectors_2_0= ruleSelector ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==EOF||(LA15_3>=11 && LA15_3<=12)||(LA15_3>=14 && LA15_3<=16)||(LA15_3>=18 && LA15_3<=19)||(LA15_3>=21 && LA15_3<=22)||(LA15_3>=25 && LA15_3<=29)||LA15_3==31||LA15_3==35||(LA15_3>=39 && LA15_3<=40)) ) {
                            alt15=1;
                        }
                        else if ( (LA15_3==RULE_ID) ) {
                            int LA15_5 = input.LA(4);

                            if ( ((LA15_5>=41 && LA15_5<=43)) ) {
                                alt15=1;
                            }


                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:816:4: otherlv_1= 'or' ( (lv_selectors_2_0= ruleSelector ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSelectorListDef1699); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSelectorListDefAccess().getOrKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:820:1: ( (lv_selectors_2_0= ruleSelector ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:821:1: (lv_selectors_2_0= ruleSelector )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:821:1: (lv_selectors_2_0= ruleSelector )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:822:3: lv_selectors_2_0= ruleSelector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelector_in_ruleSelectorListDef1720);
            	    lv_selectors_2_0=ruleSelector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectorListDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selectors",
            	            		lv_selectors_2_0, 
            	            		"Selector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleSelectorListDef"


    // $ANTLR start "entryRuleSelector"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:846:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:847:2: (iv_ruleSelector= ruleSelector EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:848:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector1758);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector1768); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:855:1: ruleSelector returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:858:28: ( ( (lv_type_0_0= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:859:1: ( (lv_type_0_0= RULE_ID ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:859:1: ( (lv_type_0_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:860:1: (lv_type_0_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:860:1: (lv_type_0_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:861:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelector1809); 

            			newLeafNode(lv_type_0_0, grammarAccess.getSelectorAccess().getTypeIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRulePredicateExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:885:1: entryRulePredicateExpression returns [EObject current=null] : iv_rulePredicateExpression= rulePredicateExpression EOF ;
    public final EObject entryRulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:886:2: (iv_rulePredicateExpression= rulePredicateExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:887:2: iv_rulePredicateExpression= rulePredicateExpression EOF
            {
             newCompositeNode(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1849);
            iv_rulePredicateExpression=rulePredicateExpression();

            state._fsp--;

             current =iv_rulePredicateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression1859); 

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
    // $ANTLR end "entryRulePredicateExpression"


    // $ANTLR start "rulePredicateExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:894:1: rulePredicateExpression returns [EObject current=null] : this_AndExpression_0= ruleAndExpression ;
    public final EObject rulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:897:28: (this_AndExpression_0= ruleAndExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:899:5: this_AndExpression_0= ruleAndExpression
            {
             
                    newCompositeNode(grammarAccess.getPredicateExpressionAccess().getAndExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAndExpression_in_rulePredicateExpression1905);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePredicateExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:915:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:916:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:917:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1939);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1949); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:924:1: ruleAndExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_OrExpression_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:927:28: ( (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:928:1: (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:928:1: (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:929:5: this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getOrExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleAndExpression1996);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;

             
                    current = this_OrExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:937:1: ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18||LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:937:2: () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:937:2: ()
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:938:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:943:2: (otherlv_2= 'and' | otherlv_3= ',' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==27) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==18) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:943:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAndExpression2018); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:948:7: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleAndExpression2036); 

            	                	newLeafNode(otherlv_3, grammarAccess.getAndExpressionAccess().getCommaKeyword_1_1_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:952:2: ( (lv_rhs_4_0= ruleOrExpression ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:953:1: (lv_rhs_4_0= ruleOrExpression )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:953:1: (lv_rhs_4_0= ruleOrExpression )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:954:3: lv_rhs_4_0= ruleOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsOrExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrExpression_in_ruleAndExpression2058);
            	    lv_rhs_4_0=ruleOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_4_0, 
            	            		"OrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:978:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:979:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:980:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression2096);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression2106); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:987:1: ruleOrExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImpliesExpression_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:990:28: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:991:1: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:991:1: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:992:5: this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleImpliesExpression_in_ruleOrExpression2153);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;

             
                    current = this_ImpliesExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1000:1: ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1000:2: () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1000:2: ()
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1001:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleOrExpression2174); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1010:1: ( (lv_rhs_3_0= ruleImpliesExpression ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1011:1: (lv_rhs_3_0= ruleImpliesExpression )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1011:1: (lv_rhs_3_0= ruleImpliesExpression )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1012:3: lv_rhs_3_0= ruleImpliesExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsImpliesExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImpliesExpression_in_ruleOrExpression2195);
            	    lv_rhs_3_0=ruleImpliesExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rhs",
            	            		lv_rhs_3_0, 
            	            		"ImpliesExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1036:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1037:2: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1038:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
             newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression2233);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;

             current =iv_ruleImpliesExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpression2243); 

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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1045:1: ruleImpliesExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( () (otherlv_2= 'implies' | otherlv_3= '=>' ) ( (lv_rhs_4_0= rulePrimaryExpression ) ) )? ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1048:28: ( ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( () (otherlv_2= 'implies' | otherlv_3= '=>' ) ( (lv_rhs_4_0= rulePrimaryExpression ) ) )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1049:1: ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( () (otherlv_2= 'implies' | otherlv_3= '=>' ) ( (lv_rhs_4_0= rulePrimaryExpression ) ) )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1049:1: ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( () (otherlv_2= 'implies' | otherlv_3= '=>' ) ( (lv_rhs_4_0= rulePrimaryExpression ) ) )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1049:2: ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( () (otherlv_2= 'implies' | otherlv_3= '=>' ) ( (lv_rhs_4_0= rulePrimaryExpression ) ) )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1049:2: ( (lv_lhs_0_0= rulePrimaryExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1050:1: (lv_lhs_0_0= rulePrimaryExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1050:1: (lv_lhs_0_0= rulePrimaryExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1051:3: lv_lhs_0_0= rulePrimaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getImpliesExpressionAccess().getLhsPrimaryExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2289);
            lv_lhs_0_0=rulePrimaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"PrimaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1067:2: ( () (otherlv_2= 'implies' | otherlv_3= '=>' ) ( (lv_rhs_4_0= rulePrimaryExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=28 && LA20_0<=29)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1067:3: () (otherlv_2= 'implies' | otherlv_3= '=>' ) ( (lv_rhs_4_0= rulePrimaryExpression ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1067:3: ()
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1068:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getImpliesExpressionAccess().getImpliesExpressionLhsAction_1_0(),
                                current);
                        

                    }

                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1073:2: (otherlv_2= 'implies' | otherlv_3= '=>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==29) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1073:4: otherlv_2= 'implies'
                            {
                            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleImpliesExpression2312); 

                                	newLeafNode(otherlv_2, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1078:7: otherlv_3= '=>'
                            {
                            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleImpliesExpression2330); 

                                	newLeafNode(otherlv_3, grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_1_1());
                                

                            }
                            break;

                    }

                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1082:2: ( (lv_rhs_4_0= rulePrimaryExpression ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1083:1: (lv_rhs_4_0= rulePrimaryExpression )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1083:1: (lv_rhs_4_0= rulePrimaryExpression )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1084:3: lv_rhs_4_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRhsPrimaryExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2352);
                    lv_rhs_4_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_4_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1108:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1109:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1110:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2390);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2400); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1117:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_call_1_0 = null;

        EObject lv_inner_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1120:28: ( ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1121:1: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1121:1: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1121:2: ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1121:2: ( (lv_negated_0_0= 'not' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1122:1: (lv_negated_0_0= 'not' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1122:1: (lv_negated_0_0= 'not' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1123:3: lv_negated_0_0= 'not'
                    {
                    lv_negated_0_0=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression2443); 

                            newLeafNode(lv_negated_0_0, grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "negated", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1136:3: ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=36 && LA22_0<=37)||(LA22_0>=39 && LA22_0<=40)) ) {
                alt22=1;
            }
            else if ( (LA22_0==24) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1136:4: ( (lv_call_1_0= rulePredicateCall ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1136:4: ( (lv_call_1_0= rulePredicateCall ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1137:1: (lv_call_1_0= rulePredicateCall )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1137:1: (lv_call_1_0= rulePredicateCall )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1138:3: lv_call_1_0= rulePredicateCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCallPredicateCallParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicateCall_in_rulePrimaryExpression2479);
                    lv_call_1_0=rulePredicateCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"call",
                            		lv_call_1_0, 
                            		"PredicateCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1155:6: (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1155:6: (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1155:8: otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePrimaryExpression2498); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1159:1: ( (lv_inner_3_0= rulePredicateExpression ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1160:1: (lv_inner_3_0= rulePredicateExpression )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1160:1: (lv_inner_3_0= rulePredicateExpression )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1161:3: lv_inner_3_0= rulePredicateExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInnerPredicateExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicateExpression_in_rulePrimaryExpression2519);
                    lv_inner_3_0=rulePredicateExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"inner",
                            		lv_inner_3_0, 
                            		"PredicateExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_rulePrimaryExpression2531); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_1_2());
                        

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRulePredicateCall"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1189:1: entryRulePredicateCall returns [EObject current=null] : iv_rulePredicateCall= rulePredicateCall EOF ;
    public final EObject entryRulePredicateCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateCall = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1190:2: (iv_rulePredicateCall= rulePredicateCall EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1191:2: iv_rulePredicateCall= rulePredicateCall EOF
            {
             newCompositeNode(grammarAccess.getPredicateCallRule()); 
            pushFollow(FOLLOW_rulePredicateCall_in_entryRulePredicateCall2569);
            iv_rulePredicateCall=rulePredicateCall();

            state._fsp--;

             current =iv_rulePredicateCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateCall2579); 

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
    // $ANTLR end "entryRulePredicateCall"


    // $ANTLR start "rulePredicateCall"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1198:1: rulePredicateCall returns [EObject current=null] : ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? ) ;
    public final EObject rulePredicateCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject this_PropertyRelationPredicate_0 = null;

        EObject this_DefinitionSentencePredicate_1 = null;

        EObject this_PredicateReference_2 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1201:28: ( ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1202:1: ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1202:1: ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1202:2: (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1202:2: (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
                {
                alt23=1;
                }
                break;
            case 39:
            case 40:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==RULE_ID) ) {
                    alt23=3;
                }
                else if ( ((LA23_3>=41 && LA23_3<=43)) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1203:5: this_PropertyRelationPredicate_0= rulePropertyRelationPredicate
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateCallAccess().getPropertyRelationPredicateParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulePropertyRelationPredicate_in_rulePredicateCall2627);
                    this_PropertyRelationPredicate_0=rulePropertyRelationPredicate();

                    state._fsp--;

                     
                            current = this_PropertyRelationPredicate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1213:5: this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateCallAccess().getDefinitionSentencePredicateParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDefinitionSentencePredicate_in_rulePredicateCall2654);
                    this_DefinitionSentencePredicate_1=ruleDefinitionSentencePredicate();

                    state._fsp--;

                     
                            current = this_DefinitionSentencePredicate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1223:5: this_PredicateReference_2= rulePredicateReference
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateCallAccess().getPredicateReferenceParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateReference_in_rulePredicateCall2681);
                    this_PredicateReference_2=rulePredicateReference();

                    state._fsp--;

                     
                            current = this_PredicateReference_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1231:2: (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1231:4: otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulePredicateCall2694); 

                        	newLeafNode(otherlv_3, grammarAccess.getPredicateCallAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1235:1: ( (lv_label_4_0= RULE_ID ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1236:1: (lv_label_4_0= RULE_ID )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1236:1: (lv_label_4_0= RULE_ID )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1237:3: lv_label_4_0= RULE_ID
                    {
                    lv_label_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicateCall2711); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getPredicateCallAccess().getLabelIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredicateCallRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_rulePredicateCall2728); 

                        	newLeafNode(otherlv_5, grammarAccess.getPredicateCallAccess().getRightSquareBracketKeyword_1_2());
                        

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
    // $ANTLR end "rulePredicateCall"


    // $ANTLR start "entryRulePropertyRelationPredicate"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1265:1: entryRulePropertyRelationPredicate returns [EObject current=null] : iv_rulePropertyRelationPredicate= rulePropertyRelationPredicate EOF ;
    public final EObject entryRulePropertyRelationPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRelationPredicate = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1266:2: (iv_rulePropertyRelationPredicate= rulePropertyRelationPredicate EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1267:2: iv_rulePropertyRelationPredicate= rulePropertyRelationPredicate EOF
            {
             newCompositeNode(grammarAccess.getPropertyRelationPredicateRule()); 
            pushFollow(FOLLOW_rulePropertyRelationPredicate_in_entryRulePropertyRelationPredicate2766);
            iv_rulePropertyRelationPredicate=rulePropertyRelationPredicate();

            state._fsp--;

             current =iv_rulePropertyRelationPredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyRelationPredicate2776); 

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
    // $ANTLR end "entryRulePropertyRelationPredicate"


    // $ANTLR start "rulePropertyRelationPredicate"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1274:1: rulePropertyRelationPredicate returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) ) ;
    public final EObject rulePropertyRelationPredicate() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_relation_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1277:28: ( ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1278:1: ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1278:1: ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1278:2: ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1278:2: ( (lv_lhs_0_0= rulePropertyExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1279:1: (lv_lhs_0_0= rulePropertyExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1279:1: (lv_lhs_0_0= rulePropertyExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1280:3: lv_lhs_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyRelationPredicateAccess().getLhsPropertyExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2822);
            lv_lhs_0_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRelationPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1296:2: ( (lv_relation_1_0= rulePropertyRelation ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1297:1: (lv_relation_1_0= rulePropertyRelation )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1297:1: (lv_relation_1_0= rulePropertyRelation )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1298:3: lv_relation_1_0= rulePropertyRelation
            {
             
            	        newCompositeNode(grammarAccess.getPropertyRelationPredicateAccess().getRelationPropertyRelationEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyRelation_in_rulePropertyRelationPredicate2843);
            lv_relation_1_0=rulePropertyRelation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRelationPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"relation",
                    		lv_relation_1_0, 
                    		"PropertyRelation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1314:2: ( (lv_rhs_2_0= rulePropertyExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1315:1: (lv_rhs_2_0= rulePropertyExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1315:1: (lv_rhs_2_0= rulePropertyExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1316:3: lv_rhs_2_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyRelationPredicateAccess().getRhsPropertyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2864);
            lv_rhs_2_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRelationPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_2_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePropertyRelationPredicate"


    // $ANTLR start "entryRuleDefinitionSentencePredicate"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1340:1: entryRuleDefinitionSentencePredicate returns [EObject current=null] : iv_ruleDefinitionSentencePredicate= ruleDefinitionSentencePredicate EOF ;
    public final EObject entryRuleDefinitionSentencePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSentencePredicate = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1341:2: (iv_ruleDefinitionSentencePredicate= ruleDefinitionSentencePredicate EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1342:2: iv_ruleDefinitionSentencePredicate= ruleDefinitionSentencePredicate EOF
            {
             newCompositeNode(grammarAccess.getDefinitionSentencePredicateRule()); 
            pushFollow(FOLLOW_ruleDefinitionSentencePredicate_in_entryRuleDefinitionSentencePredicate2900);
            iv_ruleDefinitionSentencePredicate=ruleDefinitionSentencePredicate();

            state._fsp--;

             current =iv_ruleDefinitionSentencePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSentencePredicate2910); 

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
    // $ANTLR end "entryRuleDefinitionSentencePredicate"


    // $ANTLR start "ruleDefinitionSentencePredicate"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1349:1: ruleDefinitionSentencePredicate returns [EObject current=null] : ( (lv_sentence_0_0= ruleDefinitionSentence ) ) ;
    public final EObject ruleDefinitionSentencePredicate() throws RecognitionException {
        EObject current = null;

        EObject lv_sentence_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1352:28: ( ( (lv_sentence_0_0= ruleDefinitionSentence ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1353:1: ( (lv_sentence_0_0= ruleDefinitionSentence ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1353:1: ( (lv_sentence_0_0= ruleDefinitionSentence ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1354:1: (lv_sentence_0_0= ruleDefinitionSentence )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1354:1: (lv_sentence_0_0= ruleDefinitionSentence )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1355:3: lv_sentence_0_0= ruleDefinitionSentence
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionSentencePredicateAccess().getSentenceDefinitionSentenceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDefinitionSentence_in_ruleDefinitionSentencePredicate2955);
            lv_sentence_0_0=ruleDefinitionSentence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionSentencePredicateRule());
            	        }
                   		set(
                   			current, 
                   			"sentence",
                    		lv_sentence_0_0, 
                    		"DefinitionSentence");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDefinitionSentencePredicate"


    // $ANTLR start "entryRulePredicateReference"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1379:1: entryRulePredicateReference returns [EObject current=null] : iv_rulePredicateReference= rulePredicateReference EOF ;
    public final EObject entryRulePredicateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateReference = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1380:2: (iv_rulePredicateReference= rulePredicateReference EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1381:2: iv_rulePredicateReference= rulePredicateReference EOF
            {
             newCompositeNode(grammarAccess.getPredicateReferenceRule()); 
            pushFollow(FOLLOW_rulePredicateReference_in_entryRulePredicateReference2990);
            iv_rulePredicateReference=rulePredicateReference();

            state._fsp--;

             current =iv_rulePredicateReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateReference3000); 

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
    // $ANTLR end "entryRulePredicateReference"


    // $ANTLR start "rulePredicateReference"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1388:1: rulePredicateReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) ) ;
    public final EObject rulePredicateReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_arguments_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1391:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1392:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1392:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1392:2: ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1392:2: ( (otherlv_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1393:1: (otherlv_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1393:1: (otherlv_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1394:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicateReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicateReference3045); 

            		newLeafNode(otherlv_0, grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceCrossReference_0_0()); 
            	

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1405:2: ( (lv_arguments_1_0= ruleArgumentList ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1406:1: (lv_arguments_1_0= ruleArgumentList )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1406:1: (lv_arguments_1_0= ruleArgumentList )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1407:3: lv_arguments_1_0= ruleArgumentList
            {
             
            	        newCompositeNode(grammarAccess.getPredicateReferenceAccess().getArgumentsArgumentListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgumentList_in_rulePredicateReference3066);
            lv_arguments_1_0=ruleArgumentList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"arguments",
                    		lv_arguments_1_0, 
                    		"ArgumentList");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePredicateReference"


    // $ANTLR start "entryRuleParameter"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1431:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1432:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1433:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3102);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3112); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1440:1: ruleParameter returns [EObject current=null] : ( (lv_node_0_0= ruleNodeDefinition ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1443:28: ( ( (lv_node_0_0= ruleNodeDefinition ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1444:1: ( (lv_node_0_0= ruleNodeDefinition ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1444:1: ( (lv_node_0_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1445:1: (lv_node_0_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1445:1: (lv_node_0_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1446:3: lv_node_0_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNodeNodeDefinitionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleParameter3157);
            lv_node_0_0=ruleNodeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"node",
                    		lv_node_0_0, 
                    		"NodeDefinition");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1470:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1471:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1472:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList3192);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList3202); 

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1479:1: ruleParameterList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1482:28: ( ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1483:1: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1483:1: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1483:2: ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1483:2: ( (lv_parameters_0_0= ruleParameter ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1484:1: (lv_parameters_0_0= ruleParameter )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1484:1: (lv_parameters_0_0= ruleParameter )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1485:3: lv_parameters_0_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3248);
            lv_parameters_0_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterListRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1501:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1501:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleParameterList3261); 

            	        	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1505:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1506:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1506:1: (lv_parameters_2_0= ruleParameter )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1507:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3282);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleArgument"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1531:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1532:2: (iv_ruleArgument= ruleArgument EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1533:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument3320);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument3330); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1540:1: ruleArgument returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1543:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1544:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1544:1: ( (otherlv_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1545:1: (otherlv_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1545:1: (otherlv_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1546:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument3374); 

            		newLeafNode(otherlv_0, grammarAccess.getArgumentAccess().getNodeNodeDefinitionCrossReference_0()); 
            	

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleArgumentList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1565:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1566:2: (iv_ruleArgumentList= ruleArgumentList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1567:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
             newCompositeNode(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_ruleArgumentList_in_entryRuleArgumentList3409);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;

             current =iv_ruleArgumentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentList3419); 

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
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1574:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_arguments_0_0 = null;

        EObject lv_arguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1577:28: ( ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1578:1: ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1578:1: ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1578:2: ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1578:2: ( (lv_arguments_0_0= ruleArgument ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1579:1: (lv_arguments_0_0= ruleArgument )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1579:1: (lv_arguments_0_0= ruleArgument )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1580:3: lv_arguments_0_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleArgumentList3465);
            lv_arguments_0_0=ruleArgument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArgumentListRule());
            	        }
                   		add(
                   			current, 
                   			"arguments",
                    		lv_arguments_0_0, 
                    		"Argument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1596:2: (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_ID) ) {
                        int LA26_3 = input.LA(3);

                        if ( (LA26_3==EOF||(LA26_3>=11 && LA26_3<=12)||LA26_3==15||LA26_3==18||LA26_3==21||(LA26_3>=25 && LA26_3<=29)||LA26_3==31||(LA26_3>=39 && LA26_3<=40)) ) {
                            alt26=1;
                        }
                        else if ( (LA26_3==RULE_ID) ) {
                            int LA26_5 = input.LA(4);

                            if ( ((LA26_5>=41 && LA26_5<=43)) ) {
                                alt26=1;
                            }


                        }


                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1596:4: otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleArgumentList3478); 

            	        	newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1600:1: ( (lv_arguments_2_0= ruleArgument ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1601:1: (lv_arguments_2_0= ruleArgument )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1601:1: (lv_arguments_2_0= ruleArgument )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1602:3: lv_arguments_2_0= ruleArgument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleArgumentList3499);
            	    lv_arguments_2_0=ruleArgument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArgumentListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arguments",
            	            		lv_arguments_2_0, 
            	            		"Argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleAssignment"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1626:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1627:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1628:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3537);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3547); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1635:1: ruleAssignment returns [EObject current=null] : ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_reference_0_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1638:28: ( ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1639:1: ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1639:1: ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1639:2: ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1639:2: ( (lv_reference_0_0= rulePropertyReferenceExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1640:1: (lv_reference_0_0= rulePropertyReferenceExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1640:1: (lv_reference_0_0= rulePropertyReferenceExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1641:3: lv_reference_0_0= rulePropertyReferenceExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getReferencePropertyReferenceExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyReferenceExpression_in_ruleAssignment3593);
            lv_reference_0_0=rulePropertyReferenceExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"PropertyReferenceExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1657:2: (otherlv_1= 'becomes' | otherlv_2= ':=' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            else if ( (LA27_0==34) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1657:4: otherlv_1= 'becomes'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAssignment3606); 

                        	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getBecomesKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1662:7: otherlv_2= ':='
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAssignment3624); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1666:2: ( (lv_expression_3_0= rulePropertyExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1667:1: (lv_expression_3_0= rulePropertyExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1667:1: (lv_expression_3_0= rulePropertyExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1668:3: lv_expression_3_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionPropertyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyExpression_in_ruleAssignment3646);
            lv_expression_3_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignmentList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1692:1: entryRuleAssignmentList returns [EObject current=null] : iv_ruleAssignmentList= ruleAssignmentList EOF ;
    public final EObject entryRuleAssignmentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1693:2: (iv_ruleAssignmentList= ruleAssignmentList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1694:2: iv_ruleAssignmentList= ruleAssignmentList EOF
            {
             newCompositeNode(grammarAccess.getAssignmentListRule()); 
            pushFollow(FOLLOW_ruleAssignmentList_in_entryRuleAssignmentList3682);
            iv_ruleAssignmentList=ruleAssignmentList();

            state._fsp--;

             current =iv_ruleAssignmentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentList3692); 

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
    // $ANTLR end "entryRuleAssignmentList"


    // $ANTLR start "ruleAssignmentList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1701:1: ruleAssignmentList returns [EObject current=null] : ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* ) ;
    public final EObject ruleAssignmentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignments_0_0 = null;

        EObject lv_assignments_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1704:28: ( ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1705:1: ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1705:1: ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1705:2: ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1705:2: ( (lv_assignments_0_0= ruleAssignment ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1706:1: (lv_assignments_0_0= ruleAssignment )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1706:1: (lv_assignments_0_0= ruleAssignment )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1707:3: lv_assignments_0_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignment_in_ruleAssignmentList3738);
            lv_assignments_0_0=ruleAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentListRule());
            	        }
                   		add(
                   			current, 
                   			"assignments",
                    		lv_assignments_0_0, 
                    		"Assignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1723:2: (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1723:4: otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssignmentList3751); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAssignmentListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1727:1: ( (lv_assignments_2_0= ruleAssignment ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1728:1: (lv_assignments_2_0= ruleAssignment )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1728:1: (lv_assignments_2_0= ruleAssignment )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1729:3: lv_assignments_2_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleAssignmentList3772);
            	    lv_assignments_2_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssignmentListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignments",
            	            		lv_assignments_2_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleAssignmentList"


    // $ANTLR start "entryRuleQuantification"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1753:1: entryRuleQuantification returns [EObject current=null] : iv_ruleQuantification= ruleQuantification EOF ;
    public final EObject entryRuleQuantification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantification = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1754:2: (iv_ruleQuantification= ruleQuantification EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1755:2: iv_ruleQuantification= ruleQuantification EOF
            {
             newCompositeNode(grammarAccess.getQuantificationRule()); 
            pushFollow(FOLLOW_ruleQuantification_in_entryRuleQuantification3810);
            iv_ruleQuantification=ruleQuantification();

            state._fsp--;

             current =iv_ruleQuantification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantification3820); 

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
    // $ANTLR end "entryRuleQuantification"


    // $ANTLR start "ruleQuantification"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1762:1: ruleQuantification returns [EObject current=null] : ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleQuantification() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_quantor_0_0 = null;

        EObject lv_node_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1765:28: ( ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1766:1: ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1766:1: ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1766:2: ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1766:2: ( (lv_quantor_0_0= ruleQuantor ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1767:1: (lv_quantor_0_0= ruleQuantor )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1767:1: (lv_quantor_0_0= ruleQuantor )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1768:3: lv_quantor_0_0= ruleQuantor
            {
             
            	        newCompositeNode(grammarAccess.getQuantificationAccess().getQuantorQuantorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantor_in_ruleQuantification3866);
            lv_quantor_0_0=ruleQuantor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantificationRule());
            	        }
                   		set(
                   			current, 
                   			"quantor",
                    		lv_quantor_0_0, 
                    		"Quantor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1784:2: ( (lv_node_1_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1785:1: (lv_node_1_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1785:1: (lv_node_1_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1786:3: lv_node_1_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getQuantificationAccess().getNodeNodeDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleQuantification3887);
            lv_node_1_0=ruleNodeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantificationRule());
            	        }
                   		set(
                   			current, 
                   			"node",
                    		lv_node_1_0, 
                    		"NodeDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleQuantification3899); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantificationAccess().getInKeyword_2());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1806:1: ( (otherlv_3= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1807:1: (otherlv_3= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1807:1: (otherlv_3= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1808:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQuantificationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuantification3919); 

            		newLeafNode(otherlv_3, grammarAccess.getQuantificationAccess().getNodeSetNodeDefinitionCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleQuantification"


    // $ANTLR start "entryRuleQuantificationList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1827:1: entryRuleQuantificationList returns [EObject current=null] : iv_ruleQuantificationList= ruleQuantificationList EOF ;
    public final EObject entryRuleQuantificationList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantificationList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1828:2: (iv_ruleQuantificationList= ruleQuantificationList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1829:2: iv_ruleQuantificationList= ruleQuantificationList EOF
            {
             newCompositeNode(grammarAccess.getQuantificationListRule()); 
            pushFollow(FOLLOW_ruleQuantificationList_in_entryRuleQuantificationList3955);
            iv_ruleQuantificationList=ruleQuantificationList();

            state._fsp--;

             current =iv_ruleQuantificationList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantificationList3965); 

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
    // $ANTLR end "entryRuleQuantificationList"


    // $ANTLR start "ruleQuantificationList"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1836:1: ruleQuantificationList returns [EObject current=null] : ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* ) ;
    public final EObject ruleQuantificationList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_quantifications_0_0 = null;

        EObject lv_quantifications_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1839:28: ( ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1840:1: ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1840:1: ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1840:2: ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1840:2: ( (lv_quantifications_0_0= ruleQuantification ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1841:1: (lv_quantifications_0_0= ruleQuantification )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1841:1: (lv_quantifications_0_0= ruleQuantification )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1842:3: lv_quantifications_0_0= ruleQuantification
            {
             
            	        newCompositeNode(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantification_in_ruleQuantificationList4011);
            lv_quantifications_0_0=ruleQuantification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantificationListRule());
            	        }
                   		add(
                   			current, 
                   			"quantifications",
                    		lv_quantifications_0_0, 
                    		"Quantification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1858:2: (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1858:4: otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleQuantificationList4024); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQuantificationListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1862:1: ( (lv_quantifications_2_0= ruleQuantification ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1863:1: (lv_quantifications_2_0= ruleQuantification )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1863:1: (lv_quantifications_2_0= ruleQuantification )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1864:3: lv_quantifications_2_0= ruleQuantification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuantification_in_ruleQuantificationList4045);
            	    lv_quantifications_2_0=ruleQuantification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuantificationListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"quantifications",
            	            		lv_quantifications_2_0, 
            	            		"Quantification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleQuantificationList"


    // $ANTLR start "entryRulePropertyExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1888:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1889:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1890:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression4083);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;

             current =iv_rulePropertyExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpression4093); 

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
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1897:1: rulePropertyExpression returns [EObject current=null] : (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueExpression_0 = null;

        EObject this_PropertyReferenceExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1900:28: ( (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1901:1: (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1901:1: (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            else if ( (LA30_0==37) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1902:5: this_PropertyValueExpression_0= rulePropertyValueExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getPropertyValueExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePropertyValueExpression_in_rulePropertyExpression4140);
                    this_PropertyValueExpression_0=rulePropertyValueExpression();

                    state._fsp--;

                     
                            current = this_PropertyValueExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1912:5: this_PropertyReferenceExpression_1= rulePropertyReferenceExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getPropertyReferenceExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyReferenceExpression_in_rulePropertyExpression4167);
                    this_PropertyReferenceExpression_1=rulePropertyReferenceExpression();

                    state._fsp--;

                     
                            current = this_PropertyReferenceExpression_1; 
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
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRulePropertyValueExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1928:1: entryRulePropertyValueExpression returns [EObject current=null] : iv_rulePropertyValueExpression= rulePropertyValueExpression EOF ;
    public final EObject entryRulePropertyValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1929:2: (iv_rulePropertyValueExpression= rulePropertyValueExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1930:2: iv_rulePropertyValueExpression= rulePropertyValueExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyValueExpression_in_entryRulePropertyValueExpression4202);
            iv_rulePropertyValueExpression=rulePropertyValueExpression();

            state._fsp--;

             current =iv_rulePropertyValueExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValueExpression4212); 

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
    // $ANTLR end "entryRulePropertyValueExpression"


    // $ANTLR start "rulePropertyValueExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1937:1: rulePropertyValueExpression returns [EObject current=null] : (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePropertyValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1940:28: ( (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1941:1: (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1941:1: (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1941:3: otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_rulePropertyValueExpression4249); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyValueExpressionAccess().getVKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1945:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1946:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1946:1: (lv_value_1_0= RULE_STRING )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1947:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValueExpression4266); 

            			newLeafNode(lv_value_1_0, grammarAccess.getPropertyValueExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyValueExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
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
    // $ANTLR end "rulePropertyValueExpression"


    // $ANTLR start "entryRulePropertyReferenceExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1971:1: entryRulePropertyReferenceExpression returns [EObject current=null] : iv_rulePropertyReferenceExpression= rulePropertyReferenceExpression EOF ;
    public final EObject entryRulePropertyReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReferenceExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1972:2: (iv_rulePropertyReferenceExpression= rulePropertyReferenceExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1973:2: iv_rulePropertyReferenceExpression= rulePropertyReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyReferenceExpression_in_entryRulePropertyReferenceExpression4307);
            iv_rulePropertyReferenceExpression=rulePropertyReferenceExpression();

            state._fsp--;

             current =iv_rulePropertyReferenceExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReferenceExpression4317); 

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
    // $ANTLR end "entryRulePropertyReferenceExpression"


    // $ANTLR start "rulePropertyReferenceExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1980:1: rulePropertyReferenceExpression returns [EObject current=null] : (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) ) ;
    public final EObject rulePropertyReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_Property_3_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1983:28: ( (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1984:1: (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1984:1: (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1984:3: otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePropertyReferenceExpression4354); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceExpressionAccess().getNKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1988:1: ( (otherlv_1= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1989:1: (otherlv_1= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1989:1: (otherlv_1= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1990:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyReferenceExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4374); 

            		newLeafNode(otherlv_1, grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_rulePropertyReferenceExpression4386); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceExpressionAccess().getFullStopKeyword_2());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2005:1: ( (lv_Property_3_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2006:1: (lv_Property_3_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2006:1: (lv_Property_3_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2007:3: lv_Property_3_0= RULE_ID
            {
            lv_Property_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4403); 

            			newLeafNode(lv_Property_3_0, grammarAccess.getPropertyReferenceExpressionAccess().getPropertyIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyReferenceExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"Property",
                    		lv_Property_3_0, 
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
    // $ANTLR end "rulePropertyReferenceExpression"


    // $ANTLR start "ruleQuantor"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2031:1: ruleQuantor returns [Enumerator current=null] : ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) ) ;
    public final Enumerator ruleQuantor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2033:28: ( ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2034:1: ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2034:1: ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            else if ( (LA31_0==40) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2034:2: (enumLiteral_0= 'each' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2034:2: (enumLiteral_0= 'each' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2034:4: enumLiteral_0= 'each'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleQuantor4458); 

                            current = grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2040:6: (enumLiteral_1= 'any' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2040:6: (enumLiteral_1= 'any' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2040:8: enumLiteral_1= 'any'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleQuantor4475); 

                            current = grammarAccess.getQuantorAccess().getAnyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQuantorAccess().getAnyEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleQuantor"


    // $ANTLR start "ruleRelationQualifier"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2050:1: ruleRelationQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) ) ;
    public final Enumerator ruleRelationQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2052:28: ( ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2053:1: ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2053:1: ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt32=1;
                }
                break;
            case 42:
                {
                alt32=2;
                }
                break;
            case 43:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2053:2: (enumLiteral_0= 'must have' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2053:2: (enumLiteral_0= 'must have' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2053:4: enumLiteral_0= 'must have'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleRelationQualifier4520); 

                            current = grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2059:6: (enumLiteral_1= 'must not have' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2059:6: (enumLiteral_1= 'must not have' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2059:8: enumLiteral_1= 'must not have'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleRelationQualifier4537); 

                            current = grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2065:6: (enumLiteral_2= 'can have' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2065:6: (enumLiteral_2= 'can have' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2065:8: enumLiteral_2= 'can have'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleRelationQualifier4554); 

                            current = grammarAccess.getRelationQualifierAccess().getCanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRelationQualifierAccess().getCanEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleRelationQualifier"


    // $ANTLR start "ruleAxis"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2075:1: ruleAxis returns [Enumerator current=null] : ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) ) ;
    public final Enumerator ruleAxis() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2077:28: ( ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2078:1: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2078:1: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            case 48:
                {
                alt33=5;
                }
                break;
            case 49:
                {
                alt33=6;
                }
                break;
            case 50:
                {
                alt33=7;
                }
                break;
            case 51:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2078:2: (enumLiteral_0= 'parent' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2078:2: (enumLiteral_0= 'parent' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2078:4: enumLiteral_0= 'parent'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleAxis4599); 

                            current = grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2084:6: (enumLiteral_1= 'child' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2084:6: (enumLiteral_1= 'child' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2084:8: enumLiteral_1= 'child'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleAxis4616); 

                            current = grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2090:6: (enumLiteral_2= 'ancestor' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2090:6: (enumLiteral_2= 'ancestor' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2090:8: enumLiteral_2= 'ancestor'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleAxis4633); 

                            current = grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2096:6: (enumLiteral_3= 'descendant' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2096:6: (enumLiteral_3= 'descendant' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2096:8: enumLiteral_3= 'descendant'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleAxis4650); 

                            current = grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2102:6: (enumLiteral_4= 'multiple parents' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2102:6: (enumLiteral_4= 'multiple parents' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2102:8: enumLiteral_4= 'multiple parents'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_48_in_ruleAxis4667); 

                            current = grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2108:6: (enumLiteral_5= 'multiple children' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2108:6: (enumLiteral_5= 'multiple children' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2108:8: enumLiteral_5= 'multiple children'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_49_in_ruleAxis4684); 

                            current = grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2114:6: (enumLiteral_6= 'multiple ancestors' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2114:6: (enumLiteral_6= 'multiple ancestors' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2114:8: enumLiteral_6= 'multiple ancestors'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_50_in_ruleAxis4701); 

                            current = grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2120:6: (enumLiteral_7= 'multiple descendants' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2120:6: (enumLiteral_7= 'multiple descendants' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2120:8: enumLiteral_7= 'multiple descendants'
                    {
                    enumLiteral_7=(Token)match(input,51,FOLLOW_51_in_ruleAxis4718); 

                            current = grammarAccess.getAxisAccess().getDescendantsEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getAxisAccess().getDescendantsEnumLiteralDeclaration_7()); 
                        

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "rulePropertyRelation"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2130:1: rulePropertyRelation returns [Enumerator current=null] : ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) ) ;
    public final Enumerator rulePropertyRelation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2132:28: ( ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2133:1: ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2133:1: ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt34=1;
                }
                break;
            case 53:
                {
                alt34=2;
                }
                break;
            case 54:
                {
                alt34=3;
                }
                break;
            case 55:
                {
                alt34=4;
                }
                break;
            case 56:
                {
                alt34=5;
                }
                break;
            case 57:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2133:2: (enumLiteral_0= 'equals' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2133:2: (enumLiteral_0= 'equals' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2133:4: enumLiteral_0= 'equals'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_rulePropertyRelation4763); 

                            current = grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2139:6: (enumLiteral_1= 'not equals' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2139:6: (enumLiteral_1= 'not equals' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2139:8: enumLiteral_1= 'not equals'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_rulePropertyRelation4780); 

                            current = grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2145:6: (enumLiteral_2= 'greater than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2145:6: (enumLiteral_2= 'greater than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2145:8: enumLiteral_2= 'greater than'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_rulePropertyRelation4797); 

                            current = grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2151:6: (enumLiteral_3= 'lesser than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2151:6: (enumLiteral_3= 'lesser than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2151:8: enumLiteral_3= 'lesser than'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_rulePropertyRelation4814); 

                            current = grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2157:6: (enumLiteral_4= 'greater or equals than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2157:6: (enumLiteral_4= 'greater or equals than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2157:8: enumLiteral_4= 'greater or equals than'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_56_in_rulePropertyRelation4831); 

                            current = grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2163:6: (enumLiteral_5= 'lesser or equals than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2163:6: (enumLiteral_5= 'lesser or equals than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2163:8: enumLiteral_5= 'lesser or equals than'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_57_in_rulePropertyRelation4848); 

                            current = grammarAccess.getPropertyRelationAccess().getLesserEqualsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPropertyRelationAccess().getLesserEqualsEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "rulePropertyRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleValidator_in_entryRuleValidator75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidator85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSentence_in_ruleValidator130 = new BitSet(new long[]{0x0000018000009812L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartOnSentence_in_ruleSentence223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_ruleSentence250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintSentence_in_ruleSentence277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDefinitionSentence_in_ruleSentence304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartOnSentence_in_entryRuleStartOnSentence339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartOnSentence349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStartOnSentence386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleStartOnSentence407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_entryRuleDefinitionSentence443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSentence453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_ruleDefinitionSentence500 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinitionSentence526 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_ruleRelationQualifier_in_ruleDefinitionSentence548 = new BitSet(new long[]{0x000FF00000000000L});
    public static final BitSet FOLLOW_ruleTargetDefinition_in_ruleDefinitionSentence569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintSentence_in_entryRuleConstraintSentence605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintSentence615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConstraintSentence652 = new BitSet(new long[]{0x0000018000006010L});
    public static final BitSet FOLLOW_ruleQuantificationList_in_ruleConstraintSentence673 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleNodeReferenceList_in_ruleConstraintSentence695 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleConstraintSentence709 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_14_in_ruleConstraintSentence727 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_ruleConstraintSentence749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDefinitionSentence_in_entryRulePredicateDefinitionSentence785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateDefinitionSentence795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePredicateDefinitionSentence832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicateDefinitionSentence849 = new BitSet(new long[]{0x0000000000014010L});
    public static final BitSet FOLLOW_ruleParameterList_in_rulePredicateDefinitionSentence875 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_rulePredicateDefinitionSentence889 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_14_in_rulePredicateDefinitionSentence907 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicateDefinitionSentence929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeDefinition1017 = new BitSet(new long[]{0x0000000001820002L});
    public static final BitSet FOLLOW_17_in_ruleNodeDefinition1040 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleSelectorList_in_ruleNodeDefinition1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeReferenceList_in_entryRuleNodeReferenceList1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeReferenceList1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeReferenceList1167 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleNodeReferenceList1180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeReferenceList1200 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleTargetDefinition_in_entryRuleTargetDefinition1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetDefinition1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_ruleTargetDefinition1294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleTargetDefinition1315 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_19_in_ruleTargetDefinition1328 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTargetDefinition1340 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_ruleTargetDefinition1361 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTargetDefinition1373 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTargetDefinition1388 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTargetDefinition1400 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_ruleAssignmentList_in_ruleTargetDefinition1421 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTargetDefinition1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorList_in_entryRuleSelectorList1471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorList1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSelectorList1519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_ruleSelectorList1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSelectorList1560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_ruleSelectorList1581 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSelectorList1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_entryRuleSelectorListDef1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorListDef1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleSelectorListDef1686 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSelectorListDef1699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleSelectorListDef1720 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelector1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rulePredicateExpression1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAndExpression1996 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_27_in_ruleAndExpression2018 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_18_in_ruleAndExpression2036 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAndExpression2058 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression2096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleOrExpression2153 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleOrExpression2174 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleOrExpression2195 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression2233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpression2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2289 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleImpliesExpression2312 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_29_in_ruleImpliesExpression2330 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression2443 = new BitSet(new long[]{0x000001B001000010L});
    public static final BitSet FOLLOW_rulePredicateCall_in_rulePrimaryExpression2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimaryExpression2498 = new BitSet(new long[]{0x000001B041000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePrimaryExpression2519 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePrimaryExpression2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateCall_in_entryRulePredicateCall2569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateCall2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationPredicate_in_rulePredicateCall2627 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentencePredicate_in_rulePredicateCall2654 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulePredicateReference_in_rulePredicateCall2681 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rulePredicateCall2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicateCall2711 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePredicateCall2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationPredicate_in_entryRulePropertyRelationPredicate2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyRelationPredicate2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2822 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_rulePropertyRelation_in_rulePropertyRelationPredicate2843 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentencePredicate_in_entryRuleDefinitionSentencePredicate2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSentencePredicate2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_ruleDefinitionSentencePredicate2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateReference_in_entryRulePredicateReference2990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateReference3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicateReference3045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgumentList_in_rulePredicateReference3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleParameter3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3248 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParameterList3261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3282 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument3320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentList_in_entryRuleArgumentList3409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentList3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgumentList3465 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleArgumentList3478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgumentList3499 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_ruleAssignment3593 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleAssignment3606 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_34_in_ruleAssignment3624 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_ruleAssignment3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentList_in_entryRuleAssignmentList3682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentList3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignmentList3738 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAssignmentList3751 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignmentList3772 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleQuantification_in_entryRuleQuantification3810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantification3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantor_in_ruleQuantification3866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleQuantification3887 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleQuantification3899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuantification3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantificationList_in_entryRuleQuantificationList3955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantificationList3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_ruleQuantificationList4011 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQuantificationList4024 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleQuantification_in_ruleQuantificationList4045 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression4083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpression4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueExpression_in_rulePropertyExpression4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_rulePropertyExpression4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueExpression_in_entryRulePropertyValueExpression4202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueExpression4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePropertyValueExpression4249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValueExpression4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_entryRulePropertyReferenceExpression4307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReferenceExpression4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePropertyReferenceExpression4354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4374 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePropertyReferenceExpression4386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleQuantor4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleQuantor4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRelationQualifier4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationQualifier4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRelationQualifier4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAxis4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAxis4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAxis4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAxis4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAxis4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAxis4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAxis4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAxis4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePropertyRelation4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePropertyRelation4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePropertyRelation4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePropertyRelation4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePropertyRelation4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePropertyRelation4848 = new BitSet(new long[]{0x0000000000000002L});

}