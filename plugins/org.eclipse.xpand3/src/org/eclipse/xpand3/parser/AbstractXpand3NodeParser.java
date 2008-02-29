package org.eclipse.xpand3.parser;

import java.util.Set;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xpand3.node.CompositeNode;
import org.eclipse.xpand3.node.LeafNode;
import org.eclipse.xpand3.node.LexedToken;
import org.eclipse.xpand3.node.Node;
import org.eclipse.xpand3.node.NodeFactory;

public abstract class AbstractXpand3NodeParser extends Xpand3Parser {

	private CompositeNode current = null;
	private Node rootNode = null;

	public AbstractXpand3NodeParser(TokenStream input) {
		super(input);
		setTreeAdaptor(new TreeAdaptor() {

			public void addChild(Object t, Object child) {
			}

			public Object becomeRoot(Object newRoot, Object oldRoot) {
				return null;
			}

			public Object becomeRoot(Token newRoot, Object oldRoot) {
				return null;
			}

			public Object create(Token payload) {
				return null;
			}

			public Object create(int tokenType, Token fromToken) {
				return null;
			}

			public Object create(int tokenType, Token fromToken, String text) {
				return null;
			}

			public Object create(int tokenType, String text) {
				return null;
			}

			public Object dupNode(Object treeNode) {
				return null;
			}

			public Object dupTree(Object tree) {
				return null;
			}

			public Object getChild(Object t, int i) {
				return null;
			}

			public int getChildCount(Object t) {
				return 0;
			}

			public String getText(Object t) {
				return null;
			}

			public Token getToken(Object t) {
				return null;
			}

			public int getTokenStartIndex(Object t) {
				return 0;
			}

			public int getTokenStopIndex(Object t) {
				return 0;
			}

			public int getType(Object t) {
				return 0;
			}

			public int getUniqueID(Object node) {
				return 0;
			}

			public boolean isNil(Object tree) {
				return false;
			}

			public Object nil() {
				return null;
			}

			public Object rulePostProcessing(Object root) {
				return null;
			}

			public void setText(Object t, String text) {
			}

			public void setTokenBoundaries(Object t, Token startToken,
					Token stopToken) {
			}

			public void setType(Object t, int type) {
			}
		});
	}

	protected abstract Set<String> normalizableRules();

	@Override
	public void ruleEntered(String rulename) {
		CompositeNode newOne = NodeFactory.eINSTANCE.createCompositeNode();
		newOne.setRule(rulename);
		newOne.setAlias(next);
		next = null;
		if (current != null) {
			current.getChildren().add(newOne);
		} else {
			rootNode = newOne;
		}
		current = newOne;
	}

	private String next = null;

	@Override
	protected void assignNextNodeTo(String alias) {
		this.next = alias;
	}

	@Override
	public void ruleLeft(String ruleName) {
		CompositeNode parent = (CompositeNode) current.eContainer();
		if (normalizableRules().contains(current.getRule())) {
			EList<Node> children = current.getChildren();
			if (children.isEmpty() && parent == null) {
				rootNode = null;
			} else if (children.size() == 1
					&& (children.get(0) instanceof CompositeNode)) {
				Node child = children.get(0);
				if (parent != null) {
					int i = parent.getChildren().indexOf(current);
					parent.getChildren().remove(i);
					parent.getChildren().add(i, child);
				} else {
					children.remove(0);
					rootNode = child;
				}
			}
		}
		current = parent;
	}

	@Override
	public void reportError(RecognitionException arg0) {
		throw new RuntimeException(getErrorMessage(arg0, getTokenNames()), arg0);
	}

	@Override
	public void tokenConsumed(String var, CommonToken ct) {
		if (ct.getText() != null) {
			LeafNode n = NodeFactory.eINSTANCE.createLeafNode();
			current.getChildren().add(n);
			if (var != null)
				n.setAlias(var);
			LexedToken myToken = NodeFactory.eINSTANCE.createLexedToken();
			n.setToken(myToken);
			myToken.setText(ct.getText());
			myToken.setStart(ct.getStartIndex());
			myToken.setEnd(ct.getStopIndex() + 1);
			myToken.setLine(ct.getLine());
		}
	}

	public Node getRootNode() {
		return rootNode;
	}

}