///**
// * <copyright>
// *
// * Copyright (c) 2015 DSLFORGE. All rights reserved.
// * 
// * This program and the accompanying materials are made available 
// * under the terms of the Eclipse Public License v1.0 which 
// * accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     Amine Lajmi - Initial API and implementation
// *
// * </copyright>
// */
//package org.dslforge.workbench.chat;
//
//import java.io.PrintWriter;
//import java.io.StringWriter;
//
//import org.eclipse.jface.dialogs.IMessageProvider;
//import org.eclipse.rap.rwt.RWT;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.SelectionAdapter;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Text;
//import org.eclipse.ui.forms.IMessage;
//import org.eclipse.ui.forms.IMessageManager;
//import org.eclipse.ui.forms.ManagedForm;
//import org.eclipse.ui.forms.widgets.FormToolkit;
//import org.eclipse.ui.forms.widgets.ScrolledForm;
//import org.eclipse.ui.forms.widgets.Section;
//
//public class ChatForm {
//	
//	public IMessageManager messageManager = null;
//	
//	private static ChatForm content;
//	
//	public Text nameText;
//	
//	public Text messageText;
//	
//	boolean isValid = true;
//
//	public static synchronized ChatForm getInstance() {
//		if (content != null) {
//			return content;
//		} else {
//			content = new ChatForm();
//			return content;
//		}
//	}
//	
//	public void createFormContent(Composite parent) {
//
//		FormToolkit toolkit = new FormToolkit(parent.getDisplay());
//		ScrolledForm form = toolkit.createScrolledForm(parent);
//		form.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));	
//		form.setText("Your feedback is welcome");
//		form.getBody().setLayout(new GridLayout());
//		form.getBody().setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));
//		toolkit.decorateFormHeading(form.getForm());
//		
//		Section section = toolkit.createSection(form.getBody(),	Section.TITLE_BAR);
//		section.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));
//		section.setText("Share something...");
//
//		final ManagedForm managedForm = new ManagedForm(toolkit, form);
//		messageManager = managedForm.getMessageManager();
//
//		Composite sbody = toolkit.createComposite(section);
//		section.setClient(sbody);
//		GridLayout glayout = new GridLayout();
//		glayout.horizontalSpacing = 10;
//		glayout.numColumns = 2;
//		sbody.setLayout(glayout);
//		sbody.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//		
//		createUserField("User: ", toolkit, sbody, messageManager);
//		createMessageTextField("Message: ", toolkit, sbody, messageManager);
//
//		final Button sendButton = toolkit.createButton(form.getBody(),"Share", SWT.PUSH);
//		GridData buttonLayout = new GridData(GridData.FILL_HORIZONTAL);
//		buttonLayout.grabExcessHorizontalSpace=true;
//		buttonLayout.horizontalSpan=2;
//		sendButton.setLayoutData(buttonLayout);
//
//		sendButton.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {
//				if (formIsValid()) {
//					String text = getMessageHeader() + messageText.getText() + "\n";		
//					ChatContent.getInstance().insert(text);
//					messageText.setText("");
//					ChatContent.getInstance().updateLastChanged();
//				}
//			}
//		});
//	}
//
//	protected String getMessageHeader() {
//		//String header = new Date() + ": "	+ nameText.getText() + " says -> ";
//		String header = "@" + nameText.getText() + ": ";
//		return header;
//	}
//	
//	public boolean formIsValid() {
//		isValid = true;
//		messageText.getDisplay().syncExec(new Runnable() {
//			
//			public void run() {
//				if (nameText.getText().length() == 0) {
//					messageManager.addMessage("sn", "Please enter a screen name", null,	IMessageProvider.ERROR);
//					isValid = false;
//				}
//				if (nameText.getText().length() > 0) {
//					messageManager.removeMessage("sn");
//				}
//				if (messageText.getText().length() == 0) {
//					messageManager.addMessage("text1", "Please enter a Message", null, IMessageProvider.ERROR);
//					isValid = false;
//				}
//				if (messageText.getText().length() > 0) {
//					messageManager.removeMessage("text1");
//				}	
//			}
//		});
//		return isValid;
//	}
//
//	String createFormTextContent(IMessage[] messages) {
//		StringWriter sw = new StringWriter();
//		PrintWriter pw = new PrintWriter(sw);
//		pw.println("<form>");
//		for (int i = 0; i < messages.length; i++) {
//			IMessage message = messages[i];
//			pw.print("<li vspace=\"false\" style=\"image\" indent=\"16\" value=\"");
//			switch (message.getMessageType()) {
//			case IMessageProvider.ERROR:
//				pw.print("error");
//				break;
//			case IMessageProvider.WARNING:
//				pw.print("warning");
//				break;
//			case IMessageProvider.INFORMATION:
//				pw.print("info");
//				break;
//			}
//			pw.print("\"> <a href=\"");
//			pw.print(i + "");
//			pw.print("\">");
//			if (message.getPrefix() != null)
//				pw.print(message.getPrefix());
//			pw.print(message.getMessage());
//			pw.println("</a></li>");
//		}
//		pw.println("</form>");
//		pw.flush();
//		return sw.toString();
//	}
//
//	private void createUserField(String label, FormToolkit toolkit,
//			Composite parent, final IMessageManager mmng) {
//		toolkit.createLabel(parent, label);
//		String currentUser = (String) RWT.getUISession().getAttribute("user");
//		nameText = toolkit.createText(parent, currentUser);
//		nameText.setEditable(false);
//		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
////		gd.widthHint = 150;
//		nameText.setLayoutData(gd);
////		text.addModifyListener(new ModifyListener() {	
////			private static final long serialVersionUID = 1L;
////			public void modifyText(ModifyEvent e) {
////				// tdApirCode = text.getText();
////			}
////		});
//	}
//
//	private void createMessageTextField(String label, FormToolkit toolkit, Composite parent, final IMessageManager mmng) {
//		toolkit.createLabel(parent, label);	
//
//		messageText = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.NO_SCROLL | SWT.V_SCROLL);
//		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
//		//layoutData.grabExcessHorizontalSpace=true;
//		//layoutData.horizontalSpan=2;
//		layoutData.heightHint = 3*messageText.getLineHeight();
//		messageText.setLayoutData(layoutData);
//		messageText.setFocus();
//		
////		toolkit.createLabel(parent, label);
////		text1 = toolkit.createText(parent, "");
////		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
////		gd.widthHint = 150;
////		text1.setLayoutData(gd);
////		text1.addModifyListener(new ModifyListener() {
////			private static final long serialVersionUID = 1L;
////			public void modifyText(ModifyEvent e) {
////				// tdApirCode = text.getText();
////			}
////		});
//	}
//}