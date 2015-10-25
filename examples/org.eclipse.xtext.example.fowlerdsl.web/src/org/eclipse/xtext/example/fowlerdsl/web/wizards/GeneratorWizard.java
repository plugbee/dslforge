package org.eclipse.xtext.example.fowlerdsl.web.wizards;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.xtext.example.fowlerdsl.StatemachineStandaloneSetup;
import org.eclipse.xtext.example.fowlerdsl.generator.StatemachineGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class GeneratorWizard extends Wizard {

	// dialog store id constants
    public final static String STORE_DIRECTORIES = "StatemachineGeneratorPreferences";//$NON-NLS-1$
    
	private GeneratorWizardPage page = null;

	private Injector injector;

	private URI fileURI;
	
	private Map<String, String> outlets = new HashMap<String, String>();
	
	public GeneratorWizard() {
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
        IDialogSettings section = workbenchSettings
                .getSection(STORE_DIRECTORIES);//$NON-NLS-1$
        if (section == null) {
			section = workbenchSettings.addNewSection(STORE_DIRECTORIES);//$NON-NLS-1$
		}
        setDialogSettings(section);
	}
		
	@Override
	public void addPages() {
		page = new GeneratorWizardPage("Whatever2");
		page.setTitle("Generator Preferences");
		page.setDescription("Configure code generation");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		page.saveWidgetValues();
		String targetDirectory = page.getTargetDirectory();

		// Load resource
		injector = new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.getResource(fileURI, true);

		// Generate code
		IGenerator compiler = injector.getInstance(IGenerator.class);
		if (compiler instanceof StatemachineGenerator) {
			outlets.put("DEFAULT_OUTPUT", targetDirectory);
			IFileSystemAccess fsa = getConfiguredFileSystemAccess();
			compiler.doGenerate(resource, fsa);
			return true;
		}
		return false;
	}

	public String getTargetDirectory() {
		return page.getTargetDirectory();
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

	public void setURI(URI uri) {
		fileURI = uri;
	}
}
