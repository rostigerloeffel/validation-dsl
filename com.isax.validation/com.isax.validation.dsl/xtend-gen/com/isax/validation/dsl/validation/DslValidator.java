/**
 * generated by Xtext
 */
package com.isax.validation.dsl.validation;

import com.google.common.base.Objects;
import com.isax.validation.dsl.dsl.Axis;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.DslPackage;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.Quantification;
import com.isax.validation.dsl.dsl.RelationQualifier;
import com.isax.validation.dsl.dsl.TargetDefinition;
import com.isax.validation.dsl.util.DslUtil;
import com.isax.validation.dsl.validation.AbstractDslValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  @Check
  public void refersSet(final Quantification quantification) {
    NodeDefinition _nodeSet = quantification.getNodeSet();
    boolean _isCollection = _nodeSet.isCollection();
    boolean _not = (!_isCollection);
    if (_not) {
      NodeDefinition _nodeSet_1 = quantification.getNodeSet();
      String _name = _nodeSet_1.getName();
      String _plus = ("Quantification node set (" + _name);
      String _plus_1 = (_plus + ") is not a set!");
      EReference _quantification_NodeSet = DslPackage.eINSTANCE.getQuantification_NodeSet();
      this.error(_plus_1, quantification, _quantification_NodeSet);
    }
  }
  
  @Check
  public void refersNode(final DefinitionSentence sentence) {
    boolean _and = false;
    Quantification _quantification = sentence.getQuantification();
    boolean _equals = Objects.equal(_quantification, null);
    if (!_equals) {
      _and = false;
    } else {
      NodeDefinition _node = sentence.getNode();
      boolean _isCollection = _node.isCollection();
      _and = _isCollection;
    }
    if (_and) {
      EReference _definitionSentence_Node = DslPackage.eINSTANCE.getDefinitionSentence_Node();
      this.error("Use \'each\' or \'any\' to obtain neighbouring nodes of node sets!", sentence, _definitionSentence_Node);
    }
  }
  
  @Check
  public void definitionConformsAxisKind(final TargetDefinition target) {
    boolean _and = false;
    NodeDefinition _definition = target.getDefinition();
    boolean _isCollection = _definition.isCollection();
    boolean _not = (!_isCollection);
    if (!_not) {
      _and = false;
    } else {
      Axis _axis = target.getAxis();
      boolean _collectionAxis = DslUtil.collectionAxis(_axis);
      _and = _collectionAxis;
    }
    if (_and) {
      NodeDefinition _definition_1 = target.getDefinition();
      EAttribute _nodeDefinition_Name = DslPackage.eINSTANCE.getNodeDefinition_Name();
      this.error("Usage of \'multiple\' implies node-set target!", _definition_1, _nodeDefinition_Name);
    }
    boolean _and_1 = false;
    NodeDefinition _definition_2 = target.getDefinition();
    boolean _isCollection_1 = _definition_2.isCollection();
    if (!_isCollection_1) {
      _and_1 = false;
    } else {
      Axis _axis_1 = target.getAxis();
      boolean _collectionAxis_1 = DslUtil.collectionAxis(_axis_1);
      boolean _not_1 = (!_collectionAxis_1);
      _and_1 = _not_1;
    }
    if (_and_1) {
      NodeDefinition _definition_3 = target.getDefinition();
      EAttribute _nodeDefinition_Name_1 = DslPackage.eINSTANCE.getNodeDefinition_Name();
      this.error("Usage of \'non-multiple\' qualifier implies single node target!", _definition_3, _nodeDefinition_Name_1);
    }
  }
  
  @Check
  public void mustNotExcludesMultiple(final DefinitionSentence sentence) {
    boolean _and = false;
    RelationQualifier _qualifier = sentence.getQualifier();
    boolean _equals = Objects.equal(_qualifier, RelationQualifier.MUST_NOT);
    if (!_equals) {
      _and = false;
    } else {
      TargetDefinition _target = sentence.getTarget();
      Axis _axis = _target.getAxis();
      boolean _collectionAxis = DslUtil.collectionAxis(_axis);
      _and = _collectionAxis;
    }
    if (_and) {
      EAttribute _definitionSentence_Qualifier = DslPackage.eINSTANCE.getDefinitionSentence_Qualifier();
      this.error("Combination of \'must not\' and \'multiple\' is not allowed!", sentence, _definitionSentence_Qualifier);
      TargetDefinition _target_1 = sentence.getTarget();
      EAttribute _targetDefinition_Axis = DslPackage.eINSTANCE.getTargetDefinition_Axis();
      this.error("Combination of \'must not\' and \'multiple\' is not allowed!", _target_1, _targetDefinition_Axis);
    }
  }
}
