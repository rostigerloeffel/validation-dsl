package com.isax.validation.dsl.scoping

import com.google.common.base.Predicate
import com.isax.validation.dsl.dsl.EAttributePropertyReference
import com.isax.validation.dsl.dsl.EClassSelector
import com.isax.validation.dsl.dsl.Model
import com.isax.validation.dsl.dsl.PropertyReferenceExpression
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.Scopes

import static extension org.eclipse.xtext.EcoreUtil2.*

class DslGlobalScopeProvider extends TypesAwareDefaultGlobalScopeProvider {

	override getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter) {
		val referenceType = getEReferenceType(context, reference);
		if (EcorePackage.Literals.ECLASS.isAssignableFrom(referenceType)) {
			return scope_EClassSelector_class(context)
		} else if (EcorePackage.Literals.EATTRIBUTE.isAssignableFrom(referenceType)) {
			return scope_EAttributePropertyReference_attribute(context, reference)
		} else {
			return super.getScope(context, reference, filter)
		}		
	}

	def scope_EClassSelector_class(Resource context) {
		Scopes.scopeFor(
			context.eAllContentsAsList.typeSelect(Model).head.referred.fold(newArrayList(), 
				[ list, pkg | list.addAll(pkg.eAllOfType(EClass)); list ]
			))
	}
	
	def scope_EAttributePropertyReference_attribute(Resource context, EReference reference) {
		Scopes.scopeFor(
			context.eAllContentsAsList.typeSelect(Model).head.referred.fold(newArrayList(), 
				[ list, pkg | list.addAll(pkg.eAllOfType(EAttribute)); list ]
			))
		
//		val e = reference.eContainmentFeature
//		val e2 = reference.eContainer
//		//context.eAllContentsAsList.typeSelect(EAttributePropertyReference).findFirst[reference.e]
//			
//		val selectors = reference.getContainerOfType(PropertyReferenceExpression)?.node?.selectors?.selectors?.selectors ?: newArrayList()
//		Scopes.scopeFor(
//			selectors.filter(EClassSelector).map[s|s.class_].filterNull.fold(newArrayList(),
//				[ list, clazz | list.addAll(clazz.eAllOfType(EAttribute)); list ]
//			))
	}
	
}