package com.isax.validation.types

import com.isax.validation.dsl.dsl.Assignment
import com.isax.validation.dsl.dsl.XPropertyExpression
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState

class DslTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	def dispatch computeTypes(XPropertyExpression expression, ITypeComputationState state) {
		state.acceptActualType(getTypeForName(String, state))
	}

	def dispatch computeTypes(Assignment assignment, ITypeComputationState state) {
		val inner = state.computeTypes(assignment.expression)
		state.acceptActualType(inner.actualExpressionType)
	}
	
}