/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.common;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class ExpressionBase {
    private final SourcePos _sourcePos;
    private final List<ExecutionListener> _listeners = new ArrayList<ExecutionListener> ();

    protected final Log _log = LogFactory.getLog (getClass ());
    
    public ExpressionBase (SourcePos sourcePos) {
        _sourcePos = sourcePos;
    }

    public SourcePos getPos () {
        return _sourcePos;
    }
    
    public void registerExecutionListener (ExecutionListener l) {
        _listeners.add (l);
    }
    
    private void firePreEvent (ExecutionContext ctx) throws EvaluationVetoException {
        for (ExecutionListener l: ctx.getGlobalExecutionListeners())
            l.preExecute (ctx, this);
        
        for (ExecutionListener l: _listeners)
            l.preExecute (ctx, this);
    }

    private void firePostEvent (Object result, ExecutionContext ctx) {
        for (int i=_listeners.size()-1; i >= 0; i--)
            _listeners.get(i).postExecute (result, ctx, this);

        for (int i=ctx.getGlobalExecutionListeners().size()-1; i >= 0; i--)
            ctx.getGlobalExecutionListeners().get(i).postExecute (result, ctx, this);
    }
    
    public final Object evaluate (ExecutionContext ctx) {
        try {
            firePreEvent (ctx);
            final Object result = evaluateInternal (ctx);
            firePostEvent (result, ctx);
            return result;
        }
        catch (EvaluationVetoException exc) {
            return exc.getSubstitutedExpressionResult();
        }
        catch (ExecutionException exc) {
            exc.addStackTraceElement (new StacktraceEntry (_sourcePos, ctx)); 
            throw exc;
        }
        catch (Exception exc) {
            throw new ExecutionException (exc, new StacktraceEntry (_sourcePos, ctx));
        }
    }
    
    protected abstract Object evaluateInternal (ExecutionContext ctx);
}
