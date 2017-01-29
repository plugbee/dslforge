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
package org.dslforge.texteditor.demo;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * Creates, adds and disposes actions for the menus and action bars of
 * each workbench window.
 */
public class BasicWorkbenchActionBarAdvisor extends ActionBarAdvisor {

	public static final String TOOLS_START = "toolsStart";
	public static final String TOOLS_END = "toolsStart";
	
	public BasicWorkbenchActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	protected void fillMenuBar(IMenuManager menuBar) {
		IWorkbenchWindow window = getActionBarConfigurer().getWindowConfigurer().getWindow();
		menuBar.add(createFileMenu(window));
		menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menuBar.add(createEditMenu(window));
		menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menuBar.add(createHelpMenu(window));		
	}
	
	/**
	 * Creates the 'File' menu
	 * 
	 * @param window
	 * @return
	 */
	protected IMenuManager createFileMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("File",
		IWorkbenchActionConstants.M_FILE);    
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
		IMenuManager newMenu = new MenuManager("New", "new");
		newMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menu.add(newMenu);
		menu.add(new Separator());
		menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menu.add(new Separator());
		addToMenuAndRegister(menu, ActionFactory.CLOSE.create(window));
		addToMenuAndRegister(menu, ActionFactory.CLOSE_ALL.create(window));
		menu.add(new Separator());
		addToMenuAndRegister(menu, ActionFactory.SAVE.create(window));
		addToMenuAndRegister(menu, ActionFactory.SAVE_AS.create(window));
		addToMenuAndRegister(menu, ActionFactory.SAVE_ALL.create(window));
		menu.add(new Separator());
		addToMenuAndRegister(menu, ActionFactory.QUIT.create(window));
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
		return menu;
	}

	/**
	 * Creates the 'Edit' menu.
	 * 
	 * @param window
	 * @return
	 */
	protected IMenuManager createEditMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("Edit",	IWorkbenchActionConstants.M_EDIT);
		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));
		addToMenuAndRegister(menu, ActionFactory.UNDO.create(window));
		addToMenuAndRegister(menu, ActionFactory.REDO.create(window));
		menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));
		menu.add(new Separator());
		addToMenuAndRegister(menu, ActionFactory.CUT.create(window));
		IWorkbenchAction copyAction = ActionFactory.COPY.create(window);	
		addToMenuAndRegister(menu, copyAction);
		addToMenuAndRegister(menu, ActionFactory.PASTE.create(window));
		menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));
		menu.add(new Separator());
		addToMenuAndRegister(menu, ActionFactory.DELETE.create(window));
		addToMenuAndRegister(menu, ActionFactory.SELECT_ALL.create(window));
		menu.add(new Separator());

		menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));

		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		return menu;
	}

	/**
	 * Creates the 'Tools'menu.
	 * 
	 * @param window
	 * @return
	 */
	protected IMenuManager createToolsMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("Tools", IWorkbenchActionConstants.M_EDIT);
		menu.add(new GroupMarker(TOOLS_START));
		return menu;
	}

	/**
	 * Creates the 'Help' menu.
	 * 
	 * @param window
	 * @return
	 */
	protected IMenuManager createHelpMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("Help", IWorkbenchActionConstants.M_HELP);
		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));
		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));
		return menu;
	}
	
	/**
	 * Adds the specified action to the given menu and also registers the action with the
	 * action bar configurer, in order to activate its key binding.
	 * 
	 * @param menuManager
	 * @param action
	 */
	protected void addToMenuAndRegister(IMenuManager menuManager, IAction action) {
		menuManager.add(action);
		getActionBarConfigurer().registerGlobalAction(action);
	}
	
	protected void makeActions(IWorkbenchWindow window) {
	}
}