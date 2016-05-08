package org.dslforge.xtext.generator.module;

import java.util.List;

import org.eclipse.xtext.mwe.RuntimeResourceSetInitializer;

public class StandaloneRuntimeResourceSetInitializer extends RuntimeResourceSetInitializer {

	public StandaloneRuntimeResourceSetInitializer() {
		super();
	}
	
	@Override
	public List<String> getClassPathEntries() {
		List<String> classPathEntries = super.getClassPathEntries();
		return classPathEntries;
	}
}
