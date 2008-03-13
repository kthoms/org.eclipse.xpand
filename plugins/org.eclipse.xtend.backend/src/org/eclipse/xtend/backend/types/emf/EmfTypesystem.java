/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.emf;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.types.builtin.BooleanType;
import org.eclipse.xtend.backend.types.builtin.DoubleType;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.emf.internal.EClassType;
import org.eclipse.xtend.backend.types.emf.internal.EDataTypeType;
import org.eclipse.xtend.backend.types.emf.internal.EEnumType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class EmfTypesystem implements BackendTypesystem {
    private BackendTypesystem _rootTypesystem;
    
    public static final String UNIQUE_REPRESENTATION_PREFIX = "{emf}";


    private final Map<EClassifier, BackendType> _cache = new HashMap<EClassifier, BackendType>();

    private static final Map<EClassifier, BackendType> _ecorePrimitives = new HashMap<EClassifier, BackendType> ();
    
    static {
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEString(), StringType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEChar(), StringType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getECharacterObject(), StringType.INSTANCE);

        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEBoolean(), BooleanType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEBooleanObject(), BooleanType.INSTANCE);

        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEInt(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEIntegerObject(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getELong(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getELongObject(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEShort(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEShortObject(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEByte(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEByteObject(), LongType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEBigInteger(), LongType.INSTANCE);

        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEFloat(), DoubleType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEFloatObject(), DoubleType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEDouble(), DoubleType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEDoubleObject(), DoubleType.INSTANCE);
        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEBigDecimal(), DoubleType.INSTANCE);

        _ecorePrimitives.put (EcorePackage.eINSTANCE.getEJavaObject(), ObjectType.INSTANCE);
    }

    
    public static String getUniqueIdentifier (EClassifier cls) {
        return UNIQUE_REPRESENTATION_PREFIX + "{" + cls.getEPackage().getNsURI() + "}" + cls.getName();
    }
    
    public BackendType findType (String uniqueRepresentation) {
        if (! uniqueRepresentation.startsWith (UNIQUE_REPRESENTATION_PREFIX))
            return null;
        
        uniqueRepresentation = uniqueRepresentation.substring (UNIQUE_REPRESENTATION_PREFIX.length());

        final String nsUri = uniqueRepresentation.substring (1, uniqueRepresentation.indexOf('}'));
        final String name = uniqueRepresentation.substring (uniqueRepresentation.indexOf('}') + 1);
        
        final EPackage pkg = EPackage.Registry.INSTANCE.getEPackage (nsUri);
        
        for (final TreeIterator<EObject> iter =  pkg.eAllContents(); iter.hasNext(); ) {
            final EObject eo = iter.next();
            if (! (eo instanceof EClassifier))
                continue;
            
            final EClassifier cls = (EClassifier) eo;
            if (name.equals(cls.getName()))
                return getTypeForEClassifier (cls);
        }
        
        return null;
    }
    
    
    /**
     * This method serves as the single point of access to the internal cache of types; all other methods that
     *  look up a type should go through this method.
     */
    public BackendType getTypeForEClassifier (EClassifier cls) {
        final BackendType cached = _cache.get (cls);
        if (cached != null)
            return cached;
        
        if (cls instanceof EClass) {
            final EClassType result = new EClassType ((EClass) cls, this);
            
            // first putting the type into the cache and then initializing it avoids endless recursion
            _cache.put (cls, result);
            result.init (this);
            return result;
        }
        
        final BackendType result = getTypeForEClassifierRaw (cls);
        _cache.put (cls, result);
        return result;
    }

    private BackendType getTypeForEClassifierRaw (EClassifier cls) {
        if (cls instanceof EEnum)
            return new EEnumType ((EEnum) cls);
        
        final BackendType primitiveCandidate = _ecorePrimitives.get (cls);
        if (primitiveCandidate != null)
            return primitiveCandidate;

        if (cls instanceof EDataType) 
            return new EDataTypeType ((EDataType) cls);
        
        return null;
    }

    public BackendType findType(final Object obj) {
        if (! (obj instanceof EObject)) 
            return null;

        if (obj instanceof EEnumLiteral) 
            return getTypeForEClassifier(((EEnumLiteral) obj).getEEnum());

        return getTypeForEClassifier (((EObject) obj).eClass());
    }

    public BackendType getTypeForETypedElement (ETypedElement typedElement) {
        if (typedElement.getUpperBound() != 1)
            return ListType.INSTANCE;
        
        return getTypeForEClassifier(typedElement.getEType());
    }

    public static String getFullyQualifiedName (ENamedElement ele) {
        return getFqnRec (ele.eContainer(), ele.getName());
    }

    private final static String getFqnRec (EObject ele, String suffix) {
        if (ele == null || !(ele instanceof ENamedElement))
            return suffix;
        else 
            return getFqnRec(ele.eContainer(), ((ENamedElement) ele).getName() + SyntaxConstants.NS_DELIM + suffix);
    }

    public BackendType findType (Class<?> cls) {
        if (EObject.class.isAssignableFrom(cls))
            return EObjectType.INSTANCE;
        
        return null;
    }

    public BackendTypesystem getRootTypesystem () {
        return _rootTypesystem;
    }

    public void setRootTypesystem (BackendTypesystem ts) {
        _rootTypesystem = ts;
    }
}

