package org.dslforge.xtext.common.util;

import java.io.File;

import org.eclipse.emf.common.util.URI;

public class FileUtil {

	public static String getFileExtension(File file) {
		String fileName = file.getName();
		int i = fileName.lastIndexOf('.');
		if (i > 0) {
		    return fileName.substring(i+1);
		}
		return null;
	}
	
	public static String getFileExtension(URI uri) {
		String[] segments = uri.segments();
		int len = segments.length;
		if (len == 0) return null;
		String lastSegment = segments[len - 1];
		int i = lastSegment.indexOf('.');
		return i < 0 ? null : lastSegment.substring(i + 1);
	}
}
