/**
 * generated by Xtext
 */
package com.isax.validation.dsl.scoping;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.Model;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.PredicateReference;
import com.isax.validation.dsl.dsl.PropertyReferenceExpression;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.util.DslUtil;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class DslScopeProvider extends AbstractDeclarativeScopeProvider {
  private void loadEcores(final IContainer container, final ResourceSet resourceSet) {
    try {
      IResource[] _members = container.members();
      Iterable<IFile> _filter = Iterables.<IFile>filter(((Iterable<?>)Conversions.doWrapArray(_members)), IFile.class);
      for (final IFile ecoreFile : _filter) {
        String _fileExtension = ecoreFile.getFileExtension();
        boolean _equals = _fileExtension.equals("ecore");
        if (_equals) {
          URI _rawLocationURI = ecoreFile.getRawLocationURI();
          String _aSCIIString = _rawLocationURI.toASCIIString();
          org.eclipse.emf.common.util.URI _createURI = org.eclipse.emf.common.util.URI.createURI(_aSCIIString);
          final Resource resource = resourceSet.createResource(_createURI);
          resource.load(null);
          TreeIterator<EObject> _allContents = resource.getAllContents();
          Iterator<EPackage> _filter_1 = Iterators.<EPackage>filter(_allContents, EPackage.class);
          Iterable<EPackage> _iterable = IteratorExtensions.<EPackage>toIterable(_filter_1);
          for (final EPackage pkg : _iterable) {
            try {
              String _nsURI = pkg.getNsURI();
              EPackage.Registry.INSTANCE.put(_nsURI, pkg);
            } catch (final Throwable _t) {
              if (_t instanceof Exception) {
                final Exception e = (Exception)_t;
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
        }
      }
      IResource[] _members_1 = container.members();
      Iterable<IContainer> _filter_2 = Iterables.<IContainer>filter(((Iterable<?>)Conversions.doWrapArray(_members_1)), IContainer.class);
      for (final IContainer child : _filter_2) {
        this.loadEcores(child, resourceSet);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public IScope scope_Model_referred(final Model model, final EReference reference) {
    IScope _xblockexpression = null;
    {
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      this.loadEcores(_root, _resourceSetImpl);
      Collection<Object> _values = EPackage.Registry.INSTANCE.values();
      Iterable<EPackage> _filter = Iterables.<EPackage>filter(_values, EPackage.class);
      _xblockexpression = Scopes.scopeFor(_filter);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Quantification_nodeSet(final Quantification quantification, final EReference reference) {
    final Function1<NodeDefinition, Boolean> _function = (NodeDefinition d) -> {
      return Boolean.valueOf(d.isCollection());
    };
    return DslUtil.visibleDefinitions(quantification, _function);
  }
  
  public IScope scope_Argument_node(final PredicateReference predicate, final EReference reference) {
    final Function1<NodeDefinition, Boolean> _function = (NodeDefinition d) -> {
      boolean _isCollection = d.isCollection();
      return Boolean.valueOf((!_isCollection));
    };
    return DslUtil.visibleDefinitions(predicate, _function);
  }
  
  public IScope scope_DefinitionSentence_node(final DefinitionSentence sentence, final EReference reference) {
    final Function1<NodeDefinition, Boolean> _function = (NodeDefinition d) -> {
      boolean _isCollection = d.isCollection();
      return Boolean.valueOf((!_isCollection));
    };
    return DslUtil.visibleDefinitions(sentence, _function);
  }
  
  public IScope scope_PropertyReferenceExpression_node(final PropertyReferenceExpression expression, final EReference reference) {
    final Function1<NodeDefinition, Boolean> _function = (NodeDefinition d) -> {
      boolean _isCollection = d.isCollection();
      return Boolean.valueOf((!_isCollection));
    };
    return DslUtil.visibleDefinitions(expression, _function);
  }
}
