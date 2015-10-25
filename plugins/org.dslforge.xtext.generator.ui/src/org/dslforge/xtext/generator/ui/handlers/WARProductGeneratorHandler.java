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
package org.dslforge.xtext.generator.ui.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.Grammar;

public class WARProductGeneratorHandler extends AbstractHandler {

	private IProject container = null;

	private String dslProjectName;
	
	private String webProjectName;
	
	private String grammarShortName;

	public WARProductGeneratorHandler(IProject container, Grammar grammar) {
		super();
		this.container = container;
		this.dslProjectName = GeneratorUtil.getDslProjectName(grammar);
		this.webProjectName = GeneratorUtil.getProjectName(grammar);
		this.grammarShortName = GeneratorUtil.getGrammarShortName(grammar);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return null;
	}
	
	public void doGenerate(IFile file) {
		IPath fileLocation = file.getLocation();
		writeToFile(fileLocation.toOSString());
		try {
			container.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (CoreException ex) {
			ex.printStackTrace();
		}
	}

	protected File writeToFile(String filePath) {
		File warProductFile = new File(filePath);
		try {
			if (!warProductFile.exists())
				warProductFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter writer;
		try {
			writer = new PrintWriter(filePath.toString(), "UTF-8");
			writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			writer.println("<?pde version=\"3.5\"?>");
			writer.println("<product name=\"" + grammarShortName + "\" uid=\"" + grammarShortName + "\" version=\"1.0\" useFeatures=\"false\" includeLaunchers=\"false\">");
			writer.println("<plugins>");
			writer.println("<plugin id=\"com.google.guava\"/>");
			writer.println("<plugin id=\"com.google.inject\"/>");
			writer.println("<plugin id=\"com.ibm.icu.base\"/>");
			writer.println("<plugin id=\"javax.inject\"/>");
			writer.println("<plugin id=\"javax.xml\"/>");
			writer.println("<plugin id=\"org.antlr.runtime\"/>");
			writer.println("<plugin id=\"org.apache.commons.cli\"/>");
			writer.println("<plugin id=\"org.apache.commons.lang\"/>");
			writer.println("<plugin id=\"org.apache.commons.logging\"/>");
			writer.println("<plugin id=\"org.apache.felix.gogo.command\"/>");
			writer.println("<plugin id=\"org.apache.felix.gogo.runtime\"/>");
			writer.println("<plugin id=\"org.apache.felix.gogo.shell\"/>");
			writer.println("<plugin id=\"org.apache.log4j\"/>");
			writer.println("<plugin id=\"org.dslforge.rap.xtext.common\"/>");
			writer.println("<plugin id=\"org.dslforge.rap.navigator\"/>");
			writer.println("<plugin id=\"org.dslforge.rap.security\"/>");
			writer.println("<plugin id=\"org.dslforge.rap.themes\"/>");
			writer.println("<plugin id=\"org.eclipse.core.commands\"/>");
			writer.println("<plugin id=\"org.eclipse.core.contenttype\"/>");
			writer.println("<plugin id=\"org.eclipse.core.databinding\"/>");
			writer.println("<plugin id=\"org.eclipse.core.databinding.beans\"/>");
			writer.println("<plugin id=\"org.eclipse.core.databinding.observable\"/>");
			writer.println("<plugin id=\"org.eclipse.core.databinding.property\"/>");
			writer.println("<plugin id=\"org.eclipse.core.expressions\"/>");
			writer.println("<plugin id=\"org.eclipse.core.jobs\"/>");
			writer.println("<plugin id=\"org.eclipse.core.runtime\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.common\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.ecore\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.ecore.change\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.ecore.xmi\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.edit\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.mwe.core\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.mwe.utils\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.mwe2.runtime\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.rap.common.ui\"/>");
			writer.println("<plugin id=\"org.eclipse.emf.rap.edit.ui\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.app\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.common\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.console\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.http.registry\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.http.servlet\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.http.servletbridge\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.preferences\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.registry\"/>");
			writer.println("<plugin id=\"org.eclipse.equinox.security\"/>");
			writer.println("<plugin id=\"org.eclipse.help\"/>");
			writer.println("<plugin id=\"org.eclipse.osgi\"/>");
			writer.println("<plugin id=\"org.eclipse.osgi.services\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.jface\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.jface.databinding\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.rwt\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.rwt.osgi\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.ui\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.ui.navigator\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.ui.forms\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.ui.views\"/>");
			writer.println("<plugin id=\"org.eclipse.rap.ui.workbench\"/>");
			writer.println("<plugin id=\"org.eclipse.xpand\"/>");
			writer.println("<plugin id=\"org.eclipse.xtend\"/>");
			writer.println("<plugin id=\"org.eclipse.xtend.lib\"/>");
			writer.println("<plugin id=\"org.eclipse.xtend.typesystem.emf\"/>");
			writer.println("<plugin id=\"org.eclipse.xtext\"/>");
			writer.println("<plugin id=\"org.eclipse.xtext.common.types\"/>");
			writer.println("<plugin id=\"org.eclipse.xtext.ecore\"/>");
			writer.println("<plugin id=\"org.eclipse.xtext.generator\"/>");
			writer.println("<plugin id=\"org.eclipse.xtext.smap\"/>");
			writer.println("<plugin id=\"org.eclipse.xtext.util\"/>");
			writer.println("<plugin id=\"org.eclipse.xtext.xbase.lib\"/>");
			writer.println("<plugin id=\"org.objectweb.asm\"/>");
			writer.println("<plugin id=\"" + dslProjectName + "\"/>");
			writer.println("<plugin id=\"" + webProjectName + "\"/>");
			writer.println("</plugins>");

			writer.println("<configurations>");
			writer.println("<plugin id=\"com.google.guava\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"com.google.inject\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"com.ibm.icu.base\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"javax.inject\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"javax.xml\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.antlr.runtime\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.apache.commons.cli\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.apache.commons.lang\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.apache.commons.logging\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.apache.felix.gogo.command\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.apache.felix.gogo.runtime\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.apache.felix.gogo.shell\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.apache.log4j\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.dslforge.rap.xtext.common\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.dslforge.rap.navigator\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.commands\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.contenttype\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.databinding\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.databinding.beans\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.databinding.observable\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.databinding.property\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.expressions\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.jobs\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.core.runtime\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.common\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.ecore\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.ecore.change\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.ecore.xmi\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.edit\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.mwe.core\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.mwe.utils\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.mwe2.runtime\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.rap.common.ui\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.emf.rap.edit.ui\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.app\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.common\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.console\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.http.registry\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.http.servlet\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.http.servletbridge\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.preferences\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.equinox.registry\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.help\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.osgi\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.osgi.services\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.jface\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.jface.databinding\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.rwt\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.rwt.osgi\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.ui\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.ui.forms\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.ui.navigator\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.ui.views\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.rap.ui.workbench\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xpand\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtend\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtend.lib\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtend.typesystem.emf\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtext\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtext.common.types\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtext.ecore\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtext.generator\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtext.smap\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtext.util\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.eclipse.xtext.xbase.lib\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"org.objectweb.asm\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"" + dslProjectName + "\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("<plugin id=\"" + webProjectName + "\" autoStart=\"true\" startLevel=\"0\" />");
			writer.println("</configurations>");

			writer.println("<warConfiguration webXml=\"/" + container.getName() + "/WEB-INF/web.xml\" launchIni=\"/" + container.getName() + "/WEB-INF/launch.ini\">");
			writer.println("<libraries>");
			writer.println("<library path=\"org.eclipse.equinox.servletbridge_1.2.300.v20130508-1243.jar\" fromTarget=\"true\"/>");
			writer.println("</libraries>");
			writer.println("</warConfiguration>");
			writer.println("</product>");

			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return warProductFile;
	}
}