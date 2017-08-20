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
package org.dslforge.workspace.ui.actions;

import java.io.File;
import java.util.List;

import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.xtext.common.commands.BasicGenerateCommand;
import org.dslforge.xtext.common.registry.LanguageRegistry;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;

public class BasicGenerateAction extends AbstractWorkspaceAction {

	private final BasicGenerateCommand delegate;
	
	public BasicGenerateAction() {
		super();
		delegate = new BasicGenerateCommand();
	}

	@Override
	public void run(IAction action) {
		if (!getSelection().isEmpty()) {
			// get the resource uri
			File file = (File) ((IStructuredSelection) getSelection()).getFirstElement();
			String targetDirectory = getDefaultTargetDirectory();
			// create the container if it doesn't exist yet
			WorkspaceManager.INSTANCE.createFolder(new Path(targetDirectory));
			delegate.doGenerate(file, new File(targetDirectory));
		}
	}

	protected String getLanguageName(String fileExtension) {
		List<String> contributions = LanguageRegistry.INSTANCE.getLanguageByExtension(fileExtension);
		if (!contributions.isEmpty()) {
			return contributions.get(0);
		}
		return null;
	}

	protected String getDefaultTargetDirectory() {
		String output = WorkspaceManager.INSTANCE.getWorkspaceRootStringPath();
		Object firstElement = ((IStructuredSelection) getSelection()).getFirstElement();
		if (firstElement instanceof File) {
			File parent = ((File) firstElement).getParentFile();
			output = new File(parent, BasicGenerateCommand.DEFAULT_OUTPUT_FOLDER).getAbsolutePath();
		}
		return output;
	}
}