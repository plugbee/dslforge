package org.dslforge.xtext.common.jface;

import org.dslforge.styledtext.BasicText;

public class TextDocument implements IDocument {

	private BasicText textWidget;

	public TextDocument(BasicText basicText) {
		this.textWidget = basicText;
	}
	
	@Override
	public char getChar(int offset) throws BadLocationException {
		return 0;
	}

	@Override
	public int getLength() {
		return 0;
	}

	@Override
	public String get() {
		return null;
	}

	@Override
	public String get(int offset, int length) throws BadLocationException {
		return null;
	}

	@Override
	public void set(String text) {
	}

	@Override
	public void replace(int offset, int length, String text) throws BadLocationException {
	}

	@Override
	public int getLineLength(int line) throws BadLocationException {
		return 0;
	}

	@Override
	public int getLineOfOffset(int offset) throws BadLocationException {
		return 0;
	}

	@Override
	public int getLineOffset(int line) throws BadLocationException {
		return 0;
	}

	@Override
	public int getNumberOfLines() {
		return 0;
	}

	@Override
	public int getNumberOfLines(int offset, int length) throws BadLocationException {
		return 0;
	}

	@Override
	public int computeNumberOfLines(String text) {
		return 0;
	}

	@Override
	public String[] getLegalLineDelimiters() {
		return null;
	}

	@Override
	public String getLineDelimiter(int line) throws BadLocationException {
		return null;
	}
}