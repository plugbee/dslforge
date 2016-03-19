package org.dslforge.xtext.generator.web.contentassist

import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.ui.generator.contentAssist.ContentAssistFragment

class WebContentAssistFragment extends ContentAssistFragment {
	
	val Grammar myGrammar
	
	new(Grammar grammar) {
		super();
		//workaround
		this.myGrammar = grammar;
	}
	
	override String getProposalProviderName(Grammar grammar) {
		if (grammar.name==myGrammar.name)
			return grammar.basePackageUi  + ".contentassist." + GrammarUtil::getName(grammar) + "ProposalProvider"
		if (grammar.name=="org.eclipse.xtext.common.Terminals")
			return "org.eclipse.xtext.ui.editor"+ ".contentassist." + GrammarUtil::getName(grammar) + "ProposalProvider"
		return super.getProposalProviderName(grammar)
	}
	
	override String getGenProposalProviderName() {
		return myGrammar.basePackageUi + ".contentassist.Abstract" + GrammarUtil::getName(myGrammar) + "ProposalProvider"
	}
	
	def String basePackageUi(Grammar g) {
		return GeneratorUtil::getProjectName(g);
	}
	
	
}