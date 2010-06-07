package org.eclipse.xtend.backend.types.xsd.internal;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.functions.AbstractFunction;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.xsd.XsdTypesystem;

public class EMapEntryType extends AbstractType {

	private BackendType _keyType;
	private BackendType _valueType;

	public EMapEntryType (final String name, XsdTypesystem ts, EClassifier innerType) {
		super(name, XsdTypesystem.XSD_TYPE_PREFIX + name);
		determineTypes(innerType);
		Class<? extends EClassifier> innerTypeClass = null;
		if (innerTypeClass != null)
			innerType.getClass();
		else
			innerTypeClass = EClassifier.class;
		
		register (new AbstractProperty (this, innerTypeClass, "value", true, true) {

			@Override
			protected Object getRaw(ExecutionContext ctx, Object target) {
				Map.Entry ent = (Map.Entry) target;
				return ent.getValue();
			}

			public BackendType getType (BackendTypesystem ts) {
				// TODO Auto-generated method stub
				return _valueType;
			}
			
		}, _valueType);

		register (new AbstractProperty (this, innerTypeClass, "key", true, true) {

			@Override
			protected Object getRaw (ExecutionContext ctx, Object target) {
				Map.Entry ent = (Map.Entry) target;
				return ent.getKey();
			}

			public BackendType getType (BackendTypesystem ts) {
				// TODO Auto-generated method stub
				return _keyType;
			}
			
		}, _keyType);
		
		register (new QualifiedName ("setValue"), new AbstractFunction (null, Arrays.asList(this, _valueType), _valueType, false) {

			public Object invoke(ExecutionContext ctx, Object[] params) {
				Map.Entry ent = (Map.Entry) params[0];
				Object old = ent.getValue();
				ent.setValue(params[1]);
				return old;
			}
			
		});

	}

	private void determineTypes (EClassifier emfType) {
		EClass str2str = EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY;
		if (emfType != null && emfType instanceof EClass
				&& str2str.isSuperTypeOf((EClass) emfType)) {
			_keyType = StringType.INSTANCE;
			_valueType = StringType.INSTANCE;
		} else {
			_keyType = ObjectType.INSTANCE;
			_valueType = ObjectType.INSTANCE;
		}
	}

	
	public BackendType getKeyType () {
		return _keyType;
	}

	public BackendType getValueType () {
		return _valueType;
	}

	@Override
	public boolean equals (Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        if (other instanceof EMapEntryType) {
        	EMapEntryType t = (EMapEntryType) other;
        	/*
        	// This parameterizes the type:
        	if (!_keyType.equals (t.getKeyType ()))
        			return false;
        	if (!_valueType.equals (t.getValueType ()))
        			return false;
        	*/
        }
        return true;
	}

	public static boolean isEMapEntry (ETypedElement element) {
		EClassifier t = element.getEType();
		return element != null && element.eContainer() instanceof EClass
				&& t != null && t.getInstanceClass() != null
				&& Map.Entry.class.isAssignableFrom(t.getInstanceClass())
				&& !element.isMany();
	}

	public static boolean isEMapEntryObject(Object o) {
		return o instanceof Map.Entry;
	}

}
