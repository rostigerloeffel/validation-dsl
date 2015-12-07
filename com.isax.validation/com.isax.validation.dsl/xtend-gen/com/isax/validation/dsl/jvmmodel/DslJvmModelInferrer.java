package com.isax.validation.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.isax.validation.dsl.api.AbstractValidator;
import com.isax.validation.dsl.api.NodePredicates;
import com.isax.validation.dsl.api.Resolvable;
import com.isax.validation.dsl.api.ResolvingNode;
import com.isax.validation.dsl.api.ResolvingNodeSet;
import com.isax.validation.dsl.api.Traverser;
import com.isax.validation.dsl.dsl.AndExpression;
import com.isax.validation.dsl.dsl.Argument;
import com.isax.validation.dsl.dsl.ArgumentList;
import com.isax.validation.dsl.dsl.AtLeast;
import com.isax.validation.dsl.dsl.AtMost;
import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.CanHave;
import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DefinitionSentencePredicate;
import com.isax.validation.dsl.dsl.ImpliesExpression;
import com.isax.validation.dsl.dsl.Multiple;
import com.isax.validation.dsl.dsl.MustHave;
import com.isax.validation.dsl.dsl.MustNotHave;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.NodeReferenceList;
import com.isax.validation.dsl.dsl.One;
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
import com.isax.validation.dsl.dsl.RelationAxis;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.RelationQuantifier;
import com.isax.validation.dsl.dsl.Selector;
import com.isax.validation.dsl.dsl.SelectorList;
import com.isax.validation.dsl.dsl.SelectorListDef;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import com.isax.validation.dsl.jvmmodel.NameProvider;
import com.isax.validation.dsl.util.DslUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
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
  private final static String TRAVERSER_FIELD = "traverser$";
  
  private final static String PREDICATES_FIELD = "predicates$";
  
  private final static String ASSIGNMENT_CLASS = "Assignment$";
  
  private final static String ASSIGMENT_METHOD = "method";
  
  private final static String PREDICATE_METHOD = "predicate$";
  
  private final static String SATISFIED = "satisfied$";
  
  private final static String INPUT_NODE = "node$";
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private ISerializer serializer;
  
  @Inject
  @Extension
  private NameProvider names = new NameProvider();
  
  protected void _infer(final Validator validator, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = validator.getName();
    JvmGenericType _class = this._jvmTypesBuilder.toClass(validator, _name);
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(AbstractValidator.class);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      EList<JvmMember> _members = it.getMembers();
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(Traverser.class);
      final Procedure1<JvmField> _function_1 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
      };
      JvmField _field = this._jvmTypesBuilder.toField(validator, DslJvmModelInferrer.TRAVERSER_FIELD, _typeRef_1, _function_1);
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = it.getMembers();
      JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(NodePredicates.class);
      final Procedure1<JvmField> _function_2 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
      };
      JvmField _field_1 = this._jvmTypesBuilder.toField(validator, DslJvmModelInferrer.PREDICATES_FIELD, _typeRef_2, _function_2);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
      EList<JvmMember> _members_2 = it.getMembers();
      JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(boolean.class);
      final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        it_1.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmFormalParameter> _parameters = it_1.getParameters();
        JvmTypeReference _typeRef_4 = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(validator, DslJvmModelInferrer.INPUT_NODE, _typeRef_4);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append(ResolvingNodeSet.class, "");
            _builder.append(" nodeSetImportDummy$;");
            _builder.newLineIfNotEmpty();
            _builder.append(ResolvingNode.class, "");
            _builder.append(" nodeImportDummy$;");
            _builder.newLineIfNotEmpty();
            StartOnSentence _startOn = validator.getStartOn();
            CharSequence _compileStartOn = DslJvmModelInferrer.this.compileStartOn(_startOn);
            _builder.append(_compileStartOn, "");
            _builder.newLineIfNotEmpty();
            BodySentences _body = validator.getBody();
            CharSequence _compileBody = DslJvmModelInferrer.this.compileBody(_body);
            _builder.append(_compileBody, "");
            _builder.newLineIfNotEmpty();
            _builder.append("return true;");
            _builder.newLine();
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(validator, "validate", _typeRef_3, _function_3);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
      EList<JvmMember> _members_3 = it.getMembers();
      EList<PredicateDefinitionSentence> _predicates = validator.getPredicates();
      List<JvmOperation> _compilePredicates = this.compilePredicates(_predicates);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_3, _compilePredicates);
      EList<JvmMember> _members_4 = it.getMembers();
      Iterable<JvmOperation> _compileXExpressionPredicates = this.compileXExpressionPredicates(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_4, _compileXExpressionPredicates);
      EList<JvmMember> _members_5 = it.getMembers();
      Iterable<JvmGenericType> _compileThenClauses = this.compileThenClauses(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_5, _compileThenClauses);
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
  
  public CharSequence compileStartOn(final StartOnSentence startOn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(startOn);
    _builder.append(_serialize, "");
    _builder.newLineIfNotEmpty();
    _builder.append("final ");
    String _simpleName = ResolvingNode.class.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append(" ");
    NodeDefinition _definition = startOn.getDefinition();
    String _uniqueName = this.names.uniqueName(_definition);
    _builder.append(_uniqueName, "");
    _builder.append(" = ");
    _builder.append(DslJvmModelInferrer.INPUT_NODE, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("if (");
    NodeDefinition _definition_1 = startOn.getDefinition();
    String _uniqueName_1 = this.names.uniqueName(_definition_1);
    _builder.append(_uniqueName_1, "");
    _builder.append(" == null || !");
    _builder.append(DslJvmModelInferrer.PREDICATES_FIELD, "");
    _builder.append(".hasType(");
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
  
  public CharSequence compileBody(final BodySentences body) {
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
            CharSequence _compileDefinition = this.compileDefinition(definition);
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
  
  public CharSequence compileDefinition(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(sentence);
    _builder.append(_serialize, "");
    _builder.newLineIfNotEmpty();
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
        _builder.append("boolean ");
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
        String _uniqueSuffix = this.names.uniqueSuffix(sentence);
        _builder.append(_uniqueSuffix, "\t");
        _builder.append(" = ");
        TargetDefinition _target = sentence.getTarget();
        NodeDefinition _definition = _target.getDefinition();
        RelationQualifier _qualifier = sentence.getQualifier();
        RelationQuantifier _quantifier = sentence.getQuantifier();
        String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition, _qualifier, _quantifier);
        _builder.append(_qualifierSatisfiedStatement, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (!");
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
        String _uniqueSuffix_1 = this.names.uniqueSuffix(sentence);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(") return ");
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
        String _uniqueSuffix_2 = this.names.uniqueSuffix(sentence);
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
    _builder.append("\t");
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = ");
    QuantificationList _quantifications = sentence.getQuantifications();
    EList<Quantification> _quantifications_1 = null;
    if (_quantifications!=null) {
      _quantifications_1=_quantifications.getQuantifications();
    }
    CharSequence _constraintDispatch = this.constraintDispatch(_quantifications_1, 0, sentence);
    _builder.append(_constraintDispatch, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if (!");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_1 = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix_1, "\t");
    _builder.append(") return false;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public List<JvmOperation> compilePredicates(final List<PredicateDefinitionSentence> sentences) {
    final Function1<PredicateDefinitionSentence, JvmOperation> _function = (PredicateDefinitionSentence s) -> {
      String _name = s.getName();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(boolean.class);
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
            NodeDefinition _node_1 = p.getNode();
            Class<? extends Resolvable> _definitionType = this.definitionType(_node_1);
            JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(_definitionType);
            return this._jvmTypesBuilder.toParameter(p, _uniqueName, _typeRef_1);
          };
          _map=ListExtensions.<Parameter, JvmFormalParameter>map(_parameters_2, _function_2);
        }
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _map);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            BodySentences _body = s.getBody();
            CharSequence _compileBody = DslJvmModelInferrer.this.compileBody(_body);
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
  
  public Iterable<JvmOperation> compileXExpressionPredicates(final Validator validator) {
    TreeIterator<EObject> _eAllContents = validator.eAllContents();
    Set<EObject> _set = IteratorExtensions.<EObject>toSet(_eAllContents);
    Iterable<PredicateXExpression> _filter = Iterables.<PredicateXExpression>filter(_set, PredicateXExpression.class);
    final Function1<PredicateXExpression, JvmOperation> _function = (PredicateXExpression e) -> {
      int _hashCode = e.hashCode();
      String _plus = (DslJvmModelInferrer.PREDICATE_METHOD + Integer.valueOf(_hashCode));
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(boolean.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        XExpression _expression = e.getExpression();
        this._jvmTypesBuilder.setBody(it, _expression);
      };
      return this._jvmTypesBuilder.toMethod(e, _plus, _typeRef, _function_1);
    };
    return IterableExtensions.<PredicateXExpression, JvmOperation>map(_filter, _function);
  }
  
  public Iterable<JvmGenericType> compileThenClauses(final Validator validator) {
    TreeIterator<EObject> _eAllContents = validator.eAllContents();
    Set<EObject> _set = IteratorExtensions.<EObject>toSet(_eAllContents);
    Iterable<TargetDefinition> _filter = Iterables.<TargetDefinition>filter(_set, TargetDefinition.class);
    final Function1<TargetDefinition, XExpression> _function = (TargetDefinition d) -> {
      return d.getThen();
    };
    Iterable<XExpression> _map = IterableExtensions.<TargetDefinition, XExpression>map(_filter, _function);
    Iterable<XExpression> _filterNull = IterableExtensions.<XExpression>filterNull(_map);
    final Function1<XExpression, JvmGenericType> _function_1 = (XExpression e) -> {
      int _hashCode = e.hashCode();
      String _plus = (DslJvmModelInferrer.ASSIGNMENT_CLASS + Integer.valueOf(_hashCode));
      final Procedure1<JvmGenericType> _function_2 = (JvmGenericType it) -> {
        it.setStatic(true);
        it.setVisibility(JvmVisibility.PRIVATE);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _inferredType = this._jvmTypesBuilder.inferredType(e);
        final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
          it_1.setStatic(true);
          it_1.setVisibility(JvmVisibility.PRIVATE);
          final Function1<NodeDefinition, Boolean> _function_4 = (NodeDefinition it_2) -> {
            return Boolean.valueOf(true);
          };
          final IScope scope = DslUtil.visibleDefinitions(e, _function_4);
          EList<JvmFormalParameter> _parameters = it_1.getParameters();
          Iterable<IEObjectDescription> _allElements = scope.getAllElements();
          final Function1<IEObjectDescription, EObject> _function_5 = (IEObjectDescription d) -> {
            return d.getEObjectOrProxy();
          };
          Iterable<EObject> _map_1 = IterableExtensions.<IEObjectDescription, EObject>map(_allElements, _function_5);
          Iterable<NodeDefinition> _filter_1 = Iterables.<NodeDefinition>filter(_map_1, NodeDefinition.class);
          final Function1<NodeDefinition, JvmFormalParameter> _function_6 = (NodeDefinition d) -> {
            String _name = d.getName();
            Class<? extends Resolvable> _definitionType = this.definitionType(d);
            JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_definitionType);
            return this._jvmTypesBuilder.toParameter(d, _name, _typeRef);
          };
          Iterable<JvmFormalParameter> _map_2 = IterableExtensions.<NodeDefinition, JvmFormalParameter>map(_filter_1, _function_6);
          this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _map_2);
          this._jvmTypesBuilder.setBody(it_1, e);
        };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(e, DslJvmModelInferrer.ASSIGMENT_METHOD, _inferredType, _function_3);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      };
      return this._jvmTypesBuilder.toClass(e, _plus, _function_2);
    };
    return IterableExtensions.<XExpression, JvmGenericType>map(_filterNull, _function_1);
  }
  
  public CharSequence constraintDispatch(final List<Quantification> quantifications, final int index, final ConstraintSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(quantifications, null));
      if (!_notEquals) {
        _and = false;
      } else {
        int _size = quantifications.size();
        boolean _lessThan = (index < _size);
        _and = _lessThan;
      }
      if (_and) {
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
        CharSequence _predicateExpression = this.predicateExpression(_predicate);
        _builder.append(_predicateExpression, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public void map(final NodeReferenceList nodes, final String suffix) {
    EList<NodeDefinition> _nodes = nodes.getNodes();
    for (final NodeDefinition definition : _nodes) {
      String _name = definition.getName();
      String _plus = (_name + "$");
      String _plus_1 = (_plus + suffix);
      this.names.map(definition, _plus_1);
    }
  }
  
  public void unmap(final NodeReferenceList nodes) {
    EList<NodeDefinition> _nodes = nodes.getNodes();
    for (final NodeDefinition definition : _nodes) {
      this.names.unmap(definition);
    }
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
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
    Quantification _get_2 = quantifications.get(index);
    NodeDefinition _node_1 = _get_2.getNode();
    String _uniqueSuffix = this.names.uniqueSuffix(_node_1);
    _builder.append(_uniqueSuffix, "\t\t");
    _builder.append(" = ");
    CharSequence _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (!");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
    Quantification _get_3 = quantifications.get(index);
    NodeDefinition _node_2 = _get_3.getNode();
    String _uniqueSuffix_1 = this.names.uniqueSuffix(_node_2);
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
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
    Quantification _get_2 = quantifications.get(index);
    NodeDefinition _node_1 = _get_2.getNode();
    String _uniqueSuffix = this.names.uniqueSuffix(_node_1);
    _builder.append(_uniqueSuffix, "\t\t");
    _builder.append(" = ");
    CharSequence _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
    Quantification _get_3 = quantifications.get(index);
    NodeDefinition _node_2 = _get_3.getNode();
    String _uniqueSuffix_1 = this.names.uniqueSuffix(_node_2);
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
    final TargetDefinition target = sentence.getTarget();
    _builder.newLineIfNotEmpty();
    _builder.append("final ");
    NodeDefinition _definition = target.getDefinition();
    Class<? extends Resolvable> _definitionType = this.definitionType(_definition);
    String _simpleName = _definitionType.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append(" ");
    NodeDefinition _definition_1 = target.getDefinition();
    String _uniqueName = this.names.uniqueName(_definition_1);
    _builder.append(_uniqueName, "");
    _builder.append(" = ");
    NodeDefinition _definition_2 = target.getDefinition();
    NodeDefinition _local = target.getLocal();
    RelationAxis _axis = sentence.getAxis();
    RelationQuantifier _quantifier = sentence.getQuantifier();
    NodeDefinition _node = sentence.getNode();
    NodeDefinition _definition_3 = target.getDefinition();
    SelectorList _selectors = _definition_3.getSelectors();
    BodySentences _body = target.getBody();
    CharSequence _nodeAssignmentStatement = this.nodeAssignmentStatement(_definition_2, _local, _axis, _quantifier, _node, _selectors, _body, target);
    _builder.append(_nodeAssignmentStatement, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence quantifiedDefinition(final DefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix = this.names.uniqueSuffix(sentence);
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
    final TargetDefinition target = sentence.getTarget();
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("final ");
    NodeDefinition _definition = target.getDefinition();
    Class<? extends Resolvable> _definitionType = this.definitionType(_definition);
    String _simpleName_1 = _definitionType.getSimpleName();
    _builder.append(_simpleName_1, "\t\t");
    _builder.append(" ");
    NodeDefinition _definition_1 = target.getDefinition();
    String _uniqueName_2 = this.names.uniqueName(_definition_1);
    _builder.append(_uniqueName_2, "\t\t");
    _builder.append(" = ");
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition_2 = _target.getDefinition();
    TargetDefinition _target_1 = sentence.getTarget();
    NodeDefinition _local = _target_1.getLocal();
    RelationAxis _axis = sentence.getAxis();
    RelationQuantifier _quantifier = sentence.getQuantifier();
    Quantification _quantification_2 = sentence.getQuantification();
    NodeDefinition _node_1 = _quantification_2.getNode();
    TargetDefinition _target_2 = sentence.getTarget();
    NodeDefinition _definition_3 = _target_2.getDefinition();
    SelectorList _selectors = _definition_3.getSelectors();
    TargetDefinition _target_3 = sentence.getTarget();
    BodySentences _body = _target_3.getBody();
    TargetDefinition _target_4 = sentence.getTarget();
    CharSequence _nodeAssignmentStatement = this.nodeAssignmentStatement(_definition_2, _local, _axis, _quantifier, _node_1, _selectors, _body, _target_4);
    _builder.append(_nodeAssignmentStatement, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
    String _uniqueSuffix_1 = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix_1, "\t\t");
    _builder.append(" ");
    Quantification _quantification_3 = sentence.getQuantification();
    Quantor _quantor = _quantification_3.getQuantor();
    String _quantorSatisfactionRelation = this.quantorSatisfactionRelation(_quantor);
    _builder.append(_quantorSatisfactionRelation, "\t\t");
    _builder.append(" ");
    TargetDefinition _target_5 = sentence.getTarget();
    NodeDefinition _definition_4 = _target_5.getDefinition();
    RelationQualifier _qualifier_1 = sentence.getQualifier();
    RelationQuantifier _quantifier_1 = sentence.getQuantifier();
    String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition_4, _qualifier_1, _quantifier_1);
    _builder.append(_qualifierSatisfiedStatement, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_2 = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(") return ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_3 = this.names.uniqueSuffix(sentence);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence nodeAssignmentStatement(final NodeDefinition assignee, final NodeDefinition local, final RelationAxis axis, final RelationQuantifier quantifier, final NodeDefinition source, final SelectorList types, final BodySentences body, final TargetDefinition target) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(local, null));
    if (_notEquals) {
      _xifexpression = this.names.uniqueName(local);
    } else {
      String _uniqueSuffix = this.names.uniqueSuffix(assignee);
      _xifexpression = (DslJvmModelInferrer.INPUT_NODE + _uniqueSuffix);
    }
    final String localName = _xifexpression;
    _builder.newLineIfNotEmpty();
    _builder.append(DslJvmModelInferrer.TRAVERSER_FIELD, "");
    _builder.append(".");
    String _name = DslUtil.name(axis, quantifier);
    _builder.append(_name, "");
    _builder.append("(");
    String _uniqueName = this.names.uniqueName(source);
    _builder.append(_uniqueName, "");
    _builder.append(", ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("(");
    String _simpleName = ResolvingNode.class.getSimpleName();
    _builder.append(_simpleName, "\t");
    _builder.append(" ");
    _builder.append(localName, "\t");
    _builder.append(") -> {\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    Object _map = this.names.map(assignee, localName);
    _builder.append(_map, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
    String _uniqueSuffix_1 = this.names.uniqueSuffix(assignee);
    _builder.append(_uniqueSuffix_1, "\t\t");
    _builder.append(" = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_1 = (!Objects.equal(types, null));
      if (_notEquals_1) {
        _builder.append("\t\t");
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
        String _uniqueSuffix_2 = this.names.uniqueSuffix(assignee);
        _builder.append(_uniqueSuffix_2, "\t\t");
        _builder.append(" &= ");
        _builder.append(DslJvmModelInferrer.PREDICATES_FIELD, "\t\t");
        _builder.append(".hasType(");
        _builder.append(localName, "\t\t");
        _builder.append(", \"");
        SelectorListDef _selectors = types.getSelectors();
        EList<Selector> _selectors_1 = _selectors.getSelectors();
        final Function1<Selector, CharSequence> _function = (Selector s) -> {
          return s.getType();
        };
        String _join = IterableExtensions.<Selector>join(_selectors_1, "\", \"", _function);
        _builder.append(_join, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_2 = (!Objects.equal(body, null));
      if (_notEquals_2) {
        _builder.append("\t\t");
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
        String _uniqueSuffix_3 = this.names.uniqueSuffix(assignee);
        _builder.append(_uniqueSuffix_3, "\t\t");
        _builder.append(" &= eval(() -> {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        CharSequence _compileBody = this.compileBody(body);
        _builder.append(_compileBody, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("});");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("return ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t\t");
    String _uniqueSuffix_4 = this.names.uniqueSuffix(assignee);
    _builder.append(_uniqueSuffix_4, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    Object _unmap = this.names.unmap(assignee);
    _builder.append(_unmap, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}, ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("(");
    String _simpleName_1 = ResolvingNode.class.getSimpleName();
    _builder.append(_simpleName_1, "\t");
    _builder.append(" ");
    _builder.append(localName, "\t");
    _builder.append(") -> { ");
    _builder.newLineIfNotEmpty();
    {
      XExpression _then = null;
      if (target!=null) {
        _then=target.getThen();
      }
      boolean _notEquals_3 = (!Objects.equal(_then, null));
      if (_notEquals_3) {
        _builder.append("\t\t");
        _builder.append(DslJvmModelInferrer.ASSIGNMENT_CLASS, "\t\t");
        XExpression _then_1 = target.getThen();
        int _hashCode = _then_1.hashCode();
        _builder.append(_hashCode, "\t\t");
        _builder.append(".");
        _builder.append(DslJvmModelInferrer.ASSIGMENT_METHOD, "\t\t");
        _builder.append("(");
        String _parameterLineCall = this.parameterLineCall(target, localName);
        _builder.append(_parameterLineCall, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public Iterable<NodeDefinition> parameters(final TargetDefinition target) {
    final Function1<NodeDefinition, Boolean> _function = (NodeDefinition it) -> {
      return Boolean.valueOf(true);
    };
    IScope _visibleDefinitions = DslUtil.visibleDefinitions(target, _function);
    Iterable<IEObjectDescription> _allElements = _visibleDefinitions.getAllElements();
    final Function1<IEObjectDescription, EObject> _function_1 = (IEObjectDescription d) -> {
      return d.getEObjectOrProxy();
    };
    Iterable<EObject> _map = IterableExtensions.<IEObjectDescription, EObject>map(_allElements, _function_1);
    return Iterables.<NodeDefinition>filter(_map, NodeDefinition.class);
  }
  
  public String parameterLineCall(final TargetDefinition target, final String localName) {
    Iterable<NodeDefinition> _parameters = this.parameters(target);
    final Function1<NodeDefinition, String> _function = (NodeDefinition d) -> {
      String _xifexpression = null;
      boolean _and = false;
      NodeDefinition _local = target.getLocal();
      boolean _equals = Objects.equal(_local, null);
      if (!_equals) {
        _and = false;
      } else {
        NodeDefinition _definition = target.getDefinition();
        boolean _equals_1 = d.equals(_definition);
        _and = _equals_1;
      }
      if (_and) {
        _xifexpression = localName;
      } else {
        _xifexpression = this.names.uniqueName(d);
      }
      return _xifexpression;
    };
    Iterable<String> _map = IterableExtensions.<NodeDefinition, String>map(_parameters, _function);
    return IterableExtensions.join(_map, ", ");
  }
  
  public String qualifierSatisfiedStatement(final NodeDefinition node, final RelationQualifier qualifier, final RelationQuantifier quantifier) {
    boolean _matched = false;
    if (!_matched) {
      if (qualifier instanceof CanHave) {
        _matched=true;
        return "true";
      }
    }
    if (!_matched) {
      if (qualifier instanceof MustHave) {
        _matched=true;
        String _uniqueName = this.names.uniqueName(node);
        String _plus = (_uniqueName + ".size() ");
        String _switchResult_1 = null;
        boolean _matched_1 = false;
        if (!_matched_1) {
          if (quantifier instanceof One) {
            _matched_1=true;
            _switchResult_1 = "== 1";
          }
        }
        if (!_matched_1) {
          if (quantifier instanceof Multiple) {
            _matched_1=true;
            _switchResult_1 = "> 0";
          }
        }
        if (!_matched_1) {
          if (quantifier instanceof AtLeast) {
            _matched_1=true;
            int _quantity = ((AtLeast)quantifier).getQuantity();
            _switchResult_1 = (">= " + Integer.valueOf(_quantity));
          }
        }
        if (!_matched_1) {
          if (quantifier instanceof AtMost) {
            _matched_1=true;
            int _quantity = ((AtMost)quantifier).getQuantity();
            _switchResult_1 = ("<= " + Integer.valueOf(_quantity));
          }
        }
        if (!_matched_1) {
          _switchResult_1 = ">= 1";
        }
        return (_plus + _switchResult_1);
      }
    }
    if (!_matched) {
      if (qualifier instanceof MustNotHave) {
        _matched=true;
        return ".size() == 0";
      }
    }
    return null;
  }
  
  public String initialQualifierSatisfaction(final RelationQualifier qualifier) {
    boolean _matched = false;
    if (!_matched) {
      if (qualifier instanceof CanHave) {
        _matched=true;
        return "true";
      }
    }
    if (!_matched) {
      if (qualifier instanceof MustHave) {
        _matched=true;
        return "true";
      }
    }
    if (!_matched) {
      if (qualifier instanceof MustNotHave) {
        _matched=true;
        return "false";
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
  
  protected CharSequence _predicateExpression(final PredicateExpression expression) {
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
  
  protected CharSequence _predicateExpression(final AndExpression and) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix = this.names.uniqueSuffix(and);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = true;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = and.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
        String _uniqueSuffix_1 = this.names.uniqueSuffix(and);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(" &= ");
        PredicateExpression _lhs_1 = and.getLhs();
        CharSequence _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_2 = this.names.uniqueSuffix(and);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(" &= ");
    PredicateExpression _rhs = and.getRhs();
    CharSequence _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_3 = this.names.uniqueSuffix(and);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _predicateExpression(final OrExpression or) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix = this.names.uniqueSuffix(or);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = false;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = or.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
        String _uniqueSuffix_1 = this.names.uniqueSuffix(or);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(" |= ");
        PredicateExpression _lhs_1 = or.getLhs();
        CharSequence _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_2 = this.names.uniqueSuffix(or);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(" |= ");
    PredicateExpression _rhs = or.getRhs();
    CharSequence _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_3 = this.names.uniqueSuffix(or);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _predicateExpression(final ImpliesExpression implies) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix = this.names.uniqueSuffix(implies);
    _builder.append(_uniqueSuffix, "\t");
    _builder.append(" = false;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = implies.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
        String _uniqueSuffix_1 = this.names.uniqueSuffix(implies);
        _builder.append(_uniqueSuffix_1, "\t");
        _builder.append(" |= ");
        PredicateExpression _lhs_1 = implies.getLhs();
        CharSequence _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_2 = this.names.uniqueSuffix(implies);
    _builder.append(_uniqueSuffix_2, "\t");
    _builder.append(" |= !");
    PredicateExpression _rhs = implies.getRhs();
    CharSequence _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(DslJvmModelInferrer.SATISFIED, "\t");
    String _uniqueSuffix_3 = this.names.uniqueSuffix(implies);
    _builder.append(_uniqueSuffix_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _predicateExpression(final PredicateReference reference) {
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
  
  protected CharSequence _propertyExpression(final PropertyValueExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = expression.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _propertyExpression(final PropertyReferenceExpression expression) {
    NodeDefinition _node = expression.getNode();
    String _uniqueName = this.names.uniqueName(_node);
    String _plus = ("(String) " + _uniqueName);
    String _plus_1 = (_plus + ".getProperty(\"");
    String _property = expression.getProperty();
    String _plus_2 = (_plus_1 + _property);
    return (_plus_2 + "\")");
  }
  
  protected CharSequence _predicateCall(final PropertyRelationPredicate relation) {
    PropertyRelation _relation = relation.getRelation();
    String _name = _relation.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    String _plus = ((DslJvmModelInferrer.PREDICATES_FIELD + ".") + _firstLower);
    String _plus_1 = (_plus + "(");
    PropertyExpression _lhs = relation.getLhs();
    CharSequence _propertyExpression = this.propertyExpression(_lhs);
    String _plus_2 = (_plus_1 + _propertyExpression);
    String _plus_3 = (_plus_2 + ", ");
    PropertyExpression _rhs = relation.getRhs();
    CharSequence _propertyExpression_1 = this.propertyExpression(_rhs);
    String _plus_4 = (_plus_3 + _propertyExpression_1);
    return (_plus_4 + ");");
  }
  
  protected CharSequence _predicateCall(final DefinitionSentencePredicate definition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval(() -> {");
    _builder.newLine();
    _builder.append("\t");
    final DefinitionSentence sentence = definition.getSentence();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _compileDefinition = this.compileDefinition(sentence);
    _builder.append(_compileDefinition, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    TargetDefinition _target = sentence.getTarget();
    NodeDefinition _definition = _target.getDefinition();
    RelationQualifier _qualifier = sentence.getQualifier();
    RelationQuantifier _quantifier = sentence.getQuantifier();
    String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition, _qualifier, _quantifier);
    _builder.append(_qualifierSatisfiedStatement, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _predicateCall(final PredicateXExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(DslJvmModelInferrer.PREDICATE_METHOD, "");
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
  
  public Class<? extends Resolvable> definitionType(final NodeDefinition definition) {
    Class<? extends Resolvable> _xifexpression = null;
    boolean _isCollection = definition.isCollection();
    if (_isCollection) {
      _xifexpression = ResolvingNodeSet.class;
    } else {
      _xifexpression = ResolvingNode.class;
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
  
  public CharSequence predicateExpression(final EObject and) {
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
  
  public CharSequence propertyExpression(final PropertyExpression expression) {
    if (expression instanceof PropertyReferenceExpression) {
      return _propertyExpression((PropertyReferenceExpression)expression);
    } else if (expression instanceof PropertyValueExpression) {
      return _propertyExpression((PropertyValueExpression)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
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
}
