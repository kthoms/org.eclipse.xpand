package org.eclipse.xtend.typesystem.emf.check.cache;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtend.typesystem.emf.check.CheckEValidatorAdapter;
import org.eclipse.xtend.typesystem.emf.check.CheckFileWithContext;
import org.eclipse.xtend.typesystem.emf.check.model.test.MyMetaClass;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestFactory;
import org.eclipse.xtend.typesystem.emf.check.model.test.TestPackage;

public class CachedExtensionTest extends TestCase {

	public void testCachedExtension() throws Exception {
		ClassLoader classLoader = this.getClass().getClassLoader();
		Thread.currentThread().setContextClassLoader(classLoader);
		TestPackage testPackage = TestPackage.eINSTANCE;
		CheckEValidatorAdapter validator = new CheckEValidatorAdapter(
				testPackage);
		CheckFileWithContext checkFileWithContext = new CheckFileWithContext(
				"org/eclipse/xtend/typesystem/emf/check/model/check.chk");
		checkFileWithContext
				.addImportedEPackageNsUri("http://oaw.org/test/subpackage");
		validator.addCheckFile(checkFileWithContext);
		EValidator.Registry.INSTANCE.put(testPackage, validator);

		MyMetaClass myClass = TestFactory.eINSTANCE.createMyMetaClass();
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have failed", Diagnostic.ERROR,
				diagnostic.getSeverity());
		myClass.setName("Hugo");
		diagnostic = Diagnostician.INSTANCE.validate(myClass);
		assertEquals("Validation should have succeded", Diagnostic.OK,
				diagnostic.getSeverity());
		/*
		 * problem is that the extension file needs to be reparsed
		 * (reinstantiatd) as the cache is inside the extensions. We need a new
		 * resource manager for each validation pass, as this one caches the
		 * resources and will therefore never reparse an extension file.
		 * 
		 * TODO: Implement this
		 */
	}
}
