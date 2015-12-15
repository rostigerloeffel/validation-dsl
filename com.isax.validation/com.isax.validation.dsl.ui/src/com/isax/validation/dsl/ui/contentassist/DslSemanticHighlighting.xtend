package com.isax.validation.dsl.ui.contentassist

import com.isax.validation.dsl.dsl.EAttributePropertyReference
import com.isax.validation.dsl.dsl.EClassSelector
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

class DslSemanticHighlighting extends XbaseHighlightingCalculator {
	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		super.provideHighlightingFor(resource, acceptor, cancelIndicator)

		resource?.eAllContentsAsList.filter(EClassSelector)
			.map[s|s.findActualNodeFor].forEach[n|acceptor.addPosition(n.offset, n.length, DslHighlightingConfiguration.ECLASS_SELECTOR)]
		resource?.eAllContentsAsList.filter(EAttributePropertyReference)
			.map[s|s.findActualNodeFor].forEach[n|acceptor.addPosition(n.offset, n.length, DslHighlightingConfiguration.EATTRIBUTE_REFERENCE)]
	}
	
}