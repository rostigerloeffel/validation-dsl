package com.isax.validation.dsl.jvmmodel

import com.isax.validation.dsl.dsl.NodeDefinition
import java.util.HashMap
import org.eclipse.emf.ecore.EObject

import static extension com.isax.validation.dsl.util.DslUtil.path

class NameProvider {
	var index = 0;
	var suffixes = new HashMap<EObject, Integer>();
	var mappings = new HashMap<String, String>();

	def map(NodeDefinition node, String newName) {
		mappings.put(node.computeUniqueName, newName)	
	}
	
	def unmap(NodeDefinition node) {
		mappings.remove(node.computeUniqueName)
		null
	}

	def uniqueSuffix(EObject object) {
		var suffix = suffixes.get(object)
		if (suffix == null) {
			suffix = index++;
			suffixes.put(object, suffix)
		}
		suffix
	}
	
	private def computeUniqueName(NodeDefinition node) {
		node.name + "$" + node.path
	}
	
	def uniqueName(NodeDefinition node) {
		if (node == null) return ""
		val uniqueName = node.computeUniqueName
		mappings.getOrDefault(uniqueName, uniqueName)
	}

}