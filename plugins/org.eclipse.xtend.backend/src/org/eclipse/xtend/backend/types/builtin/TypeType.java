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
package org.eclipse.xtend.backend.types.builtin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.util.ReflectionHelper;


/**
 * This class represents the type of a type. It serves as an entry point for meta programming.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class TypeType extends AbstractType {
    public static final TypeType INSTANCE = new TypeType ();
    
    private TypeType () {
        super ("Type", "{builtin}Type");
        
        register (new BuiltinProperty (this, "name", ReflectionHelper.getKnownMethod (BackendType.class, "getName"), null), StringType.INSTANCE);
        register (new BuiltinProperty (this, "superTypes", ReflectionHelper.getKnownMethod (BackendType.class, "getSuperTypes"), null), CollectionType.INSTANCE);
        register (new BuiltinProperty (this, "allStaticProperties", ReflectionHelper.getKnownMethod (BackendType.class, "getStaticProperties"), null), CollectionType.INSTANCE);
        
        register (new AbstractProperty (this, java.util.Map.class, "allProperties", true, false) {

            @Override
            protected Object getRaw (ExecutionContext ctx, Object o) {
                return ((BackendType) o).getProperties (ctx);
            }

			@Override
			public BackendType getType (BackendTypesystem ts) {
				return CollectionType.INSTANCE;
			}
        }, CollectionType.INSTANCE);
        
        register (new AbstractProperty (this, java.util.List.class, "allOperations", true, false) {
            @Override
            public Object getRaw (ExecutionContext ctx, Object o) {
                final BackendType t = (BackendType) o;
                final List<Object> result = new ArrayList<Object>();
                result.addAll (ctx.getFunctionDefContext().getByFirstParameterType(t));
                result.addAll (t.getBuiltinOperations());
                return result;
            }

			@Override
			public BackendType getType (BackendTypesystem ts) {
				return CollectionType.INSTANCE;
			} 
        }, CollectionType.INSTANCE);
        
        register (new QualifiedName ("getProperty"), new Function () {
            final List<? extends BackendType> _paramTypes = Arrays.asList (TypeType.this, StringType.INSTANCE);
            
            public ExpressionBase getGuard () {
                return null;
            }

            public List<? extends BackendType> getParameterTypes () {
                return _paramTypes;
            }

            public Object invoke (ExecutionContext ctx, Object[] params) {
                final BackendType t = (BackendType) params[0];
                final String propname = (String) params[1];
                
                return t.getProperties(ctx).get(propname);
            }

            public boolean isCached () {
                return false;
            }

            public FunctionDefContext getFunctionDefContext () {
                return null;
            }

            public void setFunctionDefContext (FunctionDefContext fdc) {
                throw new UnsupportedOperationException ();
            }

			@Override
			public BackendType getReturnType() {
				return PropertyType.INSTANCE;
			}
        });
    }

    @Override
    public boolean equals (Object other) {
        return other == this;
    }
}


