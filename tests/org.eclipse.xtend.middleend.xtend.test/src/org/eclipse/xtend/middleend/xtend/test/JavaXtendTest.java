/*
Copyright (c) 2008 André Arnold.
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

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.LanguageContributor;
import org.eclipse.xtend.middleend.xpand.plugin.OldXpandRegistryFactory;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.eclipse.xtend.middleend.xtend.plugin.OldCheckRegistryFactory;
import org.eclipse.xtend.middleend.xtend.plugin.OldXtendRegistryFactory;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;
import org.junit.Before;

public abstract class JavaXtendTest {
	
	protected List<MetaModel> _mms;
	protected CompositeTypesystem _ts;
	protected XtendBackendFacade _bc;
	protected ExecutionContext _ctx;

	protected Person _person;
	protected Person _testPerson2;
	protected Person _otherPerson;
	protected Person _yetAnotherPerson;
	protected Employee _employee;
	
	@Before
	public void setUp() throws Exception {
		LanguageContributor.INSTANCE.addLanguageContribution (OldXtendRegistryFactory.class);
		LanguageContributor.INSTANCE.addLanguageContribution (OldCheckRegistryFactory.class);
		LanguageContributor.INSTANCE.addLanguageContribution (OldXpandRegistryFactory.class);
		_mms = new ArrayList<MetaModel> ();
        _mms.add (new JavaBeansMetaModel ());
		_ts = new CompositeTypesystem ();
		_person = new Person();
		_employee = new Employee();
        _person.setFirstName("Tester");
        _person.setName("Testerossa");
        _employee.setFirstName("John");
        _employee.setName("Doe");
        _employee.setCompany("TestCompany");
        _testPerson2 = new Person();
		_otherPerson = new Person();
		_otherPerson.setFirstName("Alice");
		_otherPerson.setName("Dowell");
		_yetAnotherPerson = new Person();
		_yetAnotherPerson.setFirstName("Josh");
		_yetAnotherPerson.setName("Dowell");
	}

}
