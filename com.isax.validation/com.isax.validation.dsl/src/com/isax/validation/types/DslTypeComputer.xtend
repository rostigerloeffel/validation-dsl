package com.isax.validation.types

import com.isax.validation.dsl.dsl.XXAssignment
import com.isax.validation.dsl.dsl.XXPropertyExpression
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState

class DslTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	def dispatch computeTypes(XXPropertyExpression expression, ITypeComputationState state) {
		state.acceptActualType(getTypeForName(String, state))
	}

	def dispatch computeTypes(XXAssignment assignment, ITypeComputationState state) {
		val inner = state.computeTypes(assignment.expression)
		state.acceptActualType(inner.actualExpressionType)
	}
	
}