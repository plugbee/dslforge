/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.workbench.parts;

import org.dslforge.workbench.IWorkbenchConstants;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPlaceholderFolderLayout;
import org.eclipse.ui.internal.cheatsheets.ICheatSheetResource;

/**
 * Configures the perspective layout. This class is contributed 
 * through the plugin.xml.
 */
public class BasicWorkbenchPerspective implements IPerspectiveFactory {
	
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(IWorkbenchConstants.ID_PERSPECTIVE);
		layout.setFixed(true);
		layout.addStandaloneView(IWorkbenchConstants.NAVIGATOR_VIEW_ID, true, IPageLayout.LEFT, 0.25f, editorArea);
		layout.getViewLayout(IWorkbenchConstants.NAVIGATOR_VIEW_ID).setCloseable(false);	
		layout.addStandaloneView(IPageLayout.ID_PROP_SHEET, true, IPageLayout.BOTTOM, 0.66f, editorArea);
		
		//layout.getViewLayout(ICheatSheetResource.CHEAT_SHEET_VIEW_ID).setCloseable(false);
		//IPlaceholderFolderLayout rightFolder = layout.getFolderForView(ICheatSheetResource.CHEAT_SHEET_VIEW_ID);
		//rightFolder.addPlaceholder(IWorkbenchConstants.BASIC_CHAT_VIEW_ID);		
		//layout.addStandaloneView(IWorkbenchConstants.BASIC_CHAT_VIEW_ID, true, IPageLayout.RIGHT, 0.66f, editorArea);
		//layout.getViewLayout(IWorkbenchConstants.BASIC_CHAT_VIEW_ID).setCloseable(false);	
		//layout.addStandaloneView(BasicWorkbenchView.ID, true, IPageLayout.RIGHT, 0.66f, editorArea);
		//layout.getViewLayout(BasicWorkbenchView.ID).setCloseable(false);
		//layout.addShowViewShortcut(ICheatSheetResource.CHEAT_SHEET_VIEW_ID); 		
		//layout.addStandaloneView(ICheatSheetResource.CHEAT_SHEET_VIEW_ID, true, IPageLayout.RIGHT, 0.66f, editorArea);

	}
}