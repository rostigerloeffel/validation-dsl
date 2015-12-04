package com.isax.validation.dsl.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.isax.validation.dsl.dsl.Ancestor;
import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.CanHave;
import com.isax.validation.dsl.dsl.Child;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.Descendant;
import com.isax.validation.dsl.dsl.MustHave;
import com.isax.validation.dsl.dsl.MustNotHave;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.One;
import com.isax.validation.dsl.dsl.Parent;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.QuantificationList;
import com.isax.validation.dsl.dsl.RelationAxis;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.RelationQuantifier;
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
    Iterable<NodeDefinition> _xblockexpression = null;
    {
      final TargetDefinition target = sentence.getTarget();
      Quantification _quantification = sentence.getQuantification();
      NodeDefinition _node = null;
      if (_quantification!=null) {
        _node=_quantification.getNode();
      }
      NodeDefinition _xifexpression = null;
      NodeDefinition _definition = null;
      if (target!=null) {
        _definition=target.getDefinition();
      }
      boolean _isCollection = false;
      if (_definition!=null) {
        _isCollection=_definition.isCollection();
      }
      boolean _notEquals = (_isCollection != true);
      if (_notEquals) {
        _xifexpression = target.getDefinition();
      } else {
        _xifexpression = null;
      }
      NodeDefinition _local = null;
      if (target!=null) {
        _local=target.getLocal();
      }
      List<NodeDefinition> _asList = Arrays.<NodeDefinition>asList(_node, _xifexpression, _local);
      _xblockexpression = IterableExtensions.<NodeDefinition>filterNull(_asList);
    }
    return _xblockexpression;
  }
  
  public static String _name(final RelationQualifier qualifier) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (qualifier instanceof MustHave) {
        _matched=true;
        _switchResult = "mustHave";
      }
    }
    if (!_matched) {
      if (qualifier instanceof MustNotHave) {
        _matched=true;
        _switchResult = "mustNotHave";
      }
    }
    if (!_matched) {
      if (qualifier instanceof CanHave) {
        _matched=true;
        _switchResult = "canHave";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public static String _name(final RelationAxis axis) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (axis instanceof Parent) {
        _matched=true;
        _switchResult = "parent";
      }
    }
    if (!_matched) {
      if (axis instanceof Child) {
        _matched=true;
        _switchResult = "child";
      }
    }
    if (!_matched) {
      if (axis instanceof Ancestor) {
        _matched=true;
        _switchResult = "ancestor";
      }
    }
    if (!_matched) {
      if (axis instanceof Descendant) {
        _matched=true;
        _switchResult = "descendant";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public static String _name(final RelationAxis axis, final RelationQuantifier quantifier) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (quantifier instanceof One) {
        _matched=true;
        String _switchResult_1 = null;
        boolean _matched_1 = false;
        if (!_matched_1) {
          if (axis instanceof Parent) {
            _matched_1=true;
            _switchResult_1 = "parent";
          }
        }
        if (!_matched_1) {
          if (axis instanceof Child) {
            _matched_1=true;
            _switchResult_1 = "child";
          }
        }
        if (!_matched_1) {
          if (axis instanceof Ancestor) {
            _matched_1=true;
            _switchResult_1 = "ancestor";
          }
        }
        if (!_matched_1) {
          if (axis instanceof Descendant) {
            _matched_1=true;
            _switchResult_1 = "descendant";
          }
        }
        _switchResult = _switchResult_1;
      }
    }
    if (!_matched) {
      String _switchResult_1 = null;
      boolean _matched_1 = false;
      if (!_matched_1) {
        if (axis instanceof Parent) {
          _matched_1=true;
          _switchResult_1 = "parents";
        }
      }
      if (!_matched_1) {
        if (axis instanceof Child) {
          _matched_1=true;
          _switchResult_1 = "children";
        }
      }
      if (!_matched_1) {
        if (axis instanceof Ancestor) {
          _matched_1=true;
          _switchResult_1 = "ancestors";
        }
      }
      if (!_matched_1) {
        if (axis instanceof Descendant) {
          _matched_1=true;
          _switchResult_1 = "descendants";
        }
      }
      _switchResult = _switchResult_1;
    }
    return _switchResult;
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
  
  public static String name(final EObject axis) {
    if (axis instanceof RelationAxis) {
      return _name((RelationAxis)axis);
    } else if (axis instanceof RelationQualifier) {
      return _name((RelationQualifier)axis);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(axis).toString());
    }
  }
  
  public static String name(final RelationAxis axis, final RelationQuantifier quantifier) {
    return _name(axis, quantifier);
  }
}
