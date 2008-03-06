package org.eclipse.xpand3.parser.node2ast;

import java.util.Iterator;
import java.util.List;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.Node;

public class ChildrenAliasIterator implements Iterator<Node> {
	private String alias;

	private List<Node> children;

	private int index = 0;

	private Node nextMatch;

	public ChildrenAliasIterator(Node node, String alias) {
		if (!(node instanceof CompositeNode)) {
			throw new IllegalArgumentException();
		}
		this.alias = alias;
		this.children = ((CompositeNode) node).getChildren();
		this.index = 0;
		findNextMatch();
	}

	private void findNextMatch() {
		while (index < children.size()) {
			Node node = children.get(index);
			if (alias.equals(node.getAlias())) {
				nextMatch = node;
				return;
			}
			++index;
		}
		nextMatch = null;
	}

	public boolean hasNext() {
		return nextMatch != null;
	}

	public Node next() {
		Node currentMatch = nextMatch;
		++index;
		findNextMatch();
		return currentMatch;
	}

	public void remove() {
		children.remove(index);
	}
}
