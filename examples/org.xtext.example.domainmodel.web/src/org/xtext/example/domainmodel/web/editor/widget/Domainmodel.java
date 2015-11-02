package org.xtext.example.domainmodel.web.editor.widget;

import java.io.IOException;

import org.dslforge.xtext.common.BasicText;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.swt.widgets.Composite;

public class Domainmodel extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.xtext.example.domainmodel.web.editor.widget.Domainmodel";
	
	public Domainmodel(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}
	
	@Override
	protected String getBasePath() {
		return "src-js/org/xtext/example/domainmodel/web/";
	}
	
	@Override
	protected String getAntlrPath() {
		return "src-js/org/xtext/example/domainmodel/web/parser/";
	}
	
	@Override
	protected String getAcePath() {
		return "src-js/org/xtext/example/domainmodel/web/ace/";
	}
	
	@Override
	protected String getTemplatePath() {
		return "src-js/org/xtext/example/domainmodel/web/ace/snippets/";
	}
	
	@Override
	protected void initAce() {
		super.initAce();
		getAceFiles().add("worker-domainmodel.js");
		getAceFiles().add("mode-domainmodel.js");
		getAceFiles().add("theme-eclipse.js");
		getAceFiles().add("ext-documentation.js");
		getAceFiles().add("ext-tooltip.js");
	}

	@Override 
	protected void initAntlr() {
		super.initAntlr();
		getAntlrFiles().add("InternalDomainmodelParser.js");
		getAntlrFiles().add("InternalDomainmodelLexer.js");
	}
	
	@Override
	protected void loadTemplateScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		jsLoader.require(resourceManager.getLocation(getTemplatePath()+ "domainmodel.js"));
	}
	
	@Override
	protected void registerTemplateResources(ResourceManager resourceManager) throws IOException {
		register(resourceManager, "domainmodel.js", getTemplatePath());
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Domainmodel.class.getClassLoader();
		return classLoader;
	}
}
