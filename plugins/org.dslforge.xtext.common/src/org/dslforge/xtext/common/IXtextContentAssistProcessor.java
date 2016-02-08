package org.dslforge.xtext.common;

import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.contentassist.CompletionProposalComputer;

public interface IXtextContentAssistProcessor extends IContentAssistProcessor{

	CompletionProposalComputer createCompletionProposalComputer(BasicText textWidget, XtextResource xtextResource, int offset);
}

