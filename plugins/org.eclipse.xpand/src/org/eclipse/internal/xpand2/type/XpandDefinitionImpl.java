/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.internal.xpand2.type;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

public class XpandDefinitionImpl {

    private final XpandDefinition def;

    private final XpandExecutionContext ctx;

    public XpandDefinitionImpl(final XpandDefinition def, final XpandExecutionContext ctx) {
        this.def = def;
        this.ctx = ctx;
    }

    public String getName() {
        return def.getName();
    }

    public Type getTargetType() {
        return ctx.getTypeForName(def.getTargetType());
    }

    public List<Type> getParamTypes() {
        final DeclaredParameter[] p = def.getParams();
        final List<Type> result = new ArrayList<Type>();
        for (int i = 0; i < p.length; i++) {
            result.add(ctx.getTypeForName(p[i].getType().getValue()));
        }
        return result;
    }

    public List<String> getParamNames() {
        final DeclaredParameter[] p = def.getParams();
        final List<String> result = new ArrayList<String>();
        for (int i = 0; i < p.length; i++) {
            result.add(p[i].getName().getValue());
        }
        return result;
    }

    public void proceed() {
        def.evaluate(ctx);
    }

    public void proceed(final Object target, final List<?> list) {
        XpandExecutionContext context = ctx;
        if (target != null) {
            context = (XpandExecutionContext) context.cloneWithVariable(new Variable(
                    ExecutionContext.IMPLICIT_VARIABLE, target));
        }
        if (list != null) {
            final List<String> n = getParamNames();
            for (int i = 0, x = list.size(); i < x;) {
                final Object o = list.get(i);
                if (o != null && n.size() >= i) {
                    context = (XpandExecutionContext) context.cloneWithVariable(new Variable(n.get(i), o));
                }
            }
        }
        def.evaluate(context);
    }

    @Override
    public String toString() {
        return def.toString();
    }

}
