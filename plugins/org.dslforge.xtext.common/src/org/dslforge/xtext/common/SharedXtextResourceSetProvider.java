package org.dslforge.xtext.common;

import java.io.File;

import org.dslforge.xtext.common.registry.LanguageRegistry;
import org.dslforge.xtext.common.util.FileUtil;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class SharedXtextResourceSetProvider extends XtextResourceSetProvider {

	@Override
	public ResourceSet get(File project) {
		return LanguageRegistry.INSTANCE.getDefaultResourceSet(FileUtil.getFileExtension(project));
	}
}
