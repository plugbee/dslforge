package org.eclipse.sphinx.examples.xtext.hummingbird.web.editor.widget;

import java.io.IOException;

import org.dslforge.xtext.common.BasicText;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.swt.widgets.Composite;

public class Hummingbird extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.eclipse.sphinx.examples.xtext.hummingbird.web.editor.widget.Hummingbird";
	
	public Hummingbird(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}

	@Override
	protected String getBasePath() {
		return "src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/";
	}
	
	@Override
	protected String getAntlrPath() {
		return "src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/parser/";
	}
	
	@Override
	protected String getAcePath() {
		return "src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/ace/";
	}
	
	@Override
	protected String getTemplatePath() {
		return "src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/ace/snippets/";
	}
	
	@Override
	protected void initAce() {
		super.initAce();
		getAceFiles().add("worker-hummingbird.js");
		getAceFiles().add("mode-hummingbird.js");
		getAceFiles().add("theme-eclipse.js");
		getAceFiles().add("ext-documentation.js");
		getAceFiles().add("ext-tooltip.js");
	}

	@Override 
	protected void initAntlr() {
		super.initAntlr();
		getAntlrFiles().add("InternalHummingbirdParser.js");
		getAntlrFiles().add("InternalHummingbirdLexer.js");
	}
	
	@Override
	protected void loadTemplateScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		jsLoader.require(resourceManager.getLocation(getTemplatePath()+ "hummingbird.js"));
	}
	
	@Override
	protected void registerTemplateResources(ResourceManager resourceManager) throws IOException {
		register(resourceManager, "hummingbird.js", getTemplatePath());
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Hummingbird.class.getClassLoader();
		return classLoader;
	}
}