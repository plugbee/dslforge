package org.codingpark.piraterobot.generator;

import org.eclipse.emf.ecore.EObject;

public interface ITreeAppendable extends IAppendable {
	
	ITreeAppendable trace(EObject object);
	
	ITreeAppendable append(CharSequence string);
	
	ITreeAppendable increaseIndentation();
	
	ITreeAppendable decreaseIndentation();
	
	ITreeAppendable newLine();

	ITreeAppendable removeLast();
}
