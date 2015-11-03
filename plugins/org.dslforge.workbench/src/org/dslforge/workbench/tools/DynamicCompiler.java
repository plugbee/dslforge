/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.workbench.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.dslforge.workbench.IWorkbenchConstants;
import org.eclipse.core.runtime.Platform;

/**
 * Live Java compiler used to run generated Java classes on the server.
 * 
 * @author lajmi
 *
 */
public class DynamicCompiler implements ICompiler{
	
	private final String classpath;
	
	public DynamicCompiler() {
		this.classpath = computeBootClassPath();
	}
	
	static String computeBootClassPath() {
		String location = System.getProperty("java.class.path") + ";";
		for (String entry: IWorkbenchConstants.COMPILER_CLASSPATH_ENTRIES) {
			location += getRelativePath(entry)+ ";";
		}
		return location;
	}

	static String getRelativePath(String symbolicName) {;
		final String prefix = "initial@reference:file:";
		String osgiRef = Platform.getBundle(symbolicName).getLocation().replace("/", "\\");
		return IWorkbenchConstants.WAR_DEPLOYMENT_PATH + osgiRef.substring(prefix.length(), osgiRef.length());
	}
	
	/**
	 * This function builds a classpath from the passed Strings
	 * 
	 * @param paths classpath elements
	 * @return returns the complete classpath with wildcards expanded
	 */
	protected String buildClassPath(String... paths) {
	    StringBuilder sb = new StringBuilder();
	    for (String path : paths) {
	        if (path.endsWith("*")) {
	            path = path.substring(0, path.length() - 1);
	            File pathFile = new File(path);
	            for (File file : pathFile.listFiles()) {
	                if (file.isFile() && file.getName().endsWith(".jar")) {
	                    sb.append(path);
	                    sb.append(file.getName());
	                    sb.append(System.getProperty("path.separator"));
	                }
	            }
	        } else {
	            sb.append(path);
	            sb.append(System.getProperty("path.separator"));
	        }
	    }
	    return sb.toString();
	}
	
	/**
	 * ToolProvider.getSystemJavaCompiler requires that tools.jar is
	 * either on the bootclasspath, or in the jre lib directory. Simply
	 * having tools.jar on the classpath does not work.
	 */	
	public boolean doCompile(String srcFilePath) throws Exception {
		Iterable<String> options = Arrays.asList("-classpath", classpath);
		File sourceFile = new File(srcFilePath);
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		List<File> files = new ArrayList<File>();
		String[] split = classpath.split(";");
		for (String fileName: split) {
			System.out.println("[DSLFORGE] adding jar file: " + fileName);
			files.add(new File(fileName));
		}
		fileManager.setLocation(StandardLocation.CLASS_PATH, files);
		fileManager.setLocation(StandardLocation.CLASS_OUTPUT,Arrays.asList(sourceFile.getParentFile()));
		Iterable<? extends JavaFileObject> file = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sourceFile));
		JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager,	null, options, null, file);
		boolean result = task.call();
		fileManager.close();
		return result;
	}
}