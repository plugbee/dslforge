/**
 * @Generated
 */
package org.eclipse.sphinx.examples.xtext.hummingbird.web.editor;

import org.dslforge.styledtext.BasicText;
import org.dslforge.xtext.common.XtextContentAssistEnabledEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.sphinx.examples.xtext.hummingbird.web.editor.widget.Hummingbird;
import org.eclipse.sphinx.examples.xtext.hummingbird.web.internal.Activator;

public abstract class AbstractHummingbirdEditor extends XtextContentAssistEnabledEditor {

	public AbstractHummingbirdEditor() {
		super();
		setLanguageName(Activator.ORG_ECLIPSE_SPHINX_EXAMPLES_XTEXT_HUMMINGBIRD);
		setInjector(Activator.getInstance().getInjector(Activator.ORG_ECLIPSE_SPHINX_EXAMPLES_XTEXT_HUMMINGBIRD));
	}
	
	@Override
	protected BasicText createTextWidget(Composite parent, int styles) {
		Hummingbird hummingbirdWidget = new Hummingbird(parent, styles);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		hummingbirdWidget.setLayoutData(textLayoutData);
		hummingbirdWidget.setEditable(true);
		return hummingbirdWidget;
	}
}
