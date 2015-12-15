package com.isax.validation.dsl.ui.contentassist;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;

@SuppressWarnings("all")
public class DslHighlightingConfiguration extends XbaseHighlightingConfiguration {
  public final static String ECLASS_SELECTOR = "Selector";
  
  public final static String EATTRIBUTE_REFERENCE = "Attribute reference";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    TextStyle _style = this.getStyle();
    acceptor.acceptDefaultHighlighting(DslHighlightingConfiguration.ECLASS_SELECTOR, DslHighlightingConfiguration.ECLASS_SELECTOR, _style);
    TextStyle _style_1 = this.getStyle();
    acceptor.acceptDefaultHighlighting(DslHighlightingConfiguration.EATTRIBUTE_REFERENCE, DslHighlightingConfiguration.EATTRIBUTE_REFERENCE, _style_1);
  }
  
  public TextStyle getStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      textStyle.setStyle(SWT.ITALIC);
      RGB _rGB = new RGB(64, 128, 128);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
}
