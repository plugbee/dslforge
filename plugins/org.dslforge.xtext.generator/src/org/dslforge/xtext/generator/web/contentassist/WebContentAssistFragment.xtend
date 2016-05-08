/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * </copyright>
 */
package org.dslforge.xtext.generator.web.contentassist

import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.ui.generator.contentAssist.ContentAssistFragment

class WebContentAssistFragment extends ContentAssistFragment {

	val Grammar grammar

	new(Grammar grammar) {
		super();
		this.grammar = grammar;
	}

	override String getProposalProviderName(Grammar grammar) {
		if (this.grammar.name == grammar.name)
			return grammar.basePackageUi + ".contentassist." + GrammarUtil::getSimpleName(grammar) + "ProposalProvider"
		else if (grammar.name == "org.eclipse.xtext.common.Terminals")
			return "org.eclipse.xtext.ui.editor" + ".contentassist." + GrammarUtil::getSimpleName(grammar) +
				"ProposalProvider"
		return super.getProposalProviderName(grammar)
	}

	override String getGenProposalProviderName() {
		return grammar.basePackageUi + ".contentassist.Abstract" + GrammarUtil::getSimpleName(grammar) +
			"ProposalProvider"
	}

	def String basePackageUi(Grammar g) {
		return GeneratorUtil::getProjectName(g);
	}
}
