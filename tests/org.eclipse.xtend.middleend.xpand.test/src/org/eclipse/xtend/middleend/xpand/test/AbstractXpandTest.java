/*
Copyright (c) 2008 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.xpand.test;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.xpand.XpandBackendFacade;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;
import org.junit.Before;

/**
 * 
 * @author André Arnold
 *
 */
public class AbstractXpandTest {

	protected List<MetaModel> _mms;
	protected CompositeTypesystem _ts;
	protected XpandBackendFacade _bc;
	protected Person _person;
	protected Person _testPerson2;
	protected Person _otherPerson;

	@Before
	public void setUp() throws Exception {
		_mms = new ArrayList<MetaModel> ();
	    _mms.add (new JavaBeansMetaModel ());
		_ts = new CompositeTypesystem ();
		_person = new Person();
	    _person.setFirstName("Tester");
	    _person.setName("Testerossa");
	    _testPerson2 = new Person();
		_otherPerson = new Person();
		_otherPerson.setFirstName("Alice");
		_otherPerson.setName("Dowell");
	}

}
