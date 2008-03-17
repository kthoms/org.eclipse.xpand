/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3FactoryImpl.java,v 1.1 2008/03/17 14:39:05 jkohnlein Exp $
 */
package org.eclipse.xpand3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpand3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xpand3FactoryImpl extends EFactoryImpl implements Xpand3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xpand3Factory init() {
		try {
			Xpand3Factory theXpand3Factory = (Xpand3Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/m2t/xpand/xpand3"); 
			if (theXpand3Factory != null) {
				return theXpand3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xpand3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xpand3FactoryImpl() {
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
			case Xpand3Package.FILE: return createFile();
			case Xpand3Package.IMPORT_STATEMENT: return createImportStatement();
			case Xpand3Package.IDENTIFIER: return createIdentifier();
			case Xpand3Package.DECLARED_PARAMETER: return createDeclaredParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportStatement createImportStatement() {
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameter createDeclaredParameter() {
		DeclaredParameterImpl declaredParameter = new DeclaredParameterImpl();
		return declaredParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xpand3Package getXpand3Package() {
		return (Xpand3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xpand3Package getPackage() {
		return Xpand3Package.eINSTANCE;
	}

} //Xpand3FactoryImpl
