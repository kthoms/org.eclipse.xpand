/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.typesystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.internal.xtend.type.baseimpl.PolymorphicResolver;
import org.eclipse.internal.xtend.util.Cache;
import org.eclipse.internal.xtend.util.Pair;
import org.eclipse.xtend.expression.TypeSystem;

public abstract class AbstractTypeImpl implements Type {

    private final static Log log = LogFactory.getLog(AbstractTypeImpl.class);

    private final TypeSystem typeSystem;

    private String _name;

    public AbstractTypeImpl(final TypeSystem typeSystem, final String name) {
        this.typeSystem = typeSystem;
        _name = name;
    }

    public final TypeSystem getTypeSystem() {
        return typeSystem;
    }

    public final String getName() {
        return _name;
    }

    public abstract Feature[] getContributedFeatures();

    private Set<Callable> allFeatures = null;

    /**
     * Return all features defined by the type
     */
    public final Set<Callable> getAllFeatures() {
        if (allFeatures == null) {
            allFeatures = new HashSet<Callable>();
            allFeatures.addAll(Arrays.asList(getContributedFeatures()));
            final Set<? extends Type> superTypes = getSuperTypes();
            for (final Iterator<? extends Type> iter = superTypes.iterator(); iter.hasNext();) {
                final Type type = iter.next();
                if (type != null) {
                    allFeatures.addAll(type.getAllFeatures());
                } else {
                    log.error("A supertype of " + getName() + " is null!");
                }
            }
        }
        return allFeatures;
    }

    public StaticProperty getStaticProperty(final String name) {
        return PolymorphicResolver.getStaticProperty(getAllFeatures(), name, this);
    }

    private final Cache<String,Property> propertyCache = new Cache<String,Property>() {

        @Override
        protected Property createNew(String name) {
            return PolymorphicResolver.getProperty(getAllFeatures(), (String) name, AbstractTypeImpl.this);
        }
    };

	public Property getProperty(final String name) {
        return propertyCache.get(name);
    }

    public Callable getFeature(final String name, final Type[] parameterTypes) {
        Property property = null;
        if (parameterTypes == null || parameterTypes.length == 0) {
            property = getProperty(name);
        }
        final Operation operation = getOperation(name, parameterTypes);
        if (property != null && operation != null) {
            if (property.getOwner().equals(operation.getOwner()))
                throw new RuntimeException();
            else if (property.getOwner().isAssignableFrom(operation.getOwner()))
                return operation;
            else
                return property;
        } else if (property != null)
            return property;
        else
            return operation;
    }

    private final Cache<Pair<String,List<Type>>, Operation> operationsCache = new Cache<Pair<String,List<Type>>, Operation>() {

        @Override
        protected Operation createNew(Pair<String,List<Type>> arg0) {
            return PolymorphicResolver.getOperation(getAllFeatures(), arg0.getFirst(),
                    AbstractTypeImpl.this, (List<? extends Type>) arg0.getSecond());
        }
    };

	public Operation getOperation(final String name, final Type[] parameterTypes) {
        return (Operation) operationsCache.get(new Pair<String,List<Type>>(name, Arrays.asList(parameterTypes != null ? parameterTypes
                : new Type[0])));
    }

    public Set<? extends StaticProperty> getAllStaticProperties() {
        return PolymorphicResolver.select(getAllFeatures(), StaticProperty.class);
    }

    public Set<? extends Property> getAllProperties() {
        return PolymorphicResolver.select(getAllFeatures(), Property.class);
    }

    public Set<? extends Operation> getAllOperations() {
        return PolymorphicResolver.select(getAllFeatures(), Operation.class);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Type)
            return getName().equals(((Type) obj).getName());
        return false;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }

    public final boolean isAssignableFrom(final Type t) {
        if (t == null)
            return false;
        if (equals(t))
            return true;
        if (t.equals(getTypeSystem().getVoidType()))
            return true;
        return internalIsAssignableFrom(t);
    }

    protected boolean internalIsAssignableFrom(final Type t) {
        final Set<? extends Type> superTypes = t.getSuperTypes();
        for (Type type : superTypes) {
            if (isAssignableFrom(type))
                return true;
        }
        return false;
    }

    public Object convert(final Object src, final Class<?> targetType) {
        if (targetType.isInstance(src))
            return src;
        else
            throw new IllegalArgumentException(getName() + " is not responsible for java type " + targetType.getName());
    }

    public String getDocumentation() {
        return "";
    }
    
    private Set<? extends Type> superTypes = null;

    public Set<? extends Type> getSuperTypes() {
        if (superTypes==null)
        	superTypes = internalGetSuperTypes();
        return superTypes;
    }
    
    protected Set<? extends Type> internalGetSuperTypes() {
        return Collections.singleton(getTypeSystem().getObjectType());
    }

    public boolean isAbstract() {
        return false;
    }
}
