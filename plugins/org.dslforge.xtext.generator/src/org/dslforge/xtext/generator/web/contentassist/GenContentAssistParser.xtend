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
package org.dslforge.xtext.generator.web.contentassist

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import java.io.File
import java.util.List
import java.util.Map
import org.apache.log4j.Logger
import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.mwe.core.WorkflowInterruptedException
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.emf.mwe.core.issues.IssuesImpl
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor
import org.eclipse.emf.mwe.core.monitor.ProgressMonitorAdapter
import org.eclipse.xpand2.XpandExecutionContext
import org.eclipse.xpand2.XpandExecutionContextImpl
import org.eclipse.xpand2.output.Outlet
import org.eclipse.xpand2.output.OutputImpl
import org.eclipse.xpand2.output.PostProcessor
import org.eclipse.xtend.expression.Variable
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.XtextStandaloneSetup
import org.eclipse.xtext.generator.CompositeGeneratorException
import org.eclipse.xtext.generator.Generator
import org.eclipse.xtext.generator.LanguageConfig
import org.eclipse.xtext.generator.Naming
import org.eclipse.xtext.generator.NewlineNormalizer
import org.eclipse.xtext.generator.parser.antlr.AntlrOptions
import org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.validation.Issue

/**
 * The Xtext generator is invoked programmatically with a minimal set of fragments just enough 
 * to generate the content assist artifacts in the web plugin.
 */
class GenContentAssistParser extends AbstractGenerator {

	static final Logger logger = Logger.getLogger(GenContentAssistParser);

	public static final String SRC_GEN_TEST = "SRC_GEN_TEST";
	public static final String SRC_TEST = "SRC_TEST";
	public static final String PLUGIN_TEST = "PLUGIN_TEST";
	public static final String SRC_GEN_UI = "SRC_GEN_UI";
	public static final String SRC_UI = "SRC_UI";
	public static final String PLUGIN_UI = "PLUGIN_UI";
	public static final String SRC_GEN_IDE = "SRC_GEN_IDE";
	public static final String SRC_IDE = "SRC_IDE";
	public static final String PLUGIN_IDE = "PLUGIN_IDE";
	public static final String SRC = "SRC";
	public static final String SRC_GEN = "SRC_GEN";
	public static final String MODEL = "MODEL";
	public static final String PLUGIN_RT = "PLUGIN";

	var XtextGrammar wrapped
	var String workspaceRoot;
	val List<PostProcessor> postProcessors = Lists.newArrayList();

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		var SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
		subMonitor.setWorkRemaining(100)
		
		val workspace = factory.project.location
		workspaceRoot = workspace.removeLastSegments(1).toString
		wrapped = factory.input as XtextGrammar
		projectName = wrapped.getProjectName()
		grammarShortName = wrapped.getShortName()
		basePath = wrapped.getBasePath()

		val naming = createNaming()
		val languageConfig = createLanguageConfiguration(naming)
		val AntlrOptions antlrOptions = new AntlrOptions()
		antlrOptions.setBacktrack(false);
		antlrOptions.setMemoize(false);

		var Generator xtextGenerator = new Generator()
		xtextGenerator.pathUiProject = pathUiProject
		xtextGenerator.projectNameRt = wrapped.getDslProjectName()
		xtextGenerator.projectNameUi = projectNameUi
		xtextGenerator.activator = projectNameUi + ".internal." + "Activator"
		xtextGenerator.encoding = "UTF-8"
		xtextGenerator.addLanguage(languageConfig)
		xtextGenerator.naming = naming
		xtextGenerator.mergeManifest = false;
		var Map<String, Variable> globalVars = Maps.newHashMap();
		globalVars.put(Naming.GLOBAL_VAR_NAME, new Variable(Naming.GLOBAL_VAR_NAME, naming));
	
