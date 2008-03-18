package org.eclipse.xpand3.middlend;

import java.io.InputStream;

import org.eclipse.xpand3.File;
import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.ImportStatement;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.declaration.AbstractDeclaration;
import org.eclipse.xpand3.parser.ParseFacade;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.util.Xpand3FileUtil;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.plugins.ImportedResource;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;

/**
 * 
 * @author Jan Köhnlein
 * 
 */
public class Xpand3MiddleEnd implements LanguageSpecificMiddleEnd {

	private ExecutionContext executionContext;
	private TypeSystem frontendTypeSystem = null;
	private MiddleEnd middleEnd;
	private BackendTypesystem backendTypeSystem;
	private Expression2Backend expression2Backend;
	private Declaration2Backend declaration2Backend;
	private Statement2Backend statement2Backend;

	public Xpand3MiddleEnd() {
	}

	public boolean canHandle(String xpandFileName) {
		InputStream xpand3FileAsStream = Xpand3FileUtil.getXpand3FileAsStream(
				xpandFileName, executionContext);
		return xpand3FileAsStream != null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public ParsedResource parseResource(String xpandFileName) {
		try {
			InputStream resourceAsStream = Xpand3FileUtil
					.getXpand3FileAsStream(xpandFileName, executionContext);
			File xpandFile = ParseFacade.parseFile(xpandFileName,
					resourceAsStream);
			ParsedResource parsedResource = new ParsedResource();
			for (AbstractDeclaration declaration : xpandFile.getDeclarations()) {
				Object beDeclaration = declaration2Backend
						.doSwitch(declaration);
				if (beDeclaration instanceof SourceDefinedFunction) {
					SourceDefinedFunction beFunction = (SourceDefinedFunction) beDeclaration;
					NamedFunction namedFunction = new NamedFunction(beFunction
							.getName(), beFunction);
					if (declaration.isIsPrivate()) {
						parsedResource.getPrivateFunctions().add(namedFunction);
					} else {
						parsedResource.getPublicFunctions().add(namedFunction);
					}
				} else if (beDeclaration instanceof AroundAdvice) {
					parsedResource.getAdvice()
							.add((AroundAdvice) beDeclaration);
				}
			}
			for (ImportStatement importStmt : xpandFile.getImports()) {
				ImportedResource beImportedResource = new ImportedResource(
						importStmt.getImportedId().getValue(), importStmt
								.isExported());
				parsedResource.getImports().add(beImportedResource);
			}
			return parsedResource;
		} catch (Exception exc) {
			handleParseError(exc);
			return null;
		}
	}

	private void handleParseError(Exception exc) {
		throw new RuntimeException(exc);
	}

	public void setMiddleEnd(MiddleEnd middleEnd) {
		this.middleEnd = middleEnd;
		executionContext = middleEnd.getExecutionContext();
		backendTypeSystem = middleEnd.getTypesystem();
		expression2Backend = new Expression2Backend(this);
		declaration2Backend = new Declaration2Backend(this);
		statement2Backend = new Statement2Backend(this);
		// TODO: which frontendTypeSystem?
		frontendTypeSystem = TypeSystem.BUILTIN_TYPESYSTEM;
	}

	public BackendType backendTypeForName(Identifier name) {
		DeclaredType dt = frontendTypeSystem.typeForName(name.getValue());
		if (dt == null) {
			handleTransformationError("Couldn't resolve type for name '"
					+ name.getValue() + "'", name);
		}
		BackendType backendType = backendTypeSystem.findType(dt.getUniqueID());
		if (backendType == null) {
			handleTransformationError("No backend type found for ID '"
					+ dt.getUniqueID() + "'", name);
		}
		return backendType;
	}

	public void handleTransformationError(String message, Identifier name) {
		throw new RuntimeException(message);
	}

	public Expression2Backend getExpression2Backend() {
		return expression2Backend;
	}

	public Declaration2Backend getDeclaration2Backend() {
		return declaration2Backend;
	}

	public Statement2Backend getStatement2Backend() {
		return statement2Backend;
	}

}
