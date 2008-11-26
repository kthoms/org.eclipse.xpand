/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubpackageFactoryImpl.java,v 1.2 2008/11/26 12:46:25 dhubner Exp $
 */
package org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageFactory;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackageMetaClass;
import org.eclipse.xtend.typesystem.emf.check.model.test.subpackage.SubpackagePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubpackageFactoryImpl extends EFactoryImpl implements SubpackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubpackageFactory init() {
		try {
			SubpackageFactory theSubpackageFactory = (SubpackageFactory)EPackage.Registry.INSTANCE.getEFactory("http://oaw.org/test/subpackage"); 
			if (theSubpackageFactory != null) {
				return theSubpackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubpackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubpackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SubpackagePackage.SUBPACKAGE_META_CLASS: return createSubpackageMetaClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubpackageMetaClass createSubpackageMetaClass() {
		SubpackageMetaClassImpl subpackageMetaClass = new SubpackageMetaClassImpl();
		return subpackageMetaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubpackagePackage getSubpackagePackage() {
		return (SubpackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubpackagePackage getPackage() {
		return SubpackagePackage.eINSTANCE;
	}

} //SubpackageFactoryImpl
