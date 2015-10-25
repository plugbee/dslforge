package org.eclipse.xtext.example.arithmetics.web.editor;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.example.arithmetics.web.editor.widget.Arithmetics;
import org.eclipse.xtext.example.arithmetics.web.internal.Activator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class ArithmeticsEditor extends BasicXtextEditor {

	private Arithmetics arithmeticsWidget;

	@Inject
	private Injector injector;

	public ArithmeticsEditor() {
		super();
		setLanguageName("org.eclipse.xtext.example.arithmetics.Arithmetics");
		injector = Activator.getInstance().getInjector(getLanguageName());
		injector.injectMembers(this);
	}
	
	@Override
	protected void createWidget(Composite parent, Font font) {
		arithmeticsWidget = new Arithmetics(parent, SWT.FILL);
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
	protected Arithmetics getWidget() {
		return arithmeticsWidget;
	}
}