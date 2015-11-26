package com.isax.validation.types

import com.isax.validation.dsl.dsl.XPropertyExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState

class DslTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	def dispatch computeTypes(XPropertyExpression expression, ITypeComputationState state) {
		//super._computeTypes(expression as XExpression, state)
		state.acceptActualType(getTypeForName(String, state))
	}

}