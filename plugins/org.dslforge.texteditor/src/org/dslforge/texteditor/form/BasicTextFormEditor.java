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

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;

public class BasicTextFormEditor extends FormEditor{

	private static final long serialVersionUID = 4934273569844174609L;

	static final Logger logger = Logger.getLogger(BasicTextFormEditor.class);
	
	public BasicTextFormEditor() {
		super();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
	}
	
	@Override
	protected void setPageText(int pageIndex, String text) {
		super.setPageText(pageIndex, text);
	}

	@Override
	protected void addPages() {
		try {
			setActiveEditor(this);
			addPage(new TextFormEditorWithCanvasPage(this));
		} catch (PartInitException e) {
			logger.error(e.getStackTrace(), e);
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		getActiveEditor().doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		getActiveEditor().doSaveAs();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
}