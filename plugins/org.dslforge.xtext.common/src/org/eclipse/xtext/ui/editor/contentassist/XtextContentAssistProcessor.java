/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.contentassist;

import java.util.Arrays;

import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.jface.ICompletionProposal;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.dslforge.styledtext.jface.ITextViewer;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class XtextContentAssistProcessor implements IContentAssistProcessor, CompletionProposalComputer.State {
	
	@Inject
	private ContentAssistContext.Factory contextFactory;

	@Inject
	private IContentProposalProvider contentProposalProvider;

	@Inject
	private ICompletionProposalComparator completionProposalComparator;

	private ITextViewer viewer;

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, XtextResource resource, int offset) {
		if (viewer==null)
			this.viewer = viewer;
		if (contentProposalProvider == null)
			return null;
		ICompletionProposal[] result = null;
		try {
			CompletionProposalComputer completionProposalComputer = createCompletionProposalComputer(getViewer(), resource, offset);
			result = completionProposalComputer.exec(resource);
			Arrays.sort(result, completionProposalComparator);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	} 

	public CompletionProposalComputer createCompletionProposalComputer(ITextViewer viewer, XtextResource resource, int offset) {
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