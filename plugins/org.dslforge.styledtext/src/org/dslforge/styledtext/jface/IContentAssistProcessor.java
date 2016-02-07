/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.dslforge.styledtext.jface;

/**
 * A content assist processor proposes completions and
 * computes context information for a particular content type.
 * A content assist processor is a {@link org.eclipse.jface.text.contentassist.IContentAssistant}
 * plug-in.
 * <p>
 * This interface must be implemented by clients. Implementers should be
 * registered with a content assistant in order to get involved in the
 * assisting process.
 * </p>
*/
public interface IContentAssistProcessor {
	/**
	 * Returns a list of completion proposals based on the
	 * specified location within the document that corresponds
	 * to the current cursor position within the text viewer.
	 * @param basicText 
	 *
	 * @param viewer the viewer whose document is used to compute the proposals
	 * @param offset an offset within the document for which completions should be computed
	 * @return an array of completion proposals or <code>null</code> if no proposals are possible
	 */
	ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset);
}

