package org.codingpark.piraterobot.generator;

public interface IAppendable {
	
	IAppendable append(CharSequence string);
	
	IAppendable increaseIndentation();
	
	IAppendable decreaseIndentation();
	
	IAppendable newLine();
}
