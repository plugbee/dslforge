package org.xtext.example.conf.web;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;

/**
 * This class controls all aspects of the application's execution
 * and is contributed through the plugin.xml.
 */
public class ConfApplication implements IApplication {

	public Object start(IApplicationContext context) throws Exception {
		WorkbenchAdvisor workbenchAdvisor = new ConfWorkbenchAdvisor();
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);
			if (returnCode == PlatformUI.RETURN_RESTART) {
				return IApplication.EXIT_RESTART;
			}
			else {
				return IApplication.EXIT_OK;
			}
		}
		finally {
			display.dispose();
		}
	}

	public void stop() {
		// Do nothing
	}
}
