/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.test.xpand2.core;


import java.io.InputStream;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.xpand.ui.core.IXpandResource;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.ui.core.IXtendResource;
import org.junit.Test;

/**
 * @author niehues - Initial contribution and API
 */
public class ReferencedProjectTest extends XpandCoreTestBase {

	@Override
	public void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	@Test
	public void testReferencedProjectWorkspace() throws InterruptedException, CoreException {
		env.openEmptyWorkspace();
		InputStream stream = getClass().getClassLoader().getResourceAsStream("/resources/testProjects.zip");
		List<IProject> projects = env.importZippedProject(stream);
		IPath templateP1 = new Path("/my.generator.project/src/template/Template.xpt");
        env.fullBuild();
        //Checking Errors of templateP1_1
        dumpMarkers(templateP1);
        assertNoErrorMarkers(templateP1);
        final IXpandResource xptpl = (IXpandResource) Activator.getExtXptModelManager().findExtXptResource(storage(templateP1));
        assertNotNull("Xpand resource '"+templateP1.toString()+"' not found in workspace.",xptpl);
        assertFalse(xptpl.getDefinitionsByName("javaClass").length == 0);
        
        IPath templateP2 = new Path("/my.generator.project2/src/template2/Template2.xpt");
        assertNoErrorMarkers(templateP2);
        final IXpandResource xptpl2 = (IXpandResource) Activator.getExtXptModelManager().findExtXptResource(storage(templateP2));
        assertNotNull("Xpand resource '"+templateP2.toString()+"' not found in workspace.",xptpl2);
        assertFalse(xptpl2.getDefinitionsByName("test").length == 0);
        
        IPath extension2 = new Path("/my.generator.project2/src/my/generator/project2/NewXtendFile.ext");
        assertNoErrorMarkers(extension2);
        final IXtendResource extRes = (IXtendResource)Activator.getExtXptModelManager().findExtXptResource(storage(extension2));
        assertNotNull("Xtend resource '"+extension2.toString()+"' not found in workspace.",extRes);
        assertFalse(extRes.getExtensions().isEmpty());
	}

}
