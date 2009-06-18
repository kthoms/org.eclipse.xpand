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

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.JdtMetaModel;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.javabean.JdtJavaBeanTypeStrategy;
import org.eclipse.xtend.shared.ui.expression.XpandPluginExecutionContext;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.Type;

public class JdtJavaBeanTest extends XpandCoreTestBase {

    private XpandPluginExecutionContext ctx;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        env.openEmptyWorkspace();
        final IPath pPath = env.addProject("test");
        env.addExternalJars(pPath, env.getJavaClassLibs());
        final IJavaProject project = env.getJavaProject(pPath);
        final IXtendXpandProject xp = Activator.getExtXptModelManager().findProject(pPath);
        ctx = new XpandPluginExecutionContext(xp);
        final JdtMetaModel mm = new JdtMetaModel("DEFAULT", project, new JdtJavaBeanTypeStrategy(project));
        ctx.registerMetaModel(mm);

    }

    public final void testProperties() throws JavaModelException {

        final Type type = ctx.getTypeForName("javax::swing::JTextField");
        assertNotNull(type);
        assertEquals(ctx.getBooleanType(), type.getProperty("valid").getReturnType());

        Property prop = type.getProperty("UIClassID");
        assertNotNull(prop);
        assertEquals(ctx.getStringType(), prop.getReturnType());

        prop = type.getProperty("graphics");
        assertNotNull(prop);
        assertEquals(ctx.getTypeForName("java::awt::Graphics"), prop.getReturnType());
    }

    public final void testOperations() throws JavaModelException {

        final Type type = ctx.getTypeForName("javax::swing::JTextField");
        final Type param = ctx.getTypeForName("java::awt::Rectangle");
        Operation op = type.getOperation("scrollRectToVisible", new Type[] { param });
        assertNotNull(op);
        assertEquals(ctx.getVoidType(), op.getReturnType());

        final Type param1 = ctx.getTypeForName("java::awt::Image");
        final Type param2 = ctx.getTypeForName("java::awt::image::ImageObserver");
        op = type.getOperation("prepareImage", new Type[] { param1, param2 });
        assertNotNull(op);
        assertEquals(ctx.getBooleanType(), op.getReturnType());

        assertEquals(op, type.getOperation("prepareImage", new Type[] {
                ctx.getTypeForName("java::awt::image::BufferedImage"), param2 }));
    }
}
