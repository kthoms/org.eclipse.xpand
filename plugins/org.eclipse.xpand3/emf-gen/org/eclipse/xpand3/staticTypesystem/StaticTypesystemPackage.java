/**
 * <copyright>
 * </copyright>
 *
 * $Id: StaticTypesystemPackage.java,v 1.2 2008/03/04 11:00:30 sefftinge Exp $
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
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' reference list.
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
	 * The feature id for the '<em><b>Lower Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_TYPE__LOWER_BOUNDS = ABSTRACT_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bounds</b></em>' reference list.
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
	 * The feature id for the '<em><b>Actual Type Arguments</b></em>' reference list.
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
	 * The meta object id for the '<em>Backend Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.backend.common.BackendType
	 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getBackendType()
	 * @generated
	 */
	int BACKEND_TYPE = 7;


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
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.staticTypesystem.Type#getActualTypeArguments <em>Actual Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Type Arguments</em>'.
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
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.staticTypesystem.WildcardType#getLowerBounds <em>Lower Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lower Bounds</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.WildcardType#getLowerBounds()
	 * @see #getWildcardType()
	 * @generated
	 */
	EReference getWildcardType_LowerBounds();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.staticTypesystem.WildcardType#getUpperBounds <em>Upper Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upper Bounds</em>'.
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
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.staticTypesystem.FunctionType#getActualTypeArguments <em>Actual Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Type Arguments</em>'.
	 * @see org.eclipse.xpand3.staticTypesystem.FunctionType#getActualTypeArguments()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ActualTypeArguments();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.xtend.backend.common.BackendType <em>Backend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Backend Type</em>'.
	 * @see org.eclipse.xtend.backend.common.BackendType
	 * @model instanceClass="org.eclipse.xtend.backend.common.BackendType"
	 * @generated
	 */
	EDataType getBackendType();

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
		 * The meta object literal for the '<em><b>Actual Type Arguments</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Lower Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILDCARD_TYPE__LOWER_BOUNDS = eINSTANCE.getWildcardType_LowerBounds();

		/**
		 * The meta object literal for the '<em><b>Upper Bounds</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Actual Type Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__ACTUAL_TYPE_ARGUMENTS = eINSTANCE.getFunctionType_ActualTypeArguments();

		/**
		 * The meta object literal for the '<em>Backend Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.backend.common.BackendType
		 * @see org.eclipse.xpand3.staticTypesystem.impl.StaticTypesystemPackageImpl#getBackendType()
		 * @generated
		 */
		EDataType BACKEND_TYPE = eINSTANCE.getBackendType();

	}

} //StaticTypesystemPackage
