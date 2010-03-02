// $ANTLR 3.0.1 src/org/eclipse/internal/xpand2/parser/Xpand.g 2010-02-12 18:22:32
 	
package org.eclipse.internal.xpand2.parser; 
	
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.DFA;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.internal.xpand2.ast.Advice;
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.ErrorStatement;
import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.internal.xpand2.ast.ExpressionStatement;
import org.eclipse.internal.xpand2.ast.ExtensionImportDeclaration;
import org.eclipse.internal.xpand2.ast.FileStatement;
import org.eclipse.internal.xpand2.ast.ForEachStatement;
import org.eclipse.internal.xpand2.ast.IfStatement;
import org.eclipse.internal.xpand2.ast.ImportDeclaration;
import org.eclipse.internal.xpand2.ast.LetStatement;
import org.eclipse.internal.xpand2.ast.ProtectStatement;
import org.eclipse.internal.xpand2.ast.Statement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.GlobalVarExpression;
import org.eclipse.internal.xtend.expression.ast.Identifier;

@SuppressWarnings ({"unused","unchecked"})
public class XpandParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LG", "COMMENT", "TEXT", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "ML_COMMENT", "LINE_COMMENT", "RG", "VOCAB", "'IMPORT'", "'EXTENSION'", "'AROUND'", "'('", "','", "'*'", "')'", "'FOR'", "'ENDAROUND'", "'::'", "'DEFINE'", "'ENDDEFINE'", "'-'", "'ERROR'", "'EXPAND'", "'FOREACH'", "'SEPARATOR'", "'ONFILECLOSE'", "'FILE'", "'ENDFILE'", "'AS'", "'ITERATOR'", "'ENDFOREACH'", "'IF'", "'ENDIF'", "'ELSEIF'", "'ELSE'", "'LET'", "'ENDLET'", "'PROTECT'", "'CSTART'", "'CEND'", "'ID'", "'DISABLE'", "'ENDPROTECT'", "'let'", "'='", "':'", "'->'", "'?'", "'if'", "'then'", "'else'", "'switch'", "'{'", "'case'", "'default'", "'}'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'/'", "'!'", "'.'", "'GLOBALVAR'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'", "'Collection'", "'List'", "'Set'", "'['", "']'"
    };
    public static final int IntLiteral=8;
    public static final int Identifier=9;
    public static final int HexDigit=13;
    public static final int WS=16;
    public static final int RG=19;
    public static final int COMMENT=5;
    public static final int StringLiteral=7;
    public static final int LINE_COMMENT=18;
    public static final int JavaIDDigit=15;
    public static final int Letter=14;
    public static final int UnicodeEscape=11;
    public static final int EscapeSequence=10;
    public static final int VOCAB=20;
    public static final int EOF=-1;
    public static final int TEXT=6;
    public static final int OctalEscape=12;
    public static final int ML_COMMENT=17;
    public static final int LG=4;

        public XpandParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[54+1];
         }
        

    @Override
	public String[] getTokenNames() { return tokenNames; }
    @Override
	public String getGrammarFileName() { return "src/org/eclipse/internal/xpand2/parser/Xpand.g"; }


    	private XpandFactory factory;
    	
    	public XpandParser(TokenStream stream, XpandFactory factory) {
    		this(stream);
    		this.factory = factory;
    	}
    	
    	protected Identifier id(Token t) {
    		if (t == null)
    			return null;
    		CommonToken ct = (CommonToken) t;
    		Identifier id = new Identifier(t.getText());
    		id.setStart(ct.getStartIndex());
    		id.setEnd(ct.getStopIndex());
    		id.setLine(ct.getLine());
    		return id;
    	}



    // $ANTLR start template
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:44:1: template returns [Template t] : ( LG ( COMMENT TEXT )* ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )* ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )* | );
    public Template template() throws RecognitionException {
        Template t = null;

        ImportDeclaration imp = null;

        ExtensionImportDeclaration extimp = null;

        Definition d = null;

        Advice a = null;


        List imports = new ArrayList(),extensions = new ArrayList(), defines = new ArrayList(), advices = new ArrayList();
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:45:123: ( LG ( COMMENT TEXT )* ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )* ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )* | )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LG) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("44:1: template returns [Template t] : ( LG ( COMMENT TEXT )* ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )* ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )* | );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:46:2: LG ( COMMENT TEXT )* ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )* ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )*
                    {
                    match(input,LG,FOLLOW_LG_in_template47); if (failed) return t;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:47:3: ( COMMENT TEXT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COMMENT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:47:4: COMMENT TEXT
                    	    {
                    	    match(input,COMMENT,FOLLOW_COMMENT_in_template52); if (failed) return t;
                    	    match(input,TEXT,FOLLOW_TEXT_in_template54); if (failed) return t;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:3: ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:4: (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )*
                    	    {
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:4: (imp= anImport | extimp= anExtensionImport )
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( (LA2_0==21) ) {
                    	        alt2=1;
                    	    }
                    	    else if ( (LA2_0==22) ) {
                    	        alt2=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return t;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("48:4: (imp= anImport | extimp= anExtensionImport )", 2, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:5: imp= anImport
                    	            {
                    	            pushFollow(FOLLOW_anImport_in_template64);
                    	            imp=anImport();
                    	            _fsp--;
                    	            if (failed) return t;
                    	            if ( backtracking==0 ) {
                    	              imports.add(imp);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:41: extimp= anExtensionImport
                    	            {
                    	            pushFollow(FOLLOW_anExtensionImport_in_template73);
                    	            extimp=anExtensionImport();
                    	            _fsp--;
                    	            if (failed) return t;
                    	            if ( backtracking==0 ) {
                    	              extensions.add(extimp);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    match(input,TEXT,FOLLOW_TEXT_in_template78); if (failed) return t;
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:98: ( COMMENT TEXT )*
                    	    loop3:
                    	    do {
                    	        int alt3=2;
                    	        int LA3_0 = input.LA(1);

                    	        if ( (LA3_0==COMMENT) ) {
                    	            alt3=1;
                    	        }


                    	        switch (alt3) {
                    	    	case 1 :
                    	    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:99: COMMENT TEXT
                    	    	    {
                    	    	    match(input,COMMENT,FOLLOW_COMMENT_in_template81); if (failed) return t;
                    	    	    match(input,TEXT,FOLLOW_TEXT_in_template83); if (failed) return t;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop3;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:3: ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==23||LA7_0==31) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:4: (d= define | a= around ) TEXT ( COMMENT TEXT )*
                    	    {
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:4: (d= define | a= around )
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==31) ) {
                    	        alt5=1;
                    	    }
                    	    else if ( (LA5_0==23) ) {
                    	        alt5=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return t;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("49:4: (d= define | a= around )", 5, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:5: d= define
                    	            {
                    	            pushFollow(FOLLOW_define_in_template95);
                    	            d=define();
                    	            _fsp--;
                    	            if (failed) return t;
                    	            if ( backtracking==0 ) {
                    	              defines.add(d);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:33: a= around
                    	            {
                    	            pushFollow(FOLLOW_around_in_template102);
                    	            a=around();
                    	            _fsp--;
                    	            if (failed) return t;
                    	            if ( backtracking==0 ) {
                    	              advices.add(a);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    match(input,TEXT,FOLLOW_TEXT_in_template106); if (failed) return t;
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:65: ( COMMENT TEXT )*
                    	    loop6:
                    	    do {
                    	        int alt6=2;
                    	        int LA6_0 = input.LA(1);

                    	        if ( (LA6_0==COMMENT) ) {
                    	            alt6=1;
                    	        }


                    	        switch (alt6) {
                    	    	case 1 :
                    	    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:66: COMMENT TEXT
                    	    	    {
                    	    	    match(input,COMMENT,FOLLOW_COMMENT_in_template109); if (failed) return t;
                    	    	    match(input,TEXT,FOLLOW_TEXT_in_template111); if (failed) return t;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop6;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    if ( backtracking==0 ) {
                      t = factory.createTemplate(imports,extensions,defines,advices);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:52:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end template


    // $ANTLR start anImport
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:54:1: anImport returns [ImportDeclaration imp] : 'IMPORT' id= simpleType ;
    public ImportDeclaration anImport() throws RecognitionException {
        ImportDeclaration imp = null;

        Identifier id = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:54:42: ( 'IMPORT' id= simpleType )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:55:2: 'IMPORT' id= simpleType
            {
            match(input,21,FOLLOW_21_in_anImport137); if (failed) return imp;
            pushFollow(FOLLOW_simpleType_in_anImport141);
            id=simpleType();
            _fsp--;
            if (failed) return imp;
            if ( backtracking==0 ) {
              imp = factory.createImportDeclaration(id);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return imp;
    }
    // $ANTLR end anImport


    // $ANTLR start anExtensionImport
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:58:1: anExtensionImport returns [ExtensionImportDeclaration imp] : 'EXTENSION' id= simpleType ;
    public ExtensionImportDeclaration anExtensionImport() throws RecognitionException {
        ExtensionImportDeclaration imp = null;

        Identifier id = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:58:59: ( 'EXTENSION' id= simpleType )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:59:2: 'EXTENSION' id= simpleType
            {
            match(input,22,FOLLOW_22_in_anExtensionImport156); if (failed) return imp;
            pushFollow(FOLLOW_simpleType_in_anExtensionImport160);
            id=simpleType();
            _fsp--;
            if (failed) return imp;
            if ( backtracking==0 ) {
              imp = factory.createExtensionImportDeclaration(id);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return imp;
    }
    // $ANTLR end anExtensionImport


    // $ANTLR start around
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:62:1: around returns [Advice a] : 'AROUND' pc= pointcut ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )? 'FOR' t= type s= sequence 'ENDAROUND' ;
    public Advice around() throws RecognitionException {
        Advice a = null;

        Token wildparams=null;
        Identifier pc = null;

        List<DeclaredParameter> p = null;

        Identifier t = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:62:27: ( 'AROUND' pc= pointcut ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )? 'FOR' t= type s= sequence 'ENDAROUND' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:63:4: 'AROUND' pc= pointcut ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )? 'FOR' t= type s= sequence 'ENDAROUND'
            {
            match(input,23,FOLLOW_23_in_around178); if (failed) return a;
            pushFollow(FOLLOW_pointcut_in_around182);
            pc=pointcut();
            _fsp--;
            if (failed) return a;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:4: ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:5: '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')'
                    {
                    match(input,24,FOLLOW_24_in_around188); if (failed) return a;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:9: (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==Identifier||(LA10_0>=97 && LA10_0<=99)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==26) ) {
                        alt10=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return a;}
                        NoViableAltException nvae =
                            new NoViableAltException("64:9: (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:10: p= declaredParameterList ( ',' wildparams= '*' )?
                            {
                            pushFollow(FOLLOW_declaredParameterList_in_around193);
                            p=declaredParameterList();
                            _fsp--;
                            if (failed) return a;
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:34: ( ',' wildparams= '*' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==25) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:35: ',' wildparams= '*'
                                    {
                                    match(input,25,FOLLOW_25_in_around196); if (failed) return a;
                                    wildparams=input.LT(1);
                                    match(input,26,FOLLOW_26_in_around200); if (failed) return a;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:59: wildparams= '*'
                            {
                            wildparams=input.LT(1);
                            match(input,26,FOLLOW_26_in_around209); if (failed) return a;

                            }
                            break;

                    }

                    match(input,27,FOLLOW_27_in_around213); if (failed) return a;

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_around217); if (failed) return a;
            pushFollow(FOLLOW_type_in_around221);
            t=type();
            _fsp--;
            if (failed) return a;
            pushFollow(FOLLOW_sequence_in_around229);
            s=sequence();
            _fsp--;
            if (failed) return a;
            match(input,29,FOLLOW_29_in_around234); if (failed) return a;
            if ( backtracking==0 ) {
               a = factory.createAround(pc,p,wildparams!=null,t,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end around


    // $ANTLR start pointcut
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:70:1: pointcut returns [Identifier i] : (x= '*' | i1= identifier ) (x1= '*' | n1= identifier | dc= '::' )* ;
    public Identifier pointcut() throws RecognitionException {
        Identifier i = null;

        Token x=null;
        Token x1=null;
        Token dc=null;
        Identifier i1 = null;

        Identifier n1 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:70:33: ( (x= '*' | i1= identifier ) (x1= '*' | n1= identifier | dc= '::' )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:71:2: (x= '*' | i1= identifier ) (x1= '*' | n1= identifier | dc= '::' )*
            {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:71:2: (x= '*' | i1= identifier )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==Identifier) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return i;}
                NoViableAltException nvae =
                    new NoViableAltException("71:2: (x= '*' | i1= identifier )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:71:3: x= '*'
                    {
                    x=input.LT(1);
                    match(input,26,FOLLOW_26_in_pointcut256); if (failed) return i;
                    if ( backtracking==0 ) {
                      i = id(x);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:71:23: i1= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_pointcut262);
                    i1=identifier();
                    _fsp--;
                    if (failed) return i;
                    if ( backtracking==0 ) {
                      i = i1;
                    }

                    }
                    break;

            }

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:72:2: (x1= '*' | n1= identifier | dc= '::' )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt13=1;
                    }
                    break;
                case Identifier:
                    {
                    alt13=2;
                    }
                    break;
                case 30:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:72:3: x1= '*'
            	    {
            	    x1=input.LT(1);
            	    match(input,26,FOLLOW_26_in_pointcut271); if (failed) return i;
            	    if ( backtracking==0 ) {
            	      i.append(id(x1));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:72:31: n1= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_pointcut277);
            	    n1=identifier();
            	    _fsp--;
            	    if (failed) return i;
            	    if ( backtracking==0 ) {
            	      i.append(n1);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:72:62: dc= '::'
            	    {
            	    dc=input.LT(1);
            	    match(input,30,FOLLOW_30_in_pointcut283); if (failed) return i;
            	    if ( backtracking==0 ) {
            	      i.append(id(dc));
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end pointcut


    // $ANTLR start define
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:75:1: define returns [Definition d] : 'DEFINE' name= identifier ( '(' p= declaredParameterList ')' )? 'FOR' t= type s= sequence 'ENDDEFINE' ;
    public Definition define() throws RecognitionException {
        Definition d = null;

        Identifier name = null;

        List<DeclaredParameter> p = null;

        Identifier t = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:75:31: ( 'DEFINE' name= identifier ( '(' p= declaredParameterList ')' )? 'FOR' t= type s= sequence 'ENDDEFINE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:76:4: 'DEFINE' name= identifier ( '(' p= declaredParameterList ')' )? 'FOR' t= type s= sequence 'ENDDEFINE'
            {
            match(input,31,FOLLOW_31_in_define303); if (failed) return d;
            pushFollow(FOLLOW_identifier_in_define307);
            name=identifier();
            _fsp--;
            if (failed) return d;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:76:29: ( '(' p= declaredParameterList ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:76:30: '(' p= declaredParameterList ')'
                    {
                    match(input,24,FOLLOW_24_in_define310); if (failed) return d;
                    pushFollow(FOLLOW_declaredParameterList_in_define314);
                    p=declaredParameterList();
                    _fsp--;
                    if (failed) return d;
                    match(input,27,FOLLOW_27_in_define316); if (failed) return d;

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_define320); if (failed) return d;
            pushFollow(FOLLOW_type_in_define324);
            t=type();
            _fsp--;
            if (failed) return d;
            pushFollow(FOLLOW_sequence_in_define332);
            s=sequence();
            _fsp--;
            if (failed) return d;
            match(input,32,FOLLOW_32_in_define338); if (failed) return d;
            if ( backtracking==0 ) {
               d = factory.createDefinition(name,p,t,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end define


    // $ANTLR start sequence
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:82:1: sequence returns [List<Statement> s=new ArrayList<Statement>()] : s1= textSequence (s2= statement s1= textSequence )* ;
    public List<Statement> sequence() throws RecognitionException {
        List<Statement> s = new ArrayList<Statement>();

        List<Statement> s1 = null;

        Statement s2 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:82:65: (s1= textSequence (s2= statement s1= textSequence )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:83:3: s1= textSequence (s2= statement s1= textSequence )*
            {
            pushFollow(FOLLOW_textSequence_in_sequence361);
            s1=textSequence();
            _fsp--;
            if (failed) return s;
            if ( backtracking==0 ) {
              s.addAll(s1);
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:84:3: (s2= statement s1= textSequence )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=StringLiteral && LA15_0<=Identifier)||LA15_0==24||(LA15_0>=33 && LA15_0<=36)||LA15_0==39||LA15_0==44||LA15_0==48||LA15_0==50||LA15_0==56||LA15_0==61||(LA15_0>=64 && LA15_0<=65)||LA15_0==80||(LA15_0>=82 && LA15_0<=95)||(LA15_0>=97 && LA15_0<=99)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:84:4: s2= statement s1= textSequence
            	    {
            	    pushFollow(FOLLOW_statement_in_sequence370);
            	    s2=statement();
            	    _fsp--;
            	    if (failed) return s;
            	    if ( backtracking==0 ) {
            	      s.add(s2);
            	    }
            	    pushFollow(FOLLOW_textSequence_in_sequence379);
            	    s1=textSequence();
            	    _fsp--;
            	    if (failed) return s;
            	    if ( backtracking==0 ) {
            	      s.addAll(s1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end sequence


    // $ANTLR start statement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:93:1: statement returns [Statement s] : (s1= simpleStatement | s2= fileStatement | s3= foreachStatement | s4= ifStatement | s5= letStatement | s6= protectStatement );
    public Statement statement() throws RecognitionException {
        Statement s = null;

        Statement s1 = null;

        FileStatement s2 = null;

        ForEachStatement s3 = null;

        IfStatement s4 = null;

        LetStatement s5 = null;

        ProtectStatement s6 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:93:33: (s1= simpleStatement | s2= fileStatement | s3= foreachStatement | s4= ifStatement | s5= letStatement | s6= protectStatement )
            int alt16=6;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 24:
            case 33:
            case 34:
            case 35:
            case 56:
            case 61:
            case 64:
            case 65:
            case 80:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 98:
            case 99:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 44:
                {
                alt16=4;
                }
                break;
            case 48:
                {
                alt16=5;
                }
                break;
            case 50:
                {
                alt16=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("93:1: statement returns [Statement s] : (s1= simpleStatement | s2= fileStatement | s3= foreachStatement | s4= ifStatement | s5= letStatement | s6= protectStatement );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:94:3: s1= simpleStatement
                    {
                    pushFollow(FOLLOW_simpleStatement_in_statement409);
                    s1=simpleStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s1;
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:95:3: s2= fileStatement
                    {
                    pushFollow(FOLLOW_fileStatement_in_statement417);
                    s2=fileStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s2;
                    }

                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:96:3: s3= foreachStatement
                    {
                    pushFollow(FOLLOW_foreachStatement_in_statement425);
                    s3=foreachStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s3;
                    }

                    }
                    break;
                case 4 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:97:3: s4= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement433);
                    s4=ifStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s4;
                    }

                    }
                    break;
                case 5 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:98:3: s5= letStatement
                    {
                    pushFollow(FOLLOW_letStatement_in_statement441);
                    s5=letStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s5;
                    }

                    }
                    break;
                case 6 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:99:3: s6= protectStatement
                    {
                    pushFollow(FOLLOW_protectStatement_in_statement449);
                    s6=protectStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s6;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end statement


    // $ANTLR start textSequence
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:102:1: textSequence returns [List<Statement> s=new ArrayList<Statement>();] : t= text ( COMMENT t1= text )* ;
    public List<Statement> textSequence() throws RecognitionException {
        List<Statement> s = new ArrayList<Statement>();;

        Statement t = null;

        Statement t1 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:102:70: (t= text ( COMMENT t1= text )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:103:2: t= text ( COMMENT t1= text )*
            {
            pushFollow(FOLLOW_text_in_textSequence468);
            t=text();
            _fsp--;
            if (failed) return s;
            if ( backtracking==0 ) {
              s.add(t);
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:104:3: ( COMMENT t1= text )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:104:4: COMMENT t1= text
            	    {
            	    match(input,COMMENT,FOLLOW_COMMENT_in_textSequence475); if (failed) return s;
            	    pushFollow(FOLLOW_text_in_textSequence479);
            	    t1=text();
            	    _fsp--;
            	    if (failed) return s;
            	    if ( backtracking==0 ) {
            	      s.add(t1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end textSequence


    // $ANTLR start text
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:107:1: text returns [Statement s] : (m= '-' )? t= TEXT ;
    public Statement text() throws RecognitionException {
        Statement s = null;

        Token m=null;
        Token t=null;

        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:107:28: ( (m= '-' )? t= TEXT )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:108:2: (m= '-' )? t= TEXT
            {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:108:2: (m= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:108:3: m= '-'
                    {
                    m=input.LT(1);
                    match(input,33,FOLLOW_33_in_text500); if (failed) return s;

                    }
                    break;

            }

            t=input.LT(1);
            match(input,TEXT,FOLLOW_TEXT_in_text506); if (failed) return s;
            if ( backtracking==0 ) {
              s = factory.createTextStatement(id(t),id(m));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end text


    // $ANTLR start simpleStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:111:1: simpleStatement returns [Statement s] : (s1= errorStatement | s2= expandStatement | s3= expressionStmt );
    public Statement simpleStatement() throws RecognitionException {
        Statement s = null;

        ErrorStatement s1 = null;

        ExpandStatement s2 = null;

        ExpressionStatement s3 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:111:39: (s1= errorStatement | s2= expandStatement | s3= expressionStmt )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 24:
            case 33:
            case 56:
            case 61:
            case 64:
            case 65:
            case 80:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 98:
            case 99:
                {
                alt19=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("111:1: simpleStatement returns [Statement s] : (s1= errorStatement | s2= expandStatement | s3= expressionStmt );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:112:3: s1= errorStatement
                    {
                    pushFollow(FOLLOW_errorStatement_in_simpleStatement525);
                    s1=errorStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s1;
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:113:3: s2= expandStatement
                    {
                    pushFollow(FOLLOW_expandStatement_in_simpleStatement533);
                    s2=expandStatement();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s2;
                    }

                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:114:3: s3= expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_simpleStatement541);
                    s3=expressionStmt();
                    _fsp--;
                    if (failed) return s;
                    if ( backtracking==0 ) {
                      s =s3;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end simpleStatement


    // $ANTLR start errorStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:117:1: errorStatement returns [ErrorStatement e] : 'ERROR' expr= expression ;
    public ErrorStatement errorStatement() throws RecognitionException {
        ErrorStatement e = null;

        Expression expr = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:117:43: ( 'ERROR' expr= expression )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:118:3: 'ERROR' expr= expression
            {
            match(input,34,FOLLOW_34_in_errorStatement558); if (failed) return e;
            pushFollow(FOLLOW_expression_in_errorStatement562);
            expr=expression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = factory.createErrorStatement(expr); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end errorStatement


    // $ANTLR start expandStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:121:1: expandStatement returns [ExpandStatement e] : 'EXPAND' t= definitionName ( '(' pl= parameterList ')' )? ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )? (onFileClose= 'ONFILECLOSE' )? ;
    public ExpandStatement expandStatement() throws RecognitionException {
        ExpandStatement e = null;

        Token fe=null;
        Token onFileClose=null;
        Identifier t = null;

        List<Expression> pl = null;

        Expression expr = null;

        Expression sep = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:121:45: ( 'EXPAND' t= definitionName ( '(' pl= parameterList ')' )? ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )? (onFileClose= 'ONFILECLOSE' )? )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:122:3: 'EXPAND' t= definitionName ( '(' pl= parameterList ')' )? ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )? (onFileClose= 'ONFILECLOSE' )?
            {
            match(input,35,FOLLOW_35_in_expandStatement579); if (failed) return e;
            pushFollow(FOLLOW_definitionName_in_expandStatement583);
            t=definitionName();
            _fsp--;
            if (failed) return e;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:122:29: ( '(' pl= parameterList ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:122:30: '(' pl= parameterList ')'
                    {
                    match(input,24,FOLLOW_24_in_expandStatement586); if (failed) return e;
                    pushFollow(FOLLOW_parameterList_in_expandStatement590);
                    pl=parameterList();
                    _fsp--;
                    if (failed) return e;
                    match(input,27,FOLLOW_27_in_expandStatement592); if (failed) return e;

                    }
                    break;

            }

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:122:57: ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:122:58: ( 'FOR' expr= expression )
                    {
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:122:58: ( 'FOR' expr= expression )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:122:59: 'FOR' expr= expression
                    {
                    match(input,28,FOLLOW_28_in_expandStatement598); if (failed) return e;
                    pushFollow(FOLLOW_expression_in_expandStatement602);
                    expr=expression();
                    _fsp--;
                    if (failed) return e;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:123:5: (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? )
                    {
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:123:5: (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:123:6: fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )?
                    {
                    fe=input.LT(1);
                    match(input,36,FOLLOW_36_in_expandStatement612); if (failed) return e;
                    pushFollow(FOLLOW_expression_in_expandStatement616);
                    expr=expression();
                    _fsp--;
                    if (failed) return e;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:123:35: ( 'SEPARATOR' sep= expression )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==37) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:123:36: 'SEPARATOR' sep= expression
                            {
                            match(input,37,FOLLOW_37_in_expandStatement619); if (failed) return e;
                            pushFollow(FOLLOW_expression_in_expandStatement623);
                            sep=expression();
                            _fsp--;
                            if (failed) return e;

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:124:3: (onFileClose= 'ONFILECLOSE' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:124:4: onFileClose= 'ONFILECLOSE'
                    {
                    onFileClose=input.LT(1);
                    match(input,38,FOLLOW_38_in_expandStatement635); if (failed) return e;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              e = factory.createExpandStatement(t,pl,expr,fe!=null,sep,onFileClose!=null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end expandStatement


    // $ANTLR start definitionName
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:129:1: definitionName returns [Identifier id] : id1= simpleType ;
    public Identifier definitionName() throws RecognitionException {
        Identifier id = null;

        Identifier id1 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:129:40: (id1= simpleType )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:130:2: id1= simpleType
            {
            pushFollow(FOLLOW_simpleType_in_definitionName662);
            id1=simpleType();
            _fsp--;
            if (failed) return id;
            if ( backtracking==0 ) {
              id =id1;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end definitionName


    // $ANTLR start expressionStmt
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:133:1: expressionStmt returns [ExpressionStatement es] : e= expression ;
    public ExpressionStatement expressionStmt() throws RecognitionException {
        ExpressionStatement es = null;

        Expression e = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:133:49: (e= expression )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:134:2: e= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt680);
            e=expression();
            _fsp--;
            if (failed) return es;
            if ( backtracking==0 ) {
              es = factory.createExpressionStatement(e);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return es;
    }
    // $ANTLR end expressionStmt


    // $ANTLR start fileStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:137:1: fileStatement returns [FileStatement f] : 'FILE' e= expression (option= identifier )? s= sequence 'ENDFILE' ;
    public FileStatement fileStatement() throws RecognitionException {
        FileStatement f = null;

        Expression e = null;

        Identifier option = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:137:41: ( 'FILE' e= expression (option= identifier )? s= sequence 'ENDFILE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:138:2: 'FILE' e= expression (option= identifier )? s= sequence 'ENDFILE'
            {
            match(input,39,FOLLOW_39_in_fileStatement696); if (failed) return f;
            pushFollow(FOLLOW_expression_in_fileStatement700);
            e=expression();
            _fsp--;
            if (failed) return f;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:138:22: (option= identifier )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Identifier) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:138:23: option= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_fileStatement705);
                    option=identifier();
                    _fsp--;
                    if (failed) return f;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_fileStatement713);
            s=sequence();
            _fsp--;
            if (failed) return f;
            match(input,40,FOLLOW_40_in_fileStatement717); if (failed) return f;
            if ( backtracking==0 ) {
              f = factory.createFileStatement(e,option,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return f;
    }
    // $ANTLR end fileStatement


    // $ANTLR start foreachStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:144:1: foreachStatement returns [ForEachStatement f] : 'FOREACH' e= expression 'AS' v= identifier ( 'ITERATOR' iter= identifier )? ( 'SEPARATOR' sep= expression )? s= sequence 'ENDFOREACH' ;
    public ForEachStatement foreachStatement() throws RecognitionException {
        ForEachStatement f = null;

        Expression e = null;

        Identifier v = null;

        Identifier iter = null;

        Expression sep = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:144:46: ( 'FOREACH' e= expression 'AS' v= identifier ( 'ITERATOR' iter= identifier )? ( 'SEPARATOR' sep= expression )? s= sequence 'ENDFOREACH' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:145:3: 'FOREACH' e= expression 'AS' v= identifier ( 'ITERATOR' iter= identifier )? ( 'SEPARATOR' sep= expression )? s= sequence 'ENDFOREACH'
            {
            match(input,36,FOLLOW_36_in_foreachStatement735); if (failed) return f;
            pushFollow(FOLLOW_expression_in_foreachStatement739);
            e=expression();
            _fsp--;
            if (failed) return f;
            match(input,41,FOLLOW_41_in_foreachStatement741); if (failed) return f;
            pushFollow(FOLLOW_identifier_in_foreachStatement745);
            v=identifier();
            _fsp--;
            if (failed) return f;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:145:44: ( 'ITERATOR' iter= identifier )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:145:45: 'ITERATOR' iter= identifier
                    {
                    match(input,42,FOLLOW_42_in_foreachStatement748); if (failed) return f;
                    pushFollow(FOLLOW_identifier_in_foreachStatement752);
                    iter=identifier();
                    _fsp--;
                    if (failed) return f;

                    }
                    break;

            }

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:145:74: ( 'SEPARATOR' sep= expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:145:75: 'SEPARATOR' sep= expression
                    {
                    match(input,37,FOLLOW_37_in_foreachStatement757); if (failed) return f;
                    pushFollow(FOLLOW_expression_in_foreachStatement761);
                    sep=expression();
                    _fsp--;
                    if (failed) return f;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_foreachStatement771);
            s=sequence();
            _fsp--;
            if (failed) return f;
            match(input,43,FOLLOW_43_in_foreachStatement776); if (failed) return f;
            if ( backtracking==0 ) {
              f = factory.createForEachStatement(e,v,sep,iter,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return f;
    }
    // $ANTLR end foreachStatement


    // $ANTLR start ifStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:151:1: ifStatement returns [IfStatement i] : 'IF' e= expression s= sequence (elif= elseIfStatement )* (el= elseStatement )? 'ENDIF' ;
    public IfStatement ifStatement() throws RecognitionException {
        IfStatement i = null;

        Expression e = null;

        List<Statement> s = null;

        IfStatement elif = null;

        IfStatement el = null;


        IfStatement temp = null;
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:151:68: ( 'IF' e= expression s= sequence (elif= elseIfStatement )* (el= elseStatement )? 'ENDIF' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:152:6: 'IF' e= expression s= sequence (elif= elseIfStatement )* (el= elseStatement )? 'ENDIF'
            {
            match(input,44,FOLLOW_44_in_ifStatement802); if (failed) return i;
            pushFollow(FOLLOW_expression_in_ifStatement806);
            e=expression();
            _fsp--;
            if (failed) return i;
            pushFollow(FOLLOW_sequence_in_ifStatement812);
            s=sequence();
            _fsp--;
            if (failed) return i;
            if ( backtracking==0 ) {
              i = factory.createIfStatement(e,s);
              		 temp = i;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:156:3: (elif= elseIfStatement )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:156:4: elif= elseIfStatement
            	    {
            	    pushFollow(FOLLOW_elseIfStatement_in_ifStatement824);
            	    elif=elseIfStatement();
            	    _fsp--;
            	    if (failed) return i;
            	    if ( backtracking==0 ) {
            	      temp.setElseIf(elif);
            	      	 			temp = elif; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:158:3: (el= elseStatement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:158:4: el= elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifStatement835);
                    el=elseStatement();
                    _fsp--;
                    if (failed) return i;
                    if ( backtracking==0 ) {
                      temp.setElseIf(el);
                      	 			temp = el; 
                    }

                    }
                    break;

            }

            match(input,45,FOLLOW_45_in_ifStatement847); if (failed) return i;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end ifStatement


    // $ANTLR start elseIfStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:163:1: elseIfStatement returns [IfStatement i] : 'ELSEIF' e= expression s= sequence ;
    public IfStatement elseIfStatement() throws RecognitionException {
        IfStatement i = null;

        Expression e = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:163:41: ( 'ELSEIF' e= expression s= sequence )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:164:2: 'ELSEIF' e= expression s= sequence
            {
            match(input,46,FOLLOW_46_in_elseIfStatement861); if (failed) return i;
            pushFollow(FOLLOW_expression_in_elseIfStatement865);
            e=expression();
            _fsp--;
            if (failed) return i;
            pushFollow(FOLLOW_sequence_in_elseIfStatement871);
            s=sequence();
            _fsp--;
            if (failed) return i;
            if ( backtracking==0 ) {
              i = factory.createIfStatement(e,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end elseIfStatement


    // $ANTLR start elseStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:169:1: elseStatement returns [IfStatement i] : 'ELSE' s= sequence ;
    public IfStatement elseStatement() throws RecognitionException {
        IfStatement i = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:169:39: ( 'ELSE' s= sequence )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:170:2: 'ELSE' s= sequence
            {
            match(input,47,FOLLOW_47_in_elseStatement892); if (failed) return i;
            pushFollow(FOLLOW_sequence_in_elseStatement898);
            s=sequence();
            _fsp--;
            if (failed) return i;
            if ( backtracking==0 ) {
              i = factory.createIfStatement(null,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end elseStatement


    // $ANTLR start letStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:175:1: letStatement returns [LetStatement l] : 'LET' e= expression 'AS' v= identifier s= sequence 'ENDLET' ;
    public LetStatement letStatement() throws RecognitionException {
        LetStatement l = null;

        Expression e = null;

        Identifier v = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:175:39: ( 'LET' e= expression 'AS' v= identifier s= sequence 'ENDLET' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:176:3: 'LET' e= expression 'AS' v= identifier s= sequence 'ENDLET'
            {
            match(input,48,FOLLOW_48_in_letStatement919); if (failed) return l;
            pushFollow(FOLLOW_expression_in_letStatement923);
            e=expression();
            _fsp--;
            if (failed) return l;
            match(input,41,FOLLOW_41_in_letStatement925); if (failed) return l;
            pushFollow(FOLLOW_identifier_in_letStatement929);
            v=identifier();
            _fsp--;
            if (failed) return l;
            pushFollow(FOLLOW_sequence_in_letStatement937);
            s=sequence();
            _fsp--;
            if (failed) return l;
            match(input,49,FOLLOW_49_in_letStatement942); if (failed) return l;
            if ( backtracking==0 ) {
              l = factory.createLetStatement(e,v,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end letStatement


    // $ANTLR start protectStatement
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:182:1: protectStatement returns [ProtectStatement l] : 'PROTECT' 'CSTART' startC= expression 'CEND' endC= expression 'ID' id= expression (disabled= 'DISABLE' )? s= sequence 'ENDPROTECT' ;
    public ProtectStatement protectStatement() throws RecognitionException {
        ProtectStatement l = null;

        Token disabled=null;
        Expression startC = null;

        Expression endC = null;

        Expression id = null;

        List<Statement> s = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:182:47: ( 'PROTECT' 'CSTART' startC= expression 'CEND' endC= expression 'ID' id= expression (disabled= 'DISABLE' )? s= sequence 'ENDPROTECT' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:183:2: 'PROTECT' 'CSTART' startC= expression 'CEND' endC= expression 'ID' id= expression (disabled= 'DISABLE' )? s= sequence 'ENDPROTECT'
            {
            match(input,50,FOLLOW_50_in_protectStatement961); if (failed) return l;
            match(input,51,FOLLOW_51_in_protectStatement966); if (failed) return l;
            pushFollow(FOLLOW_expression_in_protectStatement970);
            startC=expression();
            _fsp--;
            if (failed) return l;
            match(input,52,FOLLOW_52_in_protectStatement975); if (failed) return l;
            pushFollow(FOLLOW_expression_in_protectStatement979);
            endC=expression();
            _fsp--;
            if (failed) return l;
            match(input,53,FOLLOW_53_in_protectStatement992); if (failed) return l;
            pushFollow(FOLLOW_expression_in_protectStatement996);
            id=expression();
            _fsp--;
            if (failed) return l;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:186:30: (disabled= 'DISABLE' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:186:31: disabled= 'DISABLE'
                    {
                    disabled=input.LT(1);
                    match(input,54,FOLLOW_54_in_protectStatement1001); if (failed) return l;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_protectStatement1010);
            s=sequence();
            _fsp--;
            if (failed) return l;
            match(input,55,FOLLOW_55_in_protectStatement1014); if (failed) return l;
            if ( backtracking==0 ) {
              l = factory.createProtectStatement(startC,endC,id,disabled!=null,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end protectStatement


    // $ANTLR start expression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:195:1: expression returns [Expression e] : x= letExpression ;
    public Expression expression() throws RecognitionException {
        Expression e = null;

        Expression x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:195:34: (x= letExpression )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:196:2: x= letExpression
            {
            pushFollow(FOLLOW_letExpression_in_expression1036);
            x=letExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end expression


    // $ANTLR start letExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:199:1: letExpression returns [Expression e] : ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression );
    public Expression letExpression() throws RecognitionException {
        Expression e = null;

        Identifier v = null;

        Expression varExpr = null;

        Expression target = null;

        Expression x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:199:39: ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=StringLiteral && LA30_0<=Identifier)||LA30_0==24||LA30_0==33||LA30_0==61||(LA30_0>=64 && LA30_0<=65)||LA30_0==80||(LA30_0>=82 && LA30_0<=95)||(LA30_0>=97 && LA30_0<=99)) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("199:1: letExpression returns [Expression e] : ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:200:4: 'let' v= identifier '=' varExpr= castedExpression ':' target= expression
                    {
                    match(input,56,FOLLOW_56_in_letExpression1055); if (failed) return e;
                    pushFollow(FOLLOW_identifier_in_letExpression1059);
                    v=identifier();
                    _fsp--;
                    if (failed) return e;
                    match(input,57,FOLLOW_57_in_letExpression1061); if (failed) return e;
                    pushFollow(FOLLOW_castedExpression_in_letExpression1065);
                    varExpr=castedExpression();
                    _fsp--;
                    if (failed) return e;
                    match(input,58,FOLLOW_58_in_letExpression1067); if (failed) return e;
                    pushFollow(FOLLOW_expression_in_letExpression1071);
                    target=expression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =factory.createLetExpression(v,varExpr,target);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:202:4: x= castedExpression
                    {
                    pushFollow(FOLLOW_castedExpression_in_letExpression1084);
                    x=castedExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end letExpression


    // $ANTLR start castedExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:205:1: castedExpression returns [Expression e] : ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression );
    public Expression castedExpression() throws RecognitionException {
        Expression e = null;

        Identifier t = null;

        Expression x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:205:41: ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:206:5: ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression
                    {
                    match(input,24,FOLLOW_24_in_castedExpression1115); if (failed) return e;
                    pushFollow(FOLLOW_type_in_castedExpression1119);
                    t=type();
                    _fsp--;
                    if (failed) return e;
                    match(input,27,FOLLOW_27_in_castedExpression1121); if (failed) return e;
                    pushFollow(FOLLOW_chainExpression_in_castedExpression1125);
                    x=chainExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createCast(t,x);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:208:4: x= chainExpression
                    {
                    pushFollow(FOLLOW_chainExpression_in_castedExpression1134);
                    x=chainExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end castedExpression


    // $ANTLR start chainExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:212:1: chainExpression returns [Expression e] : x= ifExpression ( '->' right= ifExpression )* ;
    public Expression chainExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        Expression right = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:212:41: (x= ifExpression ( '->' right= ifExpression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:213:2: x= ifExpression ( '->' right= ifExpression )*
            {
            pushFollow(FOLLOW_ifExpression_in_chainExpression1154);
            x=ifExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:213:25: ( '->' right= ifExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==59) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:213:27: '->' right= ifExpression
            	    {
            	    match(input,59,FOLLOW_59_in_chainExpression1160); if (failed) return e;
            	    pushFollow(FOLLOW_ifExpression_in_chainExpression1164);
            	    right=ifExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e =factory.createChainExpression(e,right);
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end chainExpression


    // $ANTLR start ifExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:216:1: ifExpression returns [Expression e] : (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? );
    public Expression ifExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        Expression thenPart = null;

        Expression elsePart = null;

        Expression condition = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:216:38: (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=StringLiteral && LA35_0<=Identifier)||LA35_0==24||LA35_0==33||(LA35_0>=64 && LA35_0<=65)||LA35_0==80||(LA35_0>=82 && LA35_0<=95)||(LA35_0>=97 && LA35_0<=99)) ) {
                alt35=1;
            }
            else if ( (LA35_0==61) ) {
                alt35=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("216:1: ifExpression returns [Expression e] : (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? );", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:217:2: x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )?
                    {
                    pushFollow(FOLLOW_switchExpression_in_ifExpression1185);
                    x=switchExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:217:28: ( '?' thenPart= switchExpression ':' elsePart= switchExpression )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==60) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:217:29: '?' thenPart= switchExpression ':' elsePart= switchExpression
                            {
                            match(input,60,FOLLOW_60_in_ifExpression1189); if (failed) return e;
                            pushFollow(FOLLOW_switchExpression_in_ifExpression1193);
                            thenPart=switchExpression();
                            _fsp--;
                            if (failed) return e;
                            match(input,58,FOLLOW_58_in_ifExpression1195); if (failed) return e;
                            pushFollow(FOLLOW_switchExpression_in_ifExpression1199);
                            elsePart=switchExpression();
                            _fsp--;
                            if (failed) return e;
                            if ( backtracking==0 ) {
                              e =factory.createIf(e,thenPart,elsePart);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:218:3: 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )?
                    {
                    match(input,61,FOLLOW_61_in_ifExpression1207); if (failed) return e;
                    pushFollow(FOLLOW_switchExpression_in_ifExpression1211);
                    condition=switchExpression();
                    _fsp--;
                    if (failed) return e;
                    match(input,62,FOLLOW_62_in_ifExpression1213); if (failed) return e;
                    pushFollow(FOLLOW_switchExpression_in_ifExpression1217);
                    thenPart=switchExpression();
                    _fsp--;
                    if (failed) return e;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:218:68: ( 'else' elsePart= expression )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==63) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:218:69: 'else' elsePart= expression
                            {
                            match(input,63,FOLLOW_63_in_ifExpression1220); if (failed) return e;
                            pushFollow(FOLLOW_expression_in_ifExpression1224);
                            elsePart=expression();
                            _fsp--;
                            if (failed) return e;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      e =factory.createIf(condition,thenPart,elsePart);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end ifExpression


    // $ANTLR start switchExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:222:1: switchExpression returns [Expression e=null] : ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression );
    public Expression switchExpression() throws RecognitionException {
        Expression e = null;

        Expression pred = null;

        Expression c = null;

        Expression v = null;

        Expression def = null;

        Expression x = null;


        List cases = new ArrayList();
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:222:85: ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==64) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=StringLiteral && LA38_0<=Identifier)||LA38_0==24||LA38_0==33||LA38_0==65||LA38_0==80||(LA38_0>=82 && LA38_0<=95)||(LA38_0>=97 && LA38_0<=99)) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("222:1: switchExpression returns [Expression e=null] : ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:223:4: 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}'
                    {
                    match(input,64,FOLLOW_64_in_switchExpression1251); if (failed) return e;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:223:13: ( '(' pred= orExpression ')' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==24) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:223:14: '(' pred= orExpression ')'
                            {
                            match(input,24,FOLLOW_24_in_switchExpression1254); if (failed) return e;
                            pushFollow(FOLLOW_orExpression_in_switchExpression1260);
                            pred=orExpression();
                            _fsp--;
                            if (failed) return e;
                            match(input,27,FOLLOW_27_in_switchExpression1262); if (failed) return e;

                            }
                            break;

                    }

                    match(input,65,FOLLOW_65_in_switchExpression1269); if (failed) return e;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:225:4: ( 'case' c= orExpression ':' v= orExpression )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==66) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:226:6: 'case' c= orExpression ':' v= orExpression
                    	    {
                    	    match(input,66,FOLLOW_66_in_switchExpression1282); if (failed) return e;
                    	    pushFollow(FOLLOW_orExpression_in_switchExpression1286);
                    	    c=orExpression();
                    	    _fsp--;
                    	    if (failed) return e;
                    	    match(input,58,FOLLOW_58_in_switchExpression1289); if (failed) return e;
                    	    pushFollow(FOLLOW_orExpression_in_switchExpression1294);
                    	    v=orExpression();
                    	    _fsp--;
                    	    if (failed) return e;
                    	    if ( backtracking==0 ) {
                    	      cases.add(factory.createCase(c, v));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match(input,67,FOLLOW_67_in_switchExpression1312); if (failed) return e;
                    match(input,58,FOLLOW_58_in_switchExpression1314); if (failed) return e;
                    pushFollow(FOLLOW_orExpression_in_switchExpression1320);
                    def=orExpression();
                    _fsp--;
                    if (failed) return e;
                    match(input,68,FOLLOW_68_in_switchExpression1325); if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createSwitchExpression(pred,cases,def);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:232:4: x= orExpression
                    {
                    pushFollow(FOLLOW_orExpression_in_switchExpression1337);
                    x=orExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end switchExpression


    // $ANTLR start orExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:235:1: orExpression returns [Expression e] : x= andExpression (name= '||' r= andExpression )* ;
    public Expression orExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:235:37: (x= andExpression (name= '||' r= andExpression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:236:4: x= andExpression (name= '||' r= andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_orExpression1357);
            x=andExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:236:28: (name= '||' r= andExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==69) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:236:29: name= '||' r= andExpression
            	    {
            	    name=input.LT(1);
            	    match(input,69,FOLLOW_69_in_orExpression1364); if (failed) return e;
            	    pushFollow(FOLLOW_andExpression_in_orExpression1368);
            	    r=andExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end orExpression


    // $ANTLR start andExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:239:1: andExpression returns [Expression e] : x= impliesExpression (name= '&&' r= impliesExpression )* ;
    public Expression andExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:239:39: (x= impliesExpression (name= '&&' r= impliesExpression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:240:2: x= impliesExpression (name= '&&' r= impliesExpression )*
            {
            pushFollow(FOLLOW_impliesExpression_in_andExpression1391);
            x=impliesExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:240:30: (name= '&&' r= impliesExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==70) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:240:31: name= '&&' r= impliesExpression
            	    {
            	    name=input.LT(1);
            	    match(input,70,FOLLOW_70_in_andExpression1398); if (failed) return e;
            	    pushFollow(FOLLOW_impliesExpression_in_andExpression1402);
            	    r=impliesExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end andExpression


    // $ANTLR start impliesExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:243:1: impliesExpression returns [Expression e] : x= relationalExpression (name= 'implies' r= relationalExpression )* ;
    public Expression impliesExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:243:42: (x= relationalExpression (name= 'implies' r= relationalExpression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:244:2: x= relationalExpression (name= 'implies' r= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_impliesExpression1424);
            x=relationalExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:244:33: (name= 'implies' r= relationalExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==71) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:244:34: name= 'implies' r= relationalExpression
            	    {
            	    name=input.LT(1);
            	    match(input,71,FOLLOW_71_in_impliesExpression1431); if (failed) return e;
            	    pushFollow(FOLLOW_relationalExpression_in_impliesExpression1435);
            	    r=relationalExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end impliesExpression


    // $ANTLR start relationalExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:248:1: relationalExpression returns [Expression e] : x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )* ;
    public Expression relationalExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:248:45: (x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:249:2: x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1459);
            x=additiveExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:250:2: (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=72 && LA42_0<=77)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:250:3: name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression
            	    {
            	    name=input.LT(1);
            	    if ( (input.LA(1)>=72 && input.LA(1)<=77) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1467);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1493);
            	    r=additiveExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start additiveExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:254:1: additiveExpression returns [Expression e] : x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )* ;
    public Expression additiveExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:254:43: (x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:255:2: x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1514);
            x=multiplicativeExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:256:4: (name= ( '+' | '-' ) r= multiplicativeExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==33) ) {
                    int LA43_2 = input.LA(2);

                    if ( ((LA43_2>=StringLiteral && LA43_2<=Identifier)||LA43_2==24||LA43_2==33||LA43_2==65||LA43_2==80||(LA43_2>=82 && LA43_2<=95)||(LA43_2>=97 && LA43_2<=99)) ) {
                        alt43=1;
                    }


                }
                else if ( (LA43_0==78) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:256:5: name= ( '+' | '-' ) r= multiplicativeExpression
            	    {
            	    name=input.LT(1);
            	    if ( input.LA(1)==33||input.LA(1)==78 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression1524);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1533);
            	    r=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end additiveExpression


    // $ANTLR start multiplicativeExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:259:1: multiplicativeExpression returns [Expression e] : x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )* ;
    public Expression multiplicativeExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:259:48: (x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:260:2: x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1552);
            x=unaryExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:261:2: (name= ( '*' | '/' ) r= unaryExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26||LA44_0==79) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:261:3: name= ( '*' | '/' ) r= unaryExpression
            	    {
            	    name=input.LT(1);
            	    if ( input.LA(1)==26||input.LA(1)==79 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression1560);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1570);
            	    r=unaryExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end multiplicativeExpression


    // $ANTLR start unaryExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:265:1: unaryExpression returns [Expression e] : (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression );
    public Expression unaryExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:265:40: (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression )
            int alt45=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 24:
            case 65:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 98:
            case 99:
                {
                alt45=1;
                }
                break;
            case 80:
                {
                alt45=2;
                }
                break;
            case 33:
                {
                alt45=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("265:1: unaryExpression returns [Expression e] : (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression );", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:266:2: x= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1591);
                    x=infixExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:267:3: name= '!' x= infixExpression
                    {
                    name=input.LT(1);
                    match(input,80,FOLLOW_80_in_unaryExpression1599); if (failed) return e;
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1603);
                    x=infixExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createOperationCall(id(name),x);
                    }

                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:268:3: name= '-' x= infixExpression
                    {
                    name=input.LT(1);
                    match(input,33,FOLLOW_33_in_unaryExpression1611); if (failed) return e;
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1615);
                    x=infixExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createOperationCall(id(name),x);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end unaryExpression


    // $ANTLR start infixExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:271:1: infixExpression returns [Expression e] : x= primaryExpression ( '.' op= featureCall )* ;
    public Expression infixExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        FeatureCall op = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:271:40: (x= primaryExpression ( '.' op= featureCall )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:272:2: x= primaryExpression ( '.' op= featureCall )*
            {
            pushFollow(FOLLOW_primaryExpression_in_infixExpression1633);
            x=primaryExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:272:30: ( '.' op= featureCall )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==81) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:272:32: '.' op= featureCall
            	    {
            	    match(input,81,FOLLOW_81_in_infixExpression1639); if (failed) return e;
            	    pushFollow(FOLLOW_featureCall_in_infixExpression1643);
            	    op=featureCall();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       if (op!=null) { op.setTarget(e);e =op; }
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end infixExpression


    // $ANTLR start primaryExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:275:1: primaryExpression returns [Expression e] : (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression );
    public Expression primaryExpression() throws RecognitionException {
        Expression e = null;

        Token c=null;
        Expression x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:275:44: (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression )
            int alt47=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt47=1;
                }
                break;
            case Identifier:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 98:
            case 99:
                {
                alt47=2;
                }
                break;
            case 84:
            case 85:
                {
                alt47=3;
                }
                break;
            case IntLiteral:
                {
                alt47=4;
                }
                break;
            case 86:
                {
                alt47=5;
                }
                break;
            case 65:
                {
                alt47=6;
                }
                break;
            case 83:
                {
                alt47=7;
                }
                break;
            case 82:
                {
                alt47=8;
                }
                break;
            case 24:
                {
                alt47=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("275:1: primaryExpression returns [Expression e] : (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression );", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:276:4: c= StringLiteral
                    {
                    c=input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_primaryExpression1669); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createStringLiteral(id(c));
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:277:5: x= featureCall
                    {
                    pushFollow(FOLLOW_featureCall_in_primaryExpression1680);
                    x=featureCall();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:278:5: x= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression1690);
                    x=booleanLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 4 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:279:5: x= numberLiteral
                    {
                    pushFollow(FOLLOW_numberLiteral_in_primaryExpression1700);
                    x=numberLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 5 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:280:5: x= nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_primaryExpression1710);
                    x=nullLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 6 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:281:5: x= listLiteral
                    {
                    pushFollow(FOLLOW_listLiteral_in_primaryExpression1720);
                    x=listLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 7 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:282:5: x= constructorCall
                    {
                    pushFollow(FOLLOW_constructorCall_in_primaryExpression1730);
                    x=constructorCall();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 8 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:283:5: x= globalVarExpression
                    {
                    pushFollow(FOLLOW_globalVarExpression_in_primaryExpression1740);
                    x=globalVarExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 9 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:284:5: x= paranthesizedExpression
                    {
                    pushFollow(FOLLOW_paranthesizedExpression_in_primaryExpression1750);
                    x=paranthesizedExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end primaryExpression


    // $ANTLR start paranthesizedExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:287:1: paranthesizedExpression returns [Expression e] : '(' x= expression ')' ;
    public Expression paranthesizedExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:287:48: ( '(' x= expression ')' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:288:5: '(' x= expression ')'
            {
            match(input,24,FOLLOW_24_in_paranthesizedExpression1769); if (failed) return e;
            pushFollow(FOLLOW_expression_in_paranthesizedExpression1773);
            x=expression();
            _fsp--;
            if (failed) return e;
            match(input,27,FOLLOW_27_in_paranthesizedExpression1775); if (failed) return e;
            if ( backtracking==0 ) {
              e =factory.createParanthesizedExpression(x);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end paranthesizedExpression


    // $ANTLR start globalVarExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:291:1: globalVarExpression returns [GlobalVarExpression e] : 'GLOBALVAR' name= identifier ;
    public GlobalVarExpression globalVarExpression() throws RecognitionException {
        GlobalVarExpression e = null;

        Identifier name = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:291:54: ( 'GLOBALVAR' name= identifier )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:292:5: 'GLOBALVAR' name= identifier
            {
            match(input,82,FOLLOW_82_in_globalVarExpression1795); if (failed) return e;
            pushFollow(FOLLOW_identifier_in_globalVarExpression1799);
            name=identifier();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e = factory.createGlobalVarExpression(name);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end globalVarExpression


    // $ANTLR start featureCall
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:294:1: featureCall returns [FeatureCall e] : (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression );
    public FeatureCall featureCall() throws RecognitionException {
        FeatureCall e = null;

        Identifier id1 = null;

        List<Expression> l = null;

        Identifier t = null;

        FeatureCall x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:294:38: (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression )
            int alt49=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||LA49_1==TEXT||LA49_1==Identifier||(LA49_1>=25 && LA49_1<=27)||LA49_1==30||LA49_1==33||(LA49_1>=37 && LA49_1<=38)||LA49_1==41||(LA49_1>=52 && LA49_1<=54)||(LA49_1>=58 && LA49_1<=60)||(LA49_1>=62 && LA49_1<=63)||(LA49_1>=66 && LA49_1<=79)||LA49_1==81) ) {
                    alt49=2;
                }
                else if ( (LA49_1==24) ) {
                    alt49=1;
                }
                else {
                    if (backtracking>0) {failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("294:1: featureCall returns [FeatureCall e] : (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression );", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case 97:
            case 98:
            case 99:
                {
                alt49=2;
                }
                break;
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt49=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("294:1: featureCall returns [FeatureCall e] : (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression );", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:295:2: id1= identifier '(' (l= parameterList )? ')'
                    {
                    pushFollow(FOLLOW_identifier_in_featureCall1817);
                    id1=identifier();
                    _fsp--;
                    if (failed) return e;
                    match(input,24,FOLLOW_24_in_featureCall1819); if (failed) return e;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:295:21: (l= parameterList )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=StringLiteral && LA48_0<=Identifier)||LA48_0==24||LA48_0==33||LA48_0==56||LA48_0==61||(LA48_0>=64 && LA48_0<=65)||LA48_0==80||(LA48_0>=82 && LA48_0<=95)||(LA48_0>=97 && LA48_0<=99)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:295:22: l= parameterList
                            {
                            pushFollow(FOLLOW_parameterList_in_featureCall1824);
                            l=parameterList();
                            _fsp--;
                            if (failed) return e;

                            }
                            break;

                    }

                    match(input,27,FOLLOW_27_in_featureCall1828); if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createOperationCall(id1,l);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:296:5: t= type
                    {
                    pushFollow(FOLLOW_type_in_featureCall1838);
                    t=type();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =factory.createFeatureCall(t,null);
                    }

                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:297:5: x= collectionExpression
                    {
                    pushFollow(FOLLOW_collectionExpression_in_featureCall1849);
                    x=collectionExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end featureCall


    // $ANTLR start listLiteral
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:300:1: listLiteral returns [Expression e] : '{' (l= parameterList )? '}' ;
    public Expression listLiteral() throws RecognitionException {
        Expression e = null;

        List<Expression> l = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:300:37: ( '{' (l= parameterList )? '}' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:301:2: '{' (l= parameterList )? '}'
            {
            match(input,65,FOLLOW_65_in_listLiteral1866); if (failed) return e;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:301:6: (l= parameterList )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=StringLiteral && LA50_0<=Identifier)||LA50_0==24||LA50_0==33||LA50_0==56||LA50_0==61||(LA50_0>=64 && LA50_0<=65)||LA50_0==80||(LA50_0>=82 && LA50_0<=95)||(LA50_0>=97 && LA50_0<=99)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:301:7: l= parameterList
                    {
                    pushFollow(FOLLOW_parameterList_in_listLiteral1871);
                    l=parameterList();
                    _fsp--;
                    if (failed) return e;

                    }
                    break;

            }

            match(input,68,FOLLOW_68_in_listLiteral1875); if (failed) return e;
            if ( backtracking==0 ) {
              e =factory.createListLiteral(l);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end listLiteral


    // $ANTLR start constructorCall
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:304:1: constructorCall returns [Expression e] : 'new' t= simpleType ;
    public Expression constructorCall() throws RecognitionException {
        Expression e = null;

        Identifier t = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:304:41: ( 'new' t= simpleType )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:305:2: 'new' t= simpleType
            {
            match(input,83,FOLLOW_83_in_constructorCall1892); if (failed) return e;
            pushFollow(FOLLOW_simpleType_in_constructorCall1896);
            t=simpleType();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e = factory.createConstructorCall(t);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end constructorCall


    // $ANTLR start booleanLiteral
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:309:1: booleanLiteral returns [Expression e=factory.createBooleanLiteral(id(input.LT(1)))] : ( 'false' | 'true' );
    public Expression booleanLiteral() throws RecognitionException {
        Expression e = factory.createBooleanLiteral(id(input.LT(1)));

        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:309:86: ( 'false' | 'true' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:
            {
            if ( (input.LA(1)>=84 && input.LA(1)<=85) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_booleanLiteral0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end booleanLiteral


    // $ANTLR start nullLiteral
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:313:1: nullLiteral returns [Expression e=factory.createNullLiteral(id(input.LT(1)))] : 'null' ;
    public Expression nullLiteral() throws RecognitionException {
        Expression e = factory.createNullLiteral(id(input.LT(1)));

        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:313:80: ( 'null' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:314:2: 'null'
            {
            match(input,86,FOLLOW_86_in_nullLiteral1931); if (failed) return e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end nullLiteral


    // $ANTLR start numberLiteral
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:317:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );
    public Expression numberLiteral() throws RecognitionException {
        Expression e = null;

        Token a=null;
        Token b=null;
        Token c=null;

        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:317:39: (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==IntLiteral) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==81) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==IntLiteral) ) {
                        alt51=2;
                    }
                    else if ( (LA51_2==Identifier||(LA51_2>=87 && LA51_2<=95)||(LA51_2>=97 && LA51_2<=99)) ) {
                        alt51=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("317:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );", 51, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA51_1==EOF||LA51_1==TEXT||LA51_1==Identifier||(LA51_1>=25 && LA51_1<=27)||LA51_1==33||(LA51_1>=37 && LA51_1<=38)||LA51_1==41||(LA51_1>=52 && LA51_1<=54)||(LA51_1>=58 && LA51_1<=60)||(LA51_1>=62 && LA51_1<=63)||(LA51_1>=66 && LA51_1<=79)) ) {
                    alt51=1;
                }
                else {
                    if (backtracking>0) {failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("317:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("317:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:318:4: a= IntLiteral
                    {
                    a=input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1950); if (failed) return e;
                    if ( backtracking==0 ) {
                      e =factory.createIntegerLiteral(id(a));
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:319:4: a= IntLiteral b= '.' c= IntLiteral
                    {
                    a=input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1959); if (failed) return e;
                    b=input.LT(1);
                    match(input,81,FOLLOW_81_in_numberLiteral1963); if (failed) return e;
                    c=input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1967); if (failed) return e;
                    if ( backtracking==0 ) {
                      e =factory.createRealLiteral(id(a).append(id(b)).append(id(c)));
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end numberLiteral


    // $ANTLR start collectionExpression
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:322:1: collectionExpression returns [FeatureCall e] : (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' );
    public FeatureCall collectionExpression() throws RecognitionException {
        FeatureCall e = null;

        Token name=null;
        Identifier t = null;

        Identifier var = null;

        Expression x = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:322:47: (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==87) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=88 && LA53_0<=95)) ) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("322:1: collectionExpression returns [FeatureCall e] : (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' );", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:323:3: name= 'typeSelect' '(' t= type ')'
                    {
                    name=input.LT(1);
                    match(input,87,FOLLOW_87_in_collectionExpression1987); if (failed) return e;
                    match(input,24,FOLLOW_24_in_collectionExpression1991); if (failed) return e;
                    pushFollow(FOLLOW_type_in_collectionExpression1995);
                    t=type();
                    _fsp--;
                    if (failed) return e;
                    match(input,27,FOLLOW_27_in_collectionExpression1997); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createTypeSelectExpression(id(name),t);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:326:5: name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')'
                    {
                    name=input.LT(1);
                    if ( (input.LA(1)>=88 && input.LA(1)<=95) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return e;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_collectionExpression2010);    throw mse;
                    }

                    match(input,24,FOLLOW_24_in_collectionExpression2060); if (failed) return e;
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:333:19: (var= identifier '|' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==Identifier) ) {
                        int LA52_1 = input.LA(2);

                        if ( (LA52_1==96) ) {
                            alt52=1;
                        }
                    }
                    switch (alt52) {
                        case 1 :
                            // src/org/eclipse/internal/xpand2/parser/Xpand.g:333:20: var= identifier '|'
                            {
                            pushFollow(FOLLOW_identifier_in_collectionExpression2065);
                            var=identifier();
                            _fsp--;
                            if (failed) return e;
                            match(input,96,FOLLOW_96_in_collectionExpression2067); if (failed) return e;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_collectionExpression2073);
                    x=expression();
                    _fsp--;
                    if (failed) return e;
                    match(input,27,FOLLOW_27_in_collectionExpression2075); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createCollectionExpression(id(name),var,x);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end collectionExpression


    // $ANTLR start declaredParameterList
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:339:1: declaredParameterList returns [List<DeclaredParameter> l = new ArrayList<DeclaredParameter>()] : dp= declaredParameter ( ',' dp1= declaredParameter )* ;
    public List<DeclaredParameter> declaredParameterList() throws RecognitionException {
        List<DeclaredParameter> l =  new ArrayList<DeclaredParameter>();

        DeclaredParameter dp = null;

        DeclaredParameter dp1 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:339:97: (dp= declaredParameter ( ',' dp1= declaredParameter )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:340:2: dp= declaredParameter ( ',' dp1= declaredParameter )*
            {
            pushFollow(FOLLOW_declaredParameter_in_declaredParameterList2099);
            dp=declaredParameter();
            _fsp--;
            if (failed) return l;
            if ( backtracking==0 ) {
              l.add(dp);
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:340:36: ( ',' dp1= declaredParameter )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==25) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==Identifier||(LA54_1>=97 && LA54_1<=99)) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:340:37: ',' dp1= declaredParameter
            	    {
            	    match(input,25,FOLLOW_25_in_declaredParameterList2103); if (failed) return l;
            	    pushFollow(FOLLOW_declaredParameter_in_declaredParameterList2107);
            	    dp1=declaredParameter();
            	    _fsp--;
            	    if (failed) return l;
            	    if ( backtracking==0 ) {
            	      l.add(dp1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end declaredParameterList


    // $ANTLR start declaredParameter
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:343:1: declaredParameter returns [DeclaredParameter dp] : t= type name= identifier ;
    public DeclaredParameter declaredParameter() throws RecognitionException {
        DeclaredParameter dp = null;

        Identifier t = null;

        Identifier name = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:343:50: (t= type name= identifier )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:344:2: t= type name= identifier
            {
            pushFollow(FOLLOW_type_in_declaredParameter2127);
            t=type();
            _fsp--;
            if (failed) return dp;
            pushFollow(FOLLOW_identifier_in_declaredParameter2131);
            name=identifier();
            _fsp--;
            if (failed) return dp;
            if ( backtracking==0 ) {
              dp = factory.createDeclaredParameter(t,name);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dp;
    }
    // $ANTLR end declaredParameter


    // $ANTLR start parameterList
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:347:1: parameterList returns [List<Expression> list = new ArrayList<Expression>()] : a= expression ( ',' b= expression )* ;
    public List<Expression> parameterList() throws RecognitionException {
        List<Expression> list =  new ArrayList<Expression>();

        Expression a = null;

        Expression b = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:347:78: (a= expression ( ',' b= expression )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:348:5: a= expression ( ',' b= expression )*
            {
            pushFollow(FOLLOW_expression_in_parameterList2153);
            a=expression();
            _fsp--;
            if (failed) return list;
            if ( backtracking==0 ) {
              list.add(a);
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:348:34: ( ',' b= expression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==25) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:348:35: ',' b= expression
            	    {
            	    match(input,25,FOLLOW_25_in_parameterList2158); if (failed) return list;
            	    pushFollow(FOLLOW_expression_in_parameterList2162);
            	    b=expression();
            	    _fsp--;
            	    if (failed) return list;
            	    if ( backtracking==0 ) {
            	      list.add(b);
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end parameterList


    // $ANTLR start type
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:353:1: type returns [Identifier id] : (a= collectionType | b= simpleType );
    public Identifier type() throws RecognitionException {
        Identifier id = null;

        Identifier a = null;

        Identifier b = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:353:30: (a= collectionType | b= simpleType )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=97 && LA56_0<=99)) ) {
                alt56=1;
            }
            else if ( (LA56_0==Identifier) ) {
                alt56=2;
            }
            else {
                if (backtracking>0) {failed=true; return id;}
                NoViableAltException nvae =
                    new NoViableAltException("353:1: type returns [Identifier id] : (a= collectionType | b= simpleType );", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:354:2: a= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type2188);
                    a=collectionType();
                    _fsp--;
                    if (failed) return id;
                    if ( backtracking==0 ) {
                      id =a;
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:355:2: b= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type2198);
                    b=simpleType();
                    _fsp--;
                    if (failed) return id;
                    if ( backtracking==0 ) {
                      id =b;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end type


    // $ANTLR start collectionType
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:358:1: collectionType returns [Identifier id ] : cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )? ;
    public Identifier collectionType() throws RecognitionException {
        Identifier id = null;

        Token cl=null;
        Token b=null;
        Token c=null;
        Identifier id1 = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:358:42: (cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )? )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:359:3: cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )?
            {
            cl=input.LT(1);
            if ( (input.LA(1)>=97 && input.LA(1)<=99) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return id;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_collectionType2220);    throw mse;
            }

            if ( backtracking==0 ) {
              id = id(cl);
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:360:3: (b= '[' id1= simpleType c= ']' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==100) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:360:4: b= '[' id1= simpleType c= ']'
                    {
                    b=input.LT(1);
                    match(input,100,FOLLOW_100_in_collectionType2241); if (failed) return id;
                    pushFollow(FOLLOW_simpleType_in_collectionType2245);
                    id1=simpleType();
                    _fsp--;
                    if (failed) return id;
                    c=input.LT(1);
                    match(input,101,FOLLOW_101_in_collectionType2249); if (failed) return id;
                    if ( backtracking==0 ) {
                       id.append(id(b));id.append(id1);id.append(id(c));
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end collectionType


    // $ANTLR start simpleType
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:363:1: simpleType returns [Identifier id] : x= identifier (d= '::' end= identifier )* ;
    public Identifier simpleType() throws RecognitionException {
        Identifier id = null;

        Token d=null;
        Identifier x = null;

        Identifier end = null;


        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:363:36: (x= identifier (d= '::' end= identifier )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:364:2: x= identifier (d= '::' end= identifier )*
            {
            pushFollow(FOLLOW_identifier_in_simpleType2269);
            x=identifier();
            _fsp--;
            if (failed) return id;
            if ( backtracking==0 ) {
              id =x;
            }
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:365:2: (d= '::' end= identifier )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==30) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:365:3: d= '::' end= identifier
            	    {
            	    d=input.LT(1);
            	    match(input,30,FOLLOW_30_in_simpleType2277); if (failed) return id;
            	    pushFollow(FOLLOW_identifier_in_simpleType2281);
            	    end=identifier();
            	    _fsp--;
            	    if (failed) return id;
            	    if ( backtracking==0 ) {
            	      id.append(id(d)); id.append(end);
            	    }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end simpleType


    // $ANTLR start identifier
    // src/org/eclipse/internal/xpand2/parser/Xpand.g:368:1: identifier returns [Identifier r] : x= Identifier ;
    public Identifier identifier() throws RecognitionException {
        Identifier r = null;

        Token x=null;

        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:368:35: (x= Identifier )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:369:4: x= Identifier
            {
            x=input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_identifier2304); if (failed) return r;
            if ( backtracking==0 ) {
              r =id(x);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end identifier

    // $ANTLR start synpred1
    public void synpred1_fragment() throws RecognitionException {   
        // src/org/eclipse/internal/xpand2/parser/Xpand.g:206:5: ( '(' type ')' castedExpression )
        // src/org/eclipse/internal/xpand2/parser/Xpand.g:206:6: '(' type ')' castedExpression
        {
        match(input,24,FOLLOW_24_in_synpred11104); if (failed) return ;
        pushFollow(FOLLOW_type_in_synpred11106);
        type();
        _fsp--;
        if (failed) return ;
        match(input,27,FOLLOW_27_in_synpred11108); if (failed) return ;
        pushFollow(FOLLOW_castedExpression_in_synpred11110);
        castedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    public boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\67\uffff";
    static final String DFA31_eofS =
        "\6\uffff\1\2\60\uffff";
    static final String DFA31_minS =
        "\2\7\1\uffff\1\30\1\32\1\11\1\6\1\11\1\32\2\uffff\1\0\13\uffff\1"+
        "\6\1\uffff\1\36\3\0\2\30\4\0\2\11\1\0\1\11\1\32\1\11\3\0\1\36\2"+
        "\33\1\11\1\0\1\11\1\36\1\33\1\11\1\33\1\36";
    static final String DFA31_maxS =
        "\2\143\1\uffff\1\121\1\144\1\11\1\143\1\11\1\121\2\uffff\1\0\13"+
        "\uffff\1\143\1\uffff\1\145\3\0\2\30\4\0\2\11\1\0\1\11\1\121\1\143"+
        "\3\0\1\145\1\144\1\36\1\11\1\0\1\11\1\145\1\36\1\11\1\33\1\145";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\6\uffff\2\1\1\uffff\13\1\1\uffff\1\1\36\uffff";
    static final String DFA31_specialS =
        "\6\uffff\1\1\4\uffff\1\15\16\uffff\1\10\1\13\1\6\2\uffff\1\14\1"+
        "\5\1\11\1\3\2\uffff\1\2\3\uffff\1\4\1\0\1\12\4\uffff\1\7\6\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\2\16\uffff\1\1\10\uffff\1\2\33\uffff\1\2\2\uffff\2\2\16\uffff"+
            "\1\2\1\uffff\16\2\1\uffff\3\2",
            "\2\2\1\3\16\uffff\1\2\10\uffff\1\2\26\uffff\1\2\4\uffff\1\2"+
            "\2\uffff\2\2\16\uffff\1\2\1\uffff\16\2\1\uffff\3\4",
            "",
            "\1\2\1\uffff\1\2\1\6\2\uffff\1\5\2\uffff\1\2\31\uffff\2\2\10"+
            "\uffff\13\2\1\uffff\1\2",
            "\1\2\1\6\5\uffff\1\2\31\uffff\2\2\10\uffff\13\2\1\uffff\1\2"+
            "\22\uffff\1\7",
            "\1\10",
            "\1\2\1\12\1\20\1\13\16\uffff\1\25\3\2\5\uffff\1\27\3\uffff\2"+
            "\2\2\uffff\1\2\12\uffff\3\2\3\uffff\3\2\1\30\2\uffff\1\11\1"+
            "\22\2\uffff\14\2\1\26\1\2\1\24\1\23\2\17\1\21\1\15\10\16\1\uffff"+
            "\3\14",
            "\1\31",
            "\1\2\1\6\2\uffff\1\5\2\uffff\1\2\31\uffff\2\2\10\uffff\13\2"+
            "\1\uffff\1\2",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\32\1\40\1\33\16\uffff\1\45\10\uffff\1\2\37\uffff\1\42"+
            "\16\uffff\1\2\1\uffff\1\44\1\43\2\37\1\41\1\35\10\36\1\uffff"+
            "\3\34",
            "",
            "\1\46\106\uffff\1\47",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\50",
            "\1\51",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\52",
            "\1\53",
            "\1\uffff",
            "\1\54",
            "\1\2\1\6\5\uffff\1\2\31\uffff\2\2\10\uffff\13\2\1\uffff\1\2",
            "\1\56\127\uffff\3\55",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\46\106\uffff\1\47",
            "\1\60\110\uffff\1\57",
            "\1\60\2\uffff\1\61",
            "\1\62",
            "\1\uffff",
            "\1\63",
            "\1\64\106\uffff\1\65",
            "\1\60\2\uffff\1\61",
            "\1\66",
            "\1\60",
            "\1\64\106\uffff\1\65"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        @Override
		public String getDescription() {
            return "205:1: castedExpression returns [Expression e] : ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression );";
        }
        @Override
		public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_42 = input.LA(1);

                         
                        int index31_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_42);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_6==64) && (synpred1())) {s = 9;}

                        else if ( (LA31_6==StringLiteral) && (synpred1())) {s = 10;}

                        else if ( (LA31_6==Identifier) ) {s = 11;}

                        else if ( ((LA31_6>=97 && LA31_6<=99)) && (synpred1())) {s = 12;}

                        else if ( (LA31_6==87) && (synpred1())) {s = 13;}

                        else if ( ((LA31_6>=88 && LA31_6<=95)) && (synpred1())) {s = 14;}

                        else if ( ((LA31_6>=84 && LA31_6<=85)) && (synpred1())) {s = 15;}

                        else if ( (LA31_6==IntLiteral) && (synpred1())) {s = 16;}

                        else if ( (LA31_6==86) && (synpred1())) {s = 17;}

                        else if ( (LA31_6==65) && (synpred1())) {s = 18;}

                        else if ( (LA31_6==83) && (synpred1())) {s = 19;}

                        else if ( (LA31_6==82) && (synpred1())) {s = 20;}

                        else if ( (LA31_6==24) && (synpred1())) {s = 21;}

                        else if ( (LA31_6==80) && (synpred1())) {s = 22;}

                        else if ( (LA31_6==33) ) {s = 23;}

                        else if ( (LA31_6==61) && (synpred1())) {s = 24;}

                        else if ( (LA31_6==EOF||LA31_6==TEXT||(LA31_6>=25 && LA31_6<=27)||(LA31_6>=37 && LA31_6<=38)||LA31_6==41||(LA31_6>=52 && LA31_6<=54)||(LA31_6>=58 && LA31_6<=60)||(LA31_6>=68 && LA31_6<=79)||LA31_6==81) ) {s = 2;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_37 = input.LA(1);

                         
                        int index31_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_37);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_34 = input.LA(1);

                         
                        int index31_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_34);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_41 = input.LA(1);

                         
                        int index31_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_41);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_32 = input.LA(1);

                         
                        int index31_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_28 = input.LA(1);

                         
                        int index31_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_28);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_48 = input.LA(1);

                         
                        int index31_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_48);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_33 = input.LA(1);

                         
                        int index31_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_33);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_43 = input.LA(1);

                         
                        int index31_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_43);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_27 = input.LA(1);

                         
                        int index31_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_27);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_31 = input.LA(1);

                         
                        int index31_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_LG_in_template47 = new BitSet(new long[]{0x0000000080E00022L});
    public static final BitSet FOLLOW_COMMENT_in_template52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template54 = new BitSet(new long[]{0x0000000080E00022L});
    public static final BitSet FOLLOW_anImport_in_template64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_anExtensionImport_in_template73 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template78 = new BitSet(new long[]{0x0000000080E00022L});
    public static final BitSet FOLLOW_COMMENT_in_template81 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template83 = new BitSet(new long[]{0x0000000080E00022L});
    public static final BitSet FOLLOW_define_in_template95 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_around_in_template102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template106 = new BitSet(new long[]{0x0000000080800022L});
    public static final BitSet FOLLOW_COMMENT_in_template109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template111 = new BitSet(new long[]{0x0000000080800022L});
    public static final BitSet FOLLOW_21_in_anImport137 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_anImport141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_anExtensionImport156 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_anExtensionImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_around178 = new BitSet(new long[]{0x0000000004000200L});
    public static final BitSet FOLLOW_pointcut_in_around182 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_around188 = new BitSet(new long[]{0x0000000004000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_declaredParameterList_in_around193 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_25_in_around196 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_around200 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_around209 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_around213 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_around217 = new BitSet(new long[]{0x0000000000000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_type_in_around221 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_around229 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_around234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_pointcut256 = new BitSet(new long[]{0x0000000044000202L});
    public static final BitSet FOLLOW_identifier_in_pointcut262 = new BitSet(new long[]{0x0000000044000202L});
    public static final BitSet FOLLOW_26_in_pointcut271 = new BitSet(new long[]{0x0000000044000202L});
    public static final BitSet FOLLOW_identifier_in_pointcut277 = new BitSet(new long[]{0x0000000044000202L});
    public static final BitSet FOLLOW_30_in_pointcut283 = new BitSet(new long[]{0x0000000044000202L});
    public static final BitSet FOLLOW_31_in_define303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_define307 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_define310 = new BitSet(new long[]{0x0000000000000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_declaredParameterList_in_define314 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_define316 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_define320 = new BitSet(new long[]{0x0000000000000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_type_in_define324 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_define332 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_define338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textSequence_in_sequence361 = new BitSet(new long[]{0x2105109E01000382L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_statement_in_sequence370 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_textSequence_in_sequence379 = new BitSet(new long[]{0x2105109E01000382L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_simpleStatement_in_statement409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fileStatement_in_statement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreachStatement_in_statement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letStatement_in_statement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protectStatement_in_statement449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_textSequence468 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMENT_in_textSequence475 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_text_in_textSequence479 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_33_in_text500 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_text506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_errorStatement_in_simpleStatement525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expandStatement_in_simpleStatement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_simpleStatement541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_errorStatement558 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_errorStatement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_expandStatement579 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_definitionName_in_expandStatement583 = new BitSet(new long[]{0x0000005011000002L});
    public static final BitSet FOLLOW_24_in_expandStatement586 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_parameterList_in_expandStatement590 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expandStatement592 = new BitSet(new long[]{0x0000005010000002L});
    public static final BitSet FOLLOW_28_in_expandStatement598 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_expandStatement602 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36_in_expandStatement612 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_expandStatement616 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_expandStatement619 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_expandStatement623 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_expandStatement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_definitionName662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStmt680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_fileStatement696 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_fileStatement700 = new BitSet(new long[]{0x0000000200000240L});
    public static final BitSet FOLLOW_identifier_in_fileStatement705 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_fileStatement713 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fileStatement717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_foreachStatement735 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_foreachStatement739 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_foreachStatement741 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_foreachStatement745 = new BitSet(new long[]{0x0000042200000040L});
    public static final BitSet FOLLOW_42_in_foreachStatement748 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_foreachStatement752 = new BitSet(new long[]{0x0000002200000040L});
    public static final BitSet FOLLOW_37_in_foreachStatement757 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_foreachStatement761 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_foreachStatement771 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_foreachStatement776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ifStatement802 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_ifStatement806 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_ifStatement812 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifStatement824 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement835 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ifStatement847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_elseIfStatement861 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_elseIfStatement865 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_elseIfStatement871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_elseStatement892 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_elseStatement898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_letStatement919 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_letStatement923 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_letStatement925 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_letStatement929 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_letStatement937 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_letStatement942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_protectStatement961 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_protectStatement966 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_protectStatement970 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_protectStatement975 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_protectStatement979 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_protectStatement992 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_protectStatement996 = new BitSet(new long[]{0x0040000200000040L});
    public static final BitSet FOLLOW_54_in_protectStatement1001 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_sequence_in_protectStatement1010 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_protectStatement1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letExpression_in_expression1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_letExpression1055 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_letExpression1059 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_letExpression1061 = new BitSet(new long[]{0x2000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression1065 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_letExpression1067 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_letExpression1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_castedExpression1115 = new BitSet(new long[]{0x0000000000000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_type_in_castedExpression1119 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_castedExpression1121 = new BitSet(new long[]{0x2000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression1154 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_chainExpression1160 = new BitSet(new long[]{0x2000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression1164 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1185 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ifExpression1189 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1193 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ifExpression1195 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ifExpression1207 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1211 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ifExpression1213 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1217 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ifExpression1220 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_ifExpression1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_switchExpression1251 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_switchExpression1254 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1260 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_switchExpression1262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_switchExpression1269 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_switchExpression1282 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1286 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_switchExpression1289 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1294 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_67_in_switchExpression1312 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_switchExpression1314 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_switchExpression1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1357 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_orExpression1364 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression1391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_andExpression1398 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression1402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression1424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_impliesExpression1431 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression1435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_set_in_relationalExpression1467 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1514 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_additiveExpression1524 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1533 = new BitSet(new long[]{0x0000000200000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1552 = new BitSet(new long[]{0x0000000004000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1560 = new BitSet(new long[]{0x0000000201000380L,0x0000000EFFFD0002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1570 = new BitSet(new long[]{0x0000000004000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_unaryExpression1599 = new BitSet(new long[]{0x0000000001000380L,0x0000000EFFFC0002L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_unaryExpression1611 = new BitSet(new long[]{0x0000000001000380L,0x0000000EFFFC0002L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_infixExpression1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_infixExpression1639 = new BitSet(new long[]{0x0000000000000200L,0x0000000EFF800000L});
    public static final BitSet FOLLOW_featureCall_in_infixExpression1643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_StringLiteral_in_primaryExpression1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_featureCall_in_primaryExpression1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_primaryExpression1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_primaryExpression1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLiteral_in_primaryExpression1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorCall_in_primaryExpression1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVarExpression_in_primaryExpression1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paranthesizedExpression_in_primaryExpression1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_paranthesizedExpression1769 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_paranthesizedExpression1773 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_paranthesizedExpression1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_globalVarExpression1795 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_globalVarExpression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_featureCall1817 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_featureCall1819 = new BitSet(new long[]{0x2100000209000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_parameterList_in_featureCall1824 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_featureCall1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_featureCall1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionExpression_in_featureCall1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_listLiteral1866 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0013L});
    public static final BitSet FOLLOW_parameterList_in_listLiteral1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_listLiteral1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_constructorCall1892 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_constructorCall1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_nullLiteral1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_numberLiteral1963 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_collectionExpression1987 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_collectionExpression1991 = new BitSet(new long[]{0x0000000000000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_type_in_collectionExpression1995 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_collectionExpression1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionExpression2010 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_collectionExpression2060 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_identifier_in_collectionExpression2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_collectionExpression2067 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_collectionExpression2073 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_collectionExpression2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList2099 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_declaredParameterList2103 = new BitSet(new long[]{0x0000000000000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList2107 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_declaredParameter2127 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_declaredParameter2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameterList2153 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parameterList2158 = new BitSet(new long[]{0x2100000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_expression_in_parameterList2162 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_collectionType_in_type2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType2220 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_collectionType2241 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_collectionType2245 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_collectionType2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleType2269 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_simpleType2277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_simpleType2281 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred11104 = new BitSet(new long[]{0x0000000000000200L,0x0000000E00000000L});
    public static final BitSet FOLLOW_type_in_synpred11106 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred11108 = new BitSet(new long[]{0x2000000201000380L,0x0000000EFFFD0003L});
    public static final BitSet FOLLOW_castedExpression_in_synpred11110 = new BitSet(new long[]{0x0000000000000002L});

}