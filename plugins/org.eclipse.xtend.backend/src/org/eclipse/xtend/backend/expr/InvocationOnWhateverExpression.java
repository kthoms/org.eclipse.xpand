/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.backend.expr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.syslib.CollectionOperations;


//TODO refactor: middle ends only use this, and a subsequent step differentiates / optimizes to the other two


/**
 * This expression invokes a function on the first argument, deciding at runtime whether to do the "collection magic" of
 *  invoking the function on every member of the collection that is the first argument and returning the collection of
 *  all the arguments.<br>
 *  
 * This expression does *not* do implicit "this" resolution - it is the responsibility of the initializing code, e.g. in the
 *  middle end, to statically resolve that.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class InvocationOnWhateverExpression extends ExpressionBase {
    private final QualifiedName _functionName;
    private final List<? extends ExpressionBase> _params;
    private final boolean _nullIfFirstParamIsNull;
    
    public InvocationOnWhateverExpression (QualifiedName functionName, List<? extends ExpressionBase> params, boolean nullIfFirstParamIsNull, SourcePos sourcePos) {
        super (sourcePos);
        
        _functionName = functionName;
        _params = params;
        _nullIfFirstParamIsNull = nullIfFirstParamIsNull;
    }
    
    public QualifiedName getFunctionName() {
		return _functionName;
	}

	public List<? extends ExpressionBase> getParams() {
		return _params;
	}

	public boolean isNullIfFirstParamIsNull() {
		return _nullIfFirstParamIsNull;
	}

	@Override
    protected Object evaluateInternal(ExecutionContext ctx) {
        final List<Object> params = new ArrayList<Object> ();
        boolean firstParamIsThis = false;
        if (_params.size() > 0 && _params.get(0) instanceof LocalVarEvalExpression)
        	if (((LocalVarEvalExpression)_params.get(0)).getLocalVarName().equals(SyntaxConstants.THIS))
        		firstParamIsThis = true;
        for (ExpressionBase expr: _params)
        	params.add (expr.evaluate(ctx));

        if (_nullIfFirstParamIsNull && params.get(0) == null) {
            ctx.logNullDeRef (getPos());
            return null;
        }
        
        if (params.get (0) instanceof Collection<?>) {
            // check if this is a function on Collection itself
            if (ctx.getFunctionDefContext().hasMatch (ctx, _functionName, params))
                return ctx.getFunctionDefContext().invoke (ctx, _functionName, params, firstParamIsThis);

            final Collection<?> coll = (Collection<?>) params.get (0);
            
            final Collection<Object> result = CollectionOperations.createMatchingCollection (coll);
            
            for (Object o: coll) {
                params.set (0, o);
                
                CollectionOperations.addFlattened (result, ctx.getFunctionDefContext().invoke (ctx, _functionName, params, firstParamIsThis));
            }
            
            return result;

        }
        else 
            return ctx.getFunctionDefContext().invoke (ctx, _functionName, params, firstParamIsThis);
    }
}
