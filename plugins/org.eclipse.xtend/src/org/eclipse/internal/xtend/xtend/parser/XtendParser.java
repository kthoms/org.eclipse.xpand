/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
// $ANTLR 3.0 ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g 2007-08-13 15:52:05
 	
package org.eclipse.internal.xtend.xtend.parser; 
	
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
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.GlobalVarExpression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Check;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ImportStatement;
public class XtendParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "XPAND_TAG_OPEN", "XPAND_TAG_CLOSE", "'import'", "';'", "'extension'", "'reexport'", "'context'", "'if'", "'ERROR'", "'WARNING'", "':'", "'around'", "'('", "','", "'*'", "')'", "'::'", "'private'", "'cached'", "'JAVA'", "'.'", "'create'", "'Collection'", "'List'", "'Set'", "'let'", "'='", "'->'", "'?'", "'then'", "'else'", "'switch'", "'{'", "'case'", "'default'", "'}'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'/'", "'!'", "'GLOBALVAR'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'", "'['", "']'"
    };
    public static final int XPAND_TAG_OPEN=16;
    public static final int JavaIDDigit=12;
    public static final int Letter=11;
    public static final int UnicodeEscape=8;
    public static final int IntLiteral=5;
    public static final int Identifier=6;
    public static final int HexDigit=10;
    public static final int EscapeSequence=7;
    public static final int WS=13;
    public static final int EOF=-1;
    public static final int OctalEscape=9;
    public static final int COMMENT=14;
    public static final int StringLiteral=4;
    public static final int LINE_COMMENT=15;
    public static final int XPAND_TAG_CLOSE=17;

        public XtendParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[40+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g"; }


    	private ExtensionFactory factory;
    	public XtendParser(TokenStream stream, ExtensionFactory factory) {
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



    // $ANTLR start file
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:43:1: file returns [ExtensionFile r] : (nsi= nsImport )* (exti= extImport )* (ext= extension | a= around | c= check )* EOF ;
	public ExtensionFile file() throws RecognitionException {
        ExtensionFile r = null;

        ImportStatement nsi = null;

        ImportStatement exti = null;

        Extension ext = null;

        Around a = null;

        Check c = null;


        List nsimports = new ArrayList(), extimports = new ArrayList(), extensions = new ArrayList(), arounds = new ArrayList(), checks = new ArrayList();
        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:45:2: ( (nsi= nsImport )* (exti= extImport )* (ext= extension | a= around | c= check )* EOF )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:45:2: (nsi= nsImport )* (exti= extImport )* (ext= extension | a= around | c= check )* EOF
            {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:45:2: (nsi= nsImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:45:3: nsi= nsImport
            	    {
            	    pushFollow(FOLLOW_nsImport_in_file51);
            	    nsi=nsImport();
            	    _fsp--;
            	    if (failed) return r;
            	    if ( backtracking==0 ) {
            	      nsimports.add(nsi);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:46:2: (exti= extImport )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:46:3: exti= extImport
            	    {
            	    pushFollow(FOLLOW_extImport_in_file61);
            	    exti=extImport();
            	    _fsp--;
            	    if (failed) return r;
            	    if ( backtracking==0 ) {
            	      extimports.add(exti);
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:47:2: (ext= extension | a= around | c= check )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case Identifier:
                case 33:
                case 34:
                case 37:
                case 38:
                case 39:
                case 40:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:47:3: ext= extension
            	    {
            	    pushFollow(FOLLOW_extension_in_file71);
            	    ext=extension();
            	    _fsp--;
            	    if (failed) return r;
            	    if ( backtracking==0 ) {
            	      extensions.add(ext);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:47:42: a= around
            	    {
            	    pushFollow(FOLLOW_around_in_file81);
            	    a=around();
            	    _fsp--;
            	    if (failed) return r;
            	    if ( backtracking==0 ) {
            	      arounds.add(a);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:47:73: c= check
            	    {
            	    pushFollow(FOLLOW_check_in_file91);
            	    c=check();
            	    _fsp--;
            	    if (failed) return r;
            	    if ( backtracking==0 ) {
            	      checks.add(c);
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_file99); if (failed) return r;
            if ( backtracking==0 ) {
               r = factory.createExtensionFile(nsimports,extimports,extensions,arounds,checks);
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
    // $ANTLR end file


    // $ANTLR start nsImport
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:52:1: nsImport returns [ImportStatement r] : 'import' t= type ';' ;
    public ImportStatement nsImport() throws RecognitionException {
        ImportStatement r = null;

        Identifier t = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:53:2: ( 'import' t= type ';' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:53:2: 'import' t= type ';'
            {
            match(input,18,FOLLOW_18_in_nsImport117); if (failed) return r;
            pushFollow(FOLLOW_type_in_nsImport121);
            t=type();
            _fsp--;
            if (failed) return r;
            if ( backtracking==0 ) {
              r = factory.createNsImport(t);
            }
            match(input,19,FOLLOW_19_in_nsImport125); if (failed) return r;

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
    // $ANTLR end nsImport


    // $ANTLR start extImport
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:56:1: extImport returns [ImportStatement r] : 'extension' t= type (exported= 'reexport' )? ';' ;
    public ImportStatement extImport() throws RecognitionException {
        ImportStatement r = null;

        Token exported=null;
        Identifier t = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:57:2: ( 'extension' t= type (exported= 'reexport' )? ';' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:57:2: 'extension' t= type (exported= 'reexport' )? ';'
            {
            match(input,20,FOLLOW_20_in_extImport140); if (failed) return r;
            pushFollow(FOLLOW_type_in_extImport144);
            t=type();
            _fsp--;
            if (failed) return r;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:57:21: (exported= 'reexport' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:57:22: exported= 'reexport'
                    {
                    exported=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_extImport149); if (failed) return r;

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_extImport153); if (failed) return r;
            if ( backtracking==0 ) {
               r = factory.createExtensionFileImport(t,id(exported));
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
    // $ANTLR end extImport


    // $ANTLR start check
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:60:1: check returns [Check ext] : 'context' t= type ( 'if' guard= expression )? (sev1= 'ERROR' | 'WARNING' ) msg= expression ':' expr= expression ';' ;
    public Check check() throws RecognitionException {
        Check ext = null;

        Token sev1=null;
        Identifier t = null;

        Expression guard = null;

        Expression msg = null;

        Expression expr = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:2: ( 'context' t= type ( 'if' guard= expression )? (sev1= 'ERROR' | 'WARNING' ) msg= expression ':' expr= expression ';' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:2: 'context' t= type ( 'if' guard= expression )? (sev1= 'ERROR' | 'WARNING' ) msg= expression ':' expr= expression ';'
            {
            match(input,22,FOLLOW_22_in_check168); if (failed) return ext;
            pushFollow(FOLLOW_type_in_check172);
            t=type();
            _fsp--;
            if (failed) return ext;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:19: ( 'if' guard= expression )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:20: 'if' guard= expression
                    {
                    match(input,23,FOLLOW_23_in_check175); if (failed) return ext;
                    pushFollow(FOLLOW_expression_in_check179);
                    guard=expression();
                    _fsp--;
                    if (failed) return ext;

                    }
                    break;

            }

            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:44: (sev1= 'ERROR' | 'WARNING' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ext;}
                NoViableAltException nvae =
                    new NoViableAltException("61:44: (sev1= 'ERROR' | 'WARNING' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:45: sev1= 'ERROR'
                    {
                    sev1=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_check186); if (failed) return ext;

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:58: 'WARNING'
                    {
                    match(input,25,FOLLOW_25_in_check188); if (failed) return ext;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_check193);
            msg=expression();
            _fsp--;
            if (failed) return ext;
            match(input,26,FOLLOW_26_in_check195); if (failed) return ext;
            pushFollow(FOLLOW_expression_in_check200);
            expr=expression();
            _fsp--;
            if (failed) return ext;
            match(input,19,FOLLOW_19_in_check202); if (failed) return ext;
            if ( backtracking==0 ) {
              ext = factory.createCheck(t, guard, sev1!=null, msg, expr);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ext;
    }
    // $ANTLR end check


    // $ANTLR start around
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:66:1: around returns [Around r] : 'around' pc= pointcut '(' (p= declaredParameterList ( ( ',' )? wildparams= '*' )? | wildparams= '*' )? ')' ':' expr= expression ';' ;
    public Around around() throws RecognitionException {
        Around r = null;

        Token wildparams=null;
        Identifier pc = null;

        List<DeclaredParameter> p = null;

        Expression expr = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:5: ( 'around' pc= pointcut '(' (p= declaredParameterList ( ( ',' )? wildparams= '*' )? | wildparams= '*' )? ')' ':' expr= expression ';' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:5: 'around' pc= pointcut '(' (p= declaredParameterList ( ( ',' )? wildparams= '*' )? | wildparams= '*' )? ')' ':' expr= expression ';'
            {
            match(input,27,FOLLOW_27_in_around223); if (failed) return r;
            pushFollow(FOLLOW_pointcut_in_around227);
            pc=pointcut();
            _fsp--;
            if (failed) return r;
            match(input,28,FOLLOW_28_in_around229); if (failed) return r;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:30: (p= declaredParameterList ( ( ',' )? wildparams= '*' )? | wildparams= '*' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Identifier||(LA9_0>=38 && LA9_0<=40)) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:31: p= declaredParameterList ( ( ',' )? wildparams= '*' )?
                    {
                    pushFollow(FOLLOW_declaredParameterList_in_around234);
                    p=declaredParameterList();
                    _fsp--;
                    if (failed) return r;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:55: ( ( ',' )? wildparams= '*' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=29 && LA8_0<=30)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:56: ( ',' )? wildparams= '*'
                            {
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:56: ( ',' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==29) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:56: ','
                                    {
                                    match(input,29,FOLLOW_29_in_around237); if (failed) return r;

                                    }
                                    break;

                            }

                            wildparams=(Token)input.LT(1);
                            match(input,30,FOLLOW_30_in_around242); if (failed) return r;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:80: wildparams= '*'
                    {
                    wildparams=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_around250); if (failed) return r;

                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_around254); if (failed) return r;
            match(input,26,FOLLOW_26_in_around256); if (failed) return r;
            pushFollow(FOLLOW_expression_in_around265);
            expr=expression();
            _fsp--;
            if (failed) return r;
            match(input,19,FOLLOW_19_in_around267); if (failed) return r;
            if ( backtracking==0 ) {
               r = factory.createAround(pc,p,wildparams!=null,expr);
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
    // $ANTLR end around


    // $ANTLR start pointcut
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:72:1: pointcut returns [Identifier r] : (a= '*' | b= identifier ) (a1= '*' | b1= identifier | c1= '::' )* ;
    public Identifier pointcut() throws RecognitionException {
        Identifier r = null;

        Token a=null;
        Token a1=null;
        Token c1=null;
        Identifier b = null;

        Identifier b1 = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:73:2: ( (a= '*' | b= identifier ) (a1= '*' | b1= identifier | c1= '::' )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:73:2: (a= '*' | b= identifier ) (a1= '*' | b1= identifier | c1= '::' )*
            {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:73:2: (a= '*' | b= identifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==Identifier) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("73:2: (a= '*' | b= identifier )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:73:4: a= '*'
                    {
                    a=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_pointcut295); if (failed) return r;
                    if ( backtracking==0 ) {
                      r = id(a);
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:74:4: b= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_pointcut304);
                    b=identifier();
                    _fsp--;
                    if (failed) return r;
                    if ( backtracking==0 ) {
                      r = b;
                    }

                    }
                    break;

            }

            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:75:4: (a1= '*' | b1= identifier | c1= '::' )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt11=1;
                    }
                    break;
                case Identifier:
                    {
                    alt11=2;
                    }
                    break;
                case 32:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:75:6: a1= '*'
            	    {
            	    a1=(Token)input.LT(1);
            	    match(input,30,FOLLOW_30_in_pointcut315); if (failed) return r;
            	    if ( backtracking==0 ) {
            	      if (r!=null)r.append(id(a1));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:76:6: b1= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_pointcut326);
            	    b1=identifier();
            	    _fsp--;
            	    if (failed) return r;
            	    if ( backtracking==0 ) {
            	      if (r!=null)r.append(b1);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:77:6: c1= '::'
            	    {
            	    c1=(Token)input.LT(1);
            	    match(input,32,FOLLOW_32_in_pointcut337); if (failed) return r;
            	    if ( backtracking==0 ) {
            	      if (r!=null)r.append(id(c1));
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
        return r;
    }
    // $ANTLR end pointcut


    // $ANTLR start extension
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:82:1: extension returns [Extension r] : ( (priv= 'private' )? (cached= 'cached' )? (rType= type )? name= identifier '(' (params= declaredParameterList )? ')' ':' ( 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';' | expr= expression ';' ) | (priv= 'private' )? create= 'create' rType= type (rtn= identifier )? name= identifier '(' (params= declaredParameterList )? ')' ':' expr= expression ';' );
    public Extension extension() throws RecognitionException {
        Extension r = null;

        Token priv=null;
        Token cached=null;
        Token create=null;
        Identifier rType = null;

        Identifier name = null;

        List<DeclaredParameter> params = null;

        Identifier jt = null;

        Identifier m = null;

        Identifier pt = null;

        Expression expr = null;

        Identifier rtn = null;


        List<Identifier> javaParamTypes=new ArrayList<Identifier>();
        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:2: ( (priv= 'private' )? (cached= 'cached' )? (rType= type )? name= identifier '(' (params= declaredParameterList )? ')' ':' ( 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';' | expr= expression ';' ) | (priv= 'private' )? create= 'create' rType= type (rtn= identifier )? name= identifier '(' (params= declaredParameterList )? ')' ':' expr= expression ';' )
            int alt22=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==Identifier||LA22_1==34||(LA22_1>=38 && LA22_1<=40)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==37) ) {
                    alt22=2;
                }
                else {
                    if (backtracking>0) {failed=true; return r;}
                    NoViableAltException nvae =
                        new NoViableAltException("82:1: extension returns [Extension r] : ( (priv= 'private' )? (cached= 'cached' )? (rType= type )? name= identifier '(' (params= declaredParameterList )? ')' ':' ( 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';' | expr= expression ';' ) | (priv= 'private' )? create= 'create' rType= type (rtn= identifier )? name= identifier '(' (params= declaredParameterList )? ')' ':' expr= expression ';' );", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case Identifier:
            case 34:
            case 38:
            case 39:
            case 40:
                {
                alt22=1;
                }
                break;
            case 37:
                {
                alt22=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("82:1: extension returns [Extension r] : ( (priv= 'private' )? (cached= 'cached' )? (rType= type )? name= identifier '(' (params= declaredParameterList )? ')' ':' ( 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';' | expr= expression ';' ) | (priv= 'private' )? create= 'create' rType= type (rtn= identifier )? name= identifier '(' (params= declaredParameterList )? ')' ':' expr= expression ';' );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:2: (priv= 'private' )? (cached= 'cached' )? (rType= type )? name= identifier '(' (params= declaredParameterList )? ')' ':' ( 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';' | expr= expression ';' )
                    {
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:2: (priv= 'private' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==33) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:3: priv= 'private'
                            {
                            priv=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_extension365); if (failed) return r;

                            }
                            break;

                    }

                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:20: (cached= 'cached' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==34) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:21: cached= 'cached'
                            {
                            cached=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_extension372); if (failed) return r;

                            }
                            break;

                    }

                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:39: (rType= type )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=38 && LA14_0<=40)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==Identifier) ) {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==Identifier||LA14_2==32) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:40: rType= type
                            {
                            pushFollow(FOLLOW_type_in_extension379);
                            rType=type();
                            _fsp--;
                            if (failed) return r;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_extension385);
                    name=identifier();
                    _fsp--;
                    if (failed) return r;
                    match(input,28,FOLLOW_28_in_extension387); if (failed) return r;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:73: (params= declaredParameterList )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Identifier||(LA15_0>=38 && LA15_0<=40)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:83:74: params= declaredParameterList
                            {
                            pushFollow(FOLLOW_declaredParameterList_in_extension392);
                            params=declaredParameterList();
                            _fsp--;
                            if (failed) return r;

                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_extension396); if (failed) return r;
                    match(input,26,FOLLOW_26_in_extension398); if (failed) return r;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:85:2: ( 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';' | expr= expression ';' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==35) ) {
                        alt18=1;
                    }
                    else if ( ((LA18_0>=StringLiteral && LA18_0<=Identifier)||LA18_0==23||LA18_0==28||(LA18_0>=38 && LA18_0<=41)||(LA18_0>=47 && LA18_0<=48)||LA18_0==62||(LA18_0>=64 && LA18_0<=78)) ) {
                        alt18=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return r;}
                        NoViableAltException nvae =
                            new NoViableAltException("85:2: ( 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';' | expr= expression ';' )", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:85:4: 'JAVA' jt= javaType '.' m= identifier '(' (pt= javaType ( ',' pt= javaType )* )? ')' ';'
                            {
                            match(input,35,FOLLOW_35_in_extension405); if (failed) return r;
                            pushFollow(FOLLOW_javaType_in_extension409);
                            jt=javaType();
                            _fsp--;
                            if (failed) return r;
                            match(input,36,FOLLOW_36_in_extension411); if (failed) return r;
                            pushFollow(FOLLOW_identifier_in_extension415);
                            m=identifier();
                            _fsp--;
                            if (failed) return r;
                            match(input,28,FOLLOW_28_in_extension417); if (failed) return r;
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:85:43: (pt= javaType ( ',' pt= javaType )* )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==Identifier) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:85:44: pt= javaType ( ',' pt= javaType )*
                                    {
                                    pushFollow(FOLLOW_javaType_in_extension421);
                                    pt=javaType();
                                    _fsp--;
                                    if (failed) return r;
                                    if ( backtracking==0 ) {
                                      javaParamTypes.add(pt);
                                    }
                                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:85:81: ( ',' pt= javaType )*
                                    loop16:
                                    do {
                                        int alt16=2;
                                        int LA16_0 = input.LA(1);

                                        if ( (LA16_0==29) ) {
                                            alt16=1;
                                        }


                                        switch (alt16) {
                                    	case 1 :
                                    	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:85:82: ',' pt= javaType
                                    	    {
                                    	    match(input,29,FOLLOW_29_in_extension425); if (failed) return r;
                                    	    pushFollow(FOLLOW_javaType_in_extension429);
                                    	    pt=javaType();
                                    	    _fsp--;
                                    	    if (failed) return r;
                                    	    if ( backtracking==0 ) {
                                    	      javaParamTypes.add(pt);
                                    	    }

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop16;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            match(input,31,FOLLOW_31_in_extension437); if (failed) return r;
                            match(input,19,FOLLOW_19_in_extension439); if (failed) return r;
                            if ( backtracking==0 ) {
                               r = factory.createJavaExtension(name,rType,params,jt,m,javaParamTypes, id(cached),id(priv));
                            }

                            }
                            break;
                        case 2 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:87:4: expr= expression ';'
                            {
                            pushFollow(FOLLOW_expression_in_extension449);
                            expr=expression();
                            _fsp--;
                            if (failed) return r;
                            match(input,19,FOLLOW_19_in_extension451); if (failed) return r;
                            if ( backtracking==0 ) {
                               r = factory.createExpressionExtension(name,rType,params,expr,  id(cached),id(priv)); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:91:3: (priv= 'private' )? create= 'create' rType= type (rtn= identifier )? name= identifier '(' (params= declaredParameterList )? ')' ':' expr= expression ';'
                    {
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:91:3: (priv= 'private' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==33) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:91:4: priv= 'private'
                            {
                            priv=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_extension465); if (failed) return r;

                            }
                            break;

                    }

                    create=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_extension471); if (failed) return r;
                    pushFollow(FOLLOW_type_in_extension475);
                    rType=type();
                    _fsp--;
                    if (failed) return r;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:91:48: (rtn= identifier )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==Identifier) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==Identifier) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:91:49: rtn= identifier
                            {
                            pushFollow(FOLLOW_identifier_in_extension480);
                            rtn=identifier();
                            _fsp--;
                            if (failed) return r;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_extension486);
                    name=identifier();
                    _fsp--;
                    if (failed) return r;
                    match(input,28,FOLLOW_28_in_extension488); if (failed) return r;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:91:86: (params= declaredParameterList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Identifier||(LA21_0>=38 && LA21_0<=40)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:91:87: params= declaredParameterList
                            {
                            pushFollow(FOLLOW_declaredParameterList_in_extension493);
                            params=declaredParameterList();
                            _fsp--;
                            if (failed) return r;

                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_extension497); if (failed) return r;
                    match(input,26,FOLLOW_26_in_extension499); if (failed) return r;
                    pushFollow(FOLLOW_expression_in_extension505);
                    expr=expression();
                    _fsp--;
                    if (failed) return r;
                    match(input,19,FOLLOW_19_in_extension507); if (failed) return r;
                    if ( backtracking==0 ) {
                       r = factory.createCreateExtension(id(create),rType,rtn,name,params,expr,id(priv)); 
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
        return r;
    }
    // $ANTLR end extension


    // $ANTLR start javaType
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:97:1: javaType returns [Identifier r] : i= identifier (d= '.' (i1= identifier | i2= 'Collection' | i3= 'List' | i4= 'Set' ) )* ;
    public Identifier javaType() throws RecognitionException {
        Identifier r = null;

        Token d=null;
        Token i2=null;
        Token i3=null;
        Token i4=null;
        Identifier i = null;

        Identifier i1 = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:98:2: (i= identifier (d= '.' (i1= identifier | i2= 'Collection' | i3= 'List' | i4= 'Set' ) )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:98:2: i= identifier (d= '.' (i1= identifier | i2= 'Collection' | i3= 'List' | i4= 'Set' ) )*
            {
            pushFollow(FOLLOW_identifier_in_javaType529);
            i=identifier();
            _fsp--;
            if (failed) return r;
            if ( backtracking==0 ) {
              r = i;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:99:2: (d= '.' (i1= identifier | i2= 'Collection' | i3= 'List' | i4= 'Set' ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==Identifier) ) {
                        int LA24_3 = input.LA(3);

                        if ( (LA24_3==29||LA24_3==31||LA24_3==36) ) {
                            alt24=1;
                        }


                    }
                    else if ( ((LA24_1>=38 && LA24_1<=40)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:99:3: d= '.' (i1= identifier | i2= 'Collection' | i3= 'List' | i4= 'Set' )
            	    {
            	    d=(Token)input.LT(1);
            	    match(input,36,FOLLOW_36_in_javaType538); if (failed) return r;
            	    if ( backtracking==0 ) {
            	      if (r!=null)r.append(id(d));
            	    }
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:99:41: (i1= identifier | i2= 'Collection' | i3= 'List' | i4= 'Set' )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case Identifier:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return r;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("99:41: (i1= identifier | i2= 'Collection' | i3= 'List' | i4= 'Set' )", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:99:42: i1= identifier
            	            {
            	            pushFollow(FOLLOW_identifier_in_javaType544);
            	            i1=identifier();
            	            _fsp--;
            	            if (failed) return r;
            	            if ( backtracking==0 ) {
            	              if (r!=null)r.append(i1);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:99:86: i2= 'Collection'
            	            {
            	            i2=(Token)input.LT(1);
            	            match(input,38,FOLLOW_38_in_javaType550); if (failed) return r;
            	            if ( backtracking==0 ) {
            	              r.append(id(i2));
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:100:2: i3= 'List'
            	            {
            	            i3=(Token)input.LT(1);
            	            match(input,39,FOLLOW_39_in_javaType559); if (failed) return r;
            	            if ( backtracking==0 ) {
            	              if (r!=null)r.append(id(i3));
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:100:46: i4= 'Set'
            	            {
            	            i4=(Token)input.LT(1);
            	            match(input,40,FOLLOW_40_in_javaType565); if (failed) return r;
            	            if ( backtracking==0 ) {
            	              if (r!=null)r.append(id(i4));
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
        return r;
    }
    // $ANTLR end javaType


    // $ANTLR start expression
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:106:1: expression returns [Expression e] : x= letExpression ;
    public Expression expression() throws RecognitionException {
        Expression e = null;

        Expression x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:107:2: (x= letExpression )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:107:2: x= letExpression
            {
            pushFollow(FOLLOW_letExpression_in_expression587);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:110:1: letExpression returns [Expression e] : ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression );
    public Expression letExpression() throws RecognitionException {
        Expression e = null;

        Identifier v = null;

        Expression varExpr = null;

        Expression target = null;

        Expression x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:111:4: ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=StringLiteral && LA25_0<=Identifier)||LA25_0==23||LA25_0==28||(LA25_0>=38 && LA25_0<=40)||(LA25_0>=47 && LA25_0<=48)||LA25_0==62||(LA25_0>=64 && LA25_0<=78)) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("110:1: letExpression returns [Expression e] : ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:111:4: 'let' v= identifier '=' varExpr= castedExpression ':' target= expression
                    {
                    match(input,41,FOLLOW_41_in_letExpression606); if (failed) return e;
                    pushFollow(FOLLOW_identifier_in_letExpression610);
                    v=identifier();
                    _fsp--;
                    if (failed) return e;
                    match(input,42,FOLLOW_42_in_letExpression612); if (failed) return e;
                    pushFollow(FOLLOW_castedExpression_in_letExpression616);
                    varExpr=castedExpression();
                    _fsp--;
                    if (failed) return e;
                    match(input,26,FOLLOW_26_in_letExpression618); if (failed) return e;
                    pushFollow(FOLLOW_expression_in_letExpression622);
                    target=expression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =factory.createLetExpression(v,varExpr,target);
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:113:4: x= castedExpression
                    {
                    pushFollow(FOLLOW_castedExpression_in_letExpression635);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:116:1: castedExpression returns [Expression e] : ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression );
    public Expression castedExpression() throws RecognitionException {
        Expression e = null;

        Identifier t = null;

        Expression x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:117:5: ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:117:5: ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression
                    {
                    match(input,28,FOLLOW_28_in_castedExpression666); if (failed) return e;
                    pushFollow(FOLLOW_type_in_castedExpression670);
                    t=type();
                    _fsp--;
                    if (failed) return e;
                    match(input,31,FOLLOW_31_in_castedExpression672); if (failed) return e;
                    pushFollow(FOLLOW_chainExpression_in_castedExpression676);
                    x=chainExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createCast(t,x);
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:119:4: x= chainExpression
                    {
                    pushFollow(FOLLOW_chainExpression_in_castedExpression685);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:123:1: chainExpression returns [Expression e] : x= ifExpression ( '->' right= ifExpression )* ;
    public Expression chainExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        Expression right = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:124:2: (x= ifExpression ( '->' right= ifExpression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:124:2: x= ifExpression ( '->' right= ifExpression )*
            {
            pushFollow(FOLLOW_ifExpression_in_chainExpression705);
            x=ifExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:124:25: ( '->' right= ifExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:124:27: '->' right= ifExpression
            	    {
            	    match(input,43,FOLLOW_43_in_chainExpression711); if (failed) return e;
            	    pushFollow(FOLLOW_ifExpression_in_chainExpression715);
            	    right=ifExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e =factory.createChainExpression(e,right);
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:127:1: ifExpression returns [Expression e] : (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? );
    public Expression ifExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        Expression thenPart = null;

        Expression elsePart = null;

        Expression condition = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:128:2: (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=StringLiteral && LA30_0<=Identifier)||LA30_0==28||(LA30_0>=38 && LA30_0<=40)||(LA30_0>=47 && LA30_0<=48)||LA30_0==62||(LA30_0>=64 && LA30_0<=78)) ) {
                alt30=1;
            }
            else if ( (LA30_0==23) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("127:1: ifExpression returns [Expression e] : (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:128:2: x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )?
                    {
                    pushFollow(FOLLOW_switchExpression_in_ifExpression736);
                    x=switchExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:128:28: ( '?' thenPart= switchExpression ':' elsePart= switchExpression )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==44) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:128:29: '?' thenPart= switchExpression ':' elsePart= switchExpression
                            {
                            match(input,44,FOLLOW_44_in_ifExpression740); if (failed) return e;
                            pushFollow(FOLLOW_switchExpression_in_ifExpression744);
                            thenPart=switchExpression();
                            _fsp--;
                            if (failed) return e;
                            match(input,26,FOLLOW_26_in_ifExpression746); if (failed) return e;
                            pushFollow(FOLLOW_switchExpression_in_ifExpression750);
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
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:129:3: 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )?
                    {
                    match(input,23,FOLLOW_23_in_ifExpression758); if (failed) return e;
                    pushFollow(FOLLOW_switchExpression_in_ifExpression762);
                    condition=switchExpression();
                    _fsp--;
                    if (failed) return e;
                    match(input,45,FOLLOW_45_in_ifExpression764); if (failed) return e;
                    pushFollow(FOLLOW_switchExpression_in_ifExpression768);
                    thenPart=switchExpression();
                    _fsp--;
                    if (failed) return e;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:129:68: ( 'else' elsePart= expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==46) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:129:69: 'else' elsePart= expression
                            {
                            match(input,46,FOLLOW_46_in_ifExpression771); if (failed) return e;
                            pushFollow(FOLLOW_expression_in_ifExpression775);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:133:1: switchExpression returns [Expression e=null] : ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression );
    public Expression switchExpression() throws RecognitionException {
        Expression e = null;

        Expression pred = null;

        Expression c = null;

        Expression v = null;

        Expression def = null;

        Expression x = null;


        List cases = new ArrayList();
        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:134:4: ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=StringLiteral && LA33_0<=Identifier)||LA33_0==28||(LA33_0>=38 && LA33_0<=40)||LA33_0==48||LA33_0==62||(LA33_0>=64 && LA33_0<=78)) ) {
                alt33=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("133:1: switchExpression returns [Expression e=null] : ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression );", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:134:4: 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}'
                    {
                    match(input,47,FOLLOW_47_in_switchExpression802); if (failed) return e;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:134:13: ( '(' pred= orExpression ')' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==28) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:134:14: '(' pred= orExpression ')'
                            {
                            match(input,28,FOLLOW_28_in_switchExpression805); if (failed) return e;
                            pushFollow(FOLLOW_orExpression_in_switchExpression811);
                            pred=orExpression();
                            _fsp--;
                            if (failed) return e;
                            match(input,31,FOLLOW_31_in_switchExpression813); if (failed) return e;

                            }
                            break;

                    }

                    match(input,48,FOLLOW_48_in_switchExpression820); if (failed) return e;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:136:4: ( 'case' c= orExpression ':' v= orExpression )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==49) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:137:6: 'case' c= orExpression ':' v= orExpression
                    	    {
                    	    match(input,49,FOLLOW_49_in_switchExpression833); if (failed) return e;
                    	    pushFollow(FOLLOW_orExpression_in_switchExpression837);
                    	    c=orExpression();
                    	    _fsp--;
                    	    if (failed) return e;
                    	    match(input,26,FOLLOW_26_in_switchExpression840); if (failed) return e;
                    	    pushFollow(FOLLOW_orExpression_in_switchExpression845);
                    	    v=orExpression();
                    	    _fsp--;
                    	    if (failed) return e;
                    	    if ( backtracking==0 ) {
                    	      cases.add(factory.createCase(c, v));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    match(input,50,FOLLOW_50_in_switchExpression863); if (failed) return e;
                    match(input,26,FOLLOW_26_in_switchExpression865); if (failed) return e;
                    pushFollow(FOLLOW_orExpression_in_switchExpression871);
                    def=orExpression();
                    _fsp--;
                    if (failed) return e;
                    match(input,51,FOLLOW_51_in_switchExpression876); if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createSwitchExpression(pred,cases,def);
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:143:4: x= orExpression
                    {
                    pushFollow(FOLLOW_orExpression_in_switchExpression888);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:146:1: orExpression returns [Expression e] : x= andExpression (name= '||' r= andExpression )* ;
    public Expression orExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:147:4: (x= andExpression (name= '||' r= andExpression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:147:4: x= andExpression (name= '||' r= andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_orExpression908);
            x=andExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:147:28: (name= '||' r= andExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==52) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:147:29: name= '||' r= andExpression
            	    {
            	    name=(Token)input.LT(1);
            	    match(input,52,FOLLOW_52_in_orExpression915); if (failed) return e;
            	    pushFollow(FOLLOW_andExpression_in_orExpression919);
            	    r=andExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:150:1: andExpression returns [Expression e] : x= impliesExpression (name= '&&' r= impliesExpression )* ;
    public Expression andExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:151:2: (x= impliesExpression (name= '&&' r= impliesExpression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:151:2: x= impliesExpression (name= '&&' r= impliesExpression )*
            {
            pushFollow(FOLLOW_impliesExpression_in_andExpression942);
            x=impliesExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:151:30: (name= '&&' r= impliesExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==53) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:151:31: name= '&&' r= impliesExpression
            	    {
            	    name=(Token)input.LT(1);
            	    match(input,53,FOLLOW_53_in_andExpression949); if (failed) return e;
            	    pushFollow(FOLLOW_impliesExpression_in_andExpression953);
            	    r=impliesExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:154:1: impliesExpression returns [Expression e] : x= relationalExpression (name= 'implies' r= relationalExpression )* ;
    public Expression impliesExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:155:2: (x= relationalExpression (name= 'implies' r= relationalExpression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:155:2: x= relationalExpression (name= 'implies' r= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_impliesExpression975);
            x=relationalExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:155:33: (name= 'implies' r= relationalExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==54) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:155:34: name= 'implies' r= relationalExpression
            	    {
            	    name=(Token)input.LT(1);
            	    match(input,54,FOLLOW_54_in_impliesExpression982); if (failed) return e;
            	    pushFollow(FOLLOW_relationalExpression_in_impliesExpression986);
            	    r=relationalExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:159:1: relationalExpression returns [Expression e] : x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )* ;
    public Expression relationalExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:160:2: (x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:160:2: x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1010);
            x=additiveExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:161:2: (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=55 && LA37_0<=60)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:161:3: name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression
            	    {
            	    name=(Token)input.LT(1);
            	    if ( (input.LA(1)>=55 && input.LA(1)<=60) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1018);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1044);
            	    r=additiveExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:165:1: additiveExpression returns [Expression e] : x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )* ;
    public Expression additiveExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:166:2: (x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:166:2: x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1065);
            x=multiplicativeExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:167:4: (name= ( '+' | '-' ) r= multiplicativeExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=61 && LA38_0<=62)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:167:5: name= ( '+' | '-' ) r= multiplicativeExpression
            	    {
            	    name=(Token)input.LT(1);
            	    if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpression1075);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1084);
            	    r=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:170:1: multiplicativeExpression returns [Expression e] : x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )* ;
    public Expression multiplicativeExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:171:2: (x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:171:2: x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1103);
            x=unaryExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:172:2: (name= ( '*' | '/' ) r= unaryExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==30||LA39_0==63) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:172:3: name= ( '*' | '/' ) r= unaryExpression
            	    {
            	    name=(Token)input.LT(1);
            	    if ( input.LA(1)==30||input.LA(1)==63 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpression1111);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1121);
            	    r=unaryExpression();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
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
    // $ANTLR end multiplicativeExpression


    // $ANTLR start unaryExpression
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:176:1: unaryExpression returns [Expression e] : (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression );
    public Expression unaryExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:177:2: (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression )
            int alt40=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 28:
            case 38:
            case 39:
            case 40:
            case 48:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt40=1;
                }
                break;
            case 64:
                {
                alt40=2;
                }
                break;
            case 62:
                {
                alt40=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("176:1: unaryExpression returns [Expression e] : (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression );", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:177:2: x= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1142);
                    x=infixExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:178:3: name= '!' x= infixExpression
                    {
                    name=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_unaryExpression1150); if (failed) return e;
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1154);
                    x=infixExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createOperationCall(id(name),x);
                    }

                    }
                    break;
                case 3 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:179:3: name= '-' x= infixExpression
                    {
                    name=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_unaryExpression1162); if (failed) return e;
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1166);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:182:1: infixExpression returns [Expression e] : x= primaryExpression ( '.' op= featureCall )* ;
    public Expression infixExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        FeatureCall op = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:183:2: (x= primaryExpression ( '.' op= featureCall )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:183:2: x= primaryExpression ( '.' op= featureCall )*
            {
            pushFollow(FOLLOW_primaryExpression_in_infixExpression1184);
            x=primaryExpression();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
              e =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:183:30: ( '.' op= featureCall )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==36) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:183:32: '.' op= featureCall
            	    {
            	    match(input,36,FOLLOW_36_in_infixExpression1190); if (failed) return e;
            	    pushFollow(FOLLOW_featureCall_in_infixExpression1194);
            	    op=featureCall();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       if (op!=null) { op.setTarget(e);e =op;}
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
    // $ANTLR end infixExpression


    // $ANTLR start primaryExpression
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:186:1: primaryExpression returns [Expression e] : (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression );
    public Expression primaryExpression() throws RecognitionException {
        Expression e = null;

        Token c=null;
        Expression x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:187:4: (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression )
            int alt42=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt42=1;
                }
                break;
            case Identifier:
            case 38:
            case 39:
            case 40:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt42=2;
                }
                break;
            case 67:
            case 68:
                {
                alt42=3;
                }
                break;
            case IntLiteral:
                {
                alt42=4;
                }
                break;
            case 69:
                {
                alt42=5;
                }
                break;
            case 48:
                {
                alt42=6;
                }
                break;
            case 66:
                {
                alt42=7;
                }
                break;
            case 65:
                {
                alt42=8;
                }
                break;
            case 28:
                {
                alt42=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("186:1: primaryExpression returns [Expression e] : (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression );", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:187:4: c= StringLiteral
                    {
                    c=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_primaryExpression1220); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createStringLiteral(id(c));
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:188:5: x= featureCall
                    {
                    pushFollow(FOLLOW_featureCall_in_primaryExpression1231);
                    x=featureCall();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 3 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:189:5: x= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression1241);
                    x=booleanLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 4 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:190:5: x= numberLiteral
                    {
                    pushFollow(FOLLOW_numberLiteral_in_primaryExpression1251);
                    x=numberLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 5 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:191:5: x= nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_primaryExpression1261);
                    x=nullLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 6 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:192:5: x= listLiteral
                    {
                    pushFollow(FOLLOW_listLiteral_in_primaryExpression1271);
                    x=listLiteral();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 7 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:193:5: x= constructorCall
                    {
                    pushFollow(FOLLOW_constructorCall_in_primaryExpression1281);
                    x=constructorCall();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 8 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:194:5: x= globalVarExpression
                    {
                    pushFollow(FOLLOW_globalVarExpression_in_primaryExpression1291);
                    x=globalVarExpression();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 9 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:195:5: x= paranthesizedExpression
                    {
                    pushFollow(FOLLOW_paranthesizedExpression_in_primaryExpression1301);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:198:1: paranthesizedExpression returns [Expression e] : '(' x= expression ')' ;
    public Expression paranthesizedExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:199:5: ( '(' x= expression ')' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:199:5: '(' x= expression ')'
            {
            match(input,28,FOLLOW_28_in_paranthesizedExpression1320); if (failed) return e;
            pushFollow(FOLLOW_expression_in_paranthesizedExpression1324);
            x=expression();
            _fsp--;
            if (failed) return e;
            match(input,31,FOLLOW_31_in_paranthesizedExpression1326); if (failed) return e;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:202:1: globalVarExpression returns [GlobalVarExpression e] : 'GLOBALVAR' name= identifier ;
    public GlobalVarExpression globalVarExpression() throws RecognitionException {
        GlobalVarExpression e = null;

        Identifier name = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:203:5: ( 'GLOBALVAR' name= identifier )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:203:5: 'GLOBALVAR' name= identifier
            {
            match(input,65,FOLLOW_65_in_globalVarExpression1346); if (failed) return e;
            pushFollow(FOLLOW_identifier_in_globalVarExpression1350);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:205:1: featureCall returns [FeatureCall e] : (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression );
    public FeatureCall featureCall() throws RecognitionException {
        FeatureCall e = null;

        Identifier id1 = null;

        List<Expression> l = null;

        Identifier t = null;

        FeatureCall x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:206:2: (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression )
            int alt44=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==28) ) {
                    alt44=1;
                }
                else if ( (LA44_1==EOF||LA44_1==19||(LA44_1>=24 && LA44_1<=26)||(LA44_1>=29 && LA44_1<=32)||LA44_1==36||(LA44_1>=43 && LA44_1<=46)||(LA44_1>=49 && LA44_1<=63)) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("205:1: featureCall returns [FeatureCall e] : (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression );", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt44=2;
                }
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt44=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("205:1: featureCall returns [FeatureCall e] : (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression );", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:206:2: id1= identifier '(' (l= parameterList )? ')'
                    {
                    pushFollow(FOLLOW_identifier_in_featureCall1368);
                    id1=identifier();
                    _fsp--;
                    if (failed) return e;
                    match(input,28,FOLLOW_28_in_featureCall1370); if (failed) return e;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:206:21: (l= parameterList )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=StringLiteral && LA43_0<=Identifier)||LA43_0==23||LA43_0==28||(LA43_0>=38 && LA43_0<=41)||(LA43_0>=47 && LA43_0<=48)||LA43_0==62||(LA43_0>=64 && LA43_0<=78)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:206:22: l= parameterList
                            {
                            pushFollow(FOLLOW_parameterList_in_featureCall1375);
                            l=parameterList();
                            _fsp--;
                            if (failed) return e;

                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_featureCall1379); if (failed) return e;
                    if ( backtracking==0 ) {
                      e = factory.createOperationCall(id1,l);
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:207:5: t= type
                    {
                    pushFollow(FOLLOW_type_in_featureCall1389);
                    t=type();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                      e =factory.createFeatureCall(t,null);
                    }

                    }
                    break;
                case 3 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:208:5: x= collectionExpression
                    {
                    pushFollow(FOLLOW_collectionExpression_in_featureCall1400);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:211:1: listLiteral returns [Expression e] : '{' (l= parameterList )? '}' ;
    public Expression listLiteral() throws RecognitionException {
        Expression e = null;

        List<Expression> l = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:212:2: ( '{' (l= parameterList )? '}' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:212:2: '{' (l= parameterList )? '}'
            {
            match(input,48,FOLLOW_48_in_listLiteral1417); if (failed) return e;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:212:6: (l= parameterList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=StringLiteral && LA45_0<=Identifier)||LA45_0==23||LA45_0==28||(LA45_0>=38 && LA45_0<=41)||(LA45_0>=47 && LA45_0<=48)||LA45_0==62||(LA45_0>=64 && LA45_0<=78)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:212:7: l= parameterList
                    {
                    pushFollow(FOLLOW_parameterList_in_listLiteral1422);
                    l=parameterList();
                    _fsp--;
                    if (failed) return e;

                    }
                    break;

            }

            match(input,51,FOLLOW_51_in_listLiteral1426); if (failed) return e;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:215:1: constructorCall returns [Expression e] : 'new' t= simpleType ;
    public Expression constructorCall() throws RecognitionException {
        Expression e = null;

        Identifier t = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:216:2: ( 'new' t= simpleType )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:216:2: 'new' t= simpleType
            {
            match(input,66,FOLLOW_66_in_constructorCall1443); if (failed) return e;
            pushFollow(FOLLOW_simpleType_in_constructorCall1447);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:220:1: booleanLiteral returns [Expression e=factory.createBooleanLiteral(id(input.LT(1)))] : ( 'false' | 'true' );
    public Expression booleanLiteral() throws RecognitionException {
        Expression e = factory.createBooleanLiteral(id(input.LT(1)));

        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:221:2: ( 'false' | 'true' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:
            {
            if ( (input.LA(1)>=67 && input.LA(1)<=68) ) {
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:224:1: nullLiteral returns [Expression e=factory.createNullLiteral(id(input.LT(1)))] : 'null' ;
    public Expression nullLiteral() throws RecognitionException {
        Expression e = factory.createNullLiteral(id(input.LT(1)));

        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:225:2: ( 'null' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:225:2: 'null'
            {
            match(input,69,FOLLOW_69_in_nullLiteral1482); if (failed) return e;

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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:228:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );
    public Expression numberLiteral() throws RecognitionException {
        Expression e = null;

        Token a=null;
        Token b=null;
        Token c=null;

        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:229:4: (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IntLiteral) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==36) ) {
                    int LA46_2 = input.LA(3);

                    if ( (LA46_2==IntLiteral) ) {
                        alt46=2;
                    }
                    else if ( (LA46_2==Identifier||(LA46_2>=38 && LA46_2<=40)||(LA46_2>=70 && LA46_2<=78)) ) {
                        alt46=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("228:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );", 46, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA46_1==EOF||LA46_1==19||(LA46_1>=24 && LA46_1<=26)||(LA46_1>=29 && LA46_1<=31)||(LA46_1>=43 && LA46_1<=46)||(LA46_1>=49 && LA46_1<=63)) ) {
                    alt46=1;
                }
                else {
                    if (backtracking>0) {failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("228:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("228:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:229:4: a= IntLiteral
                    {
                    a=(Token)input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1501); if (failed) return e;
                    if ( backtracking==0 ) {
                      e =factory.createIntegerLiteral(id(a));
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:230:4: a= IntLiteral b= '.' c= IntLiteral
                    {
                    a=(Token)input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1510); if (failed) return e;
                    b=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_numberLiteral1514); if (failed) return e;
                    c=(Token)input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1518); if (failed) return e;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:233:1: collectionExpression returns [FeatureCall e] : (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' );
    public FeatureCall collectionExpression() throws RecognitionException {
        FeatureCall e = null;

        Token name=null;
        Identifier t = null;

        Identifier var = null;

        Expression x = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:234:3: (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==70) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=71 && LA48_0<=78)) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("233:1: collectionExpression returns [FeatureCall e] : (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' );", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:234:3: name= 'typeSelect' '(' t= type ')'
                    {
                    name=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_collectionExpression1538); if (failed) return e;
                    match(input,28,FOLLOW_28_in_collectionExpression1542); if (failed) return e;
                    pushFollow(FOLLOW_type_in_collectionExpression1546);
                    t=type();
                    _fsp--;
                    if (failed) return e;
                    match(input,31,FOLLOW_31_in_collectionExpression1548); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createTypeSelectExpression(id(name),t);
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:237:5: name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')'
                    {
                    name=(Token)input.LT(1);
                    if ( (input.LA(1)>=71 && input.LA(1)<=78) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return e;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_collectionExpression1561);    throw mse;
                    }

                    match(input,28,FOLLOW_28_in_collectionExpression1611); if (failed) return e;
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:244:19: (var= identifier '|' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==Identifier) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==79) ) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:244:20: var= identifier '|'
                            {
                            pushFollow(FOLLOW_identifier_in_collectionExpression1616);
                            var=identifier();
                            _fsp--;
                            if (failed) return e;
                            match(input,79,FOLLOW_79_in_collectionExpression1618); if (failed) return e;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_collectionExpression1624);
                    x=expression();
                    _fsp--;
                    if (failed) return e;
                    match(input,31,FOLLOW_31_in_collectionExpression1626); if (failed) return e;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:250:1: declaredParameterList returns [List<DeclaredParameter> l = new ArrayList<DeclaredParameter>()] : dp= declaredParameter ( ',' dp1= declaredParameter )* ;
    public List<DeclaredParameter> declaredParameterList() throws RecognitionException {
        List<DeclaredParameter> l =  new ArrayList<DeclaredParameter>();

        DeclaredParameter dp = null;

        DeclaredParameter dp1 = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:251:2: (dp= declaredParameter ( ',' dp1= declaredParameter )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:251:2: dp= declaredParameter ( ',' dp1= declaredParameter )*
            {
            pushFollow(FOLLOW_declaredParameter_in_declaredParameterList1650);
            dp=declaredParameter();
            _fsp--;
            if (failed) return l;
            if ( backtracking==0 ) {
              l.add(dp);
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:251:36: ( ',' dp1= declaredParameter )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==29) ) {
                    int LA49_1 = input.LA(2);

                    if ( (LA49_1==Identifier||(LA49_1>=38 && LA49_1<=40)) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:251:37: ',' dp1= declaredParameter
            	    {
            	    match(input,29,FOLLOW_29_in_declaredParameterList1654); if (failed) return l;
            	    pushFollow(FOLLOW_declaredParameter_in_declaredParameterList1658);
            	    dp1=declaredParameter();
            	    _fsp--;
            	    if (failed) return l;
            	    if ( backtracking==0 ) {
            	      l.add(dp1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:254:1: declaredParameter returns [DeclaredParameter dp] : t= type name= identifier ;
    public DeclaredParameter declaredParameter() throws RecognitionException {
        DeclaredParameter dp = null;

        Identifier t = null;

        Identifier name = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:255:2: (t= type name= identifier )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:255:2: t= type name= identifier
            {
            pushFollow(FOLLOW_type_in_declaredParameter1678);
            t=type();
            _fsp--;
            if (failed) return dp;
            pushFollow(FOLLOW_identifier_in_declaredParameter1682);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:258:1: parameterList returns [List<Expression> list = new ArrayList<Expression>()] : a= expression ( ',' b= expression )* ;
    public List<Expression> parameterList() throws RecognitionException {
        List<Expression> list =  new ArrayList<Expression>();

        Expression a = null;

        Expression b = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:259:5: (a= expression ( ',' b= expression )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:259:5: a= expression ( ',' b= expression )*
            {
            pushFollow(FOLLOW_expression_in_parameterList1704);
            a=expression();
            _fsp--;
            if (failed) return list;
            if ( backtracking==0 ) {
              list.add(a);
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:259:34: ( ',' b= expression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==29) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:259:35: ',' b= expression
            	    {
            	    match(input,29,FOLLOW_29_in_parameterList1709); if (failed) return list;
            	    pushFollow(FOLLOW_expression_in_parameterList1713);
            	    b=expression();
            	    _fsp--;
            	    if (failed) return list;
            	    if ( backtracking==0 ) {
            	      list.add(b);
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:264:1: type returns [Identifier id] : (a= collectionType | b= simpleType );
    public Identifier type() throws RecognitionException {
        Identifier id = null;

        Identifier a = null;

        Identifier b = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:265:2: (a= collectionType | b= simpleType )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=38 && LA51_0<=40)) ) {
                alt51=1;
            }
            else if ( (LA51_0==Identifier) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return id;}
                NoViableAltException nvae =
                    new NoViableAltException("264:1: type returns [Identifier id] : (a= collectionType | b= simpleType );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:265:2: a= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type1739);
                    a=collectionType();
                    _fsp--;
                    if (failed) return id;
                    if ( backtracking==0 ) {
                      id =a;
                    }

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:266:2: b= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type1749);
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:269:1: collectionType returns [Identifier id ] : cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )? ;
    public Identifier collectionType() throws RecognitionException {
        Identifier id = null;

        Token cl=null;
        Token b=null;
        Token c=null;
        Identifier id1 = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:270:3: (cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )? )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:270:3: cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )?
            {
            cl=(Token)input.LT(1);
            if ( (input.LA(1)>=38 && input.LA(1)<=40) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return id;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_collectionType1771);    throw mse;
            }

            if ( backtracking==0 ) {
              id = id(cl);
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:271:3: (b= '[' id1= simpleType c= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==80) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:271:4: b= '[' id1= simpleType c= ']'
                    {
                    b=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_collectionType1792); if (failed) return id;
                    pushFollow(FOLLOW_simpleType_in_collectionType1796);
                    id1=simpleType();
                    _fsp--;
                    if (failed) return id;
                    c=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_collectionType1800); if (failed) return id;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:274:1: simpleType returns [Identifier id] : x= identifier (d= '::' end= identifier )* ;
    public Identifier simpleType() throws RecognitionException {
        Identifier id = null;

        Token d=null;
        Identifier x = null;

        Identifier end = null;


        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:275:2: (x= identifier (d= '::' end= identifier )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:275:2: x= identifier (d= '::' end= identifier )*
            {
            pushFollow(FOLLOW_identifier_in_simpleType1820);
            x=identifier();
            _fsp--;
            if (failed) return id;
            if ( backtracking==0 ) {
              id =x;
            }
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:276:2: (d= '::' end= identifier )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==32) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:276:3: d= '::' end= identifier
            	    {
            	    d=(Token)input.LT(1);
            	    match(input,32,FOLLOW_32_in_simpleType1828); if (failed) return id;
            	    pushFollow(FOLLOW_identifier_in_simpleType1832);
            	    end=identifier();
            	    _fsp--;
            	    if (failed) return id;
            	    if ( backtracking==0 ) {
            	      id.append(id(d)); id.append(end);
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:279:1: identifier returns [Identifier r] : x= Identifier ;
    public Identifier identifier() throws RecognitionException {
        Identifier r = null;

        Token x=null;

        try {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:280:4: (x= Identifier )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:280:4: x= Identifier
            {
            x=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_identifier1855); if (failed) return r;
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
        // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:117:5: ( '(' type ')' castedExpression )
        // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:117:6: '(' type ')' castedExpression
        {
        match(input,28,FOLLOW_28_in_synpred1655); if (failed) return ;
        pushFollow(FOLLOW_type_in_synpred1657);
        type();
        _fsp--;
        if (failed) return ;
        match(input,31,FOLLOW_31_in_synpred1659); if (failed) return ;
        pushFollow(FOLLOW_castedExpression_in_synpred1661);
        castedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    public final boolean synpred1() {
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


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\67\uffff";
    static final String DFA26_eofS =
        "\6\uffff\1\2\60\uffff";
    static final String DFA26_minS =
        "\2\4\1\uffff\1\36\1\34\1\6\1\4\1\6\1\40\16\uffff\1\4\1\uffff\1\36"+
        "\1\6\1\36\3\0\2\34\4\0\2\6\1\0\1\40\1\6\3\0\2\37\1\6\1\0\1\6\1\40"+
        "\1\37\1\6\1\37\1\40";
    static final String DFA26_maxS =
        "\2\116\1\uffff\1\120\1\77\1\6\1\116\1\6\1\121\16\uffff\1\116\1\uffff"+
        "\1\77\1\6\1\77\3\0\2\34\4\0\2\6\1\0\1\121\1\50\3\0\1\120\1\40\1"+
        "\6\1\0\1\6\1\121\1\40\1\6\1\37\1\121";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\6\uffff\16\1\1\uffff\1\1\36\uffff";
    static final String DFA26_specialS =
        "\6\uffff\1\4\25\uffff\1\6\1\7\1\13\2\uffff\1\14\1\5\1\2\1\3\2\uffff"+
        "\1\1\2\uffff\1\12\1\11\1\10\3\uffff\1\0\6\uffff}>";
    static final String[] DFA26_transitionS = {
            "\3\2\20\uffff\1\2\4\uffff\1\1\11\uffff\3\2\6\uffff\2\2\15\uffff"+
            "\1\2\1\uffff\17\2",
            "\2\2\1\4\20\uffff\1\2\4\uffff\1\2\11\uffff\3\3\1\2\5\uffff\2"+
            "\2\15\uffff\1\2\1\uffff\17\2",
            "",
            "\1\2\1\6\4\uffff\1\2\6\uffff\2\2\7\uffff\14\2\20\uffff\1\5",
            "\1\2\1\uffff\1\2\1\6\1\7\3\uffff\1\2\6\uffff\2\2\7\uffff\14"+
            "\2",
            "\1\10",
            "\1\12\1\20\1\13\14\uffff\1\2\3\uffff\1\30\3\2\1\uffff\1\25\3"+
            "\2\4\uffff\1\2\1\uffff\3\14\2\uffff\2\2\2\uffff\1\11\1\22\2"+
            "\uffff\13\2\1\27\1\2\1\26\1\24\1\23\2\17\1\21\1\15\10\16",
            "\1\31",
            "\1\32\60\uffff\1\33",
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
            "",
            "",
            "",
            "\1\34\1\42\1\35\25\uffff\1\47\11\uffff\3\36\7\uffff\1\44\15"+
            "\uffff\1\2\1\uffff\1\2\1\46\1\45\2\41\1\43\1\37\10\40",
            "",
            "\1\2\1\6\1\7\3\uffff\1\2\6\uffff\2\2\7\uffff\14\2",
            "\1\50",
            "\1\2\1\6\4\uffff\1\2\6\uffff\2\2\7\uffff\14\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\51",
            "\1\52",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\53",
            "\1\54",
            "\1\uffff",
            "\1\32\60\uffff\1\33",
            "\1\56\37\uffff\3\55",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\60\60\uffff\1\57",
            "\1\60\1\61",
            "\1\62",
            "\1\uffff",
            "\1\63",
            "\1\64\60\uffff\1\65",
            "\1\60\1\61",
            "\1\66",
            "\1\60",
            "\1\64\60\uffff\1\65"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "116:1: castedExpression returns [Expression e] : ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_48 = input.LA(1);

                         
                        int index26_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_48);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_39 = input.LA(1);

                         
                        int index26_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_39);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_35 = input.LA(1);

                         
                        int index26_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_36 = input.LA(1);

                         
                        int index26_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_36);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_6==47) && (synpred1())) {s = 9;}

                        else if ( (LA26_6==StringLiteral) && (synpred1())) {s = 10;}

                        else if ( (LA26_6==Identifier) && (synpred1())) {s = 11;}

                        else if ( ((LA26_6>=38 && LA26_6<=40)) && (synpred1())) {s = 12;}

                        else if ( (LA26_6==70) && (synpred1())) {s = 13;}

                        else if ( ((LA26_6>=71 && LA26_6<=78)) && (synpred1())) {s = 14;}

                        else if ( ((LA26_6>=67 && LA26_6<=68)) && (synpred1())) {s = 15;}

                        else if ( (LA26_6==IntLiteral) && (synpred1())) {s = 16;}

                        else if ( (LA26_6==69) && (synpred1())) {s = 17;}

                        else if ( (LA26_6==48) && (synpred1())) {s = 18;}

                        else if ( (LA26_6==66) && (synpred1())) {s = 19;}

                        else if ( (LA26_6==65) && (synpred1())) {s = 20;}

                        else if ( (LA26_6==28) && (synpred1())) {s = 21;}

                        else if ( (LA26_6==64) && (synpred1())) {s = 22;}

                        else if ( (LA26_6==62) ) {s = 23;}

                        else if ( (LA26_6==23) && (synpred1())) {s = 24;}

                        else if ( (LA26_6==EOF||LA26_6==19||(LA26_6>=24 && LA26_6<=26)||(LA26_6>=29 && LA26_6<=31)||LA26_6==36||(LA26_6>=43 && LA26_6<=44)||(LA26_6>=51 && LA26_6<=61)||LA26_6==63) ) {s = 2;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
						int LA26_34 = input.LA(1);

                         
                        int index26_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_34);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_28 = input.LA(1);

                         
                        int index26_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_28);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_29 = input.LA(1);

                         
                        int index26_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_29);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_44 = input.LA(1);

                         
                        int index26_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_44);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_43 = input.LA(1);

                         
                        int index26_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_43);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_42 = input.LA(1);

                         
                        int index26_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_42);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_30 = input.LA(1);

                         
                        int index26_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_33 = input.LA(1);

                         
                        int index26_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_33);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_nsImport_in_file51 = new BitSet(new long[]{0x000001E608540040L});
    public static final BitSet FOLLOW_extImport_in_file61 = new BitSet(new long[]{0x000001E608500040L});
    public static final BitSet FOLLOW_extension_in_file71 = new BitSet(new long[]{0x000001E608400040L});
    public static final BitSet FOLLOW_around_in_file81 = new BitSet(new long[]{0x000001E608400040L});
    public static final BitSet FOLLOW_check_in_file91 = new BitSet(new long[]{0x000001E608400040L});
    public static final BitSet FOLLOW_EOF_in_file99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_nsImport117 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_nsImport121 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_nsImport125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_extImport140 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_extImport144 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_extImport149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_extImport153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_check168 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_check172 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_check175 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_check179 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_check186 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_25_in_check188 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_check193 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_check195 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_check200 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_check202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_around223 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_pointcut_in_around227 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_around229 = new BitSet(new long[]{0x000001C0C0000040L});
    public static final BitSet FOLLOW_declaredParameterList_in_around234 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29_in_around237 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_around242 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_around250 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_around254 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_around256 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_around265 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_around267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_pointcut295 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_identifier_in_pointcut304 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_30_in_pointcut315 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_identifier_in_pointcut326 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_32_in_pointcut337 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_33_in_extension365 = new BitSet(new long[]{0x000001C400000040L});
    public static final BitSet FOLLOW_34_in_extension372 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_extension379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_extension385 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_extension387 = new BitSet(new long[]{0x000001C080000040L});
    public static final BitSet FOLLOW_declaredParameterList_in_extension392 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_extension396 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_extension398 = new BitSet(new long[]{0x400183C810800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_35_in_extension405 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_javaType_in_extension409 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_extension411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_extension415 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_extension417 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_javaType_in_extension421 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_29_in_extension425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_javaType_in_extension429 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_31_in_extension437 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_extension439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_extension449 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_extension451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_extension465 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_extension471 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_extension475 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_extension480 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_extension486 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_extension488 = new BitSet(new long[]{0x000001C080000040L});
    public static final BitSet FOLLOW_declaredParameterList_in_extension493 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_extension497 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_extension499 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_extension505 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_extension507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_javaType529 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_javaType538 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_identifier_in_javaType544 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_38_in_javaType550 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_39_in_javaType559 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_40_in_javaType565 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_letExpression_in_expression587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_letExpression606 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_letExpression610 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_letExpression612 = new BitSet(new long[]{0x400181C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_castedExpression_in_letExpression616 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_letExpression618 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_letExpression622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_castedExpression666 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_castedExpression670 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_castedExpression672 = new BitSet(new long[]{0x400181C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression705 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_chainExpression711 = new BitSet(new long[]{0x400181C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression715 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression736 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ifExpression740 = new BitSet(new long[]{0x400181C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression744 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ifExpression746 = new BitSet(new long[]{0x400181C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ifExpression758 = new BitSet(new long[]{0x400181C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression762 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ifExpression764 = new BitSet(new long[]{0x400181C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression768 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ifExpression771 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_ifExpression775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_switchExpression802 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_switchExpression805 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_orExpression_in_switchExpression811 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_switchExpression813 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_switchExpression820 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_switchExpression833 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_orExpression_in_switchExpression837 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_switchExpression840 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_orExpression_in_switchExpression845 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50_in_switchExpression863 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_switchExpression865 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_orExpression_in_switchExpression871 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_switchExpression876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression908 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_orExpression915 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_andExpression_in_orExpression919 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression942 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_andExpression949 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression953 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression975 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_impliesExpression982 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression986 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1010 = new BitSet(new long[]{0x1F80000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1018 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1044 = new BitSet(new long[]{0x1F80000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1065 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1075 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1084 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1103 = new BitSet(new long[]{0x8000000040000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1111 = new BitSet(new long[]{0x400101C010000070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1121 = new BitSet(new long[]{0x8000000040000002L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_unaryExpression1150 = new BitSet(new long[]{0x000101C010000070L,0x0000000000007FFEL});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_unaryExpression1162 = new BitSet(new long[]{0x000101C010000070L,0x0000000000007FFEL});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_infixExpression1184 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_infixExpression1190 = new BitSet(new long[]{0x000001C000000040L,0x0000000000007FC0L});
    public static final BitSet FOLLOW_featureCall_in_infixExpression1194 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_primaryExpression1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_featureCall_in_primaryExpression1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_primaryExpression1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_primaryExpression1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLiteral_in_primaryExpression1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorCall_in_primaryExpression1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVarExpression_in_primaryExpression1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paranthesizedExpression_in_primaryExpression1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_paranthesizedExpression1320 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_paranthesizedExpression1324 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_paranthesizedExpression1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_globalVarExpression1346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_globalVarExpression1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_featureCall1368 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_featureCall1370 = new BitSet(new long[]{0x400183C090800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_parameterList_in_featureCall1375 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_featureCall1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_featureCall1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionExpression_in_featureCall1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_listLiteral1417 = new BitSet(new long[]{0x400983C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_parameterList_in_listLiteral1422 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_listLiteral1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_constructorCall1443 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_simpleType_in_constructorCall1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_nullLiteral1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1510 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_numberLiteral1514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_collectionExpression1538 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_collectionExpression1542 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_collectionExpression1546 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_collectionExpression1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionExpression1561 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_collectionExpression1611 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_identifier_in_collectionExpression1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_collectionExpression1618 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_collectionExpression1624 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_collectionExpression1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList1650 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_declaredParameterList1654 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList1658 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_type_in_declaredParameter1678 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_declaredParameter1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameterList1704 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_parameterList1709 = new BitSet(new long[]{0x400183C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expression_in_parameterList1713 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_collectionType_in_type1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType1771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_collectionType1792 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_simpleType_in_collectionType1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_collectionType1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleType1820 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_simpleType1828 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_simpleType1832 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred1655 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_type_in_synpred1657 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred1659 = new BitSet(new long[]{0x400181C010800070L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_castedExpression_in_synpred1661 = new BitSet(new long[]{0x0000000000000002L});

}