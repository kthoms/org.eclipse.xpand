package org.eclipse.xtend.backend.types.uml2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.backend.types.emf.internal.EClassType;
import org.eclipse.xtend.backend.types.uml2.internal.EnumType;
import org.eclipse.xtend.backend.types.uml2.internal.StereotypeType;
import org.eclipse.xtend.typesystem.uml2.UML2Util2;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class UmlTypesystemTest {

	private Collection<Profile> _profiles = new ArrayList<Profile> ();
	private Profile _simpleEntityProfile;

	@Before
	public void setup () {
		Profile p = UML2Util2.loadProfile ("model/simpleEntity.profile.uml");
		p.define ();
		_profiles.add (p);
		_simpleEntityProfile = p;
	}

	@Test
	public void testFindForClassObject () {
		CompositeTypesystem cts = new CompositeTypesystem ();
		cts.register (new EmfTypesystem ());
		cts.register (new UmlTypesystem (_profiles, false));

		Model m = createModel ("testModel");
		org.eclipse.uml2.uml.Package pkg = createPackage (m, "test");
		org.eclipse.uml2.uml.Class c = createClass (pkg, "TestClass", false);
		BackendType type = cts.findType (c);
		assertTrue (type instanceof EClassType);
		assertEquals ("uml::Class", type.getName ());
	}

	@Test 
	public void testFindForEnumerationObject () {
		CompositeTypesystem cts = new CompositeTypesystem ();
		cts.register (new EmfTypesystem ());
		cts.register (new UmlTypesystem (_profiles, false));
		
		Model m = createModel ("testModel");
		org.eclipse.uml2.uml.Package pkg = createPackage (m, "test");
		org.eclipse.uml2.uml.Enumeration testEnum = createEnumeration (pkg, "MyTestEnum", Arrays.asList ("FIRST", "SECOND"));
		BackendType enumType = cts.findType (testEnum);
		assertTrue (enumType instanceof EClassType);
		assertEquals ("uml::Enumeration", enumType.getName ());
	}
	
	@Test 
	public void testFindForStereotypeObject () {
		CompositeTypesystem cts = new CompositeTypesystem ();
		cts.register (new EmfTypesystem ());
		cts.register (new UmlTypesystem (_profiles, false));

		Model m = createModel ("testModel");
		org.eclipse.uml2.uml.Package p = createPackage (m, "test");
		BackendType entityType = cts.findType (createSimpleEntity (p, "TestEntity", false));
		assertTrue (entityType instanceof StereotypeType);
		assertEquals ("simpleEntity::SimpleEntity", entityType.getName ());
	}
	
	@Test
	public void testFindByName () {
		CompositeTypesystem cts = new CompositeTypesystem ();
		cts.register (new UmlTypesystem (_profiles, false));
		cts.register (new EmfTypesystem ());

		BackendType type = cts.findType (UmlTypesystem.UNIQUE_REPRESENTATION_PREFIX + "uml::Class");
		assertTrue (type instanceof EClassType);
		assertEquals ("uml::Class", type.getName ());

		BackendType entityType = cts.findType (UmlTypesystem.UNIQUE_REPRESENTATION_PREFIX + "simpleEntity::SimpleEntity");
		assertTrue (entityType instanceof StereotypeType);
		assertEquals ("simpleEntity::SimpleEntity", entityType.getName ());
	}

	private Model createModel (String name) {
		Model model = UMLFactory.eINSTANCE.createModel ();
		model.setName (name);
		return model;
	}

	private org.eclipse.uml2.uml.Package createPackage (Package nestingPackage,
			String name) {
		org.eclipse.uml2.uml.Package package_ = nestingPackage.createNestedPackage (name);
		package_.applyProfile (_simpleEntityProfile);
		return package_;
	}

	private org.eclipse.uml2.uml.Class createClass (Package package_,
			String name, boolean isAbstract) {
		org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass (name,
				isAbstract);
		return class_;
	}
	
	private org.eclipse.uml2.uml.Class createSimpleEntity (Package package_,
			String name, boolean isAbstract) {
		org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass (name,
				isAbstract);
		Stereotype st = _simpleEntityProfile.getOwnedStereotype ("SimpleEntity");
		class_.applyStereotype (st);
		return class_;
	}
	
	private org.eclipse.uml2.uml.Enumeration createEnumeration (Package pkg, String name, List<String> literals) {
		org.eclipse.uml2.uml.Enumeration e = pkg.createOwnedEnumeration (name);
		for (String l : literals) {
			e.createOwnedLiteral (l);
		}
		return e;
	}

}
