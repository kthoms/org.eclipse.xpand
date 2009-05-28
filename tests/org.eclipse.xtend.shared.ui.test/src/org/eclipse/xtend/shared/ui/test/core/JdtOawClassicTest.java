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

package org.eclipse.xtend.shared.ui.test.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend.expression.TypeSystemImpl;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.JdtMetaModel;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.oaw.JdtOawClassicTypeStrategy;
import org.eclipse.xtend.shared.ui.expression.PluginExecutionContextImpl;
import org.eclipse.xtend.shared.ui.test.PluginTestBase;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.ParameterizedType;
import org.eclipse.xtend.typesystem.Type;

public class JdtOawClassicTest extends PluginTestBase {

    private PluginExecutionContextImpl ctx;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        env.openEmptyWorkspace();
        final IPath pPath = env.addProject("testProject");
        env.addExternalJars(pPath, env.getJavaClassLibs());
        env.removePackageFragmentRoot(pPath, "");
        final IPath root = env.addPackageFragmentRoot(pPath, "test");
        final IPath pack = env.addPackage(root, "test");
        final IPath javaClass = env.addFile(pack, "Type.java", "package test;" + "" + "public class Type {"
                + "public java.util.Set Property() {return null;}" + "public void addProperty(java.lang.String txt) {}"
                + "public String doStuff(String txt) {return txt;}" + "}");
        final IJavaProject project = env.getJavaProject(pPath);
        final IXtendXpandProject xp = Activator.getExtXptModelManager().findProject(pPath);
        ctx = new PluginExecutionContextImpl(xp, new TypeSystemImpl());
        final JdtMetaModel mm = new JdtMetaModel("DEFAULT", project, new JdtOawClassicTypeStrategy());
        ctx.registerMetaModel(mm);
        env.fullBuild();
        final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(javaClass);
        final IJavaElement ele = JavaCore.create(file);
        System.out.println(ele);
    }

    public final void testProperties() {

        final Type type = ctx.getTypeForName("test::Type");
        assertNotNull(type);
        final ParameterizedType pt = (ParameterizedType) type.getProperty("Property").getReturnType();
        assertEquals(ctx.getStringType(), pt.getInnerType());
    }

    public final void testOperations() {

        final Type type = ctx.getTypeForName("test::Type");
        assertNotNull(type);
        final Operation op = type.getOperation("doStuff", new Type[] { ctx.getStringType() });
        assertNotNull(op);
        assertEquals(ctx.getStringType(), op.getReturnType());
    }
}
