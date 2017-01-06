package org.dslforge.workspace.ui.internal;

import java.util.HashMap;
import java.util.Map;

public interface IFileExtensionHandler {

	public static final String TEXT_EXTENSION = "txt";
	public static final String BINARY_EXTENSION = "class";
	public static final String JAVA_EXTENSION = "java";
	public static final String JS_EXTENSION = "js";
	public static final String JSON_EXTENSION = "json";
	
	public static Map<String, String> getAavailableFileExtensions() {
		Map<String, String> availableFileExtensions = new HashMap<String, String>();
		availableFileExtensions.put("Java", JAVA_EXTENSION);
		availableFileExtensions.put("JavaScript", JS_EXTENSION);
		availableFileExtensions.put("Json", JSON_EXTENSION);
		return availableFileExtensions;
	}
	
}
