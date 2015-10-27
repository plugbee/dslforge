package org.eclipse.xtext.example.fowlerdsl.web.editor;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.example.fowlerdsl.web.editor.widget.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.web.internal.Activator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class StatemachineEditor extends BasicXtextEditor {

	private Statemachine statemachineWidget;

	@Inject
	private Injector injector;

	public StatemachineEditor() {
		super();
		setLanguageName("org.eclipse.xtext.example.fowlerdsl.Statemachine");
		injector = Activator.getInstance().getInjector(getLanguageName());
		injector.injectMembers(this);
	}
	
	@Override
	protected void createWidget(Composite parent, Font font) {
		statemachineWidget = new Statemachine(parent, SWT.FILL);
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
	protected Statemachine getWidget() {
		return statemachineWidget;
	}
}
