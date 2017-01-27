/**
 * @Generated
 */
package org.eclipse.xtext.example.fowlerdsl.web.editor.widget;

import java.util.ArrayList;
import java.util.List;

import org.dslforge.styledtext.BasicText;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
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
	protected void setupClient() {
		super.setupClient();
		List<IPath> languageResources = new ArrayList<IPath>();
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/fowlerdsl/web/ace/theme-statemachine.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/fowlerdsl/web/ace/mode-statemachine.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/fowlerdsl/web/ace/worker-statemachine.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/fowlerdsl/web/ace/snippets/statemachine.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/fowlerdsl/web/parser/antlr-all-min.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/fowlerdsl/web/parser/StatemachineParser.js"));
		languageResources.add(new Path("src-js/org/eclipse/xtext/example/fowlerdsl/web/parser/StatemachineLexer.js"));
		registerJsResources(languageResources, getClassLoader());
		loadJsResources(languageResources);
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Statemachine.class.getClassLoader();
		return classLoader;
	}
}
