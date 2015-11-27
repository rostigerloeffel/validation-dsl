package com.isax.validation.dsl.compilation;

import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.dsl.XPropertyExpression;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

@SuppressWarnings("all")
public class DslCompiler extends XbaseCompiler {
  @Override
  protected void doInternalToJavaStatement(final XExpression obj, final ITreeAppendable it, final boolean isReferenced) {
    if ((obj instanceof XPropertyExpression)) {
      final String property = it.declareSyntheticVariable(obj, "property");
      ITreeAppendable _newLine = it.newLine();
      ITreeAppendable _append = _newLine.append(String.class);
      ITreeAppendable _append_1 = _append.append(" ");
      ITreeAppendable _append_2 = _append_1.append(property);
      ITreeAppendable _append_3 = _append_2.append(" = ");
      CharSequence _javaExpression = this.toJavaExpression(((XPropertyExpression)obj));
      ITreeAppendable _append_4 = _append_3.append(_javaExpression);
      _append_4.append(";");
      return;
    }
    super.doInternalToJavaStatement(obj, it, isReferenced);
  }
  
  @Override
  protected void internalToConvertedExpression(final XExpression obj, final ITreeAppendable it) {
    if ((obj instanceof XPropertyExpression)) {
      CharSequence _javaExpression = this.toJavaExpression(((XPropertyExpression)obj));
      it.append(_javaExpression);
      return;
    }
    super.internalToConvertedExpression(obj, it);
  }
  
  private CharSequence toJavaExpression(final XPropertyExpression obj) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((String) ");
    NodeDefinition _node = obj.getNode();
    String _name = _node.getName();
    _builder.append(_name, "");
    _builder.append(".getProperty(\"");
    String _name_1 = obj.getName();
    _builder.append(_name_1, "");
    _builder.append("\"))");
    return _builder;
  }
}
