/*Hacked by DSL Forge*/
package org.eclipse.xtext.example.fowlerdsl.web.contentassist

import org.eclipse.xtext.example.fowlerdsl.web.contentassist.AbstractStatemachineProposalProvider
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class StatemachineProposalProvider extends AbstractStatemachineProposalProvider {
	
	override void complete_Statemachine(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println();
	}
	override void complete_Event(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println();
	}
	override void complete_Command(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println();
	}
	override void complete_State(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println();
	}
	override void complete_Transition(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println();
	}
}
