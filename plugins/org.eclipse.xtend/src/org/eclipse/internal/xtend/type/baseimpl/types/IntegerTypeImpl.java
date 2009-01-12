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

package org.eclipse.internal.xtend.type.baseimpl.types;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.internal.xtend.type.baseimpl.OperationImpl;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtend.typesystem.Type;

public final class IntegerTypeImpl extends BuiltinBaseType implements Type {

    public IntegerTypeImpl(final TypeSystem ts, final String name) {
        super(ts, name);
    }

    public boolean isInstance(final Object o) {
        return o instanceof Integer || o instanceof BigInteger || o instanceof Byte || o instanceof Long
                || o instanceof Short;
    }

    public Object newInstance() {
        return new Long(-1);
    }

    @Override
    public Feature[] getContributedFeatures() {
        return new Feature[] {
                new OperationImpl(this, "+", IntegerTypeImpl.this, new Type[] { IntegerTypeImpl.this }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (params[0] == null)
                            return null;
                        return new Long(((Number) target).longValue() + ((Number) params[0]).longValue());
                    }
                },
                new OperationImpl(this, "-", IntegerTypeImpl.this, new Type[] { IntegerTypeImpl.this }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (params[0] == null)
                            return null;
                        return new Long(((Number) target).longValue() - ((Number) params[0]).longValue());
                    }
                },
                new OperationImpl(this, "-", IntegerTypeImpl.this, new Type[] {}) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        return new Long(((Number) target).longValue() * -1l);
                    }
                },
                new OperationImpl(this, "*", IntegerTypeImpl.this, new Type[] { IntegerTypeImpl.this }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (params[0] == null)
                            return null;

                        return new Long(((Number) target).longValue() * ((Number) params[0]).longValue());
                    }
                },
                new OperationImpl(this, "/", IntegerTypeImpl.this, new Type[] { IntegerTypeImpl.this }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (params[0] == null)
                            return null;

                        return new Long(((Number) target).longValue() / ((Number) params[0]).longValue());
                    }
                },
                new OperationImpl(this, "==", getTypeSystem().getBooleanType(), new Type[] { getTypeSystem()
                        .getObjectType() }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (target == null)
                            return new Boolean(target == params[0]);

                        try {
                            return toLong(target).equals(toLong(params[0]));
                        }
                        catch (Exception exc) {
                            if (target instanceof Number && params[0] instanceof Number)
                                return ((Number) target).doubleValue() == ((Number) params[0]).doubleValue();
                            
                            return false;
                        }
                    }

                },
                new OperationImpl(this, "!=", getTypeSystem().getBooleanType(), new Type[] { getTypeSystem()
                        .getObjectType() }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (target == null)
                            return params[0] != null;

                        try {
                            return ! toLong(target).equals(toLong(params[0]));
                        }
                        catch (Exception exc) {
                            if (target instanceof Number && params[0] instanceof Number)
                                return ((Number) target).doubleValue() != ((Number) params[0]).doubleValue();
                            
                            return true;
                        }
                    }
                },
                new OperationImpl(this, ">", getTypeSystem().getBooleanType(), new Type[] { getTypeSystem()
                        .getObjectType() }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (target == null)
                            return Boolean.FALSE;
                        if (params[0] == null)
                            return Boolean.FALSE;
                        
                        try {
                            return ((Comparable<Long>) toLong(target)).compareTo(toLong(params[0])) > 0;
                        }
                        catch (Exception exc) {
                            return ((Number) target).doubleValue() > ((Number) params[0]).doubleValue(); 
                        }
                    }
                },
                new OperationImpl(this, ">=", getTypeSystem().getBooleanType(), new Type[] { getTypeSystem()
                        .getObjectType() }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (target == null)
                            return params[0] == null ? Boolean.TRUE : Boolean.FALSE;
                        if (params[0] == null)
                            return Boolean.FALSE;
                        
                        try {
                            return ((Comparable<Long>) toLong(target)).compareTo(toLong(params[0])) >= 0;
                        }
                        catch (Exception exc) {
                            return ((Number) target).doubleValue() >= ((Number) params[0]).doubleValue(); 
                        }
                    }
                },
                new OperationImpl(this, "<", getTypeSystem().getBooleanType(), new Type[] { getTypeSystem()
                        .getObjectType() }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (target == null)
                            return Boolean.FALSE;
                        if (params[0] == null)
                            return Boolean.FALSE;

                        try {
                            return ((Comparable<Long>) toLong(target)).compareTo(toLong(params[0])) < 0;
                        }
                        catch (Exception exc) {
                            return ((Number) target).doubleValue() < ((Number) params[0]).doubleValue(); 
                        }
                    }
                },
                new OperationImpl(this, "<=", getTypeSystem().getBooleanType(), new Type[] { getTypeSystem()
                        .getObjectType() }) {
                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        if (target == null)
                            return params[0] == null ? Boolean.TRUE : Boolean.FALSE;
                        if (params[0] == null)
                            return Boolean.FALSE;

                        try {
                            return ((Comparable<Long>) toLong(target)).compareTo(toLong(params[0])) <= 0;
                        }
                        catch (Exception exc) {
                            return ((Number) target).doubleValue() <= ((Number) params[0]).doubleValue(); 
                        }
                    }
                }, new OperationImpl(this, "upTo", getTypeSystem().getListType(this), new Type[] { this }) {

                    @Override
                    public String getDocumentation() {
                        return "returns a List of Integers starting with the value of the target expression, up to "
                                + "the value of the specified Integer, incremented by one.<br/>"
                                + "e.g. '1.upTo(5)' evaluates to {1,2,3,4,5}";
                    }

                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        final List<Long> result = new ArrayList<Long>();
                        long l1 = toLong(target).longValue();
                        final long l2 = toLong(params[0]).longValue();

                        while (l1 <= l2) {
                            result.add(new Long(l1));
                            l1++;
                        }
                        return result;
                    }
                }, new OperationImpl(this, "upTo", getTypeSystem().getListType(this), new Type[] { this, this }) {

                    @Override
                    public String getDocumentation() {
                        return "returns a List of Integers starting with the value of the target expression, up to "
                                + "the value of the first paramter, incremented by the second parameter.<br/>"
                                + "e.g. '1.upTo(10, 2)' evaluates to {1,3,5,7,9}";
                    }

                    @Override
                    public Object evaluateInternal(final Object target, final Object[] params) {
                        final List<Long> result = new ArrayList<Long>();
                        long l1 = toLong(target).longValue();
                        final long l2 = toLong(params[0]).longValue();
                        final long l3 = toLong(params[1]).longValue();

                        while (l1 <= l2) {
                            result.add(new Long(l1));
                            l1 = l1 + l3;
                        }
                        return result;
                    }
                } };
    }

    @Override
    public Set<Type> getSuperTypes() {
        return Collections.singleton(getTypeSystem().getRealType());
    }

    Long toLong(final Object o) {
        if (o == null)
            return null;
        
        if (o instanceof Integer)
            return new Long(((Integer) o).longValue());
        else if (o instanceof BigInteger)
            return new Long(((BigInteger) o).longValue());
        else if (o instanceof Byte)
            return new Long(((Byte) o).longValue());
        else if (o instanceof Long)
            return (Long) o;
        else if (o instanceof Short)
            return new Long(((Short) o).longValue());
        throw new IllegalArgumentException(o.getClass().getName() + " not supported");
    }

    @Override
    public Object convert(final Object src, final Class<?> targetType) {
        final Long l = toLong(src);
        if (targetType.isAssignableFrom(Integer.class) || targetType.isAssignableFrom(Integer.TYPE))
            return new Integer(l.intValue());
        else if (targetType.isAssignableFrom(BigInteger.class))
            return BigInteger.valueOf(l.longValue());
        else if (targetType.isAssignableFrom(Byte.class) || targetType.isAssignableFrom(Byte.TYPE))
            return new Byte(l.byteValue());
        else if (targetType.isAssignableFrom(Long.class) || targetType.isAssignableFrom(Long.TYPE))
            return src;
        else if (targetType.isAssignableFrom(Short.class) || targetType.isAssignableFrom(Short.TYPE))
            return new Short(l.shortValue());
        return super.convert(src, targetType);
    }

}
