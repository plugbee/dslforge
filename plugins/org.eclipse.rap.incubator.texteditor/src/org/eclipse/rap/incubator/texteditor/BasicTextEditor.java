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
package org.eclipse.rap.incubator.texteditor;

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

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
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
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rap.incubator.styledtext.BasicText;
import org.eclipse.rap.incubator.styledtext.IBasicTextEditor;
import org.eclipse.rap.incubator.styledtext.ITextChangeListener;
import org.eclipse.rap.incubator.styledtext.ITextModifyListener;
import org.eclipse.rap.incubator.styledtext.ITextSaveListener;
import org.eclipse.rap.incubator.styledtext.TextChangedEvent;
import org.eclipse.rap.incubator.styledtext.TextSavedEvent;
import org.eclipse.rap.incubator.texteditor.internal.Activator;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.ISaveablesSource;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class BasicTextEditor extends EditorPart implements ISelectionProvider, ISaveablesSource, IBasicTextEditor {

	/**
	 * This editor's text widget.
	 */
	BasicText textWidget;
	ListenerList listeners = new ListenerList();
	ISelection selection;
	PropertySheetPage propertySheetPage;
	IPath filePath;
	ArrayList<String> index;
	TextEditorSavable fSavable;

	MenuDetectListener menuDetectListener = new MenuDetectListener() {

		private static final long serialVersionUID = 1L;

		@Override
		public void menuDetected(MenuDetectEvent e) {
			MenuManager menuMgr = new MenuManager("#PopUp");
			menuMgr.setRemoveAllWhenShown(true);
			initContextMenu();
			System.out.println("[BasicTextEditor] Menu detected");
		}
	};

	private void initContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		Menu menu = menuMgr.createContextMenu(getWidget());
		menuMgr.addMenuListener(new IMenuListener() {

			private static final long serialVersionUID = 1L;

			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		menuMgr.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		getSite().registerContextMenu(menuMgr, this);
		getWidget().setMenu(menu);
	}

	protected void fillContextMenu(IMenuManager aMenuManager) {
		// ex: menuMgr.add(action);
	}

	public BasicTextEditor() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {
		Font font = parent.getFont();
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		parent.setLayout(gridLayout);
		createWidget(parent, font);
		addListeners();
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setPartName(((IPathEditorInput) input).getPath().lastSegment());
		getSite().setSelectionProvider(this);
		setInput(input);
	}

	/**
	 * This is how the framework determines which interfaces we implement. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(key);
	}

	private IPropertySheetPage getPropertySheetPage() {
		propertySheetPage = new PropertySheetPage();
		propertySheetPage.setPropertySourceProvider(new IPropertySourceProvider() {
			@Override
			public IPropertySource getPropertySource(Object object) {
				if (object instanceof IPathEditorInput)
					return new BasicTextEditorPropertySource((IPathEditorInput) object);
				return null;
			}
		});
		return propertySheetPage;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	@Override
	public ISelection getSelection() {
		if (selection == null) {
			selection = new StructuredSelection(getEditorInput());
		}
		return selection;
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		propertySheetPage.selectionChanged(this, selection);
		propertySheetPage.refresh();
		Object[] list = listeners.getListeners();
		for (int i = 0; i < list.length; i++)
			((ISelectionChangedListener) list[i]).selectionChanged(new SelectionChangedEvent(this, selection));
	}

	private void createWidget(Composite parent, Font font) {
		textWidget = new BasicText(parent, SWT.FILL);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		getWidget().setLayoutData(textLayoutData);
		getWidget().setFont(font);
		// getWidget().setBackground(new Color(getWidget().getDisplay(), new
		// RGB(120, 120, 120)));
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		if (input instanceof IPathEditorInput) {
			loadContentFromFile();
			setFilePath(((IPathEditorInput) input).getPath());
		}
	}

	private void loadContentFromFile() {
		Display display = Display.getCurrent();
		if (display != null) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					String content = "";
					try {
						content = readFromFile();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						setText(content);
					}
				}
			});
		}
	}

	protected String readFromFile() throws IOException {
		System.out.println("[BasicTextEditor] Reading from file " + filePath);
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
		System.out.println("[BasicTextEditor] Took read in: " + ((end - start) / 1000));
		return text.toString();
	}

	@SuppressWarnings("serial")
	protected void addListeners() {
		if (getWidget() != null && !getWidget().isDisposed()) {
			getWidget().addTextChangeListener(new ITextChangeListener() {
				@Override
				public void handleTextChanged(TextChangedEvent e) {
					System.out.println("[BasicTextEditor] handleTextChanged");
					firePropertyChange(PROP_DIRTY);
				}
			});

			getWidget().addKeyListener(new KeyListener() {

				@Override
				public void keyReleased(KeyEvent e) {
					System.out.println("[BasicTextEditor] keyReleased");
				}

				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("[BasicTextEditor] keyPressed");
				}
			});
			getWidget().addTextModifyListener(new ITextModifyListener() {

				@Override
				public void handleTextModified(String text) {
					System.out.println("[BasicTextEditor] handleTextModified");
				}
			});

			getWidget().addTextSaveListener(new ITextSaveListener() {

				@Override
				public void handleTextSaved(TextSavedEvent event) {
					System.out.println("[BasicTextEditor] handleTextSaved");
					IRunnableWithProgress runnable = new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
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
			getWidget().addFocusListener(new FocusListener() {

				@Override
				public void focusLost(FocusEvent event) {
					System.out.println("[BasicTextEditor] focusLost");
				}

				@Override
				public void focusGained(FocusEvent event) {
					System.out.println("[BasicTextEditor] focusGained");
				}
			});
			getWidget().addMenuDetectListener(menuDetectListener);
		}
	}

	public BasicText getWidget() {
		return textWidget;
	}

	protected void setScope() {
		index = new ArrayList<String>();
		setScope(index);
		index.clear();
	}

	private void setText(String text) {
		getWidget().setText(text);
	}

	protected void setValidationStatus(String status) {
		getWidget().setStatus(status);
	}

	protected void setIssue(JsonObject issue) {
		getWidget().setIssue(issue);
	}

	protected void setScope(List<String> scope) {
		getWidget().setLanguageScope(scope);
	}

	@Override
	public boolean isDirty() {
		return getWidget().isDirty();
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
					writer.write(getWidget().getText());
					progress.worked(5);
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} catch (OperationCanceledException ex) {
			// do noting for now, forbid propagating exception
		} finally {
			progress.done();
			Display display = getWidget().getDisplay();
			if (display!=null) {
				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						//FIXME: putting this into a runnable sounds weird
						firePropertyChange(PROP_DIRTY);
					}
				});	
			}
		}
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void dispose() {
		// dispose widget
		// if (!getWidget().isDisposed()) {
		// getWidget().removeKeyListener(keyListener);
		// getWidget().removeTextModifyListener(textModifyListener);
		// getWidget().removeTextSaveListener(textSaveListener);
		// getWidget().removeFocusListener(focusListener);
		// getWidget().removeMenuDetectListener(menuDetectListener);
		// getWidget().removeClientRequestListener(clientRequestlistener);
		// getWidget().dispose();
		// }
		super.dispose();
	}

	IWorkbenchWindow getWorkbenchWindow() {
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

		/*
		 * @see org.eclipse.ui.Saveable#getName()
		 */
		public String getName() {
			return fEditorInput.getName();
		}

		/*
		 * @see org.eclipse.ui.Saveable#getToolTipText()
		 */
		public String getToolTipText() {
			return fEditorInput.getToolTipText();
		}

		/*
		 * @see org.eclipse.ui.Saveable#getImageDescriptor()
		 */
		public ImageDescriptor getImageDescriptor() {
			return fEditorInput.getImageDescriptor();
		}

		/*
		 * @see org.eclipse.ui.Saveable#doSave(org.eclipse.core.runtime.
		 * IProgressMonitor)
		 */
		public void doSave(IProgressMonitor monitor) throws CoreException {
			fTextEditor.doSave(monitor);

		}

		public boolean isDirty() {
			return fTextEditor.getWidget().isDirty();
		}

		/*
		 * @see org.eclipse.ui.Saveable#supportsBackgroundSave()
		 */
		public boolean supportsBackgroundSave() {
			return false;
		}

		/*
		 * @see org.eclipse.ui.Saveable#hashCode()
		 */
		public int hashCode() {
			int PRIME = 31;
			// compute the "normal" hash code, e.g. based on some identifier
			// unique within the defining plug-in
			int hash = Activator.PLUGIN_ID.hashCode();
			return hash * PRIME + Activator.PLUGIN_ID.hashCode();
		}

		/*
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

	// private KeyAdapter keyListener = new KeyAdapter() {
	//
	// private static final long serialVersionUID = 1L;
	//
	// public void keyPressed(KeyEvent event) {
	// // char c = event.character;
	// // check characters
	// // if(event.keyCode >=97 && event.keyCode <=122 ||
	// // event.keyCode==SWT.DEL){
	// setDirty(true);
	// // }
	// String string = character(event.character);
	// System.out.println(string);
	// }
	//
	// String character(char character) {
	// switch (character) {
	// case 0:
	// return "'\\0'";
	// case SWT.BS:
	// return "'\\b'";
	// case SWT.CR:
	// return "'\\r'";
	// case SWT.DEL:
	// return "DEL";
	// case SWT.ESC:
	// return "ESC";
	// case SWT.LF:
	// return "'\\n'";
	// case SWT.TAB:
	// return "'\\t'";
	// }
	// return "'" + character + "'";
	// }
	//
	// };
}