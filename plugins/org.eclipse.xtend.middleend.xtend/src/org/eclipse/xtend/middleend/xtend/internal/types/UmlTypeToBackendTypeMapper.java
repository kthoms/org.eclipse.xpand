/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.internal.types;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.uml2.UmlTypesystem;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.uml2.profile.EnumType;
import org.eclipse.xtend.typesystem.uml2.profile.MultipleStereotypeType;
import org.eclipse.xtend.typesystem.uml2.profile.StereotypeType;

/**
 * @author aarnold - Initial contribution and API
 */
public class UmlTypeToBackendTypeMapper extends TypeToBackendTypeMapper {
    
    private static final Log _log = LogFactory.getLog (UmlTypeToBackendTypeMapper.class);

    private UmlTypesystem _umlTypes = null;
    
    public UmlTypeToBackendTypeMapper (BackendTypesystem ts) {
    	try {
	    	if (ts instanceof UmlTypesystem) {
	    		_umlTypes = (UmlTypesystem) ts;
	    	} else if (ts instanceof CompositeTypesystem) {
	            for (BackendTypesystem bts: ((CompositeTypesystem) ts).getInner()) {
	               if (bts instanceof UmlTypesystem)
	            	   _umlTypes = (UmlTypesystem) bts;
	            }
	    	}
    	} catch (Exception e) {
			_log.error("Check your project setup for typesystems", e);
		}
	}

	@Override
	public BackendType convertToBackendType(Type t) {
    	if (t instanceof StereotypeType)
    		return convertStereotypeType (t);
    	if (t instanceof MultipleStereotypeType)
    		return convertMultipleStereotypeType (t);
    	if (t instanceof EnumType)
    		return convertEnumType (t);
		return null;
	}


	private BackendType convertEnumType(Type t) {
    	if (t instanceof EnumType) 
    		return _umlTypes.findType(((EnumType)t).getEnumeration());
    	return null;
	}

	private BackendType convertMultipleStereotypeType(Type t) {
		if (t instanceof StereotypeType) {
			List<StereotypeType> stTypes = ((MultipleStereotypeType)t).getStereotypes();
			List<Stereotype> st = new ArrayList<Stereotype> ();
			for (StereotypeType stType : stTypes) {
				st.add(stType.getStereoType());
			}
			return _umlTypes.findType(st);
		}
		return null;
	}

	private BackendType convertStereotypeType(Type t) {
		if (t instanceof StereotypeType) {
			Stereotype st = ((StereotypeType)t).getStereoType();
			return _umlTypes.findType (UmlTypesystem.getUniqueIdentifier(st));
		}
		return null;
	}

}
