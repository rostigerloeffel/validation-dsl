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
      return;
    } else {
      super.doInternalToJavaStatement(obj, it, isReferenced);
    }
  }
  
  @Override
  protected void internalToConvertedExpression(final XExpression obj, final ITreeAppendable it) {
    if ((obj instanceof XPropertyExpression)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("((String) ");
      NodeDefinition _node = ((XPropertyExpression)obj).getNode();
      String _name = _node.getName();
      _builder.append(_name, "");
      _builder.append(".getProperty(\"");
      String _name_1 = ((XPropertyExpression)obj).getName();
      _builder.append(_name_1, "");
      _builder.append("\"))");
      it.append(_builder);
      return;
    } else {
      super.internalToConvertedExpression(obj, it);
    }
  }
}
