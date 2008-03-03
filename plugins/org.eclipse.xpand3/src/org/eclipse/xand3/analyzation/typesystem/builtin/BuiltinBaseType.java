package org.eclipse.xand3.analyzation.typesystem.builtin;

import org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredFeature;
import org.eclipse.xand3.analyzation.typesystem.declaration.DeclaredType;

public abstract class BuiltinBaseType implements DeclaredType {

    private String name;

	public BuiltinBaseType(final String name) {
    	this.name = name;
    }
	
	/* (non-Javadoc)
	 * @see org.eclipse.xand3.analyzation.typesystem.DeclaredType#getDeclaredFeatures()
	 */
	public DeclaredFeature[] getDeclaredFeatures() {
		return null;
	}

}
