package org.codingpark.piraterobot.generator;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.IAcceptor;

import com.google.common.collect.Lists;

public class TreeAppendable implements ITreeAppendable, IAcceptor<String>, CharSequence {

	private List<Object> children;
	private final SharedAppendableState state;
	private boolean closed = false;
	
	public TreeAppendable(EObject source, String indentation, String lineSeparator) {
		this(new SharedAppendableState(indentation, lineSeparator), source);
	}
	
	public TreeAppendable(SharedAppendableState state, EObject source) {
		children = Lists.newArrayList();
		this.state = state;
	}

	@Override
	public ITreeAppendable trace(EObject object) {
		TreeAppendable result = new TreeAppendable(state, object);
		children.add(result);
		return result;
	}

	@Override
	public ITreeAppendable append(CharSequence content) {
		if(content instanceof ITreeAppendable) {
			return appendTreeAppendable((ITreeAppendable) content);
		}
		closeLastChild();
		appendIndented(content.toString());
		return this;
	}

	private void appendIndented(String text) {
		int length = text.length();
		int nextLineOffset = 0;
		int idx = 0;
		while (idx < length) {
			char currentChar = text.charAt(idx);
			//check for \r or \r\n
			if (currentChar == '\r') {
				int delimiterLength = 1;
				if (idx+1 < length && text.charAt(idx+1) == '\n') {
					delimiterLength++;
					idx++;
				}
				int lineLength = idx - delimiterLength - nextLineOffset + 1;
				children.add(text.substring(nextLineOffset, nextLineOffset + lineLength));
				nextLineOffset = idx + 1;
			} else if (currentChar == '\n') {
				int lineLength = idx - nextLineOffset;
				children.add(text.substring(nextLineOffset, nextLineOffset + lineLength));
				nextLineOffset = idx + 1;
			}
			idx++;
		}
		if (nextLineOffset != length) {
			int lineLength = length - nextLineOffset;
			children.add(text.substring(nextLineOffset, nextLineOffset + lineLength));
		}		
	}

	private void closeLastChild() {
		if (closed){
			throw new IllegalStateException("Tree Appendable was already closed");
		}
		if (!children.isEmpty()){
			Object lastChild = children.get(children.size() -1);
			if (lastChild instanceof TreeAppendable) {
				((TreeAppendable) lastChild).markClosed();
			}
		}	
	}

	private ITreeAppendable appendTreeAppendable(ITreeAppendable other) {
		closeLastChild();
		if (other instanceof TreeAppendable) {
			((TreeAppendable) other).markClosed();
		} else {
			throw new IllegalArgumentException("Unexpected implementation");
		}
		children.add(other);
		return this;
	}

	private void markClosed() {
		if (closed)
			return;
		closeLastChild();
		closed = true;
	}

	@Override
	public ITreeAppendable newLine() {
		closeLastChild();
		state.appendNewLineAndIndentation(this);
		return this;
	}
	
	@Override
	public ITreeAppendable increaseIndentation() {
		closeLastChild();
		state.increaseIndentation();
		return this;
	}

	@Override
	public ITreeAppendable decreaseIndentation() {
		closeLastChild();
		state.decreaseIndentation();
		return this;
	}

	public void setChildren(List<Object> children) {
		this.children = children;
	}

	public List<Object> getChildren() {
		return children;
	}

	@Override
	public char charAt(int index) {
		return toString().charAt(index);
	}

	@Override
	public int length() {
		return toString().length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return toString().subSequence(start, end);
	}
	
	@Override
	public ITreeAppendable removeLast() {
		if (closed){
			throw new IllegalStateException("Tree Appendable was already closed");
		}
		if (!children.isEmpty()){
			children.remove(children.size() -1);
		}
		return this;
	}

	@Override
	public void accept(String text) {
		children.add(text);
	}
	
	public String getContent(){
		StringBuilder result = new StringBuilder(8*1024);
		doGetContent(result);
		return result.toString();
	}

	private void doGetContent(StringBuilder result) {
		for (Object child : children) {
			if (child instanceof String) {
				result.append(child);
			} else{
				((TreeAppendable) child).doGetContent(result);
			}
		}		
	}
}