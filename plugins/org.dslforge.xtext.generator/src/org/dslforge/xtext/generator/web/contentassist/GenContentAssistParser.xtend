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

import com.google.common.collect.Maps
import java.io.File
import java.util.Map
import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.mwe.core.WorkflowContext
import org.eclipse.emf.mwe.core.issues.IssuesImpl
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor
import org.eclipse.xpand2.output.Outlet
import org.eclipse.xtend.expression.Variable
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.Generator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.generator.LanguageConfig
import org.eclipse.xtext.generator.Naming
import org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
import org.eclipse.xtext.generator.parser.antlr.AntlrOptions
import org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * This generator is invoked to embedd the generated artefacts the Xtext content 
 * assist feature. Basically, the Xtext generator is invoked with a minimal set 
 * of fragments necessary to generate the content assist artefacts in the web plugin.
 */
class GenContentAssistParser implements IWebProjectGenerator {

	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar
	var String workspaceRoot;

	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName = GeneratorUtil::getProjectName(grammar)
		grammarShortName = GeneratorUtil::getGrammarShortName(grammar)
		basePath = GeneratorUtil::getBasePath(grammar)

		val output = (fsa as JavaIoFileSystemAccess).outputConfigurations.get("src");
		val outputDirectory = output.outputDirectory
		val baseURI = URI.createURI(outputDirectory, false)
		val URI root = baseURI.trimSegments(2);
		workspaceRoot = root.toString

		// initialize global variables
		var Map<String, Variable> globalVars = Maps.newHashMap();
		val Naming naming = new Naming()
		naming.hasIde = false;
		naming.hasUI = true;
		naming.grammarId = grammar.name;
		naming.setProjectNameUi(getProjectNameUi());
		naming.setUiBasePackage(getProjectNameUi());
		// we disable the generation of the runtime plugin, 
		// as we give priority to the Xtext workflow
		// naming.setProjectNameRt(getProjectNameRt());
		naming.setProjectNameIde(null);
		naming.setProjectNameUi(getProjectNameUi());
		naming.setUiBasePackage(getProjectNameUi());
		naming.setActivatorName(projectNameUi + ".internal." + "Activator");
		naming.setFileHeader("/*Hacked by DSL Forge*/");
		naming.setHasUI(true);
		naming.setHasIde(false);

		// the language config
		val languageConfig = new LanguageConfig()
		languageConfig.uri = grammar.eResource.URI.toString // this set the grammar handle
		languageConfig.setForcedResourceSet(new XtextResourceSet());
		languageConfig.fileExtensions = GeneratorUtil::getFileExtension(grammar);
		languageConfig.addFragment(new GrammarAccessFragment)
		languageConfig.addFragment(new WebContentAssistFragment(grammar))
		languageConfig.addFragment(new XtextAntlrUiGeneratorFragment)
		languageConfig.registerNaming(naming);

		val AntlrOptions antlrOptions = new AntlrOptions();
		antlrOptions.setBacktrack(false);
		antlrOptions.setMemoize(false);

		var Generator xtextGenerator = new Generator()
		xtextGenerator.pathUiProject = pathUiProject
		// xtextGenerator.pathRtProject = pathRtProject
		xtextGenerator.projectNameRt = GeneratorUtil::getDslProjectName(grammar)
		xtextGenerator.projectNameUi = projectNameUi
		xtextGenerator.activator = projectNameUi + ".internal." + "Activator"
		xtextGenerator.encoding = "UTF-8"
		xtextGenerator.addLanguage(languageConfig)
		xtextGenerator.naming = naming
		xtextGenerator.mergeManifest = false;

		globalVars.put(Naming.GLOBAL_VAR_NAME, new Variable(Naming.GLOBAL_VAR_NAME, naming));

		try {
			// invoke
			val IssuesImpl issuesImpl = new IssuesImpl();
			xtextGenerator.invoke(new WorkflowContext() {

				override get(String slotName) {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override getSlotNames() {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

				override set(String slotName, Object value) {
					throw new UnsupportedOperationException("TODO: auto-generated method stub")
				}

			}, new NullProgressMonitor(), issuesImpl);

			System.out.println("[INFO] - Xtext content assist parser embedded successfully!");
			// WORKAROUND!! the Xtext generator adds the default UI modules, difficult to avoid as 
			// the methods are private and the templates in old Xpand.
			// remove them as we use our own web modules
			deleteFile(
				projectName + "/" + "src-gen" + "/" + basePath + "/" + "Abstract" + grammarShortName.toFirstUpper +
					"UiModule.java")
					deleteFile(projectName + "/" + "src" + "/" + basePath + "/" + grammarShortName.toFirstUpper +
						"UiModule.java")

				} catch (Exception ex) {
					ex.printStackTrace
				}
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
				return GeneratorUtil::getDslProjectName(grammar);
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
				return workspaceRoot + "/" + GeneratorUtil.getDslProjectName(grammar);
			}

			def String getEncoding() {
				return "UTF-8";
			}

			def Outlet createOutlet(boolean append, String encoding, String name, boolean overwrite, String path) {
				val Outlet outlet = new Outlet(append, encoding, name, overwrite, path);
				return outlet;
			}

			override doGenerate(Resource input, IFileSystemAccess fsa) {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}
		}