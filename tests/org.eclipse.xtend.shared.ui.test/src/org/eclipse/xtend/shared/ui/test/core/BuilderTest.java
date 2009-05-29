/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.test.core;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.eclipse.core.internal.utils.FileUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandMarkerManager;
import org.eclipse.xtend.shared.ui.test.xpand2.core.XpandCoreTestBase;

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 */
public class BuilderTest extends XpandCoreTestBase {

	public void testSimple() throws Exception {
		env.openEmptyWorkspace();
		// create a test project and add a Jar file to its classpath.
		final IProject proj = env.createProject("test-" + System.currentTimeMillis());
		IPath pPath = proj.getFullPath();
		// Clear classpath, we set it up on our own...
		env.setClasspath(pPath, new IClasspathEntry[0]);
		env.addExternalJars(pPath, env.getJavaClassLibs());
		final IPath src = env.addPackage(pPath, "src");
		env.addFolderToSourceFolders(pPath, src);
		for (int i = 0; i < 100; i++) {
			String content = "";
			if (i == 99) {
				content += "foo" + i + "(String x) : x.toFirstUpper();\n";
			} else {
				content += "extension Extensions" + (i + 1) + ";\n";
				content += "foo" + i + "(String x) : x+x.foo" + (i + 1) + "();\n";
			}
			env.addFile(src, "Extensions" + i + ".ext", content);
		}
		env.fullBuild();

		final IXtendXpandProject xp = Activator.getExtXptModelManager().findProject(pPath);
		IXtendXpandResource resource = xp.findExtXptResource("Extensions0", "ext");
		
		IJavaProject project = JavaCore.create(((IResource)resource.getUnderlyingStorage()).getProject());
		ExecutionContext ctx = Activator.getExecutionContext(project);
		resource.analyze(ctx );
		IFile file = (IFile) resource.getUnderlyingStorage();
		assertTrue(file.findMarkers(XtendXpandMarkerManager.getMARKER_TYPE(), true, -1).length == 0);
	}

	/**
	 * Test for Bug#155018: The bug concerns loading resources from Jar files.
	 */
	public final void testFindExtXptResourceInJar() throws JavaModelException {
		env.openEmptyWorkspace();
		// create a test project and add a Jar file to its classpath. The Jar
		// 'ExtensionInJar.jar' contains the
		// extension 'org::openarchitectureware::util::IO.ext'
		final IProject proj = env.createProject("test-" + System.currentTimeMillis());
		env.addExternalJars(proj.getFullPath(), env.getJavaClassLibs());

		env.addInternalJar(proj.getFullPath(), "ExtensionInJar.jar", readJar(), false);
		env.fullBuild();
		IXtendXpandProject project = Activator.getExtXptModelManager().findProject(proj.getFullPath());
		IJavaProject jproject = JavaCore.create(proj);
		IType type = jproject.findType("org.eclipse.xtend.util.stdlib.EmfUtils");
		assertNotNull(type);
		IXtendXpandResource res = project.findExtXptResource("org::eclipse::xtend::util::stdlib::io", "ext");
		assertNotNull(res);
		assertNotNull(res.getFullyQualifiedName());
		assertNotNull("AbstractExtension from Jar not found (Bug155018)", res);
	}

	/**
	 * Retrieve the example Jar as byte array
	 */
	@SuppressWarnings("restriction")
	private byte[] readJar() {
		String path = "org/eclipse/xtend/shared/ui/test/core/ExtensionInJar.jar";
		InputStream is = getClass().getClassLoader().getResourceAsStream(path);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			FileUtil.transferStreams(is, os, path, new NullProgressMonitor());
		} catch (CoreException e) {
			fail(e.getMessage());
		}
		assertNotNull(is);
		return os.toByteArray();
	}
}
