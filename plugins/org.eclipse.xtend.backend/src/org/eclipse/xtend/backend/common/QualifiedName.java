/*
Copyright (c) 2008 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.backend.common;

/**
 * 
 * @author André Arnold
 *
 */
public class QualifiedName {

	private final String _simpleName;
	
	private final String _nameSpace;
	
	public QualifiedName (String fullQualifiedName) {
		int sepPos = fullQualifiedName.lastIndexOf (SyntaxConstants.NS_DELIM);
		if (sepPos > -1) {
			_simpleName = fullQualifiedName.substring (sepPos + SyntaxConstants.NS_DELIM.length() );
			_nameSpace = fullQualifiedName.substring (0, sepPos);
		} else {
			_simpleName = fullQualifiedName;
			_nameSpace = null;
		}
	}

	public QualifiedName (String simpleName, String nameSpace) {
		super();
		_simpleName = simpleName;
		_nameSpace = nameSpace;
	}

	public String getSimpleName () {
		return _simpleName;
	}

	public String getNameSpace () {
		return _nameSpace;
	}
	
	public String getFullQualifiedName () {
		if (_nameSpace != null) 
			return _nameSpace + SyntaxConstants.NS_DELIM + _simpleName;
		else
			return _simpleName;
	}

	@Override
	public int hashCode () {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((_nameSpace == null) ? 0 : _nameSpace.hashCode());
		result = prime * result
				+ ((_simpleName == null) ? 0 : _simpleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QualifiedName other = (QualifiedName) obj;
		if (_nameSpace == null) {
			if (other._nameSpace != null)
				return false;
		} else if (!_nameSpace.equals (other._nameSpace))
			return false;
		if (_simpleName == null) {
			if (other._simpleName != null)
				return false;
		} else if (!_simpleName.equals(other._simpleName))
			return false;
		return true;
	}
	
	@Override
	public String toString () {
		return getFullQualifiedName ();
	}

}
