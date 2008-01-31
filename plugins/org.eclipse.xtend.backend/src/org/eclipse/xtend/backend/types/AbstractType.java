/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.types.builtin.ObjectType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class AbstractType implements BackendType {
    private final String _name;
    private final List<BackendType> _superTypes;
    
    private final Map<String, Property> _properties = new HashMap<String, Property> ();
    private final Map<String, StaticProperty> _staticProperties = new HashMap<String, StaticProperty> ();
    
    private final List<NamedFunction> _builtinOperations = new ArrayList<NamedFunction> ();
    
    public AbstractType(String name, BackendType... superTypes) {
        _name = name;
        
        if (superTypes.length == 0) 
            _superTypes = Collections.singletonList((BackendType) ObjectType.INSTANCE);
        else
            _superTypes = Arrays.asList(superTypes);
    }

    public AbstractType(String name, Collection<? extends BackendType> superTypes) {
        _name = name;
        _superTypes = new ArrayList<BackendType> (superTypes);
    }

    protected void register (Property p) {
        _properties.put (p.getName(), p);
    }
    
    protected void register (StaticProperty p) {
        _staticProperties.put (p.getName(), p);
    }
    
    protected void register (String name, Function f) {
        _builtinOperations.add (new NamedFunction (name, f));
    }
    
    public final Collection<? extends NamedFunction> getBuiltinOperations () {
        return _builtinOperations;
    }

    public String getName () {
        return _name;
    }

    public final Object getProperty (ExecutionContext ctx, Object o, String name) {
        final Property p = getProperties().get (name);
        if (p == null)
            throw new IllegalArgumentException ("no property " + name + " in type " + getName());
        
        return p.get (ctx, o);
    }

    public final void setProperty (ExecutionContext ctx, Object o, String name, Object value) {
        final Property p = getProperties().get (name);
        if (p == null)
            throw new IllegalArgumentException ("no property " + name + " in type " + getName());
        
        p.set (ctx, o, value);
        
    }
    
    public final Collection<? extends BackendType> getSuperTypes () {
        return _superTypes;
    }

    public Object create () {
        throw new UnsupportedOperationException ("Type " + getName() + " can not be instantiated reflectively.");
    }

    public final Map<String, ? extends Property> getProperties () {
        //this could be statically initialized in the constructor, but is intentionally done dynamically to prepare for 
        //  "dynamic properties" that are attached at runtime
        final Map<String, Property> result = new HashMap<String, Property> ();
        
        for (BackendType t: _superTypes)
            result.putAll (t.getProperties());
        
        result.putAll (_properties);
        return result;
    }

    public final Map<String, ? extends StaticProperty> getStaticProperties () {
        return _staticProperties;
    }
    
    @Override
    public String toString () {
        return _name;
    }
}


