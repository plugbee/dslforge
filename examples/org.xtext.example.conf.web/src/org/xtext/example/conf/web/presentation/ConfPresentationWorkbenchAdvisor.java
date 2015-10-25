package org.xtext.example.conf.web.presentation;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;

public class ConfPresentationWorkbenchAdvisor extends WorkbenchAdvisor {

	public void initialize(IWorkbenchConfigurer configurer) {
		getWorkbenchConfigurer().setSaveAndRestore(true);
		super.initialize(configurer);
	}

	public String getInitialWindowPerspectiveId() {
		return "org.dslforge.core.ui.parts.perspective";
	}

//	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
//			final IWorkbenchWindowConfigurer windowConfigurer) {
//		return new ConfPresentationWorkbenchWindowAdvisor(windowConfigurer);
//	}
}
