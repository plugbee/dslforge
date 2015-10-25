package org.xtext.example.mydsl.web.editor.widget;

import java.io.IOException;

import org.dslforge.xtext.common.BasicText;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.swt.widgets.Composite;

public class MyDsl extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.xtext.example.mydsl.web.editor.widget.MyDsl";
	
	public MyDsl(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}
	
	@Override
	protected String getBasePath() {
		return "src-js/org/xtext/example/mydsl/web/";
	}
	
	@Override
	protected String getAntlrPath() {
		return "src-js/org/xtext/example/mydsl/web/parser/";
	}
	
	@Override
	protected String getAcePath() {
		return "src-js/org/xtext/example/mydsl/web/ace/";
	}
	
	@Override
	protected String getTemplatePath() {
		return "src-js/org/xtext/example/mydsl/web/ace/snippets/";
	}
	
	@Override
	protected void initAce() {
		super.initAce();
		getAceFiles().add("worker-mydsl.js");
		getAceFiles().add("mode-mydsl.js");
		getAceFiles().add("theme-eclipse.js");
		getAceFiles().add("ext-documentation.js");
		getAceFiles().add("ext-tooltip.js");
	}

	@Override 
	protected void initAntlr() {
		super.initAntlr();
		getAntlrFiles().add("InternalMyDslParser.js");
		getAntlrFiles().add("InternalMyDslLexer.js");
	}
	
	@Override
	protected void loadTemplateScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		jsLoader.require(resourceManager.getLocation(getTemplatePath()+ "mydsl.js"));
	}
	
	@Override
	protected void registerTemplateResources(ResourceManager resourceManager) throws IOException {
		register(resourceManager, "mydsl.js", getTemplatePath());
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = MyDsl.class.getClassLoader();
		return classLoader;
	}
}
