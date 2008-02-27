/**
 * <copyright>
 * </copyright>
 *
 * $Id: StatementFactoryImpl.java,v 1.1 2008/02/27 13:21:07 sefftinge Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpand3.statement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementFactoryImpl extends EFactoryImpl implements StatementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatementFactory init() {
		try {
			StatementFactory theStatementFactory = (StatementFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/m2t/xpand/xpand3/statement"); 
			if (theStatementFactory != null) {
				return theStatementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementFactoryImpl() {
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
			case StatementPackage.EXPAND_STATEMENT: return createExpandStatement();
			case StatementPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
			case StatementPackage.ERROR_STATEMENT: return createErrorStatement();
			case StatementPackage.FILE_STATEMENT: return createFileStatement();
			case StatementPackage.FOR_EACH_STATEMENT: return createForEachStatement();
			case StatementPackage.IF_STATEMENT: return createIfStatement();
			case StatementPackage.LET_STATEMENT: return createLetStatement();
			case StatementPackage.PROTECT_STATEMENT: return createProtectStatement();
			case StatementPackage.TEXT_STATEMENT: return createTextStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandStatement createExpandStatement() {
		ExpandStatementImpl expandStatement = new ExpandStatementImpl();
		return expandStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorStatement createErrorStatement() {
		ErrorStatementImpl errorStatement = new ErrorStatementImpl();
		return errorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileStatement createFileStatement() {
		FileStatementImpl fileStatement = new FileStatementImpl();
		return fileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachStatement createForEachStatement() {
		ForEachStatementImpl forEachStatement = new ForEachStatementImpl();
		return forEachStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetStatement createLetStatement() {
		LetStatementImpl letStatement = new LetStatementImpl();
		return letStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectStatement createProtectStatement() {
		ProtectStatementImpl protectStatement = new ProtectStatementImpl();
		return protectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStatement createTextStatement() {
		TextStatementImpl textStatement = new TextStatementImpl();
		return textStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementPackage getStatementPackage() {
		return (StatementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatementPackage getPackage() {
		return StatementPackage.eINSTANCE;
	}

} //StatementFactoryImpl
