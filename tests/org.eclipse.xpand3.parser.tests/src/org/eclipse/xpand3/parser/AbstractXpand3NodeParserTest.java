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

package org.eclipse.xpand3.parser;

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;
import org.eclipse.tmf.common.node.LexedToken;
import org.eclipse.tmf.common.node.Node;

/**
 * @author Jan Köhnlein
 */
public abstract class AbstractXpand3NodeParserTest extends TestCase {

	public static final char LG = '\u00AB';
	public static final char RG = '\u00BB';

	public static final String LGS = String.valueOf(LG);
	public static final String RGS = String.valueOf(RG);

	public AbstractXpand3NodeParserTest() {
		super();
	}

	public AbstractXpand3NodeParserTest(String name) {
		super(name);
	}

	protected String getNodeClassName(String ruleName) {
		return ruleName.substring(0, 1).toUpperCase() + ruleName.substring(1)
				+ "NodeImpl";
	}

	protected CompositeNode checkIsRule(Node node, String ruleName,
			int numChildren) {
		assertTrue(node instanceof CompositeNode);
		String className = node.getClass().getName();
		assertEquals(getNodeClassName(ruleName), className.substring(className
				.lastIndexOf('.') + 1));
		assertEquals(numChildren, ((CompositeNode) node).getChildren().size());
		return (CompositeNode) node;
	}

	private LeafNode checkIsToken(Node node, String tokenText) {
		assertTrue(node instanceof LeafNode);
		LexedToken token = ((LeafNode) node).getToken();
		assertNotNull(token);
		assertEquals(tokenText, token.getText());
		return (LeafNode) node;
	}

	private Node getChild(Node parent, int index) {
		assertNotNull(parent);
		assertTrue(parent instanceof CompositeNode);
		List<Node> children = ((CompositeNode) parent).getChildren();
		assertTrue(children.size() > index);
		Node child = children.get(index);
		return child;
	}

	protected CompositeNode checkChildIsRule(Node parent, int index,
			String ruleName, int numChildren) {
		return checkIsRule(getChild(parent, index), ruleName, numChildren);
	}

	protected CompositeNode checkChildIsSimpleType(Node parent, int index,
			String identifierName) {
		CompositeNode simpleType = checkChildIsRule(parent, index,
				"simpleType", 1);
		checkChildIsIdentifier(simpleType, 0, identifierName);
		return simpleType;
	}

	protected CompositeNode checkChildIsCollectionType(Node parent, int index,
			String identifierName) {
		CompositeNode collectionType = checkChildIsRule(parent, index,
				"collectionType", 1);
		checkChildIsToken(collectionType, 0, identifierName);
		return collectionType;
	}

	protected CompositeNode checkChildIsIdentifier(Node parent, int index,
			String identifierName) {
		CompositeNode identifier = checkChildIsRule(parent, index,
				"identifier", 1);
		checkChildIsToken(identifier, 0, identifierName);
		return identifier;
	}

	protected CompositeNode checkChildIsScopedType(Node parent, int index,
			String... scopeName) {
		CompositeNode scopedType = checkChildIsRule(parent, index,
				"simpleType", 2 * scopeName.length - 1);
		checkChildIsIdentifier(scopedType, 0, scopeName[0]);
		for (int i = 1; i < scopeName.length; i++) {
			checkChildIsToken(scopedType, 2 * i - 1, "::");
			checkChildIsIdentifier(scopedType, 2 * i, scopeName[i]);
		}
		return scopedType;
	}

	protected CompositeNode checkChildIsNumberLiteral(Node parent, int index,
			String value) {
		CompositeNode numberLiteral = checkChildIsRule(parent, index,
				"numberLiteral", 1);
		checkChildIsToken(numberLiteral, 0, value);
		return numberLiteral;
	}

	protected CompositeNode checkChildIsStringLiteral(Node parent, int index,
			String value) {
		CompositeNode stringLiteral = checkChildIsRule(parent, index,
				"stringLiteral", 1);
		checkChildIsToken(stringLiteral, 0, value);
		return stringLiteral;
	}

	protected CompositeNode checkChildIsTrueLiteral(Node parent, int index) {
		CompositeNode booleanLiteral = checkChildIsRule(parent, index,
				"booleanLiteral", 1);
		checkChildIsToken(booleanLiteral, 0, "true");
		return booleanLiteral;
	}

	protected CompositeNode checkChildIsFalseLiteral(Node parent, int index) {
		CompositeNode booleanLiteral = checkChildIsRule(parent, index,
				"booleanLiteral", 1);
		checkChildIsToken(booleanLiteral, 0, "false");
		return booleanLiteral;
	}

	protected LeafNode checkChildIsToken(Node parent, int index,
			String tokenText) {
		return checkIsToken(getChild(parent, index), tokenText);
	}

	protected String tag(final String str) {
		return LG + str + RG;
	}

	protected CompositeNode checkChildIsSequenceText(Node parent, int index,
			String textWithoutGuillemots, int numChildren) {
		CompositeNode sequence = checkChildIsRule(parent, index, "sequence",
				numChildren);
		return checkChildIsText(sequence, 0, textWithoutGuillemots);
	}

	protected CompositeNode checkChildIsText(CompositeNode sequence, int index,
			String textWithoutGuillemots) {
		CompositeNode text = checkChildIsRule(sequence, index, "text", 1);
		checkChildIsToken(text, 0, RGS + textWithoutGuillemots + LGS);
		return sequence;
	}

	protected CompositeNode checkChildIsFeatureCall(CompositeNode parent,
			int index, String identifier) {
		CompositeNode fc = checkChildIsRule(parent, index, "featureCall", 1);
		checkChildIsSimpleType(fc, 0, identifier);
		return fc;
	}

	protected CompositeNode checkChildIsFeatureCallWithCollectionType(
			CompositeNode parent, int index, String identifier) {
		CompositeNode fc = checkChildIsRule(parent, index, "featureCall", 1);
		checkChildIsCollectionType(fc, 0, identifier);
		return fc;
	}

	protected CompositeNode checkChildIsFeatureCallWithScopedType(
			CompositeNode parent, int index, String... identifier) {
		CompositeNode fc = checkChildIsRule(parent, index, "featureCall", 1);
		checkChildIsScopedType(fc, 0, identifier);
		return fc;
	}

}