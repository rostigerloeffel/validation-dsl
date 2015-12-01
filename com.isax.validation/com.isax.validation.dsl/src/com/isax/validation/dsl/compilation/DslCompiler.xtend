package com.isax.validation.dsl.compilation

import com.isax.validation.dsl.dsl.Assignment
import com.isax.validation.dsl.dsl.XPropertyExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

class DslCompiler extends XbaseCompiler {
		
	override protected doInternalToJavaStatement(XExpression obj, ITreeAppendable it, boolean isReferenced) {
		if (obj instanceof XPropertyExpression) {
			_toJavaStatement(obj as XPropertyExpression, it, isReferenced)
		} else if (obj instanceof Assignment) {
			_toJavaStatement(obj as Assignment, it, isReferenced)
		} else {
			super.doInternalToJavaStatement(obj, it, isReferenced)
		}
	}

	override protected internalToConvertedExpression(XExpression obj, ITreeAppendable it) {
		if (obj instanceof XPropertyExpression) {
			_toJavaExpression(obj as XPropertyExpression, it)
		} else if (obj instanceof Assignment) {
			_toJavaExpression(obj as Assignment, it)
		} else {
 	    	super.internalToConvertedExpression(obj, it)
 	    }
	}

	def protected _toJavaStatement(XPropertyExpression expr, ITreeAppendable outerAppendable, boolean isReferenced) {
		val b = outerAppendable.trace(expr, false);
		if (isReferenced && !isPrimitiveVoid(expr)) {
			declareSyntheticVariable(expr, b);
			b.newLine().append(getVarName(expr, b)).append(" = ");
			b.append("(String)").append(expr.node.name).append(".getProperty(\"").append(expr.name).append("\")").append(";");
		}
	}

	def protected _toJavaStatement(Assignment expr, ITreeAppendable outerAppendable, boolean isReferenced) {
		val b = outerAppendable.trace(expr, false);
		if (isReferenced && !isPrimitiveVoid(expr)) {
			declareSyntheticVariable(expr, b);
		}

		val canBeReferenced = isReferenced && !isPrimitiveVoid(expr.expression);
		internalToJavaStatement(expr.expression, b, canBeReferenced);
		if (canBeReferenced) {
			b.newLine().append(getVarName(expr, b)).append(" = ");
			internalToConvertedExpression(expr.expression, b);
			b.append(";");
		}
	}

	def protected _toJavaExpression(XPropertyExpression expr, ITreeAppendable b) {
		b.trace(expr, false).append(getVarName(expr, b));
	}
	
	def protected _toJavaExpression(Assignment expr, ITreeAppendable b) {
		b.trace(expr, false).append(getVarName(expr, b));
	}
	
}
