package com.isax.validation.dsl.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.isax.validation.dsl.dsl.Axis;
import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.QuantificationList;
import com.isax.validation.dsl.dsl.Sentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class DslUtil {
  public static int uniqueSuffix(final EObject object) {
    return object.hashCode();
  }
  
  public static boolean collectionAxis(final Axis axis) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _equals = Objects.equal(axis, Axis.ANCESTORS);
    if (_equals) {
      _or_2 = true;
    } else {
      boolean _equals_1 = Objects.equal(axis, Axis.DESCENDANTS);
      _or_2 = _equals_1;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_2 = Objects.equal(axis, Axis.CHILDREN);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_3 = Objects.equal(axis, Axis.PARENTS);
      _or = _equals_3;
    }
    return _or;
  }
  
  public static String path(final EObject object) {
    String _xblockexpression = null;
    {
      ArrayList<Integer> path = new ArrayList<Integer>();
      EObject inner = object;
      EObject parent = object.eContainer();
      while ((!Objects.equal(parent, null))) {
        {
          List<EObject> _eAllContentsAsList = EcoreUtil2.eAllContentsAsList(parent);
          int _indexOf = _eAllContentsAsList.indexOf(inner);
          path.add(Integer.valueOf(_indexOf));
          inner = parent;
          EObject _eContainer = parent.eContainer();
          parent = _eContainer;
        }
      }
      _xblockexpression = IterableExtensions.join(path, "_");
    }
    return _xblockexpression;
  }
  
  public static IScope visibleDefinitions(final EObject object, final Function1<? super NodeDefinition, Boolean> predicate) {
    Sentence _containerOfType = EcoreUtil2.<Sentence>getContainerOfType(object, Sentence.class);
    return DslUtil.scopeForSentence(_containerOfType, predicate);
  }
  
  private static IScope _scopeForSentence(final StartOnSentence startOn, final Function1<? super NodeDefinition, Boolean> predicate) {
    NodeDefinition _definition = startOn.getDefinition();
    List<NodeDefinition> _asList = Arrays.<NodeDefinition>asList(_definition);
    Iterable<NodeDefinition> _filter = IterableExtensions.<NodeDefinition>filter(_asList, predicate);
    return Scopes.scopeFor(_filter);
  }
  
  private static IScope _scopeForSentence(final Sentence sentence, final Function1<? super NodeDefinition, Boolean> predicate) {
    IScope _xblockexpression = null;
    {
      boolean _equals = Objects.equal(sentence, null);
      if (_equals) {
        return IScope.NULLSCOPE;
      }
      ArrayList<NodeDefinition> visible = new ArrayList<NodeDefinition>();
      Iterable<NodeDefinition> _sentenceDefinitions = DslUtil.sentenceDefinitions(sentence);
      Iterables.<NodeDefinition>addAll(visible, _sentenceDefinitions);
      ArrayList<NodeDefinition> _previousSiblingDefinitions = DslUtil.previousSiblingDefinitions(sentence);
      Iterables.<NodeDefinition>addAll(visible, _previousSiblingDefinitions);
      Sentence _elvis = null;
      EObject _eContainer = sentence.eContainer();
      Sentence _containerOfType = EcoreUtil2.<Sentence>getContainerOfType(_eContainer, Sentence.class);
      if (_containerOfType != null) {
        _elvis = _containerOfType;
      } else {
        EObject _eContainer_1 = sentence.eContainer();
        Validator _containerOfType_1 = EcoreUtil2.<Validator>getContainerOfType(_eContainer_1, Validator.class);
        StartOnSentence _startOn = null;
        if (_containerOfType_1!=null) {
          _startOn=_containerOfType_1.getStartOn();
        }
        _elvis = _startOn;
      }
      final Sentence parentSentence = _elvis;
      Iterable<NodeDefinition> _filter = IterableExtensions.<NodeDefinition>filter(visible, predicate);
      IScope _scopeForSentence = DslUtil.scopeForSentence(parentSentence, predicate);
      _xblockexpression = Scopes.scopeFor(_filter, _scopeForSentence);
    }
    return _xblockexpression;
  }
  
  private static ArrayList<NodeDefinition> previousSiblingDefinitions(final Sentence sentence) {
    ArrayList<NodeDefinition> _xblockexpression = null;
    {
      final BodySentences parentBody = EcoreUtil2.<BodySentences>getContainerOfType(sentence, BodySentences.class);
      EList<Sentence> _sentences = parentBody.getSentences();
      final int index = _sentences.indexOf(sentence);
      ArrayList<NodeDefinition> siblings = new ArrayList<NodeDefinition>();
      EList<Sentence> _sentences_1 = parentBody.getSentences();
      Iterable<Pair<Integer, Sentence>> _indexed = IterableExtensions.<Sentence>indexed(_sentences_1);
      final Function1<Pair<Integer, Sentence>, Boolean> _function = (Pair<Integer, Sentence> s) -> {
        Integer _key = s.getKey();
        return Boolean.valueOf(((_key).intValue() < index));
      };
      Iterable<Pair<Integer, Sentence>> _filter = IterableExtensions.<Pair<Integer, Sentence>>filter(_indexed, _function);
      final Function1<Pair<Integer, Sentence>, Sentence> _function_1 = (Pair<Integer, Sentence> s) -> {
        return s.getValue();
      };
      Iterable<Sentence> _map = IterableExtensions.<Pair<Integer, Sentence>, Sentence>map(_filter, _function_1);
      Iterable<DefinitionSentence> _filter_1 = Iterables.<DefinitionSentence>filter(_map, DefinitionSentence.class);
      final Function1<DefinitionSentence, NodeDefinition> _function_2 = (DefinitionSentence s) -> {
        TargetDefinition _target = s.getTarget();
        return _target.getDefinition();
      };
      Iterable<NodeDefinition> _map_1 = IterableExtensions.<DefinitionSentence, NodeDefinition>map(_filter_1, _function_2);
      Iterables.<NodeDefinition>addAll(siblings, _map_1);
      EList<Sentence> _sentences_2 = parentBody.getSentences();
      Iterable<Pair<Integer, Sentence>> _indexed_1 = IterableExtensions.<Sentence>indexed(_sentences_2);
      final Function1<Pair<Integer, Sentence>, Boolean> _function_3 = (Pair<Integer, Sentence> s) -> {
        Integer _key = s.getKey();
        return Boolean.valueOf(((_key).intValue() < index));
      };
      Iterable<Pair<Integer, Sentence>> _filter_2 = IterableExtensions.<Pair<Integer, Sentence>>filter(_indexed_1, _function_3);
      final Function1<Pair<Integer, Sentence>, Sentence> _function_4 = (Pair<Integer, Sentence> s) -> {
        return s.getValue();
      };
      Iterable<Sentence> _map_2 = IterableExtensions.<Pair<Integer, Sentence>, Sentence>map(_filter_2, _function_4);
      Iterable<DefinitionSentence> _filter_3 = Iterables.<DefinitionSentence>filter(_map_2, DefinitionSentence.class);
      final Function1<DefinitionSentence, Boolean> _function_5 = (DefinitionSentence s) -> {
        TargetDefinition _target = s.getTarget();
        NodeDefinition _local = _target.getLocal();
        return Boolean.valueOf((!Objects.equal(_local, null)));
      };
      Iterable<DefinitionSentence> _filter_4 = IterableExtensions.<DefinitionSentence>filter(_filter_3, _function_5);
      final Function1<DefinitionSentence, NodeDefinition> _function_6 = (DefinitionSentence s) -> {
        TargetDefinition _target = s.getTarget();
        return _target.getLocal();
      };
      Iterable<NodeDefinition> _map_3 = IterableExtensions.<DefinitionSentence, NodeDefinition>map(_filter_4, _function_6);
      Iterables.<NodeDefinition>addAll(siblings, _map_3);
      _xblockexpression = siblings;
    }
    return _xblockexpression;
  }
  
  private static Iterable<NodeDefinition> _sentenceDefinitions(final ConstraintSentence sentence) {
    QuantificationList _quantifications = sentence.getQuantifications();
    EList<Quantification> _quantifications_1 = _quantifications.getQuantifications();
    final Function1<Quantification, NodeDefinition> _function = (Quantification q) -> {
      return q.getNode();
    };
    return ListExtensions.<Quantification, NodeDefinition>map(_quantifications_1, _function);
  }
  
  private static Iterable<NodeDefinition> _sentenceDefinitions(final DefinitionSentence sentence) {
    Quantification _quantification = sentence.getQuantification();
    NodeDefinition _node = null;
    if (_quantification!=null) {
      _node=_quantification.getNode();
    }
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition = null;
    if (_target!=null) {
      _definition=_target.getDefinition();
    }
    TargetDefinition _target_1 = sentence.getTarget();
    NodeDefinition _local = null;
    if (_target_1!=null) {
      _local=_target_1.getLocal();
    }
    List<NodeDefinition> _asList = Arrays.<NodeDefinition>asList(_node, _definition, _local);
    return IterableExtensions.<NodeDefinition>filterNull(_asList);
  }
  
  private static IScope scopeForSentence(final Sentence startOn, final Function1<? super NodeDefinition, Boolean> predicate) {
    if (startOn instanceof StartOnSentence) {
      return _scopeForSentence((StartOnSentence)startOn, predicate);
    } else if (startOn != null) {
      return _scopeForSentence(startOn, predicate);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(startOn, predicate).toString());
    }
  }
  
  private static Iterable<NodeDefinition> sentenceDefinitions(final Sentence sentence) {
    if (sentence instanceof ConstraintSentence) {
      return _sentenceDefinitions((ConstraintSentence)sentence);
    } else if (sentence instanceof DefinitionSentence) {
      return _sentenceDefinitions((DefinitionSentence)sentence);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sentence).toString());
    }
  }
}
