package com.isax.validation.dsl.ui.contentassist;

import com.google.common.collect.Iterables;
import com.isax.validation.dsl.dsl.EAttributePropertyReference;
import com.isax.validation.dsl.dsl.EClassSelector;
import com.isax.validation.dsl.ui.contentassist.DslHighlightingConfiguration;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DslSemanticHighlighting extends XbaseHighlightingCalculator {
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    super.provideHighlightingFor(resource, acceptor, cancelIndicator);
    List<EObject> _eAllContentsAsList = null;
    if (resource!=null) {
      _eAllContentsAsList=EcoreUtil2.eAllContentsAsList(resource);
    }
    Iterable<EClassSelector> _filter = Iterables.<EClassSelector>filter(_eAllContentsAsList, EClassSelector.class);
    final Function1<EClassSelector, ICompositeNode> _function = (EClassSelector s) -> {
      return NodeModelUtils.findActualNodeFor(s);
    };
    Iterable<ICompositeNode> _map = IterableExtensions.<EClassSelector, ICompositeNode>map(_filter, _function);
    final Consumer<ICompositeNode> _function_1 = (ICompositeNode n) -> {
      int _offset = n.getOffset();
      int _length = n.getLength();
      acceptor.addPosition(_offset, _length, DslHighlightingConfiguration.ECLASS_SELECTOR);
    };
    _map.forEach(_function_1);
    List<EObject> _eAllContentsAsList_1 = null;
    if (resource!=null) {
      _eAllContentsAsList_1=EcoreUtil2.eAllContentsAsList(resource);
    }
    Iterable<EAttributePropertyReference> _filter_1 = Iterables.<EAttributePropertyReference>filter(_eAllContentsAsList_1, EAttributePropertyReference.class);
    final Function1<EAttributePropertyReference, ICompositeNode> _function_2 = (EAttributePropertyReference s) -> {
      return NodeModelUtils.findActualNodeFor(s);
    };
    Iterable<ICompositeNode> _map_1 = IterableExtensions.<EAttributePropertyReference, ICompositeNode>map(_filter_1, _function_2);
    final Consumer<ICompositeNode> _function_3 = (ICompositeNode n) -> {
      int _offset = n.getOffset();
      int _length = n.getLength();
      acceptor.addPosition(_offset, _length, DslHighlightingConfiguration.EATTRIBUTE_REFERENCE);
    };
    _map_1.forEach(_function_3);
  }
}
