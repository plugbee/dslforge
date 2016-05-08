package org.dslforge.xtext.generator.ui.wizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

import com.google.inject.Injector;

class XtextGrammarSelectionDialog extends FilteredResourcesSelectionDialog {

	protected IContainer container;
	protected IStatus status;
	protected StatusLineManager statusLineManager;
	protected Injector injector;
	protected IFile selectedFile;
	
	protected class XtextResourceFilter extends FilteredResourcesSelectionDialog.ResourceFilter {
		public XtextResourceFilter(IContainer container) {
			super(container, false, IResource.FILE);
		}

		@Override
		public boolean matchItem(Object item) {
			return item instanceof IFile
					&& IXtextGrammarConstants.XTEXT_FILE_EXTENSION.equals(((IFile) item).getFileExtension())
					&& super.matchItem(item);
		}
	}

	public XtextGrammarSelectionDialog(Shell shell, boolean multi, IContainer container, int typesMask) {
		super(shell, multi, container, typesMask);
		this.container = container;
	}
	
	public IFile getGrammarFile() {
		return selectedFile;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		statusLineManager = new StatusLineManager();
		statusLineManager.createControl(composite);
		statusLineManager.setCancelEnabled(true);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.heightHint = convertVerticalDLUsToPixels(9);
		statusLineManager.getControl().setLayoutData(gridData);
		return composite;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		Button okButton = getOkButton();
		okButton.setText(IDialogConstants.NEXT_LABEL);
		Button button = createButton(parent, IDialogConstants.BACK_ID, IDialogConstants.BACK_LABEL, false);
		button.moveAbove(okButton);
		button.setEnabled(false);
		button = createButton(parent, IDialogConstants.FINISH_ID, IDialogConstants.FINISH_LABEL, false);
		button.moveBelow(okButton);
		button.setEnabled(false);
	}

	@Override
	protected ItemsFilter createFilter() {
		return new XtextResourceFilter(container);
	}

	@Override
	protected void updateStatus(IStatus status) {
		this.status = status;
		super.updateStatus(status);
	}

	@Override
	protected void okPressed() {
		if (status != null && (status.isOK() || status.getCode() == IStatus.INFO)) {
			computeResult();
			IProgressMonitor progressMonitor = statusLineManager.getProgressMonitor();
			progressMonitor.beginTask("", 10);
			setSingleSelection(getResult());
			progressMonitor.done();
			close();
		}
	}

	protected void setSingleSelection(Object[] result) {
		if (result.length>=1)
			selectedFile = (IFile) result[0];
	}
}