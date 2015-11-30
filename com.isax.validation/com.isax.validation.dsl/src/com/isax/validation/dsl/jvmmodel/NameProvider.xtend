package com.isax.validation.dsl.jvmmodel

import com.isax.validation.dsl.dsl.NodeDefinition
import java.util.HashMap
import java.util.Stack
import org.eclipse.emf.ecore.EObject

import static extension com.isax.validation.dsl.util.DslUtil.path

class NameProvider {
	var index = 0;
	var suffixes = new HashMap<EObject, Integer>();
	var mappings = new HashMap<String, Stack<String>>();

	def map(NodeDefinition node, String newName) {
		mappings.putIfAbsent(node.computeUniqueName, new Stack<String>())
		mappings.get(node.computeUniqueName).push(newName)
		null
	}
	
	def unmap(NodeDefinition node) {
		mappings.get(node.computeUniqueName)?.pop
		null
	}

	def uniqueSuffix(EObject object) {
		var suffix = suffixes.get(object)
		if (suffix == null) {
			suffix = index++;
			suffixes.put(object, suffix)
		}
		suffix.toString
	}
		
	private def computeUniqueName(NodeDefinition node) {
		node.name + '$' + node.path
	}
	
	def uniqueName(NodeDefinition node) {
		if (node == null) return ""
		val uniqueName = node.computeUniqueName
		val mappings = mappings.get(uniqueName)
		if (mappings.nullOrEmpty) uniqueName else mappings.peek
	}

}