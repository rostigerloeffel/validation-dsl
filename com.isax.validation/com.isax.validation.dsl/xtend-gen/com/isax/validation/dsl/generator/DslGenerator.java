/**
 * generated by Xtext
 */
package com.isax.validation.dsl.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.isax.validation.dsl.dsl.AndExpression;
import com.isax.validation.dsl.dsl.Argument;
import com.isax.validation.dsl.dsl.ArgumentList;
import com.isax.validation.dsl.dsl.Axis;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate;
import com.isax.validation.dsl.dsl.ImpliesExpression;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.OrExpression;
import com.isax.validation.dsl.dsl.Parameter;
import com.isax.validation.dsl.dsl.ParameterList;
import com.isax.validation.dsl.dsl.PredicateCall;
import com.isax.validation.dsl.dsl.PredicateDefinitionSentence;
import com.isax.validation.dsl.dsl.PredicateExpression;
import com.isax.validation.dsl.dsl.PredicateReference;
import com.isax.validation.dsl.dsl.PropertyExpression;
import com.isax.validation.dsl.dsl.PropertyRelation;
import com.isax.validation.dsl.dsl.PropertyRelationPredicate;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.Quantor;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.Selector;
import com.isax.validation.dsl.dsl.SelectorList;
import com.isax.validation.dsl.dsl.SelectorListDef;
import com.isax.validation.dsl.dsl.Sentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class DslGenerator implements IGenerator {
  @Inject
  private ISerializer serializer;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    List<String> _segmentsList = _uRI.segmentsList();
    String _last = IterableExtensions.<String>last(_segmentsList);
    String[] _split = _last.split("\\.");
    final String validatorName = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_split)));
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _generateValidator = this.generateValidator(validatorName, ((Validator) _head));
    fsa.generateFile((validatorName + ".java"), _generateValidator);
  }
  
  public CharSequence generateValidator(final String validatorName, final Validator validator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    _builder.append(validatorName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@FunctionalInterface");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private interface Predicate {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("boolean test();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean eval(Predicate predicate) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return predicate.test();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean validate(Node node) {");
    _builder.newLine();
    {
      EList<Sentence> _sentences = validator.getSentences();
      for(final Sentence sentence : _sentences) {
        {
          if ((sentence instanceof StartOnSentence)) {
            _builder.append("\t\t");
            CharSequence _sentenceStatements = this.sentenceStatements(sentence);
            _builder.append(_sentenceStatements, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Sentence> _sentences_1 = validator.getSentences();
      for(final Sentence sentence_1 : _sentences_1) {
        {
          if ((sentence_1 instanceof DefinitionSentence)) {
            _builder.append("\t\t");
            CharSequence _sentenceStatements_1 = this.sentenceStatements(sentence_1);
            _builder.append(_sentenceStatements_1, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("boolean satisfied = ");
            TargetDefinition _target = ((DefinitionSentence)sentence_1).getTarget();
            NodeDefinition _definition = _target.getDefinition();
            RelationQualifier _qualifier = ((DefinitionSentence)sentence_1).getQualifier();
            String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition, _qualifier);
            _builder.append(_qualifierSatisfiedStatement, "\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("if (!satisfied) return satisfied;");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Sentence> _sentences_2 = validator.getSentences();
      for(final Sentence sentence_2 : _sentences_2) {
        {
          if ((sentence_2 instanceof PredicateDefinitionSentence)) {
            _builder.append("\t");
            CharSequence _sentenceStatements_2 = this.sentenceStatements(sentence_2);
            _builder.append(_sentenceStatements_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _sentenceStatements(final StartOnSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serializer.serialize(sentence);
    String _trim = _serialize.trim();
    String _replaceAll = _trim.replaceAll("\\n", "");
    String _replaceAll_1 = _replaceAll.replaceAll("\\r", "");
    _builder.append(_replaceAll_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Node ");
    NodeDefinition _definition = sentence.getDefinition();
    String _name = _definition.getName();
    _builder.append(_name, "");
    _builder.append(" = node;");
    _builder.newLineIfNotEmpty();
    _builder.append("if (");
    NodeDefinition _definition_1 = sentence.getDefinition();
    String _name_1 = _definition_1.getName();
    _builder.append(_name_1, "");
    _builder.append(" == null || !hasType(");
    NodeDefinition _definition_2 = sentence.getDefinition();
    String _name_2 = _definition_2.getName();
    _builder.append(_name_2, "");
    _builder.append(", ");
    NodeDefinition _definition_3 = sentence.getDefinition();
    SelectorList _selectors = _definition_3.getSelectors();
    String _selectorExpression = this.selectorExpression(_selectors);
    _builder.append(_selectorExpression, "");
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _sentenceStatements(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serializer.serialize(sentence);
    String _trim = _serialize.trim();
    String _replaceAll = _trim.replaceAll("\\n", "");
    String _replaceAll_1 = _replaceAll.replaceAll("\\r", "");
    _builder.append(_replaceAll_1, "");
    _builder.newLineIfNotEmpty();
    {
      NodeDefinition _node = sentence.getNode();
      boolean _notEquals = (!Objects.equal(_node, null));
      if (_notEquals) {
        CharSequence _singleNodeDefinition = this.singleNodeDefinition(sentence);
        _builder.append(_singleNodeDefinition, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Quantification _quantification = sentence.getQuantification();
      boolean _notEquals_1 = (!Objects.equal(_quantification, null));
      if (_notEquals_1) {
        CharSequence _quantifiedDefinition = this.quantifiedDefinition(sentence);
        _builder.append(_quantifiedDefinition, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _sentenceStatements(final ConstraintSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serializer.serialize(sentence);
    String _trim = _serialize.trim();
    String _replaceAll = _trim.replaceAll("\\n", "");
    String _replaceAll_1 = _replaceAll.replaceAll("\\r", "");
    _builder.append(_replaceAll_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _sentenceStatements(final PredicateDefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serializer.serialize(sentence);
    String _trim = _serialize.trim();
    String _replaceAll = _trim.replaceAll("\\n", "");
    String _replaceAll_1 = _replaceAll.replaceAll("\\r", "");
    _builder.append(_replaceAll_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("private boolean ");
    String _name = sentence.getName();
    _builder.append(_name, "");
    _builder.append("(");
    ParameterList _parameters = sentence.getParameters();
    String _parameterList = this.parameterList(_parameters);
    _builder.append(_parameterList, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence singleNodeDefinition(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition = _target.getDefinition();
    TargetDefinition _target_1 = sentence.getTarget();
    Axis _axis = _target_1.getAxis();
    NodeDefinition _node = sentence.getNode();
    TargetDefinition _target_2 = sentence.getTarget();
    NodeDefinition _definition_1 = _target_2.getDefinition();
    SelectorList _selectors = _definition_1.getSelectors();
    TargetDefinition _target_3 = sentence.getTarget();
    PredicateExpression _predicate = _target_3.getPredicate();
    CharSequence _nodeAssignmentStatement = this.nodeAssignmentStatement(_definition, _axis, _node, _selectors, _predicate);
    _builder.append(_nodeAssignmentStatement, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence quantifiedDefinition(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied = ");
    RelationQualifier _qualifier = sentence.getQualifier();
    String _initialQualifierSatisfaction = this.initialQualifierSatisfaction(_qualifier);
    _builder.append(_initialQualifierSatisfaction, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (");
    Quantification _quantification = sentence.getQuantification();
    NodeDefinition _node = _quantification.getNode();
    String _name = _node.getName();
    _builder.append(_name, "\t");
    _builder.append(" : ");
    Quantification _quantification_1 = sentence.getQuantification();
    NodeDefinition _nodeSet = _quantification_1.getNodeSet();
    String _name_1 = _nodeSet.getName();
    _builder.append(_name_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition = _target.getDefinition();
    TargetDefinition _target_1 = sentence.getTarget();
    Axis _axis = _target_1.getAxis();
    Quantification _quantification_2 = sentence.getQuantification();
    NodeDefinition _node_1 = _quantification_2.getNode();
    TargetDefinition _target_2 = sentence.getTarget();
    NodeDefinition _definition_1 = _target_2.getDefinition();
    SelectorList _selectors = _definition_1.getSelectors();
    TargetDefinition _target_3 = sentence.getTarget();
    PredicateExpression _predicate = _target_3.getPredicate();
    CharSequence _nodeAssignmentStatement = this.nodeAssignmentStatement(_definition, _axis, _node_1, _selectors, _predicate);
    _builder.append(_nodeAssignmentStatement, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("satisfied ");
    Quantification _quantification_3 = sentence.getQuantification();
    Quantor _quantor = _quantification_3.getQuantor();
    String _quantorSatisfactionRelation = this.quantorSatisfactionRelation(_quantor);
    _builder.append(_quantorSatisfactionRelation, "\t\t");
    _builder.append(" ");
    TargetDefinition _target_4 = sentence.getTarget();
    NodeDefinition _definition_2 = _target_4.getDefinition();
    RelationQualifier _qualifier_1 = sentence.getQualifier();
    String _qualifierSatisfiedAssignment = this.qualifierSatisfiedAssignment(_definition_2, _qualifier_1);
    _builder.append(_qualifierSatisfiedAssignment, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!satisfied) return satisfied;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence evaluationStatement(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    {
      NodeDefinition _node = sentence.getNode();
      boolean _notEquals = (!Objects.equal(_node, null));
      if (_notEquals) {
        CharSequence _singleNodeDefinition = this.singleNodeDefinition(sentence);
        _builder.append(_singleNodeDefinition, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Quantification _quantification = sentence.getQuantification();
      boolean _notEquals_1 = (!Objects.equal(_quantification, null));
      if (_notEquals_1) {
        CharSequence _quantifiedDefinition = this.quantifiedDefinition(sentence);
        _builder.append(_quantifiedDefinition, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence nodeAssignmentStatement(final NodeDefinition assignee, final Axis axis, final NodeDefinition source, final SelectorList types, final PredicateExpression predicate) {
    StringConcatenation _builder = new StringConcatenation();
    String _nodeDeclarationStatement = this.nodeDeclarationStatement(assignee);
    _builder.append(_nodeDeclarationStatement, "");
    _builder.append(" = ");
    String _name = axis.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append("(");
    String _name_1 = source.getName();
    _builder.append(_name_1, "");
    _builder.append(", ");
    String _selectorExpression = this.selectorExpression(types);
    _builder.append(_selectorExpression, "");
    _builder.append(", (Node node) -> {");
    _builder.newLineIfNotEmpty();
    {
      boolean _equals = Objects.equal(predicate, null);
      if (_equals) {
        _builder.append("\t");
        _builder.append("return true;");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("return eval(() -> { ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _predicateExpression = this.predicateExpression(predicate);
        _builder.append(_predicateExpression, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public String nodeDeclarationStatement(final NodeDefinition assignee) {
    boolean _isCollection = assignee.isCollection();
    if (_isCollection) {
      String _name = assignee.getName();
      return ("NodeSet " + _name);
    } else {
      String _name_1 = assignee.getName();
      return ("Node " + _name_1);
    }
  }
  
  public String qualifierSatisfiedAssignment(final NodeDefinition node, final RelationQualifier qualifier) {
    boolean _isCollection = node.isCollection();
    if (_isCollection) {
      if (qualifier != null) {
        switch (qualifier) {
          case CAN:
            return "true";
          case MUST:
            return ".isEmpty()";
          case MUST_NOT:
            return ".isEmpty()";
          default:
            break;
        }
      }
    } else {
      if (qualifier != null) {
        switch (qualifier) {
          case CAN:
            return "true";
          case MUST:
            return " != null";
          case MUST_NOT:
            return " == null";
          default:
            break;
        }
      }
    }
    return null;
  }
  
  public String qualifierSatisfiedStatement(final NodeDefinition node, final RelationQualifier qualifier) {
    boolean _isCollection = node.isCollection();
    if (_isCollection) {
      if (qualifier != null) {
        switch (qualifier) {
          case CAN:
            return this.qualifierSatisfiedAssignment(node, qualifier);
          case MUST:
            String _name = node.getName();
            String _plus = ("!" + _name);
            String _qualifierSatisfiedAssignment = this.qualifierSatisfiedAssignment(node, qualifier);
            return (_plus + _qualifierSatisfiedAssignment);
          case MUST_NOT:
            String _name_1 = node.getName();
            String _qualifierSatisfiedAssignment_1 = this.qualifierSatisfiedAssignment(node, qualifier);
            return (_name_1 + _qualifierSatisfiedAssignment_1);
          default:
            break;
        }
      }
    } else {
      if (qualifier != null) {
        switch (qualifier) {
          case CAN:
            return this.qualifierSatisfiedAssignment(node, qualifier);
          case MUST:
            String _name_2 = node.getName();
            String _qualifierSatisfiedAssignment_2 = this.qualifierSatisfiedAssignment(node, qualifier);
            return (_name_2 + _qualifierSatisfiedAssignment_2);
          case MUST_NOT:
            String _name_3 = node.getName();
            String _qualifierSatisfiedAssignment_3 = this.qualifierSatisfiedAssignment(node, qualifier);
            return (_name_3 + _qualifierSatisfiedAssignment_3);
          default:
            break;
        }
      }
    }
    return null;
  }
  
  public String initialQualifierSatisfaction(final RelationQualifier qualifier) {
    if (qualifier != null) {
      switch (qualifier) {
        case CAN:
          return "true";
        case MUST:
          return "true";
        case MUST_NOT:
          return "false";
        default:
          break;
      }
    }
    return null;
  }
  
  public String quantorSatisfactionRelation(final Quantor quantor) {
    if (quantor != null) {
      switch (quantor) {
        case ANY:
          return "|=";
        case EACH:
          return "&=";
        default:
          break;
      }
    }
    return null;
  }
  
  public String selectorExpression(final SelectorList list) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(list, null));
    if (!_notEquals) {
      _and = false;
    } else {
      SelectorListDef _selectors = list.getSelectors();
      boolean _notEquals_1 = (!Objects.equal(_selectors, null));
      _and = _notEquals_1;
    }
    if (_and) {
      SelectorListDef _selectors_1 = list.getSelectors();
      EList<Selector> _selectors_2 = _selectors_1.getSelectors();
      final Function1<Selector, CharSequence> _function = (Selector s) -> {
        String _type = s.getType();
        return _type.toUpperCase();
      };
      String _join = IterableExtensions.<Selector>join(_selectors_2, "_", _function);
      return (_join + "_TYPES");
    } else {
      return "";
    }
  }
  
  protected Object _predicateExpression(final PredicateExpression expression) {
    PredicateCall _call = expression.getCall();
    boolean _notEquals = (!Objects.equal(_call, null));
    if (_notEquals) {
      PredicateCall _call_1 = expression.getCall();
      return this.predicateCall(_call_1);
    }
    PredicateExpression _lhs = expression.getLhs();
    boolean _notEquals_1 = (!Objects.equal(_lhs, null));
    if (_notEquals_1) {
      PredicateExpression _lhs_1 = expression.getLhs();
      return this.predicateExpression(_lhs_1);
    }
    PredicateExpression _rhs = expression.getRhs();
    boolean _notEquals_2 = (!Objects.equal(_rhs, null));
    if (_notEquals_2) {
      PredicateExpression _rhs_1 = expression.getRhs();
      return this.predicateExpression(_rhs_1);
    }
    return null;
  }
  
  protected Object _predicateExpression(final AndExpression and) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _andExpression = this.andExpression(and);
    _builder.append(_andExpression, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected Object _predicateExpression(final OrExpression or) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _orExpression = this.orExpression(or);
    _builder.append(_orExpression, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected Object _predicateExpression(final ImpliesExpression implies) {
    return null;
  }
  
  protected Object _predicateExpression(final PropertyRelationPredicate predicate) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PredicateUtil.");
    PropertyRelation _relation = predicate.getRelation();
    String _name = _relation.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append("(");
    PropertyExpression _lhs = predicate.getLhs();
    _builder.append(_lhs, "");
    _builder.append(", ");
    PropertyExpression _rhs = predicate.getRhs();
    _builder.append(_rhs, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected Object _predicateExpression(final DefinitionSentencePredicate predicate) {
    StringConcatenation _builder = new StringConcatenation();
    DefinitionSentence _sentence = predicate.getSentence();
    Object _sentenceStatements = this.sentenceStatements(_sentence);
    _builder.append(_sentenceStatements, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected Object _predicateExpression(final PredicateReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    PredicateDefinitionSentence _reference = reference.getReference();
    String _name = _reference.getName();
    _builder.append(_name, "");
    _builder.append("(");
    ArgumentList _arguments = reference.getArguments();
    String _argumentList = this.argumentList(_arguments);
    _builder.append(_argumentList, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence andExpression(final AndExpression and) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied = true;\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    {
      PredicateExpression _lhs = and.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied &= ");
        PredicateExpression _lhs_1 = and.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied &= ");
    PredicateExpression _rhs = and.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied;");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence orExpression(final OrExpression or) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied = false;\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    {
      PredicateExpression _lhs = or.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied |= ");
        PredicateExpression _lhs_1 = or.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied |= ");
    PredicateExpression _rhs = or.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied;");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence impliesExpression(final ImpliesExpression implies) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied = false;\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    {
      PredicateExpression _lhs = implies.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied |= ");
        PredicateExpression _lhs_1 = implies.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied |= !");
    PredicateExpression _rhs = implies.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied;");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _predicateCall(final PropertyRelationPredicate relation) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _predicateCall(final DefinitionSentencePredicate definition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    DefinitionSentence _sentence = definition.getSentence();
    Object _sentenceStatements = this.sentenceStatements(_sentence);
    _builder.append(_sentenceStatements, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    DefinitionSentence _sentence_1 = definition.getSentence();
    TargetDefinition _target = _sentence_1.getTarget();
    NodeDefinition _definition = _target.getDefinition();
    DefinitionSentence _sentence_2 = definition.getSentence();
    RelationQualifier _qualifier = _sentence_2.getQualifier();
    String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition, _qualifier);
    _builder.append(_qualifierSatisfiedStatement, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _predicateCall(final PredicateReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public String argumentList(final ArgumentList list) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(list, null));
    if (_notEquals) {
      EList<Argument> _arguments = list.getArguments();
      final Function1<Argument, CharSequence> _function = (Argument argument) -> {
        NodeDefinition _node = argument.getNode();
        return _node.getName();
      };
      _xifexpression = IterableExtensions.<Argument>join(_arguments, ", ", _function);
    }
    return _xifexpression;
  }
  
  public String parameterList(final ParameterList list) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(list, null));
    if (_notEquals) {
      EList<Parameter> _parameters = list.getParameters();
      final Function1<Parameter, CharSequence> _function = (Parameter parameter) -> {
        String _xifexpression_1 = null;
        NodeDefinition _node = parameter.getNode();
        boolean _isCollection = _node.isCollection();
        if (_isCollection) {
          _xifexpression_1 = "Collection<Node>";
        } else {
          NodeDefinition _node_1 = parameter.getNode();
          String _name = _node_1.getName();
          _xifexpression_1 = (("Node" + " ") + _name);
        }
        return _xifexpression_1;
      };
      _xifexpression = IterableExtensions.<Parameter>join(_parameters, ", ", _function);
    }
    return _xifexpression;
  }
  
  public CharSequence sentenceStatements(final Sentence sentence) {
    if (sentence instanceof ConstraintSentence) {
      return _sentenceStatements((ConstraintSentence)sentence);
    } else if (sentence instanceof DefinitionSentence) {
      return _sentenceStatements((DefinitionSentence)sentence);
    } else if (sentence instanceof PredicateDefinitionSentence) {
      return _sentenceStatements((PredicateDefinitionSentence)sentence);
    } else if (sentence instanceof StartOnSentence) {
      return _sentenceStatements((StartOnSentence)sentence);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sentence).toString());
    }
  }
  
  public Object predicateExpression(final EObject and) {
    if (and instanceof AndExpression) {
      return _predicateExpression((AndExpression)and);
    } else if (and instanceof DefinitionSentencePredicate) {
      return _predicateExpression((DefinitionSentencePredicate)and);
    } else if (and instanceof ImpliesExpression) {
      return _predicateExpression((ImpliesExpression)and);
    } else if (and instanceof OrExpression) {
      return _predicateExpression((OrExpression)and);
    } else if (and instanceof PredicateReference) {
      return _predicateExpression((PredicateReference)and);
    } else if (and instanceof PropertyRelationPredicate) {
      return _predicateExpression((PropertyRelationPredicate)and);
    } else if (and instanceof PredicateExpression) {
      return _predicateExpression((PredicateExpression)and);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(and).toString());
    }
  }
  
  public CharSequence predicateCall(final PredicateCall definition) {
    if (definition instanceof DefinitionSentencePredicate) {
      return _predicateCall((DefinitionSentencePredicate)definition);
    } else if (definition instanceof PredicateReference) {
      return _predicateCall((PredicateReference)definition);
    } else if (definition instanceof PropertyRelationPredicate) {
      return _predicateCall((PropertyRelationPredicate)definition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(definition).toString());
    }
  }
}
