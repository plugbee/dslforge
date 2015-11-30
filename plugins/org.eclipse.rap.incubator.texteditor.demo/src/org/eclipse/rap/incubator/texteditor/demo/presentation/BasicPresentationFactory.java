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
package org.eclipse.rap.incubator.texteditor.demo.presentation;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.presentations.AbstractPresentationFactory;
import org.eclipse.ui.presentations.IStackPresentationSite;
import org.eclipse.ui.presentations.StackPresentation;

public class BasicPresentationFactory extends AbstractPresentationFactory {

	public BasicPresentationFactory() {
		super();
		System.out.println("[DSLFORGE] Applying default theme...");
	}

	@Override
	public StackPresentation createEditorPresentation(Composite parent,	IStackPresentationSite site) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StackPresentation createViewPresentation(Composite parent, IStackPresentationSite site) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StackPresentation createStandaloneViewPresentation(Composite parent, IStackPresentationSite site, boolean showTitle) {
		// TODO Auto-generated method stub
		return null;
	}

}
