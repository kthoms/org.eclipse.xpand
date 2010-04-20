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
package org.eclipse.xtend.backend.types.uml2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.types.builtin.BooleanType;
import org.eclipse.xtend.backend.types.builtin.DoubleType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.backend.types.uml2.internal.EnumType;
import org.eclipse.xtend.backend.types.uml2.internal.MultipleStereotypeType;
import org.eclipse.xtend.backend.types.uml2.internal.StereotypeType;
import org.omg.CORBA._PolicyStub;


/**
 * This typesystem implementation takes care of UML specifics, i.e. additional UML representations
 *  for primitive types and the mapping of UML stereotypes to backend types. It builds on top
 *  of the EmfTypesystem, which takes care of the "normal" mapping of UML elements to their
 *  corresponding types. <br>
 *  
 * In other words, this typesystem implementation resolves all EMF types 
 *  using the EmfTypesystem, so if you use UmlTypesystem, there is no need to use EmfTypesystem
 *  as well. But if you use both, make sure UmlTypesystem comes before EmfTypesystem.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class UmlTypesystem implements BackendTypesystem {

    public static final String UNIQUE_REPRESENTATION_PREFIX = "{uml}";

	private BackendTypesystem _rootTs;

    private final EmfTypesystem _emfTypesystem = new EmfTypesystem ();
    
    private final boolean _errorIfStereotypeIsMissing;
    private static final Map<String, BackendType> _uml2Primitives = new HashMap<String, BackendType>();
    private final Map<String, BackendType> _stereotypeTypes = new HashMap<String, BackendType> ();

    static {
        registerPrimitiveByName ("string", StringType.INSTANCE);
        
        registerPrimitiveByName ("int", LongType.INSTANCE);
        registerPrimitiveByName ("integer", LongType.INSTANCE);
        registerPrimitiveByName ("unlimitedNatural", LongType.INSTANCE);

        registerPrimitiveByName ("boolean", BooleanType.INSTANCE);

        registerPrimitiveByName ("real", DoubleType.INSTANCE);
    }

    public UmlTypesystem (Collection<Profile>  profiles, boolean errorIfStereotypeIsMissing) {
        _errorIfStereotypeIsMissing = errorIfStereotypeIsMissing;
        for (Profile p: profiles)
            registerProfile (p);
    }
    
    public void registerProfile (Profile profile) {
        fixName (profile);
        
        for (Type t: getAllOwnedTypes(profile)) {
            if (t instanceof Stereotype) {
                final Stereotype st = (Stereotype) t;
                fixName (st);
                final String typeName = getFullName(st);
                final BackendType bt = new StereotypeType (typeName, st, this);
                _stereotypeTypes.put (typeName, bt);
            } 
            else if (t instanceof Enumeration) {
                final Enumeration en = (Enumeration) t;
                fixName (en);
                final String typeName = getFullName (en);
                final BackendType bt = new EnumType (typeName, en);
                _stereotypeTypes.put (typeName, bt);
            }
        }
    }

    private String getFullName (NamedElement ne) {
        return ne.getQualifiedName();
    }
    
    /**
     * recursively retrieves all UML types in a package and its children
     */
    private Collection<Type> getAllOwnedTypes (Package pkg) {
        final Collection<Type> result = new ArrayList<Type> (pkg.getOwnedTypes());
        
        for (Package child: pkg.getNestedPackages()) 
            result.addAll (getAllOwnedTypes (child));

        return result;
    }
    
    /**
     * replace all whitespace in the element's name by underscore characters
     */
    public static void fixName (NamedElement elem) {
        if (elem.getName() == null)
            return;
        
        elem.setName (elem.getName().replaceAll("\\s", "_"));
    }

    
    private static void registerPrimitiveByName (String name, BackendType type) {
        _uml2Primitives.put (name.toLowerCase(), type);
    }
    
    public BackendType findType (Object o) {
        if (! (o instanceof Type)) {
            if (o instanceof Element){
            	BackendType stType = getTypeByStereotype ((Element) o);
                if (stType != null)
                	return stType; 
            }
        }
	        
        if (o instanceof EnumerationLiteral) {
            final EnumerationLiteral el = (EnumerationLiteral) o;
            
            // first, try to determine the literal's type by it's stereotype
            BackendType result = getTypeByStereotype(el);
            if (result != null)
                return result;
            
            // if that doesn't work, try to get the type of the containing enumeration
            return _rootTs.findType (el.getEnumeration());
        }
        else if (o instanceof Element){
        	BackendType stType = getTypeByStereotype ((Element) o);
            if (stType != null)
            	return stType; 
        }
        
        return _emfTypesystem.findType (o);
    }

    private BackendType getTypeByStereotype (Element element) {
        final List<Stereotype> stereotypes = element.getAppliedStereotypes();

        if (stereotypes.isEmpty()) {
            //collection will be empty if the required profile is not loaded
            if (_errorIfStereotypeIsMissing && !stereotypes.toString ().equals ("[]"))
                throw new RuntimeException("Stereotype could not be loaded! Possible hint: '" + stereotypes);
            else if (element.getOwner() instanceof Profile && element instanceof Enumeration) {
            		Enumeration e = (Enumeration) element;
            		return _stereotypeTypes.get (getFullName (e));
            }
            else if (element instanceof Stereotype)
            	return _stereotypeTypes.get (getFullName ((Stereotype) element));
            else
                return null;
        }
        
        final List<BackendType> stTypes = new ArrayList<BackendType>();
        for (Stereotype st: stereotypes) {
//            BackendType stType = findType (st);
        	BackendType stType = _stereotypeTypes.get (getFullName(st));
            if (stType != null) {
                stTypes.add (stType);
            }
        }
        switch (stTypes.size()) {
            case 0: return null;
            case 1: return stTypes.get(0);
            default: return new MultipleStereotypeType (stTypes);
        }
    }
    
    private BackendType getTypeByStereotypeList (List<?> stereotypes) {
        final List<BackendType> stTypes = new ArrayList<BackendType>();
        for (Object o: stereotypes) {
        	if (o instanceof Stereotype) {
	            BackendType stType = findType (o);
	            if (stType != null) {
	                stTypes.add (stType);
	            }
	        }
	    }
        if (stereotypes.size() > 0)
        	return new MultipleStereotypeType(stTypes);
        
        return null;
    }

    public BackendType getTypeForEClassifier (EClassifier eClassifier) {
        return _emfTypesystem.getTypeForEClassifier (eClassifier);
    }
    
    public BackendType findType (Class<?> cls) {
        return _emfTypesystem.findType (cls); 
    }

    public BackendTypesystem getRootTypesystem () {
        return _rootTs;
    }

    public void setRootTypesystem (BackendTypesystem ts) {
        _emfTypesystem.setRootTypesystem (ts);
        _rootTs = ts;
    }

    public BackendType findType (String uniqueRepresentation) {
        if (! uniqueRepresentation.startsWith (UNIQUE_REPRESENTATION_PREFIX))
            return null;
        
        uniqueRepresentation = uniqueRepresentation.substring (UNIQUE_REPRESENTATION_PREFIX.length());
        BackendType bt = _stereotypeTypes.get(uniqueRepresentation);        
        if (bt != null)
        	return bt;
        
        //TODO look up BackendTypes for UML itself
        String umlNsUri = UMLFactory.eINSTANCE.getEPackage().getNsURI();
        String emfUniqueRepresentation = EmfTypesystem.UNIQUE_REPRESENTATION_PREFIX + "{" + umlNsUri + "}" +  uniqueRepresentation.substring(uniqueRepresentation.indexOf("::") + 2);
        bt = _emfTypesystem.findType(emfUniqueRepresentation);
        if (bt != null)
        	return bt;
        
        return null;
    }

    public static String getUniqueIdentifier (NamedElement cls) {
    	if (!cls.getQualifiedName ().startsWith ("uml::")) {
	    	List<Stereotype> stereoTypes = cls.getAppliedStereotypes();
	    	if (stereoTypes.size() > 1) {
	    		StringBuffer typeNames = new StringBuffer ();
	    		for (Iterator<Stereotype> stIt = stereoTypes.iterator(); stIt.hasNext();) {
					Stereotype stereotype = stIt.next();
					typeNames.append (stereotype.getQualifiedName());
					if (stIt.hasNext())
						typeNames.append(",");
				}
	    		return UNIQUE_REPRESENTATION_PREFIX + typeNames.toString();
	    	}
	    	else if (stereoTypes.size() == 1)
	    		return UNIQUE_REPRESENTATION_PREFIX + cls.getAppliedStereotypes().get(0).getQualifiedName();
    	}
    	return UNIQUE_REPRESENTATION_PREFIX + cls.getQualifiedName();
    	
    }
    
    public BackendType getTypeForStereotypeProperty (Type t) {
    	if (t.getName() != null) {
            final BackendType umlPrimitive = _uml2Primitives.get (t.getName().toLowerCase());
            if (umlPrimitive != null)
                return umlPrimitive;
        }
    	return findType(t);
    }
}
