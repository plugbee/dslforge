/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.styledtext;

import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.rwt.internal.protocol.ControlOperationHandler;

@SuppressWarnings("restriction")
public class BasicTextOperationHandler extends ControlOperationHandler<BasicText> {

	private static final long serialVersionUID = 9146615886023898621L;
	
	public BasicTextOperationHandler(BasicText control) {
		super(control);
	}

	@Override
	public void handleSet(BasicText control, JsonObject properties) {
		//too expensive.
	}

	@Override
	public void handleNotify(BasicText control, String eventName, JsonObject properties) {
		control.notifyListeners(eventName, properties);
	}
	
	@Override
	public void handleCall(BasicText control, String method, JsonObject properties) {
		control.invoke(method, properties);
	}
	
	@Override
	public void handleNotifyKeyDown(BasicText control, JsonObject properties) {
		super.handleNotifyKeyDown(control, properties);
	}
	
	@Override
	public void handleSetEnabled(BasicText control, JsonObject properties) {
		super.handleSetEnabled(control, properties);
	}
	
	@Override
	public void handleNotifyHelp(BasicText control, JsonObject properties) {
		super.handleNotifyHelp(control, properties);
	}
	
	@Override
	public void handleSetToolTip(BasicText control, JsonObject properties) {
		super.handleSetToolTip(control, properties);
	}
	
	@Override
	public void handleNotifyMenuDetect(BasicText control, JsonObject properties) {
		super.handleNotifyMenuDetect(control, properties);
	}
	
	@Override
	public void handleSetForeground(BasicText control, JsonObject properties) {
		super.handleSetForeground(control, properties);
	}
	
	@Override
	public void handleSetBackground(BasicText control, JsonObject properties) {
		super.handleSetBackground(control, properties);
	}
	
	@Override
	public void handleNotifyMouseDown(BasicText control, JsonObject properties) {
		super.handleNotifyMouseDown(control, properties);
	}
	
	@Override
	public void handleNotifyMouseUp(BasicText control, JsonObject properties) {
		super.handleNotifyMouseUp(control, properties);
	}
}