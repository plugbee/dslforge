package org.dslforge.styledtext.jface;

import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.ITextSelection;
import org.dslforge.styledtext.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class TextViewer extends Viewer implements ITextViewer{

	private static final long serialVersionUID = 1L;
	private BasicText fTextWidget;
	private IDocument fDocument;
	private Control fDisposedControl;

	protected TextViewer() {
	}

	/**
	 * Create a new text viewer with the given SWT style bits.
	 *
	 * @param parent the parent of the viewer's control
	 * @param styles the SWT style bits for the viewer's control
	 */
	public TextViewer(Composite parent, int styles) {
		createControl(parent, styles);
	}

	/**
	 * Create a new text viewer based on the text widget given as input
	 *
	 * @param textWidget the available text widget
	 */
	public TextViewer(BasicText textWidget) {
		fTextWidget = textWidget;
		configureTextWidget(textWidget.getParent());
	}
	
	/**
	 * Creates the viewer's SWT control. The viewer's text widget either is
	 * the control or is a child of the control.
	 *
	 * @param parent the parent of the viewer's control
	 * @param styles the SWT style bits for the viewer's control
	 */
	protected void createControl(Composite parent, int styles) {
		fTextWidget= createTextWidget(parent, styles);
		configureTextWidget(parent);
	}

	/**
	 * Configures the editor's text widget
	 */
	@SuppressWarnings("serial")
	private void configureTextWidget(Composite parent) {
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		fTextWidget.setLayoutData(textLayoutData);
		
		fTextWidget.addDisposeListener(
			new DisposeListener() {
				public void widgetDisposed(DisposeEvent e) {
					fDisposedControl= getControl();
					handleDispose();
				}
			}
		);

		fTextWidget.setFont(parent.getFont());

		fTextWidget.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if ((SWT.SHIFT == e.stateMask) && ('\t' == e.character))
					e.doit= !fTextWidget.getEditable();
			}
		});
	}

	/**
	 * Factory method to create the text widget to be used as the viewer's text widget.
	 *
	 * @param parent the parent of the styled text
	 * @param styles the styles for the styled text
	 * @return the text widget to be used
	 */
	protected BasicText createTextWidget(Composite parent, int styles) {
		BasicText textWidget= new BasicText(parent, styles);
		return textWidget;
	}
	
	/**
	 * @see Viewer#getControl()
	 */
	public Control getControl() {
		return fTextWidget != null ? fTextWidget : fDisposedControl;
	}
	
	/**
	 * Frees all resources allocated by this viewer. Internally called when the viewer's
	 * control has been disposed.
	 */
	protected void handleDispose() {
		fTextWidget= null;
	}

	/**
	 * @see Viewer#getInput()
	 */
	public Object getInput() {
		return getDocument();
	}
	
	@Override
	public ISelection getSelection() {
		if (fTextWidget != null ) {
			return fTextWidget.getSelection();
		}
		return TextSelection.EMPTY;
	}

	@Override
	public void refresh() {
		setDocument(getDocument());
	}

	@Override
	public void setInput(Object input) {
		IDocument document= null;
		if (input instanceof IDocument)
			document= (IDocument) input;
		setDocument(document);
	}

	@Override
	public void setSelection(ISelection selection) {
		if (selection instanceof ITextSelection) {
			ITextSelection s= (ITextSelection) selection;
			fTextWidget.setSelection(s.getText(), s.getRowStart(), s.getRowEnd(), s.getColumnStart(), s.getColumnEnd());
		}
	}

	@Override
	public BasicText getTextWidget() {
		return fTextWidget;
	}

	@Override
	public void setDocument(IDocument document) {
		fDocument= document;
	}

	@Override
	public void setText(String text) {
		fDocument.set(text);
	}


	/**
	 * @see ITextViewer#getDocument()
	 */
	public IDocument getDocument() {
		return fDocument;
	}

	/**
	 * @see ITextViewer#isEditable()
	 */
	public boolean isEditable() {
		if (fTextWidget == null)
			return false;
		return fTextWidget.getEditable();
	}

	/**
	 * @see ITextViewer#setEditable(boolean)
	 */
	public void setEditable(boolean editable) {
		if (fTextWidget != null)
			fTextWidget.setEditable(editable);
	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return this;
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		if (reveal)
			setSelection(selection);
	}
}
