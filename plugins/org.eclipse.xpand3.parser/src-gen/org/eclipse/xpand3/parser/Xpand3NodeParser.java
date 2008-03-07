// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g 2008-03-07 10:28:46
 	
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



    // $ANTLR start r_file
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:29:1: r_file returns [CompositeNode cn] : ( ( (imp= r_nsImport ) ) )* ( ( (decl= r_abstractDeclaration ) ) )* ( EOF ) ;
    public CompositeNode r_file() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode imp = null;

        CompositeNode decl = null;


         cn = factory.createFileNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( ( (imp= r_nsImport ) ) )* ( ( (decl= r_abstractDeclaration ) ) )* ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( (imp= r_nsImport ) ) )* ( ( (decl= r_abstractDeclaration ) ) )* ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( (imp= r_nsImport ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:3: ( (imp= r_nsImport ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:3: ( (imp= r_nsImport ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:4: (imp= r_nsImport )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:4: (imp= r_nsImport )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:5: imp= r_nsImport
            	    {
            	    pushFollow(FOLLOW_r_nsImport_in_r_file80);
            	    imp=r_nsImport();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:87: ( ( (decl= r_abstractDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==58||LA2_0==62||(LA2_0>=64 && LA2_0<=66)||(LA2_0>=69 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:88: ( (decl= r_abstractDeclaration ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:88: ( (decl= r_abstractDeclaration ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:89: (decl= r_abstractDeclaration )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:89: (decl= r_abstractDeclaration )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:90: decl= r_abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_r_abstractDeclaration_in_r_file93);
            	    decl=r_abstractDeclaration();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:187: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:188: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_r_file102); if (failed) return cn;

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
    // $ANTLR end r_file


    // $ANTLR start r_nsImport
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:35:1: r_nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) );
    public CompositeNode r_nsImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode ns = null;

        CompositeNode unnamed0 = null;

        CompositeNode unnamed1 = null;


         cn = factory.createNsImportNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:2: ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) )
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
                        new NoViableAltException("35:1: r_nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 1, input);

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
                    new NoViableAltException("35:1: r_nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:2: ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:2: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:3: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_nsImport123); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:43: ( 'IMPORT' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:44: 'IMPORT'
                    {
                    match(input,25,FOLLOW_25_in_r_nsImport129); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:90: (ns= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:91: ns= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_nsImport137);
                    ns=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:166: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:167: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_nsImport143); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:4: ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_nsImport152); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:45: ( 'EXTENSION' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:46: 'EXTENSION'
                    {
                    match(input,26,FOLLOW_26_in_r_nsImport158); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:95: (ns= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:96: ns= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_nsImport166);
                    ns=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:171: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:172: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_nsImport172); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:4: ( 'import' ) (unnamed0= r_type ) ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:4: ( 'import' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:5: 'import'
                    {
                    match(input,27,FOLLOW_27_in_r_nsImport181); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:51: (unnamed0= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:52: unnamed0= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_nsImport189);
                    unnamed0=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed0); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:102: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:103: ';'
                    {
                    match(input,28,FOLLOW_28_in_r_nsImport195); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:4: ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:4: ( 'extension' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:5: 'extension'
                    {
                    match(input,29,FOLLOW_29_in_r_nsImport204); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:54: (unnamed1= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:55: unnamed1= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_nsImport212);
                    unnamed1=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed1); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:105: ( ( ( 'reexport' ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:106: ( ( 'reexport' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:106: ( ( 'reexport' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:107: ( 'reexport' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:107: ( 'reexport' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:108: 'reexport'
                            {
                            match(input,30,FOLLOW_30_in_r_nsImport220); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:159: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:160: ';'
                    {
                    match(input,28,FOLLOW_28_in_r_nsImport229); if (failed) return cn;
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
    // $ANTLR end r_nsImport


    // $ANTLR start r_abstractDeclaration
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );
    public CompositeNode r_abstractDeclaration() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_check1 = null;

        CompositeNode r_around2 = null;

        CompositeNode r_extension3 = null;

        CompositeNode r_definition4 = null;

        CompositeNode r_definitionAround5 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) )
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
                        new NoViableAltException("43:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("43:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( r_check )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( r_check )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:3: r_check
                    {
                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration247);
                    r_check1=r_check();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_check1; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( r_around )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( r_around )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:5: r_around
                    {
                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration256);
                    r_around2=r_around();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_around2; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:4: ( r_extension )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:4: ( r_extension )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:5: r_extension
                    {
                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration265);
                    r_extension3=r_extension();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_extension3; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:4: ( r_definition )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:4: ( r_definition )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:5: r_definition
                    {
                    pushFollow(FOLLOW_r_definition_in_r_abstractDeclaration274);
                    r_definition4=r_definition();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_definition4; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:4: ( r_definitionAround )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:4: ( r_definitionAround )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:5: r_definitionAround
                    {
                    pushFollow(FOLLOW_r_definitionAround_in_r_abstractDeclaration283);
                    r_definitionAround5=r_definitionAround();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_definitionAround5; 
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
    // $ANTLR end r_abstractDeclaration


    // $ANTLR start r_definition
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:1: r_definition returns [CompositeNode cn] : ( LG ) ( DEFINE ) (name= r_identifier ) ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= r_type ) (unnamed4= r_sequence ) ( ENDDEFINE ) ( RG ) ;
    public CompositeNode r_definition() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode name = null;

        CompositeNode unnamed2 = null;

        CompositeNode unnamed3 = null;

        CompositeNode unnamed4 = null;


         cn = factory.createDefinitionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:2: ( ( LG ) ( DEFINE ) (name= r_identifier ) ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= r_type ) (unnamed4= r_sequence ) ( ENDDEFINE ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:2: ( LG ) ( DEFINE ) (name= r_identifier ) ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= r_type ) (unnamed4= r_sequence ) ( ENDDEFINE ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definition306); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:43: ( DEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:44: DEFINE
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_r_definition312); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:88: (name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:89: name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_definition320);
            name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((DefinitionNode) cn).setName(name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:174: ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:175: ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:175: ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:176: ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:176: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:177: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definition328); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:218: ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Identifier||LA9_0==33||(LA9_0>=69 && LA9_0<=71)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:219: ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:219: ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("53:219: ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:220: (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:220: (unnamed2= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:221: unnamed2= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definition338);
                                    unnamed2=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed2); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:288: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt7=2;
                                    int LA7_0 = input.LA(1);

                                    if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                                        alt7=1;
                                    }
                                    switch (alt7) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:289: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:289: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:290: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:290: ( ',' )?
                                            int alt6=2;
                                            int LA6_0 = input.LA(1);

                                            if ( (LA6_0==32) ) {
                                                alt6=1;
                                            }
                                            switch (alt6) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:291: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definition346); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:333: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:334: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definition353); if (failed) return cn;
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
                                    match(input,33,FOLLOW_33_in_r_definition365); if (failed) return cn;
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
                    match(input,34,FOLLOW_34_in_r_definition374); if (failed) return cn;
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
            match(input,35,FOLLOW_35_in_r_definition383); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:138: (unnamed3= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:139: unnamed3= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definition391);
            unnamed3=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed3); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:189: (unnamed4= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:190: unnamed4= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definition399);
            unnamed4=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed4); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:244: ( ENDDEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:245: ENDDEFINE
            {
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_r_definition405); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:292: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:293: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definition411); if (failed) return cn;
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
    // $ANTLR end r_definition


    // $ANTLR start r_definitionAround
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:1: r_definitionAround returns [CompositeNode cn] : ( LG ) ( AROUND ) (unnamed5= r_pointcut ) ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= r_type ) (unnamed8= r_sequence ) ( ENDAROUND ) ( RG ) ;
    public CompositeNode r_definitionAround() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed5 = null;

        CompositeNode unnamed6 = null;

        CompositeNode unnamed7 = null;

        CompositeNode unnamed8 = null;


         cn = factory.createDefinitionAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:2: ( ( LG ) ( AROUND ) (unnamed5= r_pointcut ) ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= r_type ) (unnamed8= r_sequence ) ( ENDAROUND ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:2: ( LG ) ( AROUND ) (unnamed5= r_pointcut ) ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= r_type ) (unnamed8= r_sequence ) ( ENDAROUND ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definitionAround434); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:43: ( AROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:44: AROUND
            {
            match(input,AROUND,FOLLOW_AROUND_in_r_definitionAround440); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:88: (unnamed5= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:89: unnamed5= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_definitionAround448);
            unnamed5=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed5); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:143: ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:144: ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:144: ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:145: ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:145: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:146: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definitionAround456); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:187: ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Identifier||LA14_0==33||(LA14_0>=69 && LA14_0<=71)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:188: ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:188: ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("59:188: ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 13, 0, input);

                                throw nvae;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:189: (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:189: (unnamed6= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:190: unnamed6= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definitionAround466);
                                    unnamed6=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed6); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:257: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( ((LA12_0>=32 && LA12_0<=33)) ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:258: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:258: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:259: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:259: ( ',' )?
                                            int alt11=2;
                                            int LA11_0 = input.LA(1);

                                            if ( (LA11_0==32) ) {
                                                alt11=1;
                                            }
                                            switch (alt11) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:260: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definitionAround474); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:302: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:303: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definitionAround481); if (failed) return cn;
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
                                    match(input,33,FOLLOW_33_in_r_definitionAround493); if (failed) return cn;
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
                    match(input,34,FOLLOW_34_in_r_definitionAround502); if (failed) return cn;
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
            match(input,35,FOLLOW_35_in_r_definitionAround511); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:138: (unnamed7= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:139: unnamed7= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definitionAround519);
            unnamed7=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed7); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:189: (unnamed8= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:190: unnamed8= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definitionAround527);
            unnamed8=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed8); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:244: ( ENDAROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:245: ENDAROUND
            {
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_r_definitionAround533); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:292: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:293: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definitionAround539); if (failed) return cn;
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
    // $ANTLR end r_definitionAround


    // $ANTLR start r_sequence
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:62:1: r_sequence returns [CompositeNode cn] : (unnamed9= r_textSequence ) ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )* ;
    public CompositeNode r_sequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed9 = null;

        CompositeNode unnamed10 = null;

        CompositeNode unnamed11 = null;


         cn = factory.createSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: ( (unnamed9= r_textSequence ) ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: (unnamed9= r_textSequence ) ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: (unnamed9= r_textSequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:3: unnamed9= r_textSequence
            {
            pushFollow(FOLLOW_r_textSequence_in_r_sequence564);
            unnamed9=r_textSequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed9); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:61: ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=StringLiteral && LA16_0<=Identifier)||LA16_0==31||(LA16_0>=36 && LA16_0<=39)||LA16_0==41||LA16_0==46||LA16_0==50||LA16_0==52||LA16_0==59||(LA16_0>=69 && LA16_0<=72)||(LA16_0>=78 && LA16_0<=79)||(LA16_0>=94 && LA16_0<=108)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:62: ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:62: ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:63: (unnamed10= r_statement ) (unnamed11= r_textSequence )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:63: (unnamed10= r_statement )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:64: unnamed10= r_statement
            	    {
            	    pushFollow(FOLLOW_r_statement_in_r_sequence574);
            	    unnamed10=r_statement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed10); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:121: (unnamed11= r_textSequence )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:122: unnamed11= r_textSequence
            	    {
            	    pushFollow(FOLLOW_r_textSequence_in_r_sequence582);
            	    unnamed11=r_textSequence();
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
    // $ANTLR end r_sequence


    // $ANTLR start r_statement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );
    public CompositeNode r_statement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_simpleStatement6 = null;

        CompositeNode r_fileStatement7 = null;

        CompositeNode r_foreachStatement8 = null;

        CompositeNode r_ifStatement9 = null;

        CompositeNode r_letStatement10 = null;

        CompositeNode r_protectStatement11 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:2: ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) )
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
                    new NoViableAltException("67:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:2: ( r_simpleStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:2: ( r_simpleStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:3: r_simpleStatement
                    {
                    pushFollow(FOLLOW_r_simpleStatement_in_r_statement603);
                    r_simpleStatement6=r_simpleStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_simpleStatement6; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:4: ( r_fileStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:4: ( r_fileStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:5: r_fileStatement
                    {
                    pushFollow(FOLLOW_r_fileStatement_in_r_statement612);
                    r_fileStatement7=r_fileStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_fileStatement7; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:4: ( r_foreachStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:4: ( r_foreachStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:5: r_foreachStatement
                    {
                    pushFollow(FOLLOW_r_foreachStatement_in_r_statement621);
                    r_foreachStatement8=r_foreachStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_foreachStatement8; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:4: ( r_ifStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:4: ( r_ifStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:5: r_ifStatement
                    {
                    pushFollow(FOLLOW_r_ifStatement_in_r_statement630);
                    r_ifStatement9=r_ifStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_ifStatement9; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:4: ( r_letStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:4: ( r_letStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:5: r_letStatement
                    {
                    pushFollow(FOLLOW_r_letStatement_in_r_statement639);
                    r_letStatement10=r_letStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_letStatement10; 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:4: ( r_protectStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:4: ( r_protectStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:5: r_protectStatement
                    {
                    pushFollow(FOLLOW_r_protectStatement_in_r_statement648);
                    r_protectStatement11=r_protectStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_protectStatement11; 
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
    // $ANTLR end r_statement


    // $ANTLR start r_textSequence
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:1: r_textSequence returns [CompositeNode cn] : (unnamed12= r_text ) ( ( (unnamed13= r_text ) ) )* ;
    public CompositeNode r_textSequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed12 = null;

        CompositeNode unnamed13 = null;


         cn = factory.createTextSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: ( (unnamed12= r_text ) ( ( (unnamed13= r_text ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: (unnamed12= r_text ) ( ( (unnamed13= r_text ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: (unnamed12= r_text )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:3: unnamed12= r_text
            {
            pushFollow(FOLLOW_r_text_in_r_textSequence678);
            unnamed12=r_text();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed12); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:55: ( ( (unnamed13= r_text ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:56: ( (unnamed13= r_text ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:56: ( (unnamed13= r_text ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:57: (unnamed13= r_text )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:57: (unnamed13= r_text )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:58: unnamed13= r_text
            	    {
            	    pushFollow(FOLLOW_r_text_in_r_textSequence688);
            	    unnamed13=r_text();
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
    // $ANTLR end r_textSequence


    // $ANTLR start r_text
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:81:1: r_text returns [CompositeNode cn] : ( '-' )? ( TEXT ) ;
    public CompositeNode r_text() throws RecognitionException {
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
                    match(input,36,FOLLOW_36_in_r_text714); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:45: ( TEXT )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:46: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_r_text721); if (failed) return cn;
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
    // $ANTLR end r_text


    // $ANTLR start r_simpleStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );
    public CompositeNode r_simpleStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_errorStatement12 = null;

        CompositeNode r_expandStatement13 = null;

        CompositeNode r_expressionStmt14 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:2: ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) )
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
                    new NoViableAltException("86:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:2: ( r_errorStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:2: ( r_errorStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:3: r_errorStatement
                    {
                    pushFollow(FOLLOW_r_errorStatement_in_r_simpleStatement739);
                    r_errorStatement12=r_errorStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_errorStatement12; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( r_expandStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( r_expandStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:5: r_expandStatement
                    {
                    pushFollow(FOLLOW_r_expandStatement_in_r_simpleStatement748);
                    r_expandStatement13=r_expandStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_expandStatement13; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:4: ( r_expressionStmt )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:4: ( r_expressionStmt )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:5: r_expressionStmt
                    {
                    pushFollow(FOLLOW_r_expressionStmt_in_r_simpleStatement757);
                    r_expressionStmt14=r_expressionStmt();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_expressionStmt14; 
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
    // $ANTLR end r_simpleStatement


    // $ANTLR start r_errorStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:1: r_errorStatement returns [CompositeNode cn] : ( 'ERROR' ) (unnamed14= r_expression ) ;
    public CompositeNode r_errorStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed14 = null;


         cn = factory.createErrorStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:2: ( ( 'ERROR' ) (unnamed14= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:2: ( 'ERROR' ) (unnamed14= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:2: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:3: 'ERROR'
            {
            match(input,37,FOLLOW_37_in_r_errorStatement780); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:48: (unnamed14= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:49: unnamed14= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_errorStatement788);
            unnamed14=r_expression();
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
    // $ANTLR end r_errorStatement


    // $ANTLR start r_expandStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:1: r_expandStatement returns [CompositeNode cn] : ( 'EXPAND' ) (unnamed15= r_simpleType ) ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )? ;
    public CompositeNode r_expandStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed15 = null;

        CompositeNode unnamed16 = null;

        CompositeNode unnamed17 = null;

        CompositeNode unnamed18 = null;

        CompositeNode unnamed19 = null;


         cn = factory.createExpandStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( ( 'EXPAND' ) (unnamed15= r_simpleType ) ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( 'EXPAND' ) (unnamed15= r_simpleType ) ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:2: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:3: 'EXPAND'
            {
            match(input,38,FOLLOW_38_in_r_expandStatement811); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:49: (unnamed15= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:50: unnamed15= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_expandStatement819);
            unnamed15=r_simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed15); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:108: ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:109: ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:109: ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:110: ( '(' ) (unnamed16= r_parameterList ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:110: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:111: '('
                    {
                    match(input,31,FOLLOW_31_in_r_expandStatement827); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:152: (unnamed16= r_parameterList )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:153: unnamed16= r_parameterList
                    {
                    pushFollow(FOLLOW_r_parameterList_in_r_expandStatement835);
                    unnamed16=r_parameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed16); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:214: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:215: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_expandStatement841); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:259: ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35||LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:260: ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:260: ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) )
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
                            new NoViableAltException("99:260: ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:261: ( ( ( 'FOR' ) (unnamed17= r_expression ) ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:261: ( ( ( 'FOR' ) (unnamed17= r_expression ) ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:262: ( ( 'FOR' ) (unnamed17= r_expression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:262: ( ( 'FOR' ) (unnamed17= r_expression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:263: ( 'FOR' ) (unnamed17= r_expression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:263: ( 'FOR' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:264: 'FOR'
                            {
                            match(input,35,FOLLOW_35_in_r_expandStatement854); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:307: (unnamed17= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:308: unnamed17= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement862);
                            unnamed17=r_expression();
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:4: ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:4: ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:5: ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:5: ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:6: ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:6: ( 'FOREACH' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:7: 'FOREACH'
                            {
                            match(input,39,FOLLOW_39_in_r_expandStatement875); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:54: (unnamed18= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:55: unnamed18= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement883);
                            unnamed18=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed18); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:113: ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==40) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:114: ( ( 'SEPARATOR' ) (unnamed19= r_expression ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:114: ( ( 'SEPARATOR' ) (unnamed19= r_expression ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:115: ( 'SEPARATOR' ) (unnamed19= r_expression )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:115: ( 'SEPARATOR' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:116: 'SEPARATOR'
                                    {
                                    match(input,40,FOLLOW_40_in_r_expandStatement891); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:165: (unnamed19= r_expression )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:100:166: unnamed19= r_expression
                                    {
                                    pushFollow(FOLLOW_r_expression_in_r_expandStatement899);
                                    unnamed19=r_expression();
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
    // $ANTLR end r_expandStatement


    // $ANTLR start r_expressionStmt
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:1: r_expressionStmt returns [CompositeNode cn] : (unnamed20= r_expression ) ;
    public CompositeNode r_expressionStmt() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed20 = null;


         cn = factory.createExpressionStmtNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: ( (unnamed20= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: (unnamed20= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: (unnamed20= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:3: unnamed20= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_expressionStmt932);
            unnamed20=r_expression();
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
    // $ANTLR end r_expressionStmt


    // $ANTLR start r_fileStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:1: r_fileStatement returns [CompositeNode cn] : ( 'FILE' ) (unnamed21= r_expression ) ( ( (unnamed22= r_identifier ) ) )? (unnamed23= r_sequence ) ( 'ENDFILE' ) ;
    public CompositeNode r_fileStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed21 = null;

        CompositeNode unnamed22 = null;

        CompositeNode unnamed23 = null;


         cn = factory.createFileStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( ( 'FILE' ) (unnamed21= r_expression ) ( ( (unnamed22= r_identifier ) ) )? (unnamed23= r_sequence ) ( 'ENDFILE' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( 'FILE' ) (unnamed21= r_expression ) ( ( (unnamed22= r_identifier ) ) )? (unnamed23= r_sequence ) ( 'ENDFILE' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:3: 'FILE'
            {
            match(input,41,FOLLOW_41_in_r_fileStatement955); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:47: (unnamed21= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:48: unnamed21= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_fileStatement963);
            unnamed21=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed21); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:106: ( ( (unnamed22= r_identifier ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Identifier) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:107: ( (unnamed22= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:107: ( (unnamed22= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:108: (unnamed22= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:108: (unnamed22= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:109: unnamed22= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_fileStatement973);
                    unnamed22=r_identifier();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:170: (unnamed23= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:171: unnamed23= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_fileStatement984);
            unnamed23=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed23); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:227: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:228: 'ENDFILE'
            {
            match(input,42,FOLLOW_42_in_r_fileStatement990); if (failed) return cn;
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
    // $ANTLR end r_fileStatement


    // $ANTLR start r_foreachStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:112:1: r_foreachStatement returns [CompositeNode cn] : ( 'FOREACH' ) (unnamed24= r_expression ) ( 'AS' ) (unnamed25= r_identifier ) ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )? (unnamed28= r_sequence ) ( 'ENDFOREACH' ) ;
    public CompositeNode r_foreachStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed24 = null;

        CompositeNode unnamed25 = null;

        CompositeNode unnamed26 = null;

        CompositeNode unnamed27 = null;

        CompositeNode unnamed28 = null;


         cn = factory.createForeachStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( ( 'FOREACH' ) (unnamed24= r_expression ) ( 'AS' ) (unnamed25= r_identifier ) ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )? (unnamed28= r_sequence ) ( 'ENDFOREACH' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( 'FOREACH' ) (unnamed24= r_expression ) ( 'AS' ) (unnamed25= r_identifier ) ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )? (unnamed28= r_sequence ) ( 'ENDFOREACH' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:2: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:3: 'FOREACH'
            {
            match(input,39,FOLLOW_39_in_r_foreachStatement1013); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:50: (unnamed24= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:51: unnamed24= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_foreachStatement1021);
            unnamed24=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed24); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:109: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:110: 'AS'
            {
            match(input,43,FOLLOW_43_in_r_foreachStatement1027); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:152: (unnamed25= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:153: unnamed25= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1035);
            unnamed25=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed25); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:211: ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:212: ( ( 'ITERATOR' ) (unnamed26= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:212: ( ( 'ITERATOR' ) (unnamed26= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:213: ( 'ITERATOR' ) (unnamed26= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:213: ( 'ITERATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:214: 'ITERATOR'
                    {
                    match(input,44,FOLLOW_44_in_r_foreachStatement1043); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:262: (unnamed26= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:263: unnamed26= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1051);
                    unnamed26=r_identifier();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:324: ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:325: ( ( 'SEPARATOR' ) (unnamed27= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:325: ( ( 'SEPARATOR' ) (unnamed27= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:326: ( 'SEPARATOR' ) (unnamed27= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:326: ( 'SEPARATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:327: 'SEPARATOR'
                    {
                    match(input,40,FOLLOW_40_in_r_foreachStatement1062); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:376: (unnamed27= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:377: unnamed27= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_foreachStatement1070);
                    unnamed27=r_expression();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:438: (unnamed28= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:439: unnamed28= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_foreachStatement1081);
            unnamed28=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed28); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:495: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:115:496: 'ENDFOREACH'
            {
            match(input,45,FOLLOW_45_in_r_foreachStatement1087); if (failed) return cn;
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
    // $ANTLR end r_foreachStatement


    // $ANTLR start r_ifStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:1: r_ifStatement returns [CompositeNode cn] : ( 'IF' ) (unnamed29= r_expression ) (unnamed30= r_sequence ) (unnamed31= r_elseIfStatement )* (unnamed32= r_elseStatement )? ( 'ENDIF' ) ;
    public CompositeNode r_ifStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed29 = null;

        CompositeNode unnamed30 = null;

        CompositeNode unnamed31 = null;

        CompositeNode unnamed32 = null;


         cn = factory.createIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( ( 'IF' ) (unnamed29= r_expression ) (unnamed30= r_sequence ) (unnamed31= r_elseIfStatement )* (unnamed32= r_elseStatement )? ( 'ENDIF' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( 'IF' ) (unnamed29= r_expression ) (unnamed30= r_sequence ) (unnamed31= r_elseIfStatement )* (unnamed32= r_elseStatement )? ( 'ENDIF' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:3: 'IF'
            {
            match(input,46,FOLLOW_46_in_r_ifStatement1110); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:45: (unnamed29= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:46: unnamed29= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_ifStatement1118);
            unnamed29=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed29); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:104: (unnamed30= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:105: unnamed30= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_ifStatement1126);
            unnamed30=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed30); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:161: (unnamed31= r_elseIfStatement )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:162: unnamed31= r_elseIfStatement
            	    {
            	    pushFollow(FOLLOW_r_elseIfStatement_in_r_ifStatement1134);
            	    unnamed31=r_elseIfStatement();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:226: (unnamed32= r_elseStatement )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:227: unnamed32= r_elseStatement
                    {
                    pushFollow(FOLLOW_r_elseStatement_in_r_ifStatement1143);
                    unnamed32=r_elseStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed32); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:289: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:290: 'ENDIF'
            {
            match(input,47,FOLLOW_47_in_r_ifStatement1150); if (failed) return cn;
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
    // $ANTLR end r_ifStatement


    // $ANTLR start r_elseIfStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:122:1: r_elseIfStatement returns [CompositeNode cn] : ( 'ELSEIF' ) (unnamed33= r_expression ) (unnamed34= r_sequence ) ;
    public CompositeNode r_elseIfStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed33 = null;

        CompositeNode unnamed34 = null;


         cn = factory.createElseIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:2: ( ( 'ELSEIF' ) (unnamed33= r_expression ) (unnamed34= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:2: ( 'ELSEIF' ) (unnamed33= r_expression ) (unnamed34= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:2: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:3: 'ELSEIF'
            {
            match(input,48,FOLLOW_48_in_r_elseIfStatement1173); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:49: (unnamed33= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:50: unnamed33= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_elseIfStatement1181);
            unnamed33=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed33); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:108: (unnamed34= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:125:109: unnamed34= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseIfStatement1189);
            unnamed34=r_sequence();
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
    // $ANTLR end r_elseIfStatement


    // $ANTLR start r_elseStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:1: r_elseStatement returns [CompositeNode cn] : ( 'ELSE' ) (unnamed35= r_sequence ) ;
    public CompositeNode r_elseStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed35 = null;


         cn = factory.createElseStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:2: ( ( 'ELSE' ) (unnamed35= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:2: ( 'ELSE' ) (unnamed35= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:2: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:3: 'ELSE'
            {
            match(input,49,FOLLOW_49_in_r_elseStatement1212); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:47: (unnamed35= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:48: unnamed35= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseStatement1220);
            unnamed35=r_sequence();
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
    // $ANTLR end r_elseStatement


    // $ANTLR start r_letStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:1: r_letStatement returns [CompositeNode cn] : ( 'LET' ) (unnamed36= r_expression ) ( 'AS' ) (unnamed37= r_identifier ) (unnamed38= r_sequence ) ( 'ENDLET' ) ;
    public CompositeNode r_letStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed36 = null;

        CompositeNode unnamed37 = null;

        CompositeNode unnamed38 = null;


         cn = factory.createLetStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( ( 'LET' ) (unnamed36= r_expression ) ( 'AS' ) (unnamed37= r_identifier ) (unnamed38= r_sequence ) ( 'ENDLET' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( 'LET' ) (unnamed36= r_expression ) ( 'AS' ) (unnamed37= r_identifier ) (unnamed38= r_sequence ) ( 'ENDLET' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:3: 'LET'
            {
            match(input,50,FOLLOW_50_in_r_letStatement1243); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:46: (unnamed36= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:47: unnamed36= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_letStatement1251);
            unnamed36=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed36); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:105: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:106: 'AS'
            {
            match(input,43,FOLLOW_43_in_r_letStatement1257); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:148: (unnamed37= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:149: unnamed37= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_letStatement1265);
            unnamed37=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed37); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:207: (unnamed38= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:208: unnamed38= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_letStatement1273);
            unnamed38=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed38); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:264: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:265: 'ENDLET'
            {
            match(input,51,FOLLOW_51_in_r_letStatement1279); if (failed) return cn;
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
    // $ANTLR end r_letStatement


    // $ANTLR start r_protectStatement
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:137:1: r_protectStatement returns [CompositeNode cn] : ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= r_expression ) ( 'CEND' ) (unnamed40= r_expression ) ( 'ID' ) (unnamed41= r_expression ) ( 'DISABLE' )? (unnamed42= r_sequence ) ( 'ENDPROTECT' ) ;
    public CompositeNode r_protectStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed39 = null;

        CompositeNode unnamed40 = null;

        CompositeNode unnamed41 = null;

        CompositeNode unnamed42 = null;


         cn = factory.createProtectStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:2: ( ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= r_expression ) ( 'CEND' ) (unnamed40= r_expression ) ( 'ID' ) (unnamed41= r_expression ) ( 'DISABLE' )? (unnamed42= r_sequence ) ( 'ENDPROTECT' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:2: ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= r_expression ) ( 'CEND' ) (unnamed40= r_expression ) ( 'ID' ) (unnamed41= r_expression ) ( 'DISABLE' )? (unnamed42= r_sequence ) ( 'ENDPROTECT' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:2: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:3: 'PROTECT'
            {
            match(input,52,FOLLOW_52_in_r_protectStatement1302); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:50: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:51: 'CSTART'
            {
            match(input,53,FOLLOW_53_in_r_protectStatement1308); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:97: (unnamed39= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:98: unnamed39= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1316);
            unnamed39=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed39); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:156: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:157: 'CEND'
            {
            match(input,54,FOLLOW_54_in_r_protectStatement1322); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:201: (unnamed40= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:202: unnamed40= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1330);
            unnamed40=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed40); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:260: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:261: 'ID'
            {
            match(input,55,FOLLOW_55_in_r_protectStatement1336); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:303: (unnamed41= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:304: unnamed41= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1344);
            unnamed41=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed41); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:362: ( 'DISABLE' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:363: 'DISABLE'
                    {
                    match(input,56,FOLLOW_56_in_r_protectStatement1350); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:411: (unnamed42= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:412: unnamed42= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_protectStatement1359);
            unnamed42=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed42); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:468: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:140:469: 'ENDPROTECT'
            {
            match(input,57,FOLLOW_57_in_r_protectStatement1365); if (failed) return cn;
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
    // $ANTLR end r_protectStatement


    // $ANTLR start r_check
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:142:1: r_check returns [CompositeNode cn] : ( 'context' ) (unnamed43= r_type ) ( ( ( 'if' ) (unnamed44= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= r_expression ) ( ':' ) (unnamed46= r_expression ) ( ';' ) ;
    public CompositeNode r_check() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed43 = null;

        CompositeNode unnamed44 = null;

        CompositeNode unnamed45 = null;

        CompositeNode unnamed46 = null;


         cn = factory.createCheckNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( ( 'context' ) (unnamed43= r_type ) ( ( ( 'if' ) (unnamed44= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= r_expression ) ( ':' ) (unnamed46= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( 'context' ) (unnamed43= r_type ) ( ( ( 'if' ) (unnamed44= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= r_expression ) ( ':' ) (unnamed46= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:3: 'context'
            {
            match(input,58,FOLLOW_58_in_r_check1388); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:50: (unnamed43= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:51: unnamed43= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_check1396);
            unnamed43=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed43); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:103: ( ( ( 'if' ) (unnamed44= r_expression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==59) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:104: ( ( 'if' ) (unnamed44= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:104: ( ( 'if' ) (unnamed44= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:105: ( 'if' ) (unnamed44= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:105: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:106: 'if'
                    {
                    match(input,59,FOLLOW_59_in_r_check1404); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:148: (unnamed44= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:149: unnamed44= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_check1412);
                    unnamed44=r_expression();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:210: ( ( ( 'ERROR' ) | ( 'WARNING' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:211: ( ( 'ERROR' ) | ( 'WARNING' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:211: ( ( 'ERROR' ) | ( 'WARNING' ) )
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
                    new NoViableAltException("145:211: ( ( 'ERROR' ) | ( 'WARNING' ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:212: ( 'ERROR' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:212: ( 'ERROR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:213: 'ERROR'
                    {
                    match(input,37,FOLLOW_37_in_r_check1423); if (failed) return cn;
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
                    match(input,60,FOLLOW_60_in_r_check1432); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:54: (unnamed45= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:55: unnamed45= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1442);
            unnamed45=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed45); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:113: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:114: ':'
            {
            match(input,61,FOLLOW_61_in_r_check1448); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:155: (unnamed46= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:156: unnamed46= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1456);
            unnamed46=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed46); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:214: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:146:215: ';'
            {
            match(input,28,FOLLOW_28_in_r_check1462); if (failed) return cn;
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
    // $ANTLR end r_check


    // $ANTLR start r_around
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:148:1: r_around returns [CompositeNode cn] : ( 'around' ) (unnamed47= r_pointcut ) ( '(' ) ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= r_expression ) ( ';' ) ;
    public CompositeNode r_around() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed47 = null;

        CompositeNode unnamed48 = null;

        CompositeNode unnamed49 = null;


         cn = factory.createAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( ( 'around' ) (unnamed47= r_pointcut ) ( '(' ) ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( 'around' ) (unnamed47= r_pointcut ) ( '(' ) ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:3: 'around'
            {
            match(input,62,FOLLOW_62_in_r_around1485); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:49: (unnamed47= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:50: unnamed47= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_around1493);
            unnamed47=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed47); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:106: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:107: '('
            {
            match(input,31,FOLLOW_31_in_r_around1499); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:148: ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier||LA36_0==33||(LA36_0>=69 && LA36_0<=71)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:149: ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:149: ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                            new NoViableAltException("151:149: ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:150: (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:150: (unnamed48= r_declaredParameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:151: unnamed48= r_declaredParameterList
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_around1509);
                            unnamed48=r_declaredParameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed48); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:220: ( ( ( ',' )? ( '*' ) ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=32 && LA34_0<=33)) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:221: ( ( ',' )? ( '*' ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:221: ( ( ',' )? ( '*' ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:222: ( ',' )? ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:222: ( ',' )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==32) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:223: ','
                                            {
                                            match(input,32,FOLLOW_32_in_r_around1517); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }
                                            break;

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:265: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:266: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_around1524); if (failed) return cn;
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
                            match(input,33,FOLLOW_33_in_r_around1536); if (failed) return cn;
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
            match(input,34,FOLLOW_34_in_r_around1545); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:91: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:92: ':'
            {
            match(input,61,FOLLOW_61_in_r_around1551); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:133: (unnamed49= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:134: unnamed49= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_around1559);
            unnamed49=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed49); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:192: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:152:193: ';'
            {
            match(input,28,FOLLOW_28_in_r_around1565); if (failed) return cn;
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
    // $ANTLR end r_around


    // $ANTLR start r_pointcut
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:154:1: r_pointcut returns [CompositeNode cn] : ( ( ( '*' ) | (unnamed50= r_identifier ) ) ) ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )* ;
    public CompositeNode r_pointcut() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed50 = null;

        CompositeNode unnamed51 = null;


         cn = factory.createPointcutNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( ( ( ( '*' ) | (unnamed50= r_identifier ) ) ) ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( ( ( '*' ) | (unnamed50= r_identifier ) ) ) ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( ( ( '*' ) | (unnamed50= r_identifier ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:3: ( ( '*' ) | (unnamed50= r_identifier ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:3: ( ( '*' ) | (unnamed50= r_identifier ) )
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
                    new NoViableAltException("157:3: ( ( '*' ) | (unnamed50= r_identifier ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:4: ( '*' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:4: ( '*' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:5: '*'
                    {
                    match(input,33,FOLLOW_33_in_r_pointcut1590); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:4: (unnamed50= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:4: (unnamed50= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:5: unnamed50= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut1601);
                    unnamed50=r_identifier();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:65: ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Identifier||LA39_0==33||LA39_0==63) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:66: ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:66: ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) )
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
            	            new NoViableAltException("158:66: ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) )", 38, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:67: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:67: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:158:68: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_pointcut1611); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:4: (unnamed51= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:4: (unnamed51= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:5: unnamed51= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_pointcut1622);
            	            unnamed51=r_identifier();
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
            	            match(input,63,FOLLOW_63_in_r_pointcut1631); if (failed) return cn;
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
    // $ANTLR end r_pointcut


    // $ANTLR start r_extension
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:1: r_extension returns [CompositeNode cn] : ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= r_type )? (name= r_identifier ) ( '(' ) (paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) ) ( ';' ) ;
    public CompositeNode r_extension() throws RecognitionException {
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= r_type )? (name= r_identifier ) ( '(' ) (paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= r_type )? (name= r_identifier ) ( '(' ) (paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) ) ( ';' )
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
            	            match(input,64,FOLLOW_64_in_r_extension1659); if (failed) return cn;
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
            	            match(input,65,FOLLOW_65_in_r_extension1668); if (failed) return cn;
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
            	            match(input,66,FOLLOW_66_in_r_extension1677); if (failed) return cn;
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:58: (returnType= r_type )?
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:59: returnType= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension1688);
                    returnType=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, returnType); ((ExtensionNode) cn).setReturnType(returnType); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:162: (name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:163: name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_extension1697);
            name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((ExtensionNode) cn).setName(name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:247: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:248: '('
            {
            match(input,31,FOLLOW_31_in_r_extension1703); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:289: (paramList= r_declaredParameterList )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Identifier||(LA43_0>=69 && LA43_0<=71)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:290: paramList= r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension1711);
                    paramList=r_declaredParameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, paramList); ((ExtensionNode) cn).setParamList(paramList); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:406: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:407: ')'
            {
            match(input,34,FOLLOW_34_in_r_extension1718); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:448: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:449: ':'
            {
            match(input,61,FOLLOW_61_in_r_extension1724); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:490: ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:491: ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:491: ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) )
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
                    new NoViableAltException("167:491: ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:492: ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:492: ( 'JAVA' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:493: 'JAVA'
                    {
                    match(input,67,FOLLOW_67_in_r_extension1732); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:537: (javaReturnType= r_javaType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:538: javaReturnType= r_javaType
                    {
                    pushFollow(FOLLOW_r_javaType_in_r_extension1740);
                    javaReturnType=r_javaType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, javaReturnType); ((ExtensionNode) cn).setJavaReturnType(javaReturnType); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:660: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:661: '.'
                    {
                    match(input,68,FOLLOW_68_in_r_extension1746); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:702: (javaName= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:703: javaName= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension1754);
                    javaName=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, javaName); ((ExtensionNode) cn).setJavaName(javaName); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:803: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:804: '('
                    {
                    match(input,31,FOLLOW_31_in_r_extension1760); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:845: ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==Identifier) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:846: ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:846: ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:847: (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )*
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:847: (unnamed52= r_javaType )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:848: unnamed52= r_javaType
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension1770);
                            unnamed52=r_javaType();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed52); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:904: ( ( ( ',' ) (unnamed53= r_javaType ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==32) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:905: ( ( ',' ) (unnamed53= r_javaType ) )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:905: ( ( ',' ) (unnamed53= r_javaType ) )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:906: ( ',' ) (unnamed53= r_javaType )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:906: ( ',' )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:907: ','
                            	    {
                            	    match(input,32,FOLLOW_32_in_r_extension1778); if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addLeafNodeForToken(cn, null); 
                            	    }

                            	    }

                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:948: (unnamed53= r_javaType )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:949: unnamed53= r_javaType
                            	    {
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension1786);
                            	    unnamed53=r_javaType();
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:1011: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:167:1012: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_extension1798); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:4: (extendBody= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:4: (extendBody= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:5: extendBody= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension1809);
                    extendBody=r_expression();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:115: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:116: ';'
            {
            match(input,28,FOLLOW_28_in_r_extension1817); if (failed) return cn;
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
    // $ANTLR end r_extension


    // $ANTLR start r_javaType
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:170:1: r_javaType returns [CompositeNode cn] : (unnamed54= r_identifier ) ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* ;
    public CompositeNode r_javaType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed54 = null;

        CompositeNode unnamed55 = null;


         cn = factory.createJavaTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:2: ( (unnamed54= r_identifier ) ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:2: (unnamed54= r_identifier ) ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:2: (unnamed54= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:3: unnamed54= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_javaType1842);
            unnamed54=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed54); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:61: ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:62: ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:62: ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:63: ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:63: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:64: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_r_javaType1850); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:105: ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:106: ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:106: ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
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
            	            new NoViableAltException("173:106: ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 47, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt47) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:107: (unnamed55= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:107: (unnamed55= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:108: unnamed55= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType1860);
            	            unnamed55=r_identifier();
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
            	            match(input,69,FOLLOW_69_in_r_javaType1869); if (failed) return cn;
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
            	            match(input,70,FOLLOW_70_in_r_javaType1878); if (failed) return cn;
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
            	            match(input,71,FOLLOW_71_in_r_javaType1887); if (failed) return cn;
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
    // $ANTLR end r_javaType


    // $ANTLR start r_test_expression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:178:1: r_test_expression returns [CompositeNode cn] : (unnamed56= r_expression ) ( EOF ) ;
    public CompositeNode r_test_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed56 = null;


         cn = factory.createTest_expressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: ( (unnamed56= r_expression ) ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: (unnamed56= r_expression ) ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: (unnamed56= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:3: unnamed56= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_test_expression1922);
            unnamed56=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed56); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:61: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:62: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_r_test_expression1928); if (failed) return cn;

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
    // $ANTLR end r_test_expression


    // $ANTLR start r_expression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:184:1: r_expression returns [CompositeNode cn] : (unnamed57= r_letExpression ) ;
    public CompositeNode r_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed57 = null;


         cn = factory.createExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( (unnamed57= r_letExpression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: (unnamed57= r_letExpression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: (unnamed57= r_letExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:3: unnamed57= r_letExpression
            {
            pushFollow(FOLLOW_r_letExpression_in_r_expression1956);
            unnamed57=r_letExpression();
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
    // $ANTLR end r_expression


    // $ANTLR start r_letExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression ) | (unnamed61= r_castedExpression ) );
    public CompositeNode r_letExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed58 = null;

        CompositeNode unnamed59 = null;

        CompositeNode unnamed60 = null;

        CompositeNode unnamed61 = null;


         cn = factory.createLetExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:2: ( ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression ) | (unnamed61= r_castedExpression ) )
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
                    new NoViableAltException("190:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression ) | (unnamed61= r_castedExpression ) );", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:2: ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:2: ( 'let' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:3: 'let'
                    {
                    match(input,72,FOLLOW_72_in_r_letExpression1984); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:46: (unnamed58= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:47: unnamed58= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression1992);
                    unnamed58=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed58); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:105: ( '=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:106: '='
                    {
                    match(input,73,FOLLOW_73_in_r_letExpression1998); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:147: (unnamed59= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:148: unnamed59= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2006);
                    unnamed59=r_castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed59); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:212: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:213: ':'
                    {
                    match(input,61,FOLLOW_61_in_r_letExpression2012); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:254: (unnamed60= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:255: unnamed60= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_letExpression2020);
                    unnamed60=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed60); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:4: (unnamed61= r_castedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:4: (unnamed61= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:5: unnamed61= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2031);
                    unnamed61=r_castedExpression();
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
    // $ANTLR end r_letExpression


    // $ANTLR start r_castedExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) ) | (unnamed64= r_chainExpression ) );
    public CompositeNode r_castedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed62 = null;

        CompositeNode unnamed63 = null;

        CompositeNode unnamed64 = null;


         cn = factory.createCastedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:2: ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) ) | (unnamed64= r_chainExpression ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:2: ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:38: ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:39: ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:39: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:40: '('
                    {
                    match(input,31,FOLLOW_31_in_r_castedExpression2070); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:81: (unnamed62= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:82: unnamed62= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_castedExpression2078);
                    unnamed62=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed62); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:134: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:135: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_castedExpression2084); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:176: (unnamed63= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:177: unnamed63= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2092);
                    unnamed63=r_chainExpression();
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:4: (unnamed64= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:4: (unnamed64= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:202:5: unnamed64= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2104);
                    unnamed64=r_chainExpression();
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
    // $ANTLR end r_castedExpression


    // $ANTLR start r_chainExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:204:1: r_chainExpression returns [CompositeNode cn] : (unnamed65= r_ifExpression ) ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )* ;
    public CompositeNode r_chainExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed65 = null;

        CompositeNode unnamed66 = null;


         cn = factory.createChainExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:2: ( (unnamed65= r_ifExpression ) ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:2: (unnamed65= r_ifExpression ) ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:2: (unnamed65= r_ifExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:3: unnamed65= r_ifExpression
            {
            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2134);
            unnamed65=r_ifExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed65); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:63: ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==74) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:64: ( ( '->' ) (unnamed66= r_ifExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:64: ( ( '->' ) (unnamed66= r_ifExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:65: ( '->' ) (unnamed66= r_ifExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:65: ( '->' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:66: '->'
            	    {
            	    match(input,74,FOLLOW_74_in_r_chainExpression2142); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:108: (unnamed66= r_ifExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:109: unnamed66= r_ifExpression
            	    {
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2150);
            	    unnamed66=r_ifExpression();
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
    // $ANTLR end r_chainExpression


    // $ANTLR start r_ifExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:210:1: r_ifExpression returns [CompositeNode cn] : ( (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )? | ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )? );
    public CompositeNode r_ifExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed67 = null;

        CompositeNode unnamed68 = null;

        CompositeNode unnamed69 = null;

        CompositeNode unnamed70 = null;

        CompositeNode unnamed71 = null;

        CompositeNode unnamed72 = null;


         cn = factory.createIfExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: ( (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )? | ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )? )
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
                    new NoViableAltException("210:1: r_ifExpression returns [CompositeNode cn] : ( (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )? | ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )? );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: (unnamed67= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:3: unnamed67= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2183);
                    unnamed67=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed67); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:67: ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==75) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:68: ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:68: ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:69: ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:69: ( '?' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:70: '?'
                            {
                            match(input,75,FOLLOW_75_in_r_ifExpression2191); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:111: (unnamed68= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:112: unnamed68= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression2199);
                            unnamed68=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed68); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:170: ( ':' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:171: ':'
                            {
                            match(input,61,FOLLOW_61_in_r_ifExpression2205); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:212: (unnamed69= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:213: unnamed69= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2213);
                            unnamed69=r_switchExpression();
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:4: ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:4: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:5: 'if'
                    {
                    match(input,59,FOLLOW_59_in_r_ifExpression2225); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:47: (unnamed70= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:48: unnamed70= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression2233);
                    unnamed70=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed70); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:106: ( 'then' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:107: 'then'
                    {
                    match(input,76,FOLLOW_76_in_r_ifExpression2239); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:151: (unnamed71= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:152: unnamed71= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2247);
                    unnamed71=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed71); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:216: ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==77) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:217: ( ( 'else' ) (unnamed72= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:217: ( ( 'else' ) (unnamed72= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:218: ( 'else' ) (unnamed72= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:218: ( 'else' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:219: 'else'
                            {
                            match(input,77,FOLLOW_77_in_r_ifExpression2255); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:263: (unnamed72= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:215:264: unnamed72= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2263);
                            unnamed72=r_switchExpression();
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
    // $ANTLR end r_ifExpression


    // $ANTLR start r_switchExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' ) | (unnamed76= r_orExpression ) );
    public CompositeNode r_switchExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed73 = null;

        CompositeNode unnamed74 = null;

        CompositeNode unnamed75 = null;

        CompositeNode unnamed76 = null;


         cn = factory.createSwitchExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' ) | (unnamed76= r_orExpression ) )
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
                    new NoViableAltException("217:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' ) | (unnamed76= r_orExpression ) );", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( 'switch' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:3: 'switch'
                    {
                    match(input,78,FOLLOW_78_in_r_switchExpression2294); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:49: ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==31) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:50: ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:50: ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:51: ( '(' ) (unnamed73= r_orExpression ) ( ')' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:51: ( '(' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:52: '('
                            {
                            match(input,31,FOLLOW_31_in_r_switchExpression2302); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:93: (unnamed73= r_orExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:94: unnamed73= r_orExpression
                            {
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2310);
                            unnamed73=r_orExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed73); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:154: ( ')' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:155: ')'
                            {
                            match(input,34,FOLLOW_34_in_r_switchExpression2316); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:199: ( '{' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:200: '{'
                    {
                    match(input,79,FOLLOW_79_in_r_switchExpression2325); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:241: (unnamed74= r_casePart )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==82) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:242: unnamed74= r_casePart
                    	    {
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression2333);
                    	    unnamed74=r_casePart();
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:299: ( 'default' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:300: 'default'
                    {
                    match(input,80,FOLLOW_80_in_r_switchExpression2340); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:347: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:348: ':'
                    {
                    match(input,61,FOLLOW_61_in_r_switchExpression2346); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:389: (unnamed75= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:390: unnamed75= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2354);
                    unnamed75=r_orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed75); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:450: ( '}' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:451: '}'
                    {
                    match(input,81,FOLLOW_81_in_r_switchExpression2360); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: (unnamed76= r_orExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: (unnamed76= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:5: unnamed76= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2371);
                    unnamed76=r_orExpression();
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
    // $ANTLR end r_switchExpression


    // $ANTLR start r_casePart
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:224:1: r_casePart returns [CompositeNode cn] : ( 'case' ) (unnamed77= r_expression ) ( ':' ) (unnamed78= r_expression ) ;
    public CompositeNode r_casePart() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed77 = null;

        CompositeNode unnamed78 = null;


         cn = factory.createCasePartNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( ( 'case' ) (unnamed77= r_expression ) ( ':' ) (unnamed78= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( 'case' ) (unnamed77= r_expression ) ( ':' ) (unnamed78= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:3: 'case'
            {
            match(input,82,FOLLOW_82_in_r_casePart2394); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:47: (unnamed77= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:48: unnamed77= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2402);
            unnamed77=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed77); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:106: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:107: ':'
            {
            match(input,61,FOLLOW_61_in_r_casePart2408); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:148: (unnamed78= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:149: unnamed78= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2416);
            unnamed78=r_expression();
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
    // $ANTLR end r_casePart


    // $ANTLR start r_orExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:1: r_orExpression returns [CompositeNode cn] : (unnamed79= r_andExpression ) ( ( ( '||' ) (unnamed80= r_andExpression ) ) )* ;
    public CompositeNode r_orExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed79 = null;

        CompositeNode unnamed80 = null;


         cn = factory.createOrExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: ( (unnamed79= r_andExpression ) ( ( ( '||' ) (unnamed80= r_andExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: (unnamed79= r_andExpression ) ( ( ( '||' ) (unnamed80= r_andExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:2: (unnamed79= r_andExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:3: unnamed79= r_andExpression
            {
            pushFollow(FOLLOW_r_andExpression_in_r_orExpression2446);
            unnamed79=r_andExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed79); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:64: ( ( ( '||' ) (unnamed80= r_andExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==83) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:65: ( ( '||' ) (unnamed80= r_andExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:65: ( ( '||' ) (unnamed80= r_andExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:66: ( '||' ) (unnamed80= r_andExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:66: ( '||' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:67: '||'
            	    {
            	    match(input,83,FOLLOW_83_in_r_orExpression2454); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:109: (unnamed80= r_andExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:110: unnamed80= r_andExpression
            	    {
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression2462);
            	    unnamed80=r_andExpression();
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
    // $ANTLR end r_orExpression


    // $ANTLR start r_andExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:1: r_andExpression returns [CompositeNode cn] : (unnamed81= r_impliesExpression ) ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )* ;
    public CompositeNode r_andExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed81 = null;

        CompositeNode unnamed82 = null;


         cn = factory.createAndExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: ( (unnamed81= r_impliesExpression ) ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: (unnamed81= r_impliesExpression ) ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:2: (unnamed81= r_impliesExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:3: unnamed81= r_impliesExpression
            {
            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2495);
            unnamed81=r_impliesExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed81); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:68: ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==84) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:69: ( ( '&&' ) (unnamed82= r_impliesExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:69: ( ( '&&' ) (unnamed82= r_impliesExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:70: ( '&&' ) (unnamed82= r_impliesExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:70: ( '&&' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:71: '&&'
            	    {
            	    match(input,84,FOLLOW_84_in_r_andExpression2503); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:113: (unnamed82= r_impliesExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:114: unnamed82= r_impliesExpression
            	    {
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2511);
            	    unnamed82=r_impliesExpression();
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
    // $ANTLR end r_andExpression


    // $ANTLR start r_impliesExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:241:1: r_impliesExpression returns [CompositeNode cn] : (unnamed83= r_relationalExpression ) ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )* ;
    public CompositeNode r_impliesExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed83 = null;

        CompositeNode unnamed84 = null;


         cn = factory.createImpliesExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:2: ( (unnamed83= r_relationalExpression ) ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:2: (unnamed83= r_relationalExpression ) ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:2: (unnamed83= r_relationalExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:3: unnamed83= r_relationalExpression
            {
            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2544);
            unnamed83=r_relationalExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed83); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:71: ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==85) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:72: ( ( 'implies' ) (unnamed84= r_relationalExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:72: ( ( 'implies' ) (unnamed84= r_relationalExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:73: ( 'implies' ) (unnamed84= r_relationalExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:73: ( 'implies' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:74: 'implies'
            	    {
            	    match(input,85,FOLLOW_85_in_r_impliesExpression2552); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:121: (unnamed84= r_relationalExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:122: unnamed84= r_relationalExpression
            	    {
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2560);
            	    unnamed84=r_relationalExpression();
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
    // $ANTLR end r_impliesExpression


    // $ANTLR start r_relationalExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:247:1: r_relationalExpression returns [CompositeNode cn] : (leftOperand= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (rightOperand= r_additiveExpression ) ) )* ;
    public CompositeNode r_relationalExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode leftOperand = null;

        CompositeNode rightOperand = null;


         cn = factory.createRelationalExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: ( (leftOperand= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (rightOperand= r_additiveExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: (leftOperand= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (rightOperand= r_additiveExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: (leftOperand= r_additiveExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:3: leftOperand= r_additiveExpression
            {
            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2593);
            leftOperand=r_additiveExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, leftOperand); ((RelationalExpressionNode) cn).setLeftOperand(leftOperand); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:134: ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (rightOperand= r_additiveExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=86 && LA62_0<=91)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:135: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (rightOperand= r_additiveExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:135: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (rightOperand= r_additiveExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:136: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (rightOperand= r_additiveExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:136: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:137: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:137: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            	    int alt61=6;
            	    switch ( input.LA(1) ) {
            	    case 86:
            	        {
            	        alt61=1;
            	        }
            	        break;
            	    case 87:
            	        {
            	        alt61=2;
            	        }
            	        break;
            	    case 88:
            	        {
            	        alt61=3;
            	        }
            	        break;
            	    case 89:
            	        {
            	        alt61=4;
            	        }
            	        break;
            	    case 90:
            	        {
            	        alt61=5;
            	        }
            	        break;
            	    case 91:
            	        {
            	        alt61=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("251:137: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )", 61, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt61) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:138: ( '==' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:138: ( '==' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:139: '=='
            	            {
            	            match(input,86,FOLLOW_86_in_r_relationalExpression2603); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "operator"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:4: ( '!=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:4: ( '!=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:5: '!='
            	            {
            	            match(input,87,FOLLOW_87_in_r_relationalExpression2612); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "operator"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:4: ( '>=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:4: ( '>=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:5: '>='
            	            {
            	            match(input,88,FOLLOW_88_in_r_relationalExpression2621); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "operator"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:254:4: ( '<=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:254:4: ( '<=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:254:5: '<='
            	            {
            	            match(input,89,FOLLOW_89_in_r_relationalExpression2630); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "operator"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:255:4: ( '>' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:255:4: ( '>' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:255:5: '>'
            	            {
            	            match(input,90,FOLLOW_90_in_r_relationalExpression2639); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "operator"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:4: ( '<' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:4: ( '<' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:5: '<'
            	            {
            	            match(input,91,FOLLOW_91_in_r_relationalExpression2648); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "operator"); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:54: (rightOperand= r_additiveExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:55: rightOperand= r_additiveExpression
            	    {
            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2658);
            	    rightOperand=r_additiveExpression();
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
            	    break loop62;
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
    // $ANTLR end r_relationalExpression


    // $ANTLR start r_additiveExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:1: r_additiveExpression returns [CompositeNode cn] : (unnamed85= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )* ;
    public CompositeNode r_additiveExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed85 = null;

        CompositeNode unnamed86 = null;


         cn = factory.createAdditiveExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:2: ( (unnamed85= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:2: (unnamed85= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:2: (unnamed85= r_multiplicativeExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:3: unnamed85= r_multiplicativeExpression
            {
            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2691);
            unnamed85=r_multiplicativeExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed85); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:75: ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:76: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:76: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:77: ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:77: ( ( ( '+' ) | ( '-' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:78: ( ( '+' ) | ( '-' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:78: ( ( '+' ) | ( '-' ) )
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
            	            new NoViableAltException("262:78: ( ( '+' ) | ( '-' ) )", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:79: ( '+' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:79: ( '+' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:80: '+'
            	            {
            	            match(input,92,FOLLOW_92_in_r_additiveExpression2701); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:4: ( '-' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:4: ( '-' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:5: '-'
            	            {
            	            match(input,36,FOLLOW_36_in_r_additiveExpression2710); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:48: (unnamed86= r_multiplicativeExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:49: unnamed86= r_multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2720);
            	    unnamed86=r_multiplicativeExpression();
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
    // $ANTLR end r_additiveExpression


    // $ANTLR start r_multiplicativeExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:1: r_multiplicativeExpression returns [CompositeNode cn] : (unnamed87= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )* ;
    public CompositeNode r_multiplicativeExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed87 = null;

        CompositeNode unnamed88 = null;


         cn = factory.createMultiplicativeExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:2: ( (unnamed87= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:2: (unnamed87= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:2: (unnamed87= r_unaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:3: unnamed87= r_unaryExpression
            {
            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2753);
            unnamed87=r_unaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed87); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:66: ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==33||LA66_0==93) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:67: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:67: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:68: ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:68: ( ( ( '*' ) | ( '/' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:69: ( ( '*' ) | ( '/' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:69: ( ( '*' ) | ( '/' ) )
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
            	            new NoViableAltException("269:69: ( ( '*' ) | ( '/' ) )", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:70: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:70: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:71: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_multiplicativeExpression2763); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:270:4: ( '/' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:270:4: ( '/' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:270:5: '/'
            	            {
            	            match(input,93,FOLLOW_93_in_r_multiplicativeExpression2772); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:270:48: (unnamed88= r_unaryExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:270:49: unnamed88= r_unaryExpression
            	    {
            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2782);
            	    unnamed88=r_unaryExpression();
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
    // $ANTLR end r_multiplicativeExpression


    // $ANTLR start r_unaryExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:1: r_unaryExpression returns [CompositeNode cn] : ( (unnamed89= r_infixExpression ) | ( '!' ) (unnamed90= r_infixExpression ) | ( '-' ) (unnamed91= r_infixExpression ) );
    public CompositeNode r_unaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed89 = null;

        CompositeNode unnamed90 = null;

        CompositeNode unnamed91 = null;


         cn = factory.createUnaryExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:2: ( (unnamed89= r_infixExpression ) | ( '!' ) (unnamed90= r_infixExpression ) | ( '-' ) (unnamed91= r_infixExpression ) )
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
                    new NoViableAltException("272:1: r_unaryExpression returns [CompositeNode cn] : ( (unnamed89= r_infixExpression ) | ( '!' ) (unnamed90= r_infixExpression ) | ( '-' ) (unnamed91= r_infixExpression ) );", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:2: (unnamed89= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:2: (unnamed89= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:3: unnamed89= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2815);
                    unnamed89=r_infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed89); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:277:4: ( '!' ) (unnamed90= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:277:4: ( '!' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:277:5: '!'
                    {
                    match(input,94,FOLLOW_94_in_r_unaryExpression2824); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:277:46: (unnamed90= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:277:47: unnamed90= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2832);
                    unnamed90=r_infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed90); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:278:4: ( '-' ) (unnamed91= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:278:4: ( '-' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:278:5: '-'
                    {
                    match(input,36,FOLLOW_36_in_r_unaryExpression2841); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:278:46: (unnamed91= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:278:47: unnamed91= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2849);
                    unnamed91=r_infixExpression();
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
    // $ANTLR end r_unaryExpression


    // $ANTLR start r_infixExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:1: r_infixExpression returns [CompositeNode cn] : (target= r_primaryExpression ) ( ( ( '.' ) (calls= r_featureCall ) ) )* ;
    public CompositeNode r_infixExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode target = null;

        CompositeNode calls = null;


         cn = factory.createInfixExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:2: ( (target= r_primaryExpression ) ( ( ( '.' ) (calls= r_featureCall ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:2: (target= r_primaryExpression ) ( ( ( '.' ) (calls= r_featureCall ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:2: (target= r_primaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:3: target= r_primaryExpression
            {
            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression2879);
            target=r_primaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, target); ((InfixExpressionNode) cn).setTarget(target); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:108: ( ( ( '.' ) (calls= r_featureCall ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==68) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:109: ( ( '.' ) (calls= r_featureCall ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:109: ( ( '.' ) (calls= r_featureCall ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:110: ( '.' ) (calls= r_featureCall )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:110: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:111: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_r_infixExpression2887); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:152: (calls= r_featureCall )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:284:153: calls= r_featureCall
            	    {
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression2895);
            	    calls=r_featureCall();
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
    // $ANTLR end r_infixExpression


    // $ANTLR start r_primaryExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );
    public CompositeNode r_primaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_stringLiteral15 = null;

        CompositeNode r_featureCall16 = null;

        CompositeNode r_booleanLiteral17 = null;

        CompositeNode r_numberLiteral18 = null;

        CompositeNode r_nullLiteral19 = null;

        CompositeNode r_listLiteral20 = null;

        CompositeNode r_constructorCall21 = null;

        CompositeNode r_globalVarExpression22 = null;

        CompositeNode r_paranthesizedExpression23 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) )
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
                    new NoViableAltException("286:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: ( r_stringLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: ( r_stringLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:3: r_stringLiteral
                    {
                    pushFollow(FOLLOW_r_stringLiteral_in_r_primaryExpression2916);
                    r_stringLiteral15=r_stringLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_stringLiteral15; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:288:4: ( r_featureCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:288:4: ( r_featureCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:288:5: r_featureCall
                    {
                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression2925);
                    r_featureCall16=r_featureCall();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_featureCall16; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:4: ( r_booleanLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:4: ( r_booleanLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:5: r_booleanLiteral
                    {
                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression2934);
                    r_booleanLiteral17=r_booleanLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_booleanLiteral17; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:290:4: ( r_numberLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:290:4: ( r_numberLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:290:5: r_numberLiteral
                    {
                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression2943);
                    r_numberLiteral18=r_numberLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_numberLiteral18; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:291:4: ( r_nullLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:291:4: ( r_nullLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:291:5: r_nullLiteral
                    {
                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression2952);
                    r_nullLiteral19=r_nullLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_nullLiteral19; 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:292:4: ( r_listLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:292:4: ( r_listLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:292:5: r_listLiteral
                    {
                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression2961);
                    r_listLiteral20=r_listLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_listLiteral20; 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:4: ( r_constructorCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:4: ( r_constructorCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:5: r_constructorCall
                    {
                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression2970);
                    r_constructorCall21=r_constructorCall();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_constructorCall21; 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:4: ( r_globalVarExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:4: ( r_globalVarExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:5: r_globalVarExpression
                    {
                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression2979);
                    r_globalVarExpression22=r_globalVarExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_globalVarExpression22; 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( r_paranthesizedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( r_paranthesizedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:5: r_paranthesizedExpression
                    {
                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression2988);
                    r_paranthesizedExpression23=r_paranthesizedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_paranthesizedExpression23; 
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
    // $ANTLR end r_primaryExpression


    // $ANTLR start r_stringLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:1: r_stringLiteral returns [CompositeNode cn] : ( StringLiteral ) ;
    public CompositeNode r_stringLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createStringLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:2: ( ( StringLiteral ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:2: ( StringLiteral )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:2: ( StringLiteral )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:300:3: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_r_stringLiteral3011); if (failed) return cn;
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
    // $ANTLR end r_stringLiteral


    // $ANTLR start r_paranthesizedExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:1: r_paranthesizedExpression returns [CompositeNode cn] : ( '(' ) (unnamed92= r_expression ) ( ')' ) ;
    public CompositeNode r_paranthesizedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed92 = null;


         cn = factory.createParanthesizedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( ( '(' ) (unnamed92= r_expression ) ( ')' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( '(' ) (unnamed92= r_expression ) ( ')' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:3: '('
            {
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression3034); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:44: (unnamed92= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:45: unnamed92= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression3042);
            unnamed92=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed92); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:103: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:104: ')'
            {
            match(input,34,FOLLOW_34_in_r_paranthesizedExpression3048); if (failed) return cn;
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
    // $ANTLR end r_paranthesizedExpression


    // $ANTLR start r_globalVarExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:1: r_globalVarExpression returns [CompositeNode cn] : ( 'GLOBALVAR' ) (unnamed93= r_identifier ) ;
    public CompositeNode r_globalVarExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed93 = null;


         cn = factory.createGlobalVarExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:2: ( ( 'GLOBALVAR' ) (unnamed93= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:2: ( 'GLOBALVAR' ) (unnamed93= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:2: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:3: 'GLOBALVAR'
            {
            match(input,95,FOLLOW_95_in_r_globalVarExpression3071); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:52: (unnamed93= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:53: unnamed93= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression3079);
            unnamed93=r_identifier();
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
    // $ANTLR end r_globalVarExpression


    // $ANTLR start r_featureCall
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:312:1: r_featureCall returns [CompositeNode cn] : ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) );
    public CompositeNode r_featureCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode name = null;

        CompositeNode paramList = null;

        CompositeNode unnamed94 = null;

        CompositeNode unnamed95 = null;


         cn = factory.createFeatureCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:2: ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==31) ) {
                    alt71=1;
                }
                else if ( (LA71_1==EOF||LA71_1==TEXT||LA71_1==Identifier||LA71_1==28||(LA71_1>=32 && LA71_1<=34)||(LA71_1>=36 && LA71_1<=37)||LA71_1==40||LA71_1==43||(LA71_1>=54 && LA71_1<=56)||(LA71_1>=60 && LA71_1<=61)||LA71_1==63||LA71_1==68||(LA71_1>=74 && LA71_1<=77)||(LA71_1>=80 && LA71_1<=93)) ) {
                    alt71=2;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("312:1: r_featureCall returns [CompositeNode cn] : ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) );", 71, 1, input);

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
                    new NoViableAltException("312:1: r_featureCall returns [CompositeNode cn] : ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) );", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:2: (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:2: (name= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:3: name= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_featureCall3109);
                    name=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, name); ((FeatureCallNode) cn).setName(name); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:89: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:90: '('
                    {
                    match(input,31,FOLLOW_31_in_r_featureCall3115); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:131: ( ( (paramList= r_parameterList ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( ((LA70_0>=StringLiteral && LA70_0<=Identifier)||LA70_0==31||LA70_0==36||LA70_0==59||(LA70_0>=69 && LA70_0<=72)||(LA70_0>=78 && LA70_0<=79)||(LA70_0>=94 && LA70_0<=108)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:132: ( (paramList= r_parameterList ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:132: ( (paramList= r_parameterList ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:133: (paramList= r_parameterList )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:133: (paramList= r_parameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:134: paramList= r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall3125);
                            paramList=r_parameterList();
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:246: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:316:247: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_featureCall3134); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:317:4: (unnamed94= r_type )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:317:4: (unnamed94= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:317:5: unnamed94= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_featureCall3145);
                    unnamed94=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed94); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:4: (unnamed95= r_collectionExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:4: (unnamed95= r_collectionExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:5: unnamed95= r_collectionExpression
                    {
                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall3156);
                    unnamed95=r_collectionExpression();
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
    // $ANTLR end r_featureCall


    // $ANTLR start r_listLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:320:1: r_listLiteral returns [CompositeNode cn] : ( '{' ) ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )? ( '}' ) ;
    public CompositeNode r_listLiteral() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed96 = null;

        CompositeNode unnamed97 = null;


         cn = factory.createListLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:2: ( ( '{' ) ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )? ( '}' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:2: ( '{' ) ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )? ( '}' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:2: ( '{' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:3: '{'
            {
            match(input,79,FOLLOW_79_in_r_listLiteral3179); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:44: ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=StringLiteral && LA73_0<=Identifier)||LA73_0==31||LA73_0==36||LA73_0==59||(LA73_0>=69 && LA73_0<=72)||(LA73_0>=78 && LA73_0<=79)||(LA73_0>=94 && LA73_0<=108)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:45: ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:45: ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:46: (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )*
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:46: (unnamed96= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:47: unnamed96= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral3189);
                    unnamed96=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed96); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:105: ( ( ( ',' ) (unnamed97= r_expression ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==32) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:106: ( ( ',' ) (unnamed97= r_expression ) )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:106: ( ( ',' ) (unnamed97= r_expression ) )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:107: ( ',' ) (unnamed97= r_expression )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:107: ( ',' )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:108: ','
                    	    {
                    	    match(input,32,FOLLOW_32_in_r_listLiteral3197); if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addLeafNodeForToken(cn, null); 
                    	    }

                    	    }

                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:149: (unnamed97= r_expression )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:150: unnamed97= r_expression
                    	    {
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral3205);
                    	    unnamed97=r_expression();
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:214: ( '}' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:215: '}'
            {
            match(input,81,FOLLOW_81_in_r_listLiteral3217); if (failed) return cn;
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
    // $ANTLR end r_listLiteral


    // $ANTLR start r_constructorCall
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:325:1: r_constructorCall returns [CompositeNode cn] : ( 'new' ) (unnamed98= r_simpleType ) ;
    public CompositeNode r_constructorCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed98 = null;


         cn = factory.createConstructorCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:2: ( ( 'new' ) (unnamed98= r_simpleType ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:2: ( 'new' ) (unnamed98= r_simpleType )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:2: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:3: 'new'
            {
            match(input,96,FOLLOW_96_in_r_constructorCall3240); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:46: (unnamed98= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:328:47: unnamed98= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall3248);
            unnamed98=r_simpleType();
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
    // $ANTLR end r_constructorCall


    // $ANTLR start r_booleanLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:1: r_booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );
    public CompositeNode r_booleanLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createBooleanLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:2: ( ( 'false' ) | ( 'true' ) )
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
                    new NoViableAltException("330:1: r_booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:2: ( 'false' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:2: ( 'false' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:3: 'false'
                    {
                    match(input,97,FOLLOW_97_in_r_booleanLiteral3271); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:4: ( 'true' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:4: ( 'true' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:5: 'true'
                    {
                    match(input,98,FOLLOW_98_in_r_booleanLiteral3280); if (failed) return cn;
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
    // $ANTLR end r_booleanLiteral


    // $ANTLR start r_nullLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:1: r_nullLiteral returns [CompositeNode cn] : ( 'null' ) ;
    public CompositeNode r_nullLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNullLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:2: ( ( 'null' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:2: ( 'null' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:2: ( 'null' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:3: 'null'
            {
            match(input,99,FOLLOW_99_in_r_nullLiteral3303); if (failed) return cn;
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
    // $ANTLR end r_nullLiteral


    // $ANTLR start r_numberLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );
    public CompositeNode r_numberLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNumberLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:2: ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) )
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
                            new NoViableAltException("341:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA75_1==EOF||LA75_1==TEXT||LA75_1==Identifier||LA75_1==28||(LA75_1>=32 && LA75_1<=34)||(LA75_1>=36 && LA75_1<=37)||LA75_1==40||LA75_1==43||(LA75_1>=54 && LA75_1<=56)||(LA75_1>=60 && LA75_1<=61)||(LA75_1>=74 && LA75_1<=77)||(LA75_1>=80 && LA75_1<=93)) ) {
                    alt75=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("341:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("341:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:2: ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:2: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:344:3: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3326); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:4: ( IntLiteral ) ( '.' ) ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:4: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:5: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3335); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:53: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:54: '.'
                    {
                    match(input,68,FOLLOW_68_in_r_numberLiteral3341); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:95: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:96: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3347); if (failed) return cn;
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
    // $ANTLR end r_numberLiteral


    // $ANTLR start r_collectionExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:347:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' ) );
    public CompositeNode r_collectionExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed99 = null;

        CompositeNode unnamed100 = null;

        CompositeNode unnamed101 = null;


         cn = factory.createCollectionExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:2: ( ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' ) )
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
                    new NoViableAltException("347:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' ) );", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:2: ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:2: ( 'typeSelect' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:3: 'typeSelect'
                    {
                    match(input,100,FOLLOW_100_in_r_collectionExpression3370); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:54: '('
                    {
                    match(input,31,FOLLOW_31_in_r_collectionExpression3376); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:95: (unnamed99= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:96: unnamed99= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression3384);
                    unnamed99=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed99); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:148: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:350:149: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3390); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
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
                            new NoViableAltException("351:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:6: ( 'collect' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:6: ( 'collect' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:7: 'collect'
                            {
                            match(input,101,FOLLOW_101_in_r_collectionExpression3401); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:352:4: ( 'select' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:352:4: ( 'select' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:352:5: 'select'
                            {
                            match(input,102,FOLLOW_102_in_r_collectionExpression3410); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:353:4: ( 'selectFirst' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:353:4: ( 'selectFirst' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:353:5: 'selectFirst'
                            {
                            match(input,103,FOLLOW_103_in_r_collectionExpression3419); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:4: ( 'reject' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:4: ( 'reject' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:5: 'reject'
                            {
                            match(input,104,FOLLOW_104_in_r_collectionExpression3428); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:4: ( 'exists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:4: ( 'exists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:5: 'exists'
                            {
                            match(input,105,FOLLOW_105_in_r_collectionExpression3437); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 6 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:4: ( 'notExists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:4: ( 'notExists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:356:5: 'notExists'
                            {
                            match(input,106,FOLLOW_106_in_r_collectionExpression3446); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 7 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:4: ( 'sortBy' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:4: ( 'sortBy' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:5: 'sortBy'
                            {
                            match(input,107,FOLLOW_107_in_r_collectionExpression3455); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 8 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:4: ( 'forAll' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:4: ( 'forAll' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:5: 'forAll'
                            {
                            match(input,108,FOLLOW_108_in_r_collectionExpression3464); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;

                    }


                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:54: '('
                    {
                    match(input,31,FOLLOW_31_in_r_collectionExpression3472); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:95: ( ( (unnamed100= r_identifier ) ( '|' ) ) )?
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:96: ( (unnamed100= r_identifier ) ( '|' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:96: ( (unnamed100= r_identifier ) ( '|' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:97: (unnamed100= r_identifier ) ( '|' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:97: (unnamed100= r_identifier )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:98: unnamed100= r_identifier
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression3482);
                            unnamed100=r_identifier();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed100); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:158: ( '|' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:159: '|'
                            {
                            match(input,109,FOLLOW_109_in_r_collectionExpression3488); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:203: (unnamed101= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:204: unnamed101= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression3499);
                    unnamed101=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed101); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:264: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:265: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3505); if (failed) return cn;
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
    // $ANTLR end r_collectionExpression


    // $ANTLR start r_declaredParameterList
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:1: r_declaredParameterList returns [CompositeNode cn] : (params= r_declaredParameter ) ( ( ( ',' ) (params= r_declaredParameter ) ) )* ;
    public CompositeNode r_declaredParameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode params = null;


         cn = factory.createDeclaredParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:2: ( (params= r_declaredParameter ) ( ( ( ',' ) (params= r_declaredParameter ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:2: (params= r_declaredParameter ) ( ( ( ',' ) (params= r_declaredParameter ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:2: (params= r_declaredParameter )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:3: params= r_declaredParameter
            {
            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3530);
            params=r_declaredParameter();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:120: ( ( ( ',' ) (params= r_declaredParameter ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:121: ( ( ',' ) (params= r_declaredParameter ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:121: ( ( ',' ) (params= r_declaredParameter ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:122: ( ',' ) (params= r_declaredParameter )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:122: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:123: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_declaredParameterList3538); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:164: (params= r_declaredParameter )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:165: params= r_declaredParameter
            	    {
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3546);
            	    params=r_declaredParameter();
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
    // $ANTLR end r_declaredParameterList


    // $ANTLR start r_declaredParameter
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:365:1: r_declaredParameter returns [CompositeNode cn] : (ptype= r_type ) (name= r_identifier ) ;
    public CompositeNode r_declaredParameter() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode ptype = null;

        CompositeNode name = null;


         cn = factory.createDeclaredParameterNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:2: ( (ptype= r_type ) (name= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:2: (ptype= r_type ) (name= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:2: (ptype= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:3: ptype= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_declaredParameter3574);
            ptype=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, ptype); ((DeclaredParameterNode) cn).setPtype(ptype); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:93: (name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:94: name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter3582);
            name=r_identifier();
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
    // $ANTLR end r_declaredParameter


    // $ANTLR start r_parameterList
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:370:1: r_parameterList returns [CompositeNode cn] : (params= r_expression ) ( ( ( ',' ) (params= r_expression ) ) )* ;
    public CompositeNode r_parameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode params = null;


         cn = factory.createParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:2: ( (params= r_expression ) ( ( ( ',' ) (params= r_expression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:2: (params= r_expression ) ( ( ( ',' ) (params= r_expression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:2: (params= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:3: params= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_parameterList3607);
            params=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:105: ( ( ( ',' ) (params= r_expression ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==32) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:106: ( ( ',' ) (params= r_expression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:106: ( ( ',' ) (params= r_expression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:107: ( ',' ) (params= r_expression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:107: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:108: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_parameterList3615); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:149: (params= r_expression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:373:150: params= r_expression
            	    {
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList3623);
            	    params=r_expression();
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
    // $ANTLR end r_parameterList


    // $ANTLR start r_type
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:1: r_type returns [CompositeNode cn] : ( ( r_collectionType ) | ( r_simpleType ) );
    public CompositeNode r_type() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_collectionType24 = null;

        CompositeNode r_simpleType25 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:376:2: ( ( r_collectionType ) | ( r_simpleType ) )
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
                    new NoViableAltException("375:1: r_type returns [CompositeNode cn] : ( ( r_collectionType ) | ( r_simpleType ) );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:376:2: ( r_collectionType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:376:2: ( r_collectionType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:376:3: r_collectionType
                    {
                    pushFollow(FOLLOW_r_collectionType_in_r_type3644);
                    r_collectionType24=r_collectionType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_collectionType24; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:377:4: ( r_simpleType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:377:4: ( r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:377:5: r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_type3653);
                    r_simpleType25=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_simpleType25; 
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
    // $ANTLR end r_type


    // $ANTLR start r_collectionType
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:379:1: r_collectionType returns [CompositeNode cn] : ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )? ;
    public CompositeNode r_collectionType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed102 = null;


         cn = factory.createCollectionTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:2: ( ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
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
                    new NoViableAltException("382:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:4: ( 'Collection' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:4: ( 'Collection' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:382:5: 'Collection'
                    {
                    match(input,69,FOLLOW_69_in_r_collectionType3678); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:383:4: ( 'List' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:383:4: ( 'List' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:383:5: 'List'
                    {
                    match(input,70,FOLLOW_70_in_r_collectionType3687); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:4: ( 'Set' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:4: ( 'Set' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:5: 'Set'
                    {
                    match(input,71,FOLLOW_71_in_r_collectionType3696); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:50: ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==110) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:51: ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:51: ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:52: ( '[' ) (unnamed102= r_simpleType ) ( ']' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:52: ( '[' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:53: '['
                    {
                    match(input,110,FOLLOW_110_in_r_collectionType3706); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:94: (unnamed102= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:95: unnamed102= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType3714);
                    unnamed102=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed102); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:155: ( ']' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:156: ']'
                    {
                    match(input,111,FOLLOW_111_in_r_collectionType3720); if (failed) return cn;
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
    // $ANTLR end r_collectionType


    // $ANTLR start r_simpleType
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:386:1: r_simpleType returns [CompositeNode cn] : (names= r_identifier ) ( ( ( '::' ) (names= r_identifier ) ) )* ;
    public CompositeNode r_simpleType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode names = null;


         cn = factory.createSimpleTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:2: ( (names= r_identifier ) ( ( ( '::' ) (names= r_identifier ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:2: (names= r_identifier ) ( ( ( '::' ) (names= r_identifier ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:2: (names= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:3: names= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_simpleType3748);
            names=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:98: ( ( ( '::' ) (names= r_identifier ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==63) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:99: ( ( '::' ) (names= r_identifier ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:99: ( ( '::' ) (names= r_identifier ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:100: ( '::' ) (names= r_identifier )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:100: ( '::' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:101: '::'
            	    {
            	    match(input,63,FOLLOW_63_in_r_simpleType3756); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:143: (names= r_identifier )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:389:144: names= r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType3764);
            	    names=r_identifier();
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
    // $ANTLR end r_simpleType


    // $ANTLR start r_identifier
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:391:1: r_identifier returns [CompositeNode cn] : ( Identifier ) ;
    public CompositeNode r_identifier() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createIdentifierNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: ( ( Identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: ( Identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: ( Identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:3: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier3790); if (failed) return cn;
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
    // $ANTLR end r_identifier

    // $ANTLR start synpred1
    public void synpred1_fragment() throws RecognitionException {   
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:2: ( '(' r_type ')' r_chainExpression )
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:3: '(' r_type ')' r_chainExpression
        {
        match(input,31,FOLLOW_31_in_synpred12059); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred12061);
        r_type();
        _fsp--;
        if (failed) return ;
        match(input,34,FOLLOW_34_in_synpred12063); if (failed) return ;
        pushFollow(FOLLOW_r_chainExpression_in_synpred12065);
        r_chainExpression();
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
        "\101\uffff";
    static final String DFA50_eofS =
        "\10\uffff\1\2\70\uffff";
    static final String DFA50_minS =
        "\2\13\1\uffff\3\41\1\37\1\15\1\12\1\15\1\77\2\uffff\1\0\25\uffff"+
        "\1\12\1\uffff\1\41\1\15\1\41\5\0\3\37\21\0";
    static final String DFA50_maxS =
        "\2\154\1\uffff\3\156\1\135\1\15\1\154\1\15\1\157\2\uffff\1\0\25"+
        "\uffff\1\154\1\uffff\1\135\1\15\1\135\5\0\3\37\21\0";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\10\uffff\2\1\1\uffff\25\1\1\uffff\1\1\34\uffff";
    static final String DFA50_specialS =
        "\10\uffff\1\5\4\uffff\1\1\32\uffff\1\4\1\3\1\6\1\0\1\2\24\uffff}>";
    static final String[] DFA50_transitionS = {
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
            "\1\2\1\14\1\34\1\15\16\uffff\1\2\2\uffff\1\41\3\2\1\uffff\1"+
            "\43\1\2\2\uffff\1\2\2\uffff\1\2\12\uffff\3\2\2\uffff\1\44\2"+
            "\2\6\uffff\1\2\1\16\1\17\1\20\2\uffff\3\2\1\uffff\1\13\1\36"+
            "\16\2\1\42\1\40\1\37\1\32\1\33\1\35\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\30\1\31",
            "\1\45",
            "\1\46\57\uffff\1\47",
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
            "\1\2\1\50\1\70\1\51\21\uffff\1\75\4\uffff\1\2\40\uffff\1\52"+
            "\1\53\1\54\7\uffff\1\72\16\uffff\1\2\1\74\1\73\1\66\1\67\1\71"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65",
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
            return "197:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) ) | (unnamed64= r_chainExpression ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_43 = input.LA(1);

                         
                        int index50_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_43);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_44 = input.LA(1);

                         
                        int index50_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_44);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_41 = input.LA(1);

                         
                        int index50_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_41);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_40 = input.LA(1);

                         
                        int index50_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_40);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_8==78) && (synpred1())) {s = 11;}

                        else if ( (LA50_8==StringLiteral) && (synpred1())) {s = 12;}

                        else if ( (LA50_8==Identifier) ) {s = 13;}

                        else if ( (LA50_8==69) && (synpred1())) {s = 14;}

                        else if ( (LA50_8==70) && (synpred1())) {s = 15;}

                        else if ( (LA50_8==71) && (synpred1())) {s = 16;}

                        else if ( (LA50_8==100) && (synpred1())) {s = 17;}

                        else if ( (LA50_8==101) && (synpred1())) {s = 18;}

                        else if ( (LA50_8==102) && (synpred1())) {s = 19;}

                        else if ( (LA50_8==103) && (synpred1())) {s = 20;}

                        else if ( (LA50_8==104) && (synpred1())) {s = 21;}

                        else if ( (LA50_8==105) && (synpred1())) {s = 22;}

                        else if ( (LA50_8==106) && (synpred1())) {s = 23;}

                        else if ( (LA50_8==107) && (synpred1())) {s = 24;}

                        else if ( (LA50_8==108) && (synpred1())) {s = 25;}

                        else if ( (LA50_8==97) && (synpred1())) {s = 26;}

                        else if ( (LA50_8==98) && (synpred1())) {s = 27;}

                        else if ( (LA50_8==IntLiteral) && (synpred1())) {s = 28;}

                        else if ( (LA50_8==99) && (synpred1())) {s = 29;}

                        else if ( (LA50_8==79) && (synpred1())) {s = 30;}

                        else if ( (LA50_8==96) && (synpred1())) {s = 31;}

                        else if ( (LA50_8==95) && (synpred1())) {s = 32;}

                        else if ( (LA50_8==31) && (synpred1())) {s = 33;}

                        else if ( (LA50_8==94) && (synpred1())) {s = 34;}

                        else if ( (LA50_8==36) ) {s = 35;}

                        else if ( (LA50_8==59) && (synpred1())) {s = 36;}

                        else if ( (LA50_8==EOF||LA50_8==TEXT||LA50_8==28||(LA50_8>=32 && LA50_8<=34)||LA50_8==37||LA50_8==40||LA50_8==43||(LA50_8>=54 && LA50_8<=56)||(LA50_8>=60 && LA50_8<=61)||LA50_8==68||(LA50_8>=74 && LA50_8<=76)||(LA50_8>=80 && LA50_8<=93)) ) {s = 2;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_42 = input.LA(1);

                         
                        int index50_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_42);
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
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file80 = new BitSet(new long[]{0x4400000028002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file93 = new BitSet(new long[]{0x4400000000002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_EOF_in_r_file102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport123 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_r_nsImport129 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_nsImport137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport152 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_nsImport158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_nsImport166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_r_nsImport181 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport189 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_r_nsImport204 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport212 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_r_nsImport220 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definition_in_r_abstractDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definitionAround_in_r_abstractDeclaration283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definition306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_r_definition312 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_definition320 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definition328 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definition338 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definition346 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definition353 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definition365 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definition374 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definition383 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definition391 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definition399 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_r_definition405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definition411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definitionAround434 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_r_definitionAround440 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_definitionAround448 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definitionAround456 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definitionAround466 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definitionAround474 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround481 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround493 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definitionAround502 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definitionAround511 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definitionAround519 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definitionAround527 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_r_definitionAround533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definitionAround539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence564 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_statement_in_r_sequence574 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence582 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_simpleStatement_in_r_statement603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_fileStatement_in_r_statement612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_foreachStatement_in_r_statement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifStatement_in_r_statement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letStatement_in_r_statement639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_protectStatement_in_r_statement648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence678 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence688 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_r_text714 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_r_text721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_errorStatement_in_r_simpleStatement739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expandStatement_in_r_simpleStatement748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expressionStmt_in_r_simpleStatement757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_r_errorStatement780 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_errorStatement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_r_expandStatement811 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_expandStatement819 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_r_expandStatement827 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_expandStatement835 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_expandStatement841 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_r_expandStatement854 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_expandStatement875 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement883 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_r_expandStatement891 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_expressionStmt932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_fileStatement955 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_fileStatement963 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_r_identifier_in_r_fileStatement973 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_fileStatement984 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_r_fileStatement990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_foreachStatement1013 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1021 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_foreachStatement1027 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1035 = new BitSet(new long[]{0x0000111000000400L});
    public static final BitSet FOLLOW_44_in_r_foreachStatement1043 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1051 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_r_foreachStatement1062 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1070 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_foreachStatement1081 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_r_foreachStatement1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_r_ifStatement1110 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifStatement1118 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_ifStatement1126 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseIfStatement_in_r_ifStatement1134 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseStatement_in_r_ifStatement1143 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_r_ifStatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_r_elseIfStatement1173 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_elseIfStatement1181 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseIfStatement1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_r_elseStatement1212 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseStatement1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_letStatement1243 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letStatement1251 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_letStatement1257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letStatement1265 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_letStatement1273 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_r_letStatement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_r_protectStatement1302 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_r_protectStatement1308 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1316 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_r_protectStatement1322 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1330 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_r_protectStatement1336 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1344 = new BitSet(new long[]{0x0100001000000400L});
    public static final BitSet FOLLOW_56_in_r_protectStatement1350 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_protectStatement1359 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_r_protectStatement1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_r_check1388 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_check1396 = new BitSet(new long[]{0x1800002000000000L});
    public static final BitSet FOLLOW_59_in_r_check1404 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1412 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_37_in_r_check1423 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_60_in_r_check1432 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1442 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_check1448 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1456 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_check1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_r_around1485 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around1493 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around1499 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around1509 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_around1517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_around1524 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_around1536 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_around1545 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_around1551 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_around1559 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_around1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_r_pointcut1590 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1601 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_33_in_r_pointcut1611 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1622 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_63_in_r_pointcut1631 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_64_in_r_extension1659 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_65_in_r_extension1668 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_66_in_r_extension1677 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_type_in_r_extension1688 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1697 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1703 = new BitSet(new long[]{0x0000000400002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension1711 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_extension1718 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_extension1724 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E8L});
    public static final BitSet FOLLOW_67_in_r_extension1732 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_extension1746 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1754 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1760 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1770 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_r_extension1778 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1786 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_r_extension1798 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension1809 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extension1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_javaType1850 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_r_javaType1869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_r_javaType1878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_r_javaType1887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_expression_in_r_test_expression1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_r_test_expression1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_r_letExpression1984 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_r_letExpression1998 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2006 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_letExpression2012 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_castedExpression2070 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression2078 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_castedExpression2084 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_r_chainExpression2142 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_r_ifExpression2191 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2199 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_ifExpression2205 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_r_ifExpression2225 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_r_ifExpression2239 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_r_ifExpression2255 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_r_switchExpression2294 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression2302 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2310 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_switchExpression2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_r_switchExpression2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_80_in_r_switchExpression2340 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_switchExpression2346 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_r_switchExpression2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_r_casePart2394 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2402 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_casePart2408 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_r_orExpression2454 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_r_andExpression2503 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_r_impliesExpression2552 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2560 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2593 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_86_in_r_relationalExpression2603 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_87_in_r_relationalExpression2612 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_88_in_r_relationalExpression2621 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_89_in_r_relationalExpression2630 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_90_in_r_relationalExpression2639 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_91_in_r_relationalExpression2648 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2658 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2691 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_r_additiveExpression2701 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_36_in_r_additiveExpression2710 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2720 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2753 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_33_in_r_multiplicativeExpression2763 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_93_in_r_multiplicativeExpression2772 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2782 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_r_unaryExpression2824 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_r_unaryExpression2841 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression2879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_infixExpression2887 = new BitSet(new long[]{0x0000000000002000L,0x00001FF0000000E0L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression2895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_stringLiteral_in_r_primaryExpression2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_r_stringLiteral3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression3034 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression3042 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_paranthesizedExpression3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_r_globalVarExpression3071 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall3109 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall3115 = new BitSet(new long[]{0x0800001480003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall3125 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_featureCall3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_r_listLiteral3179 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC002C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3189 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_32_in_r_listLiteral3197 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3205 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_r_listLiteral3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_r_constructorCall3240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_r_booleanLiteral3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_r_booleanLiteral3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_r_nullLiteral3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_numberLiteral3341 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_r_collectionExpression3370 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3376 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression3384 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_r_collectionExpression3401 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_102_in_r_collectionExpression3410 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_103_in_r_collectionExpression3419 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_104_in_r_collectionExpression3428 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_105_in_r_collectionExpression3437 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_106_in_r_collectionExpression3446 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_107_in_r_collectionExpression3455 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_108_in_r_collectionExpression3464 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3472 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression3482 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_r_collectionExpression3488 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression3499 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3530 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_declaredParameterList3538 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3546 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter3574 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3607 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_parameterList3615 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3623 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_r_collectionType3678 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_70_in_r_collectionType3687 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_71_in_r_collectionType3696 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_r_collectionType3706 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType3714 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_r_collectionType3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3748 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_r_simpleType3756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3764 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred12059 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_synpred12061 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred12063 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_synpred12065 = new BitSet(new long[]{0x0000000000000002L});

}