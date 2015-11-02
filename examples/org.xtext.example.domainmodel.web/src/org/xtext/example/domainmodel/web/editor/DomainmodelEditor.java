package org.xtext.example.domainmodel.web.editor;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.xtext.example.domainmodel.web.editor.widget.Domainmodel;
import org.xtext.example.domainmodel.web.internal.Activator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class DomainmodelEditor extends BasicXtextEditor {

	private Domainmodel domainmodelWidget;

	@Inject
	private Injector injector;

	public DomainmodelEditor() {
		super();
		setLanguageName("org.xtext.example.Domainmodel");
		injector = Activator.getInstance().getInjector(getLanguageName());
		injector.injectMembers(this);
	}
	
	@Override
	protected void createWidget(Composite parent, Font font) {
		domainmodelWidget = new Domainmodel(parent, SWT.FILL);
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
	protected Domainmodel getWidget() {
		return domainmodelWidget;
	}
}
