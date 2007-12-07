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
package org.eclipse.internal.xpand2.ast;

import java.util.Set;

import org.eclipse.internal.xpand2.pr.ProtectedRegion;
import org.eclipse.internal.xpand2.pr.ProtectedRegionSyntaxException;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.EvaluationException;

/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class ProtectStatement extends StatementWithBody {

    private Expression commentStart;

    private Expression commentEnd;

    private Expression id;

    private boolean disable;

    public ProtectStatement( final Expression commentStart,
            final Expression commentEnd, final Statement[] body, final Expression id, final boolean disable) {
        super(body);
        this.commentStart = commentStart;
        this.commentEnd = commentEnd;
        this.id = id;
        this.disable = disable;
    }

    public Expression getCommentEnd() {
        return commentEnd;
    }

    public Expression getCommentStart() {
        return commentStart;
    }

    public Expression getId() {
        return id;
    }
    
    public boolean getDisable () {
        return disable;
    }

    public void analyzeInternal(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        getCommentStart().analyze(ctx, issues);
        getCommentEnd().analyze(ctx, issues);
        getId().analyze(ctx, issues);

        for (int i = 0; i < body.length; i++) {
            body[i].analyze(ctx, issues);
        }
    }

    @Override
    public void evaluateInternal(final XpandExecutionContext ctx) {
        final String cStart = nullSafe(getCommentStart().evaluate(ctx));
        if (cStart == null)
            throw new EvaluationException("NullEvaluation!", getCommentStart(), ctx);
        final String cEnd = nullSafe(getCommentEnd().evaluate(ctx));
        if (cEnd == null)
            throw new EvaluationException("NullEvaluation!", getCommentEnd(), ctx);
        final String id = nullSafe(getId().evaluate(ctx));
        if (id == null)
            throw new EvaluationException("NullEvaluation!", getId(), ctx);

        ProtectedRegion region = null;
        if (ctx.getProtectedRegionResolver() != null) {
            region = ctx.getProtectedRegionResolver().getProtectedRegion(id.toString());
        } else
            throw new EvaluationException("No protected region resolver configured!",this,ctx);

        if (region == null) {
            region = ctx.getProtectedRegionResolver().createProtectedRegion(id, disable);
            ctx.getOutput().write(region.getStartString(cStart, cEnd));
            for (int i = 0; i < body.length; i++) {
                body[i].evaluate(ctx);
            }
            ctx.getOutput().write(region.getEndString(cStart, cEnd));
        } else {
            ctx.getOutput().write(region.getStartString(cStart, cEnd));
            try {
                ctx.getOutput().write(region.getBody(cStart, cEnd));
            } catch (final ProtectedRegionSyntaxException e) {
                throw new EvaluationException(e.getMessage(), getId(), ctx);
            }
            ctx.getOutput().write(region.getEndString(cStart, cEnd));
        }

    }

    private String nullSafe(final Object string) {
        return string != null ? string.toString() : "";
    }

}
