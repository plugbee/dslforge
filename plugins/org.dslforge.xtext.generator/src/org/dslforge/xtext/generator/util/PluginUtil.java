///**
// * <copyright>
// *
// * Copyright (c) 2015 PlugBee. All rights reserved.
// * 
// * This program and the accompanying materials are made available 
// * under the terms of the Eclipse Public License v1.0 which 
// * accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     Amine Lajmi - Initial API and implementation
// *
// * </copyright>
// */
//package org.dslforge.xtext.generator.util;
//
//import java.io.ByteArrayInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.lang.reflect.InvocationTargetException;
//import java.util.ArrayList;
//import java.util.jar.Attributes;
//import java.util.jar.Manifest;
//
//import org.dslforge.xtext.generator.output.ImportManager;
//import org.dslforge.xtext.generator.output.StringAppendable;
//import org.eclipse.core.resources.IFile;
//import org.eclipse.core.resources.IFolder;
//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.ResourcesPlugin;
//import org.eclipse.core.runtime.CoreException;
//import org.eclipse.core.runtime.NullProgressMonitor;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.xtext.Grammar;
//
//public class PluginUtil {
//	
//	private static final String defaultDependeciesToAdd = "com.thalesgroup.mde.ae.core";
//	
//	private static final NullProgressMonitor Null_Progress_Monitor = new NullProgressMonitor();  
//	
//	private static final String indentation = "	";
//	
//	private static final String lineSeparator = "\n";
//
//	public static void doCreatePluginXml(final IProject project, final EObject context){
//		StringAppendable appendable = null;
//		if (context instanceof Grammar) {
//			appendable = createPluginXml(project, (Grammar) context);
//		} else {
//			appendable = createPluginXml(project, (Grammar) context);
//		}	
//		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(appendable.getContent().getBytes());
//		try {
//			IFile pluginXmlFile = project.getFile("plugin.xml");
//			if (pluginXmlFile.exists())
//				pluginXmlFile.setContents(fileInputStream, true, false, null);
//			else
//				pluginXmlFile.create(fileInputStream, true, null);
//			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
//			} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void doCreateManifest(final IProject project, final EObject context){
//		StringAppendable appendable = null;
//		if (context instanceof Grammar) {
//			appendable = createManifest(project, (Grammar) context);
//		} else {
//			appendable = createManifest(project, (Grammar) context);
//		}
//		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(appendable.getContent().getBytes());
//		try {
//			IFolder metaFolder = project.getFolder("META-INF");
//			IFile manifestFile = metaFolder.getFile("MANIFEST.MF");
//			if (manifestFile.exists())
//				manifestFile.setContents(fileInputStream, true, false, null);
//			else
//				manifestFile.create(fileInputStream, true, null);
//			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
//			} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void doCreateBuildProperties(final IProject project, final EObject context){
//		StringAppendable appendable = null;
//		if (context instanceof Grammar) {
//			appendable = createBuildProperties(project, (Grammar) context);
//		} else {
//			appendable = createBuildProperties(project, (Grammar) context);
//		}
//		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(appendable.getContent().getBytes());
//		try {
//			IFile pluginXmlFile = project.getFile("build.properties");
//			if (pluginXmlFile.exists())
//				pluginXmlFile.setContents(fileInputStream, true, false, null);
//			else
//				pluginXmlFile.create(fileInputStream, true, null);
//			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
//			} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
//
//	
//	private static String getNameSpaceURI(Grammar vp) {
//		return "http://www.dslforge.org/xtext/"+ vp.getName().toLowerCase();
//	}
//
//	/**
//	 * Creates the plugin.xml file of an evaluation computer
//	 * 
//	 * @param project
//	 * @param eval
//	 * @return
//	 */
//	public static StringAppendable createPluginXml(final IProject project, Grammar eval){
//		StringAppendable appendable = createAppendable(eval);		
//		appendable.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").newLine();
//		appendable.append("<?eclipse version=\"3.4\"?>").newLine();
//		appendable.append("<plugin>").newLine();
//		appendable.increaseIndentation().newLine();
//		appendable.append("<extension");
//		appendable.increaseIndentation().newLine();
//		appendable.append("point=\"com.thalesgroup.mde.modelreuse.resources\">").newLine();
//		appendable.append("<resource");
//		appendable.increaseIndentation().newLine();
//		appendable.append("domain=\"AE\"").newLine();
//		appendable.append("id=\"").append("toto").append(".computer").append("\"").newLine();
//		appendable.append("name=\"").append(eval.getName()).append(" computer").append("\"").newLine();
//		appendable.append("path=\"").append("toto").append(".computer").append(".ComputationManager").append("\"").newLine();
//		appendable.append("tags=\"").append("toto").append(", Computer\">");
//		appendable.decreaseIndentation().newLine();
//		appendable.append("</resource>").newLine();
//		appendable.append("</extension>");
//		appendable.decreaseIndentation().newLine();
//		appendable.append("</plugin>");
//		return appendable;
//	}
//
//
//	//Computer
//	public static StringAppendable createManifest(IProject project, Grammar context){	
//		String projectName = project.getName();			
//		StringAppendable appendable = createAppendable(context);
//		appendable.append("Manifest-Version: 1.0").newLine();
//		appendable.append("Bundle-ManifestVersion: 2").newLine();
//		appendable.append("Bundle-Name: " + projectName).newLine();
//		appendable.append("Bundle-SymbolicName: " + projectName + ";singleton:=true").newLine();
//		appendable.append("Bundle-Version: 1.0.0.qualifier").newLine();
//		appendable.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5").newLine();
//		appendable.append("Bundle-Vendor: THALESGROUP").newLine();
//		appendable.append("Require-Bundle: org.eclipse.emf,").newLine();
//		appendable.append(" com.thalesgroup.mde.ae.core,").newLine();
//		appendable.append(" com.thalesgroup.mde.af.model,").newLine();
//		appendable.append(" com.thalesgroup.mde.emde,").newLine();
//		appendable.append(" com.thalesgroup.mde.ae.lib").newLine();
//		return appendable;
//	}
//		
//	public  static StringAppendable createBuildProperties(IProject project, Grammar context){
//		StringAppendable appendable = createAppendable(context);
//		appendable.append("source.. = src/").newLine();
//		appendable.append("output.. = bin/").newLine();
//		appendable.append("bin.includes = META-INF/,\\");
//		appendable.increaseIndentation().newLine();
//		appendable.append(".,\\").newLine();
//		appendable.append("plugin.xml").newLine();
//		return appendable;
//	}
//	
//	public static void updateBuildProperties(final IProject project, final String content) throws InvocationTargetException, InterruptedException{
//		final String newContent = 
//		"source.. = src/\n" +
//		"output.. = bin/\n" +
//		"bin.includes = META-INF/,\\\n"+
//		"               .,\\\n"+
//		"               plugin.xml\n";
//		IFile file = project.getFile("build.properties");
//		ByteArrayInputStream outputContent = new ByteArrayInputStream(newContent.getBytes());	
//		try {
//			if (file.exists())
//				file.setContents(outputContent, true, false, null);
//			else
//				file.create(outputContent, true, null);
//			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void updatePluginXml(String projectName){
//		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
//		IFile xml = project.getFile("plugin.xml");
//		StringBuffer contents = new StringBuffer();
//		contents.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
//		contents.append("<?eclipse version=\"3.4\"?>\n");
//		contents.append("<plugin>\n");	
//		contents.append("</plugin>\n");
//		contents.append("\n");
//		try {
//			xml.setContents(new ByteArrayInputStream(contents.toString().getBytes()), 0, null);
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void updateManifest(final IProject project, final ArrayList<String> sematiqueRequiredBundles) throws InvocationTargetException, InterruptedException{
//		Manifest mf = new Manifest();
//		IFile manifestFile =  project.getFolder("META-INF").getFile("MANIFEST.MF");
//		try {
//			mf.read(manifestFile.getContents());
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}		
//		String executionEnvirement = mf.getMainAttributes().getValue("Bundle-RequiredExecutionEnvironment");
//		if (executionEnvirement == null || executionEnvirement.trim().length() == 0){
//			mf.getMainAttributes().put(new Attributes.Name("Bundle-RequiredExecutionEnvironment"), "J2SE-1.5\n");
//		}
//		String requiredBundles = mf.getMainAttributes().getValue("Require-Bundle");
//		String uiDependency = defaultDependeciesToAdd;
//		if (sematiqueRequiredBundles != null && sematiqueRequiredBundles.size() > 0){
//			for (String bundleID : sematiqueRequiredBundles) {
//				uiDependency += ", " + bundleID;
//			}
//			uiDependency += " \n  ";
//		}
//		boolean addrequiredBundles = true;
//		if (requiredBundles != null && requiredBundles.trim().length() > 0){
//			String[] dependecies = {requiredBundles};
//			// If there more then one dependency
//			if (requiredBundles.indexOf(",") != -1){
//				dependecies = requiredBundles.split(",");
//			}
//			uiDependency += ", ";
//			for (int i = 0; i < dependecies.length; i++) {
//				String plugName = dependecies[i];
//				if (dependecies[i].indexOf(";") != -1){
//					plugName = dependecies[i].subSequence(0, dependecies[i].indexOf(";")).toString();
//				}	
//				if (plugName.equals(defaultDependeciesToAdd)){
//					addrequiredBundles = false;
//					break;
//				}
//				if (i == dependecies.length -1)
//					uiDependency = uiDependency + dependecies[i] +" \n  ";
//				else
//					uiDependency = uiDependency + dependecies[i] +",";
//			}
//		}
//		if (addrequiredBundles){
//			mf.getMainAttributes().remove("Require-Bundle");
//			mf.getMainAttributes().put(new Attributes.Name("Require-Bundle"), uiDependency);
//			try {
//				mf.write(new FileOutputStream(manifestFile.getRawLocation().makeAbsolute().toFile()));
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			try {
//				manifestFile.refreshLocal(2, null);
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}
//		}
//		try {
//			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static StringAppendable createAppendable(ImportManager importManager, EObject context) {
//		StringAppendable appendable = new StringAppendable(importManager, context, indentation, lineSeparator);
//		return appendable;
//	}
//	
//	public static StringAppendable createAppendable(EObject context) {
//		StringAppendable appendable = new StringAppendable(context, indentation, lineSeparator);
//		return appendable;
//	}
//}