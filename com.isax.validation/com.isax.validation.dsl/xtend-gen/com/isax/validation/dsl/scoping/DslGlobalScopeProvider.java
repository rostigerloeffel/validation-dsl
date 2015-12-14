package com.isax.validation.dsl.scoping;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class DslGlobalScopeProvider extends TypesAwareDefaultGlobalScopeProvider {
  @Override
  public IScope getScope(final Resource context, final EReference reference, final Predicate<IEObjectDescription> filter) {
    IScope _xifexpression = null;
    int _featureID = reference.getFeatureID();
    boolean _equals = (DslPackage.ECLASS_SELECTOR__CLASS == _featureID);
    if (_equals) {
      _xifexpression = this.scope_EClassSelector_class(context);
    } else {
      _xifexpression = super.getScope(context, reference, filter);
    }
    return _xifexpression;
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
        TreeIterator<EObject> _eAllContents = pkg.eAllContents();
        Iterator<EClass> _filter = Iterators.<EClass>filter(_eAllContents, EClass.class);
        List<EClass> _list = IteratorExtensions.<EClass>toList(_filter);
        list.addAll(_list);
        _xblockexpression = list;
      }
      return _xblockexpression;
    };
    ArrayList<EObject> _fold = IterableExtensions.<EPackage, ArrayList<EObject>>fold(_referred, _newArrayList, _function);
    return Scopes.scopeFor(_fold);
  }
}
