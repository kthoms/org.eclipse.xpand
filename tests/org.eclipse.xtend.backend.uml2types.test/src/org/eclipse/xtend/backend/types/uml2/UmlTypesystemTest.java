package org.eclipse.xtend.backend.types.uml2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.emf.EObjectType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.backend.types.emf.internal.EClassType;
import org.eclipse.xtend.backend.types.uml2.internal.EnumType;
import org.eclipse.xtend.backend.types.uml2.internal.StereotypeType;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.typesystem.uml2.Setup;
import org.eclipse.xtend.typesystem.uml2.UML2Util2;
import org.eclipse.xtend.typesystem.uml2.profile.ProfileMetaModel;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class UmlTypesystemTest {
	private Collection<Profile> _profiles = new ArrayList<Profile> ();
	private Profile _simpleEntityProfile;

	@Before
	public void setup () {
		new Setup().setStandardUML2Setup(true);
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
		org.eclipse.uml2.uml.Class entity = createSimpleEntity (p, "TestEntity", false);

		MiddleEnd me = MiddleEndFactory.create (cts, null);
		FunctionDefContextInternal fdc = (FunctionDefContextInternal) me.createEmptyFdc ();
		
		ExecutionContext ctx = me.getExecutionContext ();
		
		BackendType entityType = cts.findType (entity);
		assertTrue (entityType instanceof StereotypeType);
		assertEquals ("simpleEntity::SimpleEntity", entityType.getName ());

		EList attr = entity.getOwnedAttributes ();
		org.eclipse.uml2.uml.Property aField = (org.eclipse.uml2.uml.Property) attr.get (0);
		BackendType fieldType = cts.findType (aField);
		assertTrue (fieldType instanceof StereotypeType);
		assertEquals ("simpleEntity::Field", fieldType.getName ());
		
		org.eclipse.xtend.backend.common.Property stp = (org.eclipse.xtend.backend.common.Property)entityType.getProperties (ctx). get("idGenerator");
		BackendType stpType = stp.getType (cts);
		assertTrue (stpType instanceof EClassType);
		assertEquals("uml::Enumeration", stpType.getName());
		
		BackendType fieldSuperType = fieldType.getSuperTypes ().iterator ().next ();
		assertTrue (fieldSuperType instanceof EClassType);
		assertEquals ("uml::Property", fieldSuperType.getName ());

		boolean hasStructuralFeatureSuperType = false;
		boolean hasConnectableElementSuperType = false;
		boolean hasDeploymentTargetSuperType = false;
		
		for (BackendType fieldSuperSuperType : fieldSuperType.getSuperTypes ()) {
			if (fieldSuperSuperType.getName ().equals ("uml::StructuralFeature")) {
				assertTrue (fieldSuperSuperType instanceof EClassType);
				hasStructuralFeatureSuperType = true;
			}
			if (fieldSuperSuperType.getName ().equals ("uml::ConnectableElement")) {
				assertTrue (fieldSuperSuperType instanceof EClassType);
				hasConnectableElementSuperType = true;
			}
			if (fieldSuperSuperType.getName ().equals ("uml::DeploymentTarget")) {
				assertTrue (fieldSuperSuperType instanceof EClassType);
				hasDeploymentTargetSuperType = true;
			}
			if (fieldSuperSuperType.getName ().equals ("emf::EObject"))
				assertTrue (fieldSuperSuperType instanceof EObjectType);
		}
		assertTrue (hasStructuralFeatureSuperType);
		assertTrue (hasConnectableElementSuperType);
		assertTrue (hasDeploymentTargetSuperType);
	}
	
	public void testFindForModel () {
		CompositeTypesystem cts = new CompositeTypesystem ();
		cts.register (new EmfTypesystem ());
		cts.register (new UmlTypesystem (_profiles, false));

		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		ctx.set("MODEL_SLOT", "world");
		Issues issues = new IssuesImpl();
//		StandaloneSetup setup = new StandaloneSetup ();
		
		Setup umlSetup = new Setup();
		umlSetup.setStandardUML2Setup (true);
		
		
		ResourceSet rs = new ResourceSetImpl();
		Object o = Reader.load (rs, "model/umlSample.uml", true);
		ProfileMetaModel profMM = new ProfileMetaModel ();
		profMM.addProfile ("model/simpleEntity.profile.uml");
		Model m = (Model)o;
		org.eclipse.uml2.uml.Package pkg = (org.eclipse.uml2.uml.Package) m.getPackagedElement ("test");
		Object c = m.getPackagedElement ("TestEntity");
		BackendType custType = cts.findType (c);
		assertTrue (custType instanceof StereotypeType);
	}
		
	/**
	 * Check whether Enumerations are correctly resolved. Enumerations defined
	 * in a Profile should resolve to EnumType while Enumerations defined in a
	 * UML model should resolve to an EClassType.
	 */
	@Test
	public void testFindEnumType () {
		CompositeTypesystem cts = new CompositeTypesystem ();
		cts.register (new EmfTypesystem ());
		cts.register (new UmlTypesystem (_profiles, false));

		Model m = createModel ("testModel");
		org.eclipse.uml2.uml.Package p = createPackage (m, "test");
		org.eclipse.uml2.uml.Property attr = createSimpleEntityWithEnum (p,
				"TestEntity", false);

		org.eclipse.uml2.uml.Enumeration testEnum = createEnumeration (p,
				"MyTestEnum", Arrays.asList ("FIRST", "SECOND"));
		// This will be cached by the CompositeTypesystem
		BackendType enumClassType = cts.findType (testEnum);
		assertTrue (enumClassType instanceof EClassType);
		assertEquals ("uml::Enumeration", enumClassType.getName ());

		// Even though CompositeTypesystem cached the BackendType for the
		// Enumeration this must now resolve to an EnumType
		BackendType enumType = cts.findType (attr.getType ());

		assertTrue (enumType instanceof EnumType);
		assertEquals ("simpleEntity::GeneratorKind", enumType.getName ());
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
	

	@SuppressWarnings("unchecked")
	@Test
	public void testClassOperations () {
		CompositeTypesystem cts = new CompositeTypesystem ();
		cts.register (new EmfTypesystem ());
		cts.register (new UmlTypesystem (_profiles, false));

		Model m = createModel ("testModel");
		org.eclipse.uml2.uml.Package pkg = createPackage (m, "test");
		org.eclipse.uml2.uml.Class c = createClass (pkg, "TestClass", false);
		BackendType pkgType = cts.findType (pkg);
		BackendType elemType = cts.findType (UmlTypesystem.UNIQUE_REPRESENTATION_PREFIX + "uml::Element");

		MiddleEnd me = MiddleEndFactory.create (cts, null);
		FunctionDefContextInternal fdc = (FunctionDefContextInternal) me.createEmptyFdc ();
		
		ExecutionContext ctx = me.getExecutionContext ();
		List<BackendType> pTypes = new ArrayList<BackendType> ();
		pTypes.add (pkgType);
		Function f = fdc.getMatch (ctx, new QualifiedName("allOwnedElements"), pTypes);
		assertTrue (f != null);
		assertTrue (f.getReturnType ().isAssignableFrom (ListType.INSTANCE));
		Function f2 = fdc.getMatch (ctx, new QualifiedName("getModel"), pTypes);
		assertTrue (f2 != null);
		assertTrue (f2.getReturnType ().isAssignableFrom (cts.findType (m)));
		
		
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
		EList<Package> pkgs = package_.getModel ().getImportedPackages ();
		PrimitiveType stringType = (PrimitiveType) package_.createOwnedPrimitiveType("string");
		org.eclipse.uml2.uml.Property field = class_.createOwnedAttribute ("someField", stringType);
		field.applyStereotype (_simpleEntityProfile.getOwnedStereotype ("Field"));
		return class_;
	}
	
	private org.eclipse.uml2.uml.Property createSimpleEntityWithEnum (Package package_,
			String name, boolean isAbstract) {
		org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass (name,
				isAbstract);
		Stereotype st = _simpleEntityProfile.getOwnedStereotype ("SimpleEntity");
		class_.applyStereotype (st);
		org.eclipse.uml2.uml.Property attr = st.getAttribute ("idGenerator", st.getProfile ().getOwnedType ("simpleEntity::GeneratorKind"));
		return attr;
	}
	
	private org.eclipse.uml2.uml.Enumeration createEnumeration (Package pkg, String name, List<String> literals) {
		org.eclipse.uml2.uml.Enumeration e = pkg.createOwnedEnumeration (name);
		for (String l : literals) {
			e.createOwnedLiteral (l);
		}
		return e;
	}

}
