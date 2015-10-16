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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start'", "'on'", "'for'", "'holds'", "'that'", "':'", "'define'", "'as'", "'*'", "','", "'where'", "'{'", "'}'", "'with'", "'property'", "'being'", "'('", "')'", "'or'", "'and'", "'implies'", "'=>'", "'not'", "'['", "']'", "'becomes'", "':='", "'in'", "'v'", "'n'", "'.'", "'each'", "'any'", "'must have'", "'must not have'", "'can have'", "'parent'", "'child'", "'ancestor'", "'descendant'", "'multiple parents'", "'multiple children'", "'multiple ancestors'", "'multiple descendants'", "'equals'", "'not equals'", "'greater than'", "'lesser than'", "'greater or equals than'", "'lesser or equals than'"
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

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==13||LA1_0==17||(LA1_0>=42 && LA1_0<=43)) ) {
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
            case 42:
            case 43:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 17:
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:176:1: ruleStartOnSentence returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= 'on' ( (lv_definition_2_0= ruleNodeDefinition ) ) ) ;
    public final EObject ruleStartOnSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_definition_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:179:28: ( (otherlv_0= 'start' otherlv_1= 'on' ( (lv_definition_2_0= ruleNodeDefinition ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:180:1: (otherlv_0= 'start' otherlv_1= 'on' ( (lv_definition_2_0= ruleNodeDefinition ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:180:1: (otherlv_0= 'start' otherlv_1= 'on' ( (lv_definition_2_0= ruleNodeDefinition ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:180:3: otherlv_0= 'start' otherlv_1= 'on' ( (lv_definition_2_0= ruleNodeDefinition ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStartOnSentence386); 

                	newLeafNode(otherlv_0, grammarAccess.getStartOnSentenceAccess().getStartKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStartOnSentence398); 

                	newLeafNode(otherlv_1, grammarAccess.getStartOnSentenceAccess().getOnKeyword_1());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:188:1: ( (lv_definition_2_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:189:1: (lv_definition_2_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:189:1: (lv_definition_2_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:190:3: lv_definition_2_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getStartOnSentenceAccess().getDefinitionNodeDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleStartOnSentence419);
            lv_definition_2_0=ruleNodeDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartOnSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"definition",
                    		lv_definition_2_0, 
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:214:1: entryRuleDefinitionSentence returns [EObject current=null] : iv_ruleDefinitionSentence= ruleDefinitionSentence EOF ;
    public final EObject entryRuleDefinitionSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:215:2: (iv_ruleDefinitionSentence= ruleDefinitionSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:216:2: iv_ruleDefinitionSentence= ruleDefinitionSentence EOF
            {
             newCompositeNode(grammarAccess.getDefinitionSentenceRule()); 
            pushFollow(FOLLOW_ruleDefinitionSentence_in_entryRuleDefinitionSentence455);
            iv_ruleDefinitionSentence=ruleDefinitionSentence();

            state._fsp--;

             current =iv_ruleDefinitionSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSentence465); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:223:1: ruleDefinitionSentence returns [EObject current=null] : ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) ) ;
    public final EObject ruleDefinitionSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_quantification_0_0 = null;

        Enumerator lv_qualifier_2_0 = null;

        EObject lv_target_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:226:28: ( ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:227:1: ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:227:1: ( ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:227:2: ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_qualifier_2_0= ruleRelationQualifier ) ) ( (lv_target_3_0= ruleTargetDefinition ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:227:2: ( ( (lv_quantification_0_0= ruleQuantification ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=42 && LA3_0<=43)) ) {
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
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:227:3: ( (lv_quantification_0_0= ruleQuantification ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:227:3: ( (lv_quantification_0_0= ruleQuantification ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:228:1: (lv_quantification_0_0= ruleQuantification )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:228:1: (lv_quantification_0_0= ruleQuantification )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:229:3: lv_quantification_0_0= ruleQuantification
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefinitionSentenceAccess().getQuantificationQuantificationParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantification_in_ruleDefinitionSentence512);
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
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:246:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:246:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:247:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:247:1: (otherlv_1= RULE_ID )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:248:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionSentenceRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinitionSentence538); 

                    		newLeafNode(otherlv_1, grammarAccess.getDefinitionSentenceAccess().getNodeNodeDefinitionCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:259:3: ( (lv_qualifier_2_0= ruleRelationQualifier ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:260:1: (lv_qualifier_2_0= ruleRelationQualifier )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:260:1: (lv_qualifier_2_0= ruleRelationQualifier )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:261:3: lv_qualifier_2_0= ruleRelationQualifier
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionSentenceAccess().getQualifierRelationQualifierEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationQualifier_in_ruleDefinitionSentence560);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:277:2: ( (lv_target_3_0= ruleTargetDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:278:1: (lv_target_3_0= ruleTargetDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:278:1: (lv_target_3_0= ruleTargetDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:279:3: lv_target_3_0= ruleTargetDefinition
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionSentenceAccess().getTargetTargetDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetDefinition_in_ruleDefinitionSentence581);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:303:1: entryRuleConstraintSentence returns [EObject current=null] : iv_ruleConstraintSentence= ruleConstraintSentence EOF ;
    public final EObject entryRuleConstraintSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:304:2: (iv_ruleConstraintSentence= ruleConstraintSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:305:2: iv_ruleConstraintSentence= ruleConstraintSentence EOF
            {
             newCompositeNode(grammarAccess.getConstraintSentenceRule()); 
            pushFollow(FOLLOW_ruleConstraintSentence_in_entryRuleConstraintSentence617);
            iv_ruleConstraintSentence=ruleConstraintSentence();

            state._fsp--;

             current =iv_ruleConstraintSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintSentence627); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:312:1: ruleConstraintSentence returns [EObject current=null] : (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? ( (otherlv_3= 'holds' otherlv_4= 'that' ) | otherlv_5= ':' ) ( (lv_predicate_6_0= rulePredicateExpression ) ) ) ;
    public final EObject ruleConstraintSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_quantifications_1_0 = null;

        EObject lv_nodes_2_0 = null;

        EObject lv_predicate_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:315:28: ( (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? ( (otherlv_3= 'holds' otherlv_4= 'that' ) | otherlv_5= ':' ) ( (lv_predicate_6_0= rulePredicateExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:316:1: (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? ( (otherlv_3= 'holds' otherlv_4= 'that' ) | otherlv_5= ':' ) ( (lv_predicate_6_0= rulePredicateExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:316:1: (otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? ( (otherlv_3= 'holds' otherlv_4= 'that' ) | otherlv_5= ':' ) ( (lv_predicate_6_0= rulePredicateExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:316:3: otherlv_0= 'for' ( (lv_quantifications_1_0= ruleQuantificationList ) )? ( (lv_nodes_2_0= ruleNodeReferenceList ) )? ( (otherlv_3= 'holds' otherlv_4= 'that' ) | otherlv_5= ':' ) ( (lv_predicate_6_0= rulePredicateExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleConstraintSentence664); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintSentenceAccess().getForKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:320:1: ( (lv_quantifications_1_0= ruleQuantificationList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=42 && LA4_0<=43)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:321:1: (lv_quantifications_1_0= ruleQuantificationList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:321:1: (lv_quantifications_1_0= ruleQuantificationList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:322:3: lv_quantifications_1_0= ruleQuantificationList
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintSentenceAccess().getQuantificationsQuantificationListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantificationList_in_ruleConstraintSentence685);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:338:3: ( (lv_nodes_2_0= ruleNodeReferenceList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:339:1: (lv_nodes_2_0= ruleNodeReferenceList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:339:1: (lv_nodes_2_0= ruleNodeReferenceList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:340:3: lv_nodes_2_0= ruleNodeReferenceList
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintSentenceAccess().getNodesNodeReferenceListParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeReferenceList_in_ruleConstraintSentence707);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:356:3: ( (otherlv_3= 'holds' otherlv_4= 'that' ) | otherlv_5= ':' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:356:4: (otherlv_3= 'holds' otherlv_4= 'that' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:356:4: (otherlv_3= 'holds' otherlv_4= 'that' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:356:6: otherlv_3= 'holds' otherlv_4= 'that'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleConstraintSentence722); 

                        	newLeafNode(otherlv_3, grammarAccess.getConstraintSentenceAccess().getHoldsKeyword_3_0_0());
                        
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConstraintSentence734); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstraintSentenceAccess().getThatKeyword_3_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:365:7: otherlv_5= ':'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleConstraintSentence753); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintSentenceAccess().getColonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:369:2: ( (lv_predicate_6_0= rulePredicateExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:370:1: (lv_predicate_6_0= rulePredicateExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:370:1: (lv_predicate_6_0= rulePredicateExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:371:3: lv_predicate_6_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getConstraintSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_ruleConstraintSentence775);
            lv_predicate_6_0=rulePredicateExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_6_0, 
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:395:1: entryRulePredicateDefinitionSentence returns [EObject current=null] : iv_rulePredicateDefinitionSentence= rulePredicateDefinitionSentence EOF ;
    public final EObject entryRulePredicateDefinitionSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinitionSentence = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:396:2: (iv_rulePredicateDefinitionSentence= rulePredicateDefinitionSentence EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:397:2: iv_rulePredicateDefinitionSentence= rulePredicateDefinitionSentence EOF
            {
             newCompositeNode(grammarAccess.getPredicateDefinitionSentenceRule()); 
            pushFollow(FOLLOW_rulePredicateDefinitionSentence_in_entryRulePredicateDefinitionSentence811);
            iv_rulePredicateDefinitionSentence=rulePredicateDefinitionSentence();

            state._fsp--;

             current =iv_rulePredicateDefinitionSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateDefinitionSentence821); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:404:1: rulePredicateDefinitionSentence returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) ) ;
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
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:407:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:408:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:408:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:408:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameterList ) )? (otherlv_3= 'as' | otherlv_4= ':' ) ( (lv_predicate_5_0= rulePredicateExpression ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePredicateDefinitionSentence858); 

                	newLeafNode(otherlv_0, grammarAccess.getPredicateDefinitionSentenceAccess().getDefineKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:412:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:413:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:413:1: (lv_name_1_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:414:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicateDefinitionSentence875); 

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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:430:2: ( (lv_parameters_2_0= ruleParameterList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:431:1: (lv_parameters_2_0= ruleParameterList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:431:1: (lv_parameters_2_0= ruleParameterList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:432:3: lv_parameters_2_0= ruleParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredicateDefinitionSentenceAccess().getParametersParameterListParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_rulePredicateDefinitionSentence901);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:448:3: (otherlv_3= 'as' | otherlv_4= ':' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:448:5: otherlv_3= 'as'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePredicateDefinitionSentence915); 

                        	newLeafNode(otherlv_3, grammarAccess.getPredicateDefinitionSentenceAccess().getAsKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:453:7: otherlv_4= ':'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePredicateDefinitionSentence933); 

                        	newLeafNode(otherlv_4, grammarAccess.getPredicateDefinitionSentenceAccess().getColonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:457:2: ( (lv_predicate_5_0= rulePredicateExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:458:1: (lv_predicate_5_0= rulePredicateExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:458:1: (lv_predicate_5_0= rulePredicateExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:459:3: lv_predicate_5_0= rulePredicateExpression
            {
             
            	        newCompositeNode(grammarAccess.getPredicateDefinitionSentenceAccess().getPredicatePredicateExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateExpression_in_rulePredicateDefinitionSentence955);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:483:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:484:2: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:485:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition991);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;

             current =iv_ruleNodeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition1001); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:492:1: ruleNodeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? ) ;
    public final EObject ruleNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_collection_1_0=null;
        EObject lv_selectors_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:495:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:496:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:496:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:496:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_collection_1_0= '*' ) )? ( (lv_selectors_2_0= ruleSelectorList ) )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:496:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:497:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:497:1: (lv_name_0_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:498:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeDefinition1043); 

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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:514:2: ( (lv_collection_1_0= '*' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:515:1: (lv_collection_1_0= '*' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:515:1: (lv_collection_1_0= '*' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:516:3: lv_collection_1_0= '*'
                    {
                    lv_collection_1_0=(Token)match(input,19,FOLLOW_19_in_ruleNodeDefinition1066); 

                            newLeafNode(lv_collection_1_0, grammarAccess.getNodeDefinitionAccess().getCollectionAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "collection", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:529:3: ( (lv_selectors_2_0= ruleSelectorList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:530:1: (lv_selectors_2_0= ruleSelectorList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:530:1: (lv_selectors_2_0= ruleSelectorList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:531:3: lv_selectors_2_0= ruleSelectorList
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getSelectorsSelectorListParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorList_in_ruleNodeDefinition1101);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:555:1: entryRuleNodeReferenceList returns [EObject current=null] : iv_ruleNodeReferenceList= ruleNodeReferenceList EOF ;
    public final EObject entryRuleNodeReferenceList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReferenceList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:556:2: (iv_ruleNodeReferenceList= ruleNodeReferenceList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:557:2: iv_ruleNodeReferenceList= ruleNodeReferenceList EOF
            {
             newCompositeNode(grammarAccess.getNodeReferenceListRule()); 
            pushFollow(FOLLOW_ruleNodeReferenceList_in_entryRuleNodeReferenceList1138);
            iv_ruleNodeReferenceList=ruleNodeReferenceList();

            state._fsp--;

             current =iv_ruleNodeReferenceList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeReferenceList1148); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:564:1: ruleNodeReferenceList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleNodeReferenceList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:567:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:568:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:568:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:568:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:568:2: ( (otherlv_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:569:1: (otherlv_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:569:1: (otherlv_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:570:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeReferenceListRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeReferenceList1193); 

            		newLeafNode(otherlv_0, grammarAccess.getNodeReferenceListAccess().getNodesNodeDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:581:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:581:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleNodeReferenceList1206); 

            	        	newLeafNode(otherlv_1, grammarAccess.getNodeReferenceListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:585:1: ( (otherlv_2= RULE_ID ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:586:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:586:1: (otherlv_2= RULE_ID )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:587:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNodeReferenceListRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeReferenceList1226); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:606:1: entryRuleTargetDefinition returns [EObject current=null] : iv_ruleTargetDefinition= ruleTargetDefinition EOF ;
    public final EObject entryRuleTargetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetDefinition = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:607:2: (iv_ruleTargetDefinition= ruleTargetDefinition EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:608:2: iv_ruleTargetDefinition= ruleTargetDefinition EOF
            {
             newCompositeNode(grammarAccess.getTargetDefinitionRule()); 
            pushFollow(FOLLOW_ruleTargetDefinition_in_entryRuleTargetDefinition1264);
            iv_ruleTargetDefinition=ruleTargetDefinition();

            state._fsp--;

             current =iv_ruleTargetDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetDefinition1274); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:615:1: ruleTargetDefinition returns [EObject current=null] : ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where' otherlv_3= 'holds' otherlv_4= '{' ( (lv_predicate_5_0= rulePredicateExpression ) ) otherlv_6= '}' )? (otherlv_7= 'with' otherlv_8= 'property' otherlv_9= '{' ( (lv_assignments_10_0= ruleAssignmentList ) ) otherlv_11= '}' )? ) ;
    public final EObject ruleTargetDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_axis_0_0 = null;

        EObject lv_definition_1_0 = null;

        EObject lv_predicate_5_0 = null;

        EObject lv_assignments_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:618:28: ( ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where' otherlv_3= 'holds' otherlv_4= '{' ( (lv_predicate_5_0= rulePredicateExpression ) ) otherlv_6= '}' )? (otherlv_7= 'with' otherlv_8= 'property' otherlv_9= '{' ( (lv_assignments_10_0= ruleAssignmentList ) ) otherlv_11= '}' )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:619:1: ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where' otherlv_3= 'holds' otherlv_4= '{' ( (lv_predicate_5_0= rulePredicateExpression ) ) otherlv_6= '}' )? (otherlv_7= 'with' otherlv_8= 'property' otherlv_9= '{' ( (lv_assignments_10_0= ruleAssignmentList ) ) otherlv_11= '}' )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:619:1: ( ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where' otherlv_3= 'holds' otherlv_4= '{' ( (lv_predicate_5_0= rulePredicateExpression ) ) otherlv_6= '}' )? (otherlv_7= 'with' otherlv_8= 'property' otherlv_9= '{' ( (lv_assignments_10_0= ruleAssignmentList ) ) otherlv_11= '}' )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:619:2: ( (lv_axis_0_0= ruleAxis ) ) ( (lv_definition_1_0= ruleNodeDefinition ) ) (otherlv_2= 'where' otherlv_3= 'holds' otherlv_4= '{' ( (lv_predicate_5_0= rulePredicateExpression ) ) otherlv_6= '}' )? (otherlv_7= 'with' otherlv_8= 'property' otherlv_9= '{' ( (lv_assignments_10_0= ruleAssignmentList ) ) otherlv_11= '}' )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:619:2: ( (lv_axis_0_0= ruleAxis ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:620:1: (lv_axis_0_0= ruleAxis )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:620:1: (lv_axis_0_0= ruleAxis )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:621:3: lv_axis_0_0= ruleAxis
            {
             
            	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getAxisAxisEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAxis_in_ruleTargetDefinition1320);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:637:2: ( (lv_definition_1_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:638:1: (lv_definition_1_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:638:1: (lv_definition_1_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:639:3: lv_definition_1_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getDefinitionNodeDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleTargetDefinition1341);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:655:2: (otherlv_2= 'where' otherlv_3= 'holds' otherlv_4= '{' ( (lv_predicate_5_0= rulePredicateExpression ) ) otherlv_6= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:655:4: otherlv_2= 'where' otherlv_3= 'holds' otherlv_4= '{' ( (lv_predicate_5_0= rulePredicateExpression ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTargetDefinition1354); 

                        	newLeafNode(otherlv_2, grammarAccess.getTargetDefinitionAccess().getWhereKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTargetDefinition1366); 

                        	newLeafNode(otherlv_3, grammarAccess.getTargetDefinitionAccess().getHoldsKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleTargetDefinition1378); 

                        	newLeafNode(otherlv_4, grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_2_2());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:667:1: ( (lv_predicate_5_0= rulePredicateExpression ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:668:1: (lv_predicate_5_0= rulePredicateExpression )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:668:1: (lv_predicate_5_0= rulePredicateExpression )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:669:3: lv_predicate_5_0= rulePredicateExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getPredicatePredicateExpressionParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicateExpression_in_ruleTargetDefinition1399);
                    lv_predicate_5_0=rulePredicateExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTargetDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_5_0, 
                            		"PredicateExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleTargetDefinition1411); 

                        	newLeafNode(otherlv_6, grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:689:3: (otherlv_7= 'with' otherlv_8= 'property' otherlv_9= '{' ( (lv_assignments_10_0= ruleAssignmentList ) ) otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:689:5: otherlv_7= 'with' otherlv_8= 'property' otherlv_9= '{' ( (lv_assignments_10_0= ruleAssignmentList ) ) otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleTargetDefinition1426); 

                        	newLeafNode(otherlv_7, grammarAccess.getTargetDefinitionAccess().getWithKeyword_3_0());
                        
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleTargetDefinition1438); 

                        	newLeafNode(otherlv_8, grammarAccess.getTargetDefinitionAccess().getPropertyKeyword_3_1());
                        
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleTargetDefinition1450); 

                        	newLeafNode(otherlv_9, grammarAccess.getTargetDefinitionAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:701:1: ( (lv_assignments_10_0= ruleAssignmentList ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:702:1: (lv_assignments_10_0= ruleAssignmentList )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:702:1: (lv_assignments_10_0= ruleAssignmentList )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:703:3: lv_assignments_10_0= ruleAssignmentList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTargetDefinitionAccess().getAssignmentsAssignmentListParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentList_in_ruleTargetDefinition1471);
                    lv_assignments_10_0=ruleAssignmentList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTargetDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignments",
                            		lv_assignments_10_0, 
                            		"AssignmentList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleTargetDefinition1483); 

                        	newLeafNode(otherlv_11, grammarAccess.getTargetDefinitionAccess().getRightCurlyBracketKeyword_3_4());
                        

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:731:1: entryRuleSelectorList returns [EObject current=null] : iv_ruleSelectorList= ruleSelectorList EOF ;
    public final EObject entryRuleSelectorList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:732:2: (iv_ruleSelectorList= ruleSelectorList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:733:2: iv_ruleSelectorList= ruleSelectorList EOF
            {
             newCompositeNode(grammarAccess.getSelectorListRule()); 
            pushFollow(FOLLOW_ruleSelectorList_in_entryRuleSelectorList1521);
            iv_ruleSelectorList=ruleSelectorList();

            state._fsp--;

             current =iv_ruleSelectorList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorList1531); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:740:1: ruleSelectorList returns [EObject current=null] : ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleSelectorList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_selectors_1_0 = null;

        EObject lv_selectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:743:28: ( ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:744:1: ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:744:1: ( (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) ) | (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:744:2: (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:744:2: (otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:744:4: otherlv_0= 'being' ( (lv_selectors_1_0= ruleSelectorListDef ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSelectorList1569); 

                        	newLeafNode(otherlv_0, grammarAccess.getSelectorListAccess().getBeingKeyword_0_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:748:1: ( (lv_selectors_1_0= ruleSelectorListDef ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:749:1: (lv_selectors_1_0= ruleSelectorListDef )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:749:1: (lv_selectors_1_0= ruleSelectorListDef )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:750:3: lv_selectors_1_0= ruleSelectorListDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorListDef_in_ruleSelectorList1590);
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
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:767:6: (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:767:6: (otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:767:8: otherlv_2= '(' ( (lv_selectors_3_0= ruleSelectorListDef ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSelectorList1610); 

                        	newLeafNode(otherlv_2, grammarAccess.getSelectorListAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:771:1: ( (lv_selectors_3_0= ruleSelectorListDef ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:772:1: (lv_selectors_3_0= ruleSelectorListDef )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:772:1: (lv_selectors_3_0= ruleSelectorListDef )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:773:3: lv_selectors_3_0= ruleSelectorListDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorListAccess().getSelectorsSelectorListDefParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectorListDef_in_ruleSelectorList1631);
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

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSelectorList1643); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:801:1: entryRuleSelectorListDef returns [EObject current=null] : iv_ruleSelectorListDef= ruleSelectorListDef EOF ;
    public final EObject entryRuleSelectorListDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorListDef = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:802:2: (iv_ruleSelectorListDef= ruleSelectorListDef EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:803:2: iv_ruleSelectorListDef= ruleSelectorListDef EOF
            {
             newCompositeNode(grammarAccess.getSelectorListDefRule()); 
            pushFollow(FOLLOW_ruleSelectorListDef_in_entryRuleSelectorListDef1680);
            iv_ruleSelectorListDef=ruleSelectorListDef();

            state._fsp--;

             current =iv_ruleSelectorListDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorListDef1690); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:810:1: ruleSelectorListDef returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleSelector ) ) ( (otherlv_1= ',' | otherlv_2= 'or' ) ( (lv_selectors_3_0= ruleSelector ) ) )* ) ;
    public final EObject ruleSelectorListDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:813:28: ( ( ( (lv_selectors_0_0= ruleSelector ) ) ( (otherlv_1= ',' | otherlv_2= 'or' ) ( (lv_selectors_3_0= ruleSelector ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:814:1: ( ( (lv_selectors_0_0= ruleSelector ) ) ( (otherlv_1= ',' | otherlv_2= 'or' ) ( (lv_selectors_3_0= ruleSelector ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:814:1: ( ( (lv_selectors_0_0= ruleSelector ) ) ( (otherlv_1= ',' | otherlv_2= 'or' ) ( (lv_selectors_3_0= ruleSelector ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:814:2: ( (lv_selectors_0_0= ruleSelector ) ) ( (otherlv_1= ',' | otherlv_2= 'or' ) ( (lv_selectors_3_0= ruleSelector ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:814:2: ( (lv_selectors_0_0= ruleSelector ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:815:1: (lv_selectors_0_0= ruleSelector )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:815:1: (lv_selectors_0_0= ruleSelector )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:816:3: lv_selectors_0_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleSelectorListDef1736);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:832:2: ( (otherlv_1= ',' | otherlv_2= 'or' ) ( (lv_selectors_3_0= ruleSelector ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_ID) ) {
                        int LA16_4 = input.LA(3);

                        if ( (LA16_4==RULE_ID) ) {
                            int LA16_6 = input.LA(4);

                            if ( ((LA16_6>=44 && LA16_6<=46)) ) {
                                alt16=1;
                            }


                        }
                        else if ( (LA16_4==EOF||LA16_4==11||LA16_4==13||(LA16_4>=16 && LA16_4<=18)||(LA16_4>=20 && LA16_4<=21)||(LA16_4>=23 && LA16_4<=24)||(LA16_4>=28 && LA16_4<=32)||LA16_4==34||LA16_4==38||(LA16_4>=42 && LA16_4<=43)) ) {
                            alt16=1;
                        }


                    }


                }
                else if ( (LA16_0==20) ) {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==RULE_ID) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:832:3: (otherlv_1= ',' | otherlv_2= 'or' ) ( (lv_selectors_3_0= ruleSelector ) )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:832:3: (otherlv_1= ',' | otherlv_2= 'or' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==20) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==29) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:832:5: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSelectorListDef1750); 

            	                	newLeafNode(otherlv_1, grammarAccess.getSelectorListDefAccess().getCommaKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:837:7: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleSelectorListDef1768); 

            	                	newLeafNode(otherlv_2, grammarAccess.getSelectorListDefAccess().getOrKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:841:2: ( (lv_selectors_3_0= ruleSelector ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:842:1: (lv_selectors_3_0= ruleSelector )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:842:1: (lv_selectors_3_0= ruleSelector )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:843:3: lv_selectors_3_0= ruleSelector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectorListDefAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelector_in_ruleSelectorListDef1790);
            	    lv_selectors_3_0=ruleSelector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectorListDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selectors",
            	            		lv_selectors_3_0, 
            	            		"Selector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:867:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:868:2: (iv_ruleSelector= ruleSelector EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:869:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector1828);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector1838); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:876:1: ruleSelector returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:879:28: ( ( (lv_type_0_0= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:880:1: ( (lv_type_0_0= RULE_ID ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:880:1: ( (lv_type_0_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:881:1: (lv_type_0_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:881:1: (lv_type_0_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:882:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelector1879); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:906:1: entryRulePredicateExpression returns [EObject current=null] : iv_rulePredicateExpression= rulePredicateExpression EOF ;
    public final EObject entryRulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:907:2: (iv_rulePredicateExpression= rulePredicateExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:908:2: iv_rulePredicateExpression= rulePredicateExpression EOF
            {
             newCompositeNode(grammarAccess.getPredicateExpressionRule()); 
            pushFollow(FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1919);
            iv_rulePredicateExpression=rulePredicateExpression();

            state._fsp--;

             current =iv_rulePredicateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateExpression1929); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:915:1: rulePredicateExpression returns [EObject current=null] : this_AndExpression_0= ruleAndExpression ;
    public final EObject rulePredicateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:918:28: (this_AndExpression_0= ruleAndExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:920:5: this_AndExpression_0= ruleAndExpression
            {
             
                    newCompositeNode(grammarAccess.getPredicateExpressionAccess().getAndExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAndExpression_in_rulePredicateExpression1975);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:936:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:937:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:938:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2009);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2019); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:945:1: ruleAndExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_OrExpression_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:948:28: ( (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:949:1: (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:949:1: (this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:950:5: this_OrExpression_0= ruleOrExpression ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getOrExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleAndExpression2066);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;

             
                    current = this_OrExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:958:1: ( () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20||LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:958:2: () (otherlv_2= 'and' | otherlv_3= ',' ) ( (lv_rhs_4_0= ruleOrExpression ) )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:958:2: ()
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:959:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:964:2: (otherlv_2= 'and' | otherlv_3= ',' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==30) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==20) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:964:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAndExpression2088); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:969:7: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAndExpression2106); 

            	                	newLeafNode(otherlv_3, grammarAccess.getAndExpressionAccess().getCommaKeyword_1_1_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:973:2: ( (lv_rhs_4_0= ruleOrExpression ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:974:1: (lv_rhs_4_0= ruleOrExpression )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:974:1: (lv_rhs_4_0= ruleOrExpression )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:975:3: lv_rhs_4_0= ruleOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsOrExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrExpression_in_ruleAndExpression2128);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:999:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1000:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1001:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression2166);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression2176); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1008:1: ruleOrExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImpliesExpression_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1011:28: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1012:1: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1012:1: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1013:5: this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleImpliesExpression_in_ruleOrExpression2223);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;

             
                    current = this_ImpliesExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1021:1: ( () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1021:2: () otherlv_2= 'or' ( (lv_rhs_3_0= ruleImpliesExpression ) )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1021:2: ()
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1022:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleOrExpression2244); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1031:1: ( (lv_rhs_3_0= ruleImpliesExpression ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1032:1: (lv_rhs_3_0= ruleImpliesExpression )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1032:1: (lv_rhs_3_0= ruleImpliesExpression )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1033:3: lv_rhs_3_0= ruleImpliesExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsImpliesExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImpliesExpression_in_ruleOrExpression2265);
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
            	    break loop19;
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1057:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1058:2: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1059:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
             newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression2303);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;

             current =iv_ruleImpliesExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpression2313); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1066:1: ruleImpliesExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( (otherlv_1= 'implies' | otherlv_2= '=>' ) ( (lv_rhs_3_0= rulePrimaryExpression ) ) )? ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1069:28: ( ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( (otherlv_1= 'implies' | otherlv_2= '=>' ) ( (lv_rhs_3_0= rulePrimaryExpression ) ) )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1070:1: ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( (otherlv_1= 'implies' | otherlv_2= '=>' ) ( (lv_rhs_3_0= rulePrimaryExpression ) ) )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1070:1: ( ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( (otherlv_1= 'implies' | otherlv_2= '=>' ) ( (lv_rhs_3_0= rulePrimaryExpression ) ) )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1070:2: ( (lv_lhs_0_0= rulePrimaryExpression ) ) ( (otherlv_1= 'implies' | otherlv_2= '=>' ) ( (lv_rhs_3_0= rulePrimaryExpression ) ) )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1070:2: ( (lv_lhs_0_0= rulePrimaryExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1071:1: (lv_lhs_0_0= rulePrimaryExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1071:1: (lv_lhs_0_0= rulePrimaryExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1072:3: lv_lhs_0_0= rulePrimaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getImpliesExpressionAccess().getLhsPrimaryExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2359);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1088:2: ( (otherlv_1= 'implies' | otherlv_2= '=>' ) ( (lv_rhs_3_0= rulePrimaryExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=31 && LA21_0<=32)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1088:3: (otherlv_1= 'implies' | otherlv_2= '=>' ) ( (lv_rhs_3_0= rulePrimaryExpression ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1088:3: (otherlv_1= 'implies' | otherlv_2= '=>' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==31) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==32) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1088:5: otherlv_1= 'implies'
                            {
                            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleImpliesExpression2373); 

                                	newLeafNode(otherlv_1, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1093:7: otherlv_2= '=>'
                            {
                            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleImpliesExpression2391); 

                                	newLeafNode(otherlv_2, grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1097:2: ( (lv_rhs_3_0= rulePrimaryExpression ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1098:1: (lv_rhs_3_0= rulePrimaryExpression )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1098:1: (lv_rhs_3_0= rulePrimaryExpression )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1099:3: lv_rhs_3_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRhsPrimaryExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2413);
                    lv_rhs_3_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_3_0, 
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1123:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1124:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1125:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2451);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2461); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1132:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_call_1_0 = null;

        EObject lv_inner_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1135:28: ( ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1136:1: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1136:1: ( ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1136:2: ( (lv_negated_0_0= 'not' ) )? ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1136:2: ( (lv_negated_0_0= 'not' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1137:1: (lv_negated_0_0= 'not' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1137:1: (lv_negated_0_0= 'not' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1138:3: lv_negated_0_0= 'not'
                    {
                    lv_negated_0_0=(Token)match(input,33,FOLLOW_33_in_rulePrimaryExpression2504); 

                            newLeafNode(lv_negated_0_0, grammarAccess.getPrimaryExpressionAccess().getNegatedNotKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "negated", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1151:3: ( ( (lv_call_1_0= rulePredicateCall ) ) | (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=39 && LA23_0<=40)||(LA23_0>=42 && LA23_0<=43)) ) {
                alt23=1;
            }
            else if ( (LA23_0==27) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1151:4: ( (lv_call_1_0= rulePredicateCall ) )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1151:4: ( (lv_call_1_0= rulePredicateCall ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1152:1: (lv_call_1_0= rulePredicateCall )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1152:1: (lv_call_1_0= rulePredicateCall )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1153:3: lv_call_1_0= rulePredicateCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCallPredicateCallParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicateCall_in_rulePrimaryExpression2540);
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
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1170:6: (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1170:6: (otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1170:8: otherlv_2= '(' ( (lv_inner_3_0= rulePredicateExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression2559); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1174:1: ( (lv_inner_3_0= rulePredicateExpression ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1175:1: (lv_inner_3_0= rulePredicateExpression )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1175:1: (lv_inner_3_0= rulePredicateExpression )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1176:3: lv_inner_3_0= rulePredicateExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInnerPredicateExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePredicateExpression_in_rulePrimaryExpression2580);
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

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_rulePrimaryExpression2592); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1204:1: entryRulePredicateCall returns [EObject current=null] : iv_rulePredicateCall= rulePredicateCall EOF ;
    public final EObject entryRulePredicateCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateCall = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1205:2: (iv_rulePredicateCall= rulePredicateCall EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1206:2: iv_rulePredicateCall= rulePredicateCall EOF
            {
             newCompositeNode(grammarAccess.getPredicateCallRule()); 
            pushFollow(FOLLOW_rulePredicateCall_in_entryRulePredicateCall2630);
            iv_rulePredicateCall=rulePredicateCall();

            state._fsp--;

             current =iv_rulePredicateCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateCall2640); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1213:1: rulePredicateCall returns [EObject current=null] : ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? ) ;
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
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1216:28: ( ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1217:1: ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1217:1: ( (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )? )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1217:2: (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference ) (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )?
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1217:2: (this_PropertyRelationPredicate_0= rulePropertyRelationPredicate | this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate | this_PredicateReference_2= rulePredicateReference )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt24=1;
                }
                break;
            case 42:
            case 43:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==RULE_ID) ) {
                    alt24=3;
                }
                else if ( ((LA24_3>=44 && LA24_3<=46)) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1218:5: this_PropertyRelationPredicate_0= rulePropertyRelationPredicate
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateCallAccess().getPropertyRelationPredicateParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulePropertyRelationPredicate_in_rulePredicateCall2688);
                    this_PropertyRelationPredicate_0=rulePropertyRelationPredicate();

                    state._fsp--;

                     
                            current = this_PropertyRelationPredicate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1228:5: this_DefinitionSentencePredicate_1= ruleDefinitionSentencePredicate
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateCallAccess().getDefinitionSentencePredicateParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDefinitionSentencePredicate_in_rulePredicateCall2715);
                    this_DefinitionSentencePredicate_1=ruleDefinitionSentencePredicate();

                    state._fsp--;

                     
                            current = this_DefinitionSentencePredicate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1238:5: this_PredicateReference_2= rulePredicateReference
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateCallAccess().getPredicateReferenceParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_rulePredicateReference_in_rulePredicateCall2742);
                    this_PredicateReference_2=rulePredicateReference();

                    state._fsp--;

                     
                            current = this_PredicateReference_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1246:2: (otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1246:4: otherlv_3= '[' ( (lv_label_4_0= RULE_ID ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_rulePredicateCall2755); 

                        	newLeafNode(otherlv_3, grammarAccess.getPredicateCallAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1250:1: ( (lv_label_4_0= RULE_ID ) )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1251:1: (lv_label_4_0= RULE_ID )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1251:1: (lv_label_4_0= RULE_ID )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1252:3: lv_label_4_0= RULE_ID
                    {
                    lv_label_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicateCall2772); 

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

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_rulePredicateCall2789); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1280:1: entryRulePropertyRelationPredicate returns [EObject current=null] : iv_rulePropertyRelationPredicate= rulePropertyRelationPredicate EOF ;
    public final EObject entryRulePropertyRelationPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRelationPredicate = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1281:2: (iv_rulePropertyRelationPredicate= rulePropertyRelationPredicate EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1282:2: iv_rulePropertyRelationPredicate= rulePropertyRelationPredicate EOF
            {
             newCompositeNode(grammarAccess.getPropertyRelationPredicateRule()); 
            pushFollow(FOLLOW_rulePropertyRelationPredicate_in_entryRulePropertyRelationPredicate2827);
            iv_rulePropertyRelationPredicate=rulePropertyRelationPredicate();

            state._fsp--;

             current =iv_rulePropertyRelationPredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyRelationPredicate2837); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1289:1: rulePropertyRelationPredicate returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) ) ;
    public final EObject rulePropertyRelationPredicate() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_relation_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1292:28: ( ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1293:1: ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1293:1: ( ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1293:2: ( (lv_lhs_0_0= rulePropertyExpression ) ) ( (lv_relation_1_0= rulePropertyRelation ) ) ( (lv_rhs_2_0= rulePropertyExpression ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1293:2: ( (lv_lhs_0_0= rulePropertyExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1294:1: (lv_lhs_0_0= rulePropertyExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1294:1: (lv_lhs_0_0= rulePropertyExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1295:3: lv_lhs_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyRelationPredicateAccess().getLhsPropertyExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2883);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1311:2: ( (lv_relation_1_0= rulePropertyRelation ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1312:1: (lv_relation_1_0= rulePropertyRelation )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1312:1: (lv_relation_1_0= rulePropertyRelation )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1313:3: lv_relation_1_0= rulePropertyRelation
            {
             
            	        newCompositeNode(grammarAccess.getPropertyRelationPredicateAccess().getRelationPropertyRelationEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyRelation_in_rulePropertyRelationPredicate2904);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1329:2: ( (lv_rhs_2_0= rulePropertyExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1330:1: (lv_rhs_2_0= rulePropertyExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1330:1: (lv_rhs_2_0= rulePropertyExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1331:3: lv_rhs_2_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyRelationPredicateAccess().getRhsPropertyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2925);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1355:1: entryRuleDefinitionSentencePredicate returns [EObject current=null] : iv_ruleDefinitionSentencePredicate= ruleDefinitionSentencePredicate EOF ;
    public final EObject entryRuleDefinitionSentencePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSentencePredicate = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1356:2: (iv_ruleDefinitionSentencePredicate= ruleDefinitionSentencePredicate EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1357:2: iv_ruleDefinitionSentencePredicate= ruleDefinitionSentencePredicate EOF
            {
             newCompositeNode(grammarAccess.getDefinitionSentencePredicateRule()); 
            pushFollow(FOLLOW_ruleDefinitionSentencePredicate_in_entryRuleDefinitionSentencePredicate2961);
            iv_ruleDefinitionSentencePredicate=ruleDefinitionSentencePredicate();

            state._fsp--;

             current =iv_ruleDefinitionSentencePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSentencePredicate2971); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1364:1: ruleDefinitionSentencePredicate returns [EObject current=null] : ( (lv_sentence_0_0= ruleDefinitionSentence ) ) ;
    public final EObject ruleDefinitionSentencePredicate() throws RecognitionException {
        EObject current = null;

        EObject lv_sentence_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1367:28: ( ( (lv_sentence_0_0= ruleDefinitionSentence ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1368:1: ( (lv_sentence_0_0= ruleDefinitionSentence ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1368:1: ( (lv_sentence_0_0= ruleDefinitionSentence ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1369:1: (lv_sentence_0_0= ruleDefinitionSentence )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1369:1: (lv_sentence_0_0= ruleDefinitionSentence )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1370:3: lv_sentence_0_0= ruleDefinitionSentence
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionSentencePredicateAccess().getSentenceDefinitionSentenceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDefinitionSentence_in_ruleDefinitionSentencePredicate3016);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1394:1: entryRulePredicateReference returns [EObject current=null] : iv_rulePredicateReference= rulePredicateReference EOF ;
    public final EObject entryRulePredicateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateReference = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1395:2: (iv_rulePredicateReference= rulePredicateReference EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1396:2: iv_rulePredicateReference= rulePredicateReference EOF
            {
             newCompositeNode(grammarAccess.getPredicateReferenceRule()); 
            pushFollow(FOLLOW_rulePredicateReference_in_entryRulePredicateReference3051);
            iv_rulePredicateReference=rulePredicateReference();

            state._fsp--;

             current =iv_rulePredicateReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateReference3061); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1403:1: rulePredicateReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) ) ;
    public final EObject rulePredicateReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_arguments_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1406:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1407:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1407:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1407:2: ( (otherlv_0= RULE_ID ) ) ( (lv_arguments_1_0= ruleArgumentList ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1407:2: ( (otherlv_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1408:1: (otherlv_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1408:1: (otherlv_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1409:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPredicateReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicateReference3106); 

            		newLeafNode(otherlv_0, grammarAccess.getPredicateReferenceAccess().getReferencePredicateDefinitionSentenceCrossReference_0_0()); 
            	

            }


            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1420:2: ( (lv_arguments_1_0= ruleArgumentList ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1421:1: (lv_arguments_1_0= ruleArgumentList )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1421:1: (lv_arguments_1_0= ruleArgumentList )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1422:3: lv_arguments_1_0= ruleArgumentList
            {
             
            	        newCompositeNode(grammarAccess.getPredicateReferenceAccess().getArgumentsArgumentListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArgumentList_in_rulePredicateReference3127);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1446:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1447:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1448:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3163);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3173); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1455:1: ruleParameter returns [EObject current=null] : ( (lv_node_0_0= ruleNodeDefinition ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1458:28: ( ( (lv_node_0_0= ruleNodeDefinition ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1459:1: ( (lv_node_0_0= ruleNodeDefinition ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1459:1: ( (lv_node_0_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1460:1: (lv_node_0_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1460:1: (lv_node_0_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1461:3: lv_node_0_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNodeNodeDefinitionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleParameter3218);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1485:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1486:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1487:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList3253);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList3263); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1494:1: ruleParameterList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1497:28: ( ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1498:1: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1498:1: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1498:2: ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1498:2: ( (lv_parameters_0_0= ruleParameter ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1499:1: (lv_parameters_0_0= ruleParameter )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1499:1: (lv_parameters_0_0= ruleParameter )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1500:3: lv_parameters_0_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3309);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1516:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1516:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParameterList3322); 

            	        	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1520:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1521:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1521:1: (lv_parameters_2_0= ruleParameter )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1522:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList3343);
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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleArgument"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1546:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1547:2: (iv_ruleArgument= ruleArgument EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1548:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument3381);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument3391); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1555:1: ruleArgument returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1558:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1559:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1559:1: ( (otherlv_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1560:1: (otherlv_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1560:1: (otherlv_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1561:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument3435); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1580:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1581:2: (iv_ruleArgumentList= ruleArgumentList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1582:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
             newCompositeNode(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_ruleArgumentList_in_entryRuleArgumentList3470);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;

             current =iv_ruleArgumentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentList3480); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1589:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_arguments_0_0 = null;

        EObject lv_arguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1592:28: ( ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1593:1: ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1593:1: ( ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1593:2: ( (lv_arguments_0_0= ruleArgument ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1593:2: ( (lv_arguments_0_0= ruleArgument ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1594:1: (lv_arguments_0_0= ruleArgument )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1594:1: (lv_arguments_0_0= ruleArgument )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1595:3: lv_arguments_0_0= ruleArgument
            {
             
            	        newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleArgumentList3526);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1611:2: (otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        int LA27_3 = input.LA(3);

                        if ( (LA27_3==RULE_ID) ) {
                            int LA27_4 = input.LA(4);

                            if ( ((LA27_4>=44 && LA27_4<=46)) ) {
                                alt27=1;
                            }


                        }
                        else if ( (LA27_3==EOF||LA27_3==11||LA27_3==13||LA27_3==17||LA27_3==20||LA27_3==23||(LA27_3>=28 && LA27_3<=32)||LA27_3==34||(LA27_3>=42 && LA27_3<=43)) ) {
                            alt27=1;
                        }


                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1611:4: otherlv_1= ',' ( (lv_arguments_2_0= ruleArgument ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleArgumentList3539); 

            	        	newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1615:1: ( (lv_arguments_2_0= ruleArgument ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1616:1: (lv_arguments_2_0= ruleArgument )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1616:1: (lv_arguments_2_0= ruleArgument )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1617:3: lv_arguments_2_0= ruleArgument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleArgumentList3560);
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
            	    break loop27;
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1641:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1642:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1643:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3598);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3608); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1650:1: ruleAssignment returns [EObject current=null] : ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_reference_0_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1653:28: ( ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1654:1: ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1654:1: ( ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1654:2: ( (lv_reference_0_0= rulePropertyReferenceExpression ) ) (otherlv_1= 'becomes' | otherlv_2= ':=' ) ( (lv_expression_3_0= rulePropertyExpression ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1654:2: ( (lv_reference_0_0= rulePropertyReferenceExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1655:1: (lv_reference_0_0= rulePropertyReferenceExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1655:1: (lv_reference_0_0= rulePropertyReferenceExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1656:3: lv_reference_0_0= rulePropertyReferenceExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getReferencePropertyReferenceExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyReferenceExpression_in_ruleAssignment3654);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1672:2: (otherlv_1= 'becomes' | otherlv_2= ':=' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            else if ( (LA28_0==37) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1672:4: otherlv_1= 'becomes'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleAssignment3667); 

                        	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getBecomesKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1677:7: otherlv_2= ':='
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleAssignment3685); 

                        	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1681:2: ( (lv_expression_3_0= rulePropertyExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1682:1: (lv_expression_3_0= rulePropertyExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1682:1: (lv_expression_3_0= rulePropertyExpression )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1683:3: lv_expression_3_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionPropertyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyExpression_in_ruleAssignment3707);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1707:1: entryRuleAssignmentList returns [EObject current=null] : iv_ruleAssignmentList= ruleAssignmentList EOF ;
    public final EObject entryRuleAssignmentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1708:2: (iv_ruleAssignmentList= ruleAssignmentList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1709:2: iv_ruleAssignmentList= ruleAssignmentList EOF
            {
             newCompositeNode(grammarAccess.getAssignmentListRule()); 
            pushFollow(FOLLOW_ruleAssignmentList_in_entryRuleAssignmentList3743);
            iv_ruleAssignmentList=ruleAssignmentList();

            state._fsp--;

             current =iv_ruleAssignmentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentList3753); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1716:1: ruleAssignmentList returns [EObject current=null] : ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* ) ;
    public final EObject ruleAssignmentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignments_0_0 = null;

        EObject lv_assignments_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1719:28: ( ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1720:1: ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1720:1: ( ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1720:2: ( (lv_assignments_0_0= ruleAssignment ) ) (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1720:2: ( (lv_assignments_0_0= ruleAssignment ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1721:1: (lv_assignments_0_0= ruleAssignment )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1721:1: (lv_assignments_0_0= ruleAssignment )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1722:3: lv_assignments_0_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignment_in_ruleAssignmentList3799);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1738:2: (otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1738:4: otherlv_1= ',' ( (lv_assignments_2_0= ruleAssignment ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAssignmentList3812); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAssignmentListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1742:1: ( (lv_assignments_2_0= ruleAssignment ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1743:1: (lv_assignments_2_0= ruleAssignment )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1743:1: (lv_assignments_2_0= ruleAssignment )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1744:3: lv_assignments_2_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssignmentListAccess().getAssignmentsAssignmentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleAssignmentList3833);
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
    // $ANTLR end "ruleAssignmentList"


    // $ANTLR start "entryRuleQuantification"
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1768:1: entryRuleQuantification returns [EObject current=null] : iv_ruleQuantification= ruleQuantification EOF ;
    public final EObject entryRuleQuantification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantification = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1769:2: (iv_ruleQuantification= ruleQuantification EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1770:2: iv_ruleQuantification= ruleQuantification EOF
            {
             newCompositeNode(grammarAccess.getQuantificationRule()); 
            pushFollow(FOLLOW_ruleQuantification_in_entryRuleQuantification3871);
            iv_ruleQuantification=ruleQuantification();

            state._fsp--;

             current =iv_ruleQuantification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantification3881); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1777:1: ruleQuantification returns [EObject current=null] : ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleQuantification() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_quantor_0_0 = null;

        EObject lv_node_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1780:28: ( ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1781:1: ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1781:1: ( ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1781:2: ( (lv_quantor_0_0= ruleQuantor ) ) ( (lv_node_1_0= ruleNodeDefinition ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1781:2: ( (lv_quantor_0_0= ruleQuantor ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1782:1: (lv_quantor_0_0= ruleQuantor )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1782:1: (lv_quantor_0_0= ruleQuantor )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1783:3: lv_quantor_0_0= ruleQuantor
            {
             
            	        newCompositeNode(grammarAccess.getQuantificationAccess().getQuantorQuantorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantor_in_ruleQuantification3927);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1799:2: ( (lv_node_1_0= ruleNodeDefinition ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1800:1: (lv_node_1_0= ruleNodeDefinition )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1800:1: (lv_node_1_0= ruleNodeDefinition )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1801:3: lv_node_1_0= ruleNodeDefinition
            {
             
            	        newCompositeNode(grammarAccess.getQuantificationAccess().getNodeNodeDefinitionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeDefinition_in_ruleQuantification3948);
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

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleQuantification3960); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantificationAccess().getInKeyword_2());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1821:1: ( (otherlv_3= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1822:1: (otherlv_3= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1822:1: (otherlv_3= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1823:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQuantificationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuantification3980); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1842:1: entryRuleQuantificationList returns [EObject current=null] : iv_ruleQuantificationList= ruleQuantificationList EOF ;
    public final EObject entryRuleQuantificationList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantificationList = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1843:2: (iv_ruleQuantificationList= ruleQuantificationList EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1844:2: iv_ruleQuantificationList= ruleQuantificationList EOF
            {
             newCompositeNode(grammarAccess.getQuantificationListRule()); 
            pushFollow(FOLLOW_ruleQuantificationList_in_entryRuleQuantificationList4016);
            iv_ruleQuantificationList=ruleQuantificationList();

            state._fsp--;

             current =iv_ruleQuantificationList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantificationList4026); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1851:1: ruleQuantificationList returns [EObject current=null] : ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* ) ;
    public final EObject ruleQuantificationList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_quantifications_0_0 = null;

        EObject lv_quantifications_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1854:28: ( ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1855:1: ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1855:1: ( ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )* )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1855:2: ( (lv_quantifications_0_0= ruleQuantification ) ) (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )*
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1855:2: ( (lv_quantifications_0_0= ruleQuantification ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1856:1: (lv_quantifications_0_0= ruleQuantification )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1856:1: (lv_quantifications_0_0= ruleQuantification )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1857:3: lv_quantifications_0_0= ruleQuantification
            {
             
            	        newCompositeNode(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantification_in_ruleQuantificationList4072);
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

            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1873:2: (otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1873:4: otherlv_1= ',' ( (lv_quantifications_2_0= ruleQuantification ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleQuantificationList4085); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQuantificationListAccess().getCommaKeyword_1_0());
            	        
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1877:1: ( (lv_quantifications_2_0= ruleQuantification ) )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1878:1: (lv_quantifications_2_0= ruleQuantification )
            	    {
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1878:1: (lv_quantifications_2_0= ruleQuantification )
            	    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1879:3: lv_quantifications_2_0= ruleQuantification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantificationListAccess().getQuantificationsQuantificationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuantification_in_ruleQuantificationList4106);
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
            	    break loop30;
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1903:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1904:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1905:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression4144);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;

             current =iv_rulePropertyExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpression4154); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1912:1: rulePropertyExpression returns [EObject current=null] : (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueExpression_0 = null;

        EObject this_PropertyReferenceExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1915:28: ( (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1916:1: (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1916:1: (this_PropertyValueExpression_0= rulePropertyValueExpression | this_PropertyReferenceExpression_1= rulePropertyReferenceExpression )
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
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1917:5: this_PropertyValueExpression_0= rulePropertyValueExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getPropertyValueExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePropertyValueExpression_in_rulePropertyExpression4201);
                    this_PropertyValueExpression_0=rulePropertyValueExpression();

                    state._fsp--;

                     
                            current = this_PropertyValueExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1927:5: this_PropertyReferenceExpression_1= rulePropertyReferenceExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getPropertyReferenceExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyReferenceExpression_in_rulePropertyExpression4228);
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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1943:1: entryRulePropertyValueExpression returns [EObject current=null] : iv_rulePropertyValueExpression= rulePropertyValueExpression EOF ;
    public final EObject entryRulePropertyValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1944:2: (iv_rulePropertyValueExpression= rulePropertyValueExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1945:2: iv_rulePropertyValueExpression= rulePropertyValueExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyValueExpression_in_entryRulePropertyValueExpression4263);
            iv_rulePropertyValueExpression=rulePropertyValueExpression();

            state._fsp--;

             current =iv_rulePropertyValueExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValueExpression4273); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1952:1: rulePropertyValueExpression returns [EObject current=null] : (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePropertyValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1955:28: ( (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1956:1: (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1956:1: (otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1956:3: otherlv_0= 'v' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_rulePropertyValueExpression4310); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyValueExpressionAccess().getVKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1960:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1961:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1961:1: (lv_value_1_0= RULE_STRING )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1962:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValueExpression4327); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1986:1: entryRulePropertyReferenceExpression returns [EObject current=null] : iv_rulePropertyReferenceExpression= rulePropertyReferenceExpression EOF ;
    public final EObject entryRulePropertyReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReferenceExpression = null;


        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1987:2: (iv_rulePropertyReferenceExpression= rulePropertyReferenceExpression EOF )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1988:2: iv_rulePropertyReferenceExpression= rulePropertyReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyReferenceExpression_in_entryRulePropertyReferenceExpression4368);
            iv_rulePropertyReferenceExpression=rulePropertyReferenceExpression();

            state._fsp--;

             current =iv_rulePropertyReferenceExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyReferenceExpression4378); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1995:1: rulePropertyReferenceExpression returns [EObject current=null] : (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) ) ;
    public final EObject rulePropertyReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_Property_3_0=null;

         enterRule(); 
            
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1998:28: ( (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1999:1: (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1999:1: (otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:1999:3: otherlv_0= 'n' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_Property_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_rulePropertyReferenceExpression4415); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceExpressionAccess().getNKeyword_0());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2003:1: ( (otherlv_1= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2004:1: (otherlv_1= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2004:1: (otherlv_1= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2005:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyReferenceExpressionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4435); 

            		newLeafNode(otherlv_1, grammarAccess.getPropertyReferenceExpressionAccess().getNodeNodeDefinitionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulePropertyReferenceExpression4447); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceExpressionAccess().getFullStopKeyword_2());
                
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2020:1: ( (lv_Property_3_0= RULE_ID ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2021:1: (lv_Property_3_0= RULE_ID )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2021:1: (lv_Property_3_0= RULE_ID )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2022:3: lv_Property_3_0= RULE_ID
            {
            lv_Property_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4464); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2046:1: ruleQuantor returns [Enumerator current=null] : ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) ) ;
    public final Enumerator ruleQuantor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2048:28: ( ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2049:1: ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2049:1: ( (enumLiteral_0= 'each' ) | (enumLiteral_1= 'any' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            else if ( (LA32_0==43) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2049:2: (enumLiteral_0= 'each' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2049:2: (enumLiteral_0= 'each' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2049:4: enumLiteral_0= 'each'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleQuantor4519); 

                            current = grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuantorAccess().getEachEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2055:6: (enumLiteral_1= 'any' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2055:6: (enumLiteral_1= 'any' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2055:8: enumLiteral_1= 'any'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleQuantor4536); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2065:1: ruleRelationQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) ) ;
    public final Enumerator ruleRelationQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2067:28: ( ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2068:1: ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2068:1: ( (enumLiteral_0= 'must have' ) | (enumLiteral_1= 'must not have' ) | (enumLiteral_2= 'can have' ) )
            int alt33=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2068:2: (enumLiteral_0= 'must have' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2068:2: (enumLiteral_0= 'must have' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2068:4: enumLiteral_0= 'must have'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleRelationQualifier4581); 

                            current = grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelationQualifierAccess().getMustEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2074:6: (enumLiteral_1= 'must not have' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2074:6: (enumLiteral_1= 'must not have' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2074:8: enumLiteral_1= 'must not have'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleRelationQualifier4598); 

                            current = grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelationQualifierAccess().getMustNotEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2080:6: (enumLiteral_2= 'can have' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2080:6: (enumLiteral_2= 'can have' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2080:8: enumLiteral_2= 'can have'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleRelationQualifier4615); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2090:1: ruleAxis returns [Enumerator current=null] : ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) ) ;
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
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2092:28: ( ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2093:1: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2093:1: ( (enumLiteral_0= 'parent' ) | (enumLiteral_1= 'child' ) | (enumLiteral_2= 'ancestor' ) | (enumLiteral_3= 'descendant' ) | (enumLiteral_4= 'multiple parents' ) | (enumLiteral_5= 'multiple children' ) | (enumLiteral_6= 'multiple ancestors' ) | (enumLiteral_7= 'multiple descendants' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt34=1;
                }
                break;
            case 48:
                {
                alt34=2;
                }
                break;
            case 49:
                {
                alt34=3;
                }
                break;
            case 50:
                {
                alt34=4;
                }
                break;
            case 51:
                {
                alt34=5;
                }
                break;
            case 52:
                {
                alt34=6;
                }
                break;
            case 53:
                {
                alt34=7;
                }
                break;
            case 54:
                {
                alt34=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2093:2: (enumLiteral_0= 'parent' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2093:2: (enumLiteral_0= 'parent' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2093:4: enumLiteral_0= 'parent'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleAxis4660); 

                            current = grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAxisAccess().getParentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2099:6: (enumLiteral_1= 'child' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2099:6: (enumLiteral_1= 'child' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2099:8: enumLiteral_1= 'child'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleAxis4677); 

                            current = grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAxisAccess().getChildEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2105:6: (enumLiteral_2= 'ancestor' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2105:6: (enumLiteral_2= 'ancestor' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2105:8: enumLiteral_2= 'ancestor'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleAxis4694); 

                            current = grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAxisAccess().getAncestorEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2111:6: (enumLiteral_3= 'descendant' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2111:6: (enumLiteral_3= 'descendant' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2111:8: enumLiteral_3= 'descendant'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleAxis4711); 

                            current = grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAxisAccess().getDescendantEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2117:6: (enumLiteral_4= 'multiple parents' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2117:6: (enumLiteral_4= 'multiple parents' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2117:8: enumLiteral_4= 'multiple parents'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_51_in_ruleAxis4728); 

                            current = grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAxisAccess().getParentsEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2123:6: (enumLiteral_5= 'multiple children' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2123:6: (enumLiteral_5= 'multiple children' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2123:8: enumLiteral_5= 'multiple children'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_52_in_ruleAxis4745); 

                            current = grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAxisAccess().getChildrenEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2129:6: (enumLiteral_6= 'multiple ancestors' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2129:6: (enumLiteral_6= 'multiple ancestors' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2129:8: enumLiteral_6= 'multiple ancestors'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_53_in_ruleAxis4762); 

                            current = grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getAxisAccess().getAncestorsEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2135:6: (enumLiteral_7= 'multiple descendants' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2135:6: (enumLiteral_7= 'multiple descendants' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2135:8: enumLiteral_7= 'multiple descendants'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_54_in_ruleAxis4779); 

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
    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2145:1: rulePropertyRelation returns [Enumerator current=null] : ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) ) ;
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
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2147:28: ( ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) ) )
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2148:1: ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) )
            {
            // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2148:1: ( (enumLiteral_0= 'equals' ) | (enumLiteral_1= 'not equals' ) | (enumLiteral_2= 'greater than' ) | (enumLiteral_3= 'lesser than' ) | (enumLiteral_4= 'greater or equals than' ) | (enumLiteral_5= 'lesser or equals than' ) )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt35=1;
                }
                break;
            case 56:
                {
                alt35=2;
                }
                break;
            case 57:
                {
                alt35=3;
                }
                break;
            case 58:
                {
                alt35=4;
                }
                break;
            case 59:
                {
                alt35=5;
                }
                break;
            case 60:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2148:2: (enumLiteral_0= 'equals' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2148:2: (enumLiteral_0= 'equals' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2148:4: enumLiteral_0= 'equals'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_rulePropertyRelation4824); 

                            current = grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPropertyRelationAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2154:6: (enumLiteral_1= 'not equals' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2154:6: (enumLiteral_1= 'not equals' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2154:8: enumLiteral_1= 'not equals'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_rulePropertyRelation4841); 

                            current = grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPropertyRelationAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2160:6: (enumLiteral_2= 'greater than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2160:6: (enumLiteral_2= 'greater than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2160:8: enumLiteral_2= 'greater than'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_rulePropertyRelation4858); 

                            current = grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPropertyRelationAccess().getGreaterEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2166:6: (enumLiteral_3= 'lesser than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2166:6: (enumLiteral_3= 'lesser than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2166:8: enumLiteral_3= 'lesser than'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_58_in_rulePropertyRelation4875); 

                            current = grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPropertyRelationAccess().getLesserEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2172:6: (enumLiteral_4= 'greater or equals than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2172:6: (enumLiteral_4= 'greater or equals than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2172:8: enumLiteral_4= 'greater or equals than'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_59_in_rulePropertyRelation4892); 

                            current = grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPropertyRelationAccess().getGreaterEqualsEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2178:6: (enumLiteral_5= 'lesser or equals than' )
                    {
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2178:6: (enumLiteral_5= 'lesser or equals than' )
                    // ../com.isax.validation.dsl/src-gen/com/isax/validation/dsl/parser/antlr/internal/InternalDsl.g:2178:8: enumLiteral_5= 'lesser or equals than'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_60_in_rulePropertyRelation4909); 

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
    public static final BitSet FOLLOW_ruleSentence_in_ruleValidator130 = new BitSet(new long[]{0x00000C0000022812L});
    public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSentence176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartOnSentence_in_ruleSentence223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_ruleSentence250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintSentence_in_ruleSentence277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDefinitionSentence_in_ruleSentence304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartOnSentence_in_entryRuleStartOnSentence339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartOnSentence349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStartOnSentence386 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStartOnSentence398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleStartOnSentence419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_entryRuleDefinitionSentence455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSentence465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_ruleDefinitionSentence512 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinitionSentence538 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_ruleRelationQualifier_in_ruleDefinitionSentence560 = new BitSet(new long[]{0x007F800000000000L});
    public static final BitSet FOLLOW_ruleTargetDefinition_in_ruleDefinitionSentence581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintSentence_in_entryRuleConstraintSentence617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintSentence627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleConstraintSentence664 = new BitSet(new long[]{0x00000C0000014010L});
    public static final BitSet FOLLOW_ruleQuantificationList_in_ruleConstraintSentence685 = new BitSet(new long[]{0x0000000000014010L});
    public static final BitSet FOLLOW_ruleNodeReferenceList_in_ruleConstraintSentence707 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleConstraintSentence722 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstraintSentence734 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_16_in_ruleConstraintSentence753 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_ruleConstraintSentence775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateDefinitionSentence_in_entryRulePredicateDefinitionSentence811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateDefinitionSentence821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePredicateDefinitionSentence858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicateDefinitionSentence875 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleParameterList_in_rulePredicateDefinitionSentence901 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_rulePredicateDefinitionSentence915 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_16_in_rulePredicateDefinitionSentence933 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePredicateDefinitionSentence955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeDefinition1043 = new BitSet(new long[]{0x000000000C080002L});
    public static final BitSet FOLLOW_19_in_ruleNodeDefinition1066 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleSelectorList_in_ruleNodeDefinition1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeReferenceList_in_entryRuleNodeReferenceList1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeReferenceList1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeReferenceList1193 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleNodeReferenceList1206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeReferenceList1226 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleTargetDefinition_in_entryRuleTargetDefinition1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetDefinition1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_ruleTargetDefinition1320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleTargetDefinition1341 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21_in_ruleTargetDefinition1354 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTargetDefinition1366 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTargetDefinition1378 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_ruleTargetDefinition1399 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTargetDefinition1411 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTargetDefinition1426 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTargetDefinition1438 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTargetDefinition1450 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleAssignmentList_in_ruleTargetDefinition1471 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTargetDefinition1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorList_in_entryRuleSelectorList1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorList1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSelectorList1569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_ruleSelectorList1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSelectorList1610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_ruleSelectorList1631 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSelectorList1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorListDef_in_entryRuleSelectorListDef1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorListDef1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleSelectorListDef1736 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_20_in_ruleSelectorListDef1750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleSelectorListDef1768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleSelectorListDef1790 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelector1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_entryRulePredicateExpression1919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpression1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rulePredicateExpression1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAndExpression2066 = new BitSet(new long[]{0x0000000040100002L});
    public static final BitSet FOLLOW_30_in_ruleAndExpression2088 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_20_in_ruleAndExpression2106 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAndExpression2128 = new BitSet(new long[]{0x0000000040100002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleOrExpression2223 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleOrExpression2244 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleOrExpression2265 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpression2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2359 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleImpliesExpression2373 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_32_in_ruleImpliesExpression2391 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleImpliesExpression2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrimaryExpression2504 = new BitSet(new long[]{0x00000D8008000010L});
    public static final BitSet FOLLOW_rulePredicateCall_in_rulePrimaryExpression2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression2559 = new BitSet(new long[]{0x00000D8208000010L});
    public static final BitSet FOLLOW_rulePredicateExpression_in_rulePrimaryExpression2580 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimaryExpression2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateCall_in_entryRulePredicateCall2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateCall2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationPredicate_in_rulePredicateCall2688 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentencePredicate_in_rulePredicateCall2715 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rulePredicateReference_in_rulePredicateCall2742 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rulePredicateCall2755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicateCall2772 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePredicateCall2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRelationPredicate_in_entryRulePropertyRelationPredicate2827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyRelationPredicate2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2883 = new BitSet(new long[]{0x1F80000000000000L});
    public static final BitSet FOLLOW_rulePropertyRelation_in_rulePropertyRelationPredicate2904 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyRelationPredicate2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentencePredicate_in_entryRuleDefinitionSentencePredicate2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSentencePredicate2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionSentence_in_ruleDefinitionSentencePredicate3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateReference_in_entryRulePredicateReference3051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateReference3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicateReference3106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgumentList_in_rulePredicateReference3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleParameter3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3309 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParameterList3322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3343 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument3381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentList_in_entryRuleArgumentList3470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentList3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgumentList3526 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleArgumentList3539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgumentList3560 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_ruleAssignment3654 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_ruleAssignment3667 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_37_in_ruleAssignment3685 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_ruleAssignment3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentList_in_entryRuleAssignmentList3743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentList3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignmentList3799 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAssignmentList3812 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAssignmentList3833 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleQuantification_in_entryRuleQuantification3871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantification3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantor_in_ruleQuantification3927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleQuantification3948 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleQuantification3960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuantification3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantificationList_in_entryRuleQuantificationList4016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantificationList4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantification_in_ruleQuantificationList4072 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQuantificationList4085 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ruleQuantification_in_ruleQuantificationList4106 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression4144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpression4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueExpression_in_rulePropertyExpression4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_rulePropertyExpression4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueExpression_in_entryRulePropertyValueExpression4263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueExpression4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePropertyValueExpression4310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValueExpression4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyReferenceExpression_in_entryRulePropertyReferenceExpression4368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyReferenceExpression4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePropertyReferenceExpression4415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4435 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePropertyReferenceExpression4447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyReferenceExpression4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleQuantor4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleQuantor4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRelationQualifier4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRelationQualifier4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRelationQualifier4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAxis4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAxis4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAxis4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAxis4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAxis4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAxis4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAxis4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAxis4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePropertyRelation4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePropertyRelation4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePropertyRelation4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePropertyRelation4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePropertyRelation4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePropertyRelation4909 = new BitSet(new long[]{0x0000000000000002L});

}