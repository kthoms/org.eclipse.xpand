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
package org.eclipse.xpand.internal.tests.evaluate;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.pr.ProtectedRegion;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolver;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;

public class ProtectedRegionsTest extends TestCase {

    public final void testProtect() throws Exception {
        final ProtectedRegionResolver prs = new ProtectedRegionResolverImpl() {
            @Override
            public ProtectedRegion getProtectedRegion(final String id) {
                if (id.equals("aloa")) {
                    final ProtectedRegionImpl pr = (ProtectedRegionImpl) createProtectedRegion(id, false);
                    pr.setBody("*/ECHT/*");
                    return pr;
                }
                return null;
            }
        };

        final String id = getClass().getPackage().getName().replaceAll("\\.", SyntaxConstants.NS_DELIM)
                + SyntaxConstants.NS_DELIM + "Protect::test";

        OutputStringImpl out = new OutputStringImpl();
        XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(out, prs);
        execCtx.setFileEncoding("iso-8859-1");

        XpandFacade.create(execCtx).evaluate(id, "nixAloa", new Object[0]);
        String[] result = out.buff.toString().trim().split(",");
        assertEquals("/*PROTECTED REGION ID(nixAloa) START*/nixAloa/*PROTECTED REGION END*/", result[0].trim());
        assertEquals("/*PROTECTED REGION ID(nixAloa) ENABLED START*/nixAloa/*PROTECTED REGION END*/", result[1].trim());

        out = new OutputStringImpl();
        execCtx = new XpandExecutionContextImpl (out, prs);
        execCtx.setFileEncoding("iso-8859-1");
        XpandFacade.create(execCtx).evaluate(id, "aloa", new Object[0]);
        result = out.buff.toString().trim().split(",");
        assertEquals("/*PROTECTED REGION ID(aloa) ENABLED START*/ECHT/*PROTECTED REGION END*/", result[0].trim());
        assertEquals("/*PROTECTED REGION ID(aloa) ENABLED START*/ECHT/*PROTECTED REGION END*/", result[1].trim());

    }
}
