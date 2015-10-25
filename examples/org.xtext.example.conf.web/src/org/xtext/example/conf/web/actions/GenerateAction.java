package org.xtext.example.conf.web.actions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dslforge.rap.xtext.common.BasicXtextEditor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.xtext.example.conf.web.wizards.GeneratorWizard;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.Injector;

public class GenerateAction extends Action {

	private static final long serialVersionUID = 1L;

	public GenerateAction() {
		setId("generate action");
		setEnabled(true);
		setText("Generate HTML");
	}

	private Injector injector;

	private Map<String, String> outlets = new HashMap<String, String>();

	@Override
	public void runWithEvent(Event event) {
		
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		if (editor != null) {
			if (editor instanceof BasicXtextEditor) {
				IEditorInput input = ((BasicXtextEditor) editor).getEditorInput();
				if (input instanceof URIEditorInput) {
					URIEditorInput fileURI = (URIEditorInput) input;
					URI uri = fileURI.getURI();
		
					//open configuration window
					GeneratorWizard wizard = new GeneratorWizard();
					wizard.setURI(uri);
					WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
					int result = wizardDialog.open();
				}
			}
		}
//		if (result==0) {//OK
//			final String targetDirectory = wizard.getTargetDirectory();
//			IEditorPart editor = page.getActiveEditor();
//			if (editor != null) {
//				if (editor instanceof BasicXtextEditor) {
//					IEditorInput input = ((BasicXtextEditor) editor).getEditorInput();
//					if (input instanceof URIEditorInput) {
//						URIEditorInput fileURI = (URIEditorInput) input;
//						URI uri = fileURI.getURI();
//
//						//Load resource
//						injector = new ConfStandaloneSetup().createInjectorAndDoEMFRegistration();
//						XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//						Resource resource = resourceSet.getResource(uri, true);
//						
//						//Generate code
//						IGenerator compiler = injector.getInstance(IGenerator.class);
//						if (compiler instanceof ConfGenerator) {
//							outlets.put("DEFAULT_OUTPUT", targetDirectory);		 			
//							IFileSystemAccess fsa = getConfiguredFileSystemAccess();	
//							compiler.doGenerate(resource, fsa);	
//							System.out.println("[dslforge] - code successfully generated.");
//						}
//					}
//				}
//			}	
//		}
	}

	protected IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
		configuredFileSystemAccess.setOutputConfigurations(getOutputConfigurations());
		for (Entry<String, String> outs : outlets.entrySet()) {
			configuredFileSystemAccess.setOutputPath(outs.getKey(), outs.getValue());
		}
		return configuredFileSystemAccess;
	}

	protected Map<String, OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> configurations = getDefaultOutputConfigurations();
		return Maps.uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
			public String apply(OutputConfiguration from) {
				return from.getName();
					}
		});
	}
	
	Set<OutputConfiguration> getDefaultOutputConfigurations() {
		Set<OutputConfiguration> outputs = new HashSet<OutputConfiguration>();
		OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory(outlets.get("DEFAULT_OUTPUT"));
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		outputs.add(defaultOutput);		
		return outputs;
	}
}
