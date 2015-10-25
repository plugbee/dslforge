package org.xtext.example.conf.web;

import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.internal.util.PrefUtil;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.xtext.example.conf.web.presentation.ConfPresentationWorkbenchAdvisor;


public class ConfWorkbench implements EntryPoint {

  private static final String PLATFORM_PRESENTATION = "org.dslforge.core.ui.presentation";

  public int createUI() {
    ScopedPreferenceStore prefStore = ( ScopedPreferenceStore )PrefUtil.getAPIPreferenceStore();
    String keyPresentationId = IWorkbenchPreferenceConstants.PRESENTATION_FACTORY_ID;
    String presentationId = prefStore.getString( keyPresentationId );

    WorkbenchAdvisor worbenchAdvisor = new ConfWorkbenchAdvisor();
    if( PLATFORM_PRESENTATION.equals( presentationId ) ) {
      worbenchAdvisor = new ConfPresentationWorkbenchAdvisor();
    }

    Display display = PlatformUI.createDisplay();
    int result = PlatformUI.createAndRunWorkbench( display, worbenchAdvisor );
    display.dispose();
    return result;
  }
}
