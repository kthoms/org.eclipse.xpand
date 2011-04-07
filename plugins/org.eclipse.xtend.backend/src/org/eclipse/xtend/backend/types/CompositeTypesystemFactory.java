/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.types;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.backend.common.BackendTypesystem;

/**
 * @author André Arnold - Initial contribution and API
 */
public class CompositeTypesystemFactory {
	
	public static final String EMF_TYPESYSTEM_QUALIFIER = "{emf}";
	public static final String UML_TYPESYSTEM_QUALIFIER = "{uml}";
	public static final String XSD_TYPESYSTEM_QUALIFIER = "{xsd}";
	
	public static final CompositeTypesystemFactory INSTANCE = new CompositeTypesystemFactory();

    private static final Log _log = LogFactory.getLog (CompositeTypesystemFactory.class);

	public CompositeTypesystem createTypesystem (Set<String> uniqueQualifiers) {
		CompositeTypesystem cts = new CompositeTypesystem();
		
        try {
        	Class<?> umlTsClass = Class.forName("org.eclipse.xtend.backend.types.uml2.UmlTypesystem");
        	if (uniqueQualifiers.contains (UML_TYPESYSTEM_QUALIFIER))
        		cts.register ((BackendTypesystem)umlTsClass.newInstance());
		}
		catch (ClassNotFoundException e) {
		}
        catch (IllegalArgumentException e) {
        }
        catch (Exception e) {
        }
        
        try {
        	Class<?> xsdTsClass = Class.forName("org.eclipse.xtend.backend.types.xsd.XsdTypesystem");
        	if (uniqueQualifiers.contains (XSD_TYPESYSTEM_QUALIFIER))
        		cts.register ((BackendTypesystem) xsdTsClass.newInstance());
		} 
        catch (ClassNotFoundException e) {
		}
        catch (IllegalArgumentException e) {
        }
        catch (Exception e) {
        }

        try {
        	Class<?> emfTsClass = Class.forName("org.eclipse.xtend.backend.types.emf.EmfTypesystem");
        	if (uniqueQualifiers.contains (EMF_TYPESYSTEM_QUALIFIER))
        		cts.register ((BackendTypesystem) emfTsClass.newInstance());
		} 
        catch (ClassNotFoundException e) {
		}
        catch (IllegalArgumentException e) {
        }
        catch (Exception e) {
        }
        
        return cts;
	}

}
