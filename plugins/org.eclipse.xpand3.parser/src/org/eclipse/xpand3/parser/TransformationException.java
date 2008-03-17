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

import org.eclipse.tmf.common.node.Node;

/**
 * @author Jan Köhnlein
 */
public class TransformationException extends RuntimeException {

	private Node node;

	public TransformationException(String string, Node node) {
		super(string);
		this.node = node;
	}

	public Node getNode() {
		return node;
	}

	private static final long serialVersionUID = 23478901L;

}
