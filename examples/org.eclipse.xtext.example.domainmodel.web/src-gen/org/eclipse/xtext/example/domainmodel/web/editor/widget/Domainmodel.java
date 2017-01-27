/**
 * @Generated
 */
package org.eclipse.xtext.example.domainmodel.web.editor.widget;

import java.util.ArrayList;
import java.util.List;

import org.dslforge.styledtext.BasicText;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.swt.widgets.Composite;

public class Domainmodel extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.eclipse.xtext.example.domainmodel.web.editor.widget.Domainmodel";
	
	public Domainmodel(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}
	
	@Override 
	protected void setupClient() {
		super.setupClient();
		List<IPath> languageResources = new ArrayList<IPath>();
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/domainmodel/web/ace/theme-domainmodel.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/domainmodel/web/ace/mode-domainmodel.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/domainmodel/web/ace/worker-domainmodel.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/domainmodel/web/ace/snippets/domainmodel.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/domainmodel/web/parser/antlr-all-min.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/domainmodel/web/parser/DomainmodelParser.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/domainmodel/web/parser/DomainmodelLexer.js"));
		registerJsResources(languageResources, getClassLoader());
		loadJsResources(languageResources);
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Domainmodel.class.getClassLoader();
		return classLoader;
	}
}
