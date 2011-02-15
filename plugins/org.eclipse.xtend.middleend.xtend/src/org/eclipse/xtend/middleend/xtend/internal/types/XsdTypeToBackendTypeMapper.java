/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.internal.types;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.xsd.XsdTypesystem;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.xsd.type.EFeatureMapEntryTypeImpl;
import org.eclipse.xtend.typesystem.xsd.type.EFeatureMapTypeImpl;
import org.eclipse.xtend.typesystem.xsd.type.EFeatureType;
import org.eclipse.xtend.typesystem.xsd.type.EMapEntryType;
import org.eclipse.xtend.typesystem.xsd.type.EMapType;
import org.eclipse.xtend.typesystem.xsd.type.QNameType;
import org.eclipse.xtend.typesystem.xsd.type.XMLEClassType;

/**
 * @author André Arnold - Initial contribution and API
 */
public class XsdTypeToBackendTypeMapper extends TypeToBackendTypeMapper {
    
    private static final Log _log = LogFactory.getLog (XsdTypeToBackendTypeMapper.class);

    private XsdTypesystem _xsdTypes = null;
    
    public XsdTypeToBackendTypeMapper (BackendTypesystem ts) {
    	try {
	    	if (ts instanceof XsdTypesystem) {
	    		_xsdTypes = (XsdTypesystem) ts;
	    	} else if (ts instanceof CompositeTypesystem) {
	            for (BackendTypesystem bts: ((CompositeTypesystem) ts).getInner()) {
	               if (bts instanceof XsdTypesystem)
	            	   _xsdTypes = (XsdTypesystem) bts;
	            }
	            if (_xsdTypes == null)
	            	throw new IllegalArgumentException("Not an XsdTypesystem");
	    	} else {
				throw new IllegalArgumentException("Not an XsdTypesystem");
	    	}
    	} catch (Exception e) {
			_log.error("Check project setup for typesystems", e);
		}
    }

	@Override
	public BackendType convertToBackendType(Type t) {
		if (t instanceof QNameType)
			return _xsdTypes.getQNameType();
		if (t instanceof XMLEClassType)
			return convertXMLEClassType (t);
		if (t instanceof EFeatureMapTypeImpl)
			return convertEFeatureMapType (t);
		if (t instanceof EFeatureMapEntryTypeImpl)
			return _xsdTypes.getEFeatureMapEntryType ();
		if (t instanceof EFeatureType)
			return _xsdTypes.getEFeatureType ();
		if (t instanceof EMapType)
			return convertEMapType (t);
		if (t instanceof EMapEntryType)
			return convertEMapEntryType (t);
		return null;
	}

    
    private BackendType convertXMLEClassType (Type t) {
    	final EClass eClass = (EClass) getField (t, "clazz");
		return _xsdTypes.getTypeForEClassifier (eClass);
	}
    
    private BackendType convertEFeatureMapType(Type t) {
    	if (t instanceof EFeatureMapTypeImpl) {
    		final EClass eClass = ((EFeatureMapTypeImpl) t).getOwner();
    		return _xsdTypes.getEFeatureMapType (eClass);
    	}
    	return null;
	}

	private BackendType convertEMapType(Type t) {
		if (t instanceof EMapType) {
			EClassifier innerType = ((EMapType) t).getInnerType ();
			return _xsdTypes.getEMapType (innerType);
		}
		return null;
	}

	private BackendType convertEMapEntryType(Type t) {
		if (t instanceof EMapEntryType) {
			EClassifier emfType = ((EMapEntryType) t).getEmfType ();
			return _xsdTypes.getEMapEntryType (emfType);
		}
		return null;
	}

}
