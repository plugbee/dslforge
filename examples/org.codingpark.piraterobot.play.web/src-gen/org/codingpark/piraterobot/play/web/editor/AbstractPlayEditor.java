/**
 * @Generated
 */
package org.codingpark.piraterobot.play.web.editor;

import org.dslforge.styledtext.BasicText;
import org.dslforge.xtext.common.XtextContentAssistEnabledEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.codingpark.piraterobot.play.web.editor.widget.Play;
import org.codingpark.piraterobot.play.web.internal.Activator;

public abstract class AbstractPlayEditor extends XtextContentAssistEnabledEditor {

	public AbstractPlayEditor() {
		super();
		setLanguageName(Activator.ORG_CODINGPARK_PIRATEROBOT_PLAY);
		setInjector(Activator.getInstance().getInjector(Activator.ORG_CODINGPARK_PIRATEROBOT_PLAY));
	}
	
	@Override
	protected BasicText createTextWidget(Composite parent, int styles) {
		Play playWidget = new Play(parent, styles);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		playWidget.setLayoutData(textLayoutData);
		playWidget.setEditable(true);
		return playWidget;
	}
}
