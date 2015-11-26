package com.isax.validation.dsl.compilation

import com.isax.validation.dsl.dsl.XPropertyExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

class DslCompiler extends XbaseCompiler {
	
	override protected doInternalToJavaStatement(XExpression obj, ITreeAppendable it, boolean isReferenced) {
		if (obj instanceof XPropertyExpression) {
			//append('''(String) «obj.node.name».getProperty("«obj.name»")''')
			return
		} else {
			super.doInternalToJavaStatement(obj, it, isReferenced)
		}
	}

	override protected internalToConvertedExpression(XExpression obj, ITreeAppendable it) {
		if (obj instanceof XPropertyExpression) {
			append('''((String) «obj.node.name».getProperty("«obj.name»"))''')
			return
		} else {
	    	super.internalToConvertedExpression(obj, it) 
	    }
	}

}