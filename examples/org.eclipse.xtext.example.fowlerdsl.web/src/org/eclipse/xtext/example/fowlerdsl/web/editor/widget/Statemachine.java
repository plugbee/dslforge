package org.eclipse.xtext.example.fowlerdsl.web.editor.widget;

import java.io.IOException;

import org.dslforge.xtext.common.BasicText;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.swt.widgets.Composite;

public class Statemachine extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.eclipse.xtext.example.fowlerdsl.web.editor.widget.Statemachine";
	
	public Statemachine(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}
	
	@Override
	protected String getBasePath() {
		return "src-js/org/eclipse/xtext/example/fowlerdsl/web/";
	}
	
	@Override
	protected String getAntlrPath() {
		return "src-js/org/eclipse/xtext/example/fowlerdsl/web/parser/";
	}
	
	@Override
	protected String getAcePath() {
		return "src-js/org/eclipse/xtext/example/fowlerdsl/web/ace/";
	}
	
	@Override
	protected String getTemplatePath() {
		return "src-js/org/eclipse/xtext/example/fowlerdsl/web/ace/snippets/";
	}
	
	@Override
	protected void initAce() {
		super.initAce();
		getAceFiles().add("worker-statemachine.js");
		getAceFiles().add("mode-statemachine.js");
		getAceFiles().add("theme-eclipse.js");
		getAceFiles().add("ext-documentation.js");
		getAceFiles().add("ext-tooltip.js");
	}

	@Override 
	protected void initAntlr() {
		super.initAntlr();
		getAntlrFiles().add("InternalStatemachineParser.js");
		getAntlrFiles().add("InternalStatemachineLexer.js");
	}
	
	@Override
	protected void loadTemplateScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		jsLoader.require(resourceManager.getLocation(getTemplatePath()+ "statemachine.js"));
	}
	
	@Override
	protected void registerTemplateResources(ResourceManager resourceManager) throws IOException {
		register(resourceManager, "statemachine.js", getTemplatePath());
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Statemachine.class.getClassLoader();
		return classLoader;
	}
}
