/*******************************************************************************
 * Copyright (c) 2009, 2012 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    EclipseSource - initial API and implementation
 ******************************************************************************/
package org.dslforge.workbench.theme.business.builder;

import org.dslforge.workbench.theme.ILayoutSetConstants;
import org.dslforge.workbench.theme.builder.DummyBuilder;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.graphics.Graphics;
import org.eclipse.rap.ui.interactiondesign.layout.ElementBuilder;
import org.eclipse.rap.ui.interactiondesign.layout.model.LayoutSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class HeaderBuilder extends ElementBuilder {

	private static final int LOGOSPACING = 20;
	private Image left;
	private Image leftBg;
	private Image logo;
	private Image user;
	private Image right;
	private Image rightBg;
	private Image wave;
	private FormData fdLogo;
	private FormData fdUser;
	private Control toolBar;
	private Composite leftArea;
	private Composite waveArea;

	public HeaderBuilder(Composite parent, String layoutSetId) {
		super(parent, layoutSetId);
		initLayoutData();
	}

	private void initLayoutData() {
		LayoutSet set = getLayoutSet();
		// images
		left = createImage(set.getImagePath(ILayoutSetConstants.HEADER_LEFT));
		leftBg = createImage(set.getImagePath(ILayoutSetConstants.HEADER_LEFT_BG));
		right = createImage(set.getImagePath(ILayoutSetConstants.HEADER_RIGHT));
		rightBg = createImage(set.getImagePath(ILayoutSetConstants.HEADER_RIGHT_BG));
		wave = createImage(set.getImagePath(ILayoutSetConstants.HEADER_WAVE));

		// logo
		ElementBuilder builder = new DummyBuilder(null,	ILayoutSetConstants.SET_ID_LOGO);
		logo = builder.getImage(ILayoutSetConstants.LOGO);
		
		//user
		user = builder.getImage(ILayoutSetConstants.USER);
		
		// positions
		LayoutSet layoutSet = (LayoutSet) builder.getAdapter(LayoutSet.class);
		fdLogo = layoutSet.getPosition(ILayoutSetConstants.LOGO_POSITION);
		fdUser = layoutSet.getPosition(ILayoutSetConstants.USER_POSITION);
	}

	public void addControl(Control control, Object layoutData) {
		toolBar = control;
		toolBar.setLayoutData(layoutData);
	}

	public void addControl(Control control, String positionId) {
	}

	public void addImage(Image image, Object layoutData) {
	}

	public void addImage(Image image, String positionId) {
	}

	public void build() {
		getParent().setLayout(new FormLayout());
		getParent().setBackgroundMode(SWT.INHERIT_FORCE);

		// left border
		Label leftLabel = new Label(getParent(), SWT.NONE);
		leftLabel.setImage(left);
		FormData fdLeftLabel = new FormData();
		leftLabel.setLayoutData(fdLeftLabel);
		fdLeftLabel.left = new FormAttachment(0, 0);
		fdLeftLabel.top = new FormAttachment(0, 0);
		fdLeftLabel.width = left.getBounds().width;
		fdLeftLabel.height = left.getBounds().height;

		leftArea = new Composite(getParent(), SWT.NONE);
		leftArea.setLayout(new FormLayout());
		leftArea.setBackgroundImage(leftBg);
		FormData fdLeftArea = new FormData();
		leftArea.setLayoutData(fdLeftArea);
		fdLeftArea.left = new FormAttachment(leftLabel);
		fdLeftArea.top = new FormAttachment(0, 0);
		fdLeftArea.height = leftBg.getBounds().height;

		waveArea = new Composite(getParent(), SWT.NONE);
		waveArea.setLayout(new FormLayout());
		waveArea.setBackgroundImage(wave);
		final FormData fdWaveArea = new FormData();
		waveArea.setLayoutData(fdWaveArea);
		fdWaveArea.left = new FormAttachment(leftArea);
		fdWaveArea.top = new FormAttachment(0, 0);
		fdWaveArea.width = wave.getBounds().width;
		fdWaveArea.height = wave.getBounds().height;

		final Label rightLabel = new Label(getParent(), SWT.NONE);
		rightLabel.setImage(right);
		FormData fdRightLabel = new FormData();
		rightLabel.setLayoutData(fdRightLabel);
		fdRightLabel.right = new FormAttachment(100, -1);
		fdRightLabel.top = new FormAttachment(0, 0);
		fdRightLabel.width = right.getBounds().width;
		fdRightLabel.height = right.getBounds().height;

		final Composite logoArea = new Composite(getParent(), SWT.NONE);
		logoArea.setLayout(new FormLayout());
		logoArea.setBackgroundImage(rightBg);
		FormData fdLogoArea = new FormData();
		logoArea.setLayoutData(fdLogoArea);
		fdLogoArea.right = new FormAttachment(rightLabel);
		fdLogoArea.top = new FormAttachment(0, 0);
		fdLogoArea.height = rightBg.getBounds().height;
		fdLogoArea.width = calculateLogoWidth(logo.getBounds().width);
		// fdLogoArea.left = new FormAttachment( waveArea );

//		Label logoLabel = new Label(logoArea, SWT.NONE);
//		logoLabel.setImage(logo);
//		logoLabel.setLayoutData(fdLogo);
//		fdLogo.height = logo.getBounds().height;
//		fdLogo.width = logo.getBounds().width;
//		fdLeftArea.right = new FormAttachment(logoArea);
		
			
		Composite mainPanel = new Composite(logoArea, SWT.NONE);		
		//mainPanel.setImage(logo);
		mainPanel.setLayoutData(fdLogo);
		fdLogo.height = logo.getBounds().height;
		fdLogo.width = logo.getBounds().width;
		fdLeftArea.right = new FormAttachment(logoArea);		
		//mainPanel.setBackground(Graphics.getColor(45, 25, 247));
		
        // Create the layout.
        RowLayout layout = new RowLayout();
        layout.type = SWT.HORIZONTAL;
        layout.center = true;
        layout.marginTop = 17;
        layout.wrap = false;
        mainPanel.setLayout(layout);
       
            
		final String currentUser = (String) RWT.getUISession().getAttribute("user");
		String userName = Character.toUpperCase(currentUser.charAt(0)) + currentUser.substring(1);
	
        //1. Username + message
	//	Label messageButton = new Label(mainPanel, SWT.BORDER | SWT.CENTER);
	//	mainPanel.setImage(logo);
//		messageButton.setLayoutData(fdLogo);
//		fdLogo.height = logo.getBounds().height;
//		fdLogo.width = logo.getBounds().width;
//		fdLeftArea.right = new FormAttachment(logoArea);
		
		
		
	//	messageButton.setText(userName+" [online]");
	//	messageButton.setLocation(5, 5);
		
		//2. Icon
		Label imageLabel = new Label(mainPanel, SWT.BORDER | SWT.CENTER);
		imageLabel.setToolTipText(currentUser);
		imageLabel.setText(userName+" [online]");
		
		
		//3. Exit button
        Button exitButton = new Button(mainPanel, SWT.NONE | SWT.CENTER | SWT.LEFT_TO_RIGHT);
        exitButton.setToolTipText("Exit");
        exitButton.setImage(user);
        exitButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IWorkbench workbench = PlatformUI.getWorkbench();
				workbench.close();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
 //       mainPanel.pack();
//		banner.setRight(mainPanel);
//		int WIDTH = messageButton.getBounds().width + imageLabel.getBounds().width + exitButton.getBounds().width;		
//		banner.setRightWidth(WIDTH);

		
		
		
	}

	private int calculateLogoWidth(final int logoWidth) {
		int width = logoWidth + (wave.getBounds().width * 2) + LOGOSPACING;
		return width;
	}

	public void dispose() {
	}

	public Control getControl() {
		return leftArea;
	}

	public Point getSize() {
		return leftArea.getSize();
	}

	public Object getAdapter(Class adapter) {
		Object result = null;
		if (adapter == Composite.class) {
			result = waveArea;
		}
		return result;
	}
}
