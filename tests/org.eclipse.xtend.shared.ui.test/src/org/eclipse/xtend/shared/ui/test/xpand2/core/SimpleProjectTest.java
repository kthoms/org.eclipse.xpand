/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.shared.ui.test.xpand2.core;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IPath;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.xpand.ui.core.IXpandResource;
import org.eclipse.xpand2.XpandUtil;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.metamodel.Contributor;
import org.eclipse.xtend.shared.ui.core.metamodel.MetamodelContributorRegistry;
import org.eclipse.xtend.shared.ui.core.preferences.PreferenceConstants;
import org.eclipse.xtend.ui.core.IXtendResource;

public class SimpleProjectTest extends XpandCoreTestBase {

    public final void testSimpleProject() throws JavaModelException {
        env.openEmptyWorkspace();
        final IPath pPath = env.addProject("test");
        env.addExternalJars(pPath, env.getJavaClassLibs());
        env.removePackageFragmentRoot(pPath, "");
        final IPath root = env.addPackageFragmentRoot(pPath, "templates");
        final IPath pack = env.addPackage(root, "templates");
        final IPath tpl = env.addFile(pack, "Template." + XpandUtil.TEMPLATE_EXTENSION, tag("DEFINE test FOR String")
                + tag("ENDDEFINE"));
        env.fullBuild();
        dumpMarkers(tpl);
        assertNoErrorMarkers(tpl);
        final IXpandResource xptpl = (IXpandResource) Activator.getExtXptModelManager().findExtXptResource(storage(tpl));
        assertNotNull("Xpand resource '"+tpl.toString()+"' not found in workspace.",xptpl);
        assertFalse(xptpl.getDefinitionsByName("test").length == 0);

        // add extension with different name and build
        final IPath ext = env.addFile(pack, "TestExtension." + XtendFile.FILE_EXTENSION, "String _toString (Object o) : o.toString();");
        env.fullBuild();
        dumpMarkers(ext);
        assertNoErrorMarkers(ext);
        final IXtendResource extres = (IXtendResource) Activator.getExtXptModelManager().findExtXptResource(storage(ext));
        assertNotNull(extres);
        
        // add extension with same name as the Xpand template and build
        final IPath ext2 = env.addFile(pack, "Template." + XtendFile.FILE_EXTENSION, "String _toString2 (Object o) : o.toString();");
        env.fullBuild();
        dumpMarkers(ext2);
        assertNoErrorMarkers(ext2);
        final IXtendResource extres2 = (IXtendResource) Activator.getExtXptModelManager().findExtXptResource(storage(ext2));
        assertNotNull(extres2);

        // add dummy file with same name, but other extension 
        final IPath dummy = env.addFile(pack, "Template." + "bak", "Hello World!");
        env.fullBuild();
        dumpMarkers(dummy);
        assertNoErrorMarkers(dummy);
       
        env.removeFile(tpl);
        env.incrementalBuild(pPath);
        assertNull(Activator.getExtXptModelManager().findExtXptResource(storage(tpl)));
    }

    public final void testChangedTemplate() throws JavaModelException {
        env.openEmptyWorkspace();
        final IPath pPath = env.addProject("test");
        env.addExternalJars(pPath, env.getJavaClassLibs());
        env.removePackageFragmentRoot(pPath, "");
        final IPath root = env.addPackageFragmentRoot(pPath, "templates");
        final IPath pack = env.addPackage(root, "templates");
        IPath tpl = env.addFile(pack, "Template." + XpandUtil.TEMPLATE_EXTENSION, tag("DEFINE test FOR String")
                + tag("ENDDEFINE"));
        env.fullBuild();
        dumpMarkers(tpl);
        final IXpandResource xptpl = (IXpandResource) Activator.getExtXptModelManager().findExtXptResource(storage(tpl));
        assertNotNull("Xpand resource '"+tpl.toString()+"' not found in workspace.",xptpl);
        assertFalse(xptpl.getDefinitionsByName("test").length == 0);

        env.removeFile(tpl);
        tpl = env.addFile(pack, "Template." + XpandUtil.TEMPLATE_EXTENSION, tag("DEFINE test2 FOR String")
                + tag("ENDDEFINE"));

        env.incrementalBuild(pPath);
        final IXpandResource xptpl2 = (IXpandResource) Activator.getExtXptModelManager().findExtXptResource(storage(tpl));
        assertTrue(xptpl == xptpl2);
        assertTrue(xptpl2.getDefinitionsByName("test").length == 0);
        assertFalse(xptpl2.getDefinitionsByName("test2").length == 0);
    }
    
    public final void testBug134646() throws Exception {
        env.openEmptyWorkspace();
        final IPath pPath = env.addProject("test");
        env.addExternalJars(pPath, env.getJavaClassLibs());
        env.removePackageFragmentRoot(pPath, "");
        final IPath root = env.addPackageFragmentRoot(pPath, "templates");
        final IPath pack = env.addPackage(root, "templates");
        IPath tpl = env.addFile(pack, "Template.ext", "String someExt(String s) : JAVA java.text.MessageFormat (java.lang.String) ; \n");
        env.fullBuild();
        assertEquals ("one error marker expected", 1, env.getMarkersFor(tpl).length);
        IMarker marker = env.getMarkersFor(tpl)[0];
        String errMsg = (String) marker.getAttribute("message");
        assertEquals("Error message 'java.text not found' indicates Bug#134626!", "Type not found: java.text",errMsg);
        dumpMarkers(tpl);
    }
    
    public void testMetaModelRegistry() throws IOException {
		env.openEmptyWorkspace();
		IProject testProject = env.createProject("test");
		IJavaProject javaTestProject = JavaCore.create(testProject);
		ScopedPreferenceStore store = new ScopedPreferenceStore(
				new ProjectScope(testProject), Activator.getId());

		// Test idea: Iterate over all Metamodel-Contributers, add each of
		// them to the project and test of it is set
		Collection<Contributor> contributors = MetamodelContributorRegistry
				.getRegisteredMetamodelContributors().values();
		String allContributors = "";
		for (Contributor contributor : contributors) {
			store.setValue(PreferenceConstants.METAMODELCONTRIBUTORS,
					contributor.getClassName());
			store.save();
			allContributors += contributor.getClassName() + ",";

			List<?> activeContributors = MetamodelContributorRegistry
					.getActiveMetamodelContributors(javaTestProject);
			assertTrue("Added metamodel project contributor is not retrieved",
					contributor.getClassName().equals(
							activeContributors.get(0).getClass().getName()));
		}
		if (contributors.size() > 0)
			allContributors = allContributors.substring(0, allContributors
					.length() - 1); // cut of last ","
		store.setValue(PreferenceConstants.METAMODELCONTRIBUTORS,
				allContributors);
		store.save();

		List<?> activeContributors = MetamodelContributorRegistry
				.getActiveMetamodelContributors(javaTestProject);
		assertTrue(
				"Added metamodel contributor's size != available contributor's size",
				activeContributors.size() == contributors.size());
	}
    
    
}
