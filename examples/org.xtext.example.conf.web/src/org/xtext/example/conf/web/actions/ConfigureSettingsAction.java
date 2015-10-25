package org.xtext.example.conf.web.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Event;

public class ConfigureSettingsAction extends Action {

	private static final long serialVersionUID = 1L;

	public ConfigureSettingsAction() {
		setId("configure settings");
		setEnabled(true);
		setText("Settings...");
	}

	@Override
	public void runWithEvent(Event event) {
	}
}
