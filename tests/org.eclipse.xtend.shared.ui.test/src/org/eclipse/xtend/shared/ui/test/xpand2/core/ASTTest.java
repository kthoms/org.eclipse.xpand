/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.shared.ui.test.xpand2.core;

import org.eclipse.core.runtime.IPath;
import org.eclipse.xpand2.XpandUtil;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xpand.ui.core.IXpandResource;
import org.eclipse.xtend.shared.ui.Activator;

public class ASTTest extends XpandCoreTestBase {

    public final void testDependsOn() throws JavaModelException {
        env.openEmptyWorkspace();
        final IPath pPath = env.addProject("test");
        env.addExternalJars(pPath, env.getJavaClassLibs());
        env.removePackageFragmentRoot(pPath, "");
        final IPath root = env.addPackageFragmentRoot(pPath, "templates");
        final IPath pack = env.addPackage(root, "templates");
        final IPath pack2 = env.addPackage(pack, "test");
        final IPath tpl = env.addFile(pack, "Template." + XpandUtil.TEMPLATE_EXTENSION, tag("DEFINE test FOR String")
                + tag("EXPAND templates::test::Template::test") + tag("ENDDEFINE"));
        final IPath tpl2 = env.addFile(pack2, "Template." + XpandUtil.TEMPLATE_EXTENSION, tag("DEFINE test FOR String")
                + tag("ENDDEFINE"));
        env.fullBuild();
        dumpMarkers(tpl);
        dumpMarkers(tpl2);
        final IXpandResource xptpl = (IXpandResource) Activator.getExtXptModelManager().findExtXptResource(storage(tpl));
        assertNotNull("XtendXpandModelManager could not find Xpand Resource '"+tpl+"' in the workspace", xptpl);

        final IXpandResource xptpl2 = (IXpandResource) Activator.getExtXptModelManager().findExtXptResource(storage(tpl2));
        assertNotNull("XtendXpandModelManager could not find Xpand Resource '"+tpl2+"' in the workspace", xptpl2);

        env.removeFile(tpl);
        env.incrementalBuild();

    }
}
