/**
 * <copyright>
 *
 * Copyright (c) 2017 PlugBee. All rights reserved.
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
package org.dslforge.texteditor.form;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.IContentAssistListener;
import org.dslforge.styledtext.ITextChangeListener;
import org.dslforge.styledtext.ITextModifyListener;
import org.dslforge.styledtext.TextChangedEvent;
import org.dslforge.styledtext.jface.IDocument;
import org.dslforge.styledtext.jface.ITextViewer;
import org.dslforge.styledtext.jface.TextDocument;
import org.dslforge.styledtext.jface.TextViewer;
import org.dslforge.texteditor.internal.Activator;
import org.dslforge.texteditor.internal.TextEditorImageProvider;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class BasicTextFormEditorPage extends FormPage {

	private static final String FORM_EDITOR_SECTION_TITLE = "Section";
	private static final String FORM_EDITOR_SECTION_DESCRIPTION = "Write the code below then press the Run button.";

	static final Logger logger = Logger.getLogger(BasicTextFormEditorPage.class);

	public static final String FORM_EDITOR_PAGE_ID = "org.dslforge.texteditor.form.page";
	public static final String FORM_EDITOR_PAGE_TITLE = "Content";
	public static final String FORM_EDITOR_FORM_TITLE = "Form";
	protected static final int SECTION_HEADER_VERTICAL_SPACING = 6;
	private static final int EDITOR_WIDTH = 360;
	
	protected ITextViewer viewer;
	protected IPath filePath;

	public BasicTextFormEditorPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	public BasicTextFormEditorPage(FormEditor editor, String title) {
		super(editor, FORM_EDITOR_PAGE_ID, title);
	}

	public BasicTextFormEditorPage(BasicTextFormEditor editor) {
		super(editor, FORM_EDITOR_PAGE_ID, FORM_EDITOR_SECTION_TITLE);
	}

	protected String getFormTitle() {
		return FORM_EDITOR_PAGE_TITLE;
	}
	
	protected String getSectionTitle() {
		return FORM_EDITOR_SECTION_TITLE;
	}
	
	protected String getSectionDescription() {
		return FORM_EDITOR_SECTION_DESCRIPTION;
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) {
		super.init(site, input);
		setPartName(input.getName());
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		if (input instanceof IPathEditorInput)
			filePath = ((IPathEditorInput) input).getPath();
		else if (input instanceof URIEditorInput)
			filePath = new Path(((URIEditorInput) input).getURI().toFileString());
		else
			throw new UnsupportedOperationException("Unsupported editor input type.");
	}

	protected void loadContentFromFile() {		
		Display display = Display.getCurrent();
		if (display != null) {
			display.syncExec(new Runnable() {
				@Override
				public void run() {
					String content = "";
					try {
						content = readFromFile();
					} catch (IOException ex) {
						logger.error(ex.getMessage(), ex);
					} finally {
						setTextViewer(content);
						viewer.getTextWidget().setURL(filePath.lastSegment().toString());
					}
				}
			});
		}
	}

	protected void setTextViewer(String content) {
		viewer.setText(content);
		viewer.getTextWidget().setText(content);
	}
	
	protected String readFromFile() throws IOException {
		logger.debug("Reading from file " + filePath);
		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		long start = System.currentTimeMillis();
		Scanner scanner = new Scanner(new FileInputStream(filePath.toFile()), "UTF-8");
		try {
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine() + NL);
			}
		} finally {
			scanner.close();
		}
		long end = System.currentTimeMillis();
		logger.debug("Reading took: " + ((end - start) / 1000));
		return text.toString();
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);		
		ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		form.setText(getFormTitle());
		form.setImage(Activator.getImageDescriptor(TextEditorImageProvider.FILE).createImage());
		toolkit.decorateFormHeading(form.getForm());
		fillBody(managedForm, toolkit);
		form.updateToolBar();
	}

	protected void fillBody(IManagedForm managedForm, FormToolkit toolkit) {
		Composite body = managedForm.getForm().getBody();		
		GridData layoutData = new GridData();
		layoutData.horizontalAlignment = SWT.FILL;
		layoutData.verticalAlignment = SWT.FILL;
		layoutData.grabExcessHorizontalSpace = false;
		layoutData.grabExcessVerticalSpace = true;
		body.setLayoutData(layoutData);
		createEditorSection(body, toolkit);
	}

	protected void createEditorSection(Composite parent, FormToolkit toolkit) {
		Section section = toolkit.createSection(parent, Section.TITLE_BAR | Section.DESCRIPTION);
		final GridData layoutData = new GridData(SWT.BORDER | GridData.FILL_BOTH);
		layoutData.grabExcessHorizontalSpace = false;
		layoutData.widthHint = EDITOR_WIDTH;
		section.setLayoutData(layoutData);
		section.setText(getSectionTitle());
		section.setDescription(getSectionDescription());
		
		viewer = createTextViewer(section, toolkit);
		viewer.setDocument(createEmptyDocument());
		getSite().setSelectionProvider(new ISelectionProvider() {
			@Override
			public void addSelectionChangedListener(ISelectionChangedListener listener) {
			}
			@Override
			public ISelection getSelection() {
				return new StructuredSelection(getEditorInput());
			}
			@Override
			public void removeSelectionChangedListener(ISelectionChangedListener listener) {
			}
			@Override
			public void setSelection(ISelection selection) {
			}
		});

		loadContentFromFile();
		firePropertyChange(PROP_INPUT);
		installListeners();
	}

	protected Section createSection(Composite parent, FormToolkit toolkit, String title) {
		return createSection(parent, toolkit, title, null);
	}
	
	protected Section createSection(Composite parent, FormToolkit toolkit, String title, String description) {
		Section section = toolkit.createSection(parent, Section.TITLE_BAR | Section.DESCRIPTION);
		final GridData layoutData = new GridData(SWT.BORDER | GridData.FILL_BOTH);
		section.setLayoutData(layoutData);
		section.setText(title);
		if (description==null || description.length()==0)
			return section;
		section.setDescription(description);
		return section;
	}

	/**
	 * Creates this editor's styled text viewer
	 */
	protected ITextViewer createTextViewer(Section section, FormToolkit toolkit) {
		Composite container = toolkit.createComposite(section);
		section.setClient(container);
		container.setLayout(new GridLayout());
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		BasicText textWidget = createTextWidget(container, container.getStyle());
		return new TextViewer(textWidget, section, container.getStyle());
	}

	/**
	 * Creates an empty document
	 */
	protected IDocument createEmptyDocument() {
		return new TextDocument();
	}

	/**
	 * Creates and configures this editor's styled text widget
	 */
	protected BasicText createTextWidget(Composite parent, int styles) {
		BasicText textWidget = new BasicText(parent, SWT.FILL);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		textWidget.setLayoutData(textLayoutData);
		textWidget.setEditable(true);
		return textWidget;
	}

	ITextChangeListener iTextChangeListener = new ITextChangeListener() {
		private static final long serialVersionUID = 1L;

		@Override
		public void handleTextChanged(TextChangedEvent e) {
			JsonObject object = (JsonObject) e.data;
			BasicTextFormEditorPage.this.handleTextChanged(object);
		}
	};
	
	protected void handleTextChanged(JsonObject object) {
		//override in subclasses.
	}
	
	IContentAssistListener iContentAssistListener = new IContentAssistListener() {
		private static final long serialVersionUID = 1L;

		@Override
		public boolean verifyKey(VerifyEvent event) {	
			JsonObject data = (JsonObject) event.data;
			if (data != null && data instanceof JsonObject) {
				JsonObject position = (JsonObject) data.get("pos");
				int row = position.get("row").asInt();
			 	int column = position.get("column").asInt();
				int offset = viewer.getTextWidget().getOffsetAtPosition(row, column);
				createCompletionProposals(offset);
				return true;
			}
			return false;
		}
	};
	
	protected void createCompletionProposals(int offsetAtPosition) {
		//override in subclasses.
	}
	
	@SuppressWarnings("serial")
	protected void installListeners() {
		BasicText textWidget = viewer.getTextWidget();
		if (textWidget!= null && !textWidget.isDisposed()) {
			textWidget.addTextChangeListener(iTextChangeListener);	

			KeyListener iKeyListener = new KeyListener() {

				@Override
				public void keyReleased(KeyEvent e) {
					//customize in subclasses
				}

				@Override
				public void keyPressed(KeyEvent e) {
					if ((e.stateMask & SWT.CTRL) == SWT.CTRL) {
						if ((e.stateMask & SWT.ALT) == 0);
							createCompletionProposals();
					}
				}
			};
			textWidget.addKeyListener(iKeyListener);
			
			textWidget.addTextModifyListener(new ITextModifyListener() {

				@Override
				public void handleTextModified(ModifyEvent event) {
					JsonObject object = (JsonObject) event.data;
					String text = object.get("value") != null ? object.get("value").asString() : null;
					if (text!=null) {
						viewer.setText(text);	
					}
				}
			});

			textWidget.addFocusListener(new FocusListener() {

				@Override
				public void focusLost(FocusEvent event) {
					//customize in subclasses
				}

				@Override
				public void focusGained(FocusEvent event) {
					//customize in subclasses
				}
			});
			textWidget.addContentAssistListener(iContentAssistListener);
			textWidget.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseUp(MouseEvent e) {
					//customize in subclasses
				}
				
				@Override
				public void mouseDown(MouseEvent e) {
					//customize in subclasses
				}
				
				@Override
				public void mouseDoubleClick(MouseEvent e) {
					//customize in subclasses
				}
			});
		}
	}
	
	protected void createCompletionProposals() {
		IDocument document = getViewer().getDocument();
		BasicText textWidget = getViewer().getTextWidget();
		textWidget.setText(document.get(), false);
		createCompletionProposals(textWidget.getOffsetAtCursorPosition());	
	}

	public ITextViewer getViewer() {
		return viewer;
	}
	
	public IPath getFilePath() {
		return filePath;
	}

	public void setFilePath(IPath path) {
		this.filePath = path;
	}
}