package org.eclipse.xtend.backend.types.xsd.internal;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.xsd.XsdTypesystem;

public class EFeatureMapEntryType extends AbstractType {

	public EFeatureMapEntryType (final String name, XsdTypesystem ts) {
		super (name, XsdTypesystem.XSD_TYPE_PREFIX + name);
		
		register(new AbstractProperty (this, Object.class, "value", true, false) {

			@Override
			protected Object getRaw (ExecutionContext ctx, Object o) {
				if (o == null)
					return null;
				FeatureMap.Entry e = (FeatureMap.Entry)o;
				return e.getValue ();
			}

			public BackendType getType (BackendTypesystem ts) {
				FeatureMap.Entry e = (FeatureMap.Entry)_owner;
				return ts.findType (e.getEStructuralFeature ().getEType());
			}
			
		}, this);
		
		register (new AbstractProperty(this, EStructuralFeature.class, "feature", true, false) {
			
			public BackendType getType(BackendTypesystem ts) {
				return ts.findType (EStructuralFeature.class);
			}
			
			@Override
			protected Object getRaw(ExecutionContext ctx, Object o) {
				if (o == null)
					return null;
				FeatureMap.Entry e = (FeatureMap.Entry)o;
				return e.getEStructuralFeature();
			}
		}, this);
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
