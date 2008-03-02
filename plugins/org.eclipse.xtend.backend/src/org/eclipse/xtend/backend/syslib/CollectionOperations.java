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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.Helpers;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;
import org.eclipse.xtend.middleend.javaannotations.M2tHidden;


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

    public boolean containsAll (Collection<Object> c, Collection<?> o) {
        return c.containsAll (o);
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
    
    public Object first (List<?> c) {
        return c.get (0);
    }
    
    public Object last (List<?> c) {
        return c.get (c.size() - 1);
    }
    
    public List<?> withoutFirst (List<?> l) {
        final List<Object> result = new ArrayList<Object> ();
        
        for (int i=1; i<l.size(); i++)
            result.add (l.get (i));
        
        return result;
    }
    
    public List<?> withoutLast (List<?> l) {
        final List<Object> result = new ArrayList<Object> ();
        
        for (int i=0; i<l.size()-1; i++)
            result.add (l.get (i));
        
        return result;
    }
    
    /////////////////////////////////////////////
    // collection "arithmetic"
    /////////////////////////////////////////////
    
    public Set<?> union (Collection<?> c1, Collection<?> c2) {
        if (c2 == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        final Set<Object> result = new HashSet<Object> (c1);
        result.addAll (c2);
        return result;
    }
    
    public Set<?> without (Collection<?> c1, Collection<?> c2) {
        if (c2 == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        final Set<Object> result = new HashSet<Object> (c1);
        result.removeAll (c2);
        return result;
    }
    
    public Set<?> intersect (Collection<?> c1, Collection<?> c2) {
        if (c2 == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        final Set<Object> result = new HashSet<Object> (c1);
        result.retainAll (c2);
        return result;
    }
    
    public List<Object> reverse (List<Object> l) {
        final List<Object> result = new ArrayList<Object> (l);
        Collections.reverse (result);
        return result;
    }
        
    
    /////////////////////////////////////////////
    // "functional" operations on collections
    /////////////////////////////////////////////
    
    public Collection<?> select (Collection<?> c, Function f) {
        final Collection<Object> result = createMatchingCollection(c);
        
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
    
    public Collection<?> typeSelect (Collection<?> c, BackendType t) {
        final Collection<Object> result = createMatchingCollection (c);

        for (Object candidate: c) {
            if (candidate == null)
                continue; //TODO this is backwards compatible - but somehow inconsistent. Change this?
            
            if (t.isAssignableFrom (_ctx.getTypesystem().findType (candidate)))
                result.add (candidate);
        }
        
        return result;
    }
    
    public Collection<?> collect (Collection<?> c, Function f) {
        final Collection<Object> result = createMatchingCollection (c);
        
        for (Object o: c)
            result.add (f.invoke(_ctx, new Object[] {o}));
        
        return result;
    }

    public Collection<?> reject (Collection<?> c, Function f) {
        final Collection<Object> result = createMatchingCollection(c);
        
        for (Object o: c)
            if (! (Boolean.TRUE.equals (f.invoke(_ctx, new Object[] {o}))))
                result.add (o);
        
        return result;
    }
    
    public boolean exists (Collection<?> c, Function f) {
        for (Object o: c)
            if (Boolean.TRUE.equals (f.invoke(_ctx, new Object[] {o})))
                return true; 
        
        return false;
    }

    public boolean notExists (Collection<?> c, Function f) {
        for (Object o: c)
            if (Boolean.TRUE.equals (f.invoke(_ctx, new Object[] {o})))
                return false; 
        
        return true;
    }

    public boolean forAll (Collection<?> c, Function f) {
        for (Object o: c)
            if (! (Boolean.TRUE.equals (f.invoke (_ctx, new Object[] {o}))))
                return false;
        
        return true;
    }
    
    public List<?> sortBy (Collection<Object> c, final Function f) {
        final List<?> result = new ArrayList<Object> (c);
        Collections.sort (result, new Comparator<Object> () {

            @SuppressWarnings("unchecked")
            public int compare (Object o1, Object o2) {
                final Object comp1 = f.invoke (_ctx, new Object[] {o1});
                final Object comp2 = f.invoke (_ctx, new Object[] {o2});
                
                if (comp1==comp2)
                    return 0;
                if (comp1==null)
                    return -1;
                if (comp2==null)
                    return 1;
                if (comp1 instanceof Comparable)
                    return ((Comparable) comp1).compareTo (comp2);
                return comp1.toString ().compareTo (comp2.toString ());
            }
        });
        
        return result;
    }

    public Collection<?> flattenedCopy (Collection<?> c) {
        final Collection<Object> result = createMatchingCollection (c);
        
        for (Object o: c)
            addFlattened (result, o);
        
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

    public List<?> toList (Collection<?> c) {
        return new ArrayList<Object> (c);
    }

    public Set<?> toSet (Collection<?> c) {
        return new HashSet<Object> (c);
    }

    public CharSequence toString (Collection<?> coll, CharSequence separator) {
        EfficientLazyString result = new EfficientLazyString ();
        
        boolean first = true;
        
        for (Object o: coll) {
            if (first)
                first = false;
            else
                result = EfficientLazyString.createAppendedString (result, separator);
            
            result = EfficientLazyString.createAppendedString (result, Helpers.overridableToString (_ctx, o));
        }
        
        return result;
    }
    
    ///////////////////////////////////
    // helpers
    ///////////////////////////////////
    
    @M2tHidden
    public static void addFlattened (Collection<Object> coll, Object newEl) {
        if (newEl instanceof Collection)
            coll.addAll ((Collection<?>) newEl);
        else
            coll.add (newEl);
    }
    
    @M2tHidden
    public static Collection<Object> createMatchingCollection (Collection<?> coll) {
        if (coll instanceof List)
            return new ArrayList<Object>();
        else
            return new HashSet<Object>();
    }
}


