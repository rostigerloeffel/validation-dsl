package com.isax.validation.dsl.jvmmodel;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
      final Procedure1<JvmGenericType> _function_1 = (JvmGenericType it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
        EList<JvmMember> _members = it_1.getMembers();
        JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("boolean");
        final Procedure1<JvmOperation> _function_2 = (JvmOperation it_2) -> {
          it_2.setAbstract(true);
        };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(validator, "test", _typeRef, _function_2);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      };
      final JvmGenericType predicateDecl = this._jvmTypesBuilder.toInterface(validator, "Predicate", _function_1);
      EList<JvmAnnotationReference> _annotations = predicateDecl.getAnnotations();
      JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(FunctionalInterface.class);
      this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
      EList<JvmMember> _members = it.getMembers();
      this._jvmTypesBuilder.<JvmGenericType>operator_add(_members, predicateDecl);
      EList<JvmMember> _members_1 = it.getMembers();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("boolean");
      final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
        it_1.setVisibility(JvmVisibility.PRIVATE);
        EList<JvmFormalParameter> _parameters = it_1.getParameters();
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef("Predicate");
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(validator, "predicate", _typeRef_1);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return predicate.test();");
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(validator, "eval", _typeRef, _function_2);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
      EList<JvmMember> _members_2 = it.getMembers();
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef("boolean");
      final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
        it_1.setVisibility(JvmVisibility.PUBLIC);
        EList<JvmFormalParameter> _parameters = it_1.getParameters();
        JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef("Node");
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(validator, "node", _typeRef_2);
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
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(validator, "validate", _typeRef_1, _function_3);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_1);
      EList<JvmMember> _members_3 = it.getMembers();
      ArrayList<JvmMember> _compilePredicates = this.compilePredicates(validator);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_3, _compilePredicates);
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
                _builder.append("boolean satisfied = ");
                TargetDefinition _target = ((DefinitionSentence)sentence_1).getTarget();
                NodeDefinition _definition = _target.getDefinition();
                RelationQualifier _qualifier = ((DefinitionSentence)sentence_1).getQualifier();
                String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition, _qualifier);
                _builder.append(_qualifierSatisfiedStatement, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("if (!satisfied) return satisfied;");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
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
    _builder.newLine();
    return _builder;
  }
  
  public ArrayList<JvmMember> compilePredicates(final Validator validator) {
    ArrayList<JvmMember> _xblockexpression = null;
    {
      final ArrayList<JvmMember> compiledPredicates = new ArrayList<JvmMember>();
      EList<Sentence> _sentences = validator.getSentences();
      for (final Sentence sentence : _sentences) {
        if ((sentence instanceof PredicateDefinitionSentence)) {
          final PredicateDefinitionSentence predicate = ((PredicateDefinitionSentence) sentence);
          String _name = predicate.getName();
          JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("boolean");
          final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
          };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(validator, _name, _typeRef, _function);
          compiledPredicates.add(_method);
        }
      }
      _xblockexpression = compiledPredicates;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _sentenceStatements(final StartOnSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(sentence);
    _builder.append(_serialize, "");
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
        _builder.append("boolean satisfied = ");
        QuantificationList _quantifications_1 = sentence.getQuantifications();
        EList<Quantification> _quantifications_2 = _quantifications_1.getQuantifications();
        CharSequence _constraintDispatch = this.constraintDispatch(_quantifications_2, 0, sentence);
        _builder.append(_constraintDispatch, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (!satisfied) return false;");
        _builder.newLine();
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
    _builder.append("for (Node ");
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
    _builder.append("boolean satisfied = ");
    Object _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (!satisfied) return false;");
    _builder.newLine();
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
    _builder.append("for (Node ");
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
    _builder.append("boolean satisfied = ");
    Object _constraintDispatch = this.constraintDispatch(quantifications, (index + 1), sentence);
    _builder.append(_constraintDispatch, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (satisfied) return true;");
    _builder.newLine();
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
  
  protected CharSequence _sentenceStatements(final PredicateDefinitionSentence sentence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    String _serialize = this.serialize(sentence);
    _builder.append(_serialize, "");
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
    _builder.append("return ");
    PredicateExpression _predicate = sentence.getPredicate();
    Object _predicateExpression = this.predicateExpression(_predicate);
    _builder.append(_predicateExpression, "\t");
    _builder.newLineIfNotEmpty();
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
    _builder.append("for (Node ");
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
    String _qualifierSatisfiedStatement = this.qualifierSatisfiedStatement(_definition_2, _qualifier_1);
    _builder.append(_qualifierSatisfiedStatement, "\t\t");
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
        _builder.append("return ");
        Object _predicateExpression = this.predicateExpression(predicate);
        _builder.append(_predicateExpression, "\t");
        _builder.newLineIfNotEmpty();
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
  
  protected Object _predicateExpression(final OrExpression or) {
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
  
  protected Object _predicateExpression(final ImpliesExpression implies) {
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
  
  protected CharSequence _predicateCall(final PropertyRelationPredicate relation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("compare(");
    PropertyExpression _lhs = relation.getLhs();
    String _propertyExpression = this.propertyExpression(_lhs);
    _builder.append(_propertyExpression, "");
    _builder.append(", ");
    PropertyRelation _relation = relation.getRelation();
    String _propertyRelation = this.propertyRelation(_relation);
    _builder.append(_propertyRelation, "");
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
    String _plus = ("property(" + _name);
    String _plus_1 = (_plus + ", ");
    String _property = expression.getProperty();
    String _plus_2 = (_plus_1 + _property);
    return (_plus_2 + ")");
  }
  
  public String propertyRelation(final PropertyRelation relation) {
    String _switchResult = null;
    if (relation != null) {
      switch (relation) {
        case EQUALS:
          _switchResult = "EQUALS";
          break;
        case GREATER:
          _switchResult = "GREATER";
          break;
        case GREATER_EQUALS:
          _switchResult = "GREATER_EQUALS";
          break;
        case LESSER:
          _switchResult = "LESSER";
          break;
        case LESSER_EQUALS:
          _switchResult = "LESSER_EQUALS";
          break;
        case NOT_EQUALS:
          _switchResult = "NOT_EQUALS";
          break;
        default:
          break;
      }
    }
    return _switchResult;
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
          _xifexpression_1 = "NodeSet";
        } else {
          _xifexpression_1 = "Node";
        }
        String _plus = (_xifexpression_1 + " ");
        NodeDefinition _node_1 = parameter.getNode();
        String _name = _node_1.getName();
        return (_plus + _name);
      };
      _xifexpression = IterableExtensions.<Parameter>join(_parameters, ", ", _function);
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
