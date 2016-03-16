package org.dslforge.xtext.generator.web.contentassist

import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.ui.generator.contentAssist.ContentAssistFragment

import static org.eclipse.xtext.GrammarUtil.getNamespace

class WebContentAssistFragment extends ContentAssistFragment {
	
	val Grammar myGrammar
	
	new(Grammar grammar) {
		super();
		//workaround
		this.myGrammar = grammar;
	}
	
	override String getProposalProviderName(Grammar grammar) {
		return grammar.basePackageUi + ".contentassist." + GrammarUtil::getName(grammar) + "ProposalProvider"
	}
	
	override String getGenProposalProviderName() {
		return myGrammar.basePackageUi + ".contentassist.Abstract" + GrammarUtil::getName(myGrammar) + "ProposalProvider"
	}
	
	def String basePackageUi(Grammar g) {
		return getNamespace(g) + ".web";
	}
}