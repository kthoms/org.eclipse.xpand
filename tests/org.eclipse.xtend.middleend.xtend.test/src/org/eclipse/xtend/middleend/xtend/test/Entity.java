/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.xtend.test;

import java.util.ArrayList;
import java.util.List;

public class Entity {
	
	private String _name;
	private List<Field> _fields = new ArrayList<Field> ();

	public String getName () {
		return _name;
	}

	public void setName (String name) {
		_name = name;
	}
	
	public List<Field> getFields () {
		return _fields;
	}

	public void setFields (List<Field> fields) {
		_fields = fields;
	}

	public void addField (Field field) {
		_fields.add (field);
	}
}
