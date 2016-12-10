package org.eclipse.xtext.ui.editor.contentassist;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.dslforge.styledtext.jface.ICompletionProposal;
import org.dslforge.styledtext.jface.ITextViewer;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;

public class CompletionProposalComputer implements ICompletionProposalAcceptor {

	private final int offset;
	
	private final State state;
	
	private final Collection<ICompletionProposal> proposals;

	@Inject
	private ContentAssistContext.Factory contextFactory;
	
	@Inject
	private IContentProposalProvider proposalProvider;
	
	public interface State {
		//ITemplateProposalProvider getTemplateProposalProvider();
		IContentProposalProvider getContentProposalProvider();
		ContentAssistContext.Factory getContextFactory();
		ICompletionProposalAcceptor decorateAcceptor(ICompletionProposalAcceptor delegate);
		//ITemplateAcceptor decorateAcceptor(ITemplateAcceptor delegate);
		ITextViewer getViewer();
	}
	
	public CompletionProposalComputer(State state, int offset) {
		super();
		this.proposals = new LinkedHashSet<ICompletionProposal>(30);
		this.state=state;
		this.offset = offset;
	}

	public ICompletionProposal[] exec(XtextResource resource) {
		ICompletionProposalAcceptor proposalAcceptor = state.decorateAcceptor((ICompletionProposalAcceptor)this);
		ContentAssistContext[] contexts = getContextFactory().create(state.getViewer(), offset, resource);
		for (ContentAssistContext context: contexts) {
			if (canAcceptMoreProposals())
				getContentProposalProvider().createProposals(context, proposalAcceptor);
		}
		return proposals.toArray(new ICompletionProposal[proposals.size()]);	
	}

	private IContentProposalProvider getContentProposalProvider() {
		return state.getContentProposalProvider();
	}

	private ContentAssistContext.Factory getContextFactory() {
		return state.getContextFactory();
	}

	public void accept(ICompletionProposal proposal) {
		if (proposal == null)
			throw new NullPointerException("proposal may not be null");
		proposals.add(proposal);
	}

	public boolean canAcceptMoreProposals() {
		return true;
	}
}