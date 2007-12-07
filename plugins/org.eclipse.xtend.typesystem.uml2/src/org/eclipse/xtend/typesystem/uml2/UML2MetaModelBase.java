/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.uml2;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

public abstract class UML2MetaModelBase extends EmfMetaModel {

    private static final String UML2_STRING = "uml::String";

    private static final String UML2_STRING1 = "UMLPrimitiveTypes::String";

    private static final String UML2_INTEGER = "uml::Integer";

    private static final String UML2_INTEGER1 = "UMLPrimitiveTypes::Integer";

    private static final String UML2_BOOLEAN = "uml::Boolean";

    private static final String UML2_BOOLEAN1 = "UMLPrimitiveTypes::Boolean";

    private static final String UML2_REAL = "uml::Real";

    private static final String UML2_REAL1 = "UMLPrimitiveTypes::Real";

    private static final String UML2_UNLIMITED_NATURAL = "uml::UnlimitedNatural";

    private static final String UML2_UNLIMITED_NATURAL1 = "UMLPrimitiveTypes::UnlimitedNatural";

    // Needed to avoid 'Couldn't resolve type for EObject/EClass...' messages
    // see FeatureRequest#199318
    private EmfMetaModel ecoreMetaModel;

    public UML2MetaModelBase() {
    	ecoreMetaModel = new EmfMetaModel();
    	ecoreMetaModel.setMetaModelPackage(EcorePackage.class.getName());
    }

    public UML2MetaModelBase(EPackage metamodel) {
        super(metamodel);
    	ecoreMetaModel = new EmfMetaModel();
    	ecoreMetaModel.setMetaModelPackage(EcorePackage.class.getName());
    }

    @Override
    public Type getTypeForName(String typeName) {
        Type result = getPrimitive(typeName);
        if (result != null)
            return result;
        result = super.getTypeForName(typeName);
        if (result != null)
            return result;
        result = ecoreMetaModel.getTypeForName(typeName);
        return result;
    }

    @Override
    public Type getTypeForEClassifier(EClassifier element) {
        Type result = getPrimitive(getFullyQualifiedName(element));
        if (result != null)
            return result;
        result = super.getTypeForEClassifier(element);
        if (result != null)
            return result;
        result = ecoreMetaModel.getTypeForEClassifier(element);
        return result;
    }

    private Type getPrimitive(String typeName) {
        if (typeName.equalsIgnoreCase(UML2_STRING) || typeName.equalsIgnoreCase(UML2_STRING1)) {
            return getTypeSystem().getStringType();
        } else if (typeName.equalsIgnoreCase(UML2_BOOLEAN) || typeName.equalsIgnoreCase(UML2_BOOLEAN1)) {
            return getTypeSystem().getBooleanType();
        } else if (typeName.equalsIgnoreCase(UML2_INTEGER) || typeName.equalsIgnoreCase(UML2_UNLIMITED_NATURAL)
                || typeName.equalsIgnoreCase(UML2_INTEGER1) || typeName.equalsIgnoreCase(UML2_UNLIMITED_NATURAL1)) {
            return getTypeSystem().getIntegerType();
        } else if (typeName.equalsIgnoreCase(UML2_REAL) || typeName.equalsIgnoreCase(UML2_REAL1)) {
            return getTypeSystem().getRealType();
        }
        return null;
    }

	@Override
	public void setTypeSystem(TypeSystem typeSystem) {
		super.setTypeSystem(typeSystem);
    	ecoreMetaModel.setTypeSystem(typeSystem);
	}
    
    

}
