package org.eclipse.xtext.ui.editor.contentassist;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.dslforge.styledtext.jface.ICompletionProposal;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.dslforge.styledtext.jface.ITextViewer;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;

/**
 * The main code of this class is copied from
 * org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor. The
 * following interfaces are not handled by default: 
 * <p> - ITemplateProposalProvider
 * <p> - IContextInformationProvider
 * <p> - IXtextDocument
 * <p> - ICompletionProposalPostProcessor
 */
public class XtextContentAssistProcessor implements IContentAssistProcessor, CompletionProposalComputer.State {
	
	static final Logger logger = Logger.getLogger(XtextContentAssistProcessor.class);
	
	@Inject
	private ContentAssistContext.Factory contextFactory;

	@Inject
	private IContentProposalProvider contentProposalProvider;

	@Inject
	private ICompletionProposalComparator completionProposalComparator;

	private ITextViewer viewer;

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		throw new UnsupportedOperationException("Unhandled operation");
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, XtextResource resource, int offset) {
		this.viewer = viewer;
		if (contentProposalProvider == null)
			return null;
		ICompletionProposal[] result = null;
		try {
			CompletionProposalComputer completionProposalComputer = createCompletionProposalComputer(getViewer(), offset);
			result = completionProposalComputer.exec(resource);
			Arrays.sort(result, completionProposalComparator);
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
		}
		return result;
	} 

	public CompletionProposalComputer createCompletionProposalComputer(ITextViewer viewer, int offset) {
		this.viewer = viewer;
		return new CompletionProposalComputer(this, offset);
	}

	public void setContextFactory(ContentAssistContext.Factory contextFactory) {
		this.contextFactory = contextFactory;
	}

	public ContentAssistContext.Factory getContextFactory() {
		return contextFactory;
	}

	public void setContentProposalProvider(IContentProposalProvider contentProposalProvider) {
		this.contentProposalProvider = contentProposalProvider;
	}

	public IContentProposalProvider getContentProposalProvider() {
		return contentProposalProvider;
	}

	public ICompletionProposalAcceptor decorateAcceptor(ICompletionProposalAcceptor acceptor) {
		return acceptor;
	}
	
	@Override
	public ITextViewer getViewer() {
		return viewer;
	}
	
	public void setViewer(ITextViewer viewer) {
		this.viewer = viewer;
	}
}