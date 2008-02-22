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
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.VoidType;
import org.eclipse.xtend.backend.util.StringHelper;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class AbstractType implements BackendType {
    private final String _name;
    private final List<BackendType> _superTypes;
    
    private final Map<String, Property> _properties = new HashMap<String, Property> ();
    private final Map<String, StaticProperty> _staticProperties = new HashMap<String, StaticProperty> ();
    
    private final Collection<NamedFunction> _builtinOperations = new HashSet<NamedFunction> ();
    
    public AbstractType(String name, BackendType... superTypes) {
        _name = name;
        
        if (superTypes.length == 0) 
            _superTypes = Collections.singletonList((BackendType) ObjectType.INSTANCE);
        else
            _superTypes = Arrays.asList(superTypes);
        
        for (BackendType superType: superTypes) {
            _builtinOperations.addAll (superType.getBuiltinOperations());
            _properties.putAll (superType.getProperties());
            _staticProperties.putAll (superType.getStaticProperties());
        }
    }

    public AbstractType(String name, Collection<? extends BackendType> superTypes) {
        _name = name;
        _superTypes = new ArrayList<BackendType> (superTypes);
    }

    protected void register (Property p) {
        _properties.put (p.getName(), p);
        
        register ("get" + StringHelper.firstUpper (p.getName()), new GetterOperation (p));
        if (p.isWritable())
            register ("set" + StringHelper.firstUpper (p.getName()), new SetterOperation (p));
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

    public boolean isAssignableFrom (BackendType other) {
        if (other == VoidType.INSTANCE)
            return true;

        if (other.equals (this))
            return true;
        
        for (BackendType st: other.getSuperTypes())
            if (isAssignableFrom (st))
                return true;
        
        return false;
    }
    
    @Override
    public String toString () {
        return _name;
    }
    
    private class SetterOperation implements Function {
        private final List<BackendType> _paramTypes = new ArrayList<BackendType> ();
        private final Property _property;

        public SetterOperation (Property property) {
            _property = property;

            _paramTypes.add (AbstractType.this);
            _paramTypes.add (property.getType ());
        }
        
        public ExpressionBase getGuard () {
            return null;
        }

        public List<? extends BackendType> getParameterTypes () {
            return _paramTypes;
        }

        public Object invoke (ExecutionContext ctx, Object[] params) {
            _property.set (ctx, params[0], params[1]);
            return null;
        }

        public boolean isCached () {
            return false;
        }
    }
    
    private class GetterOperation implements Function {
        private final List<BackendType> _paramTypes = new ArrayList<BackendType> ();
        private final Property _property;
        
        public GetterOperation (Property property) {
            _property = property;
            _paramTypes.add (AbstractType.this);
        }
        
        public ExpressionBase getGuard () {
            return null;
        }
        
        public List<? extends BackendType> getParameterTypes () {
            return _paramTypes;
        }
        
        public Object invoke (ExecutionContext ctx, Object[] params) {
            return _property.get (ctx, params[0]);
        }
        
        public boolean isCached () {
            return false;
        }
    }
}


