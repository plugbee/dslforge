package org.xtext.example.conf.web.editor;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.dslforge.rap.xtext.common.BasicXtextEditor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.resource.XtextResource;
import org.xtext.example.conf.ConfStandaloneSetup;
import org.xtext.example.conf.web.editor.widget.Conf;


public class ConfEditor extends BasicXtextEditor {

	private Conf confWidget;

	public ConfEditor() {
		new ConfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	KeyAdapter keyListener = new KeyAdapter() {

		private static final long serialVersionUID = 1L;

		public void keyPressed(KeyEvent event) {
			setDirty(true);
		}
	};
	
	private void addListeners() {
		//verification key listener
		if (confWidget!=null) {
			confWidget.addKeyListener(keyListener);
		}
	}
	
	@Override
	public void createPartControl(Composite parent) {
		//System.out.println("[dslforge] - create part control");
		Font font = parent.getFont();
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		parent.setLayout(gridLayout);
		confWidget = new Conf(parent, SWT.FILL);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		confWidget.setLayoutData(textLayoutData);
		confWidget.setFont(font);
		confWidget.addListener(this);
		initWidget();
		setDirty(false);
		addListeners();
	}

	private void initWidget() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resource = (XtextResource) resourceSet.getResource(uri, true);
		if (resource.getContents().isEmpty())
			setEditorContent("");
		else {
			EObject root = resource.getContents().get(0);
			if (root!=null) {
				if (validateObject(root, resource)) {
					String content = resource.getSerializer().serialize(root);
					setEditorContent(content);
				} else {
					setEditorContent("");	
				}
			}	
		}
	}
	
	@Override
	protected void setEditorContent(String string) {
		confWidget.setText(string);
	}
	
	@Override
	public void reparse(JsonValue value) {
		//System.out.println("[dslforge] - updating resource...");
		super.reparse(value);
		String text = confWidget.getText();
		updateResource(text);
	}
	
	private void updateResource(String string) {
		try {
			resource.reparse(string);
			EObject eObject = resource.getContents().get(0);
			//String newValue = resource.getSerializer().serialize(eObject);
			//System.out.println(newValue);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
		//System.out.println("[dslforge] - save request");
		if (resource !=null) {
			try {
				Map<Object, Object> options = new HashMap<Object, Object>();
				resource.save(options);
				setDirty(false);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Override
	public void dispose() {
		if (!confWidget.isDisposed()) {
			confWidget.removeKeyListener(keyListener);
			confWidget.removeListener(this);
			confWidget.dispose();
		}
		super.dispose();
	}
	
	public void setLanguageName(String name) {
		this.languageName = name;
	}

	public String getLanguageName() {
		return languageName;
	}
}