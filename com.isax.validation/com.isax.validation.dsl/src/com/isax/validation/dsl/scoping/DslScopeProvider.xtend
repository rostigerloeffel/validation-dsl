/*
 * generated by Xtext
 */
package com.isax.validation.dsl.scoping

import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.Quantification
import com.isax.validation.dsl.dsl.RelationQualifier
import com.isax.validation.dsl.dsl.StartOnSentence
import com.isax.validation.dsl.dsl.Validator
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 * 
 */
class DslScopeProvider extends AbstractDeclarativeScopeProvider {
	
	def scope_DefinitionSentence_node(DefinitionSentence sentence, EReference reference) {
		val validator = sentence.getContainerOfType(Validator)
		val index = validator.sentences.indexOf(sentence)
		Scopes.scopeFor(
			validator.sentences
				.filter(DefinitionSentence).indexed
				.filter[p|p.key < index].map[p|p.value]
				.filter[d|d.qualifier != RelationQualifier.MUST_NOT]
				.filter[d|d.node != null].map[d|d.target.definition]
				.filter[d|!d.collection],
				
			Scopes.scopeFor(
				validator.sentences.filter(typeof(StartOnSentence)).map[s|s.definition]
			)
		)
	}
	
	def scope_Quantification_nodeSet(Quantification quantification, EReference reference) {
		val validator = quantification.getContainerOfType(Validator)
		val sentence = quantification.getContainerOfType(DefinitionSentence)
		val index = validator.sentences.indexOf(sentence)
		Scopes.scopeFor(
			validator.sentences
				.filter(DefinitionSentence)
				.filter[d|d.qualifier != RelationQualifier.MUST_NOT].indexed
				.filter[p|p.key < index].map[p|p.value.target.definition]
				.filter[d|d.collection]
		)
	}
}