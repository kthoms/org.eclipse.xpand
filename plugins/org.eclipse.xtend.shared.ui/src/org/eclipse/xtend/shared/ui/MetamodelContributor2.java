package org.eclipse.xtend.shared.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.jdt.core.IJavaProject;

public interface MetamodelContributor2 extends MetamodelContributor {
	IStorage getUnderlyingStorage(final IJavaProject project, String typeName);
}
