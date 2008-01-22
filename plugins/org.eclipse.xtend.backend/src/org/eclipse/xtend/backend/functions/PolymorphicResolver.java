/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class PolymorphicResolver {
    private final String _name; // for error messages
    
    /**
     * @param functionName the name of the functions to be resolved - used for error messages
     */
    public PolymorphicResolver (String functionName) {
        _name = functionName;
    }
    
	/** 
	 * returns the list of all best-fitting candidates by parameter types. This list can be statically
	 *  cached, but it must be checked dynamically for guard matching. 
	 */
	public Collection<Function> getBestFitCandidates (Collection<Function> functions) {
		// shortcut for a common case
		if (functions.size() == 1)
			return functions;
		if (functions.isEmpty())
		    throw new IllegalArgumentException ("no matches found");
		
		Iterator<Function> iter = functions.iterator();
		
		Function firstBestMatch = iter.next();
		List<Function> bestMatches2 = new ArrayList<Function> ();
		bestMatches2.add (firstBestMatch);
		
		while (iter.hasNext()) {
		    final Function candidate = iter.next();
		    final int compResult = _paramTypeComparator.compare (candidate, firstBestMatch);
		    
		    if (compResult < 0) {
		        firstBestMatch = candidate;
		        bestMatches2 = new ArrayList<Function>();
		        bestMatches2.add (candidate);
		    }
		    else if (compResult == 0) {
		        bestMatches2.add (candidate);
		    }
		}
		
		return bestMatches2;
	}
	
	private Function evaluateGuards (ExecutionContext ctx, Function function) {
		if (function.getGuard() == null)
			return function;
		
		if (Boolean.TRUE.equals (function.getGuard().evaluate(ctx)))
			return function;
		
		throw new IllegalArgumentException ("guard of the only implementation of " + _name + " evaluated to false");
	}
	
	/**
	 * chooses a function based on the evaluation of the functions' guards
	 */
	public Function evaluateGuards (ExecutionContext ctx, Collection<Function> functions) {
		if (functions.size() == 1)
			return evaluateGuards (ctx, functions.iterator().next());
		
		final List<Function> unguarded = new ArrayList<Function>();
		Function passedInspection = null;
		
		for (Function f: functions) {
			if (f.getGuard() == null)
				unguarded.add (f);
			else {
				if (Boolean.TRUE.equals (f.getGuard().evaluate(ctx))) {
					if (passedInspection != null)
						throw new IllegalArgumentException ("ambiguous call to " + _name + " - both " + passedInspection + " and " + f + " had guard expressions that evaluated to true");
					passedInspection = f;
				}
			}
		}
		
		if (passedInspection != null)
			return passedInspection;
		
		if (unguarded.size() > 0)
			return unguarded.get (unguarded.size() - 1); // this is where the overwriting of extensions is implemented
		
		throw new IllegalArgumentException ("call to " + _name + " could not be resolved - no guard allowed passage, and there are no unguarded implementations.");
	}
	

    private static final Comparator<Function> _paramTypeComparator = new Comparator<Function>() {
    	private final TypesComparator _typesComparator = new TypesComparator ();
    	
        public int compare(Function o1, Function o2) {
            return _typesComparator.compare (o1.getParameterTypes(), o2.getParameterTypes());
        }
    };
}

