package org.eclipse.sphinx.examples.xtext.hummingbird.web.editor;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.sphinx.examples.xtext.hummingbird.web.editor.widget.Hummingbird;
import org.eclipse.sphinx.examples.xtext.hummingbird.web.internal.Activator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class HummingbirdEditor extends BasicXtextEditor {

	private Hummingbird hummingbirdWidget;

	@Inject
	private Injector injector;

	public HummingbirdEditor() {
		super();
		setLanguageName("org.eclipse.sphinx.examples.xtext.hummingbird.Hummingbird");
		injector = Activator.getInstance().getInjector(getLanguageName());
		injector.injectMembers(this);
	}
	
	@Override
	protected void createWidget(Composite parent, Font font) {
		hummingbirdWidget = new Hummingbird(parent, SWT.FILL);
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
	protected Hummingbird getWidget() {
		return hummingbirdWidget;
	}
}

