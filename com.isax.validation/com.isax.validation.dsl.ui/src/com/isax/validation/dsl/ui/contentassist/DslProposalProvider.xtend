/*
 * generated by Xtext
 */
package com.isax.validation.dsl.ui.contentassist

import com.isax.validation.dsl.ui.contentassist.AbstractDslProposalProvider
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class DslProposalProvider extends AbstractDslProposalProvider {
	
	override protected isValidProposal(String proposal, String prefix, ContentAssistContext context) {
		super.isValidProposal(proposal, prefix, context) && !proposal.contains('$') && !prefix.contains('$')
	}
	
}
