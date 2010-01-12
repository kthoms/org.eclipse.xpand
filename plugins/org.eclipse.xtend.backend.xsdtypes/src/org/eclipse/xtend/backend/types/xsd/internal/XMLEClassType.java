package org.eclipse.xtend.backend.types.xsd.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.VoidType;
import org.eclipse.xtend.backend.types.emf.EObjectType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.backend.types.xsd.XsdTypesystem;
import org.eclipse.xtend.backend.util.CollectionHelper;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.backend.util.StringHelper;

public class XMLEClassType extends AbstractType {

    private final EClass _cls;

	public XMLEClassType(EClass clazz,
			XsdTypesystem ts) {
		//TODO use clazz.get
        super (XsdTypesystem.getFullyQualifiedName(clazz), XsdTypesystem.getUniqueIdentifier(clazz), superTypes(clazz, ts));

		_cls = clazz;

	}

    /** 
     * This method is separated from the constructor to avoid endless recursion if a type has properties and/or
     *  operations that reference itself 
     */
    public void init (XsdTypesystem xsdTypesystem) {
        initProperties (xsdTypesystem);
        initOperations (xsdTypesystem);
    }
    
    private void initProperties (XsdTypesystem xsdTypesystem) {
        for (final EStructuralFeature feature: _cls.getEStructuralFeatures()) {
            final BackendType t = xsdTypesystem.getTypeForETypedElement(feature);
            
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
            else if (feature.isChangeable () && !feature.isMany () && feature.getEType () instanceof EDataType) {
				EDataType dt = (EDataType) feature.getEType();
				if (ExtendedMetaData.INSTANCE.getMemberTypes(dt).size() != 0) {
					//TODO Can BackendType t be used? This would be the case if getTypeForETypedElement would be the proper lookup method
					final BackendType type = xsdTypesystem.findType (feature);
					if (t != null) {
						register (new QualifiedName ("set" + StringHelper.firstUpper (feature.getName())), new CompositeTypeAwareSetter(feature, type, xsdTypesystem
								));
					}
				}
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
    
    private void initOperations (XsdTypesystem xsdTypesystem) {
        for (final EOperation op: _cls.getEOperations()) {
            final Class<?>[] paramClasses = new Class<?>[op.getEParameters().size()];
            
            int i=0;
            final List<BackendType> paramTypes = new ArrayList<BackendType>();
            paramTypes.add (xsdTypesystem.getTypeForETypedElement (op));
            
            for (EParameter param: op.getEParameters()) {
                paramTypes.add (xsdTypesystem.getTypeForETypedElement(param));
                paramClasses[i++] = param.getEType().getInstanceClass();
            }

            final BackendType returnType = xsdTypesystem.getTypeForEClassifier (op.getEType());
            
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
    
    private static Collection<? extends BackendType> superTypes (EClass eClass, XsdTypesystem ts) {
        final Set<BackendType> result = new HashSet<BackendType>();

        for (EClass ec: eClass.getESuperTypes()) 
            result.add (ts.getTypeForEClassifier(ec));
            
        result.add (EObjectType.INSTANCE);
        return result;
    }

	private class CompositeTypeAwareSetter implements Function {

		private EStructuralFeature feature;
		private HashMap<BackendType, EDataType> members = new HashMap<BackendType, EDataType>();
		private XsdTypesystem _ts;
		private FunctionDefContext _fdc;

		public CompositeTypeAwareSetter(EStructuralFeature feature, BackendType type, XsdTypesystem ts) {
//			super(XMLEClassType.this, "set"
//					+ StringHelper.firstUpper(feature.getName()),
//					XMLEClassType.this, type);
			this.feature = feature;
			_ts = ts;
			ExtendedMetaData em = ExtendedMetaData.INSTANCE;
			collectMemberTypes(em, (EDataType) feature.getEType());
			// log.info("Created " + getClass() + " for " + feature.getName()
			// + " with " + members);
		}

		private void collectMemberTypes(ExtendedMetaData em, EDataType type) {
			for (EDataType v : em.getMemberTypes(type)) {
				if (!(v instanceof EEnum)) {
					BackendType k = _ts.getTypeForEClassifier(v);
					if (k != null)
						members.put(k, v);
//					else
//						log.warn("Couldn't resolve type for " + getTypeName(v));
				}
				collectMemberTypes(em, v);
			}
		}

		public Object invoke(ExecutionContext ctx,
				Object[] params) {
			try {
				Object newValue = params[1];
				//TODO implicit conversions
//				if (newValue != null)
//					for (BackendType t : members.keySet())
//						if (_ts.findType(newValue).isAssignableFrom(t))
//							newValue = t.convert(newValue, members.get(t)
//									.getInstanceClass());
				((EObject) params[0]).eSet(feature, newValue);
				return params[0];
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

		public FunctionDefContext getFunctionDefContext() {
			return _fdc;
		}

		public ExpressionBase getGuard() {
			return null;
		}

		public List<? extends BackendType> getParameterTypes() {
			return (List<? extends BackendType>) Arrays.asList(this, ObjectType.INSTANCE);
		}

		public BackendType getReturnType() {
			return VoidType.INSTANCE;
		}

		public boolean isCached() {
			return false;
		}

		public void setFunctionDefContext(FunctionDefContext fdc) {
			_fdc = fdc;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_cls == null) ? 0 : _cls.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		XMLEClassType other = (XMLEClassType) obj;
		if (_cls == null) {
			if (other._cls != null)
				return false;
		} else if (!_cls.equals(other._cls))
			return false;
		return true;
	}


}
