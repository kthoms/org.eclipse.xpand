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
package org.eclipse.xtend.backend.functions.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.functions.DuplicateAwareFunctionCollection;
import org.eclipse.xtend.backend.functions.DuplicateAwareNamedFunctionCollection;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.util.Cache;
import org.eclipse.xtend.backend.util.DoubleKeyCache;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.backend.util.StringHelper;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class FunctionDefContextImpl implements FunctionDefContextInternal {
	
	private final Cache<BackendType, Collection<NamedFunction>> _byFirstParameterType = new Cache<BackendType, Collection<NamedFunction>>() {
        @Override
        protected Collection<NamedFunction> create (BackendType key) {
            return new ArrayList<NamedFunction>();
        }
	};
	
    private final DoubleKeyCache<QualifiedName, Integer, DuplicateAwareNamedFunctionCollection> _functions = new DoubleKeyCache<QualifiedName, Integer, DuplicateAwareNamedFunctionCollection>() {
        @Override
        protected DuplicateAwareNamedFunctionCollection create(QualifiedName key1, Integer key2) {
            return new DuplicateAwareNamedFunctionCollection ();
        }
    };
	
    // TODO verify fix: André
    private final DoubleKeyCache<QualifiedName, Integer, DuplicateAwareNamedFunctionCollection> _bySimpleName = new DoubleKeyCache<QualifiedName, Integer, DuplicateAwareNamedFunctionCollection>() {
        @Override
        protected DuplicateAwareNamedFunctionCollection create(QualifiedName key1, Integer key2) {
            return new DuplicateAwareNamedFunctionCollection ();
        }
    };
    
    private final DoubleKeyCache<QualifiedName, List<BackendType>, Collection<Function>> _byParamTypes = new DoubleKeyCache<QualifiedName, List<BackendType>, Collection<Function>>() {
    	
        @Override
        protected Collection<Function> create (QualifiedName functionName, List<BackendType> paramTypes) {
            return new PolymorphicResolver(functionName).getBestFitCandidates (findCandidates (functionName, paramTypes)); // TODO go around this cache if there is a dynamically provided function 
        }
        
        private Collection<Function> findCandidates (QualifiedName functionName, List<BackendType> paramTypes) {
            final int paramCount = paramTypes.size();
            final BackendType firstParamType = paramTypes.isEmpty() ? null : paramTypes.get(0);
            
            final DuplicateAwareFunctionCollection result = new DuplicateAwareFunctionCollection ();
            
            // get built-in operations of the typesystem
            if (firstParamType != null) {
                for (NamedFunction f: firstParamType.getBuiltinOperations())
                    if (functionName.equals (f.getName()) && matchesParamTypes(f.getFunction(), paramTypes))
                        result.register (f.getFunction());
            }
            
            // merge with registered functions
            if (functionName.getNameSpace() == null) {
                for (NamedFunction f: _bySimpleName.get (functionName, paramCount).getFunctions()) {
                    if (matchesParamTypes (f.getFunction(), paramTypes)) {
                        result.register (f.getFunction());
                    }
                }
            } else {
	            // TODO check for overriding
	            for (NamedFunction f: _functions.get (functionName, paramCount).getFunctions()) {
	                if (matchesParamTypes (f.getFunction(), paramTypes)) {
	                    result.register (f.getFunction());
	                }
	            }
            }
            return result.getFunctions();
        }
        
        private boolean matchesParamTypes (Function f, List<BackendType> paramTypes) {
            if (f.getParameterTypes().size() != paramTypes.size())
                return false;
            
            for (int i=0; i<f.getParameterTypes().size(); i++) {
                if (! f.getParameterTypes().get(i).isAssignableFrom(paramTypes.get(i)))
                    return false;
            }
            
            return true;
        }
    };

    private final DuplicateAwareNamedFunctionCollection _publicFunctions = new DuplicateAwareNamedFunctionCollection ();
    
    public void register (NamedFunction f, boolean isPublic) {
        if (isPublic)
            _publicFunctions.register (f);
        
        // TODO verify fix for simple names: André
        final QualifiedName simpleName = new QualifiedName (f.getName().getSimpleName());
        final NamedFunction old = _functions.get (f.getName(), f.getFunction().getParameterTypes().size()).register (f);
        final NamedFunction simpleOld = _bySimpleName.get (simpleName, f.getFunction().getParameterTypes().size()).register (f);
        
        if (old != null && old.getFunction().getParameterTypes().size() > 0)
            _byFirstParameterType.get (old.getFunction().getParameterTypes().get (0)).remove (old);
        
        if (simpleOld != null && simpleOld.getFunction().getParameterTypes().size() > 0)
            _byFirstParameterType.get (simpleOld.getFunction().getParameterTypes().get (0)).remove (simpleOld);

        if (f.getFunction().getParameterTypes().size() > 0) 
            _byFirstParameterType.get (f.getFunction().getParameterTypes().get(0)).add (f);
    }
    
    public Object invoke (ExecutionContext ctx, QualifiedName functionName, List<? extends Object> params) {
    	final Collection<Function> candidates = findFunctionCandidates (functionName, typesForParameters (ctx.getTypesystem(), params));
    	
    	Function f = null;
    	try {
    	    f = new PolymorphicResolver (functionName).evaluateGuards (ctx, candidates);
    	}
    	catch (Exception exc) {
    	    ErrorHandler.handle ("could not resolve function '" + functionName + "' for parameter types " + StringHelper.getTypesAsString (params) + " - candidates were " + candidates, exc);
    	}
    	QualifiedName name = null;
    	if (f instanceof NamedFunction) {
    		name = ((NamedFunction) f).getName();
    	} else if (f instanceof SourceDefinedFunction) {
    		name = ((SourceDefinedFunction) f).getName();
    	} else {
    		name = functionName;
    	}
			
    	return ctx.getAdviceContext().getAdvice (name, f).evaluate(ctx, params);
    }

    /**
     * is public only for testing purposes
     */
    public List<BackendType> typesForParameters (BackendTypesystem ts, List<?> params) {
        final List<BackendType> paramTypes = new ArrayList<BackendType>();
        for (Object o: params)
            paramTypes.add (ts.findType(o));
        
        return paramTypes;
    }
    
    /**
     * is public only for testing purposes
     */
    public Collection<Function> findFunctionCandidates (QualifiedName functionName, List<BackendType> paramTypes) {
        try {
            return _byParamTypes.get (functionName, paramTypes);
        } catch (RuntimeException e) {
            ErrorHandler.handle ("Failed to resolve function '" + functionName + "' for parameter types " + paramTypes + ".", e);
            return null; // to make the compiler happy - this is never executed
        }
    }
    
    public Collection<NamedFunction> getByFirstParameterType (BackendType firstParameterType) {
        if (firstParameterType.getBuiltinOperations().isEmpty())
            return _byFirstParameterType.get (firstParameterType);
        
        final List<NamedFunction> result = new ArrayList<NamedFunction> (firstParameterType.getBuiltinOperations());
        result.addAll (_byFirstParameterType.get (firstParameterType));
        return result;
    }

    public Function getMatch (ExecutionContext ctx, QualifiedName name, List<BackendType> params) {
        final Collection<Function> candidates = findFunctionCandidates (name, params);
        if (candidates.isEmpty())
            return null;
        if (candidates.size() > 1)
            throw new IllegalArgumentException ("several matches for function '" + name + "' and parameter types " + params + ".");
        
        return candidates.iterator().next();
    }
    
    public boolean hasMatch (ExecutionContext ctx, QualifiedName functionName, List<? extends Object> params) {
        return findFunctionCandidates (functionName, typesForParameters (ctx.getTypesystem(), params)).size() > 0;
    }
    
    @Override
    public String toString () {
        return "FunctionDefContextImpl [" + _functions.getMap().values() + "]";
    }

    public Collection<NamedFunction> getPublicFunctions () {
        return _publicFunctions.getFunctions();
    }
}





