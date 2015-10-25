/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench;

import org.dslforge.workbench.actions.AddUserAction;
import org.dslforge.workbench.actions.ChangePwdAction;
import org.dslforge.workbench.actions.ConfigureSettingsAction;
import org.dslforge.workbench.actions.RemoveUserAction;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
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
	
	protected IMenuManager createFileMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("  File  ",
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createEditMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("  Edit  ",
		IWorkbenchActionConstants.M_EDIT);
		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));

		addToMenuAndRegister(menu, ActionFactory.UNDO.create(window));
		addToMenuAndRegister(menu, ActionFactory.REDO.create(window));
		menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));
		menu.add(new Separator());

		addToMenuAndRegister(menu, ActionFactory.CUT.create(window));
		addToMenuAndRegister(menu, ActionFactory.COPY.create(window));
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

	protected IMenuManager createToolsMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("  Tools  ", IWorkbenchActionConstants.M_EDIT);
		menu.add(new GroupMarker(TOOLS_START));
		// To hook a global action handler, a view should use the following
		// code:
		// IAction copyHandler = ...;
		// view.getSite().getActionBars().setGlobalActionHandler(IWorkbenchActionConstants.COPY,// copyHandler);
		//getActionBarConfigurer().registerGlobalAction(action);
		IAction configure = new ConfigureSettingsAction();
		addToMenuAndRegister(menu, configure);
		menu.add(new Separator());
		
		IAction addUser = new AddUserAction();
		addToMenuAndRegister(menu, addUser);	
		
		IAction removeUser = new RemoveUserAction();
		addToMenuAndRegister(menu, removeUser);
		
//		IAction changePwd = new ChangePwdAction();
//		addToMenuAndRegister(menu, changePwd);
//		getActionBarConfigurer().registerGlobalAction(changePwd);
	//	menu.add(new GroupMarker(TOOLS_END));
		
		return menu;
	}

	/**
	 * Creates the 'Help' menu.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createHelpMenu(IWorkbenchWindow window) {
		IMenuManager menu = new MenuManager("  Help  ", IWorkbenchActionConstants.M_HELP);
		// Welcome or intro page would go here
		// Help contents would go here
		// Tips and tricks page would go here

		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));
		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));
		// addToMenuAndRegister(menu,  ActionFactory.HELP_CONTENTS.create(window));
		// addToMenuAndRegister(menu,  ActionFactory.HELP_SEARCH.create(window));
		menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		return menu;
	}
	
	/**
	 * Adds the specified action to the given menu and also registers the action with the
	 * action bar configurer, in order to activate its key binding.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToMenuAndRegister(IMenuManager menuManager, IAction action) {
		menuManager.add(action);
		getActionBarConfigurer().registerGlobalAction(action);
	}
	
	protected void makeActions(IWorkbenchWindow window) {
	}
}
