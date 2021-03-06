package com.isax.validation.dsl.scoping;

import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;

@SuppressWarnings("all")
public class NullGlobalScopeProvider implements IGlobalScopeProvider {
  @Override
  public IScope getScope(final Resource context, final EReference reference, final Predicate<IEObjectDescription> filter) {
    return IScope.NULLSCOPE;
  }
}
