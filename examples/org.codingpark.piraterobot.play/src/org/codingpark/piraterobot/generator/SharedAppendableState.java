package org.codingpark.piraterobot.generator;

import org.eclipse.xtext.util.IAcceptor;

public class SharedAppendableState {
	
	private int indentationLevel = 0;
	private String indentation;
	private String lineSeparator;

	public SharedAppendableState(String indentation, String lineSeparator) {
		this.indentation = indentation;
		this.lineSeparator = lineSeparator;
	}
	
	public void appendNewLineAndIndentation(IAcceptor<String> content) {
		content.accept(lineSeparator);
		for (int i = 0; i<indentationLevel; i++) {
			content.accept(indentation);
		}
	}
	
	public void increaseIndentation() {
		indentationLevel++;
	}
	
	public void decreaseIndentation() {
		if (indentationLevel ==0)
			throw new IllegalStateException("Cant reduce indentation level, it's already zero.");
		indentationLevel--;
	}
}
