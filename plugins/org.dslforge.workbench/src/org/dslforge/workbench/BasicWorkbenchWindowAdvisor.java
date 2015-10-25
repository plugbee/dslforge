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

import org.dslforge.workbench.internal.Activator;
import org.dslforge.workbench.internal.BasicWorkbenchImageProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.client.service.UrlLauncher;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.cheatsheets.OpenCheatSheetAction;

/**
 * Configures the initial size and appearance of a workbench window.
 */
public class BasicWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public BasicWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}
	
	@SuppressWarnings("serial")
	@Override
	public void createWindowContents(Shell shell) {
	    // call standard eclipse method creating window contents
	    super.createWindowContents(shell);
		Device display = Display.getCurrent();

	    // override default banner
	    CBanner banner = findTopBanner(shell);
		Composite mainPanel = new Composite(banner, SWT.CENTER);		

        // Create the layout.
        RowLayout layout = new RowLayout();
        layout.type = SWT.HORIZONTAL;
        layout.center = true;
        layout.wrap = false;
        mainPanel.setLayout(layout);
       
		final String currentUser = (String) RWT.getUISession().getAttribute("user");
		String userName = Character.toUpperCase(currentUser.charAt(0)) + currentUser.substring(1);
	
        //1. Username + message
		Label messageButton = new Label(mainPanel, SWT.BORDER | SWT.CENTER);
		messageButton.setText(userName +" [online]");
		messageButton.setLocation(5, 5);
		messageButton.setToolTipText(userName);
		
		//2. Icon
		Label imageLabel = new Label(mainPanel, SWT.NONE | SWT.CENTER);
		imageLabel.setToolTipText(currentUser);
		ImageDescriptor imageDescriptor = Activator.getImageDescriptor(BasicWorkbenchImageProvider.USER);
		Image userImage = imageDescriptor.createImage();
		imageLabel.setImage(userImage);
		
		//3. Exit button
        Button exitButton = new Button(mainPanel, SWT.BORDER | SWT.CENTER);
        exitButton.setText("Sign out");
        exitButton.setFont(new Font(display,"Arial", 12, SWT.NO_BACKGROUND ));
        //exitButton.pack();
        exitButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				UrlLauncher launcher = RWT.getClient().getService( UrlLauncher.class );
				launcher.openURL( "http://www.dslforge.org/" );
				IWorkbench workbench = PlatformUI.getWorkbench();
				workbench.close();	
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
        
        mainPanel.pack();
		banner.setRight(mainPanel);
		int WIDTH = messageButton.getBounds().width + imageLabel.getBounds().width + exitButton.getBounds().width;		
		banner.setRightWidth(WIDTH);
	}
	
	
	/**
	 * Find CBanner among children of the given shell.
	 */
	private CBanner findTopBanner( Shell shell ) {
	    Control[] children = shell.getChildren();
	    CBanner result = null;
	    for ( Control child : children ) {
	        if ( child instanceof CBanner ) {
	            if ( result != null ) {
	                throw new IllegalStateException( "More than one CBanner." );
	            }
	            result = ( CBanner ) child;
	        }
	    }
	    if ( result == null ) {
	        throw new IllegalStateException( "No CBanner." );
	    }
	    return result;
	}

	public void preWindowOpen() {
		getWindowConfigurer().setShowPerspectiveBar(true);
		getWindowConfigurer().setShowStatusLine(true);
		getWindowConfigurer().setShowMenuBar( true );
		getWindowConfigurer().setTitle("DSLFORGE Workbench");
		getWindowConfigurer().setShellStyle(SWT.TITLE | SWT.MAX);
		Rectangle bounds = Display.getCurrent().getBounds();
		getWindowConfigurer().setInitialSize(new Point(bounds.width, bounds.height));
	}
	
	@SuppressWarnings("serial")
	@Override
	public void postWindowOpen() {
		Shell shell = getWindowConfigurer().getWindow().getShell();
		shell.setMaximized(true);
		
		//TODO: move this!
		OpenCheatSheetAction action = new OpenCheatSheetAction(IWorkbenchConstants.CHEAT_SHEET_VIEW_ID);
		action.run();
		
		//!!workaround!!
		Display.getCurrent().addListener(SWT.Resize, new Listener() {
			@Override
			public void handleEvent(Event event) {
				Rectangle bounds = event.display.getBounds();
				IWorkbenchWindow iww = getWindowConfigurer().getWindow();
				iww.getShell().setBounds(bounds);
			}
		});
	}
	
	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new BasicWorkbenchActionBarAdvisor(configurer);
	}
}
