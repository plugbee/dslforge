/**
 * @Generated
 */
package org.eclipse.xtext.example.domainmodel.web.editor;

import org.dslforge.styledtext.BasicText;
import org.dslforge.xtext.common.XtextContentAssistEnabledEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.example.domainmodel.web.editor.widget.Domainmodel;
import org.eclipse.xtext.example.domainmodel.web.internal.Activator;

public abstract class AbstractDomainmodelEditor extends XtextContentAssistEnabledEditor {

	public AbstractDomainmodelEditor() {
		super();
		setLanguageName(Activator.ORG_ECLIPSE_XTEXT_EXAMPLE_DOMAINMODEL_DOMAINMODEL);
		setInjector(Activator.getInstance().getInjector(Activator.ORG_ECLIPSE_XTEXT_EXAMPLE_DOMAINMODEL_DOMAINMODEL));
	}
	 
	@Override
	protected BasicText createTextWidget(Composite parent, int styles) {
		Domainmodel domainmodelWidget = new Domainmodel(parent, styles);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		domainmodelWidget.setLayoutData(textLayoutData);
		domainmodelWidget.setEditable(true);
		return domainmodelWidget;
	}
}
