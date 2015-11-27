package com.isax.validation.dsl.compilation

import com.isax.validation.dsl.dsl.XPropertyExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.XStringLiteral

class DslCompiler extends XbaseCompiler {
	
	override protected doInternalToJavaStatement(XExpression obj, ITreeAppendable it, boolean isReferenced) {
		if (obj instanceof XPropertyExpression) {
			val property = declareSyntheticVariable(obj, "property");
			newLine.append(String).append(" ").append(property).append(" = ").append(toJavaExpression(obj)).append(";")
			return
		}
		super.doInternalToJavaStatement(obj, it, isReferenced)
	}

	override protected internalToConvertedExpression(XExpression obj, ITreeAppendable it) {
		if (obj instanceof XPropertyExpression) {
			append(toJavaExpression(obj))
			return
		}
	    super.internalToConvertedExpression(obj, it) 
	}

	def private toJavaExpression(XPropertyExpression obj) {
		'''((String) «obj.node.name».getProperty("«obj.name»"))'''
	} 
}