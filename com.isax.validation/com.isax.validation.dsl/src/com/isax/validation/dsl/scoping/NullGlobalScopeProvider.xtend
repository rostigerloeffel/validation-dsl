package com.isax.validation.dsl.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.IScope
import com.google.common.base.Predicate

class NullGlobalScopeProvider implements IGlobalScopeProvider {
	
	override IScope getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter) {
		IScope.NULLSCOPE
	}

}
