/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.ui.core.internal.builder;

import java.util.List;
import java.util.Set;

import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.xtend.ast.JavaExtensionStatement;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.ui.internal.XtendLog;

public class PluginJavaExtensionStatement extends JavaExtensionStatement {

    private IJavaProject jp;

    public PluginJavaExtensionStatement(final IJavaProject jp,
            final Identifier name, final List formalParameters, final Identifier returnType, final Identifier javaType, final Identifier javaMethod, final List javaParamTypes,
            final boolean cached, final boolean isPriv) {
        super(name, formalParameters, returnType,javaType, javaMethod, javaParamTypes,
                cached, isPriv);
        this.jp = jp;
    }

    @Override
    public void analyzeInternal(final ExecutionContext ctx, final Set issues) {
        boolean everythingFine = true;
        IType it = null;
        try {
            it = jp.findType(getJavaType().getValue());
        } catch (final JavaModelException e) {
            XtendLog.logError(e);
        }
        if (it == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, getJavaType().getValue() + " not found",
                    getJavaType()));
            everythingFine = false;
        }
        final List l = javaParamTypes;
        final IType[] pts = new IType[l.size()];
        final String[] signs = new String[l.size()];
        for (int i = 0; i < pts.length; i++) {
            final Identifier typeName = (Identifier) l.get(i);
            try {
                pts[i] = jp.findType(typeName.getValue());
            } catch (final JavaModelException e) {
                issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, typeName.getValue() + " not found",
                        typeName));
                everythingFine = false;
            }
            if (pts[i] == null) {
                issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, typeName.getValue() + " not found",
                        typeName));
                everythingFine = false;
            } else {
                signs[i] = Signature.createTypeSignature(pts[i].getFullyQualifiedName(), true);
            }
        }
        if (everythingFine) {
            final IMethod m = it.getMethod(javaMethod.getValue(), signs);
            final IMethod[] ms = it.findMethods(m);

            if (ms == null || ms.length == 0) {
                issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND, javaMethod.getValue()
                        + " not found", javaMethod));
                return;
            }
            int f = 0;
            try {
                f = ms[0].getFlags();
            } catch (final JavaModelException e) {
                XtendLog.logError(e);
                return;
            }
            if (!(Flags.isPublic(f) && Flags.isStatic(f))) {
                issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND, "The method "
                        + javaMethod.getValue() + " is not public static.", javaMethod));
            }
        }
    }

}
