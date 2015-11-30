package org.eclipse.rap.incubator.styledtext;

import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.rwt.internal.protocol.ControlOperationHandler;

@SuppressWarnings("restriction")
public class BasicTextOperationHandler extends ControlOperationHandler<BasicText> {

	private static final long serialVersionUID = 9146615886023898621L;

	static final String PROP_TEXT = "text";
	static final String PROP_SELECTION = "selection";
	static final String PROP_ISSUE= "issue";
	static final String PROP_SCOPE = "scope";
	static final String PROP_STATUS = "status";
	static final String PROP_STATUS_VALID = "valid";
	static final String PROP_STATUS_INVALID = "invalid";
	
	public BasicTextOperationHandler(BasicText control) {
		super(control);
	}

	@Override
	public void handleSet(BasicText control, JsonObject properties) {
		//do noting.
	}

	@Override
	public void handleNotify(BasicText control, String eventName, JsonObject properties) {
		System.out.println("[BasicTextOperationHandler] handleNotify event: " + eventName);
		control.notifyListeners(eventName, properties);
	}
	
	@Override
	public void handleCall(BasicText control, String method, JsonObject properties) {
		System.out.println("[BasicTextOperationHandler] handleCall");
		control.invoke(method, properties);
	}
	
	@Override
	public void handleNotifyKeyDown(BasicText control, JsonObject properties) {
		super.handleNotifyKeyDown(control, properties);
		System.out.println("[BasicTextOperationHandler] handleNotifyKeyDown");
	}
	
	@Override
	public void handleSetEnabled(BasicText control, JsonObject properties) {
		super.handleSetEnabled(control, properties);
		System.out.println("[BasicTextOperationHandler] handleSetEnabled");
	}
	
	@Override
	public void handleNotifyHelp(BasicText control, JsonObject properties) {
		super.handleNotifyHelp(control, properties);
		System.out.println("[BasicTextOperationHandler] handleNotifyHelp");
	}
	
	@Override
	public void handleSetToolTip(BasicText control, JsonObject properties) {
		super.handleSetToolTip(control, properties);
		System.out.println("[BasicTextOperationHandler] handleSetToolTip");
	}
	
	@Override
	public void handleNotifyMenuDetect(BasicText control, JsonObject properties) {
		super.handleNotifyMenuDetect(control, properties);
		System.out.println("[BasicTextOperationHandler] handleNotifyMenuDetect");
	}
	
	@Override
	public void handleSetForeground(BasicText control, JsonObject properties) {
		super.handleSetForeground(control, properties);
		System.out.println("[BasicTextOperationHandler] handleSetForeground");
	}
	
	@Override
	public void handleSetBackground(BasicText control, JsonObject properties) {
		super.handleSetBackground(control, properties);
		System.out.println("[BasicTextOperationHandler] handleSetBackground");
	}
	
	@Override
	public void handleNotifyMouseDown(BasicText control, JsonObject properties) {
		super.handleNotifyMouseDown(control, properties);
		System.out.println("[BasicTextOperationHandler] handleNotifyMouseDown");
	}
	
	@Override
	public void handleNotifyMouseUp(BasicText control, JsonObject properties) {
		super.handleNotifyMouseUp(control, properties);
		System.out.println("[BasicTextOperationHandler] handleNotifyMouseUp");
	}
}
