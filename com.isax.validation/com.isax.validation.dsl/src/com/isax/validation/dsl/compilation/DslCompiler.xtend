package com.isax.validation.dsl.compilation

import com.isax.validation.dsl.dsl.XXAssignment
import com.isax.validation.dsl.dsl.XXPropertyExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

class DslCompiler extends XbaseCompiler {
		
	override protected doInternalToJavaStatement(XExpression obj, ITreeAppendable it, boolean isReferenced) {
		if (obj instanceof XXPropertyExpression) {
			_toJavaStatement(obj as XXPropertyExpression, it, isReferenced)
		} else if (obj instanceof XXAssignment) {
			_toJavaStatement(obj as XXAssignment, it, isReferenced)
		} else {
			super.doInternalToJavaStatement(obj, it, isReferenced)
		}
	}

	override protected internalToConvertedExpression(XExpression obj, ITreeAppendable it) {
		if (obj instanceof XXPropertyExpression) {
			_toJavaExpression(obj as XXPropertyExpression, it)
		} else if (obj instanceof XXAssignment) {
			_toJavaExpression(obj as XXAssignment, it)
		} else {
 	    	super.internalToConvertedExpression(obj, it)
 	    }
	}

	def protected _toJavaStatement(XXPropertyExpression expr, ITreeAppendable outerAppendable, boolean isReferenced) {
		val b = outerAppendable.trace(expr, false)
		if (isReferenced && !isPrimitiveVoid(expr)) {
			declareSyntheticVariable(expr, b)
			b.newLine.append(getVarName(expr, b)).append(" = ")
			b.append("(String)").append(expr.node.name).append(".getProperty(\"").append(expr.name).append("\")").append(";")
		}
	}

	def protected _toJavaStatement(XXAssignment expr, ITreeAppendable outerAppendable, boolean isReferenced) {
		val b = outerAppendable.trace(expr, false)
		if (isReferenced && !isPrimitiveVoid(expr)) {
			declareSyntheticVariable(expr, b)
		}

		val canBeReferenced = isReferenced && !isPrimitiveVoid(expr.expression);
		internalToJavaStatement(expr.expression, b, canBeReferenced);
		if (canBeReferenced) {
			b.newLine.append(getVarName(expr, b)).append(" = ")
			internalToConvertedExpression(expr.expression, b)
			b.append(";")
			b.newLine.append(expr.node.name).append(".setProperty(\"")
			b.append(expr.property).append("\", ").append(getVarName(expr, b))
			b.append(");")
		}
	}

	def protected _toJavaExpression(XXPropertyExpression expr, ITreeAppendable b) {
		b.trace(expr, false).append(getVarName(expr, b))
	}
	
	def protected _toJavaExpression(XXAssignment expr, ITreeAppendable b) {
		b.trace(expr, false).append(getVarName(expr, b))
	}
	
}
