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
package org.dslforge.antlr;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.antlr.Tool;
import org.antlr.tool.ErrorManager;
import org.antlr.tool.Grammar;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import antlr.RecognitionException;

/**
 * Run ANTLR v3 Parser Generator from command line.
 * 
 * [C:\Program Files\Java\jre7\bin\java, -classpath,
 * D:\dev\www\Mars\win32-x86_64\workspace\org.dslforge.antlr.generator\lib\antlr
 * -3.3-complete.jar, org.antlr.Tool, -lib,
 * D:\git\dslforge\examples\org.xtext.example.mydsl.web\src-js\org\xtext\example
 * \mydsl\web\parser, -o,
 * D:\git\dslforge\examples\org.xtext.example.mydsl.web\src-js\org\xtext\example
 * \mydsl\web\parser,
 * D:\git\dslforge\examples\org.xtext.example.mydsl.web\src-js\org\xtext\example
 * \mydsl\web\parser\InternalMyDsl.g]
 */
public class AntlrTool {

	static final Logger logger = Logger.getLogger(AntlrTool.class);
	
	private static final String ANTLR_JAR = "antlr-3.3-complete.jar";
	private static final String DSLFORGE_ANTLR_GENERATOR_PLUGIN = "org.dslforge.antlr.generator";
	private static final String ANTLR_MAIN_CLASS = "org.antlr.Tool";

	private static enum RunMode {
		FromEmbeddedJar, FromCommandLine
	}
	
	public static List<String> run(String workingDirectory, String grammarFileName) {
		return run(RunMode.FromEmbeddedJar,  workingDirectory, grammarFileName);
	}

	public static List<String> run(RunMode mode, String workingDirectory, String grammarFileName) {
		List<String> output = new ArrayList<String>();
		switch (mode) {
		case FromEmbeddedJar:
			return runFromEmbeddedJar(workingDirectory, grammarFileName);
		case FromCommandLine:
			return runFromCommandLine(workingDirectory, grammarFileName);
		default:
			return output;
		}
	}
	
	public static Grammar createGrammar(String workingDirectory, String grammarFileName) {
		List<String> command = new ArrayList<String>();
		command.add("-o");
		command.add(workingDirectory);
		command.add(grammarFileName);
		String[] args = command.toArray(new String[command.size()]);
		System.setErr(System.out);
		AntlrErrorListener errorListener = new AntlrErrorListener();
		ErrorManager.setErrorListener(errorListener);
		try {
			Tool tool = new Tool(args);
			Grammar rootGrammar = null;
			try {
				rootGrammar = tool.getRootGrammar(grammarFileName);
				rootGrammar.parseAndBuildAST();
				rootGrammar.composite.assignTokenTypes();
				rootGrammar.composite.defineGrammarSymbols();
				rootGrammar.composite.createNFAs();
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			} catch (RecognitionException e) {
				logger.error(e.getMessage(), e);
			}		
			return rootGrammar;
		} catch (Throwable throwable) {
			logger.error(throwable.getMessage(), throwable);
		}
		return null;
	}

	private static List<String> runFromEmbeddedJar(String workingDirectory, String grammarFileName) {
		List<String> command = new ArrayList<String>();
		command.add("-o");
		command.add(workingDirectory);
		command.add(grammarFileName);
		String[] args = command.toArray(new String[command.size()]);
		System.setErr(System.out);
		AntlrErrorListener errorListener = new AntlrErrorListener();
		ErrorManager.setErrorListener(errorListener);
		try {
			Tool tool = new Tool(args);
			tool.process();
		} catch (Throwable throwable) {
			logger.error(throwable.getMessage(), throwable);
		}
		return errorListener.getOutput();
	}

	private static List<String> runFromCommandLine(String workingDirectory, String grammarFileName) {
		List<String> output = new ArrayList<String>();
		try {
			List<String> command = new ArrayList<String>();
			IPath antlrAbsolutePath = getAntlrPath();
			command.add(getDefaultJavaEnvironment().toOSString());
			command.add("-classpath");
			command.add(antlrAbsolutePath.toOSString());
			command.add(ANTLR_MAIN_CLASS);
			command.add("-lib");
			command.add(workingDirectory);
			command.add("-o");
			command.add(workingDirectory);
			command.add(grammarFileName);
			ProcessBuilder pb = new ProcessBuilder(command);
			pb.directory(new File(workingDirectory));
			Process process;
			try {
				process = pb.start();
				process.waitFor();
				BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
				BufferedReader err = new BufferedReader(new InputStreamReader(process.getErrorStream()));
				String line = in.readLine();
				// output
				while (line != null) {
					System.err.println(line);
					output.add(line);
					line = in.readLine();
				}
				// errors
				line = err.readLine();
				while (line != null) {
					System.err.println(line);
					output.add(line);
					line = err.readLine();
				}
			} catch (IOException ex) {
				logger.error(ex.getMessage(), ex);
			} catch (InterruptedException ex) {
				logger.info(ex.getMessage(), ex);
			}
		} catch (IOException ex) {
			logger.error(ex.getMessage(), ex);
		}
		return output;
	}

	public static IPath getAntlrPath() throws IOException {
		Bundle bundle = Platform.getBundle(DSLFORGE_ANTLR_GENERATOR_PLUGIN);
		URL AntlrLibURL = bundle.getResource("lib/" + ANTLR_JAR);
		URL resolvedAntlrLibURL = FileLocator.resolve(AntlrLibURL);
		IPath antlrAbsolutePath = new Path(resolvedAntlrLibURL.getPath()).removeTrailingSeparator();
		return antlrAbsolutePath;
	}

	public static IPath getDefaultJavaEnvironment() {
		String javaHome = System.getProperty("java.home");
		IPath javaHomePath = new Path(javaHome);
		IPath javaPath = javaHomePath.append("bin").append("java");
		return javaPath;
	}
}