/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.dslforge.styledtext.jface;

import org.eclipse.swt.graphics.Image;

/**
 * The interface of completion proposals generated by content assist processors.
 * A completion proposal contains information used to present the proposed completion
 * to the user, to insert the completion should the user select it, and to present
 * context information for the chosen completion once it has been inserted.
 * <p>
 * In order to provide backward compatibility for clients of <code>ICompletionProposal</code>, extension
 * interfaces are used to provide a means of evolution. The following extension interfaces exist:
 * <ul>
 * <li>{@link org.eclipse.jface.text.contentassist.ICompletionProposalExtension} since version 2.0 introducing
 *		the following functions:
 *			<ul>
 *				<li>handling of trigger characters other than ENTER</li>
 *				<li>completion proposal validation for a given offset</li>
 *				<li>context information can be freely positioned</li>
 *			</ul>
 * </li>
 * <li>{@link org.eclipse.jface.text.contentassist.ICompletionProposalExtension2} since version 2.1 introducing
 *		the following functions:
 *			<ul>
 *				<li>handling of trigger characters with modifiers</li>
 *				<li>visual indication for selection of a proposal</li>
 *			</ul>
 * </li>
 * <li>{@link org.eclipse.jface.text.contentassist.ICompletionProposalExtension3} since version 3.0 introducing
 *		the following functions:
 *			<ul>
 *				<li>provision of a custom information control creator</li>
 *				<li>provide a custom completion text and offset for prefix completion</li>
 *			</ul>
 * </li>
 * <li>{@link org.eclipse.jface.text.contentassist.ICompletionProposalExtension4} since version 3.1 introducing
 *		the following functions:
 *			<ul>
 *				<li>specify whether a proposal is automatically insertable</li>
 *			</ul>
 * </li>
 * <li>{@link org.eclipse.jface.text.contentassist.ICompletionProposalExtension5} since version 3.2 introducing
 *		the following function:
 *			<ul>
 *				<li>Allow background computation of the additional info</li>
 *			</ul>
 * </li>
 * <li>{@link org.eclipse.jface.text.contentassist.ICompletionProposalExtension6} since version 3.4 introducing
 *		the following function:
 *			<ul>
 *				<li>Allow styled ranges in the display string.</li>
 *			</ul>
 * </li>
 * </ul>
 * </p>
 * <p>
 * This interface can be implemented by clients. By default, clients use
 * {@link org.eclipse.jface.text.contentassist.CompletionProposal} as the
 * standard implementer of this interface.
 * </p>
 *
 * @see IContentAssistProcessor
 */
public interface ICompletionProposal {

	/**
	 * Inserts the proposed completion into the given document.
	 *
	 * @param document the document into which to insert the proposed completion
	 */
	void apply(IDocument document);

	/**
	 * Returns the new selection after the proposal has been applied to
	 * the given document in absolute document coordinates. If it returns
	 * <code>null</code>, no new selection is set.
	 *
	 * A document change can trigger other document changes, which have
	 * to be taken into account when calculating the new selection. Typically,
	 * this would be done by installing a document listener or by using a
	 * document position during {@link #apply(IDocument)}.
	 *
	 * @param document the document into which the proposed completion has been inserted
	 * @return the new selection in absolute document coordinates
	 */
	//Point getSelection(IDocument document);

	/**
	 * Returns optional additional information about the proposal. The additional information will
	 * be presented to assist the user in deciding if the selected proposal is the desired choice.
	 * <p>
	 * If {@link ICompletionProposalExtension5} is implemented, this method should not be called any
	 * longer. This method may be deprecated in a future release.
	 * </p>
	 *
	 * @return the additional information or <code>null</code>
	 */
	String getAdditionalProposalInfo();

	/**
	 * Returns the string to be displayed in the list of completion proposals.
	 *
	 * @return the string to be displayed
	 * 
	 * @see ICompletionProposalExtension6#getStyledDisplayString()
	 */
	String getDisplayString();

	/**
	 * Returns the string to be actually inserted in text.
	 *
	 * @return the string to be inserted
	 *
	 */
	String getReplacementString();
	
	/**
	 * Returns the image to be displayed in the list of completion proposals.
	 * The image would typically be shown to the left of the display string.
	 *
	 * @return the image to be shown or <code>null</code> if no image is desired
	 */
	Image getImage();

	/**
	 * Returns optional context information associated with this proposal.
	 * The context information will automatically be shown if the proposal
	 * has been applied.
	 *
	 * @return the context information for this proposal or <code>null</code>
	 */
	//IContextInformation getContextInformation();
}
