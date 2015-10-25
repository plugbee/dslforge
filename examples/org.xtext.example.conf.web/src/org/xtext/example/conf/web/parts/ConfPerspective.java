package org.xtext.example.conf.web.parts;

import org.dslforge.rap.workspace.WorkspaceManager;
import org.dslforge.rap.workspace.navigator.BasicWokspaceNavigator;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Configures the perspective layout. This class is contributed 
 * through the plugin.xml.
 */
public class ConfPerspective implements IPerspectiveFactory {
	
	public static final String ID_PERSPECTIVE = "org.dslforge.core.ui.parts.perspective";
	private static final String VIEW_ID = "org.dslforge.rap.navigator.view";
	
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID_PERSPECTIVE);
		layout.setFixed(true);
		layout.addStandaloneView(VIEW_ID, true, IPageLayout.LEFT, 0.6f, editorArea);
		WorkspaceManager.getInstance().setWorkspaceRoot("E:\\dev\\www\\home\\conf");
	}
}
