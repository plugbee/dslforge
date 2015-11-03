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
package org.dslforge.workspace.generators;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample {
	
	boolean exit = false;
	
	public static void main(String[] args) {
		new Sample().run();
	}
	
	protected void doUnlockPanel() {
		System.out.println("Executing command unlockPanel (PNUL)");
	}
	protected void doLockPanel() {
		System.out.println("Executing command lockPanel (PNLK)");
	}
	protected void doLockDoor() {
		System.out.println("Executing command lockDoor (D1LK)");
	}
	protected void doUnlockDoor() {
		System.out.println("Executing command unlockDoor (D1UL)");
	}
	
	protected void run() {
		boolean executeActions = true;
		String currentState = "idle";
		String lastEvent = null;
		String request =null;
		while (!exit) {
			if (currentState.equals("idle")) {
				if (executeActions) {
					doUnlockDoor();
					doLockPanel();
					executeActions = false;
				}
				request ="Your are now in state 'idle'. Possible events are [doorClosed].";
				System.out.println(request);
				lastEvent = receiveEvent(request);
				if ("doorClosed".equals(lastEvent)) {
					currentState = "active";
					executeActions = true;
				}
			}
			if (currentState.equals("active")) {
				if (executeActions) {
					executeActions = false;
				}
				request = "Your are now in state 'active'. Possible events are [drawOpened, lightOn].";
				System.out.println(request);
				lastEvent = receiveEvent(request);
				if ("drawOpened".equals(lastEvent)) {
					currentState = "waitingForLight";
					executeActions = true;
				}
				if ("lightOn".equals(lastEvent)) {
					currentState = "waitingForDraw";
					executeActions = true;
				}
			}
			if (currentState.equals("waitingForLight")) {
				if (executeActions) {
					executeActions = false;
				}
				request = "Your are now in state 'waitingForLight'. Possible events are [lightOn].";
				System.out.println(request);
				lastEvent = receiveEvent(request);
				if ("lightOn".equals(lastEvent)) {
					currentState = "unlockedPanel";
					executeActions = true;
				}
			}
			if (currentState.equals("waitingForDraw")) {
				if (executeActions) {
					executeActions = false;
				}
				request = "Your are now in state 'waitingForDraw'. Possible events are [drawOpened].";
				System.out.println(request);
				lastEvent = receiveEvent(request);
				if ("drawOpened".equals(lastEvent)) {
					currentState = "unlockedPanel";
					executeActions = true;
				}
			}
			if (currentState.equals("unlockedPanel")) {
				if (executeActions) {
					doUnlockPanel();
					doLockDoor();
					executeActions = false;
				}
				request = "Your are now in state 'unlockedPanel'. Possible events are [panelClosed].";
				System.out.println(request);
				lastEvent = receiveEvent(request);
				if ("panelClosed".equals(lastEvent)) {
					currentState = "idle";
					executeActions = true;
				}
			}
			if ("doorOpened".equals(lastEvent)) {
				System.out.println("Resetting state machine.");
				currentState = "idle";
				executeActions = true;
			}
			
		}
	}
	
	private String receiveEvent(String request) {
		Shell shell = Display.getCurrent().getActiveShell();
		InputDialog input = new InputDialog(shell, "Request event", request, null, null);
		input.open();
		String value = input.getValue();
		if (value==null)
			exit=true;
		return value;

		/*
		System.out.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println("Problem reading input");
			return "";
		}*/
	}
}
