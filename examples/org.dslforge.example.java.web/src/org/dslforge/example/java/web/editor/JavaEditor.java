/*******************************************************************************
 * Copyright (c) 2013 DSLFORGE.
 ******************************************************************************/
package org.dslforge.example.java.web.editor;

import org.dslforge.example.java.web.editor.widget.Java;
import org.dslforge.example.java.web.internal.Activator;
import org.dslforge.xtext.common.DefaultTextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;



public class JavaEditor extends DefaultTextEditor {

	private static final String LANGUAGE_NAME = "Java";
	
	private Java javaWidget;
	
	public JavaEditor() {
		super();
		setLanguageName(LANGUAGE_NAME);
//		injector = Activator.getInstance().getInjector(getLanguageName());
//		injector.injectMembers(this);
	}

	@Override
	protected void createWidget(Composite parent, Font font) {
		javaWidget = new Java(parent, SWT.FILL);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		getWidget().setLayoutData(textLayoutData);
		getWidget().setFont(font);
		//getWidget().addSaveListener(this);
	}

	@Override
	protected Java getWidget() {
		return javaWidget;
	}
}