package org.dslforge.styledtext.jface;

/**
 * Basic implementation of an {@link org.dslforge.styledtext.jface.IDocument IDocument}
 */
public class TextDocument implements IDocument {

	private String content;

	public TextDocument(String content) {
		this.content = content;
	}
	
	public TextDocument() {
		this("");
	}

	@Override
	public char getChar(int offset) throws BadLocationException {
		return content.charAt(offset);
	}

	@Override
	public int getLength() {
		return content.length();
	}

	@Override
	public String get() {
		return content;
	}

	@Override
	public String get(int offset, int length) throws BadLocationException {
		int myLength= content.length();
		if ((0 > offset) || (0 > length) || (offset + length > myLength))
			throw new BadLocationException();
		return content.substring(offset, offset + length);
	}

	@Override
	public void set(String text) {
		content=text;
	}

	@Override
	public void replace(int offset, int length, String text) throws BadLocationException {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getLineLength(int line) throws BadLocationException {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getLineOfOffset(int offset) throws BadLocationException {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getLineOffset(int line) throws BadLocationException {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getNumberOfLines() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getNumberOfLines(int offset, int length) throws BadLocationException {
		throw new UnsupportedOperationException();
	}

	@Override
	public int computeNumberOfLines(String text) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String[] getLegalLineDelimiters() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getLineDelimiter(int line) throws BadLocationException {
		throw new UnsupportedOperationException();
	}
}