package org.eclipse.xtend.shared.ui.core.internal;

public class ResourceID {
	public final String name;
	public final String extension;
	public ResourceID(final String name, final String extension) {
		assert name!=null;
		assert extension !=null;
		this.name = name;
		this.extension = extension;
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj!=null && obj instanceof ResourceID) {
			ResourceID id = (ResourceID) obj;
			return name.equals(id.name) && extension.equals(id.extension);
		}
		return false;
	}
	@Override
	public String toString() {
		return name+"."+extension;
	}

	public String toFileName() {
		return name.replace("::", "/")+"."+extension;
	}
}
