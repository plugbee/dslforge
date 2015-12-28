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
package org.dslforge.xtext.generator.ui.factories;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.util.ProjectFactory;

public class StaticWebProjectFactory extends ProjectFactory {

	public StaticWebProjectFactory() {
		super();
		workspace = ResourcesPlugin.getWorkspace();
		workbench = PlatformUI.getWorkbench();
	}

	@Override
	protected void enhanceProject(IProject project, SubMonitor subMonitor, Shell shell) throws CoreException {
		super.enhanceProject(project, subMonitor, shell);
		final IFolder settings = project.getFolder(".settings");
		createFile(".jsdtscope", settings, getJsdtScope(), subMonitor);
		createFile("org.eclipse.wst.common.component", settings, getProjectModules(project.getName()), subMonitor);
		createFile("org.eclipse.wst.common.project.facet.core.xml", settings, getProjectFacet(), subMonitor);
		createFile("org.eclipse.wst.jsdt.ui.superType.container", settings, "org.eclipse.wst.jsdt.launching.baseBrowserLibrary", subMonitor);
		createFile("org.eclipse.wst.jsdt.ui.superType.name", settings, "Window", subMonitor);
	}

	private String getJsdtScope() {
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		content.append("<classpath>\n");
		content.append("	<classpathentry excluding=\"*.min.js|node_modules/*|bower_components/*\" kind=\"src\" path=\"WebContent\"/>\n");
		content.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.JRE_CONTAINER\"/>\n");
		content.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.WebProject\">\n");
		content.append("		<attributes>\n");
		content.append("			<attribute name=\"hide\" value=\"true\"/>\n");
		content.append("		</attributes>\n");
		content.append("	</classpathentry>\n");
		content.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.baseBrowserLibrary\"/>\n");
		content.append("	<classpathentry kind=\"output\" path=\"\"/>\n");
		content.append("</classpath>\n");
		return content.toString();
	}
	
	private String getProjectModules(String projectName) {
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?><project-modules id=\"moduleCoreId\" project-version=\"1.5.0\">\n");
		content.append("<wb-module deploy-name=\"" + projectName + "\">\n");
		content.append("	<wb-resource deploy-path=\"/\" source-path=\"/WebContent\"/>\n");
		content.append("	<property name=\"context-root\" value=\"" + projectName + "\"/>\n");
		content.append("</wb-module>\n");
		content.append("</project-modules>\n");
		return content.toString();
	}
	
	private String getProjectFacet() {
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		content.append("<faceted-project>\n");
		content.append("	<runtime name=\"HTTP Preview\"/>\n");
		content.append("	<fixed facet=\"wst.web\"/>\n");
		content.append("	<fixed facet=\"wst.jsdt.web\"/>\n");
		content.append("	<installed facet=\"wst.jsdt.web\" version=\"1.0\"/>\n");
		content.append("	<installed facet=\"wst.web\" version=\"1.0\"/>\n");
		content.append("</faceted-project>\n");
		return content.toString();
	}
}