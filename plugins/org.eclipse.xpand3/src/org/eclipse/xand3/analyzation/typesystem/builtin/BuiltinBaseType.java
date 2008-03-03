package org.eclipse.xand3.analyzation.typesystem.builtin;

import java.util.Set;

import org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredFeature;
import org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredOperation;
import org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredProperty;
import org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredType;

public abstract class BuiltinBaseType implements DeclaredType {

    private String name;

	public BuiltinBaseType(final String name) {
    	this.name = name;
    }
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclaredType#getDeclaredFeatures()
	 */
	public Set<DeclaredFeature> getDeclaredFeatures() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredType#getDeclaredOperations()
	 */
	public Set<DeclaredOperation> getDeclaredOperations() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredType#getDeclaredProperties()
	 */
	public Set<DeclaredProperty> getDeclaredProperties() {
		return null;
	}

}
