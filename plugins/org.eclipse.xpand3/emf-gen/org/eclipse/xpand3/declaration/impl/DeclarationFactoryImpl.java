/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationFactoryImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpand3.declaration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationFactoryImpl extends EFactoryImpl implements DeclarationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeclarationFactory init() {
		try {
			DeclarationFactory theDeclarationFactory = (DeclarationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/m2t/xpand/xpand3/declararation"); 
			if (theDeclarationFactory != null) {
				return theDeclarationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclarationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationFactoryImpl() {
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
			case DeclarationPackage.DEFINITION: return createDefinition();
			case DeclarationPackage.ADVICE: return createAdvice();
			case DeclarationPackage.EXTENSION: return createExtension();
			case DeclarationPackage.EXTENSION_ASPECT: return createExtensionAspect();
			case DeclarationPackage.DEFINITION_ASPECT: return createDefinitionAspect();
			case DeclarationPackage.CHECK: return createCheck();
			case DeclarationPackage.CREATE_EXTENSION_STATEMENT: return createCreateExtensionStatement();
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT: return createJavaExtensionStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice createAdvice() {
		AdviceImpl advice = new AdviceImpl();
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAspect createExtensionAspect() {
		ExtensionAspectImpl extensionAspect = new ExtensionAspectImpl();
		return extensionAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionAspect createDefinitionAspect() {
		DefinitionAspectImpl definitionAspect = new DefinitionAspectImpl();
		return definitionAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Check createCheck() {
		CheckImpl check = new CheckImpl();
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateExtensionStatement createCreateExtensionStatement() {
		CreateExtensionStatementImpl createExtensionStatement = new CreateExtensionStatementImpl();
		return createExtensionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExtensionStatement createJavaExtensionStatement() {
		JavaExtensionStatementImpl javaExtensionStatement = new JavaExtensionStatementImpl();
		return javaExtensionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationPackage getDeclarationPackage() {
		return (DeclarationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeclarationPackage getPackage() {
		return DeclarationPackage.eINSTANCE;
	}

} //DeclarationFactoryImpl
