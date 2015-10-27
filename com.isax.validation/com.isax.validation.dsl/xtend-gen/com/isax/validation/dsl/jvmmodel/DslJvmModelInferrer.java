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
import com.isax.validation.dsl.dsl.Sentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.dsl.Validator;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
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
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class DslJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private ISerializer serializer;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  protected void _infer(final Validator validator, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    JvmGenericType _class = this._jvmTypesBuilder.toClass(validator, "de.dbsystem.avb.Test");
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(AbstractValidator.class);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      EList<JvmMember> _members = it.getMembers();
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(Traverser.class);
      final Procedure1<JvmField> _function_1 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
      };
      JvmField _field = this._jvmTypesBuilder.toField(validator, "traverser$", _typeRef_1, _function_1);
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = it.getMembers();
      JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(NodePredicates.class);
      final Procedure1<JvmField> _function_2 = (JvmField it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
      };
      JvmField _field_1 = this._jvmTypesBuilder.toField(validator, "predicates$", _typeRef_2, _function_2);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
      EList<JvmMember> _members_2 = it.getMembers();
      Iterable<JvmField> _compileStartOnDefinition = this.compileStartOnDefinition(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_2, _compileStartOnDefinition);
      EList<JvmMember> _members_3 = it.getMembers();
      Iterable<JvmField> _compileNodeDefinitions = this.compileNodeDefinitions(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_3, _compileNodeDefinitions);
      EList<JvmMember> _members_4 = it.getMembers();
      JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef("boolean");
      final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
        EList<JvmAnnotationReference> _annotations = it_1.getAnnotations();
        JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
        this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
        it_1.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmFormalParameter> _parameters = it_1.getParameters();
        JvmTypeReference _typeRef_4 = this._typeReferenceBuilder.typeRef("ResolvingNode");
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(validator, "node$", _typeRef_4);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            CharSequence _compileBody = DslJvmModelInferrer.this.compileBody(validator);
            _builder.append(_compileBody, "");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(validator, "validate", _typeRef_3, _function_3);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method);
      EList<JvmMember> _members_5 = it.getMembers();
      Iterable<JvmOperation> _compilePredicates = this.compilePredicates(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_5, _compilePredicates);
      EList<JvmMember> _members_6 = it.getMembers();
      Iterable<JvmOperation> _compileXExpressionPredicates = this.compileXExpressionPredicates(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_6, _compileXExpressionPredicates);
      EList<JvmMember> _members_7 = it.getMembers();
      Iterable<JvmOperation> _compileXExpressionAssignments = this.compileXExpressionAssignments(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_7, _compileXExpressionAssignments);
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
  
  public CharSequence compileBody(final Validator validator) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Sentence> _sentences = validator.getSentences();
      for(final Sentence sentence : _sentences) {
        {
          if ((sentence instanceof StartOnSentence)) {
            CharSequence _sentenceStatements = this.sentenceStatements(sentence);
            _builder.append(_sentenceStatements, "");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    {
      EList<Sentence> _sentences_1 = validator.getSentences();
      for(final Sentence sentence_1 : _sentences_1) {
        {
          if ((sentence_1 instanceof DefinitionSentence)) {
            CharSequence _sentenceStatements_1 = this.sentenceStatements(sentence_1);
            _builder.append(_sentenceStatements_1, "");
            _builder.newLineIfNotEmpty();
            {
              Quantification _quantification = ((DefinitionSentence)sentence_1).getQuantification();
              boolean _equals = Objects.equal(_quantification, null);
              if (_equals) {
                _builder.append("{");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("boolean satisfied$");
                int _hashCode = ((DefinitionSentence)sentence_1).hashCode();
                _builder.append(_hashCode, "\t");
                _builder.append(" = ");
                TargetDefinition _target = ((DefinitionSentence)sentence_1).getTarget();
                NodeDefinition _definition = _target.getDefinition();
                RelationQualifier _qualifier = ((DefinitionSentence)sentence_1).getQualifier();
                String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition, _qualifier);
                _builder.append(_qualifierSatisfiedStatement, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if (!satisfied$");
                int _hashCode_1 = ((DefinitionSentence)sentence_1).hashCode();
                _builder.append(_hashCode_1, "\t");
                _builder.append(") return satisfied$");
                int _hashCode_2 = ((DefinitionSentence)sentence_1).hashCode();
                _builder.append(_hashCode_2, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      EList<Sentence> _sentences_2 = validator.getSentences();
      for(final Sentence sentence_2 : _sentences_2) {
        {
          if ((sentence_2 instanceof ConstraintSentence)) {
            CharSequence _sentenceStatements_2 = this.sentenceStatements(sentence_2);
            _builder.append(_sentenceStatements_2, "");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("return true;");
    _builder.newLine();
    return _builder;
  }
  
  public Iterable<JvmField> compileStartOnDefinition(final Validator validator) {
    EList<Sentence> _sentences = validator.getSentences();
    Iterable<StartOnSentence> _filter = Iterables.<StartOnSentence>filter(_sentences, StartOnSentence.class);
    final Function1<StartOnSentence, JvmField> _function = (StartOnSentence it) -> {
      NodeDefinition _definition = it.getDefinition();
      String _name = _definition.getName();
      JvmTypeReference _xifexpression = null;
      NodeDefinition _definition_1 = it.getDefinition();
      boolean _isCollection = _definition_1.isCollection();
      if (_isCollection) {
        _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNodeSet.class);
      } else {
        _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
      }
      return this._jvmTypesBuilder.toField(it, _name, _xifexpression);
    };
    return IterableExtensions.<StartOnSentence, JvmField>map(_filter, _function);
  }
  
  public Iterable<JvmField> compileNodeDefinitions(final Validator validator) {
    EList<Sentence> _sentences = validator.getSentences();
    Iterable<DefinitionSentence> _filter = Iterables.<DefinitionSentence>filter(_sentences, DefinitionSentence.class);
    final Function1<DefinitionSentence, JvmField> _function = (DefinitionSentence it) -> {
      TargetDefinition _target = it.getTarget();
      NodeDefinition _definition = _target.getDefinition();
      String _name = _definition.getName();
      JvmTypeReference _xifexpression = null;
      TargetDefinition _target_1 = it.getTarget();
      NodeDefinition _definition_1 = _target_1.getDefinition();
      boolean _isCollection = _definition_1.isCollection();
      if (_isCollection) {
        _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNodeSet.class);
      } else {
        _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
      }
      return this._jvmTypesBuilder.toField(it, _name, _xifexpression);
    };
    return IterableExtensions.<DefinitionSentence, JvmField>map(_filter, _function);
  }
  
  public Iterable<JvmOperation> compilePredicates(final Validator validator) {
    EList<Sentence> _sentences = validator.getSentences();
    Iterable<PredicateDefinitionSentence> _filter = Iterables.<PredicateDefinitionSentence>filter(_sentences, PredicateDefinitionSentence.class);
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
        final Function1<Parameter, JvmFormalParameter> _function_2 = (Parameter p) -> {
          NodeDefinition _node = p.getNode();
          String _name_1 = _node.getName();
          JvmTypeReference _xifexpression = null;
          NodeDefinition _node_1 = p.getNode();
          boolean _isCollection = _node_1.isCollection();
          if (_isCollection) {
            _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNodeSet.class);
          } else {
            _xifexpression = this._typeReferenceBuilder.typeRef(ResolvingNode.class);
          }
          return this._jvmTypesBuilder.toParameter(p, _name_1, _xifexpression);
        };
        List<JvmFormalParameter> _map = ListExtensions.<Parameter, JvmFormalParameter>map(_parameters_2, _function_2);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _map);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            PredicateExpression _predicate = s.getPredicate();
            Object _predicateExpression = DslJvmModelInferrer.this.predicateExpression(_predicate);
            _builder.append(_predicateExpression, "");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(s, _name, _typeRef, _function_1);
    };
    return IterableExtensions.<PredicateDefinitionSentence, JvmOperation>map(_filter, _function);
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
  
  protected CharSequence _sentenceStatements(final StartOnSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(sentence);
    _builder.append(_serialize, "");
    _builder.newLineIfNotEmpty();
    NodeDefinition _definition = sentence.getDefinition();
    String _name = _definition.getName();
    _builder.append(_name, "");
    _builder.append(" = node$;");
    _builder.newLineIfNotEmpty();
    _builder.append("if (");
    NodeDefinition _definition_1 = sentence.getDefinition();
    String _name_1 = _definition_1.getName();
    _builder.append(_name_1, "");
    _builder.append(" == null || !predicates$.hasType(");
    NodeDefinition _definition_2 = sentence.getDefinition();
    String _name_2 = _definition_2.getName();
    _builder.append(_name_2, "");
    _builder.append(", \"");
    NodeDefinition _definition_3 = sentence.getDefinition();
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
  
  protected CharSequence _sentenceStatements(final DefinitionSentence sentence) {
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
        int _hashCode = sentence.hashCode();
        _builder.append(_hashCode, "\t");
        _builder.append(" = ");
        QuantificationList _quantifications_1 = sentence.getQuantifications();
        EList<Quantification> _quantifications_2 = _quantifications_1.getQuantifications();
        CharSequence _constraintDispatch = this.constraintDispatch(_quantifications_2, 0, sentence);
        _builder.append(_constraintDispatch, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (!satisfied$");
        int _hashCode_1 = sentence.hashCode();
        _builder.append(_hashCode_1, "\t");
        _builder.append(") return false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
    _builder.append("for (ResolvingNode ");
    Quantification _get = quantifications.get(index);
    NodeDefinition _node = _get.getNode();
    String _name = _node.getName();
    _builder.append(_name, "\t");
    _builder.append(" : ");
    Quantification _get_1 = quantifications.get(index);
    NodeDefinition _nodeSet = _get_1.getNodeSet();
    String _name_1 = _nodeSet.getName();
    _builder.append(_name_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("boolean satisfied$");
    Quantification _get_2 = quantifications.get(index);
    NodeDefinition _node_1 = _get_2.getNode();
    String _name_2 = _node_1.getName();
    int _hashCode = _name_2.hashCode();
    _builder.append(_hashCode, "\t\t");
    _builder.append(" = ");
    Object _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (!satisfied$");
    Quantification _get_3 = quantifications.get(index);
    NodeDefinition _node_2 = _get_3.getNode();
    String _name_3 = _node_2.getName();
    int _hashCode_1 = _name_3.hashCode();
    _builder.append(_hashCode_1, "\t\t");
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
    _builder.append("for (ResolvingNode ");
    Quantification _get = quantifications.get(index);
    NodeDefinition _node = _get.getNode();
    String _name = _node.getName();
    _builder.append(_name, "\t");
    _builder.append(" : ");
    Quantification _get_1 = quantifications.get(index);
    NodeDefinition _nodeSet = _get_1.getNodeSet();
    String _name_1 = _nodeSet.getName();
    _builder.append(_name_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("boolean satisfied$");
    Quantification _get_2 = quantifications.get(index);
    NodeDefinition _node_1 = _get_2.getNode();
    String _name_2 = _node_1.getName();
    int _hashCode = _name_2.hashCode();
    _builder.append(_hashCode, "\t\t");
    _builder.append(" = ");
    Object _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (satisfied$");
    Quantification _get_3 = quantifications.get(index);
    NodeDefinition _node_2 = _get_3.getNode();
    String _name_3 = _node_2.getName();
    int _hashCode_1 = _name_3.hashCode();
    _builder.append(_hashCode_1, "\t\t");
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
    _builder.append("boolean satisfied$");
    int _hashCode = sentence.hashCode();
    _builder.append(_hashCode, "\t");
    _builder.append(" = ");
    RelationQualifier _qualifier = sentence.getQualifier();
    String _initialQualifierSatisfaction = this.initialQualifierSatisfaction(_qualifier);
    _builder.append(_initialQualifierSatisfaction, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ResolvingNode ");
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
    _builder.append("satisfied$");
    int _hashCode_1 = sentence.hashCode();
    _builder.append(_hashCode_1, "\t\t");
    _builder.append(" ");
    Quantification _quantification_3 = sentence.getQuantification();
    Quantor _quantor = _quantification_3.getQuantor();
    String _quantorSatisfactionRelation = this.quantorSatisfactionRelation(_quantor);
    _builder.append(_quantorSatisfactionRelation, "\t\t");
    _builder.append(" ");
    TargetDefinition _target_4 = sentence.getTarget();
    NodeDefinition _definition_2 = _target_4.getDefinition();
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
    int _hashCode_2 = sentence.hashCode();
    _builder.append(_hashCode_2, "\t");
    _builder.append(") return satisfied$");
    int _hashCode_3 = sentence.hashCode();
    _builder.append(_hashCode_3, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence nodeAssignmentStatement(final NodeDefinition assignee, final Axis axis, final NodeDefinition source, final SelectorList types, final PredicateExpression predicate) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = assignee.getName();
    _builder.append(_name, "");
    _builder.append(" = traverser$.");
    String _name_1 = axis.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append("(");
    String _name_2 = source.getName();
    _builder.append(_name_2, "");
    _builder.append(", (ResolvingNode node$");
    int _hashCode = assignee.hashCode();
    _builder.append(_hashCode, "");
    _builder.append(") -> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("boolean satisfied$");
    int _hashCode_1 = assignee.hashCode();
    _builder.append(_hashCode_1, "\t");
    _builder.append(" = true;");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(types, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("satisfied$");
        int _hashCode_2 = assignee.hashCode();
        _builder.append(_hashCode_2, "\t");
        _builder.append(" &= predicates$.hasType(node$");
        int _hashCode_3 = assignee.hashCode();
        _builder.append(_hashCode_3, "\t");
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
      boolean _notEquals_1 = (!Objects.equal(predicate, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("satisfied$");
        int _hashCode_4 = assignee.hashCode();
        _builder.append(_hashCode_4, "\t");
        _builder.append(" &= ");
        Object _predicateExpression = this.predicateExpression(predicate);
        _builder.append(_predicateExpression, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("return satisfied$");
    int _hashCode_5 = assignee.hashCode();
    _builder.append(_hashCode_5, "\t");
    _builder.append(";");
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
          String _name = node.getName();
          return (_name + ".hasCandidates()");
        case MUST_NOT:
          String _name_1 = node.getName();
          String _plus = ("!" + _name_1);
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
    int _hashCode = and.hashCode();
    _builder.append(_hashCode, "\t");
    _builder.append(" = true;\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = and.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied$");
        int _hashCode_1 = and.hashCode();
        _builder.append(_hashCode_1, "\t");
        _builder.append(" &= ");
        PredicateExpression _lhs_1 = and.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied$");
    int _hashCode_2 = and.hashCode();
    _builder.append(_hashCode_2, "\t");
    _builder.append(" &= ");
    PredicateExpression _rhs = and.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied$");
    int _hashCode_3 = and.hashCode();
    _builder.append(_hashCode_3, "\t");
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
    int _hashCode = or.hashCode();
    _builder.append(_hashCode, "\t");
    _builder.append(" = false;\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = or.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied$");
        int _hashCode_1 = or.hashCode();
        _builder.append(_hashCode_1, "\t");
        _builder.append(" |= ");
        PredicateExpression _lhs_1 = or.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied$");
    int _hashCode_2 = or.hashCode();
    _builder.append(_hashCode_2, "\t");
    _builder.append(" |= ");
    PredicateExpression _rhs = or.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied$");
    int _hashCode_3 = or.hashCode();
    _builder.append(_hashCode_3, "\t");
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
    int _hashCode = implies.hashCode();
    _builder.append(_hashCode, "\t");
    _builder.append(" = false;\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PredicateExpression _lhs = implies.getLhs();
      boolean _notEquals = (!Objects.equal(_lhs, null));
      if (_notEquals) {
        _builder.append("satisfied$");
        int _hashCode_1 = implies.hashCode();
        _builder.append(_hashCode_1, "\t");
        _builder.append(" |= ");
        PredicateExpression _lhs_1 = implies.getLhs();
        Object _predicateExpression = this.predicateExpression(_lhs_1);
        _builder.append(_predicateExpression, "\t");
      }
    }
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("satisfied$");
    int _hashCode_2 = implies.hashCode();
    _builder.append(_hashCode_2, "\t");
    _builder.append(" |= !");
    PredicateExpression _rhs = implies.getRhs();
    Object _predicateExpression_1 = this.predicateExpression(_rhs);
    _builder.append(_predicateExpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return satisfied$");
    int _hashCode_3 = implies.hashCode();
    _builder.append(_hashCode_3, "\t");
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
    String _name = _node.getName();
    String _plus = (_name + ".getProperty(");
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
    DefinitionSentence _sentence = definition.getSentence();
    TargetDefinition _target = _sentence.getTarget();
    final NodeDefinition defined = _target.getDefinition();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _isCollection = defined.isCollection();
      if (_isCollection) {
        _builder.append("ResolvingNodeSet");
      } else {
        _builder.append("ResolvingNode");
      }
    }
    _builder.append(" ");
    String _name = defined.getName();
    _builder.append(_name, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    DefinitionSentence _sentence_1 = definition.getSentence();
    Object _sentenceStatements = this.sentenceStatements(_sentence_1);
    _builder.append(_sentenceStatements, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return ");
    DefinitionSentence _sentence_2 = definition.getSentence();
    RelationQualifier _qualifier = _sentence_2.getQualifier();
    String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(defined, _qualifier);
    _builder.append(_qualifierSatisfiedStatement, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
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
  
  protected CharSequence _predicateCall(final PredicateXExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate$");
    int _hashCode = expression.hashCode();
    _builder.append(_hashCode, "");
    _builder.append("();");
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
        return _node.getName();
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
  
  public CharSequence sentenceStatements(final Sentence sentence) {
    if (sentence instanceof ConstraintSentence) {
      return _sentenceStatements((ConstraintSentence)sentence);
    } else if (sentence instanceof DefinitionSentence) {
      return _sentenceStatements((DefinitionSentence)sentence);
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
