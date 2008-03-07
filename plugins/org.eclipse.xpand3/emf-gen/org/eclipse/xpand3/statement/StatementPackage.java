/**
 * <copyright>
 * </copyright>
 *
 * $Id: StatementPackage.java,v 1.2 2008/03/07 11:10:52 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement;

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
 * @see org.eclipse.xpand3.statement.StatementFactory
 * @model kind="package"
 * @generated
 */
public interface StatementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2t/xpand/xpand3/statement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementPackage eINSTANCE = org.eclipse.xpand3.statement.impl.StatementPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.AbstractStatementImpl <em>Abstract Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.AbstractStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getAbstractStatement()
	 * @generated
	 */
	int ABSTRACT_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__LINE = Xpand3Package.SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__START = Xpand3Package.SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__END = Xpand3Package.SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__FILE_NAME = Xpand3Package.SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_FEATURE_COUNT = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.ExpandStatementImpl <em>Expand Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.ExpandStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getExpandStatement()
	 * @generated
	 */
	int EXPAND_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__LINE = ABSTRACT_STATEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__START = ABSTRACT_STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__END = ABSTRACT_STATEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Foreach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__FOREACH = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__PARAMETERS = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__SEPARATOR = ABSTRACT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__TARGET = ABSTRACT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT__DEFINITION = ABSTRACT_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Expand Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.ExpressionStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__LINE = ABSTRACT_STATEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__START = ABSTRACT_STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__END = ABSTRACT_STATEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.ErrorStatementImpl <em>Error Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.ErrorStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getErrorStatement()
	 * @generated
	 */
	int ERROR_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT__LINE = ABSTRACT_STATEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT__START = ABSTRACT_STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT__END = ABSTRACT_STATEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT__MESSAGE = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.AbstractStatementWithBodyImpl <em>Abstract Statement With Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.AbstractStatementWithBodyImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getAbstractStatementWithBody()
	 * @generated
	 */
	int ABSTRACT_STATEMENT_WITH_BODY = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_WITH_BODY__LINE = ABSTRACT_STATEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_WITH_BODY__START = ABSTRACT_STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_WITH_BODY__END = ABSTRACT_STATEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_WITH_BODY__FILE_NAME = ABSTRACT_STATEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_WITH_BODY__BODY = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Statement With Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.FileStatementImpl <em>File Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.FileStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getFileStatement()
	 * @generated
	 */
	int FILE_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT__LINE = ABSTRACT_STATEMENT_WITH_BODY__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT__START = ABSTRACT_STATEMENT_WITH_BODY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT__END = ABSTRACT_STATEMENT_WITH_BODY__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT_WITH_BODY__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT__BODY = ABSTRACT_STATEMENT_WITH_BODY__BODY;

	/**
	 * The feature id for the '<em><b>File Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT__FILE_NAME_EXPRESSION = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outlet Name Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT__OUTLET_NAME_IDENTIFIER = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.ForEachStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getForEachStatement()
	 * @generated
	 */
	int FOR_EACH_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__LINE = ABSTRACT_STATEMENT_WITH_BODY__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__START = ABSTRACT_STATEMENT_WITH_BODY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__END = ABSTRACT_STATEMENT_WITH_BODY__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT_WITH_BODY__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__BODY = ABSTRACT_STATEMENT_WITH_BODY__BODY;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__TARGET = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seperator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__SEPERATOR = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__VARIABLE = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iterator Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__ITERATOR_NAME = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Each Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.IfStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__LINE = ABSTRACT_STATEMENT_WITH_BODY__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__START = ABSTRACT_STATEMENT_WITH_BODY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__END = ABSTRACT_STATEMENT_WITH_BODY__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT_WITH_BODY__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__BODY = ABSTRACT_STATEMENT_WITH_BODY__BODY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__UPPER_IF = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_IF = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.LetStatementImpl <em>Let Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.LetStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getLetStatement()
	 * @generated
	 */
	int LET_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__LINE = ABSTRACT_STATEMENT_WITH_BODY__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__START = ABSTRACT_STATEMENT_WITH_BODY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__END = ABSTRACT_STATEMENT_WITH_BODY__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT_WITH_BODY__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__BODY = ABSTRACT_STATEMENT_WITH_BODY__BODY;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__VAR_NAME = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__VAR_VALUE = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.ProtectStatementImpl <em>Protect Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.ProtectStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getProtectStatement()
	 * @generated
	 */
	int PROTECT_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__LINE = ABSTRACT_STATEMENT_WITH_BODY__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__START = ABSTRACT_STATEMENT_WITH_BODY__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__END = ABSTRACT_STATEMENT_WITH_BODY__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT_WITH_BODY__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__BODY = ABSTRACT_STATEMENT_WITH_BODY__BODY;

	/**
	 * The feature id for the '<em><b>Comment Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__COMMENT_START = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__COMMENT_END = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__ID = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT__DISABLE = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Protect Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_WITH_BODY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.statement.impl.TextStatementImpl <em>Text Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.statement.impl.TextStatementImpl
	 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getTextStatement()
	 * @generated
	 */
	int TEXT_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STATEMENT__LINE = ABSTRACT_STATEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STATEMENT__START = ABSTRACT_STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STATEMENT__END = ABSTRACT_STATEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STATEMENT__FILE_NAME = ABSTRACT_STATEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STATEMENT__VALUE = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delete Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STATEMENT__DELETE_LINE = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.AbstractStatement <em>Abstract Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Statement</em>'.
	 * @see org.eclipse.xpand3.statement.AbstractStatement
	 * @generated
	 */
	EClass getAbstractStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.ExpandStatement <em>Expand Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expand Statement</em>'.
	 * @see org.eclipse.xpand3.statement.ExpandStatement
	 * @generated
	 */
	EClass getExpandStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.statement.ExpandStatement#isForeach <em>Foreach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreach</em>'.
	 * @see org.eclipse.xpand3.statement.ExpandStatement#isForeach()
	 * @see #getExpandStatement()
	 * @generated
	 */
	EAttribute getExpandStatement_Foreach();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.statement.ExpandStatement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.xpand3.statement.ExpandStatement#getParameters()
	 * @see #getExpandStatement()
	 * @generated
	 */
	EReference getExpandStatement_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ExpandStatement#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.eclipse.xpand3.statement.ExpandStatement#getSeparator()
	 * @see #getExpandStatement()
	 * @generated
	 */
	EReference getExpandStatement_Separator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ExpandStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.xpand3.statement.ExpandStatement#getTarget()
	 * @see #getExpandStatement()
	 * @generated
	 */
	EReference getExpandStatement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ExpandStatement#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.eclipse.xpand3.statement.ExpandStatement#getDefinition()
	 * @see #getExpandStatement()
	 * @generated
	 */
	EReference getExpandStatement_Definition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see org.eclipse.xpand3.statement.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.xpand3.statement.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.ErrorStatement <em>Error Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Statement</em>'.
	 * @see org.eclipse.xpand3.statement.ErrorStatement
	 * @generated
	 */
	EClass getErrorStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ErrorStatement#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.eclipse.xpand3.statement.ErrorStatement#getMessage()
	 * @see #getErrorStatement()
	 * @generated
	 */
	EReference getErrorStatement_Message();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.AbstractStatementWithBody <em>Abstract Statement With Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Statement With Body</em>'.
	 * @see org.eclipse.xpand3.statement.AbstractStatementWithBody
	 * @generated
	 */
	EClass getAbstractStatementWithBody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.statement.AbstractStatementWithBody#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.eclipse.xpand3.statement.AbstractStatementWithBody#getBody()
	 * @see #getAbstractStatementWithBody()
	 * @generated
	 */
	EReference getAbstractStatementWithBody_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.FileStatement <em>File Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Statement</em>'.
	 * @see org.eclipse.xpand3.statement.FileStatement
	 * @generated
	 */
	EClass getFileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.FileStatement#getFileNameExpression <em>File Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Name Expression</em>'.
	 * @see org.eclipse.xpand3.statement.FileStatement#getFileNameExpression()
	 * @see #getFileStatement()
	 * @generated
	 */
	EReference getFileStatement_FileNameExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.FileStatement#getOutletNameIdentifier <em>Outlet Name Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outlet Name Identifier</em>'.
	 * @see org.eclipse.xpand3.statement.FileStatement#getOutletNameIdentifier()
	 * @see #getFileStatement()
	 * @generated
	 */
	EReference getFileStatement_OutletNameIdentifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.ForEachStatement <em>For Each Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each Statement</em>'.
	 * @see org.eclipse.xpand3.statement.ForEachStatement
	 * @generated
	 */
	EClass getForEachStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ForEachStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.xpand3.statement.ForEachStatement#getTarget()
	 * @see #getForEachStatement()
	 * @generated
	 */
	EReference getForEachStatement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ForEachStatement#getSeperator <em>Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seperator</em>'.
	 * @see org.eclipse.xpand3.statement.ForEachStatement#getSeperator()
	 * @see #getForEachStatement()
	 * @generated
	 */
	EReference getForEachStatement_Seperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ForEachStatement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.eclipse.xpand3.statement.ForEachStatement#getVariable()
	 * @see #getForEachStatement()
	 * @generated
	 */
	EReference getForEachStatement_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ForEachStatement#getIteratorName <em>Iterator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator Name</em>'.
	 * @see org.eclipse.xpand3.statement.ForEachStatement#getIteratorName()
	 * @see #getForEachStatement()
	 * @generated
	 */
	EReference getForEachStatement_IteratorName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see org.eclipse.xpand3.statement.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.xpand3.statement.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.statement.IfStatement#getUpperIf <em>Upper If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper If</em>'.
	 * @see org.eclipse.xpand3.statement.IfStatement#getUpperIf()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_UpperIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.IfStatement#getElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else If</em>'.
	 * @see org.eclipse.xpand3.statement.IfStatement#getElseIf()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseIf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.LetStatement <em>Let Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Statement</em>'.
	 * @see org.eclipse.xpand3.statement.LetStatement
	 * @generated
	 */
	EClass getLetStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.LetStatement#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Name</em>'.
	 * @see org.eclipse.xpand3.statement.LetStatement#getVarName()
	 * @see #getLetStatement()
	 * @generated
	 */
	EReference getLetStatement_VarName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.LetStatement#getVarValue <em>Var Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Value</em>'.
	 * @see org.eclipse.xpand3.statement.LetStatement#getVarValue()
	 * @see #getLetStatement()
	 * @generated
	 */
	EReference getLetStatement_VarValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.ProtectStatement <em>Protect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protect Statement</em>'.
	 * @see org.eclipse.xpand3.statement.ProtectStatement
	 * @generated
	 */
	EClass getProtectStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ProtectStatement#getCommentStart <em>Comment Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment Start</em>'.
	 * @see org.eclipse.xpand3.statement.ProtectStatement#getCommentStart()
	 * @see #getProtectStatement()
	 * @generated
	 */
	EReference getProtectStatement_CommentStart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ProtectStatement#getCommentEnd <em>Comment End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment End</em>'.
	 * @see org.eclipse.xpand3.statement.ProtectStatement#getCommentEnd()
	 * @see #getProtectStatement()
	 * @generated
	 */
	EReference getProtectStatement_CommentEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.statement.ProtectStatement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.eclipse.xpand3.statement.ProtectStatement#getId()
	 * @see #getProtectStatement()
	 * @generated
	 */
	EReference getProtectStatement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.statement.ProtectStatement#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see org.eclipse.xpand3.statement.ProtectStatement#isDisable()
	 * @see #getProtectStatement()
	 * @generated
	 */
	EAttribute getProtectStatement_Disable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.statement.TextStatement <em>Text Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Statement</em>'.
	 * @see org.eclipse.xpand3.statement.TextStatement
	 * @generated
	 */
	EClass getTextStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.statement.TextStatement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.xpand3.statement.TextStatement#getValue()
	 * @see #getTextStatement()
	 * @generated
	 */
	EAttribute getTextStatement_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.statement.TextStatement#isDeleteLine <em>Delete Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Line</em>'.
	 * @see org.eclipse.xpand3.statement.TextStatement#isDeleteLine()
	 * @see #getTextStatement()
	 * @generated
	 */
	EAttribute getTextStatement_DeleteLine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementFactory getStatementFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.AbstractStatementImpl <em>Abstract Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.AbstractStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getAbstractStatement()
		 * @generated
		 */
		EClass ABSTRACT_STATEMENT = eINSTANCE.getAbstractStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.ExpandStatementImpl <em>Expand Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.ExpandStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getExpandStatement()
		 * @generated
		 */
		EClass EXPAND_STATEMENT = eINSTANCE.getExpandStatement();

		/**
		 * The meta object literal for the '<em><b>Foreach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPAND_STATEMENT__FOREACH = eINSTANCE.getExpandStatement_Foreach();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPAND_STATEMENT__PARAMETERS = eINSTANCE.getExpandStatement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPAND_STATEMENT__SEPARATOR = eINSTANCE.getExpandStatement_Separator();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPAND_STATEMENT__TARGET = eINSTANCE.getExpandStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPAND_STATEMENT__DEFINITION = eINSTANCE.getExpandStatement_Definition();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.ExpressionStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.ErrorStatementImpl <em>Error Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.ErrorStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getErrorStatement()
		 * @generated
		 */
		EClass ERROR_STATEMENT = eINSTANCE.getErrorStatement();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_STATEMENT__MESSAGE = eINSTANCE.getErrorStatement_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.AbstractStatementWithBodyImpl <em>Abstract Statement With Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.AbstractStatementWithBodyImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getAbstractStatementWithBody()
		 * @generated
		 */
		EClass ABSTRACT_STATEMENT_WITH_BODY = eINSTANCE.getAbstractStatementWithBody();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATEMENT_WITH_BODY__BODY = eINSTANCE.getAbstractStatementWithBody_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.FileStatementImpl <em>File Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.FileStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getFileStatement()
		 * @generated
		 */
		EClass FILE_STATEMENT = eINSTANCE.getFileStatement();

		/**
		 * The meta object literal for the '<em><b>File Name Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_STATEMENT__FILE_NAME_EXPRESSION = eINSTANCE.getFileStatement_FileNameExpression();

		/**
		 * The meta object literal for the '<em><b>Outlet Name Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_STATEMENT__OUTLET_NAME_IDENTIFIER = eINSTANCE.getFileStatement_OutletNameIdentifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.ForEachStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getForEachStatement()
		 * @generated
		 */
		EClass FOR_EACH_STATEMENT = eINSTANCE.getForEachStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_STATEMENT__TARGET = eINSTANCE.getForEachStatement_Target();

		/**
		 * The meta object literal for the '<em><b>Seperator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_STATEMENT__SEPERATOR = eINSTANCE.getForEachStatement_Seperator();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_STATEMENT__VARIABLE = eINSTANCE.getForEachStatement_Variable();

		/**
		 * The meta object literal for the '<em><b>Iterator Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_STATEMENT__ITERATOR_NAME = eINSTANCE.getForEachStatement_IteratorName();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.IfStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Upper If</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__UPPER_IF = eINSTANCE.getIfStatement_UpperIf();

		/**
		 * The meta object literal for the '<em><b>Else If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_IF = eINSTANCE.getIfStatement_ElseIf();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.LetStatementImpl <em>Let Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.LetStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getLetStatement()
		 * @generated
		 */
		EClass LET_STATEMENT = eINSTANCE.getLetStatement();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_STATEMENT__VAR_NAME = eINSTANCE.getLetStatement_VarName();

		/**
		 * The meta object literal for the '<em><b>Var Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_STATEMENT__VAR_VALUE = eINSTANCE.getLetStatement_VarValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.ProtectStatementImpl <em>Protect Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.ProtectStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getProtectStatement()
		 * @generated
		 */
		EClass PROTECT_STATEMENT = eINSTANCE.getProtectStatement();

		/**
		 * The meta object literal for the '<em><b>Comment Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECT_STATEMENT__COMMENT_START = eINSTANCE.getProtectStatement_CommentStart();

		/**
		 * The meta object literal for the '<em><b>Comment End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECT_STATEMENT__COMMENT_END = eINSTANCE.getProtectStatement_CommentEnd();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECT_STATEMENT__ID = eINSTANCE.getProtectStatement_Id();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECT_STATEMENT__DISABLE = eINSTANCE.getProtectStatement_Disable();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.statement.impl.TextStatementImpl <em>Text Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.statement.impl.TextStatementImpl
		 * @see org.eclipse.xpand3.statement.impl.StatementPackageImpl#getTextStatement()
		 * @generated
		 */
		EClass TEXT_STATEMENT = eINSTANCE.getTextStatement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STATEMENT__VALUE = eINSTANCE.getTextStatement_Value();

		/**
		 * The meta object literal for the '<em><b>Delete Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STATEMENT__DELETE_LINE = eINSTANCE.getTextStatement_DeleteLine();

	}

} //StatementPackage
