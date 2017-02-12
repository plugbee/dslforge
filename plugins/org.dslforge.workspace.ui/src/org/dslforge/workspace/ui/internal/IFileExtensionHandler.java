package org.dslforge.workspace.ui.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IFileExtensionHandler {

	public static final String TEXT_EXTENSION = "txt";
	public static final String BINARY_EXTENSION = "class";
	public static final String JAVA_EXTENSION = "java";
	public static final String JS_EXTENSION = "js";
	public static final String JSON_EXTENSION = "json";
	public static final String HTML_EXTENSION = "html";
	public static final String CSS_EXTENSION = "css";
	
	@SuppressWarnings("serial")
	static final LinkedHashMap<String, String> AVAILABLE_FILE_EXTENSIONS = new LinkedHashMap<String,String>(){{
		put(TEXT_EXTENSION, "Plain text");
		put(JAVA_EXTENSION, "Java");
		put(JS_EXTENSION, "JavaScript");
		put(JSON_EXTENSION, "Json");
		put(HTML_EXTENSION, "HTML");
		put(CSS_EXTENSION, "CSS");
	}};

	public static Map<String, String> getAavailableFileExtensions() {
		return AVAILABLE_FILE_EXTENSIONS;
	}

	public static int getSelectionIndex(String fileName) {
		List<String> keys = new ArrayList<String>(AVAILABLE_FILE_EXTENSIONS.keySet());
		int index = -1;
		for (int i = 0; i < keys.size(); i++) {
		    String extension = keys.get(i);
		    if (fileName.endsWith(extension)) {
				index = keys.indexOf(extension);
				break;
			}
		}
		return index;
	}

	public static String getLanguageName(String fileExtension) {
		return AVAILABLE_FILE_EXTENSIONS.get(fileExtension);
	}
}
