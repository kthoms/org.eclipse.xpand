/**
 * <copyright>
 * </copyright>
 *
 * $Id: StaticTypesystemPackage.java,v 1.7 2008/03/07 14:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.xpand3.staticTypesystem.StaticTypesystemFactory
 * @model kind="package"
 * @generated
 */
public interface StaticTypesystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "staticTypesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2t/xpand3/staticTypesystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "staticTypesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticTypesystemPackage eINSTANCE = org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.AbstractNamedElementImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getAbstractNamedElement()
	 * @generated
	 */
	int ABSTRACT_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.AbstractTypeReferenceImpl <em>Abstract Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.AbstractTypeReferenceImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getAbstractTypeReference()
	 * @generated
	 */
	int ABSTRACT_TYPE_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.TypeImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 2;

	/**
	 * The feature id for the '<em><b>Declared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DECLARED_TYPE = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ACTUAL_TYPE_ARGUMENTS = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.TypeVariableImpl <em>Type Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.TypeVariableImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getTypeVariable()
	 * @generated
	 */
	int TYPE_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Declared Type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE__DECLARED_TYPE_PARAMETER = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VARIABLE_FEATURE_COUNT = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.VoidTypeImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.WildcardTypeImpl <em>Wildcard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.WildcardTypeImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getWildcardType()
	 * @generated
	 */
	int WILDCARD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Lower Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_TYPE__LOWER_BOUNDS = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_TYPE__UPPER_BOUNDS = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wildcard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.FunctionTypeImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Declared Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__DECLARED_FUNCTION = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredType()
	 * @generated
	 */
	int DECLARED_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Static Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__STATIC_PROPERTIES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__PROPERTIES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declared Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__DECLARED_TYPE_PARAMETERS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__SUPER_TYPES = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredFunctionImpl <em>Declared Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredFunctionImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredFunction()
	 * @generated
	 */
	int DECLARED_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Declared Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__DECLARED_PARAMETERS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declared Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__DECLARED_TYPE_PARAMETERS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION__RETURN_TYPE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declared Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FUNCTION_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredPropertyImpl <em>Declared Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredPropertyImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredProperty()
	 * @generated
	 */
	int DECLARED_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__TYPE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__READ_ONLY = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declared Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredStaticPropertyImpl <em>Declared Static Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredStaticPropertyImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredStaticProperty()
	 * @generated
	 */
	int DECLARED_STATIC_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STATIC_PROPERTY__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STATIC_PROPERTY__TYPE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Static Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STATIC_PROPERTY_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeParameterImpl <em>Declared Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeParameterImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredTypeParameter()
	 * @generated
	 */
	int DECLARED_TYPE_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_PARAMETER__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_PARAMETER__UPPER_BOUNDS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_PARAMETER_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredParameterImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredParameter()
	 * @generated
	 */
	int DECLARED_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER__TYPE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.staticTypesystem.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.staticTypesystem.impl.ModelImpl
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 13;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DECLARATIONS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Element</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.AbstractNamedElement
	 * @generated
	 */
	EClass getAbstractNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.staticTypesystem.AbstractNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.AbstractNamedElement#getName()
	 * @see #getAbstractNamedElement()
	 * @generated
	 */
	EAttribute getAbstractNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.AbstractTypeReference <em>Abstract Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Reference</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.AbstractTypeReference
	 * @generated
	 */
	EClass getAbstractTypeReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.staticTypesystem.Type#getDeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.Type#getDeclaredType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_DeclaredType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.Type#getActualTypeArguments <em>Actual Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Type Arguments</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.Type#getActualTypeArguments()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_ActualTypeArguments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.TypeVariable <em>Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Variable</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.TypeVariable
	 * @generated
	 */
	EClass getTypeVariable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.staticTypesystem.TypeVariable#getDeclaredTypeParameter <em>Declared Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Type Parameter</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.TypeVariable#getDeclaredTypeParameter()
	 * @see #getTypeVariable()
	 * @generated
	 */
	EReference getTypeVariable_DeclaredTypeParameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.WildcardType <em>Wildcard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wildcard Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.WildcardType
	 * @generated
	 */
	EClass getWildcardType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.WildcardType#getLowerBounds <em>Lower Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lower Bounds</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.WildcardType#getLowerBounds()
	 * @see #getWildcardType()
	 * @generated
	 */
	EReference getWildcardType_LowerBounds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.WildcardType#getUpperBounds <em>Upper Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Bounds</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.WildcardType#getUpperBounds()
	 * @see #getWildcardType()
	 * @generated
	 */
	EReference getWildcardType_UpperBounds();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.staticTypesystem.FunctionType#getDeclaredFunction <em>Declared Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Function</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.FunctionType#getDeclaredFunction()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_DeclaredFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.FunctionType#getActualTypeArguments <em>Actual Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Type Arguments</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.FunctionType#getActualTypeArguments()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ActualTypeArguments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.DeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredType
	 * @generated
	 */
	EClass getDeclaredType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getStaticProperties <em>Static Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Static Properties</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredType#getStaticProperties()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_StaticProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredType#getProperties()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getDeclaredTypeParameters <em>Declared Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Type Parameters</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredType#getDeclaredTypeParameters()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_DeclaredTypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.DeclaredType#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Types</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredType#getSuperTypes()
	 * @see #getDeclaredType()
	 * @generated
	 */
	EReference getDeclaredType_SuperTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.DeclaredFunction <em>Declared Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Function</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredFunction
	 * @generated
	 */
	EClass getDeclaredFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.DeclaredFunction#getDeclaredParameters <em>Declared Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Parameters</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredFunction#getDeclaredParameters()
	 * @see #getDeclaredFunction()
	 * @generated
	 */
	EReference getDeclaredFunction_DeclaredParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.DeclaredFunction#getDeclaredTypeParameters <em>Declared Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Type Parameters</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredFunction#getDeclaredTypeParameters()
	 * @see #getDeclaredFunction()
	 * @generated
	 */
	EReference getDeclaredFunction_DeclaredTypeParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.staticTypesystem.DeclaredFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredFunction#getReturnType()
	 * @see #getDeclaredFunction()
	 * @generated
	 */
	EReference getDeclaredFunction_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.DeclaredProperty <em>Declared Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Property</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredProperty
	 * @generated
	 */
	EClass getDeclaredProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.staticTypesystem.DeclaredProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredProperty#getType()
	 * @see #getDeclaredProperty()
	 * @generated
	 */
	EReference getDeclaredProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.staticTypesystem.DeclaredProperty#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredProperty#isReadOnly()
	 * @see #getDeclaredProperty()
	 * @generated
	 */
	EAttribute getDeclaredProperty_ReadOnly();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty <em>Declared Static Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Static Property</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty
	 * @generated
	 */
	EClass getDeclaredStaticProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredStaticProperty#getType()
	 * @see #getDeclaredStaticProperty()
	 * @generated
	 */
	EReference getDeclaredStaticProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter <em>Declared Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type Parameter</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter
	 * @generated
	 */
	EClass getDeclaredTypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter#getUpperBounds <em>Upper Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Bounds</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredTypeParameter#getUpperBounds()
	 * @see #getDeclaredTypeParameter()
	 * @generated
	 */
	EReference getDeclaredTypeParameter_UpperBounds();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.DeclaredParameter <em>Declared Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Parameter</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredParameter
	 * @generated
	 */
	EClass getDeclaredParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.staticTypesystem.DeclaredParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.DeclaredParameter#getType()
	 * @see #getDeclaredParameter()
	 * @generated
	 */
	EReference getDeclaredParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.staticTypesystem.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.staticTypesystem.Model#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.Model#getDeclarations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Declarations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaticTypesystemFactory getStaticTypesystemFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.AbstractNamedElementImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getAbstractNamedElement()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_ELEMENT = eINSTANCE.getAbstractNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_ELEMENT__NAME = eINSTANCE.getAbstractNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.AbstractTypeReferenceImpl <em>Abstract Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.AbstractTypeReferenceImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getAbstractTypeReference()
		 * @generated
		 */
		EClass ABSTRACT_TYPE_REFERENCE = eINSTANCE.getAbstractTypeReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.TypeImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Declared Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__DECLARED_TYPE = eINSTANCE.getType_DeclaredType();

		/**
		 * The meta object literal for the '<em><b>Actual Type Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ACTUAL_TYPE_ARGUMENTS = eINSTANCE.getType_ActualTypeArguments();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.TypeVariableImpl <em>Type Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.TypeVariableImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getTypeVariable()
		 * @generated
		 */
		EClass TYPE_VARIABLE = eINSTANCE.getTypeVariable();

		/**
		 * The meta object literal for the '<em><b>Declared Type Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_VARIABLE__DECLARED_TYPE_PARAMETER = eINSTANCE.getTypeVariable_DeclaredTypeParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.VoidTypeImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.WildcardTypeImpl <em>Wildcard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.WildcardTypeImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getWildcardType()
		 * @generated
		 */
		EClass WILDCARD_TYPE = eINSTANCE.getWildcardType();

		/**
		 * The meta object literal for the '<em><b>Lower Bounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILDCARD_TYPE__LOWER_BOUNDS = eINSTANCE.getWildcardType_LowerBounds();

		/**
		 * The meta object literal for the '<em><b>Upper Bounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILDCARD_TYPE__UPPER_BOUNDS = eINSTANCE.getWildcardType_UpperBounds();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.FunctionTypeImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Declared Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__DECLARED_FUNCTION = eINSTANCE.getFunctionType_DeclaredFunction();

		/**
		 * The meta object literal for the '<em><b>Actual Type Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS = eINSTANCE.getFunctionType_ActualTypeArguments();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredType()
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
		 * The meta object literal for the '<em><b>Declared Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__DECLARED_TYPE_PARAMETERS = eINSTANCE.getDeclaredType_DeclaredTypeParameters();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE__SUPER_TYPES = eINSTANCE.getDeclaredType_SuperTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredFunctionImpl <em>Declared Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredFunctionImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredFunction()
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
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_FUNCTION__RETURN_TYPE = eINSTANCE.getDeclaredFunction_ReturnType();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredPropertyImpl <em>Declared Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredPropertyImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredProperty()
		 * @generated
		 */
		EClass DECLARED_PROPERTY = eINSTANCE.getDeclaredProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PROPERTY__TYPE = eINSTANCE.getDeclaredProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_PROPERTY__READ_ONLY = eINSTANCE.getDeclaredProperty_ReadOnly();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredStaticPropertyImpl <em>Declared Static Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredStaticPropertyImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredStaticProperty()
		 * @generated
		 */
		EClass DECLARED_STATIC_PROPERTY = eINSTANCE.getDeclaredStaticProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_STATIC_PROPERTY__TYPE = eINSTANCE.getDeclaredStaticProperty_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeParameterImpl <em>Declared Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredTypeParameterImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredTypeParameter()
		 * @generated
		 */
		EClass DECLARED_TYPE_PARAMETER = eINSTANCE.getDeclaredTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Upper Bounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_TYPE_PARAMETER__UPPER_BOUNDS = eINSTANCE.getDeclaredTypeParameter_UpperBounds();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.DeclaredParameterImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getDeclaredParameter()
		 * @generated
		 */
		EClass DECLARED_PARAMETER = eINSTANCE.getDeclaredParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PARAMETER__TYPE = eINSTANCE.getDeclaredParameter_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.staticTypesystem.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.staticTypesystem.impl.ModelImpl
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

	}

} //StaticTypesystemPackage
