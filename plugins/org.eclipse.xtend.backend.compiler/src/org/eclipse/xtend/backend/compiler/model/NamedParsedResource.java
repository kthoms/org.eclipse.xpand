package org.eclipse.xtend.backend.compiler.model;

import org.eclipse.xtend.middleend.plugins.ParsedResource;

public class NamedParsedResource {
	
	private String _name;
	
	private ParsedResource _resource;
	
	
	public NamedParsedResource(String name, ParsedResource resource) {
		super();
		_name = name;
		_resource = resource;
	}

	/**
	 * @return the _name
	 */
	public String getName() {
		return _name;
	}

	/**
	 * @return the _resource
	 */
	public ParsedResource getResource() {
		return _resource;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NamedParsedResource other = (NamedParsedResource) obj;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		return true;
	}
	

}
