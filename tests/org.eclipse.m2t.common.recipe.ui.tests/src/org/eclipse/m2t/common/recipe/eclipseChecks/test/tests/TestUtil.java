package org.eclipse.m2t.common.recipe.eclipseChecks.test.tests;

import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.shared.ui.wizards.EclipseHelper;

public class TestUtil {

	public static void setUpWorkspace() throws CoreException {
		IProject testProject = ResourcesPlugin.getWorkspace().getRoot().getProject("test");
		if (testProject.exists()){
			return;
		}
		
		IProject project = EclipseHelper.createExtXptProject("test", Collections.singletonList("src"), Collections.EMPTY_LIST, Collections.EMPTY_SET,
				Collections.EMPTY_LIST, new NullProgressMonitor(), PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());

		IFolder folder = project.getFolder(new Path("src/org/openarchitectureware/recipe/eclipseChecks/test/impl/"));
		if (!folder.exists()) {
			createFolder(folder);
			
		}
		createFile(folder, "AClass.java");
		createFile(folder, "AClassAnnotation.java");
		createFile(folder, "AnExtendingInterface.java");
		createFile(folder, "AnExtendingSuperclassAndInterfaceClass.java");
		createFile(folder, "AnInterface.java");
		createFile(folder, "ASubclassedClass.java");
		createFile(folder, "ASuperClass.java");
		createFile(folder, "test.properties");
		
		project.open(new NullProgressMonitor());

	}

	private static void createFolder(IFolder folder) throws CoreException {
		while(!folder.exists()){
			createFolder((IFolder) folder.getParent());
			folder.create(true, true, new NullProgressMonitor());
		}
		
	}

	private static void createFile(IFolder folder, String string) {
		URL url = Platform.getBundle("org.eclipse.m2t.common.recipe.ui.tests").getEntry(
				"junit-workbench-workspace/test/src/org/openarchitectureware/recipe/eclipseChecks/test/impl/" + string);
		EclipseHelper.createFile(string, folder, url, new NullProgressMonitor());

	}

}
