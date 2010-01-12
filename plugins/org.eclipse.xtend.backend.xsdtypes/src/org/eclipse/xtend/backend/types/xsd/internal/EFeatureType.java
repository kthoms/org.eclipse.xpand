package org.eclipse.xtend.backend.types.xsd.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EStructuralFeature;
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

public class EFeatureType extends AbstractType {

	public EFeatureType(final String name, XsdTypesystem ts) {
		super(name, XsdTypesystem.XSD_TYPE_PREFIX + name);
	}

	public void init () {
		initProperties ();
		initOperations ();
	}
	
	public void initProperties () {
		register (new AbstractProperty(this, String.class, "name", true, false) {
			
			public BackendType getType(BackendTypesystem ts) {
				return StringType.INSTANCE;
			}
			
			@Override
			protected Object getRaw(ExecutionContext ctx, Object o) {
				if (o == null)
					return null;
				EStructuralFeature f = (EStructuralFeature) o;
				return f.getName();
			}
		}, this);
	}

	public void initOperations () {
		register(new QualifiedName ("toString"), new AbstractFunction(null, Arrays.asList(this), StringType.INSTANCE, false) {
			
			public Object invoke(ExecutionContext ctx, Object[] params) {
				EStructuralFeature f = (EStructuralFeature) params[0];
				if (f != null)
					f.getName();
				return null;
			}
		});
	}
	
	@Override
    public boolean equals (Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        return true;
    }
}
