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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.emf.EClassType;
import org.eclipse.xtend.typesystem.emf.EDataTypeType;
import org.eclipse.xtend.typesystem.emf.EEnumType;
import org.eclipse.xtend.typesystem.emf.EObjectType;

/**
 * @author André Arnold - Initial contribution and API
 */
public class EmfTypeToBackendTypeMapper extends TypeToBackendTypeMapper {
    
    private static final Log _log = LogFactory.getLog (EmfTypeToBackendTypeMapper.class);
   
	private EmfTypesystem _emfTypes = null;
	
	public EmfTypeToBackendTypeMapper (BackendTypesystem ts) {
		try {
			if (ts instanceof EmfTypesystem) {
				_emfTypes = (EmfTypesystem) ts;
	    	} else if (ts instanceof CompositeTypesystem) {
	            for (BackendTypesystem bts: ((CompositeTypesystem) ts).getInner()) {
	               if (bts instanceof EmfTypesystem)
	            	   _emfTypes = (EmfTypesystem) bts;
	            }
			}
		} catch (Exception e) {
			_log.error("Check project setup for typesystems", e);
		}
	}

	@Override
	public BackendType convertToBackendType(Type t) {
	    if (t instanceof EClassType)
	        return convertEClassType (t);
	    if (t instanceof EDataTypeType)
	        return convertEDataTypeType (t);
	    if (t instanceof EEnumType)
	        return convertEEnumType (t);
	    if (t instanceof EObjectType)
	        return org.eclipse.xtend.backend.types.emf.EObjectType.INSTANCE;
		return null;
	}

	private BackendType convertEClassType (Type t) {
        final EClass eClass = (EClass) getField(t, "eClass");
        return _emfTypes.getTypeForEClassifier(eClass);
    }
    
    private BackendType convertEDataTypeType (Type t) {
        final EDataType eClass = (EDataType) getField(t, "dataType");
        return _emfTypes.getTypeForEClassifier(eClass);
    }
    
    private BackendType convertEEnumType (Type t) {
        final EEnum eClass = (EEnum) getField(t, "eEnum");
        return _emfTypes.getTypeForEClassifier(eClass);
    }

}
