package org.eclipse.xpand3.parser.node2ast;

import java.util.Iterator;
import java.util.List;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.Node;

public class ChildrenRuleIterator implements Iterator<CompositeNode> {
	private int ruleID;

	private List<Node> children;

	private int index = 0;

	private CompositeNode nextMatch;

	public ChildrenRuleIterator(Node node, int ruleID) {
		if (!(node instanceof CompositeNode)) {
			throw new IllegalArgumentException();
		}
		this.ruleID = ruleID;
		this.children = ((CompositeNode) node).getChildren();
		this.index = 0;
		findNextMatch();
	}

	private void findNextMatch() {
		while (index < children.size()) {
			Node node = children.get(index);
			if ((node instanceof CompositeNode)
					&& ruleID == ((CompositeNode) node).getRuleID()) {
				nextMatch = (CompositeNode) node;
				return;
			}
			++index;
		}
		nextMatch = null;
	}

	public boolean hasNext() {
		return nextMatch != null;
	}

	public CompositeNode next() {
		CompositeNode currentMatch = nextMatch;
		++index;
		findNextMatch();
		return currentMatch;
	}

	public void remove() {
		children.remove(index);
	}
}
