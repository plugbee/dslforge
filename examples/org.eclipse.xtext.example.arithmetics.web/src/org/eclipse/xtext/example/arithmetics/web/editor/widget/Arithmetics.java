package org.eclipse.xtext.example.arithmetics.web.editor.widget;

import java.io.IOException;

import org.dslforge.xtext.common.BasicText;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.swt.widgets.Composite;

public class Arithmetics extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.eclipse.xtext.example.arithmetics.web.editor.widget.Arithmetics";
	
	public Arithmetics(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}
	
	@Override
	protected String getBasePath() {
		return "src-js/org/eclipse/xtext/example/arithmetics/web/";
	}
	
	@Override
	protected String getAntlrPath() {
		return "src-js/org/eclipse/xtext/example/arithmetics/web/parser/";
	}
	
	@Override
	protected String getAcePath() {
		return "src-js/org/eclipse/xtext/example/arithmetics/web/ace/";
	}
	
	@Override
	protected String getTemplatePath() {
		return "src-js/org/eclipse/xtext/example/arithmetics/web/ace/snippets/";
	}
	
	@Override
	protected void initAce() {
		super.initAce();
		getAceFiles().add("worker-arithmetics.js");
		getAceFiles().add("mode-arithmetics.js");
		getAceFiles().add("theme-eclipse.js");
		getAceFiles().add("ext-documentation.js");
		getAceFiles().add("ext-tooltip.js");
	}

	@Override 
	protected void initAntlr() {
		super.initAntlr();
		getAntlrFiles().add("InternalArithmeticsParser.js");
		getAntlrFiles().add("InternalArithmeticsLexer.js");
	}
	
	@Override
	protected void loadTemplateScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		jsLoader.require(resourceManager.getLocation(getTemplatePath()+ "arithmetics.js"));
	}
	
	@Override
	protected void registerTemplateResources(ResourceManager resourceManager) throws IOException {
		register(resourceManager, "arithmetics.js", getTemplatePath());
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Arithmetics.class.getClassLoader();
		return classLoader;
	}
}
