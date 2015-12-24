package org.dslforge.workbench.parts;
///**
// * <copyright>
// *
// * Copyright (c) 2015 PlugBee. All rights reserved.
// * 
// * This program and the accompanying materials are made available 
// * under the terms of the Eclipse Public License v1.0 which 
// * accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     Amine Lajmi - Initial API and implementation
// org.dslforge.workbench/
//package org.dslfoorg.dslforge.workbench//
//import org.dslforge.raporg.dslforge.workbencht;
//import org.dslforge.rap.workbench.chat.ChatForm;
//import org.eclipse.rap.rwt.lifecycle.UICallBack;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Text;
//import org.eclipse.ui.PlatformUI;
//import org.eclipse.ui.part.ViewPart;
//
//public class BasicChatView extends ViewPart {
//	
//	private volatile boolean running = false;
//
//	private Thread notifierThread = null;
//
//	private Text chatText;
//	
//	public long lastUpdated = 0;
//
//	@Override
//	public void createPartControl(Composite parent) {
//		parent.setLayout(new GridLayout());
//		Composite composite = new Composite(parent, SWT.NONE);
//		composite.setLayout(new GridLayout());
//		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//
//		ChatForm chatForm = new ChatForm();
//	    chatForm.createFormContent(composite);
//	    
//		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
//		parent.getShell().setMaximized(true);
//        
//		chatText = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
//		chatText.setEditable(false);
//		chatText.setBackground(PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_WHITE));
//		chatText.setLayoutData(new GridData(GridData.FILL_BOTH));
//
////		ScrolledFormText sc = new ScrolledFormText(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL, false);
////		sc.setExpandHorizontal(false);
////		sc.setExpandVertical(true);
////		sc.setText(chatText.getText());
//		
//		//		Listener scrollBarListener = new Listener() {
////			@Override
////			public void handleEvent(Event event) {
////				Text t = (Text) event.widget;
////				Rectangle r1 = t.getClientArea();
////				Rectangle r2 = t.computeTrim(r1.x, r1.y, r1.width, r1.height);
////				Point p = t.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
////				ScrollBar horizontalBar = t.getHorizontalBar();
////				if (horizontalBar!=null) {
////					horizontalBar.setVisible(r2.width <= p.x);
////					t.getVerticalBar().setVisible(r2.height <= p.y);
////					if (event.type == SWT.Modify) {
////						t.getParent().layout(true);
////						//t.showSelection();
////					}	
////				}
////			}
////		};
////		chatText.addListener(SWT.Resize, scrollBarListener);
////		chatText.addListener(SWT.Modify, scrollBarListener);
//		
//		startMessagingService();
//
//	}
//
//	private Composite createChatForm(Composite parent) {
//		ChatForm chatForm = new ChatForm();
//      chatForm.createFormContent(parent);
//      return parent;
//	}
//	
//	private void startMessagingService() {
//		UICallBack.activate("notifierId");
//		notifierThread = new Thread(createRunnable());
//		notifierThread.setDaemon(true);
//		notifierThread.start();
//	}
//
//	@Override
//	public void dispose() {
//		running = false;
//	}
//
//	private Runnable createRunnable() {
//		return new Runnable() {
//			public void run() {
//				running = true;
//
//				while (running) {
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					if (!chatText.isDisposed()) {
//						chatText.getDisplay().syncExec(new Runnable() {
//							public void run() {
//								if (ChatContent.getInstance().lastChanged > lastUpdated) {
//									chatText.setText(ChatContent.getInstance().toString());
//									lastUpdated = ChatContent.getInstance().lastChanged;
//								}
//							}
//						});	
//					}
//				}
//				if (!chatText.isDisposed()) {
//					chatText.getDisplay().asyncExec(new Runnable() {
//						public void run() {
//							UICallBack.deactivate("notifierId");
//						}
//					});	
//				}
//			}
//		};
//	}
//
//	@Override
//	public void setFocus() {
//
//	}
//}