/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.typemapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xtend.expression.TypeSystemImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.xsd.XMLTypeMapper;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;
import org.eclipse.xtend.typesystem.xsd.XMLTypeMapper.BasicType;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class TypeMapperTest extends AbstractTestCase {

	private List<EDataType> getAllDataTypes() {
		EPackage[] pkgs = new EPackage[] { /* EcorePackage.eINSTANCE, */
		XSDPackage.eINSTANCE, XMLTypePackage.eINSTANCE,
				XMLNamespacePackage.eINSTANCE };

		List<EDataType> cls = new ArrayList<EDataType>();
		for (EPackage pkg : pkgs)
			for (EClassifier c : pkg.getEClassifiers())
				if (c instanceof EDataType)
					cls.add((EDataType) c);
		return cls;
	}

	private Map<Class<?>, List<EDataType>> getAllInstanceTypes() {
		Map<Class<?>, List<EDataType>> insts = new HashMap<Class<?>, List<EDataType>>();
		for (EDataType d : getAllDataTypes()) {
			if (d.getInstanceClass() == null)
				System.out.println("Warning: " + d.getName()
						+ " has no instance class");
			else {
				Class<?> c = d.getInstanceClass();
				if (!c.isEnum()) {
					List<EDataType> l = insts.get(c);
					if (l == null)
						insts.put(c, l = new ArrayList<EDataType>());
					l.add(d);
				}
			}
		}
		return insts;
	}

	public void testAvailableInstanceClasses() {

		boolean printBugfixingCode = false;

		XMLTypeMapper mapper = XMLTypeMapper.instance();
		XSDMetaModel mm = new XSDMetaModel();
		TypeSystemImpl typesystem = new TypeSystemImpl();
		typesystem.registerMetaModel(new JavaBeansMetaModel());
		for (EDataType d : getAllDataTypes())
			if (!(d instanceof EEnum))
				assertNotNull("Testing " + d.getEPackage().getName() + "::"
						+ d.getName() + " instanceClass:"
						+ d.getInstanceClass(), mapper.get(mm, d, typesystem));

		if (printBugfixingCode) {
			Map<Class<?>, List<EDataType>> insts = getAllInstanceTypes();
			List<Class<?>> inst = new ArrayList<Class<?>>(insts.keySet());
			Collections.sort(inst, new Comparator<Class<?>>() {
				public int compare(Class<?> o1, Class<?> o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			for (Class<?> c : inst) {
				String name = (c.isArray()) ? "byte[]" : c.getName();
				BasicType type = mapper.getBasicTypeFromAllMaps(c);
				String typestr = (type == null) ? "" : type.name();
				List<String> dt = new ArrayList<String>();
				for (EDataType t : insts.get(c))
					dt.add(t.getEPackage().getName() + "::" + t.getName());
				System.out.println();
				System.out.println("// " + dt);
				System.out.println("jmap.put(" + name + ".class, BasicType."
						+ typestr + ");");
			}
		}
	}

}
