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
package org.dslforge.xtext.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.dslforge.styledtext.BasicText;
import org.dslforge.texteditor.BasicTextEditor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.EcoreUtil2;
//import org.eclipse.xtext.resource.IEObjectDescription;
//import org.eclipse.xtext.resource.IResourceDescription;
//import org.eclipse.xtext.resource.IResourceDescription.Manager;
//import org.eclipse.xtext.resource.XtextResource;
//import org.eclipse.xtext.resource.XtextResourceSet;
//import org.eclipse.xtext.scoping.IGlobalScopeProvider;
//import org.eclipse.xtext.util.CancelIndicator;
//import org.eclipse.xtext.validation.CheckMode;
//import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
//import org.eclipse.xtext.validation.IResourceValidator;
//import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.ReplaceRegion;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class BasicXtextEditor extends BasicTextEditor implements IBasicXtextEditor {

	@Inject
	private Injector injector;

	@Inject
	private IXtextResourceFactory resourceForEditorInputFactory;
	
	private XtextResource xtextResource = null;
	
	private Iterable<IEObjectDescription> iObjectDescriptions;	
	
	private String languageName;
	
	@Inject
	IResourceServiceProvider.Registry registry;

	@Inject
	IResourceDescription.Manager descriptionManager;
	
	public BasicXtextEditor() {
		super();
	}

	@Override
	protected BasicText createWidget(Composite parent, Font font) {
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

	protected Injector getInjector() {
		return injector;
	}

	protected void setInjector(Injector injector) {
		injector.injectMembers(this);
		this.injector = injector;
	}
	
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		if (input instanceof URIEditorInput) {
			loadContentFromFile();
			Path path = new Path(((URIEditorInput) input).getURI().toFileString());
			setFilePath(path);
			firePropertyChange(PROP_INPUT);
		}
		xtextResource = (XtextResource) resourceForEditorInputFactory.createResource(getEditorInput());
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		updateIndex();
	}
	
	@Override
	protected void handleTextChanged(JsonObject object) {
		int offset = object.get("offset")!=null ? object.get("offset").asInt():-1;
		int length = object.get("length")!=null ? object.get("length").asInt():-1;
		String text = object.get("text")!=null? object.get("text").asString():null;
		if (text!=null) {
			ReplaceRegion replaceRegionToBeProcessed = new ReplaceRegion(offset, length, text);
			xtextResource.update(replaceRegionToBeProcessed.getOffset(), replaceRegionToBeProcessed.getLength(), replaceRegionToBeProcessed.getText());	
		}
		updateIndex();	
	}

	@Override
	public void updateIndex() {
		iObjectDescriptions = Collections.emptyList();
		EcoreUtil2.resolveAll(xtextResource);
		IResourceDescription resourceDescription = descriptionManager.getResourceDescription(xtextResource);
		Manager manager = xtextResource.getResourceServiceProvider().getResourceDescriptionManager();
		resourceDescription = manager.getResourceDescription(xtextResource);
		iObjectDescriptions = Iterables.concat(iObjectDescriptions, resourceDescription.getExportedObjects());
		Iterator<IEObjectDescription> iterator = iObjectDescriptions.iterator();
		List<String> referenceValues = new ArrayList<String>();
		while (iterator.hasNext()) {
			IEObjectDescription current = iterator.next();
			referenceValues.add(current.getName().toString() + ":" + current.getEClass().getName());
		};
		setScope(referenceValues);
		referenceValues.clear();
	}

	protected boolean validateObject(EObject object, XtextResource hostingResource) {
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		IConcreteSyntaxValidator concreteSyntaxValidator = hostingResource.getConcreteSyntaxValidator();
		concreteSyntaxValidator.validateRecursive(object,
				new IConcreteSyntaxValidator.DiagnosticListAcceptor(diagnostics), new HashMap<Object, Object>());
		if (diagnostics.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public void validateResource() {
		//TODO
	}

	public void setLanguageName(String name) {
		this.languageName = name;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void reparse(JsonValue value) {
		String text = getWidget().getText();
		try {
			xtextResource.reparse(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}