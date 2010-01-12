package org.eclipse.xtend.backend.types.xsd.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.functions.AbstractFunction;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.builtin.BooleanType;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.LongType;
import org.eclipse.xtend.backend.types.builtin.SetType;
import org.eclipse.xtend.backend.types.xsd.XsdTypesystem;

public class EMapType extends AbstractType {

	private EMapEntryType _elementType;

	public EMapType(final String name, XsdTypesystem ts, final EClassifier innerType) {
		super(name, XsdTypesystem.XSD_TYPE_PREFIX + name);
		_elementType = ts.getEMapEntryType(innerType);
		BackendType valueType = _elementType.getValueType();
		BackendType keyType   = _elementType.getKeyType();
		
		register (new QualifiedName ("put"), new AbstractFunction(null, Arrays.asList(this, valueType, keyType), valueType, false) {
			
			@SuppressWarnings("unchecked")
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap<Object, Object> map = (EMap<Object, Object>) params[0];
				return map.put(params[1], params[2]);
			}
		});

		register (new QualifiedName ("put"), new AbstractFunction(null, Arrays.asList(this, valueType), _elementType, false) {
			
			@SuppressWarnings("unchecked")
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap<Object, Object> map = (EMap<Object, Object>) params[0];
				Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) params[1];
				return map.put(e.getKey(), e.getValue());
			}
		});

		register (new QualifiedName ("putAll"), new AbstractFunction(null, Arrays.asList(this, keyType), valueType, false) {
			
			@SuppressWarnings("unchecked")
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap<Object, Object> map = (EMap<Object, Object>) params[0];
				for (Object o : (Collection) params[1]) {
					Map.Entry<Object, Object> e = (Map.Entry<Object, Object>) o;
					map.put(e.getKey(), e.getValue());
				}
				return null;
			}
		});

		register (new QualifiedName ("get"), new AbstractFunction(null, Arrays.asList(this, valueType), _elementType, false) {
			
			@SuppressWarnings("unchecked")
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap map = (EMap) params[0];
				return map.get(params[1]);
			}
		});
		
		register (new QualifiedName ("indexOfKey"), new AbstractFunction(null, Arrays.asList(this, keyType), LongType.INSTANCE, false) {
			
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap map = (EMap) params[0];
				return map.indexOfKey(params[1]);
			}
		});

		register (new QualifiedName ("containsKey"), new AbstractFunction(null, Arrays.asList(this, keyType), BooleanType.INSTANCE, false) {
			
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap map = (EMap) params[0];
				return map.containsKey(params[1]);
			}
		});


		register (new QualifiedName ("containsValue"), new AbstractFunction(null, Arrays.asList(this, valueType), BooleanType.INSTANCE, false) {
			
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap map = (EMap) params[0];
				return map.containsValue(params[1]);
			}
		});


		register (new QualifiedName ("removeKey"), new AbstractFunction(null, Arrays.asList(this, keyType), valueType, false) {
			
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap map = (EMap) params[0];
				return map.removeKey(params[1]);
			}
		});


		register (new QualifiedName ("keySet"), new AbstractFunction(null, Arrays.asList (this), SetType.INSTANCE, false) {
			
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap map = (EMap) params[0];
				return map.keySet();
			}
		});


		register (new QualifiedName ("values"), new AbstractFunction(null, Arrays.asList(this), CollectionType.INSTANCE, false) {
			
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EMap map = (EMap) params[0];
				return map.values();
			}
		});
	}

	public EMapEntryType getElementType() {
		return _elementType;
	}

	public static boolean isEMapObject(Object o) {
		return o instanceof EMap
		&& o instanceof EStructuralFeature.Setting
		&& isEMap(((EStructuralFeature.Setting) o)
				.getEStructuralFeature());
	}

	private static boolean isEMap(EStructuralFeature feature) {
		EClassifier t = feature.getEType();
		return feature != null && feature.eContainer() instanceof EClass
				&& t != null && t.getInstanceClass() != null
				&& Map.Entry.class.isAssignableFrom(t.getInstanceClass())
				&& feature.isMany();
	}

	@Override
	public boolean equals (Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        if (other instanceof EMapType) {
        	EMapType t = (EMapType) other;
        	/*
        	// This parameterizes the type:
        	if (!_elementType.equals (t.getElementType ()))
        			return false;
        	*/
        }
        return true;
	}

}
