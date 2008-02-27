/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationPackage.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xpand3.Xpand3Package;

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
 * @see org.eclipse.xpand3.declaration.DeclarationFactory
 * @model kind="package"
 * @generated
 */
public interface DeclarationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declaration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2t/xpand/xpand3/declararation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declaration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationPackage eINSTANCE = org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAbstractDeclaration()
	 * @generated
	 */
	int ABSTRACT_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__LINE = Xpand3Package.SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__START = Xpand3Package.SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__END = Xpand3Package.SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__FILE_NAME = Xpand3Package.SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__OWNER = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__PARAMS = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__IS_PRIVATE = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION__GUARD = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION_FEATURE_COUNT = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.AbstractNamedDeclarationImpl <em>Abstract Named Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.AbstractNamedDeclarationImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAbstractNamedDeclaration()
	 * @generated
	 */
	int ABSTRACT_NAMED_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__LINE = ABSTRACT_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__START = ABSTRACT_DECLARATION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__END = ABSTRACT_DECLARATION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__FILE_NAME = ABSTRACT_DECLARATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__OWNER = ABSTRACT_DECLARATION__OWNER;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__PARAMS = ABSTRACT_DECLARATION__PARAMS;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__IS_PRIVATE = ABSTRACT_DECLARATION__IS_PRIVATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__GUARD = ABSTRACT_DECLARATION__GUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION__NAME = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Named Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.DefinitionImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LINE = ABSTRACT_NAMED_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__START = ABSTRACT_NAMED_DECLARATION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__END = ABSTRACT_NAMED_DECLARATION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__FILE_NAME = ABSTRACT_NAMED_DECLARATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__OWNER = ABSTRACT_NAMED_DECLARATION__OWNER;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__PARAMS = ABSTRACT_NAMED_DECLARATION__PARAMS;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IS_PRIVATE = ABSTRACT_NAMED_DECLARATION__IS_PRIVATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__GUARD = ABSTRACT_NAMED_DECLARATION__GUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = ABSTRACT_NAMED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__BODY = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.AdviceImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__LINE = ABSTRACT_NAMED_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__START = ABSTRACT_NAMED_DECLARATION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__END = ABSTRACT_NAMED_DECLARATION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__FILE_NAME = ABSTRACT_NAMED_DECLARATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__OWNER = ABSTRACT_NAMED_DECLARATION__OWNER;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__PARAMS = ABSTRACT_NAMED_DECLARATION__PARAMS;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__IS_PRIVATE = ABSTRACT_NAMED_DECLARATION__IS_PRIVATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__GUARD = ABSTRACT_NAMED_DECLARATION__GUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__NAME = ABSTRACT_NAMED_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.ExtensionImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__LINE = ABSTRACT_NAMED_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__START = ABSTRACT_NAMED_DECLARATION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__END = ABSTRACT_NAMED_DECLARATION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__FILE_NAME = ABSTRACT_NAMED_DECLARATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNER = ABSTRACT_NAMED_DECLARATION__OWNER;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__PARAMS = ABSTRACT_NAMED_DECLARATION__PARAMS;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IS_PRIVATE = ABSTRACT_NAMED_DECLARATION__IS_PRIVATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__GUARD = ABSTRACT_NAMED_DECLARATION__GUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = ABSTRACT_NAMED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__CACHED = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.AbstractAspectImpl <em>Abstract Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.AbstractAspectImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAbstractAspect()
	 * @generated
	 */
	int ABSTRACT_ASPECT = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT__LINE = Xpand3Package.SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT__START = Xpand3Package.SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT__END = Xpand3Package.SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT__FILE_NAME = Xpand3Package.SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT__POINTCUT = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT__PARAMS = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wildparams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT__WILDPARAMS = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASPECT_FEATURE_COUNT = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.ExtensionAspectImpl <em>Extension Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.ExtensionAspectImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getExtensionAspect()
	 * @generated
	 */
	int EXTENSION_ASPECT = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__LINE = ABSTRACT_ASPECT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__START = ABSTRACT_ASPECT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__END = ABSTRACT_ASPECT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__FILE_NAME = ABSTRACT_ASPECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__POINTCUT = ABSTRACT_ASPECT__POINTCUT;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__PARAMS = ABSTRACT_ASPECT__PARAMS;

	/**
	 * The feature id for the '<em><b>Wildparams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__WILDPARAMS = ABSTRACT_ASPECT__WILDPARAMS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT__EXPRESSION = ABSTRACT_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extension Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ASPECT_FEATURE_COUNT = ABSTRACT_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.DefinitionAspectImpl <em>Definition Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.DefinitionAspectImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getDefinitionAspect()
	 * @generated
	 */
	int DEFINITION_ASPECT = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__LINE = ABSTRACT_ASPECT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__START = ABSTRACT_ASPECT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__END = ABSTRACT_ASPECT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__FILE_NAME = ABSTRACT_ASPECT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__POINTCUT = ABSTRACT_ASPECT__POINTCUT;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__PARAMS = ABSTRACT_ASPECT__PARAMS;

	/**
	 * The feature id for the '<em><b>Wildparams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__WILDPARAMS = ABSTRACT_ASPECT__WILDPARAMS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT__BODY = ABSTRACT_ASPECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ASPECT_FEATURE_COUNT = ABSTRACT_ASPECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.CheckImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__LINE = ABSTRACT_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__START = ABSTRACT_DECLARATION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__END = ABSTRACT_DECLARATION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__FILE_NAME = ABSTRACT_DECLARATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__OWNER = ABSTRACT_DECLARATION__OWNER;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__PARAMS = ABSTRACT_DECLARATION__PARAMS;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__IS_PRIVATE = ABSTRACT_DECLARATION__IS_PRIVATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__GUARD = ABSTRACT_DECLARATION__GUARD;

	/**
	 * The feature id for the '<em><b>Error Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__ERROR_SEVERITY = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__MSG = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CONSTRAINT = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__FEATURE = ABSTRACT_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.CreateExtensionStatementImpl <em>Create Extension Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.CreateExtensionStatementImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getCreateExtensionStatement()
	 * @generated
	 */
	int CREATE_EXTENSION_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__LINE = EXTENSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__START = EXTENSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__END = EXTENSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__FILE_NAME = EXTENSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__OWNER = EXTENSION__OWNER;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__PARAMS = EXTENSION__PARAMS;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__IS_PRIVATE = EXTENSION__IS_PRIVATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__GUARD = EXTENSION__GUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__CACHED = EXTENSION__CACHED;

	/**
	 * The feature id for the '<em><b>To Be Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT__TO_BE_CREATED = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Extension Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_STATEMENT_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.declaration.impl.JavaExtensionStatementImpl <em>Java Extension Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.declaration.impl.JavaExtensionStatementImpl
	 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getJavaExtensionStatement()
	 * @generated
	 */
	int JAVA_EXTENSION_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__LINE = ABSTRACT_NAMED_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__START = ABSTRACT_NAMED_DECLARATION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__END = ABSTRACT_NAMED_DECLARATION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__FILE_NAME = ABSTRACT_NAMED_DECLARATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__OWNER = ABSTRACT_NAMED_DECLARATION__OWNER;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__PARAMS = ABSTRACT_NAMED_DECLARATION__PARAMS;

	/**
	 * The feature id for the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__IS_PRIVATE = ABSTRACT_NAMED_DECLARATION__IS_PRIVATE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__GUARD = ABSTRACT_NAMED_DECLARATION__GUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__NAME = ABSTRACT_NAMED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Java Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__JAVA_TYPE = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__JAVA_METHOD = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java Param Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Extension Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXTENSION_STATEMENT_FEATURE_COUNT = ABSTRACT_NAMED_DECLARATION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.AbstractDeclaration <em>Abstract Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Declaration</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractDeclaration
	 * @generated
	 */
	EClass getAbstractDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractDeclaration#getOwner()
	 * @see #getAbstractDeclaration()
	 * @generated
	 */
	EReference getAbstractDeclaration_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractDeclaration#getParams()
	 * @see #getAbstractDeclaration()
	 * @generated
	 */
	EReference getAbstractDeclaration_Params();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.declaration.AbstractDeclaration#isIsPrivate <em>Is Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Private</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractDeclaration#isIsPrivate()
	 * @see #getAbstractDeclaration()
	 * @generated
	 */
	EAttribute getAbstractDeclaration_IsPrivate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractDeclaration#getGuard()
	 * @see #getAbstractDeclaration()
	 * @generated
	 */
	EReference getAbstractDeclaration_Guard();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.AbstractNamedDeclaration <em>Abstract Named Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Declaration</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractNamedDeclaration
	 * @generated
	 */
	EClass getAbstractNamedDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.AbstractNamedDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractNamedDeclaration#getName()
	 * @see #getAbstractNamedDeclaration()
	 * @generated
	 */
	EReference getAbstractNamedDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.xpand3.declaration.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.declaration.Definition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.eclipse.xpand3.declaration.Definition#getBody()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see org.eclipse.xpand3.declaration.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.xpand3.declaration.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.declaration.Extension#isCached <em>Cached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached</em>'.
	 * @see org.eclipse.xpand3.declaration.Extension#isCached()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Cached();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.AbstractAspect <em>Abstract Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Aspect</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractAspect
	 * @generated
	 */
	EClass getAbstractAspect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.AbstractAspect#getPointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointcut</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractAspect#getPointcut()
	 * @see #getAbstractAspect()
	 * @generated
	 */
	EReference getAbstractAspect_Pointcut();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.declaration.AbstractAspect#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractAspect#getParams()
	 * @see #getAbstractAspect()
	 * @generated
	 */
	EReference getAbstractAspect_Params();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.declaration.AbstractAspect#isWildparams <em>Wildparams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wildparams</em>'.
	 * @see org.eclipse.xpand3.declaration.AbstractAspect#isWildparams()
	 * @see #getAbstractAspect()
	 * @generated
	 */
	EAttribute getAbstractAspect_Wildparams();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.ExtensionAspect <em>Extension Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Aspect</em>'.
	 * @see org.eclipse.xpand3.declaration.ExtensionAspect
	 * @generated
	 */
	EClass getExtensionAspect();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.ExtensionAspect#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.xpand3.declaration.ExtensionAspect#getExpression()
	 * @see #getExtensionAspect()
	 * @generated
	 */
	EReference getExtensionAspect_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.DefinitionAspect <em>Definition Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Aspect</em>'.
	 * @see org.eclipse.xpand3.declaration.DefinitionAspect
	 * @generated
	 */
	EClass getDefinitionAspect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.declaration.DefinitionAspect#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.eclipse.xpand3.declaration.DefinitionAspect#getBody()
	 * @see #getDefinitionAspect()
	 * @generated
	 */
	EReference getDefinitionAspect_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see org.eclipse.xpand3.declaration.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.declaration.Check#isErrorSeverity <em>Error Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Severity</em>'.
	 * @see org.eclipse.xpand3.declaration.Check#isErrorSeverity()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_ErrorSeverity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.Check#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Msg</em>'.
	 * @see org.eclipse.xpand3.declaration.Check#getMsg()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_Msg();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.Check#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.eclipse.xpand3.declaration.Check#getConstraint()
	 * @see #getCheck()
	 * @generated
	 */
	EReference getCheck_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.declaration.Check#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see org.eclipse.xpand3.declaration.Check#getFeature()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.CreateExtensionStatement <em>Create Extension Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Extension Statement</em>'.
	 * @see org.eclipse.xpand3.declaration.CreateExtensionStatement
	 * @generated
	 */
	EClass getCreateExtensionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.CreateExtensionStatement#getToBeCreated <em>To Be Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Be Created</em>'.
	 * @see org.eclipse.xpand3.declaration.CreateExtensionStatement#getToBeCreated()
	 * @see #getCreateExtensionStatement()
	 * @generated
	 */
	EReference getCreateExtensionStatement_ToBeCreated();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.declaration.JavaExtensionStatement <em>Java Extension Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Extension Statement</em>'.
	 * @see org.eclipse.xpand3.declaration.JavaExtensionStatement
	 * @generated
	 */
	EClass getJavaExtensionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaType <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Type</em>'.
	 * @see org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaType()
	 * @see #getJavaExtensionStatement()
	 * @generated
	 */
	EReference getJavaExtensionStatement_JavaType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Method</em>'.
	 * @see org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaMethod()
	 * @see #getJavaExtensionStatement()
	 * @generated
	 */
	EReference getJavaExtensionStatement_JavaMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaParamTypes <em>Java Param Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Param Types</em>'.
	 * @see org.eclipse.xpand3.declaration.JavaExtensionStatement#getJavaParamTypes()
	 * @see #getJavaExtensionStatement()
	 * @generated
	 */
	EReference getJavaExtensionStatement_JavaParamTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarationFactory getDeclarationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.AbstractDeclarationImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAbstractDeclaration()
		 * @generated
		 */
		EClass ABSTRACT_DECLARATION = eINSTANCE.getAbstractDeclaration();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DECLARATION__OWNER = eINSTANCE.getAbstractDeclaration_Owner();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DECLARATION__PARAMS = eINSTANCE.getAbstractDeclaration_Params();

		/**
		 * The meta object literal for the '<em><b>Is Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DECLARATION__IS_PRIVATE = eINSTANCE.getAbstractDeclaration_IsPrivate();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DECLARATION__GUARD = eINSTANCE.getAbstractDeclaration_Guard();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.AbstractNamedDeclarationImpl <em>Abstract Named Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.AbstractNamedDeclarationImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAbstractNamedDeclaration()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_DECLARATION = eINSTANCE.getAbstractNamedDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NAMED_DECLARATION__NAME = eINSTANCE.getAbstractNamedDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.DefinitionImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__BODY = eINSTANCE.getDefinition_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.AdviceImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.ExtensionImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__CACHED = eINSTANCE.getExtension_Cached();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.AbstractAspectImpl <em>Abstract Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.AbstractAspectImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getAbstractAspect()
		 * @generated
		 */
		EClass ABSTRACT_ASPECT = eINSTANCE.getAbstractAspect();

		/**
		 * The meta object literal for the '<em><b>Pointcut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ASPECT__POINTCUT = eINSTANCE.getAbstractAspect_Pointcut();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ASPECT__PARAMS = eINSTANCE.getAbstractAspect_Params();

		/**
		 * The meta object literal for the '<em><b>Wildparams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ASPECT__WILDPARAMS = eINSTANCE.getAbstractAspect_Wildparams();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.ExtensionAspectImpl <em>Extension Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.ExtensionAspectImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getExtensionAspect()
		 * @generated
		 */
		EClass EXTENSION_ASPECT = eINSTANCE.getExtensionAspect();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_ASPECT__EXPRESSION = eINSTANCE.getExtensionAspect_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.DefinitionAspectImpl <em>Definition Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.DefinitionAspectImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getDefinitionAspect()
		 * @generated
		 */
		EClass DEFINITION_ASPECT = eINSTANCE.getDefinitionAspect();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_ASPECT__BODY = eINSTANCE.getDefinitionAspect_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.CheckImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Error Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__ERROR_SEVERITY = eINSTANCE.getCheck_ErrorSeverity();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__MSG = eINSTANCE.getCheck_Msg();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK__CONSTRAINT = eINSTANCE.getCheck_Constraint();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__FEATURE = eINSTANCE.getCheck_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.CreateExtensionStatementImpl <em>Create Extension Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.CreateExtensionStatementImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getCreateExtensionStatement()
		 * @generated
		 */
		EClass CREATE_EXTENSION_STATEMENT = eINSTANCE.getCreateExtensionStatement();

		/**
		 * The meta object literal for the '<em><b>To Be Created</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_EXTENSION_STATEMENT__TO_BE_CREATED = eINSTANCE.getCreateExtensionStatement_ToBeCreated();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.declaration.impl.JavaExtensionStatementImpl <em>Java Extension Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.declaration.impl.JavaExtensionStatementImpl
		 * @see org.eclipse.xpand3.declaration.impl.DeclarationPackageImpl#getJavaExtensionStatement()
		 * @generated
		 */
		EClass JAVA_EXTENSION_STATEMENT = eINSTANCE.getJavaExtensionStatement();

		/**
		 * The meta object literal for the '<em><b>Java Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_EXTENSION_STATEMENT__JAVA_TYPE = eINSTANCE.getJavaExtensionStatement_JavaType();

		/**
		 * The meta object literal for the '<em><b>Java Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_EXTENSION_STATEMENT__JAVA_METHOD = eINSTANCE.getJavaExtensionStatement_JavaMethod();

		/**
		 * The meta object literal for the '<em><b>Java Param Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_EXTENSION_STATEMENT__JAVA_PARAM_TYPES = eINSTANCE.getJavaExtensionStatement_JavaParamTypes();

	}

} //DeclarationPackage
