package com.isax.validation.dsl.ui.contentassist

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration

class DslHighlightingConfiguration extends XbaseHighlightingConfiguration {

	public final static val ECLASS_SELECTOR = "Selector"
	public final static val EATTRIBUTE_REFERENCE = "Attribute reference"

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(ECLASS_SELECTOR, ECLASS_SELECTOR, getStyle())
		acceptor.acceptDefaultHighlighting(EATTRIBUTE_REFERENCE, EATTRIBUTE_REFERENCE, getStyle())
	}

	def getStyle() {
	    val textStyle = new TextStyle
	    textStyle.style = SWT.ITALIC
	    textStyle.color = new RGB(64, 128, 128)
	    textStyle
	}
	
}
