package com.isax.validation.dsl.util

import com.isax.validation.dsl.dsl.Ancestor
import com.isax.validation.dsl.dsl.BodySentences
import com.isax.validation.dsl.dsl.CanHave
import com.isax.validation.dsl.dsl.Child
import com.isax.validation.dsl.dsl.ConstraintSentence
import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.Descendant
import com.isax.validation.dsl.dsl.MustHave
import com.isax.validation.dsl.dsl.MustNotHave
import com.isax.validation.dsl.dsl.NodeDefinition
import com.isax.validation.dsl.dsl.One
import com.isax.validation.dsl.dsl.Parent
import com.isax.validation.dsl.dsl.RelationAxis
import com.isax.validation.dsl.dsl.RelationQualifier
import com.isax.validation.dsl.dsl.RelationQuantifier
import com.isax.validation.dsl.dsl.Sentence
import com.isax.validation.dsl.dsl.StartOnSentence
import com.isax.validation.dsl.dsl.Validator
import java.util.ArrayList
import java.util.Arrays
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.xbase.lib.Functions.Function1

import static extension org.eclipse.xtext.EcoreUtil2.eAllContentsAsList
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

class DslUtil {

	def static uniqueSuffix(EObject object) {
		object.hashCode
	}
	
//	def static collectionAxis(Axis axis) {
//		axis == Axis.ANCESTORS || axis == Axis.DESCENDANTS || axis == Axis.CHILDREN || axis == Axis.PARENTS
//	}
	
	def static path(EObject object) {
		var path = new ArrayList<Integer>();
		var inner = object;
		var parent = object.eContainer;
		while (parent != null) {
			path += parent.eAllContentsAsList.indexOf(inner)
			inner = parent;
			parent = parent.eContainer
		}
		path.join('_')
	}
	
	def static visibleDefinitions(EObject object, Function1<? super NodeDefinition, Boolean> predicate) {
		scopeForSentence(object.getContainerOfType(Sentence), predicate)
	}
	
	private def static dispatch IScope scopeForSentence(StartOnSentence startOn, Function1<? super NodeDefinition, Boolean> predicate) {
		Scopes.scopeFor(Arrays.asList(startOn.definition).filter(predicate))
	}
	
	private def static dispatch IScope scopeForSentence(Sentence sentence, Function1<? super NodeDefinition, Boolean> predicate) {
		if (sentence == null) return IScope.NULLSCOPE
		
		var visible = new ArrayList<NodeDefinition>()
		visible += sentenceDefinitions(sentence)
		visible += previousSiblingDefinitions(sentence)
		
		val parentSentence = sentence.eContainer.getContainerOfType(Sentence) ?: sentence.eContainer.getContainerOfType(Validator)?.startOn
		Scopes.scopeFor(visible.filter(predicate), scopeForSentence(parentSentence, predicate))
	}
	
	private def static previousSiblingDefinitions(Sentence sentence) {
		val parentBody = sentence.getContainerOfType(BodySentences)
		val index = parentBody.sentences.indexOf(sentence)
		var siblings = new ArrayList<NodeDefinition>()
		siblings += parentBody.sentences.indexed
				.filter[s|s.key < index].map[s|s.value]
				.filter(DefinitionSentence).map[s|s.target.definition]
//		siblings += parentBody.sentences.indexed
//				.filter[s|s.key < index].map[s|s.value]
//				.filter(DefinitionSentence)
//				.filter[s|s.target.local != null].map[s|s.target.local]
		siblings
	}
	
	private def static dispatch sentenceDefinitions(ConstraintSentence sentence) {
		sentence.quantifications.quantifications.map[q|q.node]
	}
	
	private def static dispatch sentenceDefinitions(DefinitionSentence sentence) {
		val target = sentence.target
		Arrays.asList(
			sentence.quantification?.node, 
			if (target?.definition?.collection != true) target.definition else null,  
			target?.local
		).filterNull
	}
	
	def static dispatch name(RelationQualifier qualifier) {
		return switch (qualifier) {
			MustHave: "mustHave"
			MustNotHave: "mustNotHave"
			CanHave: "canHave"
			default: ""
		}
	}
	
	def static dispatch name(RelationAxis axis) {
		return switch (axis) {
			Parent: "parent"
			Child: "child"
			Ancestor: "ancestor"
			Descendant:  "descendant"
			default: ""
		}
	}
	
	def static name(RelationAxis axis, RelationQuantifier quantifier) {
		return switch (quantifier) {
			One: switch (axis) {
				Parent: "parent"
				Child: "child"
				Ancestor: "ancestor"
				Descendant:  "descendant"
			}
			
			default: switch (axis) {
				Parent: "parents"
				Child: "children"
				Ancestor: "ancestors"
				Descendant:  "descendants"
			}
		}
	}
}