/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationPackage.java,v 1.1 2008/03/04 10:52:59 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xpand3.staticTypesystem.StaticTypesystemPackage;

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
 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationFactory
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
	String eNS_URI = "http://www.eclipse.org/m2t/xpand3/staticTypesystem/declaration";

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
	DeclarationPackage eINSTANCE = org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeImpl
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredType()
	 * @generated
	 */
	int DECLARED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__NAME = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Static Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__STATIC_PROPERTIES = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__PROPERTIES = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__OPERATIONS = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declared Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__DECLARED_TYPE_PARAMETERS = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_FEATURE_COUNT = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredOperationImpl <em>Declared Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredOperationImpl
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredOperation()
	 * @generated
	 */
	int DECLARED_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_OPERATION__NAME = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Declared Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_OPERATION__DECLARED_PARAMETERS = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_OPERATION__DECLARING_TYPE = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_OPERATION__RETURN_TYPE = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declared Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_OPERATION_FEATURE_COUNT = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredFunctionImpl <em>Declared Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredFunctionImpl
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredFunction()
	 * @generated
	 */
	int DECLARED_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__NAME = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Declared Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__DECLARED_PARAMETERS = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__RETURN_TYPE = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declared Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION_FEATURE_COUNT = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredPropertyImpl <em>Declared Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredPropertyImpl
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredProperty()
	 * @generated
	 */
	int DECLARED_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__NAME = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Declared Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY_FEATURE_COUNT = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredStaticPropertyImpl <em>Declared Static Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredStaticPropertyImpl
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredStaticProperty()
	 * @generated
	 */
	int DECLARED_STATIC_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STATIC_PROPERTY__NAME = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Declared Static Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STATIC_PROPERTY_FEATURE_COUNT = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeParameterImpl <em>Declared Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeParameterImpl
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredTypeParameter()
	 * @generated
	 */
	int DECLARED_TYPE_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_PARAMETER__NAME = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Declared Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_PARAMETER_FEATURE_COUNT = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredParameterImpl
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredParameter()
	 * @generated
	 */
	int DECLARED_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__NAME = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Declared Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_FEATURE_COUNT = StaticTypesystemPackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType
	 * @generated
	 */
	EClass getDeclaredType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getStaticProperties <em>Static Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Properties</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getStaticProperties()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_StaticProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getProperties()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getOperations()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getDeclaredTypeParameters <em>Declared Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Type Parameters</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType#getDeclaredTypeParameters()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_DeclaredTypeParameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation <em>Declared Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Operation</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation
	 * @generated
	 */
	EClass getDeclaredOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getDeclaredParameters <em>Declared Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Parameters</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getDeclaredParameters()
	 * @see #getDeclaredOperation()
	 * @generated
	 */
	EReference getDeclaredOperation_DeclaredParameters();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Declaring Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getDeclaringType()
	 * @see #getDeclaredOperation()
	 * @generated
	 */
	EReference getDeclaredOperation_DeclaringType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation#getReturnType()
	 * @see #getDeclaredOperation()
	 * @generated
	 */
	EReference getDeclaredOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction <em>Declared Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Function</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction
	 * @generated
	 */
	EClass getDeclaredFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction#getDeclaredParameters <em>Declared Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Parameters</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction#getDeclaredParameters()
	 * @see #getDeclaredFunction()
	 * @generated
	 */
	EReference getDeclaredFunction_DeclaredParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction#getDeclaredTypeParameters <em>Declared Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Type Parameters</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction#getDeclaredTypeParameters()
	 * @see #getDeclaredFunction()
	 * @generated
	 */
	EReference getDeclaredFunction_DeclaredTypeParameters();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction#getReturnType()
	 * @see #getDeclaredFunction()
	 * @generated
	 */
	EReference getDeclaredFunction_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredProperty <em>Declared Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Property</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredProperty
	 * @generated
	 */
	EClass getDeclaredProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredStaticProperty <em>Declared Static Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Static Property</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredStaticProperty
	 * @generated
	 */
	EClass getDeclaredStaticProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredTypeParameter <em>Declared Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type Parameter</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredTypeParameter
	 * @generated
	 */
	EClass getDeclaredTypeParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredParameter <em>Declared Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Parameter</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredParameter
	 * @generated
	 */
	EClass getDeclaredParameter();

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
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeImpl
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredType()
		 * @generated
		 */
		EClass DECLARED_TYPE = eINSTANCE.getDeclaredType();

		/**
		 * The meta object literal for the '<em><b>Static Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__STATIC_PROPERTIES = eINSTANCE.getDeclaredType_StaticProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__PROPERTIES = eINSTANCE.getDeclaredType_Properties();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__OPERATIONS = eINSTANCE.getDeclaredType_Operations();

		/**
		 * The meta object literal for the '<em><b>Declared Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__DECLARED_TYPE_PARAMETERS = eINSTANCE.getDeclaredType_DeclaredTypeParameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredOperationImpl <em>Declared Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredOperationImpl
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredOperation()
		 * @generated
		 */
		EClass DECLARED_OPERATION = eINSTANCE.getDeclaredOperation();

		/**
		 * The meta object literal for the '<em><b>Declared Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_OPERATION__DECLARED_PARAMETERS = eINSTANCE.getDeclaredOperation_DeclaredParameters();

		/**
		 * The meta object literal for the '<em><b>Declaring Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_OPERATION__DECLARING_TYPE = eINSTANCE.getDeclaredOperation_DeclaringType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_OPERATION__RETURN_TYPE = eINSTANCE.getDeclaredOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredFunctionImpl <em>Declared Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredFunctionImpl
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredFunction()
		 * @generated
		 */
		EClass DECLARED_FUNCTION = eINSTANCE.getDeclaredFunction();

		/**
		 * The meta object literal for the '<em><b>Declared Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_FUNCTION__DECLARED_PARAMETERS = eINSTANCE.getDeclaredFunction_DeclaredParameters();

		/**
		 * The meta object literal for the '<em><b>Declared Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS = eINSTANCE.getDeclaredFunction_DeclaredTypeParameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_FUNCTION__RETURN_TYPE = eINSTANCE.getDeclaredFunction_ReturnType();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredPropertyImpl <em>Declared Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredPropertyImpl
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredProperty()
		 * @generated
		 */
		EClass DECLARED_PROPERTY = eINSTANCE.getDeclaredProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredStaticPropertyImpl <em>Declared Static Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredStaticPropertyImpl
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredStaticProperty()
		 * @generated
		 */
		EClass DECLARED_STATIC_PROPERTY = eINSTANCE.getDeclaredStaticProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeParameterImpl <em>Declared Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredTypeParameterImpl
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredTypeParameter()
		 * @generated
		 */
		EClass DECLARED_TYPE_PARAMETER = eINSTANCE.getDeclaredTypeParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclaredParameterImpl
		 * @see org.eclipse.xpand3.staticTypesystem.declaration.impl.DeclarationPackageImpl#getDeclaredParameter()
		 * @generated
		 */
		EClass DECLARED_PARAMETER = eINSTANCE.getDeclaredParameter();

	}

} //DeclarationPackage
