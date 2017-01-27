/**
 * @Generated
 */
package org.eclipse.sphinx.examples.xtext.hummingbird.web.editor.widget;

import java.util.ArrayList;
import java.util.List;

import org.dslforge.styledtext.BasicText;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
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
	protected void setupClient() {
		super.setupClient();
		List<IPath> languageResources = new ArrayList<IPath>();
		languageResources.add(new Path("src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/ace/theme-hummingbird.js"));
		languageResources.add(new Path("src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/ace/mode-hummingbird.js"));
		languageResources.add(new Path("src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/ace/worker-hummingbird.js"));
		languageResources.add(new Path("src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/ace/snippets/hummingbird.js"));
		languageResources.add(new Path("src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/parser/antlr-all-min.js"));
		languageResources.add(new Path("src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/parser/HummingbirdParser.js"));
		languageResources.add(new Path("src-js/org/eclipse/sphinx/examples/xtext/hummingbird/web/parser/HummingbirdLexer.js"));
		registerJsResources(languageResources, getClassLoader());
		loadJsResources(languageResources);
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Hummingbird.class.getClassLoader();
		return classLoader;
	}
}
