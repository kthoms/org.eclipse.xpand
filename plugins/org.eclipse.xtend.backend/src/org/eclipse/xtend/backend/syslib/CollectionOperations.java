/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.functions.java.AbstractExecutionContextAware;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class CollectionOperations extends AbstractExecutionContextAware {
    
    /////////////////////////////////////////////
    // "simple" operations on the collections
    /////////////////////////////////////////////
    
    public boolean add (Collection<Object> c, Object o) {
        return c.add (o);
    }
    
    public boolean addAll (Collection<Object> c, Collection<Object> o) {
        return c.addAll (o);
    }
    
    public boolean remove (Collection<Object> c, Object o) {
        return c.remove (o);
    }

    public boolean removeAll (Collection<Object> c, Collection<Object> o) {
        return c.removeAll (o);
    }
    
    public boolean retainAll (Collection<Object> c, Collection<Object> o) {
        return c.retainAll (o);
    }
    
    public boolean contains (Collection<Object> c, Object o) {
        return c.contains (o);
    }
    
    public void clear (Collection<Object> c) {
        c.clear();
    }

    
    public Object get (List<Object> c, int ind) {
        return c.get (ind);
    }
    
    public Object remove (List<Object> c, int ind) {
        return c.remove (ind);
    }
    
    public Object set (List<Object> c, int ind, Object o) {
        return c.set (ind, o);
    }
    
    public void add (List<Object> c, int ind, Object o) {
        c.add (ind, o);
    }
    
    public int indexOf (List<Object> c, Object o) {
        return c.indexOf (o);
    }
    
    public int lastIndexOf (List<Object> c, Object o) {
        return c.lastIndexOf (o);
    }
    
    /////////////////////////////////////////////
    // "functional" operations on collections
    /////////////////////////////////////////////
    
    public List<?> select (Collection<?> c, Function f) {
        final List<Object> result = new ArrayList<Object>();
        
        for (Object o: c)
            if (Boolean.TRUE.equals (f.invoke(_ctx, new Object[] {o})))
                result.add (o);
        
        return result;
    }

    public Object selectFirst (Collection<?> c, Function f) {
        for (Object o: c)
            if (Boolean.TRUE.equals (f.invoke (_ctx, new Object[] {o})))
                return o;
        
        return null;
    }
    
    public List<?> typeSelect (Collection<?> c, BackendType t) {
        final List<Object> result = new ArrayList<Object>();

        for (Object candidate: c)
            if (t.isAssignableFrom (_ctx.getTypesystem().findType (candidate)))
                result.add (candidate);
        
        return result;
    }
    
    public List<?> collect (Collection<?> c, Function f) {
        final List<Object> result = new ArrayList<Object> ();
        
        for (Object o: c)
            result.add (f.invoke(_ctx, new Object[] {o}));
        
        return result;
    }
    
    
    ///////////////////////////////////
    // operations on maps
    ///////////////////////////////////
    
    public boolean containsKey (Map<Object,Object> m, Object key) {
        return m.containsKey (key);
    }

    public boolean containsValue (Map<Object,Object> m, Object value) {
        return m.containsValue (value);
    }

    public Object get (Map<Object,Object> m, Object key) {
        return m.get (key);
    }

    public Object put (Map<Object,Object> m, Object key, Object value) {
        return m.put (key, value);
    }

    public Object remove (Map<Object,Object> m, Object key) {
        return m.remove (key);
    }

    public void putAll (Map<Object,Object> m, Map<Object, Object> o) {
        m.putAll (o);
    }

    public void clear (Map<Object,Object> m) {
        m.clear ();
    }

    public Set<Object> keySet (Map<Object,Object> m) {
        return m.keySet();
    }

    public Collection<?> values (Map<Object,Object> m) {
        return m.values();
    }

    
    ///////////////////////////////////
    // conversion operations
    ///////////////////////////////////

    public List<?> asList (Collection<?> c) {
        return new ArrayList<Object> (c);
    }

    public Set<?> asSet (Collection<?> c) {
        return new HashSet<Object> (c);
    }

}
