package com.isax.validation.dsl.util

import com.isax.validation.dsl.dsl.Axis
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.xtext.EcoreUtil2.eAllContentsAsList

class DslUtil {

	def static uniqueSuffix(EObject object) {
		object.hashCode
	}
	
	def static collectionAxis(Axis axis) {
		axis == Axis.ANCESTORS || axis == Axis.DESCENDANTS || axis == Axis.CHILDREN || axis == Axis.PARENTS
	}
	
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

}