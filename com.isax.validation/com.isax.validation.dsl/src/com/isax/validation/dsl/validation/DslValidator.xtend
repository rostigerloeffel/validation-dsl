/*
 * generated by Xtext
 */
package com.isax.validation.dsl.validation

import com.isax.validation.dsl.dsl.DefinitionSentence
import com.isax.validation.dsl.dsl.DslPackage
import com.isax.validation.dsl.dsl.Quantification
import org.eclipse.xtext.validation.Check

class DslValidator extends AbstractDslValidator {

	@Check
	def refersSet(Quantification quantification) {
		if (!quantification.nodeSet.collection) {
			error("Quantification node set (" + quantification.nodeSet.name + ") is not a set!", quantification, DslPackage.eINSTANCE.quantification_NodeSet)
		}
	}
	
	@Check
	def refersNode(DefinitionSentence sentence) {
		if (sentence.quantification == null && sentence.node.collection) {
			error("Use 'each' or 'any' to obtain neighbouring nodes of node sets!", sentence, DslPackage.eINSTANCE.definitionSentence_Node)
		}
	}
	
//	@Check
//	def definitionConformsAxisKind(TargetDefinition target) {
//		if (!target.definition.collection && target.axis.collectionAxis) {
//			error("Usage of 'multiple' implies node-set target!", target.definition, DslPackage.eINSTANCE.nodeDefinition_Name)
//		}
//		if (target.definition.collection && !(target.axis.collectionAxis)) {
//			error("Usage of 'non-multiple' qualifier implies single node target!", target.definition, DslPackage.eINSTANCE.nodeDefinition_Name)
//		}
//	}
//	
//	@Check
//	def mustNotExcludesMultiple(DefinitionSentence sentence) {
//		if (sentence.qualifier == RelationQualifier.MUST_NOT && sentence.target.axis.collectionAxis) {
//			error("Combination of 'must not' and 'multiple' is not allowed!", sentence, DslPackage.eINSTANCE.definitionSentence_Qualifier)
//			error("Combination of 'must not' and 'multiple' is not allowed!", sentence.target, DslPackage.eINSTANCE.targetDefinition_Axis)
//		}
//	}
}
