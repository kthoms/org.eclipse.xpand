/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3nodeAdapterFactory.java,v 1.3 2008/03/07 09:39:42 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.Node;

import org.eclipse.xpand3.internal.parser.xpand3node.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage
 * @generated
 */
public class Xpand3nodeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xpand3nodePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xpand3nodeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Xpand3nodePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Xpand3nodeSwitch<Adapter> modelSwitch =
		new Xpand3nodeSwitch<Adapter>() {
			@Override
			public Adapter caseFileNode(FileNode object) {
				return createFileNodeAdapter();
			}
			@Override
			public Adapter caseNsImportNode(NsImportNode object) {
				return createNsImportNodeAdapter();
			}
			@Override
			public Adapter caseDefinitionNode(DefinitionNode object) {
				return createDefinitionNodeAdapter();
			}
			@Override
			public Adapter caseDefinitionAroundNode(DefinitionAroundNode object) {
				return createDefinitionAroundNodeAdapter();
			}
			@Override
			public Adapter caseSequenceNode(SequenceNode object) {
				return createSequenceNodeAdapter();
			}
			@Override
			public Adapter caseTextSequenceNode(TextSequenceNode object) {
				return createTextSequenceNodeAdapter();
			}
			@Override
			public Adapter caseTextNode(TextNode object) {
				return createTextNodeAdapter();
			}
			@Override
			public Adapter caseErrorStatementNode(ErrorStatementNode object) {
				return createErrorStatementNodeAdapter();
			}
			@Override
			public Adapter caseExpandStatementNode(ExpandStatementNode object) {
				return createExpandStatementNodeAdapter();
			}
			@Override
			public Adapter caseExpressionStmtNode(ExpressionStmtNode object) {
				return createExpressionStmtNodeAdapter();
			}
			@Override
			public Adapter caseFileStatementNode(FileStatementNode object) {
				return createFileStatementNodeAdapter();
			}
			@Override
			public Adapter caseForeachStatementNode(ForeachStatementNode object) {
				return createForeachStatementNodeAdapter();
			}
			@Override
			public Adapter caseIfStatementNode(IfStatementNode object) {
				return createIfStatementNodeAdapter();
			}
			@Override
			public Adapter caseElseIfStatementNode(ElseIfStatementNode object) {
				return createElseIfStatementNodeAdapter();
			}
			@Override
			public Adapter caseElseStatementNode(ElseStatementNode object) {
				return createElseStatementNodeAdapter();
			}
			@Override
			public Adapter caseLetStatementNode(LetStatementNode object) {
				return createLetStatementNodeAdapter();
			}
			@Override
			public Adapter caseProtectStatementNode(ProtectStatementNode object) {
				return createProtectStatementNodeAdapter();
			}
			@Override
			public Adapter caseCheckNode(CheckNode object) {
				return createCheckNodeAdapter();
			}
			@Override
			public Adapter caseAroundNode(AroundNode object) {
				return createAroundNodeAdapter();
			}
			@Override
			public Adapter casePointcutNode(PointcutNode object) {
				return createPointcutNodeAdapter();
			}
			@Override
			public Adapter caseExtensionNode(ExtensionNode object) {
				return createExtensionNodeAdapter();
			}
			@Override
			public Adapter caseJavaTypeNode(JavaTypeNode object) {
				return createJavaTypeNodeAdapter();
			}
			@Override
			public Adapter caseTest_expressionNode(Test_expressionNode object) {
				return createTest_expressionNodeAdapter();
			}
			@Override
			public Adapter caseExpressionNode(ExpressionNode object) {
				return createExpressionNodeAdapter();
			}
			@Override
			public Adapter caseLetExpressionNode(LetExpressionNode object) {
				return createLetExpressionNodeAdapter();
			}
			@Override
			public Adapter caseCastedExpressionNode(CastedExpressionNode object) {
				return createCastedExpressionNodeAdapter();
			}
			@Override
			public Adapter caseChainExpressionNode(ChainExpressionNode object) {
				return createChainExpressionNodeAdapter();
			}
			@Override
			public Adapter caseIfExpressionNode(IfExpressionNode object) {
				return createIfExpressionNodeAdapter();
			}
			@Override
			public Adapter caseSwitchExpressionNode(SwitchExpressionNode object) {
				return createSwitchExpressionNodeAdapter();
			}
			@Override
			public Adapter caseCasePartNode(CasePartNode object) {
				return createCasePartNodeAdapter();
			}
			@Override
			public Adapter caseOrExpressionNode(OrExpressionNode object) {
				return createOrExpressionNodeAdapter();
			}
			@Override
			public Adapter caseAndExpressionNode(AndExpressionNode object) {
				return createAndExpressionNodeAdapter();
			}
			@Override
			public Adapter caseImpliesExpressionNode(ImpliesExpressionNode object) {
				return createImpliesExpressionNodeAdapter();
			}
			@Override
			public Adapter caseRelationalExpressionNode(RelationalExpressionNode object) {
				return createRelationalExpressionNodeAdapter();
			}
			@Override
			public Adapter caseAdditiveExpressionNode(AdditiveExpressionNode object) {
				return createAdditiveExpressionNodeAdapter();
			}
			@Override
			public Adapter caseMultiplicativeExpressionNode(MultiplicativeExpressionNode object) {
				return createMultiplicativeExpressionNodeAdapter();
			}
			@Override
			public Adapter caseUnaryExpressionNode(UnaryExpressionNode object) {
				return createUnaryExpressionNodeAdapter();
			}
			@Override
			public Adapter caseInfixExpressionNode(InfixExpressionNode object) {
				return createInfixExpressionNodeAdapter();
			}
			@Override
			public Adapter caseStringLiteralNode(StringLiteralNode object) {
				return createStringLiteralNodeAdapter();
			}
			@Override
			public Adapter caseParanthesizedExpressionNode(ParanthesizedExpressionNode object) {
				return createParanthesizedExpressionNodeAdapter();
			}
			@Override
			public Adapter caseGlobalVarExpressionNode(GlobalVarExpressionNode object) {
				return createGlobalVarExpressionNodeAdapter();
			}
			@Override
			public Adapter caseFeatureCallNode(FeatureCallNode object) {
				return createFeatureCallNodeAdapter();
			}
			@Override
			public Adapter caseListLiteralNode(ListLiteralNode object) {
				return createListLiteralNodeAdapter();
			}
			@Override
			public Adapter caseConstructorCallNode(ConstructorCallNode object) {
				return createConstructorCallNodeAdapter();
			}
			@Override
			public Adapter caseBooleanLiteralNode(BooleanLiteralNode object) {
				return createBooleanLiteralNodeAdapter();
			}
			@Override
			public Adapter caseNullLiteralNode(NullLiteralNode object) {
				return createNullLiteralNodeAdapter();
			}
			@Override
			public Adapter caseNumberLiteralNode(NumberLiteralNode object) {
				return createNumberLiteralNodeAdapter();
			}
			@Override
			public Adapter caseCollectionExpressionNode(CollectionExpressionNode object) {
				return createCollectionExpressionNodeAdapter();
			}
			@Override
			public Adapter caseDeclaredParameterListNode(DeclaredParameterListNode object) {
				return createDeclaredParameterListNodeAdapter();
			}
			@Override
			public Adapter caseDeclaredParameterNode(DeclaredParameterNode object) {
				return createDeclaredParameterNodeAdapter();
			}
			@Override
			public Adapter caseParameterListNode(ParameterListNode object) {
				return createParameterListNodeAdapter();
			}
			@Override
			public Adapter caseCollectionTypeNode(CollectionTypeNode object) {
				return createCollectionTypeNodeAdapter();
			}
			@Override
			public Adapter caseSimpleTypeNode(SimpleTypeNode object) {
				return createSimpleTypeNodeAdapter();
			}
			@Override
			public Adapter caseIdentifierNode(IdentifierNode object) {
				return createIdentifierNodeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseCompositeNode(CompositeNode object) {
				return createCompositeNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileNode <em>File Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FileNode
	 * @generated
	 */
	public Adapter createFileNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode <em>Ns Import Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode
	 * @generated
	 */
	public Adapter createNsImportNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode <em>Definition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode
	 * @generated
	 */
	public Adapter createDefinitionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DefinitionAroundNode <em>Definition Around Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DefinitionAroundNode
	 * @generated
	 */
	public Adapter createDefinitionAroundNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.SequenceNode
	 * @generated
	 */
	public Adapter createSequenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.TextSequenceNode <em>Text Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.TextSequenceNode
	 * @generated
	 */
	public Adapter createTextSequenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.TextNode <em>Text Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.TextNode
	 * @generated
	 */
	public Adapter createTextNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ErrorStatementNode <em>Error Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ErrorStatementNode
	 * @generated
	 */
	public Adapter createErrorStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode <em>Expand Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode
	 * @generated
	 */
	public Adapter createExpandStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpressionStmtNode <em>Expression Stmt Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExpressionStmtNode
	 * @generated
	 */
	public Adapter createExpressionStmtNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode <em>File Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode
	 * @generated
	 */
	public Adapter createFileStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode <em>Foreach Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode
	 * @generated
	 */
	public Adapter createForeachStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfStatementNode <em>If Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.IfStatementNode
	 * @generated
	 */
	public Adapter createIfStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ElseIfStatementNode <em>Else If Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ElseIfStatementNode
	 * @generated
	 */
	public Adapter createElseIfStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ElseStatementNode <em>Else Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ElseStatementNode
	 * @generated
	 */
	public Adapter createElseStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.LetStatementNode <em>Let Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.LetStatementNode
	 * @generated
	 */
	public Adapter createLetStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode <em>Protect Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode
	 * @generated
	 */
	public Adapter createProtectStatementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CheckNode <em>Check Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CheckNode
	 * @generated
	 */
	public Adapter createCheckNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.AroundNode <em>Around Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.AroundNode
	 * @generated
	 */
	public Adapter createAroundNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.PointcutNode <em>Pointcut Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.PointcutNode
	 * @generated
	 */
	public Adapter createPointcutNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode <em>Extension Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode
	 * @generated
	 */
	public Adapter createExtensionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.JavaTypeNode <em>Java Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.JavaTypeNode
	 * @generated
	 */
	public Adapter createJavaTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.Test_expressionNode <em>Test expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Test_expressionNode
	 * @generated
	 */
	public Adapter createTest_expressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpressionNode <em>Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExpressionNode
	 * @generated
	 */
	public Adapter createExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.LetExpressionNode <em>Let Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.LetExpressionNode
	 * @generated
	 */
	public Adapter createLetExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CastedExpressionNode <em>Casted Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CastedExpressionNode
	 * @generated
	 */
	public Adapter createCastedExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ChainExpressionNode <em>Chain Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ChainExpressionNode
	 * @generated
	 */
	public Adapter createChainExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode <em>If Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode
	 * @generated
	 */
	public Adapter createIfExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode <em>Switch Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode
	 * @generated
	 */
	public Adapter createSwitchExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CasePartNode <em>Case Part Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CasePartNode
	 * @generated
	 */
	public Adapter createCasePartNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.OrExpressionNode <em>Or Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.OrExpressionNode
	 * @generated
	 */
	public Adapter createOrExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.AndExpressionNode <em>And Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.AndExpressionNode
	 * @generated
	 */
	public Adapter createAndExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ImpliesExpressionNode <em>Implies Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ImpliesExpressionNode
	 * @generated
	 */
	public Adapter createImpliesExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode <em>Relational Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode
	 * @generated
	 */
	public Adapter createRelationalExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode <em>Additive Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode
	 * @generated
	 */
	public Adapter createAdditiveExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode <em>Multiplicative Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode
	 * @generated
	 */
	public Adapter createMultiplicativeExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.UnaryExpressionNode <em>Unary Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.UnaryExpressionNode
	 * @generated
	 */
	public Adapter createUnaryExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode <em>Infix Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode
	 * @generated
	 */
	public Adapter createInfixExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.StringLiteralNode <em>String Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.StringLiteralNode
	 * @generated
	 */
	public Adapter createStringLiteralNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ParanthesizedExpressionNode <em>Paranthesized Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ParanthesizedExpressionNode
	 * @generated
	 */
	public Adapter createParanthesizedExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.GlobalVarExpressionNode <em>Global Var Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.GlobalVarExpressionNode
	 * @generated
	 */
	public Adapter createGlobalVarExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode <em>Feature Call Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode
	 * @generated
	 */
	public Adapter createFeatureCallNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ListLiteralNode <em>List Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ListLiteralNode
	 * @generated
	 */
	public Adapter createListLiteralNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ConstructorCallNode <em>Constructor Call Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ConstructorCallNode
	 * @generated
	 */
	public Adapter createConstructorCallNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.BooleanLiteralNode <em>Boolean Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.BooleanLiteralNode
	 * @generated
	 */
	public Adapter createBooleanLiteralNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.NullLiteralNode <em>Null Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.NullLiteralNode
	 * @generated
	 */
	public Adapter createNullLiteralNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.NumberLiteralNode <em>Number Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.NumberLiteralNode
	 * @generated
	 */
	public Adapter createNumberLiteralNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CollectionExpressionNode <em>Collection Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CollectionExpressionNode
	 * @generated
	 */
	public Adapter createCollectionExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode <em>Declared Parameter List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode
	 * @generated
	 */
	public Adapter createDeclaredParameterListNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode <em>Declared Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode
	 * @generated
	 */
	public Adapter createDeclaredParameterNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode <em>Parameter List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode
	 * @generated
	 */
	public Adapter createParameterListNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CollectionTypeNode <em>Collection Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CollectionTypeNode
	 * @generated
	 */
	public Adapter createCollectionTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode <em>Simple Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode
	 * @generated
	 */
	public Adapter createSimpleTypeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode <em>Identifier Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode
	 * @generated
	 */
	public Adapter createIdentifierNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.tmf.common.node.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.tmf.common.node.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.tmf.common.node.CompositeNode <em>Composite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.tmf.common.node.CompositeNode
	 * @generated
	 */
	public Adapter createCompositeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Xpand3nodeAdapterFactory
