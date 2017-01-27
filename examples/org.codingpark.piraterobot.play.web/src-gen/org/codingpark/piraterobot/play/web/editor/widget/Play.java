/**
 * @Generated
 */
package org.codingpark.piraterobot.play.web.editor.widget;

import java.util.ArrayList;
import java.util.List;

import org.dslforge.styledtext.BasicText;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.swt.widgets.Composite;

public class Play extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.codingpark.piraterobot.play.web.editor.widget.Play";
	
	public Play(Composite parent, int style) {
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
		languageResources.add(new Path("src-js/org/codingpark/piraterobot/play/web/ace/theme-play.js"));
		languageResources.add(new Path("src-js/org/codingpark/piraterobot/play/web/ace/mode-play.js"));
		languageResources.add(new Path("src-js/org/codingpark/piraterobot/play/web/ace/worker-play.js"));
		languageResources.add(new Path("src-js/org/codingpark/piraterobot/play/web/ace/snippets/play.js"));
		languageResources.add(new Path("src-js/org/codingpark/piraterobot/play/web/parser/antlr-all-min.js"));
		languageResources.add(new Path("src-js/org/codingpark/piraterobot/play/web/parser/PlayParser.js"));
		languageResources.add(new Path("src-js/org/codingpark/piraterobot/play/web/parser/PlayLexer.js"));
		registerJsResources(languageResources, getClassLoader());
		loadJsResources(languageResources);
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Play.class.getClassLoader();
		return classLoader;
	}
}