		try {
			// invoke the workflow programmatically
			val IssuesImpl issuesImpl = new IssuesImpl();
			subMonitor.subTask("Invoking Xtext workflow");
			val progress = new ProgressMonitorAdapter(subMonitor.newChild(100));
			invokeInternal(naming, languageConfig, progress, issuesImpl)

		} catch (Exception ex) {
			logger.error(ex.message, ex)
		}
	}

	def Naming createNaming() {
		val Naming naming = new Naming()
		naming.hasIde = false;
		naming.hasUI = true;
		naming.grammarId = wrapped.grammar.name;
		naming.setProjectNameUi(getProjectNameUi());
		naming.setUiBasePackage(getProjectNameUi());
		// we disable the generation of the runtime plugin, 
		// as we give priority to the Xtext workflow
		naming.setProjectNameRt(getProjectNameRt());
		naming.setProjectNameIde(null);
		naming.setProjectNameUi(getProjectNameUi());
		naming.setUiBasePackage(getProjectNameUi());
		naming.setActivatorName(projectNameUi + ".internal." + "Activator");
		naming.setFileHeader("/*Generated by Xtext*/");
		naming.setHasUI(true);
		naming.setHasIde(false);
		return naming
	}

	def LanguageConfig createLanguageConfiguration(Naming naming) {
		// the language config
		val languageConfig = new LanguageConfig()
		val grammar = wrapped.grammar
		EcoreUtil2::resolveAll(grammar)
		// set the grammar handle
		val xtextResource = wrapped.grammar.eResource as XtextResource
		var resourceSet = xtextResource.resourceSet
		// initialize resourceSet
		languageConfig.setForcedResourceSet(resourceSet);
		languageConfig.uri = xtextResource.URI.toString
		languageConfig.fileExtensions = wrapped.getFileExtension();
		languageConfig.addFragment(new WebContentAssistFragment(wrapped.grammar))
		val xtextAntlrUiGeneratorFragment = new XtextAntlrUiGeneratorFragment
		val dslProjectLocation = ResourcesPlugin.workspace.root.getProject(projectNameRt).location
		xtextAntlrUiGeneratorFragment.antlrTool.downloadTo = dslProjectLocation + "/.antlr-generator-3.2.0-patch.jar"
		xtextAntlrUiGeneratorFragment.antlrTool.askBeforeDownload = false
		languageConfig.addFragment(xtextAntlrUiGeneratorFragment)
		languageConfig.registerNaming(naming);
		return languageConfig
	}

	protected def void validateXtext(XtextResource xtextResource) {
		val IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
		try {
			val List<Issue> issues = resourceValidator.validate(xtextResource, CheckMode.FAST_ONLY,
				CancelIndicator.NullImpl);
			if (issues.isEmpty)
				throw new RuntimeException("Could not generate content assist feature: the Xtext model is not valid.")
		} catch (Exception ex) {
			logger.error(ex.message, ex)
		}
	}

	def void invokeInternal(Naming naming, LanguageConfig config, ProgressMonitor monitor, Issues issues) {
		new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		try {
			val XpandExecutionContext exeCtx = createExecutionContext(naming, monitor);
			generate(config, exeCtx, issues);
		} catch (WorkflowInterruptedException ex) {
			throw ex;
		} catch (Exception ex) {
			logger.error(ex.message, ex)
		}
	}

	def void generate(LanguageConfig config, XpandExecutionContext ctx, Issues issues) {
		try {
			config.generate(config, ctx);
		} catch (CompositeGeneratorException ex) {
			logger.error(ex.message, ex)
		}
	}

	def XpandExecutionContext createExecutionContext(Naming naming, ProgressMonitor monitor) {
		// configure outlets
		var OutputImpl output = new OutputImpl();
		output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_RT, false, getPathRtProject()));
		output.addOutlet(createOutlet(false, getEncoding(), SRC, false, getPathRtProject() + getSrcPath()));
		output.addOutlet(createOutlet(false, getEncoding(), SRC_GEN, true, getPathRtProject() + getSrcGenPath()));
		output.addOutlet(createOutlet(false, getEncoding(), MODEL, false, getPathRtProject() + "/model"));
		if (getPathUiProject() != null) {
			output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_UI, false, getPathUiProject()));
			output.addOutlet(createOutlet(false, getEncoding(), SRC_UI, false, getPathUiProject() + getSrcPath()));
			output.addOutlet(
				createOutlet(false, getEncoding(), SRC_GEN_UI, true, getPathUiProject() + getSrcGenPath()));
		} else {
			output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_UI, false, getPathRtProject()));
			output.addOutlet(createOutlet(false, getEncoding(), SRC_UI, false, getPathRtProject() + getSrcPath()));
			output.addOutlet(
				createOutlet(false, getEncoding(), SRC_GEN_UI, true, getPathRtProject() + getSrcGenPath()));
		}
		if (getPathIdeProject() != null) {
			output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_IDE, false, getPathIdeProject()));
			output.addOutlet(createOutlet(false, getEncoding(), SRC_IDE, false, getPathIdeProject() + getSrcPath()));
			output.addOutlet(
				createOutlet(false, getEncoding(), SRC_GEN_IDE, true, getPathIdeProject() + getSrcGenPath()));
		} else if (getPathUiProject() != null) {
			output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_IDE, false, getPathUiProject()));
			output.addOutlet(createOutlet(false, getEncoding(), SRC_IDE, false, getPathUiProject() + getSrcPath()));
			output.addOutlet(
				createOutlet(false, getEncoding(), SRC_GEN_IDE, true, getPathUiProject() + getSrcGenPath()));
		} else {
			output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_IDE, false, getPathRtProject()));
			output.addOutlet(createOutlet(false, getEncoding(), SRC_IDE, false, getPathRtProject() + getSrcPath()));
			output.addOutlet(
				createOutlet(false, getEncoding(), SRC_GEN_IDE, true, getPathRtProject() + getSrcGenPath()));
		}
		if (!Strings.isEmpty(getPathTestProject())) {
			output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_TEST, false, getPathTestProject()));
			output.addOutlet(createOutlet(false, getEncoding(), SRC_TEST, false, getPathTestProject() + getSrcPath()));
			output.addOutlet(
				createOutlet(false, getEncoding(), SRC_GEN_TEST, true, getPathTestProject() + getSrcGenPath()));
		} else {
			output.addOutlet(createOutlet(false, getEncoding(), PLUGIN_TEST, false, getPathRtProject()));
			output.addOutlet(createOutlet(false, getEncoding(), SRC_TEST, false, getPathRtProject() + getSrcPath()));
			output.addOutlet(
				createOutlet(false, getEncoding(), SRC_GEN_TEST, true, getPathRtProject() + getSrcGenPath()));
		}
		// initialize global vars
		var Map<String, Variable> globalVars = Maps.newHashMap();
		globalVars.put(Naming.GLOBAL_VAR_NAME, new Variable(Naming.GLOBAL_VAR_NAME, naming));
		// create execution context
		var XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null, globalVars, null, null);
		execCtx.getResourceManager().setFileEncoding("ISO-8859-1");
		execCtx.registerMetaModel(new JavaBeansMetaModel());
		execCtx.monitor = monitor
		return execCtx;
	}

	def Outlet createOutlet(boolean append, String encoding, String name, boolean overwrite, String path) {
		var Outlet outlet = new Outlet(append, encoding, name, overwrite, path);
		outlet.addPostprocessor(new NewlineNormalizer(getLineDelimiter()));
		for (PostProcessor pp : getPostProcessors()) {
			outlet.addPostprocessor(pp);
		}
		return outlet;
	}

	def deleteFile(String filePath) {
		val String pathname = workspaceRoot + "/" + filePath;
		val File file = new File(pathname);
		if (file.exists()) {
			if (!file.delete()) {
				throw new IllegalStateException("couldn't delete file '" + pathname);
			}
		}
	}

	def String getPathIdeProject() {
		return null;
	}

	def String getProjectNameUi() {
		return projectName;
	}

	def String getProjectNameRt() {
		return wrapped.getDslProjectName();
	}

	def String getSrcGenPath() {
		return "/src-gen"
	}

	def String getSrcPath() {
		return "/src"
	}

	def String getPathUiProject() {
		return workspaceRoot + "/" + projectName;
	}

	def getPathRtProject() {
		return workspaceRoot + "/" + wrapped.getDslProjectName();
	}

	def String getEncoding() {
		return "UTF-8";
	}

	def String getLineDelimiter() {
		return "\n";
	}

	def String getPathTestProject() {
		return null;
	}

	def getPostProcessors() {
		return postProcessors
	}
}
