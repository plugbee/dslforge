/*******************************************************************************
 * Copyright (c) 2013 DSLFORGE.
 ******************************************************************************/
package org.dslforge.example.java.web.editor.widget;

import java.io.IOException;

import org.dslforge.xtext.common.BasicText;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.swt.widgets.Composite;

public class Java extends BasicText {

	private static final long serialVersionUID = 3375229591119356098L;
	
	public static final String REMOTE_TYPE = "org.dslforge.example.java.web.editor.widget.Java";
	
	public Java(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}

	@Override
	protected String getBasePath() {
		return "src-js/org/dslforge/example/java/web/";
	}
	
	@Override
	protected String getAntlrPath() {
		return "src-js/org/dslforge/example/java/web/parser/";
	}
	
	@Override
	protected String getAcePath() {
		return "src-js/org/dslforge/example/java/web/ace/";
	}
	
	@Override
	protected String getTemplatePath() {
		return "src-js/org/dslforge/example/java/web/ace/snippets/";
	}
	
	@Override
	protected void initAce() {
		super.initAce();
		getAceFiles().add("mode-java.js");
		getAceFiles().add("theme-eclipse.js");
		getAceFiles().add("ext-documentation.js");
		getAceFiles().add("ext-tooltip.js");
	}
	
	@Override 
	protected void initAntlr() {
	}
	
	@Override
	protected void loadTemplateScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		//jsLoader.require(resourceManager.getLocation(getTemplatePath()+ "java.js"));
	}
	
	@Override
	protected void registerTemplateResources(ResourceManager resourceManager) throws IOException {
		//register(resourceManager, "java.js", getTemplatePath());
	}
	
	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Java.class.getClassLoader();
		return classLoader;
	}
}