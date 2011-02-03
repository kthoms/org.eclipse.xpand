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
package org.eclipse.xtend.middleend.xtend.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.type.baseimpl.types.BooleanTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.CollectionTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.IntegerTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.ListTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.ObjectTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.OperationTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.PropertyTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.RealTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.SetTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.StaticPropertyTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.StringTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.TypeTypeImpl;
import org.eclipse.xsd.ecore.MapBuilder.Mapper;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.builtin.BooleanType;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.DoubleType;
import org.eclipse.xtend.backend.types.builtin.FunctionType;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.PropertyType;
import org.eclipse.xtend.backend.types.builtin.SetType;
import org.eclipse.xtend.backend.types.builtin.StaticPropertyType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.builtin.TypeType;
import org.eclipse.xtend.backend.types.builtin.VoidType;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.middleend.xtend.internal.types.EmfTypeToBackendTypeMapper;
import org.eclipse.xtend.middleend.xtend.internal.types.JavaTypeToBackendTypeMapper;
import org.eclipse.xtend.middleend.xtend.internal.types.TypeToBackendTypeMapper;
import org.eclipse.xtend.middleend.xtend.internal.types.UmlTypeToBackendTypeMapper;
import org.eclipse.xtend.middleend.xtend.internal.types.XsdTypeToBackendTypeMapper;
import org.eclipse.xtend.typesystem.Type;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class TypeToBackendType {
    
    private static final Log _log = LogFactory.getLog (TypeToBackendType.class);

    private final BackendTypesystem _backendTypes;
    private final ExecutionContext _ctx;
    private List<TypeToBackendTypeMapper> typeMappers;
    
    public TypeToBackendType (BackendTypesystem backendTypes, ExecutionContext ctx) {
        _backendTypes = backendTypes;
        _ctx = ctx;
        
        typeMappers = new ArrayList<TypeToBackendTypeMapper>();

        // register type mappers in order of resolution (UML, XSD, EMF, Java)
        try {
        	Class.forName("org.eclipse.xtend.typesystem.uml2.UML2MetaModel");
        	Class.forName("org.eclipse.xtend.backend.types.uml2.UmlTypesystem");
        	typeMappers.add (new UmlTypeToBackendTypeMapper (backendTypes));
		}
		catch (ClassNotFoundException e) {
		}
        catch (IllegalArgumentException e) {
        }
        catch (Exception e) {
        }
        
        try {
        	Class.forName("org.eclipse.xtend.typesystem.xsd.XSDMetaModel");
        	Class.forName("org.eclipse.xtend.backend.types.xsd.XsdTypesystem");
        	typeMappers.add (new XsdTypeToBackendTypeMapper (backendTypes));
		} 
        catch (ClassNotFoundException e) {
		}
        catch (IllegalArgumentException e) {
        }
        catch (Exception e) {
        }

		try {
        	Class.forName("org.eclipse.xtend.typesystem.emf.EmfMetaModel");
        	Class.forName("org.eclipse.xtend.backend.types.emf.EmfTypesystem");
        	typeMappers.add (new EmfTypeToBackendTypeMapper (backendTypes));
		}
		catch (ClassNotFoundException e) {
		}
        catch (IllegalArgumentException e) {
        }
        catch (Exception e) {
        }
		
		typeMappers.add (new JavaTypeToBackendTypeMapper (backendTypes));
        
	}
    
    public BackendType convertToBackendType (Identifier typeName) {
        return convertToBackendType (Arrays.asList (typeName.getValue().split (SyntaxConstants.NS_DELIM)));
    }
    
    private BackendType convertToBackendType (List<String> segments) {
        final StringBuilder sb = new StringBuilder();
        boolean first = true;
        
        for (String s: segments) {
            if (!first) {
                sb.append (SyntaxConstants.NS_DELIM);
            }
            first = false;
            
            sb.append (s);
        }
        
        final Type t = _ctx.getTypeForName (sb.toString());
        return convertToBackendType(t);
    }

    public BackendType convertToBackendType (Class<?> cls) {
        return _backendTypes.findType (cls);
    }
    
    public BackendType convertToBackendType (Type t) {
    	BackendType mappedType = null;
    	Iterator<TypeToBackendTypeMapper> typeMappersIt = typeMappers.iterator();
    	while (mappedType == null && typeMappersIt.hasNext()) {
    		TypeToBackendTypeMapper curMapper = typeMappersIt.next();
    		mappedType = curMapper.convertToBackendType(t);
		}

    	if (mappedType != null)
    		return mappedType;
        
        if (t instanceof BooleanTypeImpl)
            return BooleanType.INSTANCE;
        if (t instanceof ListTypeImpl)
            return ListType.INSTANCE;
        if (t instanceof SetTypeImpl)
            return SetType.INSTANCE;
        if (t instanceof CollectionTypeImpl)
            return CollectionType.INSTANCE;
        if (t instanceof IntegerTypeImpl)
            return LongType.INSTANCE;
        if (t instanceof ObjectTypeImpl)
            return ObjectType.INSTANCE;
        if (t instanceof OperationTypeImpl)
            return FunctionType.INSTANCE;
        if (t instanceof PropertyTypeImpl)
            return PropertyType.INSTANCE;
        if (t instanceof RealTypeImpl)
            return DoubleType.INSTANCE;
        if (t instanceof StaticPropertyTypeImpl)
            return StaticPropertyType.INSTANCE;
        if (t instanceof StringTypeImpl)
            return StringType.INSTANCE;
        if (t instanceof TypeTypeImpl)
            return TypeType.INSTANCE;
        if (t instanceof org.eclipse.internal.xtend.type.baseimpl.types.VoidType)
            return VoidType.INSTANCE;
        
        if (t != null)
            throw new IllegalArgumentException ("unable to convert type " + t.getClass().getName());
        else
            throw new IllegalArgumentException ("unable to convert type 'null'");
    }

}
