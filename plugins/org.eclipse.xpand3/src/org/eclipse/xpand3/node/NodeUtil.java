package org.eclipse.xpand3.node;

public class NodeUtil {
	public static int start(CompositeNode n) {
		if (n.getChildren().isEmpty()) {
			return -1;
		}
		return n.getChildren().get(0).start();
	}

	public static int end(CompositeNode n) {
		if (n.getChildren().isEmpty()) {
			return -1;
		}
		return n.getChildren().get(n.getChildren().size() - 1).end();
	}

	public static int line(CompositeNode n) {
		if (n.getChildren().isEmpty()) {
			return -1;
		}
		return n.getChildren().get(0).line();
	}

	public static String text(CompositeNode cn) {
		StringBuffer buff = new StringBuffer();
		for (Node n : cn.getChildren()) {
			buff.append(n.text());
		}
		return buff.toString();
	}

	public static int start(LeafNode ln) {
		return ln.getToken().getStart();
	}

	public static int end(LeafNode ln) {
		return ln.getToken().getEnd();
	}

	public static int line(LeafNode ln) {
		return ln.getToken().getLine();
	}

	public static String text(LeafNode ln) {
		return ln.getToken().getText();
	}

	public static String toString(Node n) {
		if (n instanceof CompositeNode) {
			return toString((CompositeNode) n);
		} else if (n instanceof LeafNode) {
			return toString((LeafNode) n);
		}
		throw new IllegalArgumentException();
	}

	public static String toString(CompositeNode n) {
		String s = indent(n)+(n.getAlias()!=null?n.getAlias()+"=":"")+"Rule: "+n.getRule()+"\n";
		for (Node node : n.getChildren()) {
			s += toString(node);
		}
		return s;
	}

	public static String toString(LeafNode n) {
		return indent(n)+(n.getAlias()!=null?n.getAlias()+"=":"")+n.getToken().getText()+"\n";
	}

	private static String indent(Node n) {
		return n.eContainer() == null ? "" : "\t"
				+ indent((Node) n.eContainer());
	}

	public static String serialize(Node n) {
		if (n instanceof CompositeNode) {
			return serialize((CompositeNode) n);
		} else if (n instanceof LeafNode) {
			return serialize((LeafNode) n);
		}
		throw new IllegalArgumentException();
	}

	public static String serialize(CompositeNode n) {
		String s = "";
		for (Node node : n.getChildren()) {
			s += serialize(node);
		}
		return s;
	}

	public static String serialize(LeafNode n) {
		return n.getToken().getText() + "\n";
	}

}
