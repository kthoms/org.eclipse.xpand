package org.eclipse.xtend.backend.types.xsd.internal;

import java.util.Arrays;

import javax.xml.namespace.QName;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.AbstractProperty;
import org.eclipse.xtend.backend.types.AbstractType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.backend.types.xsd.XsdTypesystem;

public class QNameType extends AbstractType {

	public QNameType(String name, XsdTypesystem ts) {
		super(name, XsdTypesystem.XSD_TYPE_PREFIX + name);

		register(new AbstractProperty(this, String.class, "namespaceURI", true, false) {
			
			public BackendType getType(BackendTypesystem ts) {
				return StringType.INSTANCE;
			}
			
			@Override
			protected Object getRaw(ExecutionContext ctx, Object o) {
				if (o == null)
					return null;
				QName n = (QName) o;
				return n.getNamespaceURI();
			}
		}, this);
		
		register(new AbstractProperty(this, String.class, "localPart", true, false) {
			
			public BackendType getType(BackendTypesystem ts) {
				return StringType.INSTANCE;
			}
			
			@Override
			protected Object getRaw(ExecutionContext ctx, Object o) {
				if (o == null)
					return null;
				QName n = (QName) o;
				return n.getLocalPart();
			}
		}, this);
		
		register(new AbstractProperty(this, String.class, "prefix", true, false) {
			
			public BackendType getType(BackendTypesystem ts) {
				return StringType.INSTANCE;
			}
			
			@Override
			protected Object getRaw(ExecutionContext ctx, Object o) {
				if (o == null)
					return null;
				QName n = (QName) o;
				return n.getPrefix();
			}
		}, this);

	}

	@Override
	public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        return true;
	}

}
