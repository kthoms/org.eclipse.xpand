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

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createLiteral;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.functions.AbstractFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.testhelpers.BeanWithSizeProperty;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.junit.Test;

/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class JavaBeansTypeTest {
    @Test public void testInvokeWithConversion () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        
        assertEquals ("asdfabc7 - 2", ctx.getFunctionDefContext().invoke (ctx, "myFunction", Arrays.asList(new BeanWithSizeProperty(7), "abc", 5L)));
    }
    
    @Test public void testUniqueIdentifier () {
        final BackendTypesystem ts = new CompositeTypesystem ();
        
        final BackendType byClass = ts.findType (BeanWithSizeProperty.class);
        final BackendType byIdentifier = ts.findType ("{javabean}" + BeanWithSizeProperty.class.getName());
        assertSame (byClass, byIdentifier);
        
        assertEquals ("{javabean}" + BeanWithSizeProperty.class.getName(), byClass.getUniqueRepresentation());
    }
    
    @Test
    public void testInterface () {
        final CompositeTypesystem typeSystem = new CompositeTypesystem ();
        typeSystem.register (new EmfTypesystem ());

        final BackendType interfaceType = typeSystem.findType (org.eclipse.xtend.backend.syslib.Outlet.class);
        assertEquals (1, interfaceType.getSuperTypes().size ());
        assertEquals (ObjectType.INSTANCE, interfaceType.getSuperTypes().iterator().next());
    }
    
    @Test
    public void testProperties () {
        final BackendTypesystem ts = new CompositeTypesystem ();
        
        final BackendType type = ts.findType (BeanWithSizeProperty.class);
        final Map<String, ? extends Property> props = type.getProperties (createEmptyExecutionContext());  

        System.out.println (props.keySet());
        assertEquals (8, props.size());

        final Object o = new BeanWithSizeProperty (4);
        
        final Property sizeProp = props.get ("size");
        checkProp (sizeProp, "size", type, true, true);
        assertEquals (4L, sizeProp.get(createEmptyExecutionContext(), o));
        sizeProp.set(createEmptyExecutionContext(), o, 3L);
        assertEquals (3L, sizeProp.get(createEmptyExecutionContext(), o));

        checkProp (props.get ("chunks"), "chunks", type, true, false);
        assertEquals (Arrays.asList("a0", "a1", "a2"), type.getProperty(createEmptyExecutionContext(), o, "chunks"));
        
        checkProp (props.get ("readonlyProp"), "readonlyProp", type, true, false);
        checkProp (props.get ("writeOnlyProp"), "writeOnlyProp", type, false, true);
        
        checkProp (props.get ("ABCdef"), "ABCdef", type, true, false);
        checkProp (props.get ("XYZabc"), "XYZabc", type, true, false);
        checkProp (props.get ("RS"), "RS", type, true, false);
        checkProp (props.get ("r"), "r", type, false, true);

        final ExecutionContext ctx = createEmptyExecutionContext();
        ((FunctionDefContextInternal) ctx.getFunctionDefContext()).register (new NamedFunction ("getZoom", new AbstractFunction (null, Arrays.asList(type), false) {
            public Object invoke (ExecutionContext pCtx, Object[] params) {
                return "zoom";
            }
        }), true);
        ((FunctionDefContextInternal) ctx.getFunctionDefContext()).register (new NamedFunction ("getWithGuard", new AbstractFunction (createLiteral(Boolean.TRUE), Arrays.asList(type), false) {
            public Object invoke (ExecutionContext pCtx, Object[] params) {
                return "yxy";
            }
        }), true);
        ((FunctionDefContextInternal) ctx.getFunctionDefContext()).register (new NamedFunction ("getPrivate", new AbstractFunction (null, Arrays.asList(type), false) {
            public Object invoke (ExecutionContext pCtx, Object[] params) {
                return "asdf";
            }
        }), false);
        
        assertEquals (10, type.getProperties (ctx).size());

        assertEquals ("zoom", ctx.getFunctionDefContext().invoke (ctx, "getZoom", Arrays.asList (o)));
        final Property zoomProperty = type.getProperties (ctx).get ("zoom");
        checkProp (zoomProperty, "zoom", type, true, false);
        assertEquals ("zoom", zoomProperty.get (ctx, o));
        assertEquals ("zoom", type.getProperty (ctx, o, "zoom"));
        
        checkProp (type.getProperties (ctx).get ("private"), "private", type, true, false);
    }

    private void checkProp (Property prop, String name, BackendType owner, boolean isReadable, boolean isWritable) {
        assertEquals (name, prop.getName());
        assertEquals (owner, prop.getOwner());
        assertEquals (isReadable, prop.isReadable());
        assertEquals (isWritable, prop.isWritable());
    }
}
