package org.eclipse.xpand3.parser.node2ast;

import org.eclipse.tmf.common.node.Node;

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
