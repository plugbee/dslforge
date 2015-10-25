package org.xtext.example.conf.web;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Configures the initial size and appearance of a workbench window.
 */
public class ConfWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ConfWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(600, 800));
		configurer.setShowCoolBar(false);
		configurer.setShowStatusLine(true);
		configurer.setTitle("Conf Editor");
	//	configurer.setShellStyle(SWT.TITLE | SWT.RESIZE);
	}
	
	@Override
	public void postWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();    
        configurer.getWindow().getShell().setMaximized( true );
	}
	
	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new ConfActionBarAdvisor(configurer);
	}
}
