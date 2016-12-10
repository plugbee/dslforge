package org.eclipse.xtext.ui.editor.contentassist;

import org.apache.log4j.Logger;
import org.dslforge.styledtext.jface.ICompletionProposal;
import org.dslforge.styledtext.jface.IDocument;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Keyword;

public class ConfigurableCompletionProposal implements ICompletionProposal {

	static final Logger logger = Logger.getLogger(ConfigurableCompletionProposal.class);
	
	private String replacementString;
	private int replacementOffset;
	private int replacementLength;
	private int cursorPosition;
	private int selectionStart;
	private Image image;
	private StyledString displayString;
	private Object additionalProposalInfo;
	private int priority;
	private PrefixMatcher matcher;
	private IEObjectHover hover;
	private int replaceContextLength;
	
	public ConfigurableCompletionProposal(String replacementString, int replacementOffset, int replacementLength,
			int cursorPosition, Image image, StyledString displayString, String additionalProposalInfo) {
		this.replacementString = replacementString;
		this.replacementOffset = replacementOffset;
		this.replacementLength = replacementLength;
		this.cursorPosition = cursorPosition;
		this.selectionStart = replacementOffset + cursorPosition;
		this.image = image;
		this.displayString = displayString == null ? new StyledString(this.replacementString) : displayString;
		this.additionalProposalInfo = additionalProposalInfo;
	}

	@Override
	public void apply(IDocument document) {
		String original = document.get();
		try {
			document.replace(getReplacementOffset(), getReplacementLength(), getReplacementString());
		} catch (Exception ex) {
			logger.error("Error applying completion proposal", ex);
			document.set(original);
		}
	}
	public int getReplacementOffset() {
		return replacementOffset;
	}

	public void setReplacementOffset(int replacementOffset) {
		this.replacementOffset = replacementOffset;
	}

	public int getReplacementLength() {
		return replacementLength;
	}

	public void setReplacementLength(int replacementLength) {
		this.replacementLength = replacementLength;
	}

	public int getCursorPosition() {
		return cursorPosition;
	}

	public void setCursorPosition(int cursorPosition) {
		this.cursorPosition = cursorPosition;
	}

	public int getSelectionStart() {
		return selectionStart;
	}

	public void setSelectionStart(int selectionStart) {
		this.selectionStart = selectionStart;
	}

	public IEObjectHover getHover() {
		return hover;
	}

	public void setReplacementString(String replacementString) {
		this.replacementString = replacementString;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void setDisplayString(StyledString displayString) {
		this.displayString = displayString;
	}

	public void setAdditionalProposalInfo(String additionalProposalInfo) {
		this.additionalProposalInfo = additionalProposalInfo;
	}

	@Override
	public String getDisplayString() {
		if (displayString != null) {
			return getStyledDisplayString().getString();
		}
		return replacementString;
	}

	public StyledString getStyledDisplayString() {
		return displayString;
	}
	
	@Override
	public Image getImage() {
		return image;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setMatcher(PrefixMatcher matcher) {
		this.matcher = matcher;
	}

	public PrefixMatcher getMatcher() {
		return matcher;
	}
	
	/**
	 * Returns the priority of the proposal. The bigger the returned int value, the 
	 * higher is the precedence of the proposal. Proposals with higher priority will
	 * be listed above proposals with lower priority.
	 */
	public int getPriority() {
		return priority;
	}

	public void setReplaceContextLength(int replaceContextLength) {
		this.replaceContextLength = replaceContextLength;
	}
	
	public int getReplaceContextLength() {
		return replaceContextLength;
	}
	
	public String getReplacementString() {
		return replacementString;
	}

	public void setHover (IEObjectHover hover) {
		this.hover = hover;
	}

	public void setAdditionalProposalInfo(Object additionalProposalInfo) {
		this.additionalProposalInfo = additionalProposalInfo;
	}
	
	@Override
	public String getAdditionalProposalInfo() {
		if (additionalProposalInfo != null) {
			if (additionalProposalInfo instanceof Keyword) {
				return "keyword";
			}
			if (additionalProposalInfo instanceof EObject) {
				EObject eObject = (EObject) additionalProposalInfo;
				return eObject.eClass().getName();
			}
			return additionalProposalInfo.toString();
		}
		return "";
	}
}
