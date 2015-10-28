package com.isax.validation.dsl.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.Sentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DslUtil {
  public static Iterable<NodeDefinition> findPreviouslyDefinedNodes(final Sentence sentence) {
    final ArrayList<NodeDefinition> definitions = new ArrayList<NodeDefinition>();
    EObject _rootContainer = EcoreUtil.getRootContainer(sentence);
    final Validator validator = ((Validator) _rootContainer);
    EList<Sentence> _sentences = validator.getSentences();
    for (final Sentence sentence2 : _sentences) {
      {
        NodeDefinition _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (sentence2 instanceof StartOnSentence) {
            _matched=true;
            _switchResult = ((StartOnSentence)sentence2).getDefinition();
          }
        }
        if (!_matched) {
          if (sentence2 instanceof DefinitionSentence) {
            NodeDefinition _node = ((DefinitionSentence)sentence2).getNode();
            boolean _notEquals = (!Objects.equal(_node, null));
            if (_notEquals) {
              _matched=true;
              TargetDefinition _target = ((DefinitionSentence)sentence2).getTarget();
              _switchResult = _target.getDefinition();
            }
          }
        }
        if (!_matched) {
          _switchResult = null;
        }
        definitions.add(_switchResult);
        boolean _equals = sentence2.equals(sentence);
        if (_equals) {
          return IterableExtensions.<NodeDefinition>filterNull(definitions);
        }
      }
    }
    return null;
  }
  
  public Iterable<DefinitionSentence> findDeclaration(final NodeDefinition definition) {
    Iterable<DefinitionSentence> _xblockexpression = null;
    {
      EObject _rootContainer = EcoreUtil.getRootContainer(definition);
      final Validator validator = ((Validator) _rootContainer);
      EList<Sentence> _sentences = validator.getSentences();
      Iterable<DefinitionSentence> _filter = Iterables.<DefinitionSentence>filter(_sentences, DefinitionSentence.class);
      final Function1<DefinitionSentence, Boolean> _function = (DefinitionSentence s) -> {
        TargetDefinition _target = s.getTarget();
        NodeDefinition _definition = _target.getDefinition();
        String _name = _definition.getName();
        String _name_1 = definition.getName();
        return Boolean.valueOf(_name.equals(_name_1));
      };
      _xblockexpression = IterableExtensions.<DefinitionSentence>filter(_filter, _function);
    }
    return _xblockexpression;
  }
  
  public int depth(final EObject object) {
    int _xblockexpression = (int) 0;
    {
      int i = 0;
      EObject parent = object;
      while ((!Objects.equal((parent = parent.eContainer()), null))) {
        i++;
      }
      _xblockexpression = i;
    }
    return _xblockexpression;
  }
}
