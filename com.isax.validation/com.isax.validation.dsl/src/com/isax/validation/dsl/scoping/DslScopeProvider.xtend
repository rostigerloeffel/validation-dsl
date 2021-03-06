/*
 * generated by Xtext
 */
package com.isax.validation.dsl.scoping

import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.PredicateReference
import com.isax.validation.dsl.dsl.PropertyReferenceExpression
import com.isax.validation.dsl.dsl.Quantification
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static extension com.isax.validation.dsl.util.DslUtil.visibleDefinitions

class DslScopeProvider extends AbstractDeclarativeScopeProvider {
			
	def scope_Quantification_nodeSet(Quantification quantification, EReference reference) {
		quantification.visibleDefinitions [d|d.collection]
	}
	
	def scope_Argument_node(PredicateReference predicate, EReference reference) {
		predicate.visibleDefinitions [d|!d.collection]
	}
	
	def scope_DefinitionSentence_node(DefinitionSentence sentence, EReference reference) {
		sentence.visibleDefinitions [d|!d.collection]
	}
	
	def scope_PropertyReferenceExpression_node(PropertyReferenceExpression expression, EReference reference) {
		expression.visibleDefinitions [d|!d.collection]
	}
}