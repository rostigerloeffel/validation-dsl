package com.isax.validation.dsl.compilation;

import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.XXAssignment;
import com.isax.validation.dsl.dsl.XXPropertyExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

@SuppressWarnings("all")
public class DslCompiler extends XbaseCompiler {
  @Override
  protected void doInternalToJavaStatement(final XExpression obj, final ITreeAppendable it, final boolean isReferenced) {
    if ((obj instanceof XXPropertyExpression)) {
      this._toJavaStatement(((XXPropertyExpression) obj), it, isReferenced);
    } else {
      if ((obj instanceof XXAssignment)) {
        this._toJavaStatement(((XXAssignment) obj), it, isReferenced);
      } else {
        super.doInternalToJavaStatement(obj, it, isReferenced);
      }
    }
  }
  
  @Override
  protected void internalToConvertedExpression(final XExpression obj, final ITreeAppendable it) {
    if ((obj instanceof XXPropertyExpression)) {
      this._toJavaExpression(((XXPropertyExpression) obj), it);
    } else {
      if ((obj instanceof XXAssignment)) {
        this._toJavaExpression(((XXAssignment) obj), it);
      } else {
        super.internalToConvertedExpression(obj, it);
      }
    }
  }
  
  protected ITreeAppendable _toJavaStatement(final XXPropertyExpression expr, final ITreeAppendable outerAppendable, final boolean isReferenced) {
    ITreeAppendable _xblockexpression = null;
    {
      final ITreeAppendable b = outerAppendable.trace(expr, false);
      ITreeAppendable _xifexpression = null;
      boolean _and = false;
      if (!isReferenced) {
        _and = false;
      } else {
        boolean _isPrimitiveVoid = this.isPrimitiveVoid(expr);
        boolean _not = (!_isPrimitiveVoid);
        _and = _not;
      }
      if (_and) {
        ITreeAppendable _xblockexpression_1 = null;
        {
          this.declareSyntheticVariable(expr, b);
          ITreeAppendable _newLine = b.newLine();
          String _varName = this.getVarName(expr, b);
          ITreeAppendable _append = _newLine.append(_varName);
          _append.append(" = ");
          ITreeAppendable _append_1 = b.append("(String)");
          NodeDefinition _node = expr.getNode();
          String _name = _node.getName();
          ITreeAppendable _append_2 = _append_1.append(_name);
          ITreeAppendable _append_3 = _append_2.append(".getProperty(\"");
          String _name_1 = expr.getName();
          ITreeAppendable _append_4 = _append_3.append(_name_1);
          ITreeAppendable _append_5 = _append_4.append("\")");
          _xblockexpression_1 = _append_5.append(";");
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected ITreeAppendable _toJavaStatement(final XXAssignment expr, final ITreeAppendable outerAppendable, final boolean isReferenced) {
    ITreeAppendable _xblockexpression = null;
    {
      final ITreeAppendable b = outerAppendable.trace(expr, false);
      boolean _and = false;
      if (!isReferenced) {
        _and = false;
      } else {
        boolean _isPrimitiveVoid = this.isPrimitiveVoid(expr);
        boolean _not = (!_isPrimitiveVoid);
        _and = _not;
      }
      if (_and) {
        this.declareSyntheticVariable(expr, b);
      }
      boolean _and_1 = false;
      if (!isReferenced) {
        _and_1 = false;
      } else {
        XExpression _expression = expr.getExpression();
        boolean _isPrimitiveVoid_1 = this.isPrimitiveVoid(_expression);
        boolean _not_1 = (!_isPrimitiveVoid_1);
        _and_1 = _not_1;
      }
      final boolean canBeReferenced = _and_1;
      XExpression _expression_1 = expr.getExpression();
      this.internalToJavaStatement(_expression_1, b, canBeReferenced);
      ITreeAppendable _xifexpression = null;
      if (canBeReferenced) {
        ITreeAppendable _xblockexpression_1 = null;
        {
          ITreeAppendable _newLine = b.newLine();
          String _varName = this.getVarName(expr, b);
          ITreeAppendable _append = _newLine.append(_varName);
          _append.append(" = ");
          XExpression _expression_2 = expr.getExpression();
          this.internalToConvertedExpression(_expression_2, b);
          b.append(";");
          ITreeAppendable _newLine_1 = b.newLine();
          NodeDefinition _node = expr.getNode();
          String _name = _node.getName();
          ITreeAppendable _append_1 = _newLine_1.append(_name);
          _append_1.append(".setProperty(\"");
          String _property = expr.getProperty();
          ITreeAppendable _append_2 = b.append(_property);
          ITreeAppendable _append_3 = _append_2.append("\", ");
          String _varName_1 = this.getVarName(expr, b);
          _append_3.append(_varName_1);
          _xblockexpression_1 = b.append(");");
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected ITreeAppendable _toJavaExpression(final XXPropertyExpression expr, final ITreeAppendable b) {
    ITreeAppendable _trace = b.trace(expr, false);
    String _varName = this.getVarName(expr, b);
    return _trace.append(_varName);
  }
  
  protected ITreeAppendable _toJavaExpression(final XXAssignment expr, final ITreeAppendable b) {
    ITreeAppendable _trace = b.trace(expr, false);
    String _varName = this.getVarName(expr, b);
    return _trace.append(_varName);
  }
}
