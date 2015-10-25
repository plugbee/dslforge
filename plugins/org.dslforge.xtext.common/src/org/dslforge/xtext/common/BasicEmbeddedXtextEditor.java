///**
// * <copyright>
// *
// * Copyright (c) 2015 DSLFORGE. All rights reserved.
// * 
// * This program and the accompanying materials are made available 
// * under the terms of the Eclipse Public License v1.0 which 
// * accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     Amine Lajmi - Initial API and implementation
// *
// * </copyright>
// */
//package org.dslforge.xtext.common;
//
//import org.eclipse.rap.rwt.RWT;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.graphics.Font;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Text;
//import org.eclipse.ui.forms.IMessageManager;
//import org.eclipse.ui.forms.widgets.FormToolkit;
//import org.eclipse.ui.forms.widgets.ScrolledForm;
//import org.eclipse.ui.forms.widgets.Section;
//
//public class BasicEmbeddedXtextEditor extends BasicXtextEditor {
//
//	@Override
//	public void createPartControl(Composite parent) {
//		Font font = parent.getFont();
//		GridLayout gridLayout = new GridLayout();
//		gridLayout.numColumns = 1;
//		parent.setLayout(gridLayout);
//
//		
//		FormToolkit toolkit = new FormToolkit(parent.getDisplay());
//		ScrolledForm form = toolkit.createScrolledForm(parent);
//		form.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));	
//		form.setText("Level 1");
//		form.getBody().setLayout(new GridLayout());
//		form.getBody().setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));
//		toolkit.decorateFormHeading(form.getForm());
//		
//		Section section = toolkit.createSection(form.getBody(),	Section.TITLE_BAR);
//		section.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));
//		section.setText("void main() {");
//
//		Composite sbody = toolkit.createComposite(section);
//		section.setClient(sbody);
//
//		createWidget(sbody, font);
//		setInput();
//		setDirty(false);
//		addListeners();
//		
////		createUserField("User: ", toolkit, sbody, messageManager);
////		createMessageTextField("Message: ", toolkit, sbody, messageManager);
////
////		final Button sendButton = toolkit.createButton(form.getBody(),"Share", SWT.PUSH);
////		GridData buttonLayout = new GridData(GridData.FILL_HORIZONTAL);
////		buttonLayout.grabExcessHorizontalSpace=true;
////		buttonLayout.horizontalSpan=2;
////		sendButton.setLayoutData(buttonLayout);
////
////		sendButton.addSelectionListener(new SelectionAdapter() {
////			public void widgetSelected(SelectionEvent e) {
////			}
////		});
//	}
//	
//	private void createUserField(String label, FormToolkit toolkit,
//			Composite parent, final IMessageManager mmng) {
//		toolkit.createLabel(parent, label);
//		String currentUser = (String) RWT.getUISession().getAttribute("user");
//		Text nameText = toolkit.createText(parent, currentUser);
//		nameText.setEditable(false);
//		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
//		nameText.setLayoutData(gd);
//	}
//
//	private void createMessageTextField(String label, FormToolkit toolkit, Composite parent, final IMessageManager mmng) {
//		toolkit.createLabel(parent, label);	
//		Text messageText = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.NO_SCROLL | SWT.V_SCROLL);
//		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutData.heightHint = 3*messageText.getLineHeight();
//		messageText.setLayoutData(layoutData);
//		messageText.setFocus();
//	}
//}
