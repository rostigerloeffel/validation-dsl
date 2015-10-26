package com.isax.validation.dsl.scoping;

import com.google.common.base.Predicate;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.xtext.AbstractConstructorScope;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScope;
import org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class DslContextScopeProvider extends AbstractTypeScopeProvider {
  @Override
  public AbstractConstructorScope createConstructorScope(final IJvmTypeProvider typeProvider, final Predicate<IEObjectDescription> filter) {
    Object _xblockexpression = null;
    {
      InputOutput.<String>println("createConstructorScope");
      _xblockexpression = null;
    }
    return ((AbstractConstructorScope)_xblockexpression);
  }
  
  @Override
  public AbstractTypeScope createTypeScope(final IJvmTypeProvider typeProvider, final Predicate<IEObjectDescription> filter) {
    Object _xblockexpression = null;
    {
      InputOutput.<String>println("createTypeScope");
      _xblockexpression = null;
    }
    return ((AbstractTypeScope)_xblockexpression);
  }
  
  @Override
  public IJvmTypeProvider.Factory getTypeProviderFactory() {
    Object _xblockexpression = null;
    {
      InputOutput.<String>println("getTypeProviderFactory");
      _xblockexpression = null;
    }
    return ((IJvmTypeProvider.Factory)_xblockexpression);
  }
}
