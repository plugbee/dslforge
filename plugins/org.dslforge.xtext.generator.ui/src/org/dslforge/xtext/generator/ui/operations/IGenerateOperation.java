package org.dslforge.xtext.generator.ui.operations;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

public interface IGenerateOperation {

	void doGenerate(IProject project, IProgressMonitor subMonitor);
}
