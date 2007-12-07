package org.eclipse.xtend.shared.ui.test.xpand2.core;

import org.eclipse.core.runtime.IPath;

@SuppressWarnings("unused")
public class OawProjectTest extends XpandCoreTestBase {
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
	}

	// An example meta model which we will extract in our project and use in our templates
	// It has one type "MetaType" with attribute "name:String"
	private final String ECORE_MMODEL = "<?xml version=\"1.0\" encoding=\"ASCII\"?>"
			+ "<ecore:EPackage xmi:version=\"2.0\" "
			+ "xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
			+ "xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" name=\"mm\" "
			+ "nsURI=\"http://www.openarchitectureware.org/mm/test/mm\" nsPrefix=\"mm\">"
			+ "<eClassifiers xsi:type=\"ecore:EClass\" name=\"MetaType\">"
			+ "<eStructuralFeatures xsi:type=\"ecore:EAttribute\" name=\"name\" eType=\"ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString\"/>"
			+ "</eClassifiers>" + "</ecore:EPackage>";

	/**
	 * This test case checks if caches inside the OawPluginProject reflect the current file structure
	 * correctly. This is done by removing a necessary file from the project to compile. If the project
	 * still compiles after removing the file, there is most likely a cache inside the OawPlugin class
	 * still holding the now removed resource 
	 * @throws Exception
	 */
	public void testOawPluginResourceCache() throws Exception {
		// Create workspace, Template which uses mm.ecore and Template2 which uses Template
		env.openEmptyWorkspace();
		final IPath pPath = env.addProject("test-"+System.currentTimeMillis());
		env.addExternalJars(pPath, env.getJavaClassLibs());
		env.removePackageFragmentRoot(pPath, "");
		final IPath root = env.addPackageFragmentRoot(pPath, "templates");
		final IPath pack = env.addPackage(pPath, "templates");

		env.addFile(pack, "mm.ecore", ECORE_MMODEL);

		IPath tpl = env.addFile(pack, "Template.xpt", tag("IMPORT mm") + "\n"
				+ tag("DEFINE Root FOR MetaType") + "\n" + tag("ENDDEFINE"));
		IPath tpl2 = env.addFile(pack, "Template2.xpt", tag("IMPORT mm") + "\n"
				+ tag("DEFINE Root FOR MetaType") + "\n"
				+ tag("EXPAND Template::Root FOR this") + tag("ENDDEFINE"));
		env.fullBuild();
		assertNoErrorMarkers(tpl);
		assertNoErrorMarkers(tpl2);

		// Now delete Template making Template2 point to an ivalid
		// file. Expected result: Template2 has errors
		env.removeFile(tpl);
		env.fullBuild();
		assertTrue("There should be an error now, that template 1 is missing!",
				env.getMarkersFor(tpl2).length > 0);
	}

	/**
	 * This test case tests the OawModelManager by creating a working plugin named test with template 
	 * and metamodel. The whole project is removed afterwards. Now, a project is created called test again.
	 * oAW should notice this new "test" project as completly now project having nothing to do with the former
	 * "test" project. We try to see if it works by accessing a file in a template in the new test which only
	 * existed in the old test. However, the test and its current strategy only work if there is a state 
	 * in OawPlugin class like a cache holding old resources. However, if there was no state in OawPlugin
	 * then it would be ok to resuse the same class again...
	 * @throws Exception
	 */
	public void testOawPluginCacheWithRecreatedProject() throws Exception {
		env.openEmptyWorkspace();
		final IPath pPath = env.addProject("test-"+System.currentTimeMillis());
		env.addExternalJars(pPath, env.getJavaClassLibs());
		env.removePackageFragmentRoot(pPath, "");
		final IPath root = env.addPackageFragmentRoot(pPath, "templates");
		final IPath pack = env.addPackage(pPath, "templates");

		final IPath mmFolder = env.addFolder(root, "models");
		env.addFile(mmFolder, "mm.ecore", ECORE_MMODEL);

		IPath tpl = env.addFile(pack, "Template.xpt", tag("IMPORT mm") + "\n"
				+ tag("DEFINE Root FOR MetaType") + "\n" + tag("ENDDEFINE"));
		env.fullBuild();
		assertNoErrorMarkers(tpl);
		env.removeProject(pPath);

		env.openEmptyWorkspace();
		final IPath pPath2 = env.addProject("test");
		env.addExternalJars(pPath2, env.getJavaClassLibs());
		env.removePackageFragmentRoot(pPath2, "");
		final IPath root2 = env.addPackageFragmentRoot(pPath2, "templates");
		final IPath pack2 = env.addPackage(pPath2, "templates");

		final IPath mmFolder2 = env.addFolder(pPath2, "models");
		env.addFile(mmFolder2, "mm.ecore", ECORE_MMODEL);

		IPath tpl2 = env.addFile(pack2, "Template2.xpt", tag("IMPORT mm")
				+ "\n" + tag("DEFINE Root FOR MetaType") + "\n"
				+ tag("EXPAND Template::Root FOR this") + tag("ENDDEFINE"));
		env.fullBuild();
		assertTrue(
				"There should be an error now, that template 1 is absolutely unknown!",
				env.getMarkersFor(tpl2).length > 0);
	}
}
