package com.isax.validation.dsl.jvmmodel

import com.isax.validation.dsl.dsl.NodeDefinition
import java.util.HashMap
import org.eclipse.emf.ecore.EObject

class NameProvider {
	
	var mappings = new HashMap<String, String>();

	def map(NodeDefinition node, String newName) {
		mappings.put(node._uniqueName, newName)	
	}
	
	def unmap(NodeDefinition node) {
		mappings.remove(node._uniqueName)
		null
	}

	def uniqueSuffix(EObject object) {
		object.hashCode
	}
	
	private def _uniqueName(NodeDefinition node) {
		node.name + "$" + node.uniqueSuffix
	}
	
	def uniqueName(NodeDefinition node) {
		mappings.getOrDefault(node._uniqueName, node._uniqueName)
	}

}