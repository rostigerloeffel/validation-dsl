package com.isax.validation.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.isax.validation.dsl.api.AbstractValidator;
import com.isax.validation.dsl.api.NodePredicates;
import com.isax.validation.dsl.api.ResolvingNode;
import com.isax.validation.dsl.api.ResolvingNodeSet;
import com.isax.validation.dsl.api.Traverser;
import com.isax.validation.dsl.dsl.AndExpression;
import com.isax.validation.dsl.dsl.Argument;
import com.isax.validation.dsl.dsl.ArgumentList;
import com.isax.validation.dsl.dsl.AssignmentXExpression;
import com.isax.validation.dsl.dsl.Axis;
import com.isax.validation.dsl.dsl.BodySentences;
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
import com.isax.validation.dsl.dsl.PredicateXExpression;
import com.isax.validation.dsl.dsl.PropertyExpression;
import com.isax.validation.dsl.dsl.PropertyReferenceExpression;
import com.isax.validation.dsl.dsl.PropertyRelation;
import com.isax.validation.dsl.dsl.PropertyRelationPredicate;
import com.isax.validation.dsl.dsl.PropertyValueExpression;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.QuantificationList;
import com.isax.validation.dsl.dsl.Quantor;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.Selector;
import com.isax.validation.dsl.dsl.SelectorList;
import com.isax.validation.dsl.dsl.SelectorListDef;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import com.isax.validation.dsl.jvmmodel.NameProvider;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DslJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private ISerializer serializer;
  
  @Inject
  @Extension
  private NameProvider names = new NameProvider();
  
  protected void _infer(final Validator validator, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    Resource _eResource = validator.eResource();
    URI _uRI = _eResource.getURI();
    String _lastSegment = _uRI.lastSegment();
    String[] _split = _lastSegment.split("\\.");
    String _get = _split[0];
    String _plus = ("de.dbsystem.avb." + _get);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(validator, _plus);
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(AbstractValidator.class);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      EList<JvmMember> _members = it.getMembers();
      String _simpleName = ResolvingNode.class.getSimpleName();
      String _plus_1 = ("null$" + _simpleName);
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
      final Procedure1<JvmField> _function_1 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
        it_1.setStatic(true);
        it_1.setFinal(true);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("new ");
            String _simpleName = ResolvingNode.class.getSimpleName();
            _builder.append(_simpleName, "");
            _builder.append("()");
          }
        };
        this._jvmTypesBuilder.setInitializer(it_1, _client);
      };
      JvmField _field = this._jvmTypesBuilder.toField(validator, _plus_1, _typeRef_1, _function_1);
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = it.getMembers();
      String _simpleName_1 = ResolvingNodeSet.class.getSimpleName();
      String _plus_2 = ("null$" + _simpleName_1);
      JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(ResolvingNodeSet.class);
      final Procedure1<JvmField> _function_2 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
        it_1.setStatic(true);
        it_1.setFinal(true);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("new ");
            String _simpleName = ResolvingNodeSet.class.getSimpleName();
            _builder.append(_simpleName, "");
            _builder.append("()");
          }
        };
        this._jvmTypesBuilder.setInitializer(it_1, _client);
      };
      JvmField _field_1 = this._jvmTypesBuilder.toField(validator, _plus_2, _typeRef_2, _function_2);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
      EList<JvmMember> _members_2 = it.getMembers();
      JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(Traverser.class);
      final Procedure1<JvmField> _function_3 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
      };
      JvmField _field_2 = this._jvmTypesBuilder.toField(validator, "traverser$", _typeRef_3, _function_3);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
      EList<JvmMember> _members_3 = it.getMembers();
      JvmTypeReference _typeRef_4 = this._typeReferenceBuilder.typeRef(NodePredicates.class);
      final Procedure1<JvmField> _function_4 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
      };
      JvmField _field_3 = this._jvmTypesBuilder.toField(validator, "predicates$", _typeRef_4, _function_4);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_3, _field_3);
      EList<JvmMember> _members_4 = it.getMembers();
      StartOnSentence _startOn = validator.getStartOn();
      JvmField _compileStartOnDefinitionField = this.compileStartOnDefinitionField(_startOn);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_4, _compileStartOnDefinitionField);
      EList<JvmMember> _members_5 = it.getMembers();
      BodySentences _body = validator.getBody();
      EList<DefinitionSentence> _definitions = _body.getDefinitions();
      List<JvmField> _compileNodeDefinitionFields = this.compileNodeDefinitionFields(_definitions);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_5, _compileNodeDefinitionFields);
      EList<JvmMember> _members_6 = it.getMembers();
      JvmTypeReference _typeRef_5 = this._typeReferenceBuilder.typeRef("boolean");
      final Procedure1<JvmOperation> _function_5 = (JvmOperation it_1) -> {
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        it_1.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmFormalParameter> _parameters = it_1.getParameters();
        JvmTypeReference _typeRef_6 = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(validator, "node$", _typeRef_6);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            StartOnSentence _startOn = validator.getStartOn();
            CharSequence _compileStartOn = DslJvmModelInferrer.this.compileStartOn(_startOn);
            _builder.append(_compileStartOn, "");
            _builder.newLineIfNotEmpty();
            BodySentences _body = validator.getBody();
            CharSequence _compileBody = DslJvmModelInferrer.this.compileBody(_body, false);
            _builder.append(_compileBody, "");
            _builder.newLineIfNotEmpty();
            _builder.append("return true;");
            _builder.newLine();
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(validator, "validate", _typeRef_5, _function_5);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _method);
      EList<JvmMember> _members_7 = it.getMembers();
      EList<PredicateDefinitionSentence> _predicates = validator.getPredicates();
      List<JvmOperation> _compilePredicates = this.compilePredicates(_predicates);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_7, _compilePredicates);
      EList<JvmMember> _members_8 = it.getMembers();
      Iterable<JvmOperation> _compileXExpressionPredicates = this.compileXExpressionPredicates(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_8, _compileXExpressionPredicates);
      EList<JvmMember> _members_9 = it.getMembers();
      Iterable<JvmOperation> _compileXExpressionAssignments = this.compileXExpressionAssignments(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_9, _compileXExpressionAssignments);
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  public String serialize(final EObject object) {
    String _serialize = this.serializer.serialize(object);
    String _trim = _serialize.trim();
    String _replaceAll = _trim.replaceAll("\\n", "");
    String _replaceAll_1 = _replaceAll.replaceAll("\\r", "");
    return _replaceAll_1.replaceAll("\\s+", " ");
  }
  
  public JvmField compileStartOnDefinitionField(final StartOnSentence startOn) {
    NodeDefinition _definition = startOn.getDefinition();
    String _uniqueName = this.names.uniqueName(_definition);
    JvmTypeReference _xifexpression = null;
    NodeDefinition _definition_1 = startOn.getDefinition();
    boolean _isCollection = _definition_1.isCollection();
    if (_isCollection) {
      _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNodeSet.class);
    } else {
      _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
    }
    return this._jvmTypesBuilder.toField(startOn, _uniqueName, _xifexpression);
  }
  
  public List<JvmField> compileNodeDefinitionFields(final List<DefinitionSentence> sentences) {
    final Function1<DefinitionSentence, JvmField> _function = (DefinitionSentence s) -> {
      TargetDefinition _target = s.getTarget();
      NodeDefinition _definition = _target.getDefinition();
      String _uniqueName = this.names.uniqueName(_definition);
      JvmTypeReference _xifexpression = null;
      TargetDefinition _target_1 = s.getTarget();
      NodeDefinition _definition_1 = _target_1.getDefinition();
      boolean _isCollection = _definition_1.isCollection();
      if (_isCollection) {
        _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNodeSet.class);
      } else {
        _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
      }
      return this._jvmTypesBuilder.toField(s, _uniqueName, _xifexpression);
    };
    return ListExtensions.<DefinitionSentence, JvmField>map(sentences, _function);
  }
  
  public CharSequence compileStartOn(final StartOnSentence startOn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(startOn);
    _builder.append(_serialize, "");
    _builder.newLineIfNotEmpty();
    NodeDefinition _definition = startOn.getDefinition();
    String _uniqueName = this.names.uniqueName(_definition);
    _builder.append(_uniqueName, "");
    _builder.append(" = node$;");
    _builder.newLineIfNotEmpty();
    _builder.append("if (");
    NodeDefinition _definition_1 = startOn.getDefinition();
    String _uniqueName_1 = this.names.uniqueName(_definition_1);
    _builder.append(_uniqueName_1, "");
    _builder.append(" == null || !predicates$.hasType(");
    NodeDefinition _definition_2 = startOn.getDefinition();
    String _uniqueName_2 = this.names.uniqueName(_definition_2);
    _builder.append(_uniqueName_2, "");
    _builder.append(", \"");
    NodeDefinition _definition_3 = startOn.getDefinition();
    SelectorList _selectors = _definition_3.getSelectors();
    SelectorListDef _selectors_1 = _selectors.getSelectors();
    EList<Selector> _selectors_2 = _selectors_1.getSelectors();
    final Function1<Selector, CharSequence> _function = (Selector s) -> {
      return s.getType();
    };
    String _join = IterableExtensions.<Selector>join(_selectors_2, "\", \"", _function);
    _builder.append(_join, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileBody(final BodySentences body, final boolean withDeclarations) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(body, null));
      if (_notEquals) {
        {
          EList<DefinitionSentence> _definitions = null;
          if (body!=null) {
            _definitions=body.getDefinitions();
          }
          for(final DefinitionSentence definition : _definitions) {
            CharSequence _compileDefinition = this.compileDefinition(definition, withDeclarations);
            _builder.append(_compileDefinition, "");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<ConstraintSentence> _constraints = null;
          if (body!=null) {
            _constraints=body.getConstraints();
          }
          for(final ConstraintSentence constraint : _constraints) {
            CharSequence _compileConstraint = this.compileConstraint(constraint);
            _builder.append(_compileConstraint, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileDefinition(final DefinitionSentence sentence, final boolean withDeclarations) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(sentence);
    _builder.append(_serialize, "");
    _builder.newLineIfNotEmpty();
    {
      if (withDeclarations) {
        TargetDefinition _target = sentence.getTarget();
        NodeDefinition _definition = _target.getDefinition();
        String _declareNode = this.declareNode(_definition);
        _builder.append(_declareNode, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      NodeDefinition _node = sentence.getNode();
      boolean _notEquals = (!Objects.equal(_node, null));
      if (_notEquals) {
        CharSequence _singleNodeDefinition = this.singleNodeDefinition(sentence);
        _builder.append(_singleNodeDefinition, "");
        _builder.newLineIfNotEmpty();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("boolean satisfied$");
        Integer _uniqueSuffix = this.names.uniqueSuffix(sentence);
        _builder.append(_uniqueSuffix, "\t");
        _builder.append(" = ");
        TargetDefinition _target_1 = sentence.getTarget();
        NodeDefinition _definition_1 = _target_1.getDefinition();
        RelationQualifier _qualifier = sentence.getQualifier();
        String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition_1, _qualifier);
        _builder.append(_qualifierSatisfiedStatement, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (!satisfied$");
        Integer _uniqueSuffix_1 = this.names.uniqueSuffix(sentence);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(") return satisfied$");
        Integer _uniqueSuffix_2 = this.names.uniqueSuffix(sentence);
        _builder.append(_uniqueSuffix_2, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
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
  
  public CharSequence compileConstraint(final ConstraintSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(sentence);
    _builder.append(_serialize, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      QuantificationList _quantifications = sentence.getQuantifications();
      boolean _notEquals = (!Objects.equal(_quantifications, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("boolean satisfied$");
        Integer _uniqueSuffix = this.names.uniqueSuffix(sentence);
        _builder.append(_uniqueSuffix, "\t");
        _builder.append(" = ");
        QuantificationList _quantifications_1 = sentence.getQuantifications();
        EList<Quantification> _quantifications_2 = _quantifications_1.getQuantifications();
        CharSequence _constraintDispatch = this.constraintDispatch(_quantifications_2, 0, sentence);
        _builder.append(_constraintDispatch, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (!satisfied$");
        Integer _uniqueSuffix_1 = this.names.uniqueSuffix(sentence);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(") return false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public List<JvmOperation> compilePredicates(final List<PredicateDefinitionSentence> sentences) {
    final Function1<PredicateDefinitionSentence, JvmOperation> _function = (PredicateDefinitionSentence s) -> {
      String _name = s.getName();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("boolean");
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PRIVATE);
        EList<JvmFormalParameter> _parameters = it.getParameters();
        ParameterList _parameters_1 = s.getParameters();
        EList<Parameter> _parameters_2 = null;
        if (_parameters_1!=null) {
          _parameters_2=_parameters_1.getParameters();
        }
        List<JvmFormalParameter> _map = null;
        if (_parameters_2!=null) {
          final Function1<Parameter, JvmFormalParameter> _function_2 = (Parameter p) -> {
            NodeDefinition _node = p.getNode();
            String _uniqueName = this.names.uniqueName(_node);
            JvmTypeReference _xifexpression = null;
            NodeDefinition _node_1 = p.getNode();
            boolean _isCollection = _node_1.isCollection();
            if (_isCollection) {
              _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNodeSet.class);
            } else {
              _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
            }
            return this._jvmTypesBuilder.toParameter(p, _uniqueName, _xifexpression);
          };
          _map=ListExtensions.<Parameter, JvmFormalParameter>map(_parameters_2, _function_2);
        }
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _map);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            BodySentences _body = s.getBody();
            CharSequence _compileBody = DslJvmModelInferrer.this.compileBody(_body, true);
            _builder.append(_compileBody, "");
            _builder.newLineIfNotEmpty();
            _builder.append("return true;");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(s, _name, _typeRef, _function_1);
    };
    return ListExtensions.<PredicateDefinitionSentence, JvmOperation>map(sentences, _function);
  }
  
  public String declareNode(final NodeDefinition definition) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _isCollection = definition.isCollection();
      if (_isCollection) {
        _xifexpression = ResolvingNodeSet.class.getSimpleName();
      } else {
        _xifexpression = ResolvingNode.class.getSimpleName();
      }
      final String nodeType = _xifexpression;
      String _uniqueName = this.names.uniqueName(definition);
      String _plus = ((nodeType + " ") + _uniqueName);
      String _plus_1 = (_plus + " = null$");
      String _plus_2 = (_plus_1 + nodeType);
      _xblockexpression = (_plus_2 + ";");
    }
    return _xblockexpression;
  }
  
  public Iterable<JvmOperation> compileXExpressionPredicates(final Validator validator) {
    TreeIterator<EObject> _eAllContents = validator.eAllContents();
    Set<EObject> _set = IteratorExtensions.<EObject>toSet(_eAllContents);
    Iterable<PredicateXExpression> _filter = Iterables.<PredicateXExpression>filter(_set, PredicateXExpression.class);
    final Function1<PredicateXExpression, JvmOperation> _function = (PredicateXExpression e) -> {
      int _hashCode = e.hashCode();
      String _plus = ("predicate$" + Integer.valueOf(_hashCode));
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("boolean");
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        XExpression _expression = e.getExpression();
        this._jvmTypesBuilder.setBody(it, _expression);
      };
      return this._jvmTypesBuilder.toMethod(e, _plus, _typeRef, _function_1);
    };
    return IterableExtensions.<PredicateXExpression, JvmOperation>map(_filter, _function);
  }
  
  public Iterable<JvmOperation> compileXExpressionAssignments(final Validator validator) {
    TreeIterator<EObject> _eAllContents = validator.eAllContents();
    Set<EObject> _set = IteratorExtensions.<EObject>toSet(_eAllContents);
    Iterable<AssignmentXExpression> _filter = Iterables.<AssignmentXExpression>filter(_set, AssignmentXExpression.class);
    final Function1<AssignmentXExpression, JvmOperation> _function = (AssignmentXExpression e) -> {
      int _hashCode = e.hashCode();
      String _plus = ("assignment$" + Integer.valueOf(_hashCode));
      XExpression _expression = e.getExpression();
      JvmTypeReference _inferredType = this._jvmTypesBuilder.inferredType(_expression);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        XExpression _expression_1 = e.getExpression();
        this._jvmTypesBuilder.setBody(it, _expression_1);
      };
      return this._jvmTypesBuilder.toMethod(e, _plus, _inferredType, _function_1);
    };
    return IterableExtensions.<AssignmentXExpression, JvmOperation>map(_filter, _function);
  }
  
  public CharSequence constraintDispatch(final List<Quantification> quantifications, final int index, final ConstraintSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = quantifications.size();
      boolean _lessThan = (index < _size);
      if (_lessThan) {
        {
          Quantification _get = quantifications.get(index);
          Quantor _quantor = _get.getQuantor();
          boolean _equals = Objects.equal(_quantor, Quantor.EACH);
          if (_equals) {
            CharSequence _constraintQuantorEach = this.constraintQuantorEach(quantifications, index, sentence);
            _builder.append(_constraintQuantorEach, "");
            _builder.newLineIfNotEmpty();
          } else {
            Quantification _get_1 = quantifications.get(index);
            Quantor _quantor_1 = _get_1.getQuantor();
            boolean _equals_1 = Objects.equal(_quantor_1, Quantor.ANY);
            if (_equals_1) {
              CharSequence _constraintQuantorAny = this.constraintQuantorAny(quantifications, index, sentence);
              _builder.append(_constraintQuantorAny, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      } else {
        PredicateExpression _predicate = sentence.getPredicate();
        Object _predicateExpression = this.predicateExpression(_predicate);
        _builder.append(_predicateExpression, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence constraintQuantorEach(final List<Quantification> quantifications, final int index, final ConstraintSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (");
    String _simpleName = ResolvingNode.class.getSimpleName();
    _builder.append(_simpleName, "\t");
    _builder.append(" ");
    Quantification _get = quantifications.get(index);
    NodeDefinition _node = _get.getNode();
    String _uniqueName = this.names.uniqueName(_node);
    _builder.append(_uniqueName, "\t");
    _builder.append(" : ");
    Quantification _get_1 = quantifications.get(index);
    NodeDefinition _nodeSet = _get_1.getNodeSet();
    String _uniqueName_1 = this.names.uniqueName(_nodeSet);
    _builder.append(_uniqueName_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("boolean satisfied$");
    Quantification _get_2 = quantifications.get(index);
    NodeDefinition _node_1 = _get_2.getNode();
    Integer _uniqueSuffix = this.names.uniqueSuffix(_node_1);
    _builder.append(_uniqueSuffix, "\t\t");
    _builder.append(" = ");
    Object _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (!satisfied$");
    Quantification _get_3 = quantifications.get(index);
    NodeDefinition _node_2 = _get_3.getNode();
    Integer _uniqueSuffix_1 = this.names.uniqueSuffix(_node_2);
    _builder.append(_uniqueSuffix_1, "\t\t");
    _builder.append(") return false;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence constraintQuantorAny(final List<Quantification> quantifications, final int index, final ConstraintSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (");
    String _simpleName = ResolvingNode.class.getSimpleName();
    _builder.append(_simpleName, "\t");
    _builder.append(" ");
    Quantification _get = quantifications.get(index);
    NodeDefinition _node = _get.getNode();
    String _uniqueName = this.names.uniqueName(_node);
    _builder.append(_uniqueName, "\t");
    _builder.append(" : ");
    Quantification _get_1 = quantifications.get(index);
    NodeDefinition _nodeSet = _get_1.getNodeSet();
    String _uniqueName_1 = this.names.uniqueName(_nodeSet);
    _builder.append(_uniqueName_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("boolean satisfied$");
    Quantification _get_2 = quantifications.get(index);
    NodeDefinition _node_1 = _get_2.getNode();
    Integer _uniqueSuffix = this.names.uniqueSuffix(_node_1);
    _builder.append(_uniqueSuffix, "\t\t");
    _builder.append(" = ");
    Object _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (satisfied$");
    Quantification _get_3 = quantifications.get(index);
    NodeDefinition _node_2 = _get_3.getNode();
    Integer _uniqueSuffix_1 = this.names.uniqueSuffix(_node_2);
    _builder.append(_uniqueSuffix_1, "\t\t");
    _builder.append(") return true;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence singleNodeDefinition(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition = _target.getDefinition();
    TargetDefinition _target_1 = sentence.getTarget();
    NodeDefinition _local = _target_1.getLocal();
    TargetDefinition _target_2 = sentence.getTarget();
    Axis _axis = _target_2.getAxis();
    NodeDefinition _node = sentence.getNode();
    TargetDefinition _target_3 = sentence.getTarget();
    NodeDefinition _definition_1 = _target_3.getDefinition();
    SelectorList _selectors = _definition_1.getSelectors();
    TargetDefinition _target_4 = sentence.getTarget();
    BodySentences _body = _target_4.getBody();
    CharSequence _nodeAssignmentStatement = this.nodeAssignmentStatement(_definition, _local, _axis, _node, _selectors, _body);
    _builder.append(_nodeAssignmentStatement, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence quantifiedDefinition(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied$");
    Integer _uniqueSuffix = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = ");
    RelationQualifier _qualifier = sentence.getQualifier();
    String _initialQualifierSatisfaction = this.initialQualifierSatisfaction(_qualifier);
    _builder.append(_initialQualifierSatisfaction, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (");
    String _simpleName = ResolvingNode.class.getSimpleName();
    _builder.append(_simpleName, "\t");
    _builder.append(" ");
    Quantification _quantification = sentence.getQuantification();
    NodeDefinition _node = _quantification.getNode();
    String _uniqueName = this.names.uniqueName(_node);
    _builder.append(_uniqueName, "\t");
    _builder.append(" : ");
    Quantification _quantification_1 = sentence.getQuantification();
    NodeDefinition _nodeSet = _quantification_1.getNodeSet();
    String _uniqueName_1 = this.names.uniqueName(_nodeSet);
    _builder.append(_uniqueName_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition = _target.getDefinition();
    TargetDefinition _target_1 = sentence.getTarget();
    NodeDefinition _local = _target_1.getLocal();
    TargetDefinition _target_2 = sentence.getTarget();
    Axis _axis = _target_2.getAxis();
    Quantification _quantification_2 = sentence.getQuantification();
    NodeDefinition _node_1 = _quantification_2.getNode();
    TargetDefinition _target_3 = sentence.getTarget();
    NodeDefinition _definition_1 = _target_3.getDefinition();
    SelectorList _selectors = _definition_1.getSelectors();
    TargetDefinition _target_4 = sentence.getTarget();
    BodySentences _body = _target_4.getBody();
    CharSequence _nodeAssignmentStatement = this.nodeAssignmentStatement(_definition, _local, _axis, _node_1, _selectors, _body);
    _builder.append(_nodeAssignmentStatement, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("satisfied$");
    Integer _uniqueSuffix_1 = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix_1, "\t\t");
    _builder.append(" ");
    Quantification _quantification_3 = sentence.getQuantification();
    Quantor _quantor = _quantification_3.getQuantor();
    String _quantorSatisfactionRelation = this.quantorSatisfactionRelation(_quantor);
    _builder.append(_quantorSatisfactionRelation, "\t\t");
    _builder.append(" ");
    TargetDefinition _target_5 = sentence.getTarget();
    NodeDefinition _definition_2 = _target_5.getDefinition();
    RelationQualifier _qualifier_1 = sentence.getQualifier();
    String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition_2, _qualifier_1);
    _builder.append(_qualifierSatisfiedStatement, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!satisfied$");
    Integer _uniqueSuffix_2 = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(") return satisfied$");
    Integer _uniqueSuffix_3 = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence nodeAssignmentStatement(final NodeDefinition assignee, final NodeDefinition local, final Axis axis, final NodeDefinition source, final SelectorList types, final BodySentences body) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(local, null));
    if (_notEquals) {
      _xifexpression = this.names.uniqueName(local);
    } else {
      Integer _uniqueSuffix = this.names.uniqueSuffix(assignee);
      _xifexpression = ("node$" + _uniqueSuffix);
    }
    final String localName = _xifexpression;
    _builder.newLineIfNotEmpty();
    String _uniqueName = this.names.uniqueName(assignee);
    _builder.append(_uniqueName, "");
    _builder.append(" = traverser$.");
    String _name = axis.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append("(");
    String _uniqueName_1 = this.names.uniqueName(source);
    _builder.append(_uniqueName_1, "");
    _builder.append(", (");
    String _simpleName = ResolvingNode.class.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append(" ");
    _builder.append(localName, "");
    _builder.append(") -> {\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _map = this.names.map(assignee, localName);
    _builder.append(_map, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("boolean satisfied$");
    Integer _uniqueSuffix_1 = this.names.uniqueSuffix(assignee);
    _builder.append(_uniqueSuffix_1, "\t");
    _builder.append(" = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_1 = (!Objects.equal(types, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("satisfied$");
        Integer _uniqueSuffix_2 = this.names.uniqueSuffix(assignee);
        _builder.append(_uniqueSuffix_2, "\t");
        _builder.append(" &= predicates$.hasType(");
        _builder.append(localName, "\t");
        _builder.append(", \"");
        SelectorListDef _selectors = types.getSelectors();
        EList<Selector> _selectors_1 = _selectors.getSelectors();
        final Function1<Selector, CharSequence> _function = (Selector s) -> {
          return s.getType();
        };
        String _join = IterableExtensions.<Selector>join(_selectors_1, "\", \"", _function);
        _builder.append(_join, "\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_2 = (!Objects.equal(body, null));
      if (_notEquals_2) {
        _builder.append("\t");
        _builder.append("satisfied$");
        Integer _uniqueSuffix_3 = this.names.uniqueSuffix(assignee);
        _builder.append(_uniqueSuffix_3, "\t");
        _builder.append(" &= eval(() -> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        Object _compileBody = this.compileBody(body, true);
        _builder.append(_compileBody, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("});");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return satisfied$");
    Integer _uniqueSuffix_4 = this.names.uniqueSuffix(assignee);
    _builder.append(_uniqueSuffix_4, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _unmap = this.names.unmap(assignee);
    _builder.append(_unmap, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public String qualifierSatisfiedStatement(final NodeDefinition node, final RelationQualifier qualifier) {
    if (qualifier != null) {
      switch (qualifier) {
        case CAN:
          return "true";
        case MUST:
          String _uniqueName = this.names.uniqueName(node);
          return (_uniqueName + ".hasCandidates()");
        case MUST_NOT:
          String _uniqueName_1 = this.names.uniqueName(node);
          String _plus = ("!" + _uniqueName_1);
          return (_plus + ".hasCandidates()");
        default:
          break;
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
  
  protected Object _predicateExpression(final PredicateExpression expression) {
    PredicateExpression _inner = expression.getInner();
    boolean _notEquals = (!Objects.equal(_inner, null));
    if (_notEquals) {
      PredicateExpression _inner_1 = expression.getInner();
      return this.predicateExpression(_inner_1);
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
    PredicateCall _call = expression.getCall();
    boolean _notEquals_3 = (!Objects.equal(_call, null));
    if (_notEquals_3) {
      PredicateCall _call_1 = expression.getCall();
      return this.predicateCall(_call_1);
    }
    return null;
  }
  
  protected Object _predicateExpression(final AndExpression and) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied$");
    Integer _uniqueSuffix = this.names.uniqueSuffix(and);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = true;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = and.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied$");
        Integer _uniqueSuffix_1 = this.names.uniqueSuffix(and);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(" &= ");
        PredicateExpression _lhs_1 = and.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied$");
    Integer _uniqueSuffix_2 = this.names.uniqueSuffix(and);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(" &= ");
    PredicateExpression _rhs = and.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied$");
    Integer _uniqueSuffix_3 = this.names.uniqueSuffix(and);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected Object _predicateExpression(final OrExpression or) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied$");
    Integer _uniqueSuffix = this.names.uniqueSuffix(or);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = false;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = or.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied$");
        Integer _uniqueSuffix_1 = this.names.uniqueSuffix(or);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(" |= ");
        PredicateExpression _lhs_1 = or.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied$");
    Integer _uniqueSuffix_2 = this.names.uniqueSuffix(or);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(" |= ");
    PredicateExpression _rhs = or.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied$");
    Integer _uniqueSuffix_3 = this.names.uniqueSuffix(or);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected Object _predicateExpression(final ImpliesExpression implies) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean satisfied$");
    Integer _uniqueSuffix = this.names.uniqueSuffix(implies);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = false;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = implies.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied$");
        Integer _uniqueSuffix_1 = this.names.uniqueSuffix(implies);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(" |= ");
        PredicateExpression _lhs_1 = implies.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied$");
    Integer _uniqueSuffix_2 = this.names.uniqueSuffix(implies);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(" |= !");
    PredicateExpression _rhs = implies.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied$");
    Integer _uniqueSuffix_3 = this.names.uniqueSuffix(implies);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
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
  
  protected CharSequence _predicateCall(final PropertyRelationPredicate relation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicates$.");
    PropertyRelation _relation = relation.getRelation();
    String _name = _relation.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append("(");
    PropertyExpression _lhs = relation.getLhs();
    String _propertyExpression = this.propertyExpression(_lhs);
    _builder.append(_propertyExpression, "");
    _builder.append(", ");
    PropertyExpression _rhs = relation.getRhs();
    String _propertyExpression_1 = this.propertyExpression(_rhs);
    _builder.append(_propertyExpression_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String _propertyExpression(final PropertyValueExpression expression) {
    return expression.getValue();
  }
  
  protected String _propertyExpression(final PropertyReferenceExpression expression) {
    NodeDefinition _node = expression.getNode();
    String _uniqueName = this.names.uniqueName(_node);
    String _plus = (_uniqueName + ".getProperty(");
    String _plus_1 = (_plus + "\"");
    String _property = expression.getProperty();
    String _plus_2 = (_plus_1 + _property);
    String _plus_3 = (_plus_2 + "\"");
    return (_plus_3 + ")");
  }
  
  protected CharSequence _predicateCall(final DefinitionSentencePredicate definition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    final DefinitionSentence sentence = definition.getSentence();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileDefinition = this.compileDefinition(sentence, true);
    _builder.append(_compileDefinition, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition = _target.getDefinition();
    RelationQualifier _qualifier = sentence.getQualifier();
    String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition, _qualifier);
    _builder.append(_qualifierSatisfiedStatement, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _predicateCall(final PredicateXExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate$");
    int _hashCode = expression.hashCode();
    _builder.append(_hashCode, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _predicateCall(final PredicateReference reference) {
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
  
  public String argumentList(final ArgumentList list) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(list, null));
    if (_notEquals) {
      EList<Argument> _arguments = list.getArguments();
      final Function1<Argument, CharSequence> _function = (Argument argument) -> {
        NodeDefinition _node = argument.getNode();
        return this.names.uniqueName(_node);
      };
      _xifexpression = IterableExtensions.<Argument>join(_arguments, ", ", _function);
    }
    return _xifexpression;
  }
  
  public void infer(final EObject validator, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (validator instanceof Validator) {
      _infer((Validator)validator, acceptor, isPreIndexingPhase);
      return;
    } else if (validator != null) {
      _infer(validator, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(validator, acceptor, isPreIndexingPhase).toString());
    }
  }
  
  public Object predicateExpression(final EObject and) {
    if (and instanceof AndExpression) {
      return _predicateExpression((AndExpression)and);
    } else if (and instanceof ImpliesExpression) {
      return _predicateExpression((ImpliesExpression)and);
    } else if (and instanceof OrExpression) {
      return _predicateExpression((OrExpression)and);
    } else if (and instanceof PredicateReference) {
      return _predicateExpression((PredicateReference)and);
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
    } else if (definition instanceof PredicateXExpression) {
      return _predicateCall((PredicateXExpression)definition);
    } else if (definition instanceof PropertyRelationPredicate) {
      return _predicateCall((PropertyRelationPredicate)definition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(definition).toString());
    }
  }
  
  public String propertyExpression(final PropertyExpression expression) {
    if (expression instanceof PropertyReferenceExpression) {
      return _propertyExpression((PropertyReferenceExpression)expression);
    } else if (expression instanceof PropertyValueExpression) {
      return _propertyExpression((PropertyValueExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
