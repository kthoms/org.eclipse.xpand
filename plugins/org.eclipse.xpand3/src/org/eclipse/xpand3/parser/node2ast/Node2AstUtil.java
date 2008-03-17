/*******************************************************************************
 * <copyright>
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * committers of openArchitectureWare - initial API and implementation
 * </copyright>
 *******************************************************************************/

package org.eclipse.xpand3.parser.node2ast;

import java.util.List;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.Node;
import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.BinaryOperation;
import org.eclipse.xpand3.expression.ExpressionFactory;

/**
 * @author Jan Köhnlein
 */
public class Node2AstUtil {

	public static SyntaxElement createBinaryOperationChainFromList(
			CompositeNode expressionNode, Node firstOperandNode,
			List<? extends Node> nextOperandNodes,
			Node2AstTransformer transformer) {
		BinaryOperation binaryOperation = ExpressionFactory.eINSTANCE
				.createBinaryOperation();
		transformer.setPosition(binaryOperation, firstOperandNode);
		binaryOperation.setLeft((AbstractExpression) transformer
				.doSwitch(firstOperandNode));
		binaryOperation.setOperator(transformer.createIdentifier(expressionNode
				.getChildren().get(1)));
		BinaryOperation currentLeft = binaryOperation;
		for (int i = 0; i < nextOperandNodes.size() - 1; ++i) {
			Node nextOperandNode = nextOperandNodes.get(i);
			BinaryOperation nextBinaryOperation = ExpressionFactory.eINSTANCE
					.createBinaryOperation();
			transformer.setPosition(nextBinaryOperation, nextOperandNode);
			nextBinaryOperation.setLeft((AbstractExpression) transformer
					.doSwitch(nextOperandNode));
			nextBinaryOperation.setOperator(transformer
					.createIdentifier(expressionNode.getChildren().get(
							2 * i + 3)));
			currentLeft.setRight(nextBinaryOperation);
			currentLeft = nextBinaryOperation;
		}
		currentLeft.setRight((AbstractExpression) transformer
				.doSwitch(nextOperandNodes.get(nextOperandNodes.size() - 1)));
		return binaryOperation;
	}
}
