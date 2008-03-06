// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g 2008-03-06 09:17:20
 	
package org.eclipse.xpand3.parser; 

import org.eclipse.tmf.common.node.*;
import org.eclipse.xpand3.internal.parser.xpand3node.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Xpand3NodeParser extends AbstractNodeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LG", "RG", "DEFINE", "ENDDEFINE", "AROUND", "ENDAROUND", "TEXT", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "REM_COMMENT_OUT", "REM_COMMENT", "'IMPORT'", "'EXTENSION'", "'import'", "';'", "'extension'", "'reexport'", "'('", "','", "'*'", "')'", "'FOR'", "'-'", "'ERROR'", "'EXPAND'", "'FOREACH'", "'SEPARATOR'", "'FILE'", "'ENDFILE'", "'AS'", "'ITERATOR'", "'ENDFOREACH'", "'IF'", "'ENDIF'", "'ELSEIF'", "'ELSE'", "'LET'", "'ENDLET'", "'PROTECT'", "'CSTART'", "'CEND'", "'ID'", "'DISABLE'", "'ENDPROTECT'", "'context'", "'if'", "'WARNING'", "':'", "'around'", "'::'", "'private'", "'cached'", "'create'", "'JAVA'", "'.'", "'Collection'", "'List'", "'Set'", "'let'", "'='", "'->'", "'?'", "'then'", "'else'", "'switch'", "'{'", "'default'", "'}'", "'case'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'/'", "'!'", "'GLOBALVAR'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'", "'['", "']'"
    };
    public static final int IntLiteral=12;
    public static final int Identifier=13;
    public static final int HexDigit=17;
    public static final int WS=20;
    public static final int ENDDEFINE=7;
    public static final int REM_COMMENT=24;
    public static final int RG=5;
    public static final int COMMENT=21;
    public static final int StringLiteral=11;
    public static final int LINE_COMMENT=22;
    public static final int JavaIDDigit=19;
    public static final int Letter=18;
    public static final int DEFINE=6;
    public static final int UnicodeEscape=15;
    public static final int EscapeSequence=14;
    public static final int EOF=-1;
    public static final int TEXT=10;
    public static final int ENDAROUND=9;
    public static final int OctalEscape=16;
    public static final int REM_COMMENT_OUT=23;
    public static final int AROUND=8;
    public static final int LG=4;

        public Xpand3NodeParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[60+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g"; }


    	protected Xpand3nodeFactory factory = Xpand3nodeFactory.eINSTANCE;



    // $ANTLR start file
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:29:1: file returns [CompositeNode cn] : ( ( (imp= nsImport ) ) )* ( ( (decl= abstractDeclaration ) ) )* ( EOF ) ;
    public CompositeNode file() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode imp = null;

        CompositeNode decl = null;


         cn = factory.createFileNode(); cn.setRule("file"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:2: ( ( ( (imp= nsImport ) ) )* ( ( (decl= abstractDeclaration ) ) )* ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:2: ( ( (imp= nsImport ) ) )* ( ( (decl= abstractDeclaration ) ) )* ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:2: ( ( (imp= nsImport ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LG) ) {
                    int LA1_2 = input.LA(2);

                    if ( ((LA1_2>=25 && LA1_2<=26)) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==27||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:3: ( (imp= nsImport ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:3: ( (imp= nsImport ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:4: (imp= nsImport )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:4: (imp= nsImport )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:5: imp= nsImport
            	    {
            	    pushFollow(FOLLOW_nsImport_in_file80);
            	    imp=nsImport();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, imp); ((FileNode) cn).getImp().add(imp); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:85: ( ( (decl= abstractDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==58||LA2_0==62||(LA2_0>=64 && LA2_0<=66)||(LA2_0>=69 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:86: ( (decl= abstractDeclaration ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:86: ( (decl= abstractDeclaration ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:87: (decl= abstractDeclaration )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:87: (decl= abstractDeclaration )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:88: decl= abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_abstractDeclaration_in_file93);
            	    decl=abstractDeclaration();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, decl); ((FileNode) cn).getDecl().add(decl); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:183: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:184: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_file102); if (failed) return cn;

            }


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end file


    // $ANTLR start nsImport
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:34:1: nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) );
    public CompositeNode nsImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode ns = null;

        CompositeNode unnamed0 = null;

        CompositeNode unnamed1 = null;


         cn = factory.createNsImportNode(); cn.setRule("nsImport"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:2: ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case LG:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else if ( (LA4_1==25) ) {
                    alt4=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("34:1: nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("34:1: nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:2: ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:2: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:3: LG
                    {
                    match(input,LG,FOLLOW_LG_in_nsImport123); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:43: ( 'IMPORT' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:44: 'IMPORT'
                    {
                    match(input,25,FOLLOW_25_in_nsImport129); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:90: (ns= simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:91: ns= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nsImport137);
                    ns=simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:164: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:165: RG
                    {
                    match(input,RG,FOLLOW_RG_in_nsImport143); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:4: ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_nsImport152); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:45: ( 'EXTENSION' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:46: 'EXTENSION'
                    {
                    match(input,26,FOLLOW_26_in_nsImport158); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:95: (ns= simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:96: ns= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nsImport166);
                    ns=simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:169: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:170: RG
                    {
                    match(input,RG,FOLLOW_RG_in_nsImport172); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:4: ( 'import' ) (unnamed0= type ) ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:4: ( 'import' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:5: 'import'
                    {
                    match(input,27,FOLLOW_27_in_nsImport181); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:51: (unnamed0= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:52: unnamed0= type
                    {
                    pushFollow(FOLLOW_type_in_nsImport189);
                    unnamed0=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed0); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:100: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:101: ';'
                    {
                    match(input,28,FOLLOW_28_in_nsImport195); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:4: ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:4: ( 'extension' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:5: 'extension'
                    {
                    match(input,29,FOLLOW_29_in_nsImport204); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:54: (unnamed1= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:55: unnamed1= type
                    {
                    pushFollow(FOLLOW_type_in_nsImport212);
                    unnamed1=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed1); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:103: ( ( ( 'reexport' ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:104: ( ( 'reexport' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:104: ( ( 'reexport' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:105: ( 'reexport' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:105: ( 'reexport' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:106: 'reexport'
                            {
                            match(input,30,FOLLOW_30_in_nsImport220); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:157: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:158: ';'
                    {
                    match(input,28,FOLLOW_28_in_nsImport229); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

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
        return cn;
    }
    // $ANTLR end nsImport


    // $ANTLR start abstractDeclaration
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:1: abstractDeclaration returns [CompositeNode cn] : ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) );
    public CompositeNode abstractDeclaration() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode check1 = null;

        CompositeNode around2 = null;

        CompositeNode extension3 = null;

        CompositeNode definition4 = null;

        CompositeNode definitionAround5 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:2: ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt5=1;
                }
                break;
            case 62:
                {
                alt5=2;
                }
                break;
            case Identifier:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
                {
                alt5=3;
                }
                break;
            case LG:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==AROUND) ) {
                    alt5=5;
                }
                else if ( (LA5_4==DEFINE) ) {
                    alt5=4;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("41:1: abstractDeclaration returns [CompositeNode cn] : ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("41:1: abstractDeclaration returns [CompositeNode cn] : ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:2: ( check )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:2: ( check )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:3: check
                    {
                    pushFollow(FOLLOW_check_in_abstractDeclaration247);
                    check1=check();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = check1; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:4: ( around )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:4: ( around )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:5: around
                    {
                    pushFollow(FOLLOW_around_in_abstractDeclaration256);
                    around2=around();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = around2; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:4: ( extension )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:4: ( extension )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:5: extension
                    {
                    pushFollow(FOLLOW_extension_in_abstractDeclaration265);
                    extension3=extension();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = extension3; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( definition )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( definition )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:5: definition
                    {
                    pushFollow(FOLLOW_definition_in_abstractDeclaration274);
                    definition4=definition();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = definition4; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:4: ( definitionAround )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:4: ( definitionAround )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:5: definitionAround
                    {
                    pushFollow(FOLLOW_definitionAround_in_abstractDeclaration283);
                    definitionAround5=definitionAround();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = definitionAround5; 
                    }

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
        return cn;
    }
    // $ANTLR end abstractDeclaration


    // $ANTLR start definition
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:1: definition returns [CompositeNode cn] : ( LG ) ( DEFINE ) (name= identifier ) ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= type ) (unnamed4= sequence ) ( ENDDEFINE ) ( RG ) ;
    public CompositeNode definition() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode name = null;

        CompositeNode unnamed2 = null;

        CompositeNode unnamed3 = null;

        CompositeNode unnamed4 = null;


         cn = factory.createDefinitionNode(); cn.setRule("definition"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:2: ( ( LG ) ( DEFINE ) (name= identifier ) ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= type ) (unnamed4= sequence ) ( ENDDEFINE ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:2: ( LG ) ( DEFINE ) (name= identifier ) ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= type ) (unnamed4= sequence ) ( ENDDEFINE ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:3: LG
            {
            match(input,LG,FOLLOW_LG_in_definition306); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:43: ( DEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:44: DEFINE
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_definition312); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:88: (name= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:89: name= identifier
            {
            pushFollow(FOLLOW_identifier_in_definition320);
            name=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((DefinitionNode) cn).setName(name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:172: ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:173: ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:173: ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:174: ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:174: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:175: '('
                    {
                    match(input,31,FOLLOW_31_in_definition328); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:216: ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Identifier||LA9_0==33||(LA9_0>=69 && LA9_0<=71)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:217: ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:217: ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==Identifier||(LA8_0>=69 && LA8_0<=71)) ) {
                                alt8=1;
                            }
                            else if ( (LA8_0==33) ) {
                                alt8=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return cn;}
                                NoViableAltException nvae =
                                    new NoViableAltException("50:217: ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:218: (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:218: (unnamed2= declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:219: unnamed2= declaredParameterList
                                    {
                                    pushFollow(FOLLOW_declaredParameterList_in_definition338);
                                    unnamed2=declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed2); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:284: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt7=2;
                                    int LA7_0 = input.LA(1);

                                    if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                                        alt7=1;
                                    }
                                    switch (alt7) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:285: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:285: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:286: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:286: ( ',' )?
                                            int alt6=2;
                                            int LA6_0 = input.LA(1);

                                            if ( (LA6_0==32) ) {
                                                alt6=1;
                                            }
                                            switch (alt6) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:287: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_definition346); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:329: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:330: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_definition353); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }


                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_definition365); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_definition374); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_definition383); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:138: (unnamed3= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:139: unnamed3= type
            {
            pushFollow(FOLLOW_type_in_definition391);
            unnamed3=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed3); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:187: (unnamed4= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:188: unnamed4= sequence
            {
            pushFollow(FOLLOW_sequence_in_definition399);
            unnamed4=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed4); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:240: ( ENDDEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:241: ENDDEFINE
            {
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_definition405); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:288: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:289: RG
            {
            match(input,RG,FOLLOW_RG_in_definition411); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end definition


    // $ANTLR start definitionAround
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:1: definitionAround returns [CompositeNode cn] : ( LG ) ( AROUND ) (unnamed5= pointcut ) ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= type ) (unnamed8= sequence ) ( ENDAROUND ) ( RG ) ;
    public CompositeNode definitionAround() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed5 = null;

        CompositeNode unnamed6 = null;

        CompositeNode unnamed7 = null;

        CompositeNode unnamed8 = null;


         cn = factory.createDefinitionAroundNode(); cn.setRule("definitionAround"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:2: ( ( LG ) ( AROUND ) (unnamed5= pointcut ) ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= type ) (unnamed8= sequence ) ( ENDAROUND ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:2: ( LG ) ( AROUND ) (unnamed5= pointcut ) ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= type ) (unnamed8= sequence ) ( ENDAROUND ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:3: LG
            {
            match(input,LG,FOLLOW_LG_in_definitionAround434); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:43: ( AROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:44: AROUND
            {
            match(input,AROUND,FOLLOW_AROUND_in_definitionAround440); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:88: (unnamed5= pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:89: unnamed5= pointcut
            {
            pushFollow(FOLLOW_pointcut_in_definitionAround448);
            unnamed5=pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed5); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:141: ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:142: ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:142: ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:143: ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:143: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:144: '('
                    {
                    match(input,31,FOLLOW_31_in_definitionAround456); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:185: ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Identifier||LA14_0==33||(LA14_0>=69 && LA14_0<=71)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:186: ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:186: ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==Identifier||(LA13_0>=69 && LA13_0<=71)) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==33) ) {
                                alt13=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return cn;}
                                NoViableAltException nvae =
                                    new NoViableAltException("55:186: ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 13, 0, input);

                                throw nvae;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:187: (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:187: (unnamed6= declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:188: unnamed6= declaredParameterList
                                    {
                                    pushFollow(FOLLOW_declaredParameterList_in_definitionAround466);
                                    unnamed6=declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed6); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:253: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( ((LA12_0>=32 && LA12_0<=33)) ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:254: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:254: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:255: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:255: ( ',' )?
                                            int alt11=2;
                                            int LA11_0 = input.LA(1);

                                            if ( (LA11_0==32) ) {
                                                alt11=1;
                                            }
                                            switch (alt11) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:256: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_definitionAround474); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:298: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:299: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_definitionAround481); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }


                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_definitionAround493); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_definitionAround502); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_definitionAround511); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:138: (unnamed7= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:139: unnamed7= type
            {
            pushFollow(FOLLOW_type_in_definitionAround519);
            unnamed7=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed7); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:187: (unnamed8= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:188: unnamed8= sequence
            {
            pushFollow(FOLLOW_sequence_in_definitionAround527);
            unnamed8=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed8); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:240: ( ENDAROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:241: ENDAROUND
            {
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_definitionAround533); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:288: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:289: RG
            {
            match(input,RG,FOLLOW_RG_in_definitionAround539); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end definitionAround


    // $ANTLR start sequence
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:1: sequence returns [CompositeNode cn] : (unnamed9= textSequence ) ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )* ;
    public CompositeNode sequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed9 = null;

        CompositeNode unnamed10 = null;

        CompositeNode unnamed11 = null;


         cn = factory.createSequenceNode(); cn.setRule("sequence"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:2: ( (unnamed9= textSequence ) ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:2: (unnamed9= textSequence ) ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:2: (unnamed9= textSequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:3: unnamed9= textSequence
            {
            pushFollow(FOLLOW_textSequence_in_sequence564);
            unnamed9=textSequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed9); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:59: ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=StringLiteral && LA16_0<=Identifier)||LA16_0==31||(LA16_0>=36 && LA16_0<=39)||LA16_0==41||LA16_0==46||LA16_0==50||LA16_0==52||LA16_0==59||(LA16_0>=69 && LA16_0<=72)||(LA16_0>=78 && LA16_0<=79)||(LA16_0>=94 && LA16_0<=108)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:60: ( (unnamed10= statement ) (unnamed11= textSequence ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:60: ( (unnamed10= statement ) (unnamed11= textSequence ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:61: (unnamed10= statement ) (unnamed11= textSequence )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:61: (unnamed10= statement )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:62: unnamed10= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_sequence574);
            	    unnamed10=statement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed10); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:117: (unnamed11= textSequence )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:118: unnamed11= textSequence
            	    {
            	    pushFollow(FOLLOW_textSequence_in_sequence582);
            	    unnamed11=textSequence();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed11); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
        return cn;
    }
    // $ANTLR end sequence


    // $ANTLR start statement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:62:1: statement returns [CompositeNode cn] : ( ( simpleStatement ) | ( fileStatement ) | ( foreachStatement ) | ( ifStatement ) | ( letStatement ) | ( protectStatement ) );
    public CompositeNode statement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode simpleStatement6 = null;

        CompositeNode fileStatement7 = null;

        CompositeNode foreachStatement8 = null;

        CompositeNode ifStatement9 = null;

        CompositeNode letStatement10 = null;

        CompositeNode protectStatement11 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:2: ( ( simpleStatement ) | ( fileStatement ) | ( foreachStatement ) | ( ifStatement ) | ( letStatement ) | ( protectStatement ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 31:
            case 36:
            case 37:
            case 38:
            case 59:
            case 69:
            case 70:
            case 71:
            case 72:
            case 78:
            case 79:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt17=1;
                }
                break;
            case 41:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 46:
                {
                alt17=4;
                }
                break;
            case 50:
                {
                alt17=5;
                }
                break;
            case 52:
                {
                alt17=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("62:1: statement returns [CompositeNode cn] : ( ( simpleStatement ) | ( fileStatement ) | ( foreachStatement ) | ( ifStatement ) | ( letStatement ) | ( protectStatement ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:2: ( simpleStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:2: ( simpleStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:3: simpleStatement
                    {
                    pushFollow(FOLLOW_simpleStatement_in_statement603);
                    simpleStatement6=simpleStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = simpleStatement6; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:4: ( fileStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:4: ( fileStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:5: fileStatement
                    {
                    pushFollow(FOLLOW_fileStatement_in_statement612);
                    fileStatement7=fileStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = fileStatement7; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:4: ( foreachStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:4: ( foreachStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:5: foreachStatement
                    {
                    pushFollow(FOLLOW_foreachStatement_in_statement621);
                    foreachStatement8=foreachStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = foreachStatement8; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:4: ( ifStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:4: ( ifStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement630);
                    ifStatement9=ifStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = ifStatement9; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:4: ( letStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:4: ( letStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:5: letStatement
                    {
                    pushFollow(FOLLOW_letStatement_in_statement639);
                    letStatement10=letStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = letStatement10; 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:4: ( protectStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:4: ( protectStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:5: protectStatement
                    {
                    pushFollow(FOLLOW_protectStatement_in_statement648);
                    protectStatement11=protectStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = protectStatement11; 
                    }

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
        return cn;
    }
    // $ANTLR end statement


    // $ANTLR start textSequence
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:1: textSequence returns [CompositeNode cn] : (unnamed12= text ) ( ( (unnamed13= text ) ) )* ;
    public CompositeNode textSequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed12 = null;

        CompositeNode unnamed13 = null;


         cn = factory.createTextSequenceNode(); cn.setRule("textSequence"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:2: ( (unnamed12= text ) ( ( (unnamed13= text ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:2: (unnamed12= text ) ( ( (unnamed13= text ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:2: (unnamed12= text )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:3: unnamed12= text
            {
            pushFollow(FOLLOW_text_in_textSequence678);
            unnamed12=text();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed12); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:53: ( ( (unnamed13= text ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==TEXT) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==TEXT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:54: ( (unnamed13= text ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:54: ( (unnamed13= text ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:55: (unnamed13= text )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:55: (unnamed13= text )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:56: unnamed13= text
            	    {
            	    pushFollow(FOLLOW_text_in_textSequence688);
            	    unnamed13=text();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed13); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end textSequence


    // $ANTLR start text
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:1: text returns [CompositeNode cn] : ( '-' )? ( TEXT ) ;
    public CompositeNode text() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createTextNode(); cn.setRule("text"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:2: ( ( '-' )? ( TEXT ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:2: ( '-' )? ( TEXT )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:3: '-'
                    {
                    match(input,36,FOLLOW_36_in_text714); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:45: ( TEXT )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:46: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_text721); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end text


    // $ANTLR start simpleStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:1: simpleStatement returns [CompositeNode cn] : ( ( errorStatement ) | ( expandStatement ) | ( expressionStmt ) );
    public CompositeNode simpleStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode errorStatement12 = null;

        CompositeNode expandStatement13 = null;

        CompositeNode expressionStmt14 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:2: ( ( errorStatement ) | ( expandStatement ) | ( expressionStmt ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 31:
            case 36:
            case 59:
            case 69:
            case 70:
            case 71:
            case 72:
            case 78:
            case 79:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt20=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("79:1: simpleStatement returns [CompositeNode cn] : ( ( errorStatement ) | ( expandStatement ) | ( expressionStmt ) );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:2: ( errorStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:2: ( errorStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:3: errorStatement
                    {
                    pushFollow(FOLLOW_errorStatement_in_simpleStatement739);
                    errorStatement12=errorStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = errorStatement12; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:81:4: ( expandStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:81:4: ( expandStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:81:5: expandStatement
                    {
                    pushFollow(FOLLOW_expandStatement_in_simpleStatement748);
                    expandStatement13=expandStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = expandStatement13; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:82:4: ( expressionStmt )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:82:4: ( expressionStmt )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:82:5: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_simpleStatement757);
                    expressionStmt14=expressionStmt();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = expressionStmt14; 
                    }

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
        return cn;
    }
    // $ANTLR end simpleStatement


    // $ANTLR start errorStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:1: errorStatement returns [CompositeNode cn] : ( 'ERROR' ) (unnamed14= expression ) ;
    public CompositeNode errorStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed14 = null;


         cn = factory.createErrorStatementNode(); cn.setRule("errorStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:2: ( ( 'ERROR' ) (unnamed14= expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:2: ( 'ERROR' ) (unnamed14= expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:2: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:3: 'ERROR'
            {
            match(input,37,FOLLOW_37_in_errorStatement780); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:48: (unnamed14= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:49: unnamed14= expression
            {
            pushFollow(FOLLOW_expression_in_errorStatement788);
            unnamed14=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed14); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end errorStatement


    // $ANTLR start expandStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:1: expandStatement returns [CompositeNode cn] : ( 'EXPAND' ) (unnamed15= simpleType ) ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )? ;
    public CompositeNode expandStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed15 = null;

        CompositeNode unnamed16 = null;

        CompositeNode unnamed17 = null;

        CompositeNode unnamed18 = null;

        CompositeNode unnamed19 = null;


         cn = factory.createExpandStatementNode(); cn.setRule("expandStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:2: ( ( 'EXPAND' ) (unnamed15= simpleType ) ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:2: ( 'EXPAND' ) (unnamed15= simpleType ) ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:2: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:3: 'EXPAND'
            {
            match(input,38,FOLLOW_38_in_expandStatement811); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:49: (unnamed15= simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:50: unnamed15= simpleType
            {
            pushFollow(FOLLOW_simpleType_in_expandStatement819);
            unnamed15=simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed15); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:106: ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:107: ( ( '(' ) (unnamed16= parameterList ) ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:107: ( ( '(' ) (unnamed16= parameterList ) ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:108: ( '(' ) (unnamed16= parameterList ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:108: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:109: '('
                    {
                    match(input,31,FOLLOW_31_in_expandStatement827); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:150: (unnamed16= parameterList )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:151: unnamed16= parameterList
                    {
                    pushFollow(FOLLOW_parameterList_in_expandStatement835);
                    unnamed16=parameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed16); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:210: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:211: ')'
                    {
                    match(input,34,FOLLOW_34_in_expandStatement841); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:255: ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35||LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:256: ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:256: ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==35) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==39) ) {
                        alt23=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("90:256: ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:257: ( ( ( 'FOR' ) (unnamed17= expression ) ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:257: ( ( ( 'FOR' ) (unnamed17= expression ) ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:258: ( ( 'FOR' ) (unnamed17= expression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:258: ( ( 'FOR' ) (unnamed17= expression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:259: ( 'FOR' ) (unnamed17= expression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:259: ( 'FOR' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:260: 'FOR'
                            {
                            match(input,35,FOLLOW_35_in_expandStatement854); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:303: (unnamed17= expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:304: unnamed17= expression
                            {
                            pushFollow(FOLLOW_expression_in_expandStatement862);
                            unnamed17=expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed17); 
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:4: ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:4: ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:5: ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:5: ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:6: ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:6: ( 'FOREACH' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:7: 'FOREACH'
                            {
                            match(input,39,FOLLOW_39_in_expandStatement875); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:54: (unnamed18= expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:55: unnamed18= expression
                            {
                            pushFollow(FOLLOW_expression_in_expandStatement883);
                            unnamed18=expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed18); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:111: ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==40) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:112: ( ( 'SEPARATOR' ) (unnamed19= expression ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:112: ( ( 'SEPARATOR' ) (unnamed19= expression ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:113: ( 'SEPARATOR' ) (unnamed19= expression )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:113: ( 'SEPARATOR' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:114: 'SEPARATOR'
                                    {
                                    match(input,40,FOLLOW_40_in_expandStatement891); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:163: (unnamed19= expression )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:164: unnamed19= expression
                                    {
                                    pushFollow(FOLLOW_expression_in_expandStatement899);
                                    unnamed19=expression();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed19); 
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;

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
        return cn;
    }
    // $ANTLR end expandStatement


    // $ANTLR start expressionStmt
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:93:1: expressionStmt returns [CompositeNode cn] : (unnamed20= expression ) ;
    public CompositeNode expressionStmt() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed20 = null;


         cn = factory.createExpressionStmtNode(); cn.setRule("expressionStmt"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:2: ( (unnamed20= expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:2: (unnamed20= expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:2: (unnamed20= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:3: unnamed20= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt932);
            unnamed20=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed20); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end expressionStmt


    // $ANTLR start fileStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:97:1: fileStatement returns [CompositeNode cn] : ( 'FILE' ) (unnamed21= expression ) ( ( (unnamed22= identifier ) ) )? (unnamed23= sequence ) ( 'ENDFILE' ) ;
    public CompositeNode fileStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed21 = null;

        CompositeNode unnamed22 = null;

        CompositeNode unnamed23 = null;


         cn = factory.createFileStatementNode(); cn.setRule("fileStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( ( 'FILE' ) (unnamed21= expression ) ( ( (unnamed22= identifier ) ) )? (unnamed23= sequence ) ( 'ENDFILE' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( 'FILE' ) (unnamed21= expression ) ( ( (unnamed22= identifier ) ) )? (unnamed23= sequence ) ( 'ENDFILE' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:3: 'FILE'
            {
            match(input,41,FOLLOW_41_in_fileStatement955); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:47: (unnamed21= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:48: unnamed21= expression
            {
            pushFollow(FOLLOW_expression_in_fileStatement963);
            unnamed21=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed21); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:104: ( ( (unnamed22= identifier ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Identifier) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:105: ( (unnamed22= identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:105: ( (unnamed22= identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:106: (unnamed22= identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:106: (unnamed22= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:107: unnamed22= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_fileStatement973);
                    unnamed22=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed22); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:166: (unnamed23= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:167: unnamed23= sequence
            {
            pushFollow(FOLLOW_sequence_in_fileStatement984);
            unnamed23=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed23); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:221: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:222: 'ENDFILE'
            {
            match(input,42,FOLLOW_42_in_fileStatement990); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end fileStatement


    // $ANTLR start foreachStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:1: foreachStatement returns [CompositeNode cn] : ( 'FOREACH' ) (unnamed24= expression ) ( 'AS' ) (unnamed25= identifier ) ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )? (unnamed28= sequence ) ( 'ENDFOREACH' ) ;
    public CompositeNode foreachStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed24 = null;

        CompositeNode unnamed25 = null;

        CompositeNode unnamed26 = null;

        CompositeNode unnamed27 = null;

        CompositeNode unnamed28 = null;


         cn = factory.createForeachStatementNode(); cn.setRule("foreachStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:2: ( ( 'FOREACH' ) (unnamed24= expression ) ( 'AS' ) (unnamed25= identifier ) ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )? (unnamed28= sequence ) ( 'ENDFOREACH' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:2: ( 'FOREACH' ) (unnamed24= expression ) ( 'AS' ) (unnamed25= identifier ) ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )? (unnamed28= sequence ) ( 'ENDFOREACH' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:2: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:3: 'FOREACH'
            {
            match(input,39,FOLLOW_39_in_foreachStatement1013); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:50: (unnamed24= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:51: unnamed24= expression
            {
            pushFollow(FOLLOW_expression_in_foreachStatement1021);
            unnamed24=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed24); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:107: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:108: 'AS'
            {
            match(input,43,FOLLOW_43_in_foreachStatement1027); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:150: (unnamed25= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:151: unnamed25= identifier
            {
            pushFollow(FOLLOW_identifier_in_foreachStatement1035);
            unnamed25=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed25); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:207: ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:208: ( ( 'ITERATOR' ) (unnamed26= identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:208: ( ( 'ITERATOR' ) (unnamed26= identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:209: ( 'ITERATOR' ) (unnamed26= identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:209: ( 'ITERATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:210: 'ITERATOR'
                    {
                    match(input,44,FOLLOW_44_in_foreachStatement1043); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:258: (unnamed26= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:259: unnamed26= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_foreachStatement1051);
                    unnamed26=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed26); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:318: ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:319: ( ( 'SEPARATOR' ) (unnamed27= expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:319: ( ( 'SEPARATOR' ) (unnamed27= expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:320: ( 'SEPARATOR' ) (unnamed27= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:320: ( 'SEPARATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:321: 'SEPARATOR'
                    {
                    match(input,40,FOLLOW_40_in_foreachStatement1062); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:370: (unnamed27= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:371: unnamed27= expression
                    {
                    pushFollow(FOLLOW_expression_in_foreachStatement1070);
                    unnamed27=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed27); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:430: (unnamed28= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:431: unnamed28= sequence
            {
            pushFollow(FOLLOW_sequence_in_foreachStatement1081);
            unnamed28=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed28); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:485: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:103:486: 'ENDFOREACH'
            {
            match(input,45,FOLLOW_45_in_foreachStatement1087); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end foreachStatement


    // $ANTLR start ifStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:1: ifStatement returns [CompositeNode cn] : ( 'IF' ) (unnamed29= expression ) (unnamed30= sequence ) (unnamed31= elseIfStatement )* (unnamed32= elseStatement )? ( 'ENDIF' ) ;
    public CompositeNode ifStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed29 = null;

        CompositeNode unnamed30 = null;

        CompositeNode unnamed31 = null;

        CompositeNode unnamed32 = null;


         cn = factory.createIfStatementNode(); cn.setRule("ifStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:2: ( ( 'IF' ) (unnamed29= expression ) (unnamed30= sequence ) (unnamed31= elseIfStatement )* (unnamed32= elseStatement )? ( 'ENDIF' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:2: ( 'IF' ) (unnamed29= expression ) (unnamed30= sequence ) (unnamed31= elseIfStatement )* (unnamed32= elseStatement )? ( 'ENDIF' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:2: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:3: 'IF'
            {
            match(input,46,FOLLOW_46_in_ifStatement1110); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:45: (unnamed29= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:46: unnamed29= expression
            {
            pushFollow(FOLLOW_expression_in_ifStatement1118);
            unnamed29=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed29); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:102: (unnamed30= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:103: unnamed30= sequence
            {
            pushFollow(FOLLOW_sequence_in_ifStatement1126);
            unnamed30=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed30); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:157: (unnamed31= elseIfStatement )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:158: unnamed31= elseIfStatement
            	    {
            	    pushFollow(FOLLOW_elseIfStatement_in_ifStatement1134);
            	    unnamed31=elseIfStatement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed31); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:220: (unnamed32= elseStatement )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:221: unnamed32= elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifStatement1143);
                    unnamed32=elseStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed32); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:281: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:282: 'ENDIF'
            {
            match(input,47,FOLLOW_47_in_ifStatement1150); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end ifStatement


    // $ANTLR start elseIfStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:109:1: elseIfStatement returns [CompositeNode cn] : ( 'ELSEIF' ) (unnamed33= expression ) (unnamed34= sequence ) ;
    public CompositeNode elseIfStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed33 = null;

        CompositeNode unnamed34 = null;


         cn = factory.createElseIfStatementNode(); cn.setRule("elseIfStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:2: ( ( 'ELSEIF' ) (unnamed33= expression ) (unnamed34= sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:2: ( 'ELSEIF' ) (unnamed33= expression ) (unnamed34= sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:2: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:3: 'ELSEIF'
            {
            match(input,48,FOLLOW_48_in_elseIfStatement1173); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:49: (unnamed33= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:50: unnamed33= expression
            {
            pushFollow(FOLLOW_expression_in_elseIfStatement1181);
            unnamed33=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed33); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:106: (unnamed34= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:107: unnamed34= sequence
            {
            pushFollow(FOLLOW_sequence_in_elseIfStatement1189);
            unnamed34=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed34); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end elseIfStatement


    // $ANTLR start elseStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:113:1: elseStatement returns [CompositeNode cn] : ( 'ELSE' ) (unnamed35= sequence ) ;
    public CompositeNode elseStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed35 = null;


         cn = factory.createElseStatementNode(); cn.setRule("elseStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( ( 'ELSE' ) (unnamed35= sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( 'ELSE' ) (unnamed35= sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:3: 'ELSE'
            {
            match(input,49,FOLLOW_49_in_elseStatement1212); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:47: (unnamed35= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:48: unnamed35= sequence
            {
            pushFollow(FOLLOW_sequence_in_elseStatement1220);
            unnamed35=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed35); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end elseStatement


    // $ANTLR start letStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:1: letStatement returns [CompositeNode cn] : ( 'LET' ) (unnamed36= expression ) ( 'AS' ) (unnamed37= identifier ) (unnamed38= sequence ) ( 'ENDLET' ) ;
    public CompositeNode letStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed36 = null;

        CompositeNode unnamed37 = null;

        CompositeNode unnamed38 = null;


         cn = factory.createLetStatementNode(); cn.setRule("letStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:2: ( ( 'LET' ) (unnamed36= expression ) ( 'AS' ) (unnamed37= identifier ) (unnamed38= sequence ) ( 'ENDLET' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:2: ( 'LET' ) (unnamed36= expression ) ( 'AS' ) (unnamed37= identifier ) (unnamed38= sequence ) ( 'ENDLET' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:2: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:3: 'LET'
            {
            match(input,50,FOLLOW_50_in_letStatement1243); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:46: (unnamed36= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:47: unnamed36= expression
            {
            pushFollow(FOLLOW_expression_in_letStatement1251);
            unnamed36=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed36); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:103: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:104: 'AS'
            {
            match(input,43,FOLLOW_43_in_letStatement1257); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:146: (unnamed37= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:147: unnamed37= identifier
            {
            pushFollow(FOLLOW_identifier_in_letStatement1265);
            unnamed37=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed37); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:203: (unnamed38= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:204: unnamed38= sequence
            {
            pushFollow(FOLLOW_sequence_in_letStatement1273);
            unnamed38=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed38); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:258: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:259: 'ENDLET'
            {
            match(input,51,FOLLOW_51_in_letStatement1279); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end letStatement


    // $ANTLR start protectStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:1: protectStatement returns [CompositeNode cn] : ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= expression ) ( 'CEND' ) (unnamed40= expression ) ( 'ID' ) (unnamed41= expression ) ( 'DISABLE' )? (unnamed42= sequence ) ( 'ENDPROTECT' ) ;
    public CompositeNode protectStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed39 = null;

        CompositeNode unnamed40 = null;

        CompositeNode unnamed41 = null;

        CompositeNode unnamed42 = null;


         cn = factory.createProtectStatementNode(); cn.setRule("protectStatement"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:2: ( ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= expression ) ( 'CEND' ) (unnamed40= expression ) ( 'ID' ) (unnamed41= expression ) ( 'DISABLE' )? (unnamed42= sequence ) ( 'ENDPROTECT' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:2: ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= expression ) ( 'CEND' ) (unnamed40= expression ) ( 'ID' ) (unnamed41= expression ) ( 'DISABLE' )? (unnamed42= sequence ) ( 'ENDPROTECT' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:2: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:3: 'PROTECT'
            {
            match(input,52,FOLLOW_52_in_protectStatement1302); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:50: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:51: 'CSTART'
            {
            match(input,53,FOLLOW_53_in_protectStatement1308); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:97: (unnamed39= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:98: unnamed39= expression
            {
            pushFollow(FOLLOW_expression_in_protectStatement1316);
            unnamed39=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed39); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:154: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:155: 'CEND'
            {
            match(input,54,FOLLOW_54_in_protectStatement1322); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:199: (unnamed40= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:200: unnamed40= expression
            {
            pushFollow(FOLLOW_expression_in_protectStatement1330);
            unnamed40=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed40); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:256: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:257: 'ID'
            {
            match(input,55,FOLLOW_55_in_protectStatement1336); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:299: (unnamed41= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:300: unnamed41= expression
            {
            pushFollow(FOLLOW_expression_in_protectStatement1344);
            unnamed41=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed41); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:356: ( 'DISABLE' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:357: 'DISABLE'
                    {
                    match(input,56,FOLLOW_56_in_protectStatement1350); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:405: (unnamed42= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:406: unnamed42= sequence
            {
            pushFollow(FOLLOW_sequence_in_protectStatement1359);
            unnamed42=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed42); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:460: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:461: 'ENDPROTECT'
            {
            match(input,57,FOLLOW_57_in_protectStatement1365); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end protectStatement


    // $ANTLR start check
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:1: check returns [CompositeNode cn] : ( 'context' ) (unnamed43= type ) ( ( ( 'if' ) (unnamed44= expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= expression ) ( ':' ) (unnamed46= expression ) ( ';' ) ;
    public CompositeNode check() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed43 = null;

        CompositeNode unnamed44 = null;

        CompositeNode unnamed45 = null;

        CompositeNode unnamed46 = null;


         cn = factory.createCheckNode(); cn.setRule("check"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:2: ( ( 'context' ) (unnamed43= type ) ( ( ( 'if' ) (unnamed44= expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= expression ) ( ':' ) (unnamed46= expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:2: ( 'context' ) (unnamed43= type ) ( ( ( 'if' ) (unnamed44= expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= expression ) ( ':' ) (unnamed46= expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:2: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:3: 'context'
            {
            match(input,58,FOLLOW_58_in_check1388); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:50: (unnamed43= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:51: unnamed43= type
            {
            pushFollow(FOLLOW_type_in_check1396);
            unnamed43=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed43); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:101: ( ( ( 'if' ) (unnamed44= expression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==59) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:102: ( ( 'if' ) (unnamed44= expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:102: ( ( 'if' ) (unnamed44= expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:103: ( 'if' ) (unnamed44= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:103: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:104: 'if'
                    {
                    match(input,59,FOLLOW_59_in_check1404); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:146: (unnamed44= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:147: unnamed44= expression
                    {
                    pushFollow(FOLLOW_expression_in_check1412);
                    unnamed44=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed44); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:206: ( ( ( 'ERROR' ) | ( 'WARNING' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:207: ( ( 'ERROR' ) | ( 'WARNING' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:207: ( ( 'ERROR' ) | ( 'WARNING' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            else if ( (LA32_0==60) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("127:207: ( ( 'ERROR' ) | ( 'WARNING' ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:208: ( 'ERROR' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:208: ( 'ERROR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:209: 'ERROR'
                    {
                    match(input,37,FOLLOW_37_in_check1423); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:4: ( 'WARNING' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:4: ( 'WARNING' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:5: 'WARNING'
                    {
                    match(input,60,FOLLOW_60_in_check1432); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:54: (unnamed45= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:55: unnamed45= expression
            {
            pushFollow(FOLLOW_expression_in_check1442);
            unnamed45=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed45); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:111: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:112: ':'
            {
            match(input,61,FOLLOW_61_in_check1448); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:153: (unnamed46= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:154: unnamed46= expression
            {
            pushFollow(FOLLOW_expression_in_check1456);
            unnamed46=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed46); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:210: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:128:211: ';'
            {
            match(input,28,FOLLOW_28_in_check1462); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end check


    // $ANTLR start around
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:1: around returns [CompositeNode cn] : ( 'around' ) (unnamed47= pointcut ) ( '(' ) ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= expression ) ( ';' ) ;
    public CompositeNode around() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed47 = null;

        CompositeNode unnamed48 = null;

        CompositeNode unnamed49 = null;


         cn = factory.createAroundNode(); cn.setRule("around"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:2: ( ( 'around' ) (unnamed47= pointcut ) ( '(' ) ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:2: ( 'around' ) (unnamed47= pointcut ) ( '(' ) ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:2: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:3: 'around'
            {
            match(input,62,FOLLOW_62_in_around1485); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:49: (unnamed47= pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:50: unnamed47= pointcut
            {
            pushFollow(FOLLOW_pointcut_in_around1493);
            unnamed47=pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed47); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:104: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:105: '('
            {
            match(input,31,FOLLOW_31_in_around1499); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:146: ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier||LA36_0==33||(LA36_0>=69 && LA36_0<=71)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:147: ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:147: ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==Identifier||(LA35_0>=69 && LA35_0<=71)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==33) ) {
                        alt35=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("132:147: ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:148: (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:148: (unnamed48= declaredParameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:149: unnamed48= declaredParameterList
                            {
                            pushFollow(FOLLOW_declaredParameterList_in_around1509);
                            unnamed48=declaredParameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed48); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:216: ( ( ( ',' )? ( '*' ) ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=32 && LA34_0<=33)) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:217: ( ( ',' )? ( '*' ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:217: ( ( ',' )? ( '*' ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:218: ( ',' )? ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:218: ( ',' )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==32) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:219: ','
                                            {
                                            match(input,32,FOLLOW_32_in_around1517); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }
                                            break;

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:261: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:262: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_around1524); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:4: ( '*' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:4: ( '*' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:5: '*'
                            {
                            match(input,33,FOLLOW_33_in_around1536); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:49: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:50: ')'
            {
            match(input,34,FOLLOW_34_in_around1545); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:91: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:92: ':'
            {
            match(input,61,FOLLOW_61_in_around1551); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:133: (unnamed49= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:134: unnamed49= expression
            {
            pushFollow(FOLLOW_expression_in_around1559);
            unnamed49=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed49); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:190: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:191: ';'
            {
            match(input,28,FOLLOW_28_in_around1565); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end around


    // $ANTLR start pointcut
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:1: pointcut returns [CompositeNode cn] : ( ( ( '*' ) | (unnamed50= identifier ) ) ) ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )* ;
    public CompositeNode pointcut() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed50 = null;

        CompositeNode unnamed51 = null;


         cn = factory.createPointcutNode(); cn.setRule("pointcut"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:2: ( ( ( ( '*' ) | (unnamed50= identifier ) ) ) ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:2: ( ( ( '*' ) | (unnamed50= identifier ) ) ) ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:2: ( ( ( '*' ) | (unnamed50= identifier ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:3: ( ( '*' ) | (unnamed50= identifier ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:3: ( ( '*' ) | (unnamed50= identifier ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            else if ( (LA37_0==Identifier) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("137:3: ( ( '*' ) | (unnamed50= identifier ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:4: ( '*' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:4: ( '*' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:5: '*'
                    {
                    match(input,33,FOLLOW_33_in_pointcut1590); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:4: (unnamed50= identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:4: (unnamed50= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:5: unnamed50= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_pointcut1601);
                    unnamed50=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed50); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:63: ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Identifier||LA39_0==33||LA39_0==63) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:64: ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:64: ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) )
            	    int alt38=3;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case Identifier:
            	        {
            	        alt38=2;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt38=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("138:64: ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) )", 38, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:65: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:65: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:66: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_pointcut1611); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:4: (unnamed51= identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:4: (unnamed51= identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:5: unnamed51= identifier
            	            {
            	            pushFollow(FOLLOW_identifier_in_pointcut1622);
            	            unnamed51=identifier();
            	            _fsp--;
            	            if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addToChildren(cn, unnamed51); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:4: ( '::' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:4: ( '::' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:5: '::'
            	            {
            	            match(input,63,FOLLOW_63_in_pointcut1631); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

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
        return cn;
    }
    // $ANTLR end pointcut


    // $ANTLR start extension
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:142:1: extension returns [CompositeNode cn] : ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (unnamed52= type )? (unnamed53= identifier ) (unnamed54= identifier )? ( '(' ) (unnamed55= declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' ) | (unnamed60= expression ) ) ) ( ';' ) ;
    public CompositeNode extension() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed52 = null;

        CompositeNode unnamed53 = null;

        CompositeNode unnamed54 = null;

        CompositeNode unnamed55 = null;

        CompositeNode unnamed56 = null;

        CompositeNode unnamed57 = null;

        CompositeNode unnamed58 = null;

        CompositeNode unnamed59 = null;

        CompositeNode unnamed60 = null;


         cn = factory.createExtensionNode(); cn.setRule("extension"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:2: ( ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (unnamed52= type )? (unnamed53= identifier ) (unnamed54= identifier )? ( '(' ) (unnamed55= declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' ) | (unnamed60= expression ) ) ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (unnamed52= type )? (unnamed53= identifier ) (unnamed54= identifier )? ( '(' ) (unnamed55= declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' ) | (unnamed60= expression ) ) ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=64 && LA41_0<=66)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
            	    int alt40=3;
            	    switch ( input.LA(1) ) {
            	    case 64:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("144:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:4: ( 'private' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:4: ( 'private' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:5: 'private'
            	            {
            	            match(input,64,FOLLOW_64_in_extension1659); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:4: ( 'cached' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:4: ( 'cached' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:5: 'cached'
            	            {
            	            match(input,65,FOLLOW_65_in_extension1668); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:4: ( 'create' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:4: ( 'create' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:5: 'create'
            	            {
            	            match(input,66,FOLLOW_66_in_extension1677); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:54: (unnamed52= type )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=69 && LA42_0<=71)) ) {
                alt42=1;
            }
            else if ( (LA42_0==Identifier) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==Identifier||LA42_2==63) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:55: unnamed52= type
                    {
                    pushFollow(FOLLOW_type_in_extension1688);
                    unnamed52=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed52); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:106: (unnamed53= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:107: unnamed53= identifier
            {
            pushFollow(FOLLOW_identifier_in_extension1697);
            unnamed53=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed53); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:163: (unnamed54= identifier )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Identifier) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:164: unnamed54= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_extension1705);
                    unnamed54=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed54); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:221: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:222: '('
            {
            match(input,31,FOLLOW_31_in_extension1712); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:263: (unnamed55= declaredParameterList )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Identifier||(LA44_0>=69 && LA44_0<=71)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:264: unnamed55= declaredParameterList
                    {
                    pushFollow(FOLLOW_declaredParameterList_in_extension1720);
                    unnamed55=declaredParameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed55); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:332: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:333: ')'
            {
            match(input,34,FOLLOW_34_in_extension1727); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:374: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:375: ':'
            {
            match(input,61,FOLLOW_61_in_extension1733); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:416: ( ( ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' ) | (unnamed60= expression ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:417: ( ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' ) | (unnamed60= expression ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:417: ( ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' ) | (unnamed60= expression ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==67) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=StringLiteral && LA47_0<=Identifier)||LA47_0==31||LA47_0==36||LA47_0==59||(LA47_0>=69 && LA47_0<=72)||(LA47_0>=78 && LA47_0<=79)||(LA47_0>=94 && LA47_0<=108)) ) {
                alt47=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("146:417: ( ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' ) | (unnamed60= expression ) )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:418: ( 'JAVA' ) (unnamed56= javaType ) ( '.' ) (unnamed57= identifier ) ( '(' ) ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:418: ( 'JAVA' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:419: 'JAVA'
                    {
                    match(input,67,FOLLOW_67_in_extension1741); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:463: (unnamed56= javaType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:464: unnamed56= javaType
                    {
                    pushFollow(FOLLOW_javaType_in_extension1749);
                    unnamed56=javaType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed56); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:518: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:519: '.'
                    {
                    match(input,68,FOLLOW_68_in_extension1755); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:560: (unnamed57= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:561: unnamed57= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_extension1763);
                    unnamed57=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed57); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:617: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:618: '('
                    {
                    match(input,31,FOLLOW_31_in_extension1769); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:659: ( ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==Identifier) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:660: ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:660: ( (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )* )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:661: (unnamed58= javaType ) ( ( ( ',' ) (unnamed59= javaType ) ) )*
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:661: (unnamed58= javaType )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:662: unnamed58= javaType
                            {
                            pushFollow(FOLLOW_javaType_in_extension1779);
                            unnamed58=javaType();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed58); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:716: ( ( ( ',' ) (unnamed59= javaType ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==32) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:717: ( ( ',' ) (unnamed59= javaType ) )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:717: ( ( ',' ) (unnamed59= javaType ) )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:718: ( ',' ) (unnamed59= javaType )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:718: ( ',' )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:719: ','
                            	    {
                            	    match(input,32,FOLLOW_32_in_extension1787); if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addLeafNodeForToken(cn, null); 
                            	    }

                            	    }

                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:760: (unnamed59= javaType )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:761: unnamed59= javaType
                            	    {
                            	    pushFollow(FOLLOW_javaType_in_extension1795);
                            	    unnamed59=javaType();
                            	    _fsp--;
                            	    if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addToChildren(cn, unnamed59); 
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:821: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:822: ')'
                    {
                    match(input,34,FOLLOW_34_in_extension1807); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:4: (unnamed60= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:4: (unnamed60= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:5: unnamed60= expression
                    {
                    pushFollow(FOLLOW_expression_in_extension1818);
                    unnamed60=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed60); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:63: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:64: ';'
            {
            match(input,28,FOLLOW_28_in_extension1826); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end extension


    // $ANTLR start javaType
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:149:1: javaType returns [CompositeNode cn] : (unnamed61= identifier ) ( ( ( '.' ) ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* ;
    public CompositeNode javaType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed61 = null;

        CompositeNode unnamed62 = null;


         cn = factory.createJavaTypeNode(); cn.setRule("javaType"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( (unnamed61= identifier ) ( ( ( '.' ) ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: (unnamed61= identifier ) ( ( ( '.' ) ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: (unnamed61= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:3: unnamed61= identifier
            {
            pushFollow(FOLLOW_identifier_in_javaType1851);
            unnamed61=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed61); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:59: ( ( ( '.' ) ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==68) ) {
                    int LA49_1 = input.LA(2);

                    if ( (LA49_1==Identifier) ) {
                        int LA49_3 = input.LA(3);

                        if ( (LA49_3==32||LA49_3==34||LA49_3==68) ) {
                            alt49=1;
                        }


                    }
                    else if ( ((LA49_1>=69 && LA49_1<=71)) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:60: ( ( '.' ) ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:60: ( ( '.' ) ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:61: ( '.' ) ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:61: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:62: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_javaType1859); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:103: ( ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:104: ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:104: ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    int alt48=4;
            	    switch ( input.LA(1) ) {
            	    case Identifier:
            	        {
            	        alt48=1;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt48=2;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt48=3;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt48=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("151:104: ( (unnamed62= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 48, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt48) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:105: (unnamed62= identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:105: (unnamed62= identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:106: unnamed62= identifier
            	            {
            	            pushFollow(FOLLOW_identifier_in_javaType1869);
            	            unnamed62=identifier();
            	            _fsp--;
            	            if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addToChildren(cn, unnamed62); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:4: ( 'Collection' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:4: ( 'Collection' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:5: 'Collection'
            	            {
            	            match(input,69,FOLLOW_69_in_javaType1878); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:4: ( 'List' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:4: ( 'List' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:5: 'List'
            	            {
            	            match(input,70,FOLLOW_70_in_javaType1887); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:154:4: ( 'Set' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:154:4: ( 'Set' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:154:5: 'Set'
            	            {
            	            match(input,71,FOLLOW_71_in_javaType1896); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


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
        return cn;
    }
    // $ANTLR end javaType


    // $ANTLR start test_expression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:1: test_expression returns [CompositeNode cn] : (unnamed63= expression ) ( EOF ) ;
    public CompositeNode test_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed63 = null;


         cn = factory.createTest_expressionNode(); cn.setRule("test_expression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:2: ( (unnamed63= expression ) ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:2: (unnamed63= expression ) ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:2: (unnamed63= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:3: unnamed63= expression
            {
            pushFollow(FOLLOW_expression_in_test_expression1931);
            unnamed63=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed63); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:59: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:60: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_test_expression1937); if (failed) return cn;

            }


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end test_expression


    // $ANTLR start expression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:161:1: expression returns [CompositeNode cn] : (unnamed64= letExpression ) ;
    public CompositeNode expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed64 = null;


         cn = factory.createExpressionNode(); cn.setRule("expression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:164:2: ( (unnamed64= letExpression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:164:2: (unnamed64= letExpression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:164:2: (unnamed64= letExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:164:3: unnamed64= letExpression
            {
            pushFollow(FOLLOW_letExpression_in_expression1965);
            unnamed64=letExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed64); 
            }

            }


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end expression


    // $ANTLR start letExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:1: letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed65= identifier ) ( '=' ) (unnamed66= castedExpression ) ( ':' ) (unnamed67= expression ) | (unnamed68= castedExpression ) );
    public CompositeNode letExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed65 = null;

        CompositeNode unnamed66 = null;

        CompositeNode unnamed67 = null;

        CompositeNode unnamed68 = null;


         cn = factory.createLetExpressionNode(); cn.setRule("letExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:2: ( ( 'let' ) (unnamed65= identifier ) ( '=' ) (unnamed66= castedExpression ) ( ':' ) (unnamed67= expression ) | (unnamed68= castedExpression ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=StringLiteral && LA50_0<=Identifier)||LA50_0==31||LA50_0==36||LA50_0==59||(LA50_0>=69 && LA50_0<=71)||(LA50_0>=78 && LA50_0<=79)||(LA50_0>=94 && LA50_0<=108)) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("166:1: letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed65= identifier ) ( '=' ) (unnamed66= castedExpression ) ( ':' ) (unnamed67= expression ) | (unnamed68= castedExpression ) );", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:2: ( 'let' ) (unnamed65= identifier ) ( '=' ) (unnamed66= castedExpression ) ( ':' ) (unnamed67= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:2: ( 'let' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:3: 'let'
                    {
                    match(input,72,FOLLOW_72_in_letExpression1993); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:46: (unnamed65= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:47: unnamed65= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_letExpression2001);
                    unnamed65=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed65); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:103: ( '=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:104: '='
                    {
                    match(input,73,FOLLOW_73_in_letExpression2007); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:145: (unnamed66= castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:146: unnamed66= castedExpression
                    {
                    pushFollow(FOLLOW_castedExpression_in_letExpression2015);
                    unnamed66=castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed66); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:208: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:209: ':'
                    {
                    match(input,61,FOLLOW_61_in_letExpression2021); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:250: (unnamed67= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:251: unnamed67= expression
                    {
                    pushFollow(FOLLOW_expression_in_letExpression2029);
                    unnamed67=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed67); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:170:4: (unnamed68= castedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:170:4: (unnamed68= castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:170:5: unnamed68= castedExpression
                    {
                    pushFollow(FOLLOW_castedExpression_in_letExpression2040);
                    unnamed68=castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed68); 
                    }

                    }


                    }
                    break;

            }
            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end letExpression


    // $ANTLR start castedExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:1: castedExpression returns [CompositeNode cn] : ( ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed69= type ) ( ')' ) (unnamed70= chainExpression ) ) | (unnamed71= chainExpression ) );
    public CompositeNode castedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed69 = null;

        CompositeNode unnamed70 = null;

        CompositeNode unnamed71 = null;


         cn = factory.createCastedExpressionNode(); cn.setRule("castedExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:2: ( ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed69= type ) ( ')' ) (unnamed70= chainExpression ) ) | (unnamed71= chainExpression ) )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:2: ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed69= type ) ( ')' ) (unnamed70= chainExpression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:34: ( ( '(' ) (unnamed69= type ) ( ')' ) (unnamed70= chainExpression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:35: ( '(' ) (unnamed69= type ) ( ')' ) (unnamed70= chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:35: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:36: '('
                    {
                    match(input,31,FOLLOW_31_in_castedExpression2079); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:77: (unnamed69= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:78: unnamed69= type
                    {
                    pushFollow(FOLLOW_type_in_castedExpression2087);
                    unnamed69=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed69); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:128: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:129: ')'
                    {
                    match(input,34,FOLLOW_34_in_castedExpression2093); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:170: (unnamed70= chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:171: unnamed70= chainExpression
                    {
                    pushFollow(FOLLOW_chainExpression_in_castedExpression2101);
                    unnamed70=chainExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed70); 
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:4: (unnamed71= chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:4: (unnamed71= chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:5: unnamed71= chainExpression
                    {
                    pushFollow(FOLLOW_chainExpression_in_castedExpression2113);
                    unnamed71=chainExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed71); 
                    }

                    }


                    }
                    break;

            }
            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end castedExpression


    // $ANTLR start chainExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:178:1: chainExpression returns [CompositeNode cn] : (unnamed72= ifExpression ) ( ( ( '->' ) (unnamed73= ifExpression ) ) )* ;
    public CompositeNode chainExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed72 = null;

        CompositeNode unnamed73 = null;


         cn = factory.createChainExpressionNode(); cn.setRule("chainExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:2: ( (unnamed72= ifExpression ) ( ( ( '->' ) (unnamed73= ifExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:2: (unnamed72= ifExpression ) ( ( ( '->' ) (unnamed73= ifExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:2: (unnamed72= ifExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:3: unnamed72= ifExpression
            {
            pushFollow(FOLLOW_ifExpression_in_chainExpression2143);
            unnamed72=ifExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed72); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:61: ( ( ( '->' ) (unnamed73= ifExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==74) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:62: ( ( '->' ) (unnamed73= ifExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:62: ( ( '->' ) (unnamed73= ifExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:63: ( '->' ) (unnamed73= ifExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:63: ( '->' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:64: '->'
            	    {
            	    match(input,74,FOLLOW_74_in_chainExpression2151); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:106: (unnamed73= ifExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:107: unnamed73= ifExpression
            	    {
            	    pushFollow(FOLLOW_ifExpression_in_chainExpression2159);
            	    unnamed73=ifExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed73); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end chainExpression


    // $ANTLR start ifExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:1: ifExpression returns [CompositeNode cn] : ( (unnamed74= switchExpression ) ( ( ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression ) ) )? | ( 'if' ) (unnamed77= expression ) ( 'then' ) (unnamed78= switchExpression ) ( ( ( 'else' ) (unnamed79= switchExpression ) ) )? );
    public CompositeNode ifExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed74 = null;

        CompositeNode unnamed75 = null;

        CompositeNode unnamed76 = null;

        CompositeNode unnamed77 = null;

        CompositeNode unnamed78 = null;

        CompositeNode unnamed79 = null;


         cn = factory.createIfExpressionNode(); cn.setRule("ifExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:2: ( (unnamed74= switchExpression ) ( ( ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression ) ) )? | ( 'if' ) (unnamed77= expression ) ( 'then' ) (unnamed78= switchExpression ) ( ( ( 'else' ) (unnamed79= switchExpression ) ) )? )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=StringLiteral && LA55_0<=Identifier)||LA55_0==31||LA55_0==36||(LA55_0>=69 && LA55_0<=71)||(LA55_0>=78 && LA55_0<=79)||(LA55_0>=94 && LA55_0<=108)) ) {
                alt55=1;
            }
            else if ( (LA55_0==59) ) {
                alt55=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("183:1: ifExpression returns [CompositeNode cn] : ( (unnamed74= switchExpression ) ( ( ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression ) ) )? | ( 'if' ) (unnamed77= expression ) ( 'then' ) (unnamed78= switchExpression ) ( ( ( 'else' ) (unnamed79= switchExpression ) ) )? );", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:2: (unnamed74= switchExpression ) ( ( ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:2: (unnamed74= switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:3: unnamed74= switchExpression
                    {
                    pushFollow(FOLLOW_switchExpression_in_ifExpression2192);
                    unnamed74=switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed74); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:65: ( ( ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==75) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:66: ( ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:66: ( ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:67: ( '?' ) (unnamed75= expression ) ( ':' ) (unnamed76= switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:67: ( '?' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:68: '?'
                            {
                            match(input,75,FOLLOW_75_in_ifExpression2200); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:109: (unnamed75= expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:110: unnamed75= expression
                            {
                            pushFollow(FOLLOW_expression_in_ifExpression2208);
                            unnamed75=expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed75); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:166: ( ':' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:167: ':'
                            {
                            match(input,61,FOLLOW_61_in_ifExpression2214); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:208: (unnamed76= switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:209: unnamed76= switchExpression
                            {
                            pushFollow(FOLLOW_switchExpression_in_ifExpression2222);
                            unnamed76=switchExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed76); 
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:4: ( 'if' ) (unnamed77= expression ) ( 'then' ) (unnamed78= switchExpression ) ( ( ( 'else' ) (unnamed79= switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:4: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:5: 'if'
                    {
                    match(input,59,FOLLOW_59_in_ifExpression2234); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:47: (unnamed77= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:48: unnamed77= expression
                    {
                    pushFollow(FOLLOW_expression_in_ifExpression2242);
                    unnamed77=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed77); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:104: ( 'then' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:105: 'then'
                    {
                    match(input,76,FOLLOW_76_in_ifExpression2248); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:149: (unnamed78= switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:150: unnamed78= switchExpression
                    {
                    pushFollow(FOLLOW_switchExpression_in_ifExpression2256);
                    unnamed78=switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed78); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:212: ( ( ( 'else' ) (unnamed79= switchExpression ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==77) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:213: ( ( 'else' ) (unnamed79= switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:213: ( ( 'else' ) (unnamed79= switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:214: ( 'else' ) (unnamed79= switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:214: ( 'else' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:215: 'else'
                            {
                            match(input,77,FOLLOW_77_in_ifExpression2264); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:259: (unnamed79= switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:187:260: unnamed79= switchExpression
                            {
                            pushFollow(FOLLOW_switchExpression_in_ifExpression2272);
                            unnamed79=switchExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed79); 
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end ifExpression


    // $ANTLR start switchExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:1: switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed80= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed81= casePart )* ( 'default' ) ( ':' ) (unnamed82= orExpression ) ( '}' ) | (unnamed83= orExpression ) );
    public CompositeNode switchExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed80 = null;

        CompositeNode unnamed81 = null;

        CompositeNode unnamed82 = null;

        CompositeNode unnamed83 = null;


         cn = factory.createSwitchExpressionNode(); cn.setRule("switchExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:2: ( ( 'switch' ) ( ( ( '(' ) (unnamed80= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed81= casePart )* ( 'default' ) ( ':' ) (unnamed82= orExpression ) ( '}' ) | (unnamed83= orExpression ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==78) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=StringLiteral && LA58_0<=Identifier)||LA58_0==31||LA58_0==36||(LA58_0>=69 && LA58_0<=71)||LA58_0==79||(LA58_0>=94 && LA58_0<=108)) ) {
                alt58=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("189:1: switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed80= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed81= casePart )* ( 'default' ) ( ':' ) (unnamed82= orExpression ) ( '}' ) | (unnamed83= orExpression ) );", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:2: ( 'switch' ) ( ( ( '(' ) (unnamed80= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed81= casePart )* ( 'default' ) ( ':' ) (unnamed82= orExpression ) ( '}' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:2: ( 'switch' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:3: 'switch'
                    {
                    match(input,78,FOLLOW_78_in_switchExpression2303); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:49: ( ( ( '(' ) (unnamed80= orExpression ) ( ')' ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==31) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:50: ( ( '(' ) (unnamed80= orExpression ) ( ')' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:50: ( ( '(' ) (unnamed80= orExpression ) ( ')' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:51: ( '(' ) (unnamed80= orExpression ) ( ')' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:51: ( '(' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:52: '('
                            {
                            match(input,31,FOLLOW_31_in_switchExpression2311); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:93: (unnamed80= orExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:94: unnamed80= orExpression
                            {
                            pushFollow(FOLLOW_orExpression_in_switchExpression2319);
                            unnamed80=orExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed80); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:152: ( ')' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:153: ')'
                            {
                            match(input,34,FOLLOW_34_in_switchExpression2325); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:197: ( '{' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:198: '{'
                    {
                    match(input,79,FOLLOW_79_in_switchExpression2334); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:239: (unnamed81= casePart )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==82) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:240: unnamed81= casePart
                    	    {
                    	    pushFollow(FOLLOW_casePart_in_switchExpression2342);
                    	    unnamed81=casePart();
                    	    _fsp--;
                    	    if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addToChildren(cn, unnamed81); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:295: ( 'default' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:296: 'default'
                    {
                    match(input,80,FOLLOW_80_in_switchExpression2349); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:343: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:344: ':'
                    {
                    match(input,61,FOLLOW_61_in_switchExpression2355); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:385: (unnamed82= orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:386: unnamed82= orExpression
                    {
                    pushFollow(FOLLOW_orExpression_in_switchExpression2363);
                    unnamed82=orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed82); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:444: ( '}' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:445: '}'
                    {
                    match(input,81,FOLLOW_81_in_switchExpression2369); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:193:4: (unnamed83= orExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:193:4: (unnamed83= orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:193:5: unnamed83= orExpression
                    {
                    pushFollow(FOLLOW_orExpression_in_switchExpression2380);
                    unnamed83=orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed83); 
                    }

                    }


                    }
                    break;

            }
            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end switchExpression


    // $ANTLR start casePart
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:1: casePart returns [CompositeNode cn] : ( 'case' ) (unnamed84= expression ) ( ':' ) (unnamed85= expression ) ;
    public CompositeNode casePart() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed84 = null;

        CompositeNode unnamed85 = null;


         cn = factory.createCasePartNode(); cn.setRule("casePart"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: ( ( 'case' ) (unnamed84= expression ) ( ':' ) (unnamed85= expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: ( 'case' ) (unnamed84= expression ) ( ':' ) (unnamed85= expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:3: 'case'
            {
            match(input,82,FOLLOW_82_in_casePart2403); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:47: (unnamed84= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:48: unnamed84= expression
            {
            pushFollow(FOLLOW_expression_in_casePart2411);
            unnamed84=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed84); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:104: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:105: ':'
            {
            match(input,61,FOLLOW_61_in_casePart2417); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:146: (unnamed85= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:147: unnamed85= expression
            {
            pushFollow(FOLLOW_expression_in_casePart2425);
            unnamed85=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed85); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end casePart


    // $ANTLR start orExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:1: orExpression returns [CompositeNode cn] : (unnamed86= andExpression ) ( ( ( '||' ) (unnamed87= andExpression ) ) )* ;
    public CompositeNode orExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed86 = null;

        CompositeNode unnamed87 = null;


         cn = factory.createOrExpressionNode(); cn.setRule("orExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:2: ( (unnamed86= andExpression ) ( ( ( '||' ) (unnamed87= andExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:2: (unnamed86= andExpression ) ( ( ( '||' ) (unnamed87= andExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:2: (unnamed86= andExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:3: unnamed86= andExpression
            {
            pushFollow(FOLLOW_andExpression_in_orExpression2455);
            unnamed86=andExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed86); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:62: ( ( ( '||' ) (unnamed87= andExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==83) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:63: ( ( '||' ) (unnamed87= andExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:63: ( ( '||' ) (unnamed87= andExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:64: ( '||' ) (unnamed87= andExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:64: ( '||' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:65: '||'
            	    {
            	    match(input,83,FOLLOW_83_in_orExpression2463); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:107: (unnamed87= andExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:108: unnamed87= andExpression
            	    {
            	    pushFollow(FOLLOW_andExpression_in_orExpression2471);
            	    unnamed87=andExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed87); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end orExpression


    // $ANTLR start andExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:204:1: andExpression returns [CompositeNode cn] : (unnamed88= impliesExpression ) ( ( ( '&&' ) (unnamed89= impliesExpression ) ) )* ;
    public CompositeNode andExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed88 = null;

        CompositeNode unnamed89 = null;


         cn = factory.createAndExpressionNode(); cn.setRule("andExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: ( (unnamed88= impliesExpression ) ( ( ( '&&' ) (unnamed89= impliesExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: (unnamed88= impliesExpression ) ( ( ( '&&' ) (unnamed89= impliesExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: (unnamed88= impliesExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:3: unnamed88= impliesExpression
            {
            pushFollow(FOLLOW_impliesExpression_in_andExpression2504);
            unnamed88=impliesExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed88); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:66: ( ( ( '&&' ) (unnamed89= impliesExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==84) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:67: ( ( '&&' ) (unnamed89= impliesExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:67: ( ( '&&' ) (unnamed89= impliesExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:68: ( '&&' ) (unnamed89= impliesExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:68: ( '&&' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:69: '&&'
            	    {
            	    match(input,84,FOLLOW_84_in_andExpression2512); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:111: (unnamed89= impliesExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:112: unnamed89= impliesExpression
            	    {
            	    pushFollow(FOLLOW_impliesExpression_in_andExpression2520);
            	    unnamed89=impliesExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed89); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end andExpression


    // $ANTLR start impliesExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:209:1: impliesExpression returns [CompositeNode cn] : (unnamed90= relationalExpression ) ( ( ( 'implies' ) (unnamed91= relationalExpression ) ) )* ;
    public CompositeNode impliesExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed90 = null;

        CompositeNode unnamed91 = null;


         cn = factory.createImpliesExpressionNode(); cn.setRule("impliesExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:2: ( (unnamed90= relationalExpression ) ( ( ( 'implies' ) (unnamed91= relationalExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:2: (unnamed90= relationalExpression ) ( ( ( 'implies' ) (unnamed91= relationalExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:2: (unnamed90= relationalExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:3: unnamed90= relationalExpression
            {
            pushFollow(FOLLOW_relationalExpression_in_impliesExpression2553);
            unnamed90=relationalExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed90); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:69: ( ( ( 'implies' ) (unnamed91= relationalExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==85) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:70: ( ( 'implies' ) (unnamed91= relationalExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:70: ( ( 'implies' ) (unnamed91= relationalExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:71: ( 'implies' ) (unnamed91= relationalExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:71: ( 'implies' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:72: 'implies'
            	    {
            	    match(input,85,FOLLOW_85_in_impliesExpression2561); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:119: (unnamed91= relationalExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:120: unnamed91= relationalExpression
            	    {
            	    pushFollow(FOLLOW_relationalExpression_in_impliesExpression2569);
            	    unnamed91=relationalExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed91); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end impliesExpression


    // $ANTLR start relationalExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:1: relationalExpression returns [CompositeNode cn] : (unnamed92= additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (unnamed93= additiveExpression ) ) )* ;
    public CompositeNode relationalExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed92 = null;

        CompositeNode unnamed93 = null;


         cn = factory.createRelationalExpressionNode(); cn.setRule("relationalExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:2: ( (unnamed92= additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (unnamed93= additiveExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:2: (unnamed92= additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (unnamed93= additiveExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:2: (unnamed92= additiveExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:3: unnamed92= additiveExpression
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2602);
            unnamed92=additiveExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed92); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:67: ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (unnamed93= additiveExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=86 && LA63_0<=91)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:68: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (unnamed93= additiveExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:68: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (unnamed93= additiveExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:69: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (unnamed93= additiveExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:69: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:70: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:70: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            	    int alt62=6;
            	    switch ( input.LA(1) ) {
            	    case 86:
            	        {
            	        alt62=1;
            	        }
            	        break;
            	    case 87:
            	        {
            	        alt62=2;
            	        }
            	        break;
            	    case 88:
            	        {
            	        alt62=3;
            	        }
            	        break;
            	    case 89:
            	        {
            	        alt62=4;
            	        }
            	        break;
            	    case 90:
            	        {
            	        alt62=5;
            	        }
            	        break;
            	    case 91:
            	        {
            	        alt62=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("217:70: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )", 62, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt62) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:71: ( '==' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:71: ( '==' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:72: '=='
            	            {
            	            match(input,86,FOLLOW_86_in_relationalExpression2612); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:218:4: ( '!=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:218:4: ( '!=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:218:5: '!='
            	            {
            	            match(input,87,FOLLOW_87_in_relationalExpression2621); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:219:4: ( '>=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:219:4: ( '>=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:219:5: '>='
            	            {
            	            match(input,88,FOLLOW_88_in_relationalExpression2630); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:4: ( '<=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:4: ( '<=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:5: '<='
            	            {
            	            match(input,89,FOLLOW_89_in_relationalExpression2639); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:4: ( '>' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:4: ( '>' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:5: '>'
            	            {
            	            match(input,90,FOLLOW_90_in_relationalExpression2648); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: ( '<' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: ( '<' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:5: '<'
            	            {
            	            match(input,91,FOLLOW_91_in_relationalExpression2657); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:48: (unnamed93= additiveExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:49: unnamed93= additiveExpression
            	    {
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2667);
            	    unnamed93=additiveExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed93); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start additiveExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:224:1: additiveExpression returns [CompositeNode cn] : (unnamed94= multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed95= multiplicativeExpression ) ) )* ;
    public CompositeNode additiveExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed94 = null;

        CompositeNode unnamed95 = null;


         cn = factory.createAdditiveExpressionNode(); cn.setRule("additiveExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( (unnamed94= multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed95= multiplicativeExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: (unnamed94= multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed95= multiplicativeExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: (unnamed94= multiplicativeExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:3: unnamed94= multiplicativeExpression
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2700);
            unnamed94=multiplicativeExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed94); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:73: ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed95= multiplicativeExpression ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==36) ) {
                    int LA65_2 = input.LA(2);

                    if ( ((LA65_2>=StringLiteral && LA65_2<=Identifier)||LA65_2==31||LA65_2==36||(LA65_2>=69 && LA65_2<=71)||LA65_2==79||(LA65_2>=94 && LA65_2<=108)) ) {
                        alt65=1;
                    }


                }
                else if ( (LA65_0==92) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:74: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed95= multiplicativeExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:74: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed95= multiplicativeExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:75: ( ( ( '+' ) | ( '-' ) ) ) (unnamed95= multiplicativeExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:75: ( ( ( '+' ) | ( '-' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:76: ( ( '+' ) | ( '-' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:76: ( ( '+' ) | ( '-' ) )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==92) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==36) ) {
            	        alt64=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("227:76: ( ( '+' ) | ( '-' ) )", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:77: ( '+' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:77: ( '+' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:78: '+'
            	            {
            	            match(input,92,FOLLOW_92_in_additiveExpression2710); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:4: ( '-' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:4: ( '-' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:5: '-'
            	            {
            	            match(input,36,FOLLOW_36_in_additiveExpression2719); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:48: (unnamed95= multiplicativeExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:49: unnamed95= multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2729);
            	    unnamed95=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed95); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end additiveExpression


    // $ANTLR start multiplicativeExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:230:1: multiplicativeExpression returns [CompositeNode cn] : (unnamed96= unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed97= unaryExpression ) ) )* ;
    public CompositeNode multiplicativeExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed96 = null;

        CompositeNode unnamed97 = null;


         cn = factory.createMultiplicativeExpressionNode(); cn.setRule("multiplicativeExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: ( (unnamed96= unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed97= unaryExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: (unnamed96= unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed97= unaryExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: (unnamed96= unaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:3: unnamed96= unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2762);
            unnamed96=unaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed96); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:64: ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed97= unaryExpression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==33||LA67_0==93) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:65: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed97= unaryExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:65: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed97= unaryExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:66: ( ( ( '*' ) | ( '/' ) ) ) (unnamed97= unaryExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:66: ( ( ( '*' ) | ( '/' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:67: ( ( '*' ) | ( '/' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:67: ( ( '*' ) | ( '/' ) )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==33) ) {
            	        alt66=1;
            	    }
            	    else if ( (LA66_0==93) ) {
            	        alt66=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("233:67: ( ( '*' ) | ( '/' ) )", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:68: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:68: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:69: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_multiplicativeExpression2772); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:234:4: ( '/' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:234:4: ( '/' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:234:5: '/'
            	            {
            	            match(input,93,FOLLOW_93_in_multiplicativeExpression2781); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:234:48: (unnamed97= unaryExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:234:49: unnamed97= unaryExpression
            	    {
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2791);
            	    unnamed97=unaryExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed97); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end multiplicativeExpression


    // $ANTLR start unaryExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:1: unaryExpression returns [CompositeNode cn] : ( (unnamed98= infixExpression ) | ( '!' ) (unnamed99= infixExpression ) | ( '-' ) (unnamed100= infixExpression ) );
    public CompositeNode unaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed98 = null;

        CompositeNode unnamed99 = null;

        CompositeNode unnamed100 = null;


         cn = factory.createUnaryExpressionNode(); cn.setRule("unaryExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: ( (unnamed98= infixExpression ) | ( '!' ) (unnamed99= infixExpression ) | ( '-' ) (unnamed100= infixExpression ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 31:
            case 69:
            case 70:
            case 71:
            case 79:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt68=1;
                }
                break;
            case 94:
                {
                alt68=2;
                }
                break;
            case 36:
                {
                alt68=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("236:1: unaryExpression returns [CompositeNode cn] : ( (unnamed98= infixExpression ) | ( '!' ) (unnamed99= infixExpression ) | ( '-' ) (unnamed100= infixExpression ) );", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: (unnamed98= infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: (unnamed98= infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:3: unnamed98= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression2824);
                    unnamed98=infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed98); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:240:4: ( '!' ) (unnamed99= infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:240:4: ( '!' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:240:5: '!'
                    {
                    match(input,94,FOLLOW_94_in_unaryExpression2833); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:240:46: (unnamed99= infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:240:47: unnamed99= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression2841);
                    unnamed99=infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed99); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:241:4: ( '-' ) (unnamed100= infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:241:4: ( '-' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:241:5: '-'
                    {
                    match(input,36,FOLLOW_36_in_unaryExpression2850); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:241:46: (unnamed100= infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:241:47: unnamed100= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression2858);
                    unnamed100=infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed100); 
                    }

                    }


                    }
                    break;

            }
            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end unaryExpression


    // $ANTLR start infixExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:1: infixExpression returns [CompositeNode cn] : (unnamed101= primaryExpression ) ( ( ( '.' ) (unnamed102= featureCall ) ) )* ;
    public CompositeNode infixExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed101 = null;

        CompositeNode unnamed102 = null;


         cn = factory.createInfixExpressionNode(); cn.setRule("infixExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:2: ( (unnamed101= primaryExpression ) ( ( ( '.' ) (unnamed102= featureCall ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:2: (unnamed101= primaryExpression ) ( ( ( '.' ) (unnamed102= featureCall ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:2: (unnamed101= primaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:3: unnamed101= primaryExpression
            {
            pushFollow(FOLLOW_primaryExpression_in_infixExpression2888);
            unnamed101=primaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed101); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:68: ( ( ( '.' ) (unnamed102= featureCall ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==68) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:69: ( ( '.' ) (unnamed102= featureCall ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:69: ( ( '.' ) (unnamed102= featureCall ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:70: ( '.' ) (unnamed102= featureCall )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:70: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:71: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_infixExpression2896); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:112: (unnamed102= featureCall )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:113: unnamed102= featureCall
            	    {
            	    pushFollow(FOLLOW_featureCall_in_infixExpression2904);
            	    unnamed102=featureCall();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed102); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end infixExpression


    // $ANTLR start primaryExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:248:1: primaryExpression returns [CompositeNode cn] : ( ( stringLiteral ) | ( featureCall ) | ( booleanLiteral ) | ( numberLiteral ) | ( nullLiteral ) | ( listLiteral ) | ( constructorCall ) | ( globalVarExpression ) | ( paranthesizedExpression ) );
    public CompositeNode primaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode stringLiteral15 = null;

        CompositeNode featureCall16 = null;

        CompositeNode booleanLiteral17 = null;

        CompositeNode numberLiteral18 = null;

        CompositeNode nullLiteral19 = null;

        CompositeNode listLiteral20 = null;

        CompositeNode constructorCall21 = null;

        CompositeNode globalVarExpression22 = null;

        CompositeNode paranthesizedExpression23 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:249:2: ( ( stringLiteral ) | ( featureCall ) | ( booleanLiteral ) | ( numberLiteral ) | ( nullLiteral ) | ( listLiteral ) | ( constructorCall ) | ( globalVarExpression ) | ( paranthesizedExpression ) )
            int alt70=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt70=1;
                }
                break;
            case Identifier:
            case 69:
            case 70:
            case 71:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt70=2;
                }
                break;
            case 97:
            case 98:
                {
                alt70=3;
                }
                break;
            case IntLiteral:
                {
                alt70=4;
                }
                break;
            case 99:
                {
                alt70=5;
                }
                break;
            case 79:
                {
                alt70=6;
                }
                break;
            case 96:
                {
                alt70=7;
                }
                break;
            case 95:
                {
                alt70=8;
                }
                break;
            case 31:
                {
                alt70=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("248:1: primaryExpression returns [CompositeNode cn] : ( ( stringLiteral ) | ( featureCall ) | ( booleanLiteral ) | ( numberLiteral ) | ( nullLiteral ) | ( listLiteral ) | ( constructorCall ) | ( globalVarExpression ) | ( paranthesizedExpression ) );", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:249:2: ( stringLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:249:2: ( stringLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:249:3: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_primaryExpression2925);
                    stringLiteral15=stringLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = stringLiteral15; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:4: ( featureCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:4: ( featureCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:5: featureCall
                    {
                    pushFollow(FOLLOW_featureCall_in_primaryExpression2934);
                    featureCall16=featureCall();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = featureCall16; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:4: ( booleanLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:4: ( booleanLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:5: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression2943);
                    booleanLiteral17=booleanLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = booleanLiteral17; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:4: ( numberLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:4: ( numberLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:5: numberLiteral
                    {
                    pushFollow(FOLLOW_numberLiteral_in_primaryExpression2952);
                    numberLiteral18=numberLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = numberLiteral18; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:4: ( nullLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:4: ( nullLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:5: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_primaryExpression2961);
                    nullLiteral19=nullLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = nullLiteral19; 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:254:4: ( listLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:254:4: ( listLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:254:5: listLiteral
                    {
                    pushFollow(FOLLOW_listLiteral_in_primaryExpression2970);
                    listLiteral20=listLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = listLiteral20; 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:255:4: ( constructorCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:255:4: ( constructorCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:255:5: constructorCall
                    {
                    pushFollow(FOLLOW_constructorCall_in_primaryExpression2979);
                    constructorCall21=constructorCall();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = constructorCall21; 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:4: ( globalVarExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:4: ( globalVarExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:5: globalVarExpression
                    {
                    pushFollow(FOLLOW_globalVarExpression_in_primaryExpression2988);
                    globalVarExpression22=globalVarExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = globalVarExpression22; 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:257:4: ( paranthesizedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:257:4: ( paranthesizedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:257:5: paranthesizedExpression
                    {
                    pushFollow(FOLLOW_paranthesizedExpression_in_primaryExpression2997);
                    paranthesizedExpression23=paranthesizedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = paranthesizedExpression23; 
                    }

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
        return cn;
    }
    // $ANTLR end primaryExpression


    // $ANTLR start stringLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:1: stringLiteral returns [CompositeNode cn] : ( StringLiteral ) ;
    public CompositeNode stringLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createStringLiteralNode(); cn.setRule("stringLiteral"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:261:2: ( ( StringLiteral ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:261:2: ( StringLiteral )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:261:2: ( StringLiteral )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:261:3: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteral3020); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end stringLiteral


    // $ANTLR start paranthesizedExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:1: paranthesizedExpression returns [CompositeNode cn] : ( '(' ) (unnamed103= expression ) ( ')' ) ;
    public CompositeNode paranthesizedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed103 = null;


         cn = factory.createParanthesizedExpressionNode(); cn.setRule("paranthesizedExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:2: ( ( '(' ) (unnamed103= expression ) ( ')' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:2: ( '(' ) (unnamed103= expression ) ( ')' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:2: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:3: '('
            {
            match(input,31,FOLLOW_31_in_paranthesizedExpression3043); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:44: (unnamed103= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:45: unnamed103= expression
            {
            pushFollow(FOLLOW_expression_in_paranthesizedExpression3051);
            unnamed103=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed103); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:103: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:104: ')'
            {
            match(input,34,FOLLOW_34_in_paranthesizedExpression3057); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end paranthesizedExpression


    // $ANTLR start globalVarExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:1: globalVarExpression returns [CompositeNode cn] : ( 'GLOBALVAR' ) (unnamed104= identifier ) ;
    public CompositeNode globalVarExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed104 = null;


         cn = factory.createGlobalVarExpressionNode(); cn.setRule("globalVarExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:2: ( ( 'GLOBALVAR' ) (unnamed104= identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:2: ( 'GLOBALVAR' ) (unnamed104= identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:2: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:3: 'GLOBALVAR'
            {
            match(input,95,FOLLOW_95_in_globalVarExpression3080); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:52: (unnamed104= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:53: unnamed104= identifier
            {
            pushFollow(FOLLOW_identifier_in_globalVarExpression3088);
            unnamed104=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed104); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end globalVarExpression


    // $ANTLR start featureCall
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:271:1: featureCall returns [CompositeNode cn] : ( (unnamed105= identifier ) ( '(' ) ( ( (unnamed106= parameterList ) ) )? ( ')' ) | (unnamed107= type ) | (unnamed108= collectionExpression ) );
    public CompositeNode featureCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed105 = null;

        CompositeNode unnamed106 = null;

        CompositeNode unnamed107 = null;

        CompositeNode unnamed108 = null;


         cn = factory.createFeatureCallNode(); cn.setRule("featureCall"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:2: ( (unnamed105= identifier ) ( '(' ) ( ( (unnamed106= parameterList ) ) )? ( ')' ) | (unnamed107= type ) | (unnamed108= collectionExpression ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==EOF||LA72_1==TEXT||LA72_1==Identifier||LA72_1==28||(LA72_1>=32 && LA72_1<=34)||(LA72_1>=36 && LA72_1<=37)||LA72_1==40||LA72_1==43||(LA72_1>=54 && LA72_1<=56)||(LA72_1>=60 && LA72_1<=61)||LA72_1==63||LA72_1==68||(LA72_1>=74 && LA72_1<=77)||(LA72_1>=80 && LA72_1<=93)) ) {
                    alt72=2;
                }
                else if ( (LA72_1==31) ) {
                    alt72=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("271:1: featureCall returns [CompositeNode cn] : ( (unnamed105= identifier ) ( '(' ) ( ( (unnamed106= parameterList ) ) )? ( ')' ) | (unnamed107= type ) | (unnamed108= collectionExpression ) );", 72, 1, input);

                    throw nvae;
                }
                }
                break;
            case 69:
            case 70:
            case 71:
                {
                alt72=2;
                }
                break;
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt72=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("271:1: featureCall returns [CompositeNode cn] : ( (unnamed105= identifier ) ( '(' ) ( ( (unnamed106= parameterList ) ) )? ( ')' ) | (unnamed107= type ) | (unnamed108= collectionExpression ) );", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:2: (unnamed105= identifier ) ( '(' ) ( ( (unnamed106= parameterList ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:2: (unnamed105= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:3: unnamed105= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_featureCall3118);
                    unnamed105=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed105); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:61: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:62: '('
                    {
                    match(input,31,FOLLOW_31_in_featureCall3124); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:103: ( ( (unnamed106= parameterList ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=StringLiteral && LA71_0<=Identifier)||LA71_0==31||LA71_0==36||LA71_0==59||(LA71_0>=69 && LA71_0<=72)||(LA71_0>=78 && LA71_0<=79)||(LA71_0>=94 && LA71_0<=108)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:104: ( (unnamed106= parameterList ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:104: ( (unnamed106= parameterList ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:105: (unnamed106= parameterList )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:105: (unnamed106= parameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:106: unnamed106= parameterList
                            {
                            pushFollow(FOLLOW_parameterList_in_featureCall3134);
                            unnamed106=parameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed106); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:170: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:171: ')'
                    {
                    match(input,34,FOLLOW_34_in_featureCall3143); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:4: (unnamed107= type )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:4: (unnamed107= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:5: unnamed107= type
                    {
                    pushFollow(FOLLOW_type_in_featureCall3154);
                    unnamed107=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed107); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:4: (unnamed108= collectionExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:4: (unnamed108= collectionExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:5: unnamed108= collectionExpression
                    {
                    pushFollow(FOLLOW_collectionExpression_in_featureCall3165);
                    unnamed108=collectionExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed108); 
                    }

                    }


                    }
                    break;

            }
            if ( backtracking==0 ) {
               cn = normalize(cn); 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end featureCall


    // $ANTLR start listLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:278:1: listLiteral returns [CompositeNode cn] : ( '{' ) ( ( (unnamed109= expression ) ( ( ( ',' ) (unnamed110= expression ) ) )* ) )? ( '}' ) ;
    public CompositeNode listLiteral() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed109 = null;

        CompositeNode unnamed110 = null;


         cn = factory.createListLiteralNode(); cn.setRule("listLiteral"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: ( ( '{' ) ( ( (unnamed109= expression ) ( ( ( ',' ) (unnamed110= expression ) ) )* ) )? ( '}' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: ( '{' ) ( ( (unnamed109= expression ) ( ( ( ',' ) (unnamed110= expression ) ) )* ) )? ( '}' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: ( '{' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:3: '{'
            {
            match(input,79,FOLLOW_79_in_listLiteral3188); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:44: ( ( (unnamed109= expression ) ( ( ( ',' ) (unnamed110= expression ) ) )* ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=StringLiteral && LA74_0<=Identifier)||LA74_0==31||LA74_0==36||LA74_0==59||(LA74_0>=69 && LA74_0<=72)||(LA74_0>=78 && LA74_0<=79)||(LA74_0>=94 && LA74_0<=108)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:45: ( (unnamed109= expression ) ( ( ( ',' ) (unnamed110= expression ) ) )* )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:45: ( (unnamed109= expression ) ( ( ( ',' ) (unnamed110= expression ) ) )* )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:46: (unnamed109= expression ) ( ( ( ',' ) (unnamed110= expression ) ) )*
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:46: (unnamed109= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:47: unnamed109= expression
                    {
                    pushFollow(FOLLOW_expression_in_listLiteral3198);
                    unnamed109=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed109); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:105: ( ( ( ',' ) (unnamed110= expression ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==32) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:106: ( ( ',' ) (unnamed110= expression ) )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:106: ( ( ',' ) (unnamed110= expression ) )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:107: ( ',' ) (unnamed110= expression )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:107: ( ',' )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:108: ','
                    	    {
                    	    match(input,32,FOLLOW_32_in_listLiteral3206); if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addLeafNodeForToken(cn, null); 
                    	    }

                    	    }

                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:149: (unnamed110= expression )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:150: unnamed110= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_listLiteral3214);
                    	    unnamed110=expression();
                    	    _fsp--;
                    	    if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addToChildren(cn, unnamed110); 
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:214: ( '}' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:215: '}'
            {
            match(input,81,FOLLOW_81_in_listLiteral3226); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end listLiteral


    // $ANTLR start constructorCall
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:282:1: constructorCall returns [CompositeNode cn] : ( 'new' ) (unnamed111= simpleType ) ;
    public CompositeNode constructorCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed111 = null;


         cn = factory.createConstructorCallNode(); cn.setRule("constructorCall"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:2: ( ( 'new' ) (unnamed111= simpleType ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:2: ( 'new' ) (unnamed111= simpleType )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:2: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:3: 'new'
            {
            match(input,96,FOLLOW_96_in_constructorCall3249); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:46: (unnamed111= simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:47: unnamed111= simpleType
            {
            pushFollow(FOLLOW_simpleType_in_constructorCall3257);
            unnamed111=simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed111); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end constructorCall


    // $ANTLR start booleanLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:1: booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );
    public CompositeNode booleanLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createBooleanLiteralNode(); cn.setRule("booleanLiteral"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:288:2: ( ( 'false' ) | ( 'true' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==97) ) {
                alt75=1;
            }
            else if ( (LA75_0==98) ) {
                alt75=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("286:1: booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:288:2: ( 'false' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:288:2: ( 'false' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:288:3: 'false'
                    {
                    match(input,97,FOLLOW_97_in_booleanLiteral3280); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:4: ( 'true' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:4: ( 'true' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:5: 'true'
                    {
                    match(input,98,FOLLOW_98_in_booleanLiteral3289); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

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
        return cn;
    }
    // $ANTLR end booleanLiteral


    // $ANTLR start nullLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:291:1: nullLiteral returns [CompositeNode cn] : ( 'null' ) ;
    public CompositeNode nullLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNullLiteralNode(); cn.setRule("nullLiteral"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: ( ( 'null' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: ( 'null' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: ( 'null' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:3: 'null'
            {
            match(input,99,FOLLOW_99_in_nullLiteral3312); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end nullLiteral


    // $ANTLR start numberLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );
    public CompositeNode numberLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNumberLiteralNode(); cn.setRule("numberLiteral"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:2: ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==IntLiteral) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==68) ) {
                    int LA76_2 = input.LA(3);

                    if ( (LA76_2==Identifier||(LA76_2>=69 && LA76_2<=71)||(LA76_2>=100 && LA76_2<=108)) ) {
                        alt76=1;
                    }
                    else if ( (LA76_2==IntLiteral) ) {
                        alt76=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("295:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 76, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA76_1==EOF||LA76_1==TEXT||LA76_1==Identifier||LA76_1==28||(LA76_1>=32 && LA76_1<=34)||(LA76_1>=36 && LA76_1<=37)||LA76_1==40||LA76_1==43||(LA76_1>=54 && LA76_1<=56)||(LA76_1>=60 && LA76_1<=61)||(LA76_1>=74 && LA76_1<=77)||(LA76_1>=80 && LA76_1<=93)) ) {
                    alt76=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("295:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 76, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("295:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:2: ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:2: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:3: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral3335); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( IntLiteral ) ( '.' ) ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:5: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral3344); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:53: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:54: '.'
                    {
                    match(input,68,FOLLOW_68_in_numberLiteral3350); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:95: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:96: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral3356); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

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
        return cn;
    }
    // $ANTLR end numberLiteral


    // $ANTLR start collectionExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:1: collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed112= type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed113= identifier ) ( '|' ) ) )? (unnamed114= expression ) ( ')' ) );
    public CompositeNode collectionExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed112 = null;

        CompositeNode unnamed113 = null;

        CompositeNode unnamed114 = null;


         cn = factory.createCollectionExpressionNode(); cn.setRule("collectionExpression"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:2: ( ( 'typeSelect' ) ( '(' ) (unnamed112= type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed113= identifier ) ( '|' ) ) )? (unnamed114= expression ) ( ')' ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==100) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=101 && LA79_0<=108)) ) {
                alt79=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("300:1: collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed112= type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed113= identifier ) ( '|' ) ) )? (unnamed114= expression ) ( ')' ) );", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:2: ( 'typeSelect' ) ( '(' ) (unnamed112= type ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:2: ( 'typeSelect' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:3: 'typeSelect'
                    {
                    match(input,100,FOLLOW_100_in_collectionExpression3379); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:54: '('
                    {
                    match(input,31,FOLLOW_31_in_collectionExpression3385); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:95: (unnamed112= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:96: unnamed112= type
                    {
                    pushFollow(FOLLOW_type_in_collectionExpression3393);
                    unnamed112=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed112); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:148: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:149: ')'
                    {
                    match(input,34,FOLLOW_34_in_collectionExpression3399); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:303:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed113= identifier ) ( '|' ) ) )? (unnamed114= expression ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:303:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:303:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:303:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    int alt77=8;
                    switch ( input.LA(1) ) {
                    case 101:
                        {
                        alt77=1;
                        }
                        break;
                    case 102:
                        {
                        alt77=2;
                        }
                        break;
                    case 103:
                        {
                        alt77=3;
                        }
                        break;
                    case 104:
                        {
                        alt77=4;
                        }
                        break;
                    case 105:
                        {
                        alt77=5;
                        }
                        break;
                    case 106:
                        {
                        alt77=6;
                        }
                        break;
                    case 107:
                        {
                        alt77=7;
                        }
                        break;
                    case 108:
                        {
                        alt77=8;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("303:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:303:6: ( 'collect' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:303:6: ( 'collect' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:303:7: 'collect'
                            {
                            match(input,101,FOLLOW_101_in_collectionExpression3410); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:304:4: ( 'select' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:304:4: ( 'select' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:304:5: 'select'
                            {
                            match(input,102,FOLLOW_102_in_collectionExpression3419); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:4: ( 'selectFirst' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:4: ( 'selectFirst' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:5: 'selectFirst'
                            {
                            match(input,103,FOLLOW_103_in_collectionExpression3428); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:4: ( 'reject' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:4: ( 'reject' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:5: 'reject'
                            {
                            match(input,104,FOLLOW_104_in_collectionExpression3437); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:4: ( 'exists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:4: ( 'exists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:5: 'exists'
                            {
                            match(input,105,FOLLOW_105_in_collectionExpression3446); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 6 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:308:4: ( 'notExists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:308:4: ( 'notExists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:308:5: 'notExists'
                            {
                            match(input,106,FOLLOW_106_in_collectionExpression3455); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 7 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:309:4: ( 'sortBy' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:309:4: ( 'sortBy' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:309:5: 'sortBy'
                            {
                            match(input,107,FOLLOW_107_in_collectionExpression3464); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 8 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:4: ( 'forAll' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:4: ( 'forAll' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:5: 'forAll'
                            {
                            match(input,108,FOLLOW_108_in_collectionExpression3473); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;

                    }


                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:54: '('
                    {
                    match(input,31,FOLLOW_31_in_collectionExpression3481); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:95: ( ( (unnamed113= identifier ) ( '|' ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==Identifier) ) {
                        int LA78_1 = input.LA(2);

                        if ( (LA78_1==109) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:96: ( (unnamed113= identifier ) ( '|' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:96: ( (unnamed113= identifier ) ( '|' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:97: (unnamed113= identifier ) ( '|' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:97: (unnamed113= identifier )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:98: unnamed113= identifier
                            {
                            pushFollow(FOLLOW_identifier_in_collectionExpression3491);
                            unnamed113=identifier();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed113); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:156: ( '|' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:157: '|'
                            {
                            match(input,109,FOLLOW_109_in_collectionExpression3497); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:201: (unnamed114= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:202: unnamed114= expression
                    {
                    pushFollow(FOLLOW_expression_in_collectionExpression3508);
                    unnamed114=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed114); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:260: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:261: ')'
                    {
                    match(input,34,FOLLOW_34_in_collectionExpression3514); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

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
        return cn;
    }
    // $ANTLR end collectionExpression


    // $ANTLR start declaredParameterList
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:312:1: declaredParameterList returns [CompositeNode cn] : (unnamed115= declaredParameter ) ( ( ( ',' ) (unnamed116= declaredParameter ) ) )* ;
    public CompositeNode declaredParameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed115 = null;

        CompositeNode unnamed116 = null;


         cn = factory.createDeclaredParameterListNode(); cn.setRule("declaredParameterList"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:2: ( (unnamed115= declaredParameter ) ( ( ( ',' ) (unnamed116= declaredParameter ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:2: (unnamed115= declaredParameter ) ( ( ( ',' ) (unnamed116= declaredParameter ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:2: (unnamed115= declaredParameter )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:3: unnamed115= declaredParameter
            {
            pushFollow(FOLLOW_declaredParameter_in_declaredParameterList3539);
            unnamed115=declaredParameter();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed115); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:68: ( ( ( ',' ) (unnamed116= declaredParameter ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==32) ) {
                    int LA80_1 = input.LA(2);

                    if ( (LA80_1==Identifier||(LA80_1>=69 && LA80_1<=71)) ) {
                        alt80=1;
                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:69: ( ( ',' ) (unnamed116= declaredParameter ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:69: ( ( ',' ) (unnamed116= declaredParameter ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:70: ( ',' ) (unnamed116= declaredParameter )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:70: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:71: ','
            	    {
            	    match(input,32,FOLLOW_32_in_declaredParameterList3547); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:112: (unnamed116= declaredParameter )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:113: unnamed116= declaredParameter
            	    {
            	    pushFollow(FOLLOW_declaredParameter_in_declaredParameterList3555);
            	    unnamed116=declaredParameter();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed116); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
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
        return cn;
    }
    // $ANTLR end declaredParameterList


    // $ANTLR start declaredParameter
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:1: declaredParameter returns [CompositeNode cn] : (unnamed117= type ) (unnamed118= identifier ) ;
    public CompositeNode declaredParameter() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed117 = null;

        CompositeNode unnamed118 = null;


         cn = factory.createDeclaredParameterNode(); cn.setRule("declaredParameter"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:2: ( (unnamed117= type ) (unnamed118= identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:2: (unnamed117= type ) (unnamed118= identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:2: (unnamed117= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:3: unnamed117= type
            {
            pushFollow(FOLLOW_type_in_declaredParameter3583);
            unnamed117=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed117); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:55: (unnamed118= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:56: unnamed118= identifier
            {
            pushFollow(FOLLOW_identifier_in_declaredParameter3591);
            unnamed118=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed118); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end declaredParameter


    // $ANTLR start parameterList
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:320:1: parameterList returns [CompositeNode cn] : (unnamed119= expression ) ( ( ( ',' ) (unnamed120= expression ) ) )* ;
    public CompositeNode parameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed119 = null;

        CompositeNode unnamed120 = null;


         cn = factory.createParameterListNode(); cn.setRule("parameterList"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:2: ( (unnamed119= expression ) ( ( ( ',' ) (unnamed120= expression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:2: (unnamed119= expression ) ( ( ( ',' ) (unnamed120= expression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:2: (unnamed119= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:3: unnamed119= expression
            {
            pushFollow(FOLLOW_expression_in_parameterList3616);
            unnamed119=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed119); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:61: ( ( ( ',' ) (unnamed120= expression ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==32) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:62: ( ( ',' ) (unnamed120= expression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:62: ( ( ',' ) (unnamed120= expression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:63: ( ',' ) (unnamed120= expression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:63: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:64: ','
            	    {
            	    match(input,32,FOLLOW_32_in_parameterList3624); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:105: (unnamed120= expression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:106: unnamed120= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_parameterList3632);
            	    unnamed120=expression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed120); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
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
        return cn;
    }
    // $ANTLR end parameterList


    // $ANTLR start type
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:324:1: type returns [CompositeNode cn] : ( ( collectionType ) | ( simpleType ) );
    public CompositeNode type() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode collectionType24 = null;

        CompositeNode simpleType25 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:325:2: ( ( collectionType ) | ( simpleType ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=69 && LA82_0<=71)) ) {
                alt82=1;
            }
            else if ( (LA82_0==Identifier) ) {
                alt82=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("324:1: type returns [CompositeNode cn] : ( ( collectionType ) | ( simpleType ) );", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:325:2: ( collectionType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:325:2: ( collectionType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:325:3: collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3653);
                    collectionType24=collectionType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = collectionType24; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:326:4: ( simpleType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:326:4: ( simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:326:5: simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3662);
                    simpleType25=simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = simpleType25; 
                    }

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
        return cn;
    }
    // $ANTLR end type


    // $ANTLR start collectionType
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:1: collectionType returns [CompositeNode cn] : ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed121= simpleType ) ( ']' ) ) )? ;
    public CompositeNode collectionType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed121 = null;


         cn = factory.createCollectionTypeNode(); cn.setRule("collectionType"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: ( ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed121= simpleType ) ( ']' ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed121= simpleType ) ( ']' ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt83=1;
                }
                break;
            case 70:
                {
                alt83=2;
                }
                break;
            case 71:
                {
                alt83=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("330:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:4: ( 'Collection' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:4: ( 'Collection' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:5: 'Collection'
                    {
                    match(input,69,FOLLOW_69_in_collectionType3687); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:4: ( 'List' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:4: ( 'List' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:5: 'List'
                    {
                    match(input,70,FOLLOW_70_in_collectionType3696); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:4: ( 'Set' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:4: ( 'Set' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:5: 'Set'
                    {
                    match(input,71,FOLLOW_71_in_collectionType3705); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:50: ( ( ( '[' ) (unnamed121= simpleType ) ( ']' ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==110) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:51: ( ( '[' ) (unnamed121= simpleType ) ( ']' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:51: ( ( '[' ) (unnamed121= simpleType ) ( ']' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:52: ( '[' ) (unnamed121= simpleType ) ( ']' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:52: ( '[' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:53: '['
                    {
                    match(input,110,FOLLOW_110_in_collectionType3715); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:94: (unnamed121= simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:95: unnamed121= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_collectionType3723);
                    unnamed121=simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed121); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:153: ( ']' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:332:154: ']'
                    {
                    match(input,111,FOLLOW_111_in_collectionType3729); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


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
        return cn;
    }
    // $ANTLR end collectionType


    // $ANTLR start simpleType
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:1: simpleType returns [CompositeNode cn] : (unnamed122= identifier ) ( ( ( '::' ) (unnamed123= identifier ) ) )* ;
    public CompositeNode simpleType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed122 = null;

        CompositeNode unnamed123 = null;


         cn = factory.createSimpleTypeNode(); cn.setRule("simpleType"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:2: ( (unnamed122= identifier ) ( ( ( '::' ) (unnamed123= identifier ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:2: (unnamed122= identifier ) ( ( ( '::' ) (unnamed123= identifier ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:2: (unnamed122= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:3: unnamed122= identifier
            {
            pushFollow(FOLLOW_identifier_in_simpleType3757);
            unnamed122=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed122); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:61: ( ( ( '::' ) (unnamed123= identifier ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==63) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:62: ( ( '::' ) (unnamed123= identifier ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:62: ( ( '::' ) (unnamed123= identifier ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:63: ( '::' ) (unnamed123= identifier )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:63: ( '::' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:64: '::'
            	    {
            	    match(input,63,FOLLOW_63_in_simpleType3765); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:106: (unnamed123= identifier )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:107: unnamed123= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_simpleType3773);
            	    unnamed123=identifier();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed123); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
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
        return cn;
    }
    // $ANTLR end simpleType


    // $ANTLR start identifier
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:1: identifier returns [CompositeNode cn] : ( Identifier ) ;
    public CompositeNode identifier() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createIdentifierNode(); cn.setRule("identifier"); 
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:2: ( ( Identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:2: ( Identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:2: ( Identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:3: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_identifier3799); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cn;
    }
    // $ANTLR end identifier

    // $ANTLR start synpred1
    public void synpred1_fragment() throws RecognitionException {   
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:2: ( '(' type ')' chainExpression )
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:3: '(' type ')' chainExpression
        {
        match(input,31,FOLLOW_31_in_synpred12068); if (failed) return ;
        pushFollow(FOLLOW_type_in_synpred12070);
        type();
        _fsp--;
        if (failed) return ;
        match(input,34,FOLLOW_34_in_synpred12072); if (failed) return ;
        pushFollow(FOLLOW_chainExpression_in_synpred12074);
        chainExpression();
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


    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA51_eotS =
        "\101\uffff";
    static final String DFA51_eofS =
        "\10\uffff\1\2\70\uffff";
    static final String DFA51_minS =
        "\2\13\1\uffff\3\41\1\37\1\15\1\12\1\15\1\77\1\12\1\0\30\uffff\1"+
        "\41\1\15\1\41\5\0\3\37\21\0";
    static final String DFA51_maxS =
        "\2\154\1\uffff\3\156\1\135\1\15\1\154\1\15\1\157\1\154\1\0\30\uffff"+
        "\1\135\1\15\1\135\5\0\3\37\21\0";
    static final String DFA51_acceptS =
        "\2\uffff\1\2\12\uffff\30\1\34\uffff";
    static final String DFA51_specialS =
        "\10\uffff\1\1\3\uffff\1\6\33\uffff\1\3\1\5\1\2\1\0\1\4\24\uffff}>";
    static final String[] DFA51_transitionS = {
            "\3\2\21\uffff\1\1\4\uffff\1\2\26\uffff\1\2\11\uffff\3\2\6\uffff"+
            "\2\2\16\uffff\17\2",
            "\2\2\1\6\21\uffff\1\2\4\uffff\1\2\26\uffff\1\2\11\uffff\1\3"+
            "\1\4\1\5\1\2\5\uffff\2\2\16\uffff\17\2",
            "",
            "\1\2\1\10\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\7",
            "\1\2\1\10\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\7",
            "\1\2\1\10\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\7",
            "\1\2\1\uffff\1\2\1\10\1\uffff\1\2\32\uffff\1\11\4\uffff\1\2"+
            "\5\uffff\2\2\7\uffff\13\2",
            "\1\12",
            "\1\2\1\16\1\35\1\14\16\uffff\1\2\2\uffff\1\42\3\2\1\uffff\1"+
            "\13\1\2\2\uffff\1\2\2\uffff\1\2\12\uffff\3\2\2\uffff\1\44\2"+
            "\2\6\uffff\1\2\1\17\1\20\1\21\2\uffff\3\2\1\uffff\1\15\1\37"+
            "\16\2\1\43\1\41\1\40\1\33\1\34\1\36\1\22\1\23\1\24\1\25\1\26"+
            "\1\27\1\30\1\31\1\32",
            "\1\45",
            "\1\46\57\uffff\1\47",
            "\1\2\1\50\1\70\1\51\21\uffff\1\75\4\uffff\1\2\40\uffff\1\52"+
            "\1\53\1\54\7\uffff\1\72\16\uffff\1\2\1\74\1\73\1\66\1\67\1\71"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65",
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
            "\1\2\1\10\1\uffff\1\2\32\uffff\1\11\4\uffff\1\2\5\uffff\2\2"+
            "\7\uffff\13\2",
            "\1\76",
            "\1\2\1\10\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "172:1: castedExpression returns [CompositeNode cn] : ( ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed69= type ) ( ')' ) (unnamed70= chainExpression ) ) | (unnamed71= chainExpression ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_43 = input.LA(1);

                         
                        int index51_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_43);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA51_8==EOF||LA51_8==TEXT||LA51_8==28||(LA51_8>=32 && LA51_8<=34)||LA51_8==37||LA51_8==40||LA51_8==43||(LA51_8>=54 && LA51_8<=56)||(LA51_8>=60 && LA51_8<=61)||LA51_8==68||(LA51_8>=74 && LA51_8<=76)||(LA51_8>=80 && LA51_8<=93)) ) {s = 2;}

                        else if ( (LA51_8==36) ) {s = 11;}

                        else if ( (LA51_8==Identifier) ) {s = 12;}

                        else if ( (LA51_8==78) && (synpred1())) {s = 13;}

                        else if ( (LA51_8==StringLiteral) && (synpred1())) {s = 14;}

                        else if ( (LA51_8==69) && (synpred1())) {s = 15;}

                        else if ( (LA51_8==70) && (synpred1())) {s = 16;}

                        else if ( (LA51_8==71) && (synpred1())) {s = 17;}

                        else if ( (LA51_8==100) && (synpred1())) {s = 18;}

                        else if ( (LA51_8==101) && (synpred1())) {s = 19;}

                        else if ( (LA51_8==102) && (synpred1())) {s = 20;}

                        else if ( (LA51_8==103) && (synpred1())) {s = 21;}

                        else if ( (LA51_8==104) && (synpred1())) {s = 22;}

                        else if ( (LA51_8==105) && (synpred1())) {s = 23;}

                        else if ( (LA51_8==106) && (synpred1())) {s = 24;}

                        else if ( (LA51_8==107) && (synpred1())) {s = 25;}

                        else if ( (LA51_8==108) && (synpred1())) {s = 26;}

                        else if ( (LA51_8==97) && (synpred1())) {s = 27;}

                        else if ( (LA51_8==98) && (synpred1())) {s = 28;}

                        else if ( (LA51_8==IntLiteral) && (synpred1())) {s = 29;}

                        else if ( (LA51_8==99) && (synpred1())) {s = 30;}

                        else if ( (LA51_8==79) && (synpred1())) {s = 31;}

                        else if ( (LA51_8==96) && (synpred1())) {s = 32;}

                        else if ( (LA51_8==95) && (synpred1())) {s = 33;}

                        else if ( (LA51_8==31) && (synpred1())) {s = 34;}

                        else if ( (LA51_8==94) && (synpred1())) {s = 35;}

                        else if ( (LA51_8==59) && (synpred1())) {s = 36;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_42 = input.LA(1);

                         
                        int index51_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_42);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_40 = input.LA(1);

                         
                        int index51_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_40);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_44 = input.LA(1);

                         
                        int index51_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_44);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_41 = input.LA(1);

                         
                        int index51_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_41);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_12 = input.LA(1);

                         
                        int index51_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_nsImport_in_file80 = new BitSet(new long[]{0x4400000028002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_abstractDeclaration_in_file93 = new BitSet(new long[]{0x4400000000002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_EOF_in_file102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_nsImport123 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_nsImport129 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simpleType_in_nsImport137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_nsImport143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_nsImport152 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_nsImport158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simpleType_in_nsImport166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_nsImport172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_nsImport181 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_nsImport189 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_nsImport195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_nsImport204 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_nsImport212 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_nsImport220 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_nsImport229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_check_in_abstractDeclaration247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_around_in_abstractDeclaration256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_abstractDeclaration265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_abstractDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definitionAround_in_abstractDeclaration283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_definition306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_definition312 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_definition320 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_definition328 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_declaredParameterList_in_definition338 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_definition346 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_definition353 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_definition365 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_definition374 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_definition383 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_definition391 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_definition399 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_definition405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_definition411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_definitionAround434 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_definitionAround440 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_pointcut_in_definitionAround448 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_definitionAround456 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_declaredParameterList_in_definitionAround466 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_definitionAround474 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_definitionAround481 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_definitionAround493 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_definitionAround502 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_definitionAround511 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_definitionAround519 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_definitionAround527 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_definitionAround533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_definitionAround539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textSequence_in_sequence564 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_statement_in_sequence574 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_textSequence_in_sequence582 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_simpleStatement_in_statement603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fileStatement_in_statement612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreachStatement_in_statement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letStatement_in_statement639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protectStatement_in_statement648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_textSequence678 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_text_in_textSequence688 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_text714 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_text721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_errorStatement_in_simpleStatement739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expandStatement_in_simpleStatement748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_simpleStatement757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_errorStatement780 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_errorStatement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_expandStatement811 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simpleType_in_expandStatement819 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_expandStatement827 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_parameterList_in_expandStatement835 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_expandStatement841 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_expandStatement854 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_expandStatement862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_expandStatement875 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_expandStatement883 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_expandStatement891 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_expandStatement899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStmt932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_fileStatement955 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_fileStatement963 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_identifier_in_fileStatement973 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_fileStatement984 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_fileStatement990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_foreachStatement1013 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_foreachStatement1021 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_foreachStatement1027 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_foreachStatement1035 = new BitSet(new long[]{0x0000111000000400L});
    public static final BitSet FOLLOW_44_in_foreachStatement1043 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_foreachStatement1051 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_foreachStatement1062 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_foreachStatement1070 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_foreachStatement1081 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_foreachStatement1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ifStatement1110 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_ifStatement1118 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_ifStatement1126 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifStatement1134 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement1143 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ifStatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_elseIfStatement1173 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_elseIfStatement1181 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_elseIfStatement1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_elseStatement1212 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_elseStatement1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_letStatement1243 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_letStatement1251 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_letStatement1257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_letStatement1265 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_letStatement1273 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_letStatement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_protectStatement1302 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_protectStatement1308 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_protectStatement1316 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_protectStatement1322 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_protectStatement1330 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_protectStatement1336 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_protectStatement1344 = new BitSet(new long[]{0x0100001000000400L});
    public static final BitSet FOLLOW_56_in_protectStatement1350 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_sequence_in_protectStatement1359 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_protectStatement1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_check1388 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_check1396 = new BitSet(new long[]{0x1800002000000000L});
    public static final BitSet FOLLOW_59_in_check1404 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_check1412 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_37_in_check1423 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_60_in_check1432 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_check1442 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_check1448 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_check1456 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_check1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_around1485 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_pointcut_in_around1493 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_around1499 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_declaredParameterList_in_around1509 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_around1517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_around1524 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_around1536 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_around1545 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_around1551 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_around1559 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_around1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_pointcut1590 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_identifier_in_pointcut1601 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_33_in_pointcut1611 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_identifier_in_pointcut1622 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_63_in_pointcut1631 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_64_in_extension1659 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_65_in_extension1668 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_66_in_extension1677 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_type_in_extension1688 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_extension1697 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_identifier_in_extension1705 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_extension1712 = new BitSet(new long[]{0x0000000400002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_declaredParameterList_in_extension1720 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_extension1727 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extension1733 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E8L});
    public static final BitSet FOLLOW_67_in_extension1741 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_javaType_in_extension1749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_extension1755 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_extension1763 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_extension1769 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_javaType_in_extension1779 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_extension1787 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_javaType_in_extension1795 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_extension1807 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_expression_in_extension1818 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_extension1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_javaType1851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_javaType1859 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_identifier_in_javaType1869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_javaType1878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_javaType1887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_javaType1896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_test_expression1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_test_expression1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letExpression_in_expression1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_letExpression1993 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_letExpression2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_letExpression2007 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression2015 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_letExpression2021 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_letExpression2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_castedExpression2079 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_castedExpression2087 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_castedExpression2093 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression2143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_chainExpression2151 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2192 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ifExpression2200 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_ifExpression2208 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression2214 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ifExpression2234 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_ifExpression2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ifExpression2248 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ifExpression2264 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_switchExpression2303 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_31_in_switchExpression2311 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression2319 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_switchExpression2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_switchExpression2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_casePart_in_switchExpression2342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_80_in_switchExpression2349 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_switchExpression2355 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_switchExpression2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_casePart2403 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_casePart2411 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_casePart2417 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_casePart2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_orExpression2463 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression2504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_andExpression2512 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression2520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression2553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_impliesExpression2561 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression2569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2602 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_86_in_relationalExpression2612 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_87_in_relationalExpression2621 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_88_in_relationalExpression2630 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_89_in_relationalExpression2639 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_90_in_relationalExpression2648 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_91_in_relationalExpression2657 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2667 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2700 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_additiveExpression2710 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_36_in_additiveExpression2719 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2729 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2762 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_33_in_multiplicativeExpression2772 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_93_in_multiplicativeExpression2781 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2791 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_unaryExpression2833 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_unaryExpression2850 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_infixExpression2888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_infixExpression2896 = new BitSet(new long[]{0x0000000000002000L,0x00001FF0000000E0L});
    public static final BitSet FOLLOW_featureCall_in_infixExpression2904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_stringLiteral_in_primaryExpression2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_featureCall_in_primaryExpression2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_primaryExpression2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_primaryExpression2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLiteral_in_primaryExpression2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorCall_in_primaryExpression2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVarExpression_in_primaryExpression2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paranthesizedExpression_in_primaryExpression2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteral3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_paranthesizedExpression3043 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_paranthesizedExpression3051 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_paranthesizedExpression3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_globalVarExpression3080 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_globalVarExpression3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_featureCall3118 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_featureCall3124 = new BitSet(new long[]{0x0800001480003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_parameterList_in_featureCall3134 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_featureCall3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_featureCall3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionExpression_in_featureCall3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_listLiteral3188 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC002C1E0L});
    public static final BitSet FOLLOW_expression_in_listLiteral3198 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_32_in_listLiteral3206 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_listLiteral3214 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_listLiteral3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_constructorCall3249 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simpleType_in_constructorCall3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_booleanLiteral3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_booleanLiteral3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_nullLiteral3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral3344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_numberLiteral3350 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_collectionExpression3379 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_collectionExpression3385 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_collectionExpression3393 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_collectionExpression3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_collectionExpression3410 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_102_in_collectionExpression3419 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_103_in_collectionExpression3428 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_104_in_collectionExpression3437 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_105_in_collectionExpression3446 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_106_in_collectionExpression3455 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_107_in_collectionExpression3464 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_108_in_collectionExpression3473 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_collectionExpression3481 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_identifier_in_collectionExpression3491 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_collectionExpression3497 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_collectionExpression3508 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_collectionExpression3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList3539 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_declaredParameterList3547 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList3555 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_type_in_declaredParameter3583 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_declaredParameter3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameterList3616 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parameterList3624 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_parameterList3632 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_collectionType_in_type3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_collectionType3687 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_70_in_collectionType3696 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_71_in_collectionType3705 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_collectionType3715 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simpleType_in_collectionType3723 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_collectionType3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleType3757 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_simpleType3765 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_simpleType3773 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred12068 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_synpred12070 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred12072 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_chainExpression_in_synpred12074 = new BitSet(new long[]{0x0000000000000002L});

}