package com.isax.validation.dsl.serializer;

import com.google.inject.Inject;
import com.isax.validation.dsl.services.DslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AndExpression_AndKeyword_1_1_0_or_CommaKeyword_1_1_1;
	protected AbstractElementAlias match_Assignment_BecomesKeyword_1_0_or_ColonEqualsSignKeyword_1_1;
	protected AbstractElementAlias match_ConstraintSentence_ColonKeyword_3_1_or___HoldsKeyword_3_0_0_ThatKeyword_3_0_1__;
	protected AbstractElementAlias match_ImpliesExpression_EqualsSignGreaterThanSignKeyword_1_0_1_or_ImpliesKeyword_1_0_0;
	protected AbstractElementAlias match_PredicateDefinitionSentence_AsKeyword_3_0_or_ColonKeyword_3_1;
	protected AbstractElementAlias match_SelectorListDef_CommaKeyword_1_0_0_or_OrKeyword_1_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_AndExpression_AndKeyword_1_1_0_or_CommaKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getAndExpressionAccess().getCommaKeyword_1_1_1()));
		match_Assignment_BecomesKeyword_1_0_or_ColonEqualsSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAssignmentAccess().getBecomesKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1()));
		match_ConstraintSentence_ColonKeyword_3_1_or___HoldsKeyword_3_0_0_ThatKeyword_3_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstraintSentenceAccess().getHoldsKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getConstraintSentenceAccess().getThatKeyword_3_0_1())), new TokenAlias(false, false, grammarAccess.getConstraintSentenceAccess().getColonKeyword_3_1()));
		match_ImpliesExpression_EqualsSignGreaterThanSignKeyword_1_0_1_or_ImpliesKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0_0()));
		match_PredicateDefinitionSentence_AsKeyword_3_0_or_ColonKeyword_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPredicateDefinitionSentenceAccess().getAsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPredicateDefinitionSentenceAccess().getColonKeyword_3_1()));
		match_SelectorListDef_CommaKeyword_1_0_0_or_OrKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSelectorListDefAccess().getCommaKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getSelectorListDefAccess().getOrKeyword_1_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AndExpression_AndKeyword_1_1_0_or_CommaKeyword_1_1_1.equals(syntax))
				emit_AndExpression_AndKeyword_1_1_0_or_CommaKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Assignment_BecomesKeyword_1_0_or_ColonEqualsSignKeyword_1_1.equals(syntax))
				emit_Assignment_BecomesKeyword_1_0_or_ColonEqualsSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConstraintSentence_ColonKeyword_3_1_or___HoldsKeyword_3_0_0_ThatKeyword_3_0_1__.equals(syntax))
				emit_ConstraintSentence_ColonKeyword_3_1_or___HoldsKeyword_3_0_0_ThatKeyword_3_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImpliesExpression_EqualsSignGreaterThanSignKeyword_1_0_1_or_ImpliesKeyword_1_0_0.equals(syntax))
				emit_ImpliesExpression_EqualsSignGreaterThanSignKeyword_1_0_1_or_ImpliesKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PredicateDefinitionSentence_AsKeyword_3_0_or_ColonKeyword_3_1.equals(syntax))
				emit_PredicateDefinitionSentence_AsKeyword_3_0_or_ColonKeyword_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SelectorListDef_CommaKeyword_1_0_0_or_OrKeyword_1_0_1.equals(syntax))
				emit_SelectorListDef_CommaKeyword_1_0_0_or_OrKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'and' | ','
	 */
	protected void emit_AndExpression_AndKeyword_1_1_0_or_CommaKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'becomes' | ':='
	 */
	protected void emit_Assignment_BecomesKeyword_1_0_or_ColonEqualsSignKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':' | ('holds' 'that')
	 */
	protected void emit_ConstraintSentence_ColonKeyword_3_1_or___HoldsKeyword_3_0_0_ThatKeyword_3_0_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'implies' | '=>'
	 */
	protected void emit_ImpliesExpression_EqualsSignGreaterThanSignKeyword_1_0_1_or_ImpliesKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'as' | ':'
	 */
	protected void emit_PredicateDefinitionSentence_AsKeyword_3_0_or_ColonKeyword_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ',' | 'or'
	 */
	protected void emit_SelectorListDef_CommaKeyword_1_0_0_or_OrKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
