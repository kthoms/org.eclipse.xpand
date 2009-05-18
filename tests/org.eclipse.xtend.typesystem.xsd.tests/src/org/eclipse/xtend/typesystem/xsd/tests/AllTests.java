package org.eclipse.xtend.typesystem.xsd.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.xtend.typesystem.xsd.tests.compositetypes.CompositeTypesTest;
import org.eclipse.xtend.typesystem.xsd.tests.ecorebuilder.EcoreBuilderTest;
import org.eclipse.xtend.typesystem.xsd.tests.emap.EMapTest;
import org.eclipse.xtend.typesystem.xsd.tests.extendxmlreader.XtendXMLReaderTest;
import org.eclipse.xtend.typesystem.xsd.tests.featuremap.FeatureMapTest;
import org.eclipse.xtend.typesystem.xsd.tests.loadschema.LoadSchemaByWorkflowTest;
import org.eclipse.xtend.typesystem.xsd.tests.loadschema.LoadSchemaByXMLNoNamespaceSchemalocationTest;
import org.eclipse.xtend.typesystem.xsd.tests.loadschema.LoadSchemaByXMLSchemalocationTest;
import org.eclipse.xtend.typesystem.xsd.tests.loadschema.LoadSchemaByXSDImportTest;
import org.eclipse.xtend.typesystem.xsd.tests.loadschema.LoadSchemaByXSDIncludeTest;
import org.eclipse.xtend.typesystem.xsd.tests.nsmapping.NSMappingTest;
import org.eclipse.xtend.typesystem.xsd.tests.qname.QNameTest;
import org.eclipse.xtend.typesystem.xsd.tests.reloadschemas.ReloadSchemasTest;
import org.eclipse.xtend.typesystem.xsd.tests.typemapper.TypeMapperTest;
import org.eclipse.xtend.typesystem.xsd.tests.xmlprocessor.XMLProcessorTest;
import org.eclipse.xtend.typesystem.xsd.tests.xmlreader.XMLReaderTest;
import org.eclipse.xtend.typesystem.xsd.tests.xmlwriter.XMLWriterTest;
import org.eclipse.xtend.typesystem.xsd.tests.xsdecorebuilder.XSDEcoreBuilderTest;
import org.eclipse.xtend.typesystem.xsd.tests.xsdmetamodel.XSDMetaModelTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtend.typesystem.xsd.tests");
		suite.addTestSuite(CompositeTypesTest.class);
		suite.addTestSuite(EcoreBuilderTest.class);
		suite.addTestSuite(EMapTest.class);
		suite.addTestSuite(FeatureMapTest.class);
		suite.addTestSuite(NSMappingTest.class);
		suite.addTestSuite(QNameTest.class);
		suite.addTestSuite(ReloadSchemasTest.class);
		// suite.addTestSuite(TestDemos.class);
		suite.addTestSuite(TypeMapperTest.class);
		suite.addTestSuite(XMLProcessorTest.class);
		suite.addTestSuite(XMLReaderTest.class);
		suite.addTestSuite(XMLWriterTest.class);
		suite.addTestSuite(XSDEcoreBuilderTest.class);
		suite.addTestSuite(XSDMetaModelTest.class);
		suite.addTestSuite(XtendXMLReaderTest.class);
		suite.addTestSuite(LoadSchemaByWorkflowTest.class);
		suite.addTestSuite(LoadSchemaByXMLNoNamespaceSchemalocationTest.class);
		suite.addTestSuite(LoadSchemaByXMLSchemalocationTest.class);
		suite.addTestSuite(LoadSchemaByXSDImportTest.class);
		suite.addTestSuite(LoadSchemaByXSDIncludeTest.class);

		return suite;
	}

}
