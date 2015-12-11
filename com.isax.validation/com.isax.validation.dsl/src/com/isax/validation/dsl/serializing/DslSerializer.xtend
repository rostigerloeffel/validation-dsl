package com.isax.validation.dsl.serializing

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.serializer.impl.Serializer

class DslSerializer extends Serializer {
	
	override serialize(EObject obj) {
		if (obj instanceof EPackage) {
			obj.name
		} else {
			super.serialize(obj)
		}
	}
	
}