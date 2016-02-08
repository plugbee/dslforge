package org.dslforge.xtext.common;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.jface.ICompletionProposal;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.dslforge.styledtext.jface.IDocument;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.util.ReplaceRegion;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * An Xtext web editor which makes use of the migrated content assist feature.
 */
public class XtextContentAssistEnabledEditor extends BasicXtextEditor {

	@Inject
	IContentAssistProcessor contentAssistProcessor;

	public XtextContentAssistEnabledEditor() {
		super();
	}

	@Override
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

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		createCompletionProposals(0);
	}

	@Override
	protected void handleTextChanged(JsonObject object) {
		int offset = object.get("offset") != null ? object.get("offset").asInt() : 0;
		String value = object.get("value") != null ? object.get("value").asString() : null;
		if (value != null) {
			try {
				ReplaceRegion replaceRegionToBeProcessed = new ReplaceRegion(offset, value.length(), value);
				xtextResource.reparse(replaceRegionToBeProcessed.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		updateIndex();
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
				Iterable<String> referrables = Iterables.transform(iObjectDescriptions, new Function<IEObjectDescription, String>() {
					@Override
					public String apply(IEObjectDescription input) {
						return input.getName().toString(); // + ":" + input.getEClass().getName();
					}
				});
				setScope(Lists.newArrayList(referrables));	
			}
		});
	}

	@Override
	protected void createCompletionProposals() {
		IDocument document = getViewer().getDocument();
		if (document.get().length()>0) {
			BasicText textWidget = getViewer().getTextWidget();
			createCompletionProposals(textWidget.getOffsetAtCursorPosition());	
		}
	}
	
	@Override
	public void createCompletionProposals(final int offset) {
		SafeRunnable.run(new SafeRunnable() {
			private static final long serialVersionUID = 1L;
			public void run() {
				System.out.println("[INFO] - completing proposals at offset " + offset);
				XtextContentAssistProcessor xtextContentAssistProcessor = (XtextContentAssistProcessor)contentAssistProcessor;
				ICompletionProposal[] computedCompletionProposals = xtextContentAssistProcessor.computeCompletionProposals(getViewer(), xtextResource, offset);
				if (computedCompletionProposals!=null) {
					List<String> proposals = Lists.transform(Arrays.asList(computedCompletionProposals), new Function<ICompletionProposal, String>() {
						public String apply(ICompletionProposal completionProposal) {
							return completionProposal.getDisplayString();
						}
					});
					System.out.println("[INFO] - sending proposals: " + proposals.toString());
					setProposals(proposals);	
				}
			}
		});
	}
}