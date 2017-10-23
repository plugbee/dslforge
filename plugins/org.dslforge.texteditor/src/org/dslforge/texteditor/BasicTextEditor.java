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
package org.dslforge.texteditor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.dslforge.styledtext.Annotation;
import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.IContentAssistListener;
import org.dslforge.styledtext.ITextChangeListener;
import org.dslforge.styledtext.ITextModifyListener;
import org.dslforge.styledtext.ITextSaveListener;
import org.dslforge.styledtext.TextChangedEvent;
import org.dslforge.styledtext.TextSavedEvent;
import org.dslforge.styledtext.TextSelection;
import org.dslforge.styledtext.jface.BadLocationException;
import org.dslforge.styledtext.jface.ICompletionProposal;
import org.dslforge.styledtext.jface.IDocument;
import org.dslforge.styledtext.jface.ITextViewer;
import org.dslforge.styledtext.jface.TextDocument;
import org.dslforge.styledtext.jface.TextViewer;
import org.dslforge.texteditor.internal.Activator;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
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
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.ISaveablesSource;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class BasicTextEditor extends EditorPart implements ISaveablesSource, IBasicTextEditor {

	static final Logger logger = Logger.getLogger(BasicTextEditor.class);
	
	protected static final String DEFAULT_TEXT_FONT = "Tahoma, Geneva, sans-serif";
	
	/**
	 * This editor's text viewer.
	 */
	private ITextViewer viewer;
	private PropertySheetPage propertySheetPage;
	private IPath filePath;
	private ArrayList<String> index;
	private TextEditorSavable fSavable;
	private boolean isDirty;
	
	public BasicTextEditor() {
		super();
	}
	
	ITextChangeListener iTextChangeListener = new ITextChangeListener() {
		private static final long serialVersionUID = 1L;

		@Override
		public void handleTextChanged(TextChangedEvent e) {
			setDirty(true);
			JsonObject object = (JsonObject) e.data;
			BasicTextEditor.this.handleTextChanged(object);
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
				String text = data.get("value").asString();
				try{
					int offset = viewer.getTextWidget().getOffsetAtPosition(row, column);
					viewer.getDocument().set(text);
					createCompletionProposals(offset);
				} catch (Exception ex) {
					// FIXME: live completer too fast
					viewer.getTextWidget().setText(text, false);
					if (ex instanceof BadLocationException || ex instanceof WrappedException)
						return false;
				}
				return true;
			}
			return false;
		}
	};
	
	/**
	 * Creates completion proposals based on cursor position
	 */
	protected void createCompletionProposals() {
		//override in subclasses.
	}

	/**
	 * Creates completion proposals based on the offset argument
	 * 
	 * @param offsetAtPosition
	 */
	protected void createCompletionProposals(int offsetAtPosition) {
		//override in subclasses.
	}
	
	MenuDetectListener menuDetectListener = new MenuDetectListener() {
		private static final long serialVersionUID = 1L;

		@Override
		public void menuDetected(MenuDetectEvent e) {
			MenuManager menuMgr = new MenuManager("#PopUp");
			menuMgr.setRemoveAllWhenShown(true);
			initContextMenu();
		}
	};

	@SuppressWarnings("serial")
	protected void initContextMenu() {
		MenuManager contextMenuManager = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		Menu menu = contextMenuManager.createContextMenu(viewer.getTextWidget());
		contextMenuManager.setRemoveAllWhenShown(true);
		contextMenuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				editorContextMenuAboutToShow(manager);
			}
		});
		contextMenuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		getSite().registerContextMenu(contextMenuManager, viewer.getSelectionProvider());
		viewer.getTextWidget().setMenu(menu);
	}

	/**
	 * Convenience method to add the action installed under the given action id to the given menu.
	 * @param menu the menu to add the action to
	 * @param actionId the id of the action to be added
	 */
	protected final void addAction(IMenuManager menu, String actionId) {
		IAction action= getAction(actionId);
		if (action != null) {
			menu.add(action);
		}
	}

	/**
	 * Convenience method to add the action installed under the given action id to the specified group of the menu.
	 * @param menu the menu to add the action to
	 * @param group the group in the menu
	 * @param actionId the id of the action to add
	 */
	protected final void addAction(IMenuManager menu, String group, String actionId) {
	 	IAction action= getAction(actionId);
	 	if (action != null) {
	 		IMenuManager subMenu= menu.findMenuUsingPath(group);
	 		if (subMenu != null)
	 			subMenu.add(action);
	 		else
	 			menu.appendToGroup(group, action);
	 	}
	}

	/**
	 * Convenience method to add a new group after the specified group.
	 * @param menu the menu to add the new group to
	 * @param existingGroup the group after which to insert the new group
	 * @param newGroup the new group
	 */
	protected final void addGroup(IMenuManager menu, String existingGroup, String newGroup) {
 		IMenuManager subMenu= menu.findMenuUsingPath(existingGroup);
 		if (subMenu != null)
 			subMenu.add(new Separator(newGroup));
 		else
 			menu.appendToGroup(existingGroup, new Separator(newGroup));
	}
	
	/**
	 * Returns the action from the editor contributor instead of duplicating actions creation.
	 * 
	 * @param actionId
	 * @return the action with the given id
	 */
	@Override
	public IAction getAction(String actionId) {
		IEditorActionBarContributor actionBarContributor = ((IEditorSite)getSite()).getActionBarContributor();
		if (actionBarContributor instanceof BasicTextEditorContributor) {
		    return ((BasicTextEditorContributor)actionBarContributor).getAction(this, actionId);
		}
		return null;
	}
	
	protected void editorContextMenuAboutToShow(IMenuManager menuManager) {
		menuManager.add(new Separator(IBasicTextEditorActionConstants.GROUP_UNDO));
		menuManager.add(new GroupMarker(IBasicTextEditorActionConstants.GROUP_SAVE));
		menuManager.add(new Separator(IBasicTextEditorActionConstants.GROUP_COPY));
		menuManager.add(new Separator(IBasicTextEditorActionConstants.GROUP_PRINT));
		menuManager.add(new Separator(IBasicTextEditorActionConstants.GROUP_EDIT));
		menuManager.add(new Separator(IBasicTextEditorActionConstants.GROUP_FIND));
		menuManager.add(new Separator(IBasicTextEditorActionConstants.GROUP_ADD));
		menuManager.add(new Separator(IBasicTextEditorActionConstants.GROUP_REST));
		menuManager.add(new Separator(IBasicTextEditorActionConstants.MB_ADDITIONS));
		if (isEditable()) {
			addAction(menuManager, IBasicTextEditorActionConstants.GROUP_EDIT, ActionFactory.COPY.getId());
			addAction(menuManager, IBasicTextEditorActionConstants.GROUP_EDIT, ActionFactory.CUT.getId());
			addAction(menuManager, IBasicTextEditorActionConstants.GROUP_EDIT, ActionFactory.PASTE.getId());
			menuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
			addAction(menuManager, IBasicTextEditorActionConstants.GROUP_UNDO, ActionFactory.UNDO.getId());
			addAction(menuManager, IBasicTextEditorActionConstants.GROUP_UNDO, ActionFactory.REDO.getId());
		}
	}

	@Override
	public boolean isEditable() {
		return viewer.isEditable();
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		parent.setLayout(gridLayout);
		viewer = createTextViewer(parent, SWT.FILL);
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
		addListeners();
	}

	/**
	 * Creates this editor's styled text widget
	 * 
	 * @param parent
	 * @param styles
	 * @return
	 */
	protected ITextViewer createTextViewer(Composite parent, int styles) {
		final BasicText textWidget = createTextWidget(parent, styles);
		return new TextViewer(textWidget, parent, styles);
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
		// set font
		Font font = new Font(Display.getCurrent(), new FontData(DEFAULT_TEXT_FONT, 14, SWT.NORMAL));
		textWidget.setFont(font);
		// set background color
		//Color color = new Color(parent.getDisplay(), new RGB(229, 242, 255));
		//textWidget.setBackground(color);
		// set read/write access
		textWidget.setEditable(true);		
		return textWidget;
	}
	
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setPartName(input.getName());
		setInput(input);
		setDirty(false);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(key);
	}

	protected IPropertySheetPage getPropertySheetPage() {
		propertySheetPage = new PropertySheetPage();
		propertySheetPage.setPropertySourceProvider(new IPropertySourceProvider() {
			@Override
			public IPropertySource getPropertySource(Object object) {
				if (object instanceof URIEditorInput)
					return new URIEditorPropertySource((URIEditorInput) object);
				if (object instanceof IPathEditorInput)
					return new PathEditorPropertySource((IPathEditorInput) object);
				return null;
			}
		});
		return propertySheetPage;
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		IPath path=null;
		if (input instanceof IPathEditorInput) {
			path = ((IPathEditorInput) input).getPath();
			loadContentFromFile();
		} else if (input instanceof URIEditorInput) {
			if (((URIEditorInput) input).getURI().isFile())
				path = new Path(((URIEditorInput) input).getURI().toFileString());
			else
				path = new Path(((URIEditorInput) input).getURI().toString());
		} else {
			throw new UnsupportedOperationException("Unsupported editor input type.");	
		}
		setFilePath(path);
		firePropertyChange(PROP_INPUT);
	}

	/**
	 * Creates an empty document
	 */
	protected IDocument createEmptyDocument() {
		return new TextDocument();
	}
	
	/**
	 * Loads the editor text content from file
	 */
	protected void loadContentFromFile() {		
		Display display = Display.getCurrent();
		if (display != null) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					String content = "";
					try {
						content = readFromFile();
					} catch (IOException ex) {
						logger.error(ex.getMessage(), ex);
					} finally {
						setTextViewer(content);
						setURL(filePath.lastSegment().toString());
					}
				}
			});
		}
	}

	protected void setTextViewer(String content) {
		setText(content);
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

	@SuppressWarnings("serial")
	protected void addListeners() {
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
					// if ((e.stateMask & SWT.CTRL) == SWT.CTRL) {
					// if ((e.stateMask & SWT.ALT) == 0);
					// createCompletionProposals();
					// }
				}
			};
			textWidget.addKeyListener(iKeyListener);
			
			textWidget.addTextModifyListener(new ITextModifyListener() {

				@Override
				public void handleTextModified(ModifyEvent event) {
					JsonObject object = (JsonObject) event.data;
					String text = object.get("value") != null ? object.get("value").asString() : null;
					if (text!=null) {
						setText(text);	
					}
				}
			});

			textWidget.addTextSaveListener(new ITextSaveListener() {

				@Override
				public void handleTextSaved(TextSavedEvent event) {
					IRunnableWithProgress runnable = new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {
							Saveable[] saveables = getSaveables();
							if (saveables.length == 0)
								return;
							monitor.beginTask(null, 100 * saveables.length);
							for (int i = 0; i < saveables.length; i++) {
								Saveable saveable = saveables[i];
								try {
									saveable.doSave(SubMonitor.convert(monitor, 100));
								} catch (CoreException e) {
									ErrorDialog.openError(getSite().getShell(), null, e.getMessage(), e.getStatus());
								}
								if (monitor.isCanceled()) {
									break;
								}
							}
							monitor.done();
						}
					};
					try {
						runnable.run(new NullProgressMonitor());
					} catch (InvocationTargetException e) {
						// handle exception
					} catch (InterruptedException e) {
						// handle cancelation
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
			textWidget.addMenuDetectListener(menuDetectListener);
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

	@Override
	public ITextViewer getViewer() {
		return viewer;
	}

	protected void setScope() {
		index = new ArrayList<String>();
		setScope(index);
		index.clear();
	}

	protected void setURL(String url) {
		viewer.getTextWidget().setURL(url);
	}
	
	protected void setText(String text) {
		viewer.setText(text);
	}

	protected void setValidationStatus(String status) {
		viewer.getTextWidget().setStatus(status);
	}

	protected void setAnnotations(List<Annotation> annotations) {
		viewer.getTextWidget().setAnnotations(annotations);
	}

	protected void setScope(List<String> scope) {
		viewer.getTextWidget().setScope(scope);
	}
	
	protected void setProposals(List<ICompletionProposal> proposals) {
		viewer.getTextWidget().setProposals(proposals);
	}

	@Override
	public boolean isDirty() {
		return this.isDirty;
	}

	protected void setDirty(boolean isDirty) {
		if (this.isDirty != isDirty) {
			this.isDirty = isDirty;
			firePropertyChange(PROP_DIRTY);
		}
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, 10);
		Writer writer = null;
		try {
			if (progress.isCanceled())
				throw new OperationCanceledException();
			// actually save resource (save only read/write resources)
			final File file = getFilePath().toFile();
			if (file.exists() && file.canWrite()) {
				try {
					writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath()),
							Charset.availableCharsets().get("UTF-8")));
					progress.worked(5);
					writer.write(viewer.getTextWidget().getText());
					progress.worked(5);
					writer.close();
				} catch (IOException ex) {
					logger.error(ex.getMessage(), ex);
				}
			}

		} catch (OperationCanceledException ex) {
			// do noting for now, forbid propagating exception
		} finally {
			progress.done();
			setDirty(false);
		}
	}

	@Override
	public void doSaveAs() {
		//not handled by default
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void dispose() {
		if (viewer!=null && viewer.getTextWidget()!=null) {
			viewer.getTextWidget().dispose();
			viewer = null;
		}
		super.dispose();
	}

	public IWorkbenchWindow getWorkbenchWindow() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	}

	public IPath getFilePath() {
		return filePath;
	}

	public void setFilePath(IPath path) {
		this.filePath = path;
	}

	@Override
	public Saveable[] getSaveables() {
		if (fSavable == null)
			fSavable = new TextEditorSavable(this);
		return new Saveable[] { fSavable };
	}

	@Override
	public Saveable[] getActiveSaveables() {
		return getSaveables();
	}

	/**
	 * This text editor's savable.
	 */
	protected static class TextEditorSavable extends Saveable {

		/** The cached editor. */
		private IBasicTextEditor fTextEditor;
		/** The cached editor input. */
		private IEditorInput fEditorInput;

		/**
		 * Creates a new savable for this text editor.
		 *
		 * @param textEditor
		 *            the text editor
		 */
		public TextEditorSavable(IBasicTextEditor textEditor) {
			Assert.isLegal(textEditor != null);
			fTextEditor = textEditor;
			fEditorInput = fTextEditor.getEditorInput();
			Assert.isLegal(fEditorInput != null);
		}

		/**
		 * Disconnects the editor from this savable.
		 */
		public void disconnectEditor() {
			fTextEditor = null;
		}

		/**
		 * @see org.eclipse.ui.Saveable#getName()
		 */
		public String getName() {
			return fEditorInput.getName();
		}

		/**
		 * @see org.eclipse.ui.Saveable#getToolTipText()
		 */
		public String getToolTipText() {
			return fEditorInput.getToolTipText();
		}

		/**
		 * @see org.eclipse.ui.Saveable#getImageDescriptor()
		 */
		public ImageDescriptor getImageDescriptor() {
			return fEditorInput.getImageDescriptor();
		}

		/**
		 * @see org.eclipse.ui.Saveable#doSave(org.eclipse.core.runtime.
		 * IProgressMonitor)
		 */
		public void doSave(IProgressMonitor monitor) throws CoreException {
			fTextEditor.doSave(monitor);
		}

		public boolean isDirty() {
			return fTextEditor.isDirty();
		}

		/**
		 * @see org.eclipse.ui.Saveable#supportsBackgroundSave()
		 */
		public boolean supportsBackgroundSave() {
			return true;
		}

		/**
		 * @see org.eclipse.ui.Saveable#hashCode()
		 */
		public int hashCode() {
			int PRIME = 31;
			// compute the "normal" hash code, e.g. based on some identifier
			// unique within the defining plug-in
			int hash = Activator.PLUGIN_ID.hashCode();
			return hash * PRIME + Activator.PLUGIN_ID.hashCode();
		}

		/**
		 * @see org.eclipse.ui.Saveable#equals(java.lang.Object)
		 */
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Saveable))
				return false;
			return false;
		}
	}

	/**
	 * Copy text to clip board from the given selection
	 */
	public void performCopy(TextSelection selection) {
		if (!selection.isEmpty())
			viewer.getTextWidget().copy(selection.getText());
	}

	/**
	 * Paste text from clip board at the current caret position
	 */
	public void performPaste() {
		viewer.getTextWidget().paste();
	}

	/**
	 * Cut text delimited by the given selection
	 */
	public void performCut(TextSelection selection) {
		if (!selection.isEmpty())
			viewer.getTextWidget().cut(selection);
	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return viewer.getSelectionProvider();
	}
}