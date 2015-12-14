package com.isax.validation.dsl.scoping

import com.google.common.base.Predicate
import com.isax.validation.dsl.dsl.DslPackage
import com.isax.validation.dsl.dsl.Model
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

import static extension org.eclipse.xtext.EcoreUtil2.eAllContentsAsList
import static extension org.eclipse.xtext.EcoreUtil2.typeSelect

class DslGlobalScopeProvider extends TypesAwareDefaultGlobalScopeProvider {

	override getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter) {
		if (DslPackage.ECLASS_SELECTOR__CLASS == reference.featureID) {
			scope_EClassSelector_class(context)
		} else {
			super.getScope(context, reference, filter)
		}		
	}


	def scope_EClassSelector_class(Resource context) {
		Scopes.scopeFor(
			context.eAllContentsAsList.typeSelect(Model).head.referred.fold(newArrayList(), 
					[ list, pkg | list.addAll(pkg.eAllContents.filter(EClass).toList); list ]
			))
	}
}