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
package org.eclipse.xtend.backend.types.emf.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.emf.EObjectType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.backend.util.CollectionHelper;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class EClassType extends AbstractType {
    private final EClass _cls;
    
    public EClassType (EClass cls, EmfTypesystem ts) {
        super (EmfTypesystem.getFullyQualifiedName(cls), EmfTypesystem.getUniqueIdentifier(cls), superTypes(cls, ts));
        _cls = cls;
    }

    /** 
     * This method is separated from the constructor to avoid endless recursion if a type has properties and/or
     *  operations that reference itself 
     */
    public void init (EmfTypesystem ts) {
        initProperties (ts);
        initOperations (ts);
    }
    
    private void initProperties (EmfTypesystem ts) {
        for (final EStructuralFeature feature: _cls.getEStructuralFeatures()) {
            final BackendType t = ts.getTypeForETypedElement(feature);
            
            if (feature.isChangeable() && !feature.isUnsettable() && !feature.isDerived()) {
                register (new AbstractProperty (this, feature.getEType().getInstanceClass(), feature.getName(), true, true) {
                    @Override
                    public Object getRaw (ExecutionContext ctx, Object o) {
                        return ((EObject) o).eGet(feature);
                    }
                    
                    @Override
                    public void setRaw (ExecutionContext ctx, Object o, Object newValue) {
                        ((EObject) o).eSet(feature, newValue);
                    }

					public BackendType getType (BackendTypesystem ts) {
						return t;
					}
                }, t);
            }
            else {
                register (new AbstractProperty (this, feature.getEType().getInstanceClass(), feature.getName(), true, false) {
                    @Override
                    public Object getRaw (ExecutionContext ctx, Object o) {
                        return ((EObject) o).eGet(feature);
                    }

					public BackendType getType (BackendTypesystem ts) {
						return t;
					}
                }, t);
            }
        }
    }
    
    private void initOperations (EmfTypesystem ts) {
        for (final EOperation op: _cls.getEOperations()) {
            final Class<?>[] paramClasses = new Class<?>[op.getEParameters().size()];
            
            int i=0;
            final List<BackendType> paramTypes = new ArrayList<BackendType>();
            paramTypes.add (ts.getTypeForETypedElement (op));
            
            for (EParameter param: op.getEParameters()) {
                paramTypes.add (ts.getTypeForETypedElement(param));
                paramClasses[i++] = param.getEType().getInstanceClass();
            }

            final BackendType returnType = ts.getTypeForEClassifier (op.getEType());
            
            try {
                final Method mtd = _cls.getInstanceClass().getMethod(op.getName(), paramClasses);

                register (new QualifiedName (op.getName()), new Function () {
                    public ExpressionBase getGuard () {
                        return null;
                    }

                    public List<? extends BackendType> getParameterTypes () {
                        return paramTypes;
                    }

                    public Object invoke (ExecutionContext ctx, Object[] params) {
//                      params[i] = getParameterTypes().get(i).convert(params[i], paramClasses[i]);
                        try {
                            return mtd.invoke(params[0], CollectionHelper.withoutFirst (params));
                        } catch (Exception e) {
                            ErrorHandler.handle(e);
                            return null; // to make the compiler happy - this is never executed
                        }
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

					public BackendType getReturnType() {
						return returnType;
					}

                });
            } catch (Exception e) {
                ErrorHandler.handle (e);
            }
        }
    }
    
    
    @Override
    public Object create () {
        return _cls.getEPackage ().getEFactoryInstance ().create (_cls);
    }
    
    private static Collection<? extends BackendType> superTypes (EClass eClass, EmfTypesystem ts) {
        final Set<BackendType> result = new HashSet<BackendType>();

        for (EClass ec: eClass.getESuperTypes()) 
            result.add (ts.getTypeForEClassifier(ec));
            
        result.add (EObjectType.INSTANCE);
        return result;
    }

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_cls == null) ? 0 : _cls.hashCode());
        return result;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EClassType other = (EClassType) obj;
        if (_cls == null) {
            if (other._cls != null)
                return false;
        } else if (!_cls.equals(other._cls))
            return false;
        return true;
    }
}


