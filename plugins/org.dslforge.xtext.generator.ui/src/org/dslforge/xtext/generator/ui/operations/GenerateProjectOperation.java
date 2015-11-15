package org.dslforge.xtext.generator.ui.operations;

import static com.google.common.collect.Maps.newHashMap;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

import org.dslforge.xtext.generator.IWebProjectGenerator;
import org.dslforge.xtext.generator.setup.WebProjectGeneratorSetup;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.generator.IGenerator;

import com.google.inject.Injector;

public abstract class GenerateProjectOperation extends WorkspaceModifyOperation implements IGenerateOperation {

	Map<String, Object> settings = Collections.emptyMap();
	
	protected Injector xtextInjector;

	protected Injector generatorInjector;
	
	protected IWebProjectGenerator instance; 

	protected Grammar grammar;
	
	protected Map<String, String> outlets = newHashMap();


	protected Injector getXtextInjector() {
		if (xtextInjector == null)
			xtextInjector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		return xtextInjector;
	}

	protected IGenerator getInstance() {
		if (generatorInjector==null)
			generatorInjector = new WebProjectGeneratorSetup().createInjectorAndDoEMFRegistration();
		return generatorInjector.getInstance(IWebProjectGenerator.class);
	}
	
	public void setGrammar(Grammar object) {
		this.grammar = object;
	}
	
	public Grammar getGrammar() {
		return this.grammar;
	}
	
	public GenerateProjectOperation(Map<String, Object> settings) {
		this.settings = settings;
	}

	@Override
	protected abstract void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException;

}
