package com.isax.validation.dsl.scoping

import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import com.google.common.base.Predicate
import org.eclipse.xtext.resource.IEObjectDescription

class DslContextScopeProvider extends AbstractTypeScopeProvider {
	
	override createConstructorScope(IJvmTypeProvider typeProvider, Predicate<IEObjectDescription> filter) {
		println("createConstructorScope")
		null
	}
	
	override createTypeScope(IJvmTypeProvider typeProvider, Predicate<IEObjectDescription> filter) {
		println("createTypeScope")
		null
	}
	
	override getTypeProviderFactory() {
		println("getTypeProviderFactory")
		null
	}
	
}
