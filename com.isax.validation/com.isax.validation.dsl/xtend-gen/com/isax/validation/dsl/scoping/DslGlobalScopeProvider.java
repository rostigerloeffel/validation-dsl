package com.isax.validation.dsl.scoping;

import com.google.common.base.Predicate;
import com.isax.validation.dsl.dsl.Model;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DslGlobalScopeProvider extends TypesAwareDefaultGlobalScopeProvider {
  @Override
  public IScope getScope(final Resource context, final EReference reference, final Predicate<IEObjectDescription> filter) {
    final EClass referenceType = this.getEReferenceType(context, reference);
    boolean _isAssignableFrom = EcoreUtil2.isAssignableFrom(EcorePackage.Literals.ECLASS, referenceType);
    if (_isAssignableFrom) {
      return this.scope_EClassSelector_class(context);
    } else {
      boolean _isAssignableFrom_1 = EcoreUtil2.isAssignableFrom(EcorePackage.Literals.EATTRIBUTE, referenceType);
      if (_isAssignableFrom_1) {
        return this.scope_EAttributePropertyReference_attribute(context, reference);
      } else {
        return super.getScope(context, reference, filter);
      }
    }
  }
  
  public IScope scope_EClassSelector_class(final Resource context) {
    List<EObject> _eAllContentsAsList = EcoreUtil2.eAllContentsAsList(context);
    List<Model> _typeSelect = EcoreUtil2.<Model>typeSelect(_eAllContentsAsList, Model.class);
    Model _head = IterableExtensions.<Model>head(_typeSelect);
    EList<EPackage> _referred = _head.getReferred();
    ArrayList<EObject> _newArrayList = CollectionLiterals.<EObject>newArrayList();
    final Function2<ArrayList<EObject>, EPackage, ArrayList<EObject>> _function = (ArrayList<EObject> list, EPackage pkg) -> {
      ArrayList<EObject> _xblockexpression = null;
      {
        List<EClass> _eAllOfType = EcoreUtil2.<EClass>eAllOfType(pkg, EClass.class);
        list.addAll(_eAllOfType);
        _xblockexpression = list;
      }
      return _xblockexpression;
    };
    ArrayList<EObject> _fold = IterableExtensions.<EPackage, ArrayList<EObject>>fold(_referred, _newArrayList, _function);
    return Scopes.scopeFor(_fold);
  }
  
  public IScope scope_EAttributePropertyReference_attribute(final Resource context, final EReference reference) {
    List<EObject> _eAllContentsAsList = EcoreUtil2.eAllContentsAsList(context);
    List<Model> _typeSelect = EcoreUtil2.<Model>typeSelect(_eAllContentsAsList, Model.class);
    Model _head = IterableExtensions.<Model>head(_typeSelect);
    EList<EPackage> _referred = _head.getReferred();
    ArrayList<EObject> _newArrayList = CollectionLiterals.<EObject>newArrayList();
    final Function2<ArrayList<EObject>, EPackage, ArrayList<EObject>> _function = (ArrayList<EObject> list, EPackage pkg) -> {
      ArrayList<EObject> _xblockexpression = null;
      {
        List<EAttribute> _eAllOfType = EcoreUtil2.<EAttribute>eAllOfType(pkg, EAttribute.class);
        list.addAll(_eAllOfType);
        _xblockexpression = list;
      }
      return _xblockexpression;
    };
    ArrayList<EObject> _fold = IterableExtensions.<EPackage, ArrayList<EObject>>fold(_referred, _newArrayList, _function);
    return Scopes.scopeFor(_fold);
  }
}
