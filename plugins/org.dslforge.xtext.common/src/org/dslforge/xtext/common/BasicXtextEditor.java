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
import java.util.List;

import org.apache.log4j.Logger;
import org.dslforge.styledtext.Annotation;
import org.dslforge.styledtext.Annotation.AceSeverity;
import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.jface.IDocument;
import org.dslforge.texteditor.BasicTextEditor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ReplaceRegion;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * A basic Xtext RAP Editor
 */
public class BasicXtextEditor extends BasicTextEditor implements IBasicXtextEditor {

	static final Logger logger = Logger.getLogger(BasicXtextEditor.class);
	
	@Inject
	protected Injector injector;

	@Inject
	protected IXtextResourceFactory xtextResourceFactory;

	protected XtextResource xtextResource;

	protected Iterable<IEObjectDescription> iObjectDescriptions;

	protected String languageName;

	@Inject
	protected IResourceDescription.Manager descriptionManager;

	/**
	 * Default constructor
	 */
	public BasicXtextEditor() {
		super();
	}

	/**
	 * Creates and initializes the text widget
	 */
	@Override
	protected BasicText createTextWidget(Composite parent, int style) {
		BasicText textWidget = new BasicText(parent, style);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		textWidget.setLayoutData(textLayoutData);
		textWidget.setEditable(true);
		textWidget.setAnnotations(Collections.emptyList());
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
		xtextResource = (XtextResource) xtextResourceFactory.createResource(getEditorInput());
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		updateIndex();
	}

	@Override
	protected void handleTextChanged(JsonObject object) {
		int offset = object.get("offset") != null ? object.get("offset").asInt() : 0;
		String value = object.get("value") != null ? object.get("value").asString() : null;
		if (value != null) {
			ReplaceRegion replaceRegionToBeProcessed = new ReplaceRegion(offset, value.length(), value);
			xtextResource.update(replaceRegionToBeProcessed.getOffset(), replaceRegionToBeProcessed.getLength(),
					replaceRegionToBeProcessed.getText());
		}
		updateIndex();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
		try {
			if (!xtextResource.getContents().isEmpty())
				if (validateSyntax(xtextResource.getContents().get(0), xtextResource)) {
					String text = getViewer().getDocument().get();
					xtextResource.reparse(text);
				}
		} catch (IOException ex) {
			logger.error(ex.getMessage(), ex);
		}
		validateResource();
	}

	@Override
	public void updateIndex() {
		SafeRunnable.run(new SafeRunnable() {
			private static final long serialVersionUID = 1L;

			public void run() {
				iObjectDescriptions = Collections.emptyList();
				EcoreUtil2.resolveAll(xtextResource);
				IResourceDescription resourceDescription = descriptionManager.getResourceDescription(xtextResource);
				Manager manager = xtextResource.getResourceServiceProvider().getResourceDescriptionManager();
				resourceDescription = manager.getResourceDescription(xtextResource);
				iObjectDescriptions = Iterables.concat(iObjectDescriptions, resourceDescription.getExportedObjects());
				Iterable<String> referrables = Iterables.transform(iObjectDescriptions,
						new Function<IEObjectDescription, String>() {
							@Override
							public String apply(IEObjectDescription input) {
								return input.getName().toString() + ":" + input.getEClass().getName();
							}
						});
				setScope(Lists.newArrayList(referrables));
			}
		});
	}

	@Override
	protected void createCompletionProposals() {
		IDocument document = getViewer().getDocument();
		if (document.get().length() > 0) {
			BasicText textWidget = getViewer().getTextWidget();
			createCompletionProposals(textWidget.getOffsetAtCursorPosition());
		}
	}

	@Override
	public void createCompletionProposals(final int offset) {
		// delegate to subclass.
	}

	@Override
	public void validateResource() {
		SafeRunnable.run(new SafeRunnable() {
			private static final long serialVersionUID = 1L;
			public void run() {
				IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider()
						.getResourceValidator();
				try {
					List<Issue> issues = resourceValidator.validate(xtextResource, CheckMode.NORMAL_AND_FAST,
							CancelIndicator.NullImpl);
					createAnnotations(issues);
				} catch (Exception ex) {
					if (ex instanceof RuntimeException) {
						logger.error(ex.getMessage(), ex);
					}
				}
			}
		});
	}

	/**
	 * Displays annotations for the given issues
	 * 
	 * @param issues
	 */
	protected void createAnnotations(List<Issue> issues) {
		List<Annotation> annotations = new ArrayList<Annotation>();
		for (Issue issue : issues) {
			//if (!issue.isSyntaxError()) {
				Integer offset = issue.getOffset();
				Integer line = issue.getLineNumber();
				int lineNumber = line.intValue();
				String message = issue.getMessage();
				Severity severity = issue.getSeverity();
				annotations.add(new Annotation(convertSeverity(severity), lineNumber, offset, message));
			//}
		}
		getViewer().getTextWidget().setAnnotations(annotations);
	}

	protected void updateResource(String text) {
		ReplaceRegion replaceRegionToBeProcessed = new ReplaceRegion(0, text.length(), text);
		xtextResource.update(replaceRegionToBeProcessed.getOffset(), replaceRegionToBeProcessed.getLength(),
				replaceRegionToBeProcessed.getText());
	}

	/**
	 * Validates the concrete syntax of the language
	 * 
	 * @param object
	 * @param hostingResource
	 * @return
	 */
	protected boolean validateSyntax(EObject object, XtextResource hostingResource) {
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		IConcreteSyntaxValidator concreteSyntaxValidator = hostingResource.getConcreteSyntaxValidator();
		concreteSyntaxValidator.validateRecursive(object,
				new IConcreteSyntaxValidator.DiagnosticListAcceptor(diagnostics), new HashMap<Object, Object>());
		if (!diagnostics.isEmpty()) {
			return false;
		}
		return true;
	}

	private AceSeverity convertSeverity(Severity severity) {
		switch (severity) {
		case ERROR:
			return AceSeverity.ERROR;
		case WARNING:
			return AceSeverity.WARNING;
		case INFO:
			return AceSeverity.INFO;
		default:
			break;
		}
		return null;
	}

	public void setLanguageName(String name) {
		this.languageName = name;
	}

	public String getLanguageName() {
		return languageName;
	}
}