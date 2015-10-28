package com.isax.validation.dsl.util

import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.NodeDefinition
import com.isax.validation.dsl.dsl.Sentence
import com.isax.validation.dsl.dsl.StartOnSentence
import com.isax.validation.dsl.dsl.Validator
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

class DslUtil {

	def static findPreviouslyDefinedNodes(Sentence sentence) {
		val definitions = new ArrayList<NodeDefinition>();
		val validator = EcoreUtil.getRootContainer(sentence) as Validator;

		for (Sentence sentence2 : validator.sentences) {
			definitions.add(switch sentence2 {
				StartOnSentence: sentence2.definition
				DefinitionSentence case sentence2.node != null: sentence2.getTarget.definition
				default: null
			});

			if(sentence2.equals(sentence)) return definitions.filterNull
		}
	}

	def findDeclaration(NodeDefinition definition) {
		val validator = EcoreUtil.getRootContainer(definition) as Validator
		validator.sentences.filter(typeof(DefinitionSentence)).filter[s|s.target.definition.name.equals(definition.name)]
	}
	
	def depth(EObject object) {
		var i = 0;
		var parent = object
		while ((parent = parent.eContainer) != null) i++
		i
	}
}