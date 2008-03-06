// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g 2008-03-06 16:05:46
 	
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
            ruleMemo = new HashMap[61+1];
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


         cn = factory.createFileNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( ( (imp= nsImport ) ) )* ( ( (decl= abstractDeclaration ) ) )* ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( (imp= nsImport ) ) )* ( ( (decl= abstractDeclaration ) ) )* ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( (imp= nsImport ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:3: ( (imp= nsImport ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:3: ( (imp= nsImport ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:4: (imp= nsImport )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:4: (imp= nsImport )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:5: imp= nsImport
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:85: ( ( (decl= abstractDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==58||LA2_0==62||(LA2_0>=64 && LA2_0<=66)||(LA2_0>=69 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:86: ( (decl= abstractDeclaration ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:86: ( (decl= abstractDeclaration ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:87: (decl= abstractDeclaration )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:87: (decl= abstractDeclaration )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:88: decl= abstractDeclaration
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:183: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:184: EOF
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:35:1: nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) );
    public CompositeNode nsImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode ns = null;

        CompositeNode unnamed0 = null;

        CompositeNode unnamed1 = null;


         cn = factory.createNsImportNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:2: ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) )
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
                        new NoViableAltException("35:1: nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 1, input);

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
                    new NoViableAltException("35:1: nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG ) | ( 'import' ) (unnamed0= type ) ( ';' ) | ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:2: ( LG ) ( 'IMPORT' ) (ns= simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:2: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:3: LG
                    {
                    match(input,LG,FOLLOW_LG_in_nsImport123); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:43: ( 'IMPORT' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:44: 'IMPORT'
                    {
                    match(input,25,FOLLOW_25_in_nsImport129); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:90: (ns= simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:91: ns= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nsImport137);
                    ns=simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:164: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:165: RG
                    {
                    match(input,RG,FOLLOW_RG_in_nsImport143); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:4: ( LG ) ( 'EXTENSION' ) (ns= simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_nsImport152); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:45: ( 'EXTENSION' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:46: 'EXTENSION'
                    {
                    match(input,26,FOLLOW_26_in_nsImport158); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:95: (ns= simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:96: ns= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nsImport166);
                    ns=simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:169: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:170: RG
                    {
                    match(input,RG,FOLLOW_RG_in_nsImport172); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:4: ( 'import' ) (unnamed0= type ) ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:4: ( 'import' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:5: 'import'
                    {
                    match(input,27,FOLLOW_27_in_nsImport181); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:51: (unnamed0= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:52: unnamed0= type
                    {
                    pushFollow(FOLLOW_type_in_nsImport189);
                    unnamed0=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed0); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:100: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:101: ';'
                    {
                    match(input,28,FOLLOW_28_in_nsImport195); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:4: ( 'extension' ) (unnamed1= type ) ( ( ( 'reexport' ) ) )? ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:4: ( 'extension' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:5: 'extension'
                    {
                    match(input,29,FOLLOW_29_in_nsImport204); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:54: (unnamed1= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:55: unnamed1= type
                    {
                    pushFollow(FOLLOW_type_in_nsImport212);
                    unnamed1=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed1); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:103: ( ( ( 'reexport' ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:104: ( ( 'reexport' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:104: ( ( 'reexport' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:105: ( 'reexport' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:105: ( 'reexport' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:106: 'reexport'
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:157: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:158: ';'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:1: abstractDeclaration returns [CompositeNode cn] : ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) );
    public CompositeNode abstractDeclaration() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode check1 = null;

        CompositeNode around2 = null;

        CompositeNode extension3 = null;

        CompositeNode definition4 = null;

        CompositeNode definitionAround5 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) )
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

                if ( (LA5_4==DEFINE) ) {
                    alt5=4;
                }
                else if ( (LA5_4==AROUND) ) {
                    alt5=5;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("43:1: abstractDeclaration returns [CompositeNode cn] : ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("43:1: abstractDeclaration returns [CompositeNode cn] : ( ( check ) | ( around ) | ( extension ) | ( definition ) | ( definitionAround ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( check )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( check )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:3: check
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( around )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( around )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:5: around
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:4: ( extension )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:4: ( extension )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:5: extension
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:4: ( definition )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:4: ( definition )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:5: definition
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:4: ( definitionAround )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:4: ( definitionAround )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:5: definitionAround
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:1: definition returns [CompositeNode cn] : ( LG ) ( DEFINE ) (name= identifier ) ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= type ) (unnamed4= sequence ) ( ENDDEFINE ) ( RG ) ;
    public CompositeNode definition() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode name = null;

        CompositeNode unnamed2 = null;

        CompositeNode unnamed3 = null;

        CompositeNode unnamed4 = null;


         cn = factory.createDefinitionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:2: ( ( LG ) ( DEFINE ) (name= identifier ) ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= type ) (unnamed4= sequence ) ( ENDDEFINE ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:2: ( LG ) ( DEFINE ) (name= identifier ) ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= type ) (unnamed4= sequence ) ( ENDDEFINE ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:3: LG
            {
            match(input,LG,FOLLOW_LG_in_definition306); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:43: ( DEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:44: DEFINE
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_definition312); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:88: (name= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:89: name= identifier
            {
            pushFollow(FOLLOW_identifier_in_definition320);
            name=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((DefinitionNode) cn).setName(name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:172: ( ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:173: ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:173: ( ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:174: ( '(' ) ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:174: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:175: '('
                    {
                    match(input,31,FOLLOW_31_in_definition328); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:216: ( ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Identifier||LA9_0==33||(LA9_0>=69 && LA9_0<=71)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:217: ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:217: ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("53:217: ( (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:218: (unnamed2= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:218: (unnamed2= declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:219: unnamed2= declaredParameterList
                                    {
                                    pushFollow(FOLLOW_declaredParameterList_in_definition338);
                                    unnamed2=declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed2); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:284: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt7=2;
                                    int LA7_0 = input.LA(1);

                                    if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                                        alt7=1;
                                    }
                                    switch (alt7) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:285: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:285: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:286: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:286: ( ',' )?
                                            int alt6=2;
                                            int LA6_0 = input.LA(1);

                                            if ( (LA6_0==32) ) {
                                                alt6=1;
                                            }
                                            switch (alt6) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:287: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_definition346); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:329: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:330: '*'
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:5: '*'
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:50: ')'
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_definition383); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:138: (unnamed3= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:139: unnamed3= type
            {
            pushFollow(FOLLOW_type_in_definition391);
            unnamed3=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed3); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:187: (unnamed4= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:188: unnamed4= sequence
            {
            pushFollow(FOLLOW_sequence_in_definition399);
            unnamed4=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed4); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:240: ( ENDDEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:241: ENDDEFINE
            {
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_definition405); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:288: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:289: RG
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:1: definitionAround returns [CompositeNode cn] : ( LG ) ( AROUND ) (unnamed5= pointcut ) ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= type ) (unnamed8= sequence ) ( ENDAROUND ) ( RG ) ;
    public CompositeNode definitionAround() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed5 = null;

        CompositeNode unnamed6 = null;

        CompositeNode unnamed7 = null;

        CompositeNode unnamed8 = null;


         cn = factory.createDefinitionAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:2: ( ( LG ) ( AROUND ) (unnamed5= pointcut ) ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= type ) (unnamed8= sequence ) ( ENDAROUND ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:2: ( LG ) ( AROUND ) (unnamed5= pointcut ) ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= type ) (unnamed8= sequence ) ( ENDAROUND ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:3: LG
            {
            match(input,LG,FOLLOW_LG_in_definitionAround434); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:43: ( AROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:44: AROUND
            {
            match(input,AROUND,FOLLOW_AROUND_in_definitionAround440); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:88: (unnamed5= pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:89: unnamed5= pointcut
            {
            pushFollow(FOLLOW_pointcut_in_definitionAround448);
            unnamed5=pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed5); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:141: ( ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:142: ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:142: ( ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:143: ( '(' ) ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:143: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:144: '('
                    {
                    match(input,31,FOLLOW_31_in_definitionAround456); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:185: ( ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Identifier||LA14_0==33||(LA14_0>=69 && LA14_0<=71)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:186: ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:186: ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("59:186: ( (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 13, 0, input);

                                throw nvae;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:187: (unnamed6= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:187: (unnamed6= declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:188: unnamed6= declaredParameterList
                                    {
                                    pushFollow(FOLLOW_declaredParameterList_in_definitionAround466);
                                    unnamed6=declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed6); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:253: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( ((LA12_0>=32 && LA12_0<=33)) ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:254: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:254: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:255: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:255: ( ',' )?
                                            int alt11=2;
                                            int LA11_0 = input.LA(1);

                                            if ( (LA11_0==32) ) {
                                                alt11=1;
                                            }
                                            switch (alt11) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:256: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_definitionAround474); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:298: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:299: '*'
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:5: '*'
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:50: ')'
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_definitionAround511); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:138: (unnamed7= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:139: unnamed7= type
            {
            pushFollow(FOLLOW_type_in_definitionAround519);
            unnamed7=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed7); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:187: (unnamed8= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:188: unnamed8= sequence
            {
            pushFollow(FOLLOW_sequence_in_definitionAround527);
            unnamed8=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed8); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:240: ( ENDAROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:241: ENDAROUND
            {
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_definitionAround533); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:288: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:289: RG
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:62:1: sequence returns [CompositeNode cn] : (unnamed9= textSequence ) ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )* ;
    public CompositeNode sequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed9 = null;

        CompositeNode unnamed10 = null;

        CompositeNode unnamed11 = null;


         cn = factory.createSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: ( (unnamed9= textSequence ) ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: (unnamed9= textSequence ) ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: (unnamed9= textSequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:3: unnamed9= textSequence
            {
            pushFollow(FOLLOW_textSequence_in_sequence564);
            unnamed9=textSequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed9); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:59: ( ( (unnamed10= statement ) (unnamed11= textSequence ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=StringLiteral && LA16_0<=Identifier)||LA16_0==31||(LA16_0>=36 && LA16_0<=39)||LA16_0==41||LA16_0==46||LA16_0==50||LA16_0==52||LA16_0==59||(LA16_0>=69 && LA16_0<=72)||(LA16_0>=78 && LA16_0<=79)||(LA16_0>=94 && LA16_0<=108)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:60: ( (unnamed10= statement ) (unnamed11= textSequence ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:60: ( (unnamed10= statement ) (unnamed11= textSequence ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:61: (unnamed10= statement ) (unnamed11= textSequence )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:61: (unnamed10= statement )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:62: unnamed10= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_sequence574);
            	    unnamed10=statement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed10); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:117: (unnamed11= textSequence )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:118: unnamed11= textSequence
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:1: statement returns [CompositeNode cn] : ( ( simpleStatement ) | ( fileStatement ) | ( foreachStatement ) | ( ifStatement ) | ( letStatement ) | ( protectStatement ) );
    public CompositeNode statement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode simpleStatement6 = null;

        CompositeNode fileStatement7 = null;

        CompositeNode foreachStatement8 = null;

        CompositeNode ifStatement9 = null;

        CompositeNode letStatement10 = null;

        CompositeNode protectStatement11 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:2: ( ( simpleStatement ) | ( fileStatement ) | ( foreachStatement ) | ( ifStatement ) | ( letStatement ) | ( protectStatement ) )
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
                    new NoViableAltException("67:1: statement returns [CompositeNode cn] : ( ( simpleStatement ) | ( fileStatement ) | ( foreachStatement ) | ( ifStatement ) | ( letStatement ) | ( protectStatement ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:2: ( simpleStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:2: ( simpleStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:3: simpleStatement
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:4: ( fileStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:4: ( fileStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:5: fileStatement
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:4: ( foreachStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:4: ( foreachStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:5: foreachStatement
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:4: ( ifStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:4: ( ifStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:5: ifStatement
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:4: ( letStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:4: ( letStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:5: letStatement
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:4: ( protectStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:4: ( protectStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:5: protectStatement
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:1: textSequence returns [CompositeNode cn] : (unnamed12= text ) ( ( (unnamed13= text ) ) )* ;
    public CompositeNode textSequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed12 = null;

        CompositeNode unnamed13 = null;


         cn = factory.createTextSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: ( (unnamed12= text ) ( ( (unnamed13= text ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: (unnamed12= text ) ( ( (unnamed13= text ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: (unnamed12= text )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:3: unnamed12= text
            {
            pushFollow(FOLLOW_text_in_textSequence678);
            unnamed12=text();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed12); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:53: ( ( (unnamed13= text ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:54: ( (unnamed13= text ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:54: ( (unnamed13= text ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:55: (unnamed13= text )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:55: (unnamed13= text )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:56: unnamed13= text
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:81:1: text returns [CompositeNode cn] : ( '-' )? ( TEXT ) ;
    public CompositeNode text() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createTextNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:2: ( ( '-' )? ( TEXT ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:2: ( '-' )? ( TEXT )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:3: '-'
                    {
                    match(input,36,FOLLOW_36_in_text714); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:45: ( TEXT )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:46: TEXT
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:1: simpleStatement returns [CompositeNode cn] : ( ( errorStatement ) | ( expandStatement ) | ( expressionStmt ) );
    public CompositeNode simpleStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode errorStatement12 = null;

        CompositeNode expandStatement13 = null;

        CompositeNode expressionStmt14 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:2: ( ( errorStatement ) | ( expandStatement ) | ( expressionStmt ) )
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
                    new NoViableAltException("86:1: simpleStatement returns [CompositeNode cn] : ( ( errorStatement ) | ( expandStatement ) | ( expressionStmt ) );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:2: ( errorStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:2: ( errorStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:3: errorStatement
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( expandStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( expandStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:5: expandStatement
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:4: ( expressionStmt )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:4: ( expressionStmt )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:5: expressionStmt
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:1: errorStatement returns [CompositeNode cn] : ( 'ERROR' ) (unnamed14= expression ) ;
    public CompositeNode errorStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed14 = null;


         cn = factory.createErrorStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:2: ( ( 'ERROR' ) (unnamed14= expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:2: ( 'ERROR' ) (unnamed14= expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:2: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:3: 'ERROR'
            {
            match(input,37,FOLLOW_37_in_errorStatement780); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:48: (unnamed14= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:49: unnamed14= expression
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:1: expandStatement returns [CompositeNode cn] : ( 'EXPAND' ) (unnamed15= simpleType ) ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )? ;
    public CompositeNode expandStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed15 = null;

        CompositeNode unnamed16 = null;

        CompositeNode unnamed17 = null;

        CompositeNode unnamed18 = null;

        CompositeNode unnamed19 = null;


         cn = factory.createExpandStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( ( 'EXPAND' ) (unnamed15= simpleType ) ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( 'EXPAND' ) (unnamed15= simpleType ) ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:3: 'EXPAND'
            {
            match(input,38,FOLLOW_38_in_expandStatement811); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:49: (unnamed15= simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:50: unnamed15= simpleType
            {
            pushFollow(FOLLOW_simpleType_in_expandStatement819);
            unnamed15=simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed15); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:106: ( ( ( '(' ) (unnamed16= parameterList ) ( ')' ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:107: ( ( '(' ) (unnamed16= parameterList ) ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:107: ( ( '(' ) (unnamed16= parameterList ) ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:108: ( '(' ) (unnamed16= parameterList ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:108: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:109: '('
                    {
                    match(input,31,FOLLOW_31_in_expandStatement827); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:150: (unnamed16= parameterList )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:151: unnamed16= parameterList
                    {
                    pushFollow(FOLLOW_parameterList_in_expandStatement835);
                    unnamed16=parameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed16); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:210: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:211: ')'
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:255: ( ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35||LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:256: ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:256: ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) )
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
                            new NoViableAltException("99:256: ( ( ( ( 'FOR' ) (unnamed17= expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:257: ( ( ( 'FOR' ) (unnamed17= expression ) ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:257: ( ( ( 'FOR' ) (unnamed17= expression ) ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:258: ( ( 'FOR' ) (unnamed17= expression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:258: ( ( 'FOR' ) (unnamed17= expression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:259: ( 'FOR' ) (unnamed17= expression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:259: ( 'FOR' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:260: 'FOR'
                            {
                            match(input,35,FOLLOW_35_in_expandStatement854); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:303: (unnamed17= expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:304: unnamed17= expression
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:4: ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:4: ( ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:5: ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:5: ( ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )? )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:6: ( 'FOREACH' ) (unnamed18= expression ) ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:6: ( 'FOREACH' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:7: 'FOREACH'
                            {
                            match(input,39,FOLLOW_39_in_expandStatement875); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:54: (unnamed18= expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:55: unnamed18= expression
                            {
                            pushFollow(FOLLOW_expression_in_expandStatement883);
                            unnamed18=expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed18); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:111: ( ( ( 'SEPARATOR' ) (unnamed19= expression ) ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==40) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:112: ( ( 'SEPARATOR' ) (unnamed19= expression ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:112: ( ( 'SEPARATOR' ) (unnamed19= expression ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:113: ( 'SEPARATOR' ) (unnamed19= expression )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:113: ( 'SEPARATOR' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:114: 'SEPARATOR'
                                    {
                                    match(input,40,FOLLOW_40_in_expandStatement891); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:163: (unnamed19= expression )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:164: unnamed19= expression
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:1: expressionStmt returns [CompositeNode cn] : (unnamed20= expression ) ;
    public CompositeNode expressionStmt() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed20 = null;


         cn = factory.createExpressionStmtNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: ( (unnamed20= expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: (unnamed20= expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: (unnamed20= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:3: unnamed20= expression
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:1: fileStatement returns [CompositeNode cn] : ( 'FILE' ) (unnamed21= expression ) ( ( (unnamed22= identifier ) ) )? (unnamed23= sequence ) ( 'ENDFILE' ) ;
    public CompositeNode fileStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed21 = null;

        CompositeNode unnamed22 = null;

        CompositeNode unnamed23 = null;


         cn = factory.createFileStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( ( 'FILE' ) (unnamed21= expression ) ( ( (unnamed22= identifier ) ) )? (unnamed23= sequence ) ( 'ENDFILE' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( 'FILE' ) (unnamed21= expression ) ( ( (unnamed22= identifier ) ) )? (unnamed23= sequence ) ( 'ENDFILE' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:3: 'FILE'
            {
            match(input,41,FOLLOW_41_in_fileStatement955); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:47: (unnamed21= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:48: unnamed21= expression
            {
            pushFollow(FOLLOW_expression_in_fileStatement963);
            unnamed21=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed21); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:104: ( ( (unnamed22= identifier ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Identifier) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:105: ( (unnamed22= identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:105: ( (unnamed22= identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:106: (unnamed22= identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:106: (unnamed22= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:107: unnamed22= identifier
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:166: (unnamed23= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:167: unnamed23= sequence
            {
            pushFollow(FOLLOW_sequence_in_fileStatement984);
            unnamed23=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed23); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:221: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:222: 'ENDFILE'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:112:1: foreachStatement returns [CompositeNode cn] : ( 'FOREACH' ) (unnamed24= expression ) ( 'AS' ) (unnamed25= identifier ) ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )? (unnamed28= sequence ) ( 'ENDFOREACH' ) ;
    public CompositeNode foreachStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed24 = null;

        CompositeNode unnamed25 = null;

        CompositeNode unnamed26 = null;

        CompositeNode unnamed27 = null;

        CompositeNode unnamed28 = null;


         cn = factory.createForeachStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( ( 'FOREACH' ) (unnamed24= expression ) ( 'AS' ) (unnamed25= identifier ) ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )? (unnamed28= sequence ) ( 'ENDFOREACH' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( 'FOREACH' ) (unnamed24= expression ) ( 'AS' ) (unnamed25= identifier ) ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )? (unnamed28= sequence ) ( 'ENDFOREACH' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:3: 'FOREACH'
            {
            match(input,39,FOLLOW_39_in_foreachStatement1013); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:50: (unnamed24= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:51: unnamed24= expression
            {
            pushFollow(FOLLOW_expression_in_foreachStatement1021);
            unnamed24=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed24); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:107: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:108: 'AS'
            {
            match(input,43,FOLLOW_43_in_foreachStatement1027); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:150: (unnamed25= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:151: unnamed25= identifier
            {
            pushFollow(FOLLOW_identifier_in_foreachStatement1035);
            unnamed25=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed25); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:207: ( ( ( 'ITERATOR' ) (unnamed26= identifier ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:208: ( ( 'ITERATOR' ) (unnamed26= identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:208: ( ( 'ITERATOR' ) (unnamed26= identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:209: ( 'ITERATOR' ) (unnamed26= identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:209: ( 'ITERATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:210: 'ITERATOR'
                    {
                    match(input,44,FOLLOW_44_in_foreachStatement1043); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:258: (unnamed26= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:259: unnamed26= identifier
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:318: ( ( ( 'SEPARATOR' ) (unnamed27= expression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:319: ( ( 'SEPARATOR' ) (unnamed27= expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:319: ( ( 'SEPARATOR' ) (unnamed27= expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:320: ( 'SEPARATOR' ) (unnamed27= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:320: ( 'SEPARATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:321: 'SEPARATOR'
                    {
                    match(input,40,FOLLOW_40_in_foreachStatement1062); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:370: (unnamed27= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:371: unnamed27= expression
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:430: (unnamed28= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:431: unnamed28= sequence
            {
            pushFollow(FOLLOW_sequence_in_foreachStatement1081);
            unnamed28=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed28); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:485: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:486: 'ENDFOREACH'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:1: ifStatement returns [CompositeNode cn] : ( 'IF' ) (unnamed29= expression ) (unnamed30= sequence ) (unnamed31= elseIfStatement )* (unnamed32= elseStatement )? ( 'ENDIF' ) ;
    public CompositeNode ifStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed29 = null;

        CompositeNode unnamed30 = null;

        CompositeNode unnamed31 = null;

        CompositeNode unnamed32 = null;


         cn = factory.createIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( ( 'IF' ) (unnamed29= expression ) (unnamed30= sequence ) (unnamed31= elseIfStatement )* (unnamed32= elseStatement )? ( 'ENDIF' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( 'IF' ) (unnamed29= expression ) (unnamed30= sequence ) (unnamed31= elseIfStatement )* (unnamed32= elseStatement )? ( 'ENDIF' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:3: 'IF'
            {
            match(input,46,FOLLOW_46_in_ifStatement1110); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:45: (unnamed29= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:46: unnamed29= expression
            {
            pushFollow(FOLLOW_expression_in_ifStatement1118);
            unnamed29=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed29); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:102: (unnamed30= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:103: unnamed30= sequence
            {
            pushFollow(FOLLOW_sequence_in_ifStatement1126);
            unnamed30=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed30); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:157: (unnamed31= elseIfStatement )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:158: unnamed31= elseIfStatement
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:220: (unnamed32= elseStatement )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:221: unnamed32= elseStatement
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:281: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:282: 'ENDIF'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:122:1: elseIfStatement returns [CompositeNode cn] : ( 'ELSEIF' ) (unnamed33= expression ) (unnamed34= sequence ) ;
    public CompositeNode elseIfStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed33 = null;

        CompositeNode unnamed34 = null;


         cn = factory.createElseIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:2: ( ( 'ELSEIF' ) (unnamed33= expression ) (unnamed34= sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:2: ( 'ELSEIF' ) (unnamed33= expression ) (unnamed34= sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:2: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:3: 'ELSEIF'
            {
            match(input,48,FOLLOW_48_in_elseIfStatement1173); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:49: (unnamed33= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:50: unnamed33= expression
            {
            pushFollow(FOLLOW_expression_in_elseIfStatement1181);
            unnamed33=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed33); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:106: (unnamed34= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:107: unnamed34= sequence
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:1: elseStatement returns [CompositeNode cn] : ( 'ELSE' ) (unnamed35= sequence ) ;
    public CompositeNode elseStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed35 = null;


         cn = factory.createElseStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:2: ( ( 'ELSE' ) (unnamed35= sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:2: ( 'ELSE' ) (unnamed35= sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:2: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:3: 'ELSE'
            {
            match(input,49,FOLLOW_49_in_elseStatement1212); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:47: (unnamed35= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:48: unnamed35= sequence
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:1: letStatement returns [CompositeNode cn] : ( 'LET' ) (unnamed36= expression ) ( 'AS' ) (unnamed37= identifier ) (unnamed38= sequence ) ( 'ENDLET' ) ;
    public CompositeNode letStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed36 = null;

        CompositeNode unnamed37 = null;

        CompositeNode unnamed38 = null;


         cn = factory.createLetStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( ( 'LET' ) (unnamed36= expression ) ( 'AS' ) (unnamed37= identifier ) (unnamed38= sequence ) ( 'ENDLET' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( 'LET' ) (unnamed36= expression ) ( 'AS' ) (unnamed37= identifier ) (unnamed38= sequence ) ( 'ENDLET' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:3: 'LET'
            {
            match(input,50,FOLLOW_50_in_letStatement1243); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:46: (unnamed36= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:47: unnamed36= expression
            {
            pushFollow(FOLLOW_expression_in_letStatement1251);
            unnamed36=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed36); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:103: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:104: 'AS'
            {
            match(input,43,FOLLOW_43_in_letStatement1257); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:146: (unnamed37= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:147: unnamed37= identifier
            {
            pushFollow(FOLLOW_identifier_in_letStatement1265);
            unnamed37=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed37); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:203: (unnamed38= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:204: unnamed38= sequence
            {
            pushFollow(FOLLOW_sequence_in_letStatement1273);
            unnamed38=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed38); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:258: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:259: 'ENDLET'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:1: protectStatement returns [CompositeNode cn] : ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= expression ) ( 'CEND' ) (unnamed40= expression ) ( 'ID' ) (unnamed41= expression ) ( 'DISABLE' )? (unnamed42= sequence ) ( 'ENDPROTECT' ) ;
    public CompositeNode protectStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed39 = null;

        CompositeNode unnamed40 = null;

        CompositeNode unnamed41 = null;

        CompositeNode unnamed42 = null;


         cn = factory.createProtectStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:2: ( ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= expression ) ( 'CEND' ) (unnamed40= expression ) ( 'ID' ) (unnamed41= expression ) ( 'DISABLE' )? (unnamed42= sequence ) ( 'ENDPROTECT' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:2: ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= expression ) ( 'CEND' ) (unnamed40= expression ) ( 'ID' ) (unnamed41= expression ) ( 'DISABLE' )? (unnamed42= sequence ) ( 'ENDPROTECT' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:2: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:3: 'PROTECT'
            {
            match(input,52,FOLLOW_52_in_protectStatement1302); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:50: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:51: 'CSTART'
            {
            match(input,53,FOLLOW_53_in_protectStatement1308); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:97: (unnamed39= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:98: unnamed39= expression
            {
            pushFollow(FOLLOW_expression_in_protectStatement1316);
            unnamed39=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed39); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:154: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:155: 'CEND'
            {
            match(input,54,FOLLOW_54_in_protectStatement1322); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:199: (unnamed40= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:200: unnamed40= expression
            {
            pushFollow(FOLLOW_expression_in_protectStatement1330);
            unnamed40=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed40); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:256: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:257: 'ID'
            {
            match(input,55,FOLLOW_55_in_protectStatement1336); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:299: (unnamed41= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:300: unnamed41= expression
            {
            pushFollow(FOLLOW_expression_in_protectStatement1344);
            unnamed41=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed41); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:356: ( 'DISABLE' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:357: 'DISABLE'
                    {
                    match(input,56,FOLLOW_56_in_protectStatement1350); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:405: (unnamed42= sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:406: unnamed42= sequence
            {
            pushFollow(FOLLOW_sequence_in_protectStatement1359);
            unnamed42=sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed42); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:460: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:461: 'ENDPROTECT'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:142:1: check returns [CompositeNode cn] : ( 'context' ) (unnamed43= type ) ( ( ( 'if' ) (unnamed44= expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= expression ) ( ':' ) (unnamed46= expression ) ( ';' ) ;
    public CompositeNode check() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed43 = null;

        CompositeNode unnamed44 = null;

        CompositeNode unnamed45 = null;

        CompositeNode unnamed46 = null;


         cn = factory.createCheckNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( ( 'context' ) (unnamed43= type ) ( ( ( 'if' ) (unnamed44= expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= expression ) ( ':' ) (unnamed46= expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( 'context' ) (unnamed43= type ) ( ( ( 'if' ) (unnamed44= expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= expression ) ( ':' ) (unnamed46= expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:3: 'context'
            {
            match(input,58,FOLLOW_58_in_check1388); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:50: (unnamed43= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:51: unnamed43= type
            {
            pushFollow(FOLLOW_type_in_check1396);
            unnamed43=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed43); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:101: ( ( ( 'if' ) (unnamed44= expression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==59) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:102: ( ( 'if' ) (unnamed44= expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:102: ( ( 'if' ) (unnamed44= expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:103: ( 'if' ) (unnamed44= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:103: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:104: 'if'
                    {
                    match(input,59,FOLLOW_59_in_check1404); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:146: (unnamed44= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:147: unnamed44= expression
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:206: ( ( ( 'ERROR' ) | ( 'WARNING' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:207: ( ( 'ERROR' ) | ( 'WARNING' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:207: ( ( 'ERROR' ) | ( 'WARNING' ) )
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
                    new NoViableAltException("145:207: ( ( 'ERROR' ) | ( 'WARNING' ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:208: ( 'ERROR' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:208: ( 'ERROR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:209: 'ERROR'
                    {
                    match(input,37,FOLLOW_37_in_check1423); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:4: ( 'WARNING' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:4: ( 'WARNING' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:5: 'WARNING'
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:54: (unnamed45= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:55: unnamed45= expression
            {
            pushFollow(FOLLOW_expression_in_check1442);
            unnamed45=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed45); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:111: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:112: ':'
            {
            match(input,61,FOLLOW_61_in_check1448); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:153: (unnamed46= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:154: unnamed46= expression
            {
            pushFollow(FOLLOW_expression_in_check1456);
            unnamed46=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed46); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:210: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:211: ';'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:148:1: around returns [CompositeNode cn] : ( 'around' ) (unnamed47= pointcut ) ( '(' ) ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= expression ) ( ';' ) ;
    public CompositeNode around() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed47 = null;

        CompositeNode unnamed48 = null;

        CompositeNode unnamed49 = null;


         cn = factory.createAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( ( 'around' ) (unnamed47= pointcut ) ( '(' ) ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( 'around' ) (unnamed47= pointcut ) ( '(' ) ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:3: 'around'
            {
            match(input,62,FOLLOW_62_in_around1485); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:49: (unnamed47= pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:50: unnamed47= pointcut
            {
            pushFollow(FOLLOW_pointcut_in_around1493);
            unnamed47=pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed47); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:104: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:105: '('
            {
            match(input,31,FOLLOW_31_in_around1499); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:146: ( ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier||LA36_0==33||(LA36_0>=69 && LA36_0<=71)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:147: ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:147: ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                            new NoViableAltException("151:147: ( (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:148: (unnamed48= declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:148: (unnamed48= declaredParameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:149: unnamed48= declaredParameterList
                            {
                            pushFollow(FOLLOW_declaredParameterList_in_around1509);
                            unnamed48=declaredParameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed48); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:216: ( ( ( ',' )? ( '*' ) ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=32 && LA34_0<=33)) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:217: ( ( ',' )? ( '*' ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:217: ( ( ',' )? ( '*' ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:218: ( ',' )? ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:218: ( ',' )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==32) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:219: ','
                                            {
                                            match(input,32,FOLLOW_32_in_around1517); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }
                                            break;

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:261: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:262: '*'
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:4: ( '*' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:4: ( '*' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:5: '*'
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:49: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:50: ')'
            {
            match(input,34,FOLLOW_34_in_around1545); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:91: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:92: ':'
            {
            match(input,61,FOLLOW_61_in_around1551); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:133: (unnamed49= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:134: unnamed49= expression
            {
            pushFollow(FOLLOW_expression_in_around1559);
            unnamed49=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed49); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:190: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:191: ';'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:154:1: pointcut returns [CompositeNode cn] : ( ( ( '*' ) | (unnamed50= identifier ) ) ) ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )* ;
    public CompositeNode pointcut() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed50 = null;

        CompositeNode unnamed51 = null;


         cn = factory.createPointcutNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( ( ( ( '*' ) | (unnamed50= identifier ) ) ) ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( ( ( '*' ) | (unnamed50= identifier ) ) ) ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( ( ( '*' ) | (unnamed50= identifier ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:3: ( ( '*' ) | (unnamed50= identifier ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:3: ( ( '*' ) | (unnamed50= identifier ) )
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
                    new NoViableAltException("157:3: ( ( '*' ) | (unnamed50= identifier ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:4: ( '*' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:4: ( '*' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:5: '*'
                    {
                    match(input,33,FOLLOW_33_in_pointcut1590); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:4: (unnamed50= identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:4: (unnamed50= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:5: unnamed50= identifier
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:63: ( ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Identifier||LA39_0==33||LA39_0==63) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:64: ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:64: ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) )
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
            	            new NoViableAltException("158:64: ( ( '*' ) | (unnamed51= identifier ) | ( '::' ) )", 38, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:65: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:65: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:66: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_pointcut1611); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:4: (unnamed51= identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:4: (unnamed51= identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:5: unnamed51= identifier
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
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:160:4: ( '::' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:160:4: ( '::' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:160:5: '::'
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:1: extension returns [CompositeNode cn] : ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= type )? (name= identifier ) ( '(' ) (paramList= declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' ) | (extendBody= expression ) ) ) ( ';' ) ;
    public CompositeNode extension() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode returnType = null;

        CompositeNode name = null;

        CompositeNode paramList = null;

        CompositeNode javaReturnType = null;

        CompositeNode javaName = null;

        CompositeNode unnamed52 = null;

        CompositeNode unnamed53 = null;

        CompositeNode extendBody = null;


         cn = factory.createExtensionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= type )? (name= identifier ) ( '(' ) (paramList= declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' ) | (extendBody= expression ) ) ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= type )? (name= identifier ) ( '(' ) (paramList= declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' ) | (extendBody= expression ) ) ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=64 && LA41_0<=66)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
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
            	            new NoViableAltException("165:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:4: ( 'private' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:4: ( 'private' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:5: 'private'
            	            {
            	            match(input,64,FOLLOW_64_in_extension1659); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "private"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:4: ( 'cached' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:4: ( 'cached' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:5: 'cached'
            	            {
            	            match(input,65,FOLLOW_65_in_extension1668); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "cached"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:4: ( 'create' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:4: ( 'create' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:5: 'create'
            	            {
            	            match(input,66,FOLLOW_66_in_extension1677); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "create"); 
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:58: (returnType= type )?
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:59: returnType= type
                    {
                    pushFollow(FOLLOW_type_in_extension1688);
                    returnType=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, returnType); ((ExtensionNode) cn).setReturnType(returnType); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:160: (name= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:161: name= identifier
            {
            pushFollow(FOLLOW_identifier_in_extension1697);
            name=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((ExtensionNode) cn).setName(name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:243: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:244: '('
            {
            match(input,31,FOLLOW_31_in_extension1703); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:285: (paramList= declaredParameterList )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Identifier||(LA43_0>=69 && LA43_0<=71)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:286: paramList= declaredParameterList
                    {
                    pushFollow(FOLLOW_declaredParameterList_in_extension1711);
                    paramList=declaredParameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, paramList); ((ExtensionNode) cn).setParamList(paramList); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:400: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:401: ')'
            {
            match(input,34,FOLLOW_34_in_extension1718); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:442: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:443: ':'
            {
            match(input,61,FOLLOW_61_in_extension1724); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:484: ( ( ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' ) | (extendBody= expression ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:485: ( ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' ) | (extendBody= expression ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:485: ( ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' ) | (extendBody= expression ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==67) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=StringLiteral && LA46_0<=Identifier)||LA46_0==31||LA46_0==36||LA46_0==59||(LA46_0>=69 && LA46_0<=72)||(LA46_0>=78 && LA46_0<=79)||(LA46_0>=94 && LA46_0<=108)) ) {
                alt46=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("167:485: ( ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' ) | (extendBody= expression ) )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:486: ( 'JAVA' ) (javaReturnType= javaType ) ( '.' ) (javaName= identifier ) ( '(' ) ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:486: ( 'JAVA' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:487: 'JAVA'
                    {
                    match(input,67,FOLLOW_67_in_extension1732); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:531: (javaReturnType= javaType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:532: javaReturnType= javaType
                    {
                    pushFollow(FOLLOW_javaType_in_extension1740);
                    javaReturnType=javaType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, javaReturnType); ((ExtensionNode) cn).setJavaReturnType(javaReturnType); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:652: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:653: '.'
                    {
                    match(input,68,FOLLOW_68_in_extension1746); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:694: (javaName= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:695: javaName= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_extension1754);
                    javaName=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, javaName); ((ExtensionNode) cn).setJavaName(javaName); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:793: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:794: '('
                    {
                    match(input,31,FOLLOW_31_in_extension1760); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:835: ( ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==Identifier) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:836: ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:836: ( (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )* )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:837: (unnamed52= javaType ) ( ( ( ',' ) (unnamed53= javaType ) ) )*
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:837: (unnamed52= javaType )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:838: unnamed52= javaType
                            {
                            pushFollow(FOLLOW_javaType_in_extension1770);
                            unnamed52=javaType();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed52); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:892: ( ( ( ',' ) (unnamed53= javaType ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==32) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:893: ( ( ',' ) (unnamed53= javaType ) )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:893: ( ( ',' ) (unnamed53= javaType ) )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:894: ( ',' ) (unnamed53= javaType )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:894: ( ',' )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:895: ','
                            	    {
                            	    match(input,32,FOLLOW_32_in_extension1778); if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addLeafNodeForToken(cn, null); 
                            	    }

                            	    }

                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:936: (unnamed53= javaType )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:937: unnamed53= javaType
                            	    {
                            	    pushFollow(FOLLOW_javaType_in_extension1786);
                            	    unnamed53=javaType();
                            	    _fsp--;
                            	    if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addToChildren(cn, unnamed53); 
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:997: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:998: ')'
                    {
                    match(input,34,FOLLOW_34_in_extension1798); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:4: (extendBody= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:4: (extendBody= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:5: extendBody= expression
                    {
                    pushFollow(FOLLOW_expression_in_extension1809);
                    extendBody=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, extendBody); ((ExtensionNode) cn).setExtendBody(extendBody); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:113: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:114: ';'
            {
            match(input,28,FOLLOW_28_in_extension1817); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:170:1: javaType returns [CompositeNode cn] : (unnamed54= identifier ) ( ( ( '.' ) ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* ;
    public CompositeNode javaType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed54 = null;

        CompositeNode unnamed55 = null;


         cn = factory.createJavaTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:2: ( (unnamed54= identifier ) ( ( ( '.' ) ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:2: (unnamed54= identifier ) ( ( ( '.' ) ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:2: (unnamed54= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:3: unnamed54= identifier
            {
            pushFollow(FOLLOW_identifier_in_javaType1842);
            unnamed54=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed54); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:59: ( ( ( '.' ) ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==68) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==Identifier) ) {
                        int LA48_3 = input.LA(3);

                        if ( (LA48_3==32||LA48_3==34||LA48_3==68) ) {
                            alt48=1;
                        }


                    }
                    else if ( ((LA48_1>=69 && LA48_1<=71)) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:60: ( ( '.' ) ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:60: ( ( '.' ) ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:61: ( '.' ) ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:61: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:62: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_javaType1850); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:103: ( ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:104: ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:104: ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    int alt47=4;
            	    switch ( input.LA(1) ) {
            	    case Identifier:
            	        {
            	        alt47=1;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt47=2;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt47=3;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt47=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("173:104: ( (unnamed55= identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 47, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt47) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:105: (unnamed55= identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:105: (unnamed55= identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:106: unnamed55= identifier
            	            {
            	            pushFollow(FOLLOW_identifier_in_javaType1860);
            	            unnamed55=identifier();
            	            _fsp--;
            	            if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addToChildren(cn, unnamed55); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:4: ( 'Collection' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:4: ( 'Collection' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:5: 'Collection'
            	            {
            	            match(input,69,FOLLOW_69_in_javaType1869); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:4: ( 'List' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:4: ( 'List' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:5: 'List'
            	            {
            	            match(input,70,FOLLOW_70_in_javaType1878); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:4: ( 'Set' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:4: ( 'Set' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:5: 'Set'
            	            {
            	            match(input,71,FOLLOW_71_in_javaType1887); if (failed) return cn;
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
            	    break loop48;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:178:1: test_expression returns [CompositeNode cn] : (unnamed56= expression ) ( EOF ) ;
    public CompositeNode test_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed56 = null;


         cn = factory.createTest_expressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: ( (unnamed56= expression ) ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: (unnamed56= expression ) ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: (unnamed56= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:3: unnamed56= expression
            {
            pushFollow(FOLLOW_expression_in_test_expression1922);
            unnamed56=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed56); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:59: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:60: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_test_expression1928); if (failed) return cn;

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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:184:1: expression returns [CompositeNode cn] : (unnamed57= letExpression ) ;
    public CompositeNode expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed57 = null;


         cn = factory.createExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( (unnamed57= letExpression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: (unnamed57= letExpression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: (unnamed57= letExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:3: unnamed57= letExpression
            {
            pushFollow(FOLLOW_letExpression_in_expression1956);
            unnamed57=letExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed57); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:1: letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed58= identifier ) ( '=' ) (unnamed59= castedExpression ) ( ':' ) (unnamed60= expression ) | (unnamed61= castedExpression ) );
    public CompositeNode letExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed58 = null;

        CompositeNode unnamed59 = null;

        CompositeNode unnamed60 = null;

        CompositeNode unnamed61 = null;


         cn = factory.createLetExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:2: ( ( 'let' ) (unnamed58= identifier ) ( '=' ) (unnamed59= castedExpression ) ( ':' ) (unnamed60= expression ) | (unnamed61= castedExpression ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=StringLiteral && LA49_0<=Identifier)||LA49_0==31||LA49_0==36||LA49_0==59||(LA49_0>=69 && LA49_0<=71)||(LA49_0>=78 && LA49_0<=79)||(LA49_0>=94 && LA49_0<=108)) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("190:1: letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed58= identifier ) ( '=' ) (unnamed59= castedExpression ) ( ':' ) (unnamed60= expression ) | (unnamed61= castedExpression ) );", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:2: ( 'let' ) (unnamed58= identifier ) ( '=' ) (unnamed59= castedExpression ) ( ':' ) (unnamed60= expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:2: ( 'let' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:3: 'let'
                    {
                    match(input,72,FOLLOW_72_in_letExpression1984); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:46: (unnamed58= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:47: unnamed58= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_letExpression1992);
                    unnamed58=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed58); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:103: ( '=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:104: '='
                    {
                    match(input,73,FOLLOW_73_in_letExpression1998); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:145: (unnamed59= castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:146: unnamed59= castedExpression
                    {
                    pushFollow(FOLLOW_castedExpression_in_letExpression2006);
                    unnamed59=castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed59); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:208: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:209: ':'
                    {
                    match(input,61,FOLLOW_61_in_letExpression2012); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:250: (unnamed60= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:251: unnamed60= expression
                    {
                    pushFollow(FOLLOW_expression_in_letExpression2020);
                    unnamed60=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed60); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:4: (unnamed61= castedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:4: (unnamed61= castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:5: unnamed61= castedExpression
                    {
                    pushFollow(FOLLOW_castedExpression_in_letExpression2031);
                    unnamed61=castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed61); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:1: castedExpression returns [CompositeNode cn] : ( ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed62= type ) ( ')' ) (unnamed63= chainExpression ) ) | (unnamed64= chainExpression ) );
    public CompositeNode castedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed62 = null;

        CompositeNode unnamed63 = null;

        CompositeNode unnamed64 = null;


         cn = factory.createCastedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:2: ( ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed62= type ) ( ')' ) (unnamed63= chainExpression ) ) | (unnamed64= chainExpression ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:2: ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed62= type ) ( ')' ) (unnamed63= chainExpression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:34: ( ( '(' ) (unnamed62= type ) ( ')' ) (unnamed63= chainExpression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:35: ( '(' ) (unnamed62= type ) ( ')' ) (unnamed63= chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:35: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:36: '('
                    {
                    match(input,31,FOLLOW_31_in_castedExpression2070); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:77: (unnamed62= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:78: unnamed62= type
                    {
                    pushFollow(FOLLOW_type_in_castedExpression2078);
                    unnamed62=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed62); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:128: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:129: ')'
                    {
                    match(input,34,FOLLOW_34_in_castedExpression2084); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:170: (unnamed63= chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:171: unnamed63= chainExpression
                    {
                    pushFollow(FOLLOW_chainExpression_in_castedExpression2092);
                    unnamed63=chainExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed63); 
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:4: (unnamed64= chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:4: (unnamed64= chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:5: unnamed64= chainExpression
                    {
                    pushFollow(FOLLOW_chainExpression_in_castedExpression2104);
                    unnamed64=chainExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed64); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:204:1: chainExpression returns [CompositeNode cn] : (unnamed65= ifExpression ) ( ( ( '->' ) (unnamed66= ifExpression ) ) )* ;
    public CompositeNode chainExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed65 = null;

        CompositeNode unnamed66 = null;


         cn = factory.createChainExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:2: ( (unnamed65= ifExpression ) ( ( ( '->' ) (unnamed66= ifExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:2: (unnamed65= ifExpression ) ( ( ( '->' ) (unnamed66= ifExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:2: (unnamed65= ifExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:3: unnamed65= ifExpression
            {
            pushFollow(FOLLOW_ifExpression_in_chainExpression2134);
            unnamed65=ifExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed65); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:61: ( ( ( '->' ) (unnamed66= ifExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==74) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:62: ( ( '->' ) (unnamed66= ifExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:62: ( ( '->' ) (unnamed66= ifExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:63: ( '->' ) (unnamed66= ifExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:63: ( '->' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:64: '->'
            	    {
            	    match(input,74,FOLLOW_74_in_chainExpression2142); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:106: (unnamed66= ifExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:107: unnamed66= ifExpression
            	    {
            	    pushFollow(FOLLOW_ifExpression_in_chainExpression2150);
            	    unnamed66=ifExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed66); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:210:1: ifExpression returns [CompositeNode cn] : ( (unnamed67= switchExpression ) ( ( ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression ) ) )? | ( 'if' ) (unnamed70= expression ) ( 'then' ) (unnamed71= switchExpression ) ( ( ( 'else' ) (unnamed72= switchExpression ) ) )? );
    public CompositeNode ifExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed67 = null;

        CompositeNode unnamed68 = null;

        CompositeNode unnamed69 = null;

        CompositeNode unnamed70 = null;

        CompositeNode unnamed71 = null;

        CompositeNode unnamed72 = null;


         cn = factory.createIfExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: ( (unnamed67= switchExpression ) ( ( ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression ) ) )? | ( 'if' ) (unnamed70= expression ) ( 'then' ) (unnamed71= switchExpression ) ( ( ( 'else' ) (unnamed72= switchExpression ) ) )? )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=StringLiteral && LA54_0<=Identifier)||LA54_0==31||LA54_0==36||(LA54_0>=69 && LA54_0<=71)||(LA54_0>=78 && LA54_0<=79)||(LA54_0>=94 && LA54_0<=108)) ) {
                alt54=1;
            }
            else if ( (LA54_0==59) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("210:1: ifExpression returns [CompositeNode cn] : ( (unnamed67= switchExpression ) ( ( ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression ) ) )? | ( 'if' ) (unnamed70= expression ) ( 'then' ) (unnamed71= switchExpression ) ( ( ( 'else' ) (unnamed72= switchExpression ) ) )? );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: (unnamed67= switchExpression ) ( ( ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: (unnamed67= switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:3: unnamed67= switchExpression
                    {
                    pushFollow(FOLLOW_switchExpression_in_ifExpression2183);
                    unnamed67=switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed67); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:65: ( ( ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression ) ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==75) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:66: ( ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:66: ( ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:67: ( '?' ) (unnamed68= expression ) ( ':' ) (unnamed69= switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:67: ( '?' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:68: '?'
                            {
                            match(input,75,FOLLOW_75_in_ifExpression2191); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:109: (unnamed68= expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:110: unnamed68= expression
                            {
                            pushFollow(FOLLOW_expression_in_ifExpression2199);
                            unnamed68=expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed68); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:166: ( ':' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:167: ':'
                            {
                            match(input,61,FOLLOW_61_in_ifExpression2205); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:208: (unnamed69= switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:209: unnamed69= switchExpression
                            {
                            pushFollow(FOLLOW_switchExpression_in_ifExpression2213);
                            unnamed69=switchExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed69); 
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:4: ( 'if' ) (unnamed70= expression ) ( 'then' ) (unnamed71= switchExpression ) ( ( ( 'else' ) (unnamed72= switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:4: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:5: 'if'
                    {
                    match(input,59,FOLLOW_59_in_ifExpression2225); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:47: (unnamed70= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:48: unnamed70= expression
                    {
                    pushFollow(FOLLOW_expression_in_ifExpression2233);
                    unnamed70=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed70); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:104: ( 'then' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:105: 'then'
                    {
                    match(input,76,FOLLOW_76_in_ifExpression2239); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:149: (unnamed71= switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:150: unnamed71= switchExpression
                    {
                    pushFollow(FOLLOW_switchExpression_in_ifExpression2247);
                    unnamed71=switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed71); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:212: ( ( ( 'else' ) (unnamed72= switchExpression ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==77) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:213: ( ( 'else' ) (unnamed72= switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:213: ( ( 'else' ) (unnamed72= switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:214: ( 'else' ) (unnamed72= switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:214: ( 'else' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:215: 'else'
                            {
                            match(input,77,FOLLOW_77_in_ifExpression2255); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:259: (unnamed72= switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:260: unnamed72= switchExpression
                            {
                            pushFollow(FOLLOW_switchExpression_in_ifExpression2263);
                            unnamed72=switchExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed72); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:1: switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed73= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= casePart )* ( 'default' ) ( ':' ) (unnamed75= orExpression ) ( '}' ) | (unnamed76= orExpression ) );
    public CompositeNode switchExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed73 = null;

        CompositeNode unnamed74 = null;

        CompositeNode unnamed75 = null;

        CompositeNode unnamed76 = null;


         cn = factory.createSwitchExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( ( 'switch' ) ( ( ( '(' ) (unnamed73= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= casePart )* ( 'default' ) ( ':' ) (unnamed75= orExpression ) ( '}' ) | (unnamed76= orExpression ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==78) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=StringLiteral && LA57_0<=Identifier)||LA57_0==31||LA57_0==36||(LA57_0>=69 && LA57_0<=71)||LA57_0==79||(LA57_0>=94 && LA57_0<=108)) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("217:1: switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed73= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= casePart )* ( 'default' ) ( ':' ) (unnamed75= orExpression ) ( '}' ) | (unnamed76= orExpression ) );", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( 'switch' ) ( ( ( '(' ) (unnamed73= orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= casePart )* ( 'default' ) ( ':' ) (unnamed75= orExpression ) ( '}' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( 'switch' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:3: 'switch'
                    {
                    match(input,78,FOLLOW_78_in_switchExpression2294); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:49: ( ( ( '(' ) (unnamed73= orExpression ) ( ')' ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==31) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:50: ( ( '(' ) (unnamed73= orExpression ) ( ')' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:50: ( ( '(' ) (unnamed73= orExpression ) ( ')' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:51: ( '(' ) (unnamed73= orExpression ) ( ')' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:51: ( '(' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:52: '('
                            {
                            match(input,31,FOLLOW_31_in_switchExpression2302); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:93: (unnamed73= orExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:94: unnamed73= orExpression
                            {
                            pushFollow(FOLLOW_orExpression_in_switchExpression2310);
                            unnamed73=orExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed73); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:152: ( ')' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:153: ')'
                            {
                            match(input,34,FOLLOW_34_in_switchExpression2316); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:197: ( '{' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:198: '{'
                    {
                    match(input,79,FOLLOW_79_in_switchExpression2325); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:239: (unnamed74= casePart )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==82) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:240: unnamed74= casePart
                    	    {
                    	    pushFollow(FOLLOW_casePart_in_switchExpression2333);
                    	    unnamed74=casePart();
                    	    _fsp--;
                    	    if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addToChildren(cn, unnamed74); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:295: ( 'default' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:296: 'default'
                    {
                    match(input,80,FOLLOW_80_in_switchExpression2340); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:343: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:344: ':'
                    {
                    match(input,61,FOLLOW_61_in_switchExpression2346); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:385: (unnamed75= orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:386: unnamed75= orExpression
                    {
                    pushFollow(FOLLOW_orExpression_in_switchExpression2354);
                    unnamed75=orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed75); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:444: ( '}' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:445: '}'
                    {
                    match(input,81,FOLLOW_81_in_switchExpression2360); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: (unnamed76= orExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: (unnamed76= orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:5: unnamed76= orExpression
                    {
                    pushFollow(FOLLOW_orExpression_in_switchExpression2371);
                    unnamed76=orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed76); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:224:1: casePart returns [CompositeNode cn] : ( 'case' ) (unnamed77= expression ) ( ':' ) (unnamed78= expression ) ;
    public CompositeNode casePart() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed77 = null;

        CompositeNode unnamed78 = null;


         cn = factory.createCasePartNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( ( 'case' ) (unnamed77= expression ) ( ':' ) (unnamed78= expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( 'case' ) (unnamed77= expression ) ( ':' ) (unnamed78= expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:3: 'case'
            {
            match(input,82,FOLLOW_82_in_casePart2394); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:47: (unnamed77= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:48: unnamed77= expression
            {
            pushFollow(FOLLOW_expression_in_casePart2402);
            unnamed77=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed77); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:104: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:105: ':'
            {
            match(input,61,FOLLOW_61_in_casePart2408); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:146: (unnamed78= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:147: unnamed78= expression
            {
            pushFollow(FOLLOW_expression_in_casePart2416);
            unnamed78=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed78); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:1: orExpression returns [CompositeNode cn] : (unnamed79= andExpression ) ( ( ( '||' ) (unnamed80= andExpression ) ) )* ;
    public CompositeNode orExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed79 = null;

        CompositeNode unnamed80 = null;


         cn = factory.createOrExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: ( (unnamed79= andExpression ) ( ( ( '||' ) (unnamed80= andExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: (unnamed79= andExpression ) ( ( ( '||' ) (unnamed80= andExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: (unnamed79= andExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:3: unnamed79= andExpression
            {
            pushFollow(FOLLOW_andExpression_in_orExpression2446);
            unnamed79=andExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed79); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:62: ( ( ( '||' ) (unnamed80= andExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==83) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:63: ( ( '||' ) (unnamed80= andExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:63: ( ( '||' ) (unnamed80= andExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:64: ( '||' ) (unnamed80= andExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:64: ( '||' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:65: '||'
            	    {
            	    match(input,83,FOLLOW_83_in_orExpression2454); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:107: (unnamed80= andExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:108: unnamed80= andExpression
            	    {
            	    pushFollow(FOLLOW_andExpression_in_orExpression2462);
            	    unnamed80=andExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed80); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:1: andExpression returns [CompositeNode cn] : (unnamed81= impliesExpression ) ( ( ( '&&' ) (unnamed82= impliesExpression ) ) )* ;
    public CompositeNode andExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed81 = null;

        CompositeNode unnamed82 = null;


         cn = factory.createAndExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: ( (unnamed81= impliesExpression ) ( ( ( '&&' ) (unnamed82= impliesExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: (unnamed81= impliesExpression ) ( ( ( '&&' ) (unnamed82= impliesExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: (unnamed81= impliesExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:3: unnamed81= impliesExpression
            {
            pushFollow(FOLLOW_impliesExpression_in_andExpression2495);
            unnamed81=impliesExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed81); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:66: ( ( ( '&&' ) (unnamed82= impliesExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==84) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:67: ( ( '&&' ) (unnamed82= impliesExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:67: ( ( '&&' ) (unnamed82= impliesExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:68: ( '&&' ) (unnamed82= impliesExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:68: ( '&&' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:69: '&&'
            	    {
            	    match(input,84,FOLLOW_84_in_andExpression2503); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:111: (unnamed82= impliesExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:112: unnamed82= impliesExpression
            	    {
            	    pushFollow(FOLLOW_impliesExpression_in_andExpression2511);
            	    unnamed82=impliesExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed82); 
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
    // $ANTLR end andExpression


    // $ANTLR start impliesExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:241:1: impliesExpression returns [CompositeNode cn] : (unnamed83= relationalExpression ) ( ( ( 'implies' ) (unnamed84= relationalExpression ) ) )* ;
    public CompositeNode impliesExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed83 = null;

        CompositeNode unnamed84 = null;


         cn = factory.createImpliesExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:2: ( (unnamed83= relationalExpression ) ( ( ( 'implies' ) (unnamed84= relationalExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:2: (unnamed83= relationalExpression ) ( ( ( 'implies' ) (unnamed84= relationalExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:2: (unnamed83= relationalExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:3: unnamed83= relationalExpression
            {
            pushFollow(FOLLOW_relationalExpression_in_impliesExpression2544);
            unnamed83=relationalExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed83); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:69: ( ( ( 'implies' ) (unnamed84= relationalExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==85) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:70: ( ( 'implies' ) (unnamed84= relationalExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:70: ( ( 'implies' ) (unnamed84= relationalExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:71: ( 'implies' ) (unnamed84= relationalExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:71: ( 'implies' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:72: 'implies'
            	    {
            	    match(input,85,FOLLOW_85_in_impliesExpression2552); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:119: (unnamed84= relationalExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:120: unnamed84= relationalExpression
            	    {
            	    pushFollow(FOLLOW_relationalExpression_in_impliesExpression2560);
            	    unnamed84=relationalExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed84); 
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
    // $ANTLR end impliesExpression


    // $ANTLR start relationalExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:247:1: relationalExpression returns [CompositeNode cn] : (leftOperand= additiveExpression ) ( ( (operator= booleanOperator ) (rightOperand= additiveExpression ) ) )* ;
    public CompositeNode relationalExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode leftOperand = null;

        CompositeNode operator = null;

        CompositeNode rightOperand = null;


         cn = factory.createRelationalExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: ( (leftOperand= additiveExpression ) ( ( (operator= booleanOperator ) (rightOperand= additiveExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: (leftOperand= additiveExpression ) ( ( (operator= booleanOperator ) (rightOperand= additiveExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: (leftOperand= additiveExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:3: leftOperand= additiveExpression
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2593);
            leftOperand=additiveExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, leftOperand); ((RelationalExpressionNode) cn).setLeftOperand(leftOperand); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:132: ( ( (operator= booleanOperator ) (rightOperand= additiveExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=86 && LA61_0<=91)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:133: ( (operator= booleanOperator ) (rightOperand= additiveExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:133: ( (operator= booleanOperator ) (rightOperand= additiveExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:134: (operator= booleanOperator ) (rightOperand= additiveExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:134: (operator= booleanOperator )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:135: operator= booleanOperator
            	    {
            	    pushFollow(FOLLOW_booleanOperator_in_relationalExpression2603);
            	    operator=booleanOperator();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, operator); ((RelationalExpressionNode) cn).setOperator(operator); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:249: (rightOperand= additiveExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:250: rightOperand= additiveExpression
            	    {
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2611);
            	    rightOperand=additiveExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, rightOperand); ((RelationalExpressionNode) cn).setRightOperand(rightOperand); 
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
    // $ANTLR end relationalExpression


    // $ANTLR start booleanOperator
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:1: booleanOperator returns [CompositeNode cn] : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public CompositeNode booleanOperator() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createBooleanOperatorNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:2: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
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
                    new NoViableAltException("253:1: booleanOperator returns [CompositeNode cn] : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:2: ( '==' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:2: ( '==' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:3: '=='
                    {
                    match(input,86,FOLLOW_86_in_booleanOperator2637); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:257:4: ( '!=' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:257:4: ( '!=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:257:5: '!='
                    {
                    match(input,87,FOLLOW_87_in_booleanOperator2646); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:4: ( '>=' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:4: ( '>=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:5: '>='
                    {
                    match(input,88,FOLLOW_88_in_booleanOperator2655); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:4: ( '<=' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:4: ( '<=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:5: '<='
                    {
                    match(input,89,FOLLOW_89_in_booleanOperator2664); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:260:4: ( '>' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:260:4: ( '>' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:260:5: '>'
                    {
                    match(input,90,FOLLOW_90_in_booleanOperator2673); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:261:4: ( '<' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:261:4: ( '<' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:261:5: '<'
                    {
                    match(input,91,FOLLOW_91_in_booleanOperator2682); if (failed) return cn;
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
    // $ANTLR end booleanOperator


    // $ANTLR start additiveExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:1: additiveExpression returns [CompositeNode cn] : (unnamed85= multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= multiplicativeExpression ) ) )* ;
    public CompositeNode additiveExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed85 = null;

        CompositeNode unnamed86 = null;


         cn = factory.createAdditiveExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:2: ( (unnamed85= multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= multiplicativeExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:2: (unnamed85= multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= multiplicativeExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:2: (unnamed85= multiplicativeExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:3: unnamed85= multiplicativeExpression
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2712);
            unnamed85=multiplicativeExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed85); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:73: ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= multiplicativeExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==36) ) {
                    int LA64_2 = input.LA(2);

                    if ( ((LA64_2>=StringLiteral && LA64_2<=Identifier)||LA64_2==31||LA64_2==36||(LA64_2>=69 && LA64_2<=71)||LA64_2==79||(LA64_2>=94 && LA64_2<=108)) ) {
                        alt64=1;
                    }


                }
                else if ( (LA64_0==92) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:74: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= multiplicativeExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:74: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= multiplicativeExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:75: ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= multiplicativeExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:75: ( ( ( '+' ) | ( '-' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:76: ( ( '+' ) | ( '-' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:76: ( ( '+' ) | ( '-' ) )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==92) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==36) ) {
            	        alt63=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("267:76: ( ( '+' ) | ( '-' ) )", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:77: ( '+' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:77: ( '+' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:267:78: '+'
            	            {
            	            match(input,92,FOLLOW_92_in_additiveExpression2722); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:268:4: ( '-' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:268:4: ( '-' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:268:5: '-'
            	            {
            	            match(input,36,FOLLOW_36_in_additiveExpression2731); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:268:48: (unnamed86= multiplicativeExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:268:49: unnamed86= multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2741);
            	    unnamed86=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed86); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:270:1: multiplicativeExpression returns [CompositeNode cn] : (unnamed87= unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= unaryExpression ) ) )* ;
    public CompositeNode multiplicativeExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed87 = null;

        CompositeNode unnamed88 = null;


         cn = factory.createMultiplicativeExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:2: ( (unnamed87= unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= unaryExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:2: (unnamed87= unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= unaryExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:2: (unnamed87= unaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:3: unnamed87= unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2774);
            unnamed87=unaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed87); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:64: ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= unaryExpression ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==33||LA66_0==93) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:65: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= unaryExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:65: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= unaryExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:66: ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= unaryExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:66: ( ( ( '*' ) | ( '/' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:67: ( ( '*' ) | ( '/' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:67: ( ( '*' ) | ( '/' ) )
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==33) ) {
            	        alt65=1;
            	    }
            	    else if ( (LA65_0==93) ) {
            	        alt65=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("274:67: ( ( '*' ) | ( '/' ) )", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:68: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:68: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:274:69: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_multiplicativeExpression2784); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:4: ( '/' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:4: ( '/' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:5: '/'
            	            {
            	            match(input,93,FOLLOW_93_in_multiplicativeExpression2793); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:48: (unnamed88= unaryExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:49: unnamed88= unaryExpression
            	    {
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2803);
            	    unnamed88=unaryExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed88); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:277:1: unaryExpression returns [CompositeNode cn] : ( (unnamed89= infixExpression ) | ( '!' ) (unnamed90= infixExpression ) | ( '-' ) (unnamed91= infixExpression ) );
    public CompositeNode unaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed89 = null;

        CompositeNode unnamed90 = null;

        CompositeNode unnamed91 = null;


         cn = factory.createUnaryExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:281:2: ( (unnamed89= infixExpression ) | ( '!' ) (unnamed90= infixExpression ) | ( '-' ) (unnamed91= infixExpression ) )
            int alt67=3;
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
                alt67=1;
                }
                break;
            case 94:
                {
                alt67=2;
                }
                break;
            case 36:
                {
                alt67=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("277:1: unaryExpression returns [CompositeNode cn] : ( (unnamed89= infixExpression ) | ( '!' ) (unnamed90= infixExpression ) | ( '-' ) (unnamed91= infixExpression ) );", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:281:2: (unnamed89= infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:281:2: (unnamed89= infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:281:3: unnamed89= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression2836);
                    unnamed89=infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed89); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:282:4: ( '!' ) (unnamed90= infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:282:4: ( '!' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:282:5: '!'
                    {
                    match(input,94,FOLLOW_94_in_unaryExpression2845); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:282:46: (unnamed90= infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:282:47: unnamed90= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression2853);
                    unnamed90=infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed90); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:283:4: ( '-' ) (unnamed91= infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:283:4: ( '-' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:283:5: '-'
                    {
                    match(input,36,FOLLOW_36_in_unaryExpression2862); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:283:46: (unnamed91= infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:283:47: unnamed91= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression2870);
                    unnamed91=infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed91); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:285:1: infixExpression returns [CompositeNode cn] : (target= primaryExpression ) ( ( ( '.' ) (calls= featureCall ) ) )* ;
    public CompositeNode infixExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode target = null;

        CompositeNode calls = null;


         cn = factory.createInfixExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:2: ( (target= primaryExpression ) ( ( ( '.' ) (calls= featureCall ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:2: (target= primaryExpression ) ( ( ( '.' ) (calls= featureCall ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:2: (target= primaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:3: target= primaryExpression
            {
            pushFollow(FOLLOW_primaryExpression_in_infixExpression2900);
            target=primaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, target); ((InfixExpressionNode) cn).setTarget(target); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:106: ( ( ( '.' ) (calls= featureCall ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==68) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:107: ( ( '.' ) (calls= featureCall ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:107: ( ( '.' ) (calls= featureCall ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:108: ( '.' ) (calls= featureCall )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:108: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:109: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_infixExpression2908); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:150: (calls= featureCall )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:151: calls= featureCall
            	    {
            	    pushFollow(FOLLOW_featureCall_in_infixExpression2916);
            	    calls=featureCall();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, calls); ((InfixExpressionNode) cn).getCalls().add(calls); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:291:1: primaryExpression returns [CompositeNode cn] : ( ( stringLiteral ) | ( featureCall ) | ( booleanLiteral ) | ( numberLiteral ) | ( nullLiteral ) | ( listLiteral ) | ( constructorCall ) | ( globalVarExpression ) | ( paranthesizedExpression ) );
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:292:2: ( ( stringLiteral ) | ( featureCall ) | ( booleanLiteral ) | ( numberLiteral ) | ( nullLiteral ) | ( listLiteral ) | ( constructorCall ) | ( globalVarExpression ) | ( paranthesizedExpression ) )
            int alt69=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt69=1;
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
                alt69=2;
                }
                break;
            case 97:
            case 98:
                {
                alt69=3;
                }
                break;
            case IntLiteral:
                {
                alt69=4;
                }
                break;
            case 99:
                {
                alt69=5;
                }
                break;
            case 79:
                {
                alt69=6;
                }
                break;
            case 96:
                {
                alt69=7;
                }
                break;
            case 95:
                {
                alt69=8;
                }
                break;
            case 31:
                {
                alt69=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("291:1: primaryExpression returns [CompositeNode cn] : ( ( stringLiteral ) | ( featureCall ) | ( booleanLiteral ) | ( numberLiteral ) | ( nullLiteral ) | ( listLiteral ) | ( constructorCall ) | ( globalVarExpression ) | ( paranthesizedExpression ) );", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:292:2: ( stringLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:292:2: ( stringLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:292:3: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_primaryExpression2937);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:4: ( featureCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:4: ( featureCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:5: featureCall
                    {
                    pushFollow(FOLLOW_featureCall_in_primaryExpression2946);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:4: ( booleanLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:4: ( booleanLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:5: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression2955);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( numberLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( numberLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:5: numberLiteral
                    {
                    pushFollow(FOLLOW_numberLiteral_in_primaryExpression2964);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:4: ( nullLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:4: ( nullLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:5: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_primaryExpression2973);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:4: ( listLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:4: ( listLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:5: listLiteral
                    {
                    pushFollow(FOLLOW_listLiteral_in_primaryExpression2982);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( constructorCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( constructorCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:5: constructorCall
                    {
                    pushFollow(FOLLOW_constructorCall_in_primaryExpression2991);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:4: ( globalVarExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:4: ( globalVarExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:5: globalVarExpression
                    {
                    pushFollow(FOLLOW_globalVarExpression_in_primaryExpression3000);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:4: ( paranthesizedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:4: ( paranthesizedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:5: paranthesizedExpression
                    {
                    pushFollow(FOLLOW_paranthesizedExpression_in_primaryExpression3009);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:1: stringLiteral returns [CompositeNode cn] : ( StringLiteral ) ;
    public CompositeNode stringLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createStringLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( ( StringLiteral ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( StringLiteral )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( StringLiteral )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:3: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_stringLiteral3032); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:1: paranthesizedExpression returns [CompositeNode cn] : ( '(' ) (unnamed92= expression ) ( ')' ) ;
    public CompositeNode paranthesizedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed92 = null;


         cn = factory.createParanthesizedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:2: ( ( '(' ) (unnamed92= expression ) ( ')' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:2: ( '(' ) (unnamed92= expression ) ( ')' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:2: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:3: '('
            {
            match(input,31,FOLLOW_31_in_paranthesizedExpression3055); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:44: (unnamed92= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:45: unnamed92= expression
            {
            pushFollow(FOLLOW_expression_in_paranthesizedExpression3063);
            unnamed92=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed92); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:101: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:102: ')'
            {
            match(input,34,FOLLOW_34_in_paranthesizedExpression3069); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:312:1: globalVarExpression returns [CompositeNode cn] : ( 'GLOBALVAR' ) (unnamed93= identifier ) ;
    public CompositeNode globalVarExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed93 = null;


         cn = factory.createGlobalVarExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:2: ( ( 'GLOBALVAR' ) (unnamed93= identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:2: ( 'GLOBALVAR' ) (unnamed93= identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:2: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:3: 'GLOBALVAR'
            {
            match(input,95,FOLLOW_95_in_globalVarExpression3092); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:52: (unnamed93= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:53: unnamed93= identifier
            {
            pushFollow(FOLLOW_identifier_in_globalVarExpression3100);
            unnamed93=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed93); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:317:1: featureCall returns [CompositeNode cn] : ( (name= identifier ) ( '(' ) ( ( (paramList= parameterList ) ) )? ( ')' ) | (unnamed94= type ) | (unnamed95= collectionExpression ) );
    public CompositeNode featureCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode name = null;

        CompositeNode paramList = null;

        CompositeNode unnamed94 = null;

        CompositeNode unnamed95 = null;


         cn = factory.createFeatureCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: ( (name= identifier ) ( '(' ) ( ( (paramList= parameterList ) ) )? ( ')' ) | (unnamed94= type ) | (unnamed95= collectionExpression ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==EOF||LA71_1==TEXT||LA71_1==Identifier||LA71_1==28||(LA71_1>=32 && LA71_1<=34)||(LA71_1>=36 && LA71_1<=37)||LA71_1==40||LA71_1==43||(LA71_1>=54 && LA71_1<=56)||(LA71_1>=60 && LA71_1<=61)||LA71_1==63||LA71_1==68||(LA71_1>=74 && LA71_1<=77)||(LA71_1>=80 && LA71_1<=93)) ) {
                    alt71=2;
                }
                else if ( (LA71_1==31) ) {
                    alt71=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("317:1: featureCall returns [CompositeNode cn] : ( (name= identifier ) ( '(' ) ( ( (paramList= parameterList ) ) )? ( ')' ) | (unnamed94= type ) | (unnamed95= collectionExpression ) );", 71, 1, input);

                    throw nvae;
                }
                }
                break;
            case 69:
            case 70:
            case 71:
                {
                alt71=2;
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
                alt71=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("317:1: featureCall returns [CompositeNode cn] : ( (name= identifier ) ( '(' ) ( ( (paramList= parameterList ) ) )? ( ')' ) | (unnamed94= type ) | (unnamed95= collectionExpression ) );", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: (name= identifier ) ( '(' ) ( ( (paramList= parameterList ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: (name= identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:3: name= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_featureCall3130);
                    name=identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, name); ((FeatureCallNode) cn).setName(name); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:87: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:88: '('
                    {
                    match(input,31,FOLLOW_31_in_featureCall3136); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:129: ( ( (paramList= parameterList ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( ((LA70_0>=StringLiteral && LA70_0<=Identifier)||LA70_0==31||LA70_0==36||LA70_0==59||(LA70_0>=69 && LA70_0<=72)||(LA70_0>=78 && LA70_0<=79)||(LA70_0>=94 && LA70_0<=108)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:130: ( (paramList= parameterList ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:130: ( (paramList= parameterList ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:131: (paramList= parameterList )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:131: (paramList= parameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:132: paramList= parameterList
                            {
                            pushFollow(FOLLOW_parameterList_in_featureCall3146);
                            paramList=parameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, paramList); ((FeatureCallNode) cn).setParamList(paramList); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:242: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:243: ')'
                    {
                    match(input,34,FOLLOW_34_in_featureCall3155); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:4: (unnamed94= type )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:4: (unnamed94= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:5: unnamed94= type
                    {
                    pushFollow(FOLLOW_type_in_featureCall3166);
                    unnamed94=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed94); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: (unnamed95= collectionExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: (unnamed95= collectionExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:5: unnamed95= collectionExpression
                    {
                    pushFollow(FOLLOW_collectionExpression_in_featureCall3177);
                    unnamed95=collectionExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed95); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:325:1: listLiteral returns [CompositeNode cn] : ( '{' ) ( ( (unnamed96= expression ) ( ( ( ',' ) (unnamed97= expression ) ) )* ) )? ( '}' ) ;
    public CompositeNode listLiteral() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed96 = null;

        CompositeNode unnamed97 = null;


         cn = factory.createListLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:2: ( ( '{' ) ( ( (unnamed96= expression ) ( ( ( ',' ) (unnamed97= expression ) ) )* ) )? ( '}' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:2: ( '{' ) ( ( (unnamed96= expression ) ( ( ( ',' ) (unnamed97= expression ) ) )* ) )? ( '}' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:2: ( '{' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:3: '{'
            {
            match(input,79,FOLLOW_79_in_listLiteral3200); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:44: ( ( (unnamed96= expression ) ( ( ( ',' ) (unnamed97= expression ) ) )* ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=StringLiteral && LA73_0<=Identifier)||LA73_0==31||LA73_0==36||LA73_0==59||(LA73_0>=69 && LA73_0<=72)||(LA73_0>=78 && LA73_0<=79)||(LA73_0>=94 && LA73_0<=108)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:45: ( (unnamed96= expression ) ( ( ( ',' ) (unnamed97= expression ) ) )* )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:45: ( (unnamed96= expression ) ( ( ( ',' ) (unnamed97= expression ) ) )* )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:46: (unnamed96= expression ) ( ( ( ',' ) (unnamed97= expression ) ) )*
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:46: (unnamed96= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:47: unnamed96= expression
                    {
                    pushFollow(FOLLOW_expression_in_listLiteral3210);
                    unnamed96=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed96); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:103: ( ( ( ',' ) (unnamed97= expression ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==32) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:104: ( ( ',' ) (unnamed97= expression ) )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:104: ( ( ',' ) (unnamed97= expression ) )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:105: ( ',' ) (unnamed97= expression )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:105: ( ',' )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:106: ','
                    	    {
                    	    match(input,32,FOLLOW_32_in_listLiteral3218); if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addLeafNodeForToken(cn, null); 
                    	    }

                    	    }

                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:147: (unnamed97= expression )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:148: unnamed97= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_listLiteral3226);
                    	    unnamed97=expression();
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
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:210: ( '}' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:211: '}'
            {
            match(input,81,FOLLOW_81_in_listLiteral3238); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:1: constructorCall returns [CompositeNode cn] : ( 'new' ) (unnamed98= simpleType ) ;
    public CompositeNode constructorCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed98 = null;


         cn = factory.createConstructorCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:2: ( ( 'new' ) (unnamed98= simpleType ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:2: ( 'new' ) (unnamed98= simpleType )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:2: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:3: 'new'
            {
            match(input,96,FOLLOW_96_in_constructorCall3261); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:46: (unnamed98= simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:47: unnamed98= simpleType
            {
            pushFollow(FOLLOW_simpleType_in_constructorCall3269);
            unnamed98=simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed98); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:1: booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );
    public CompositeNode booleanLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createBooleanLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:2: ( ( 'false' ) | ( 'true' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==97) ) {
                alt74=1;
            }
            else if ( (LA74_0==98) ) {
                alt74=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("335:1: booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:2: ( 'false' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:2: ( 'false' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:3: 'false'
                    {
                    match(input,97,FOLLOW_97_in_booleanLiteral3292); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( 'true' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( 'true' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:5: 'true'
                    {
                    match(input,98,FOLLOW_98_in_booleanLiteral3301); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:1: nullLiteral returns [CompositeNode cn] : ( 'null' ) ;
    public CompositeNode nullLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNullLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:2: ( ( 'null' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:2: ( 'null' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:2: ( 'null' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:3: 'null'
            {
            match(input,99,FOLLOW_99_in_nullLiteral3324); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:346:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );
    public CompositeNode numberLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNumberLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:2: ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==IntLiteral) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==68) ) {
                    int LA75_2 = input.LA(3);

                    if ( (LA75_2==Identifier||(LA75_2>=69 && LA75_2<=71)||(LA75_2>=100 && LA75_2<=108)) ) {
                        alt75=1;
                    }
                    else if ( (LA75_2==IntLiteral) ) {
                        alt75=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("346:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA75_1==EOF||LA75_1==TEXT||LA75_1==Identifier||LA75_1==28||(LA75_1>=32 && LA75_1<=34)||(LA75_1>=36 && LA75_1<=37)||LA75_1==40||LA75_1==43||(LA75_1>=54 && LA75_1<=56)||(LA75_1>=60 && LA75_1<=61)||(LA75_1>=74 && LA75_1<=77)||(LA75_1>=80 && LA75_1<=93)) ) {
                    alt75=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("346:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("346:1: numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:2: ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:2: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:3: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral3347); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:4: ( IntLiteral ) ( '.' ) ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:4: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:5: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral3356); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:53: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:54: '.'
                    {
                    match(input,68,FOLLOW_68_in_numberLiteral3362); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:95: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:96: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral3368); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:352:1: collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed99= type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= identifier ) ( '|' ) ) )? (unnamed101= expression ) ( ')' ) );
    public CompositeNode collectionExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed99 = null;

        CompositeNode unnamed100 = null;

        CompositeNode unnamed101 = null;


         cn = factory.createCollectionExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:2: ( ( 'typeSelect' ) ( '(' ) (unnamed99= type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= identifier ) ( '|' ) ) )? (unnamed101= expression ) ( ')' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==100) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=101 && LA78_0<=108)) ) {
                alt78=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("352:1: collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed99= type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= identifier ) ( '|' ) ) )? (unnamed101= expression ) ( ')' ) );", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:2: ( 'typeSelect' ) ( '(' ) (unnamed99= type ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:2: ( 'typeSelect' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:3: 'typeSelect'
                    {
                    match(input,100,FOLLOW_100_in_collectionExpression3391); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:54: '('
                    {
                    match(input,31,FOLLOW_31_in_collectionExpression3397); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:95: (unnamed99= type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:96: unnamed99= type
                    {
                    pushFollow(FOLLOW_type_in_collectionExpression3405);
                    unnamed99=type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed99); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:146: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:147: ')'
                    {
                    match(input,34,FOLLOW_34_in_collectionExpression3411); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= identifier ) ( '|' ) ) )? (unnamed101= expression ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    int alt76=8;
                    switch ( input.LA(1) ) {
                    case 101:
                        {
                        alt76=1;
                        }
                        break;
                    case 102:
                        {
                        alt76=2;
                        }
                        break;
                    case 103:
                        {
                        alt76=3;
                        }
                        break;
                    case 104:
                        {
                        alt76=4;
                        }
                        break;
                    case 105:
                        {
                        alt76=5;
                        }
                        break;
                    case 106:
                        {
                        alt76=6;
                        }
                        break;
                    case 107:
                        {
                        alt76=7;
                        }
                        break;
                    case 108:
                        {
                        alt76=8;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("356:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:6: ( 'collect' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:6: ( 'collect' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:7: 'collect'
                            {
                            match(input,101,FOLLOW_101_in_collectionExpression3422); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:4: ( 'select' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:4: ( 'select' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:5: 'select'
                            {
                            match(input,102,FOLLOW_102_in_collectionExpression3431); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:4: ( 'selectFirst' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:4: ( 'selectFirst' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:5: 'selectFirst'
                            {
                            match(input,103,FOLLOW_103_in_collectionExpression3440); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:359:4: ( 'reject' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:359:4: ( 'reject' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:359:5: 'reject'
                            {
                            match(input,104,FOLLOW_104_in_collectionExpression3449); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:4: ( 'exists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:4: ( 'exists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:5: 'exists'
                            {
                            match(input,105,FOLLOW_105_in_collectionExpression3458); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 6 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:4: ( 'notExists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:4: ( 'notExists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:5: 'notExists'
                            {
                            match(input,106,FOLLOW_106_in_collectionExpression3467); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 7 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:362:4: ( 'sortBy' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:362:4: ( 'sortBy' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:362:5: 'sortBy'
                            {
                            match(input,107,FOLLOW_107_in_collectionExpression3476); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 8 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:4: ( 'forAll' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:4: ( 'forAll' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:5: 'forAll'
                            {
                            match(input,108,FOLLOW_108_in_collectionExpression3485); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;

                    }


                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:54: '('
                    {
                    match(input,31,FOLLOW_31_in_collectionExpression3493); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:95: ( ( (unnamed100= identifier ) ( '|' ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==Identifier) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==109) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:96: ( (unnamed100= identifier ) ( '|' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:96: ( (unnamed100= identifier ) ( '|' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:97: (unnamed100= identifier ) ( '|' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:97: (unnamed100= identifier )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:98: unnamed100= identifier
                            {
                            pushFollow(FOLLOW_identifier_in_collectionExpression3503);
                            unnamed100=identifier();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed100); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:156: ( '|' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:157: '|'
                            {
                            match(input,109,FOLLOW_109_in_collectionExpression3509); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:201: (unnamed101= expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:202: unnamed101= expression
                    {
                    pushFollow(FOLLOW_expression_in_collectionExpression3520);
                    unnamed101=expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed101); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:260: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:261: ')'
                    {
                    match(input,34,FOLLOW_34_in_collectionExpression3526); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:365:1: declaredParameterList returns [CompositeNode cn] : (params= declaredParameter ) ( ( ( ',' ) (params= declaredParameter ) ) )* ;
    public CompositeNode declaredParameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode params = null;


         cn = factory.createDeclaredParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:2: ( (params= declaredParameter ) ( ( ( ',' ) (params= declaredParameter ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:2: (params= declaredParameter ) ( ( ( ',' ) (params= declaredParameter ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:2: (params= declaredParameter )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:3: params= declaredParameter
            {
            pushFollow(FOLLOW_declaredParameter_in_declaredParameterList3551);
            params=declaredParameter();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:118: ( ( ( ',' ) (params= declaredParameter ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==32) ) {
                    int LA79_1 = input.LA(2);

                    if ( (LA79_1==Identifier||(LA79_1>=69 && LA79_1<=71)) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:119: ( ( ',' ) (params= declaredParameter ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:119: ( ( ',' ) (params= declaredParameter ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:120: ( ',' ) (params= declaredParameter )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:120: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:121: ','
            	    {
            	    match(input,32,FOLLOW_32_in_declaredParameterList3559); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:162: (params= declaredParameter )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:163: params= declaredParameter
            	    {
            	    pushFollow(FOLLOW_declaredParameter_in_declaredParameterList3567);
            	    params=declaredParameter();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:370:1: declaredParameter returns [CompositeNode cn] : (ptype= type ) (name= identifier ) ;
    public CompositeNode declaredParameter() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode ptype = null;

        CompositeNode name = null;


         cn = factory.createDeclaredParameterNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:2: ( (ptype= type ) (name= identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:2: (ptype= type ) (name= identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:2: (ptype= type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:3: ptype= type
            {
            pushFollow(FOLLOW_type_in_declaredParameter3595);
            ptype=type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, ptype); ((DeclaredParameterNode) cn).setPtype(ptype); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:91: (name= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:92: name= identifier
            {
            pushFollow(FOLLOW_identifier_in_declaredParameter3603);
            name=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((DeclaredParameterNode) cn).setName(name); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:1: parameterList returns [CompositeNode cn] : (params= expression ) ( ( ( ',' ) (params= expression ) ) )* ;
    public CompositeNode parameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode params = null;


         cn = factory.createParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:2: ( (params= expression ) ( ( ( ',' ) (params= expression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:2: (params= expression ) ( ( ( ',' ) (params= expression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:2: (params= expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:3: params= expression
            {
            pushFollow(FOLLOW_expression_in_parameterList3628);
            params=expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:103: ( ( ( ',' ) (params= expression ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==32) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:104: ( ( ',' ) (params= expression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:104: ( ( ',' ) (params= expression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:105: ( ',' ) (params= expression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:105: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:106: ','
            	    {
            	    match(input,32,FOLLOW_32_in_parameterList3636); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:147: (params= expression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:148: params= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_parameterList3644);
            	    params=expression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); 
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
    // $ANTLR end parameterList


    // $ANTLR start type
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:380:1: type returns [CompositeNode cn] : ( ( collectionType ) | ( simpleType ) );
    public CompositeNode type() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode collectionType24 = null;

        CompositeNode simpleType25 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( ( collectionType ) | ( simpleType ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=69 && LA81_0<=71)) ) {
                alt81=1;
            }
            else if ( (LA81_0==Identifier) ) {
                alt81=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("380:1: type returns [CompositeNode cn] : ( ( collectionType ) | ( simpleType ) );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( collectionType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( collectionType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:3: collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3665);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:4: ( simpleType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:4: ( simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:5: simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3674);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:1: collectionType returns [CompositeNode cn] : ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= simpleType ) ( ']' ) ) )? ;
    public CompositeNode collectionType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed102 = null;


         cn = factory.createCollectionTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= simpleType ) ( ']' ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= simpleType ) ( ']' ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt82=1;
                }
                break;
            case 70:
                {
                alt82=2;
                }
                break;
            case 71:
                {
                alt82=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("387:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:4: ( 'Collection' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:4: ( 'Collection' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:5: 'Collection'
                    {
                    match(input,69,FOLLOW_69_in_collectionType3699); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:388:4: ( 'List' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:388:4: ( 'List' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:388:5: 'List'
                    {
                    match(input,70,FOLLOW_70_in_collectionType3708); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:4: ( 'Set' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:4: ( 'Set' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:5: 'Set'
                    {
                    match(input,71,FOLLOW_71_in_collectionType3717); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:50: ( ( ( '[' ) (unnamed102= simpleType ) ( ']' ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==110) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:51: ( ( '[' ) (unnamed102= simpleType ) ( ']' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:51: ( ( '[' ) (unnamed102= simpleType ) ( ']' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:52: ( '[' ) (unnamed102= simpleType ) ( ']' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:52: ( '[' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:53: '['
                    {
                    match(input,110,FOLLOW_110_in_collectionType3727); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:94: (unnamed102= simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:95: unnamed102= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_collectionType3735);
                    unnamed102=simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed102); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:153: ( ']' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:154: ']'
                    {
                    match(input,111,FOLLOW_111_in_collectionType3741); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:391:1: simpleType returns [CompositeNode cn] : (names= identifier ) ( ( ( '::' ) (names= identifier ) ) )* ;
    public CompositeNode simpleType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode names = null;


         cn = factory.createSimpleTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: ( (names= identifier ) ( ( ( '::' ) (names= identifier ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: (names= identifier ) ( ( ( '::' ) (names= identifier ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: (names= identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:3: names= identifier
            {
            pushFollow(FOLLOW_identifier_in_simpleType3769);
            names=identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:96: ( ( ( '::' ) (names= identifier ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==63) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:97: ( ( '::' ) (names= identifier ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:97: ( ( '::' ) (names= identifier ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:98: ( '::' ) (names= identifier )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:98: ( '::' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:99: '::'
            	    {
            	    match(input,63,FOLLOW_63_in_simpleType3777); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:141: (names= identifier )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:142: names= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_simpleType3785);
            	    names=identifier();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:396:1: identifier returns [CompositeNode cn] : ( Identifier ) ;
    public CompositeNode identifier() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createIdentifierNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:2: ( ( Identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:2: ( Identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:2: ( Identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:3: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_identifier3811); if (failed) return cn;
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
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:2: ( '(' type ')' chainExpression )
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:3: '(' type ')' chainExpression
        {
        match(input,31,FOLLOW_31_in_synpred12059); if (failed) return ;
        pushFollow(FOLLOW_type_in_synpred12061);
        type();
        _fsp--;
        if (failed) return ;
        match(input,34,FOLLOW_34_in_synpred12063); if (failed) return ;
        pushFollow(FOLLOW_chainExpression_in_synpred12065);
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


    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA50_eotS =
        "\100\uffff";
    static final String DFA50_eofS =
        "\10\uffff\1\2\67\uffff";
    static final String DFA50_minS =
        "\2\13\1\uffff\1\37\3\41\1\15\1\12\1\15\1\41\1\12\1\0\30\uffff\1"+
        "\77\5\0\3\37\22\0";
    static final String DFA50_maxS =
        "\2\154\1\uffff\1\135\3\156\1\15\1\154\1\15\1\135\1\154\1\0\30\uffff"+
        "\1\157\5\0\3\37\22\0";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\12\uffff\30\1\33\uffff";
    static final String DFA50_specialS =
        "\10\uffff\1\6\3\uffff\1\5\31\uffff\1\0\1\3\1\2\1\4\1\1\25\uffff}>";
    static final String[] DFA50_transitionS = {
            "\3\2\21\uffff\1\1\4\uffff\1\2\26\uffff\1\2\11\uffff\3\2\6\uffff"+
            "\2\2\16\uffff\17\2",
            "\2\2\1\3\21\uffff\1\2\4\uffff\1\2\26\uffff\1\2\11\uffff\1\4"+
            "\1\5\1\6\1\2\5\uffff\2\2\16\uffff\17\2",
            "",
            "\1\2\1\uffff\1\2\1\10\1\uffff\1\2\32\uffff\1\7\4\uffff\1\2\5"+
            "\uffff\2\2\7\uffff\13\2",
            "\1\2\1\10\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\11",
            "\1\2\1\10\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\11",
            "\1\2\1\10\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\11",
            "\1\12",
            "\1\2\1\16\1\35\1\14\16\uffff\1\2\2\uffff\1\42\3\2\1\uffff\1"+
            "\13\1\2\2\uffff\1\2\2\uffff\1\2\12\uffff\3\2\2\uffff\1\44\2"+
            "\2\6\uffff\1\2\1\17\1\20\1\21\2\uffff\3\2\1\uffff\1\15\1\37"+
            "\16\2\1\43\1\41\1\40\1\33\1\34\1\36\1\22\1\23\1\24\1\25\1\26"+
            "\1\27\1\30\1\31\1\32",
            "\1\45",
            "\1\2\1\10\1\uffff\1\2\32\uffff\1\7\4\uffff\1\2\5\uffff\2\2\7"+
            "\uffff\13\2",
            "\1\2\1\46\1\66\1\47\21\uffff\1\73\4\uffff\1\2\40\uffff\1\50"+
            "\1\51\1\52\7\uffff\1\70\16\uffff\1\2\1\72\1\71\1\64\1\65\1\67"+
            "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63",
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
            "\1\74\57\uffff\1\75",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\76",
            "\1\77",
            "\1\77",
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
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "197:1: castedExpression returns [CompositeNode cn] : ( ( '(' type ')' chainExpression )=> ( ( '(' ) (unnamed62= type ) ( ')' ) (unnamed63= chainExpression ) ) | (unnamed64= chainExpression ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_38 = input.LA(1);

                         
                        int index50_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_38);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_42 = input.LA(1);

                         
                        int index50_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_42);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_40 = input.LA(1);

                         
                        int index50_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_40);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_39 = input.LA(1);

                         
                        int index50_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_39);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_41 = input.LA(1);

                         
                        int index50_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_41);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_8==EOF||LA50_8==TEXT||LA50_8==28||(LA50_8>=32 && LA50_8<=34)||LA50_8==37||LA50_8==40||LA50_8==43||(LA50_8>=54 && LA50_8<=56)||(LA50_8>=60 && LA50_8<=61)||LA50_8==68||(LA50_8>=74 && LA50_8<=76)||(LA50_8>=80 && LA50_8<=93)) ) {s = 2;}

                        else if ( (LA50_8==36) ) {s = 11;}

                        else if ( (LA50_8==Identifier) ) {s = 12;}

                        else if ( (LA50_8==78) && (synpred1())) {s = 13;}

                        else if ( (LA50_8==StringLiteral) && (synpred1())) {s = 14;}

                        else if ( (LA50_8==69) && (synpred1())) {s = 15;}

                        else if ( (LA50_8==70) && (synpred1())) {s = 16;}

                        else if ( (LA50_8==71) && (synpred1())) {s = 17;}

                        else if ( (LA50_8==100) && (synpred1())) {s = 18;}

                        else if ( (LA50_8==101) && (synpred1())) {s = 19;}

                        else if ( (LA50_8==102) && (synpred1())) {s = 20;}

                        else if ( (LA50_8==103) && (synpred1())) {s = 21;}

                        else if ( (LA50_8==104) && (synpred1())) {s = 22;}

                        else if ( (LA50_8==105) && (synpred1())) {s = 23;}

                        else if ( (LA50_8==106) && (synpred1())) {s = 24;}

                        else if ( (LA50_8==107) && (synpred1())) {s = 25;}

                        else if ( (LA50_8==108) && (synpred1())) {s = 26;}

                        else if ( (LA50_8==97) && (synpred1())) {s = 27;}

                        else if ( (LA50_8==98) && (synpred1())) {s = 28;}

                        else if ( (LA50_8==IntLiteral) && (synpred1())) {s = 29;}

                        else if ( (LA50_8==99) && (synpred1())) {s = 30;}

                        else if ( (LA50_8==79) && (synpred1())) {s = 31;}

                        else if ( (LA50_8==96) && (synpred1())) {s = 32;}

                        else if ( (LA50_8==95) && (synpred1())) {s = 33;}

                        else if ( (LA50_8==31) && (synpred1())) {s = 34;}

                        else if ( (LA50_8==94) && (synpred1())) {s = 35;}

                        else if ( (LA50_8==59) && (synpred1())) {s = 36;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
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
    public static final BitSet FOLLOW_identifier_in_extension1697 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_extension1703 = new BitSet(new long[]{0x0000000400002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_declaredParameterList_in_extension1711 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_extension1718 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_extension1724 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E8L});
    public static final BitSet FOLLOW_67_in_extension1732 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_javaType_in_extension1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_extension1746 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_extension1754 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_extension1760 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_javaType_in_extension1770 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_extension1778 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_javaType_in_extension1786 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_extension1798 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_expression_in_extension1809 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_extension1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_javaType1842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_javaType1850 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_identifier_in_javaType1860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_javaType1869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_javaType1878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_javaType1887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_test_expression1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_test_expression1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letExpression_in_expression1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_letExpression1984 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_letExpression1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_letExpression1998 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression2006 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_letExpression2012 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_letExpression2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_castedExpression2070 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_castedExpression2078 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_castedExpression2084 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression2134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_chainExpression2142 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression2150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ifExpression2191 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_ifExpression2199 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression2205 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ifExpression2225 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_ifExpression2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ifExpression2239 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ifExpression2255 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_switchExpression2294 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_31_in_switchExpression2302 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression2310 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_switchExpression2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_switchExpression2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_casePart_in_switchExpression2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_80_in_switchExpression2340 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_switchExpression2346 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_switchExpression2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_casePart2394 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_casePart2402 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_casePart2408 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_casePart2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_orExpression2454 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression2495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_andExpression2503 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression2511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression2544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_impliesExpression2552 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression2560 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2593 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_booleanOperator_in_relationalExpression2603 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2611 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_86_in_booleanOperator2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_booleanOperator2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_booleanOperator2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_booleanOperator2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_booleanOperator2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_booleanOperator2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2712 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_additiveExpression2722 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_36_in_additiveExpression2731 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2741 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2774 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_33_in_multiplicativeExpression2784 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_93_in_multiplicativeExpression2793 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2803 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_unaryExpression2845 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_unaryExpression2862 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_infixExpression2900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_infixExpression2908 = new BitSet(new long[]{0x0000000000002000L,0x00001FF0000000E0L});
    public static final BitSet FOLLOW_featureCall_in_infixExpression2916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_stringLiteral_in_primaryExpression2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_featureCall_in_primaryExpression2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_primaryExpression2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_primaryExpression2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLiteral_in_primaryExpression2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorCall_in_primaryExpression2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVarExpression_in_primaryExpression3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paranthesizedExpression_in_primaryExpression3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_stringLiteral3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_paranthesizedExpression3055 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_paranthesizedExpression3063 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_paranthesizedExpression3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_globalVarExpression3092 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_globalVarExpression3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_featureCall3130 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_featureCall3136 = new BitSet(new long[]{0x0800001480003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_parameterList_in_featureCall3146 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_featureCall3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_featureCall3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionExpression_in_featureCall3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_listLiteral3200 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC002C1E0L});
    public static final BitSet FOLLOW_expression_in_listLiteral3210 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_32_in_listLiteral3218 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_listLiteral3226 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_listLiteral3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_constructorCall3261 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simpleType_in_constructorCall3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_booleanLiteral3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_booleanLiteral3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_nullLiteral3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral3356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_numberLiteral3362 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_collectionExpression3391 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_collectionExpression3397 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_collectionExpression3405 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_collectionExpression3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_collectionExpression3422 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_102_in_collectionExpression3431 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_103_in_collectionExpression3440 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_104_in_collectionExpression3449 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_105_in_collectionExpression3458 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_106_in_collectionExpression3467 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_107_in_collectionExpression3476 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_108_in_collectionExpression3485 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_collectionExpression3493 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_identifier_in_collectionExpression3503 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_collectionExpression3509 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_collectionExpression3520 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_collectionExpression3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList3551 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_declaredParameterList3559 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList3567 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_type_in_declaredParameter3595 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_declaredParameter3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameterList3628 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parameterList3636 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_expression_in_parameterList3644 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_collectionType_in_type3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_collectionType3699 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_70_in_collectionType3708 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_71_in_collectionType3717 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_collectionType3727 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_simpleType_in_collectionType3735 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_collectionType3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleType3769 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_simpleType3777 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_simpleType3785 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred12059 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_type_in_synpred12061 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred12063 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_chainExpression_in_synpred12065 = new BitSet(new long[]{0x0000000000000002L});

}