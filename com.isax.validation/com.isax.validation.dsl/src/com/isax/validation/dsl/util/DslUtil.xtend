package com.isax.validation.dsl.util

import com.isax.validation.dsl.dsl.Axis
import com.isax.validation.dsl.dsl.NodeDefinition
import org.eclipse.emf.ecore.EObject

class DslUtil {

	def static uniqueSuffix(EObject object) {
		object.hashCode
	}
	
	def static collectionAxis(Axis axis) {
		axis == Axis.ANCESTORS || axis == Axis.DESCENDANTS || axis == Axis.CHILDREN || axis == Axis.PARENTS
	}
	
	def static uniqueName(NodeDefinition node) {
		node.name + "$" + node.uniqueSuffix
	}
}