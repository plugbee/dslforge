/**
 * <copyright>
 *
 * Copyright (c) 2017 PlugBee. All rights reserved.
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
package org.dslforge.texteditor.form;

import org.apache.log4j.Logger;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

public class TextFormEditorWithCanvasPage extends BasicTextFormEditorPage {

	static final Logger logger = Logger.getLogger(TextFormEditorWithCanvasPage.class);

	protected static final String FORM_EDITOR_PAGE_ID = "org.dslforge.texteditor.form.page.canvas";
	protected static final String FORM_EDITOR_PAGE_TITLE = "Content";
	protected static final String FORM_EDITOR_SECTION_TITLE = "Section";
	protected static final String FORM_EDITOR_FORM_TITLE = "Form";
	protected static final int SECTION_HEADER_VERTICAL_SPACING = 6;
	protected static final String FORM_EDITOR_CANVAS_TITLE = "Canvas";

	public TextFormEditorWithCanvasPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	public TextFormEditorWithCanvasPage(BasicTextFormEditor editor) {
		super(editor, FORM_EDITOR_PAGE_ID, FORM_EDITOR_PAGE_TITLE);
	}

	@Override
	protected void fillBody(IManagedForm managedForm, FormToolkit toolkit) {
		Composite body = managedForm.getForm().getBody();
		body.setLayout(new GridLayout(3, false));
		body.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_BOTH));
		createEditorSection(body, toolkit);
		createPanelSection(body, toolkit);
		createCanvasSection(body, toolkit);
	}

	protected void createPanelSection(Composite body, FormToolkit toolkit) {
		final String runButtonLabel = "Run";
		Button runButton = toolkit.createButton(body, runButtonLabel, SWT.PUSH);
		runButton.addSelectionListener(new SelectionListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void widgetSelected(SelectionEvent e) {
				handleRunButtonPressed(e);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//do nothing.
			}
		});
	}

	protected void handleRunButtonPressed(SelectionEvent e) {
		//implement in subclasses
	}

	protected void createCanvasSection(Composite body, FormToolkit toolkit) {
		Section section = createSection(body, toolkit, FORM_EDITOR_CANVAS_TITLE);
		Canvas canvas = new Canvas(section, SWT.NONE);
		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		canvas.setLayoutData(layoutData);
	}

	@Override
	protected void handleTextChanged(JsonObject object) {
		//disabled
	}
}