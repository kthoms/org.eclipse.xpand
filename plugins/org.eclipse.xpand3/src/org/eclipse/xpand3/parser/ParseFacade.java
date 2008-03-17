package org.eclipse.xpand3.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.tmf.common.node.Node;
import org.eclipse.xpand3.File;
import org.eclipse.xpand3.parser.node2ast.Node2AstTransformer;
import org.eclipse.xpand3.parser.node2ast.TransformationException;

public class ParseFacade {

	public static File parseFile(String fileName, InputStream is)
			throws IOException, RecognitionException, TransformationException {
		ANTLRStringStream stream = new ANTLRInputStream(is);
		Xpand3NodeLexer lexer = new Xpand3NodeLexer(stream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		Xpand3NodeParser xpand3NodeParser = new Xpand3NodeParser(tokenStream);
		Node rootNode = xpand3NodeParser.r_file();
		if (rootNode == null) {
			return null;
		}
		Node2AstTransformer node2AstTransformer = new Node2AstTransformer();
		node2AstTransformer.doSwitch(rootNode);
		File file = (File) rootNode;
		file.setFileName(fileName);
		return file;
	}
}
