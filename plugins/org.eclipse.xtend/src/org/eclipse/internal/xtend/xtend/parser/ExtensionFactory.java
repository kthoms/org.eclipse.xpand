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

package org.eclipse.internal.xtend.xtend.parser;

import java.util.List;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.parser.ExpressionFactory;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Check;
import org.eclipse.internal.xtend.xtend.ast.CreateExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.ExpressionExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ImportStatement;
import org.eclipse.internal.xtend.xtend.ast.JavaExtensionStatement;

public class ExtensionFactory extends ExpressionFactory {

    public ExtensionFactory() {
        super("nofile");
    }

    public ExtensionFactory(final String string) {
        super(string);
    }

    public ExtensionFile createExtensionFile(final List<ImportStatement> nsimports, final List<ImportStatement> extimports, final List<Extension> extensions, final List<Around> arounds, List<Check> checks) {
        return (ExtensionFile) handle(new ExtensionFile(nonNull(nsimports), nonNull(extimports), nonNull(extensions), nonNull(arounds),nonNull(checks)));
    }

	public ImportStatement createNsImport(final Identifier t) {
        return (ImportStatement) handle(new ImportStatement(t, false));
    }

    public ImportStatement createExtensionFileImport(final Identifier t,  final Identifier exported) {
        return (ImportStatement) handle(new ImportStatement( t, exported != null));
    }

    public JavaExtensionStatement createJavaExtension(final Identifier name, final Identifier type,
            final List<DeclaredParameter> params, final Identifier typeName, final Identifier methodName, final List<Identifier> javaParamTypes, final Identifier cached, final Identifier priv) {
        return (JavaExtensionStatement) handle(new JavaExtensionStatement(name,
        		nonNull(params), type, typeName, methodName, nonNull(javaParamTypes), cached != null, priv != null));
    }

    public ExpressionExtensionStatement createExpressionExtension(final Identifier name, 
            final Identifier returnType, final List<DeclaredParameter> params, final Expression expr, final Identifier cached, final Identifier priv) {
        return (ExpressionExtensionStatement) handle(new ExpressionExtensionStatement(
                name, returnType, nonNull(params), expr, cached != null, priv != null));
    }

    public Extension createCreateExtension(final Identifier create, final Identifier returnType,
            final Identifier rtn, final Identifier name, final List<DeclaredParameter> params, final Expression expr, final Identifier priv) {
        return (CreateExtensionStatement) handle(new CreateExtensionStatement(
                name, returnType, rtn!=null ? rtn : null, nonNull(params), expr, priv != null));
    }

	public Around createAround( Identifier pointcut, List<DeclaredParameter> p, boolean wildparams, Expression expr) {
        return (Around) handle(new Around(pointcut, nonNull(p),wildparams,expr));
	}

	public Check createCheck(Identifier t, Expression guard, boolean errorSev, Expression msg, Expression expr) {
		return (Check) handle(new Check(t,guard,errorSev,msg,expr));
	}

}
