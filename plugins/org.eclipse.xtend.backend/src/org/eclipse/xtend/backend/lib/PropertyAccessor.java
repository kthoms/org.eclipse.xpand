/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.lib;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.syslib.CollectionOperations;
import org.eclipse.xtend.backend.types.builtin.CollectionType;

/**
 * @author aarnold - Initial contribution and API
 */
public class PropertyAccessor {
	
	private static Log _log = LogFactory.getLog (PropertyAccessor.class);
	
	public static Object propertyOnObject (Object owner, final String propertyName, ExecutionContext ctx, SourcePos pos) {
        if (owner == null) {
            ctx.logNullDeRef (pos);
            return null;
        }
        
        return ctx.getTypesystem().findType (owner).getProperty (ctx, owner, propertyName);
	}
	
	public static Object propertyOnCollection (Collection<?> coll, final String propertyName, ExecutionContext ctx, SourcePos pos) {
        if (coll == null) {
            ctx.logNullDeRef (pos);
            return null;
        }

        final Collection<Object> result = CollectionOperations.createMatchingCollection (coll); 

        if (_log.isDebugEnabled())
            _log.debug ("evaluating property " + propertyName + " on collection " + coll);
        
        for (Object o: coll) 
            CollectionOperations.addFlattened (result, ctx.getTypesystem().findType(o).getProperty(ctx, o, propertyName));
        
        return result;
	}

	public static Object propertyOnWhatever (Object owner, final String propertyName, ExecutionContext ctx, SourcePos pos) {
        if (owner == null) {
            ctx.logNullDeRef (pos);
            return null;
        }

        final BackendType t = ctx.getTypesystem().findType (owner);
        
        if (CollectionType.INSTANCE.isAssignableFrom(t)) {
            if (isProperty (ctx, t, propertyName))
                return t.getProperty (ctx, owner, propertyName);
            
            final Collection<Object> result = CollectionOperations.createMatchingCollection ((Collection<?>) owner);

            for (Object obj: (Collection<?>) owner) 
                CollectionOperations.addFlattened (result, ctx.getTypesystem().findType(obj).getProperty(ctx, obj, propertyName));

            return result;
        }
        else
            return t.getProperty (ctx, owner, propertyName);
 	}

    private static boolean isProperty (ExecutionContext ctx, BackendType t, String propName) {
        return t.getProperties(ctx).containsKey (propName);
    }
}
