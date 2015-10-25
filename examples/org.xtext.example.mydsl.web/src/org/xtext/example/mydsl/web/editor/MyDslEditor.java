package org.xtext.example.mydsl.web.editor;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.xtext.example.mydsl.web.editor.widget.MyDsl;
import org.xtext.example.mydsl.web.internal.Activator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class MyDslEditor extends BasicXtextEditor {

	private MyDsl myDslWidget;

	@Inject
	private Injector injector;

	public MyDslEditor() {
		super();
		setLanguageName("org.xtext.example.mydsl.MyDsl");
		injector = Activator.getInstance().getInjector(getLanguageName());
		injector.injectMembers(this);
	}
	
	@Override
	protected void createWidget(Composite parent, Font font) {
		myDslWidget = new MyDsl(parent, SWT.FILL);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		getWidget().setLayoutData(textLayoutData);
		getWidget().setFont(font);
		getWidget().addSaveListener(this);
		getWidget().addValidationListener(this);
	}

	@Override
	protected MyDsl getWidget() {
		return myDslWidget;
	}
}
