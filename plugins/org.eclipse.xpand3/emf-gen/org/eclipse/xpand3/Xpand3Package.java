/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3Package.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.Xpand3Factory
 * @model kind="package"
 * @generated
 */
public interface Xpand3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xpand3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2t/xpand/xpand3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xpand3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xpand3Package eINSTANCE = org.eclipse.xpand3.impl.Xpand3PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.impl.SyntaxElementImpl <em>Syntax Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.impl.SyntaxElementImpl
	 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getSyntaxElement()
	 * @generated
	 */
	int SYNTAX_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ELEMENT__LINE = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ELEMENT__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ELEMENT__END = 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ELEMENT__FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Syntax Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.impl.FileImpl
	 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getFile()
	 * @generated
	 */
	int FILE = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LINE = SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__START = SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__END = SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_NAME = SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IMPORTS = SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DECLARATIONS = SYNTAX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = SYNTAX_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.impl.ImportStatementImpl
	 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__LINE = SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__START = SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__END = SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__FILE_NAME = SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Imported Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__IMPORTED_ID = SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT__EXPORTED = SYNTAX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STATEMENT_FEATURE_COUNT = SYNTAX_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.impl.IdentifierImpl
	 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__LINE = SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__START = SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__END = SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__FILE_NAME = SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.impl.SimpleIdentifierImpl <em>Simple Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.impl.SimpleIdentifierImpl
	 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getSimpleIdentifier()
	 * @generated
	 */
	int SIMPLE_IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER__LINE = IDENTIFIER__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER__START = IDENTIFIER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER__END = IDENTIFIER__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER__FILE_NAME = IDENTIFIER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER__VALUE = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IDENTIFIER_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.impl.ComposedIdentifierImpl <em>Composed Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.impl.ComposedIdentifierImpl
	 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getComposedIdentifier()
	 * @generated
	 */
	int COMPOSED_IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_IDENTIFIER__LINE = IDENTIFIER__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_IDENTIFIER__START = IDENTIFIER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_IDENTIFIER__END = IDENTIFIER__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_IDENTIFIER__FILE_NAME = IDENTIFIER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_IDENTIFIER__IDENTIFIERS = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composed Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_IDENTIFIER_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.impl.DeclaredParameterImpl
	 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getDeclaredParameter()
	 * @generated
	 */
	int DECLARED_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__LINE = SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__START = SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__END = SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__FILE_NAME = SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__NAME = SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__TYPE = SYNTAX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declared Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_FEATURE_COUNT = SYNTAX_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.SyntaxElement <em>Syntax Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax Element</em>'.
	 * @see org.eclipse.xpand3.SyntaxElement
	 * @generated
	 */
	EClass getSyntaxElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.SyntaxElement#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.xpand3.SyntaxElement#getLine()
	 * @see #getSyntaxElement()
	 * @generated
	 */
	EAttribute getSyntaxElement_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.SyntaxElement#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.eclipse.xpand3.SyntaxElement#getStart()
	 * @see #getSyntaxElement()
	 * @generated
	 */
	EAttribute getSyntaxElement_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.SyntaxElement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.eclipse.xpand3.SyntaxElement#getEnd()
	 * @see #getSyntaxElement()
	 * @generated
	 */
	EAttribute getSyntaxElement_End();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.SyntaxElement#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.xpand3.SyntaxElement#getFileName()
	 * @see #getSyntaxElement()
	 * @generated
	 */
	EAttribute getSyntaxElement_FileName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.xpand3.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.File#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.xpand3.File#getImports()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.File#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.eclipse.xpand3.File#getDeclarations()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Declarations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see org.eclipse.xpand3.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.ImportStatement#getImportedId <em>Imported Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Id</em>'.
	 * @see org.eclipse.xpand3.ImportStatement#getImportedId()
	 * @see #getImportStatement()
	 * @generated
	 */
	EReference getImportStatement_ImportedId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.ImportStatement#isExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exported</em>'.
	 * @see org.eclipse.xpand3.ImportStatement#isExported()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_Exported();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.eclipse.xpand3.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.SimpleIdentifier <em>Simple Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Identifier</em>'.
	 * @see org.eclipse.xpand3.SimpleIdentifier
	 * @generated
	 */
	EClass getSimpleIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.SimpleIdentifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.xpand3.SimpleIdentifier#getValue()
	 * @see #getSimpleIdentifier()
	 * @generated
	 */
	EAttribute getSimpleIdentifier_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.ComposedIdentifier <em>Composed Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Identifier</em>'.
	 * @see org.eclipse.xpand3.ComposedIdentifier
	 * @generated
	 */
	EClass getComposedIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.ComposedIdentifier#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifiers</em>'.
	 * @see org.eclipse.xpand3.ComposedIdentifier#getIdentifiers()
	 * @see #getComposedIdentifier()
	 * @generated
	 */
	EReference getComposedIdentifier_Identifiers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.DeclaredParameter <em>Declared Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Parameter</em>'.
	 * @see org.eclipse.xpand3.DeclaredParameter
	 * @generated
	 */
	EClass getDeclaredParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.DeclaredParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.xpand3.DeclaredParameter#getName()
	 * @see #getDeclaredParameter()
	 * @generated
	 */
	EReference getDeclaredParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.DeclaredParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xpand3.DeclaredParameter#getType()
	 * @see #getDeclaredParameter()
	 * @generated
	 */
	EReference getDeclaredParameter_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Xpand3Factory getXpand3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.impl.SyntaxElementImpl <em>Syntax Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.impl.SyntaxElementImpl
		 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getSyntaxElement()
		 * @generated
		 */
		EClass SYNTAX_ELEMENT = eINSTANCE.getSyntaxElement();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ELEMENT__LINE = eINSTANCE.getSyntaxElement_Line();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ELEMENT__START = eINSTANCE.getSyntaxElement_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ELEMENT__END = eINSTANCE.getSyntaxElement_End();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ELEMENT__FILE_NAME = eINSTANCE.getSyntaxElement_FileName();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.impl.FileImpl
		 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__IMPORTS = eINSTANCE.getFile_Imports();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__DECLARATIONS = eINSTANCE.getFile_Declarations();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.impl.ImportStatementImpl
		 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getImportStatement()
		 * @generated
		 */
		EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

		/**
		 * The meta object literal for the '<em><b>Imported Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_STATEMENT__IMPORTED_ID = eINSTANCE.getImportStatement_ImportedId();

		/**
		 * The meta object literal for the '<em><b>Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__EXPORTED = eINSTANCE.getImportStatement_Exported();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.impl.IdentifierImpl
		 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.impl.SimpleIdentifierImpl <em>Simple Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.impl.SimpleIdentifierImpl
		 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getSimpleIdentifier()
		 * @generated
		 */
		EClass SIMPLE_IDENTIFIER = eINSTANCE.getSimpleIdentifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_IDENTIFIER__VALUE = eINSTANCE.getSimpleIdentifier_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.impl.ComposedIdentifierImpl <em>Composed Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.impl.ComposedIdentifierImpl
		 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getComposedIdentifier()
		 * @generated
		 */
		EClass COMPOSED_IDENTIFIER = eINSTANCE.getComposedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_IDENTIFIER__IDENTIFIERS = eINSTANCE.getComposedIdentifier_Identifiers();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.impl.DeclaredParameterImpl
		 * @see org.eclipse.xpand3.impl.Xpand3PackageImpl#getDeclaredParameter()
		 * @generated
		 */
		EClass DECLARED_PARAMETER = eINSTANCE.getDeclaredParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PARAMETER__NAME = eINSTANCE.getDeclaredParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PARAMETER__TYPE = eINSTANCE.getDeclaredParameter_Type();

	}

} //Xpand3Package
