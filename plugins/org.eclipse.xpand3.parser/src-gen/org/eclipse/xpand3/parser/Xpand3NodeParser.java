// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g 2008-03-07 12:18:30
 	
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:1: r_nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) );
    public CompositeNode r_nsImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode ns = null;

        CompositeNode unnamed0 = null;

        CompositeNode unnamed1 = null;


         cn = factory.createNsImportNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:2: ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) )
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
                        new NoViableAltException("36:1: r_nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 1, input);

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
                    new NoViableAltException("36:1: r_nsImport returns [CompositeNode cn] : ( ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG ) | ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG ) | ( 'import' ) (unnamed0= r_type ) ( ';' ) | ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:2: ( LG ) ( 'IMPORT' ) (ns= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:2: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:3: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_nsImport124); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:43: ( 'IMPORT' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:44: 'IMPORT'
                    {
                    match(input,25,FOLLOW_25_in_r_nsImport130); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:90: (ns= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:91: ns= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_nsImport138);
                    ns=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:166: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:167: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_nsImport144); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:4: ( LG ) ( 'EXTENSION' ) (ns= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_nsImport153); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:45: ( 'EXTENSION' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:46: 'EXTENSION'
                    {
                    match(input,26,FOLLOW_26_in_r_nsImport159); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:95: (ns= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:96: ns= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_nsImport167);
                    ns=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:171: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:172: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_nsImport173); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:4: ( 'import' ) (unnamed0= r_type ) ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:4: ( 'import' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:5: 'import'
                    {
                    match(input,27,FOLLOW_27_in_r_nsImport182); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:51: (unnamed0= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:52: unnamed0= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_nsImport190);
                    unnamed0=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed0); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:102: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:103: ';'
                    {
                    match(input,28,FOLLOW_28_in_r_nsImport196); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:4: ( 'extension' ) (unnamed1= r_type ) ( ( ( 'reexport' ) ) )? ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:4: ( 'extension' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:5: 'extension'
                    {
                    match(input,29,FOLLOW_29_in_r_nsImport205); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:54: (unnamed1= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:55: unnamed1= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_nsImport213);
                    unnamed1=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed1); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:105: ( ( ( 'reexport' ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:106: ( ( 'reexport' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:106: ( ( 'reexport' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:107: ( 'reexport' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:107: ( 'reexport' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:108: 'reexport'
                            {
                            match(input,30,FOLLOW_30_in_r_nsImport221); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:159: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:160: ';'
                    {
                    match(input,28,FOLLOW_28_in_r_nsImport230); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );
    public CompositeNode r_abstractDeclaration() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_check1 = null;

        CompositeNode r_around2 = null;

        CompositeNode r_extension3 = null;

        CompositeNode r_definition4 = null;

        CompositeNode r_definitionAround5 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:2: ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) )
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
                        new NoViableAltException("45:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("45:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:2: ( r_check )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:2: ( r_check )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:3: r_check
                    {
                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration249);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:4: ( r_around )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:4: ( r_around )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:5: r_around
                    {
                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration258);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:4: ( r_extension )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:4: ( r_extension )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:5: r_extension
                    {
                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration267);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:49:4: ( r_definition )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:49:4: ( r_definition )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:49:5: r_definition
                    {
                    pushFollow(FOLLOW_r_definition_in_r_abstractDeclaration276);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:4: ( r_definitionAround )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:4: ( r_definitionAround )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:5: r_definitionAround
                    {
                    pushFollow(FOLLOW_r_definitionAround_in_r_abstractDeclaration285);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:1: r_definition returns [CompositeNode cn] : ( LG ) ( DEFINE ) (name= r_identifier ) ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= r_type ) (unnamed4= r_sequence ) ( ENDDEFINE ) ( RG ) ;
    public CompositeNode r_definition() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode name = null;

        CompositeNode unnamed2 = null;

        CompositeNode unnamed3 = null;

        CompositeNode unnamed4 = null;


         cn = factory.createDefinitionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:2: ( ( LG ) ( DEFINE ) (name= r_identifier ) ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= r_type ) (unnamed4= r_sequence ) ( ENDDEFINE ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:2: ( LG ) ( DEFINE ) (name= r_identifier ) ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed3= r_type ) (unnamed4= r_sequence ) ( ENDDEFINE ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definition309); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:43: ( DEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:44: DEFINE
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_r_definition315); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:88: (name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:89: name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_definition323);
            name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((DefinitionNode) cn).setName(name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:174: ( ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:175: ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:175: ( ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:176: ( '(' ) ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:176: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:177: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definition331); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:218: ( ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Identifier||LA9_0==33||(LA9_0>=69 && LA9_0<=71)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:219: ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:219: ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("56:219: ( (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:220: (unnamed2= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:220: (unnamed2= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:221: unnamed2= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definition341);
                                    unnamed2=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed2); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:288: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt7=2;
                                    int LA7_0 = input.LA(1);

                                    if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                                        alt7=1;
                                    }
                                    switch (alt7) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:289: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:289: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:290: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:290: ( ',' )?
                                            int alt6=2;
                                            int LA6_0 = input.LA(1);

                                            if ( (LA6_0==32) ) {
                                                alt6=1;
                                            }
                                            switch (alt6) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:291: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definition349); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:333: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:334: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definition356); if (failed) return cn;
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_definition368); if (failed) return cn;
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_definition377); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_r_definition386); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:138: (unnamed3= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:139: unnamed3= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definition394);
            unnamed3=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed3); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:189: (unnamed4= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:190: unnamed4= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definition402);
            unnamed4=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed4); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:244: ( ENDDEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:245: ENDDEFINE
            {
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_r_definition408); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:292: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:293: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definition414); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:1: r_definitionAround returns [CompositeNode cn] : ( LG ) ( AROUND ) (unnamed5= r_pointcut ) ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= r_type ) (unnamed8= r_sequence ) ( ENDAROUND ) ( RG ) ;
    public CompositeNode r_definitionAround() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed5 = null;

        CompositeNode unnamed6 = null;

        CompositeNode unnamed7 = null;

        CompositeNode unnamed8 = null;


         cn = factory.createDefinitionAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:2: ( ( LG ) ( AROUND ) (unnamed5= r_pointcut ) ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= r_type ) (unnamed8= r_sequence ) ( ENDAROUND ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:2: ( LG ) ( AROUND ) (unnamed5= r_pointcut ) ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (unnamed7= r_type ) (unnamed8= r_sequence ) ( ENDAROUND ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definitionAround438); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:43: ( AROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:44: AROUND
            {
            match(input,AROUND,FOLLOW_AROUND_in_r_definitionAround444); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:88: (unnamed5= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:89: unnamed5= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_definitionAround452);
            unnamed5=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed5); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:143: ( ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:144: ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:144: ( ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:145: ( '(' ) ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:145: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:146: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definitionAround460); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:187: ( ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Identifier||LA14_0==33||(LA14_0>=69 && LA14_0<=71)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:188: ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:188: ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("63:188: ( (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 13, 0, input);

                                throw nvae;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:189: (unnamed6= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:189: (unnamed6= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:190: unnamed6= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definitionAround470);
                                    unnamed6=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, unnamed6); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:257: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( ((LA12_0>=32 && LA12_0<=33)) ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:258: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:258: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:259: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:259: ( ',' )?
                                            int alt11=2;
                                            int LA11_0 = input.LA(1);

                                            if ( (LA11_0==32) ) {
                                                alt11=1;
                                            }
                                            switch (alt11) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:260: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definitionAround478); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:302: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:303: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definitionAround485); if (failed) return cn;
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_definitionAround497); if (failed) return cn;
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_definitionAround506); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_r_definitionAround515); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:138: (unnamed7= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:139: unnamed7= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definitionAround523);
            unnamed7=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed7); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:189: (unnamed8= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:190: unnamed8= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definitionAround531);
            unnamed8=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed8); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:244: ( ENDAROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:245: ENDAROUND
            {
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_r_definitionAround537); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:292: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:293: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definitionAround543); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:1: r_sequence returns [CompositeNode cn] : (unnamed9= r_textSequence ) ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )* ;
    public CompositeNode r_sequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed9 = null;

        CompositeNode unnamed10 = null;

        CompositeNode unnamed11 = null;


         cn = factory.createSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:2: ( (unnamed9= r_textSequence ) ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:2: (unnamed9= r_textSequence ) ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:2: (unnamed9= r_textSequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:3: unnamed9= r_textSequence
            {
            pushFollow(FOLLOW_r_textSequence_in_r_sequence569);
            unnamed9=r_textSequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed9); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:61: ( ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=StringLiteral && LA16_0<=Identifier)||LA16_0==31||(LA16_0>=36 && LA16_0<=39)||LA16_0==41||LA16_0==46||LA16_0==50||LA16_0==52||LA16_0==59||(LA16_0>=69 && LA16_0<=72)||(LA16_0>=78 && LA16_0<=79)||(LA16_0>=94 && LA16_0<=108)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:62: ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:62: ( (unnamed10= r_statement ) (unnamed11= r_textSequence ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:63: (unnamed10= r_statement ) (unnamed11= r_textSequence )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:63: (unnamed10= r_statement )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:64: unnamed10= r_statement
            	    {
            	    pushFollow(FOLLOW_r_statement_in_r_sequence579);
            	    unnamed10=r_statement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, unnamed10); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:121: (unnamed11= r_textSequence )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:122: unnamed11= r_textSequence
            	    {
            	    pushFollow(FOLLOW_r_textSequence_in_r_sequence587);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );
    public CompositeNode r_statement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_simpleStatement6 = null;

        CompositeNode r_fileStatement7 = null;

        CompositeNode r_foreachStatement8 = null;

        CompositeNode r_ifStatement9 = null;

        CompositeNode r_letStatement10 = null;

        CompositeNode r_protectStatement11 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:2: ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) )
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
                    new NoViableAltException("73:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:2: ( r_simpleStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:2: ( r_simpleStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:3: r_simpleStatement
                    {
                    pushFollow(FOLLOW_r_simpleStatement_in_r_statement609);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:4: ( r_fileStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:4: ( r_fileStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:5: r_fileStatement
                    {
                    pushFollow(FOLLOW_r_fileStatement_in_r_statement618);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:76:4: ( r_foreachStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:76:4: ( r_foreachStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:76:5: r_foreachStatement
                    {
                    pushFollow(FOLLOW_r_foreachStatement_in_r_statement627);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:4: ( r_ifStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:4: ( r_ifStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:5: r_ifStatement
                    {
                    pushFollow(FOLLOW_r_ifStatement_in_r_statement636);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:78:4: ( r_letStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:78:4: ( r_letStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:78:5: r_letStatement
                    {
                    pushFollow(FOLLOW_r_letStatement_in_r_statement645);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:4: ( r_protectStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:4: ( r_protectStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:5: r_protectStatement
                    {
                    pushFollow(FOLLOW_r_protectStatement_in_r_statement654);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:82:1: r_textSequence returns [CompositeNode cn] : (unnamed12= r_text ) ( ( (unnamed13= r_text ) ) )* ;
    public CompositeNode r_textSequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed12 = null;

        CompositeNode unnamed13 = null;


         cn = factory.createTextSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:2: ( (unnamed12= r_text ) ( ( (unnamed13= r_text ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:2: (unnamed12= r_text ) ( ( (unnamed13= r_text ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:2: (unnamed12= r_text )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:3: unnamed12= r_text
            {
            pushFollow(FOLLOW_r_text_in_r_textSequence685);
            unnamed12=r_text();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed12); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:55: ( ( (unnamed13= r_text ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:56: ( (unnamed13= r_text ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:56: ( (unnamed13= r_text ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:57: (unnamed13= r_text )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:57: (unnamed13= r_text )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:58: unnamed13= r_text
            	    {
            	    pushFollow(FOLLOW_r_text_in_r_textSequence695);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:1: r_text returns [CompositeNode cn] : ( '-' )? ( TEXT ) ;
    public CompositeNode r_text() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createTextNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:2: ( ( '-' )? ( TEXT ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:2: ( '-' )? ( TEXT )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:3: '-'
                    {
                    match(input,36,FOLLOW_36_in_r_text722); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:45: ( TEXT )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:46: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_r_text729); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );
    public CompositeNode r_simpleStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_errorStatement12 = null;

        CompositeNode r_expandStatement13 = null;

        CompositeNode r_expressionStmt14 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:2: ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) )
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
                    new NoViableAltException("95:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:2: ( r_errorStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:2: ( r_errorStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:3: r_errorStatement
                    {
                    pushFollow(FOLLOW_r_errorStatement_in_r_simpleStatement748);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:97:4: ( r_expandStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:97:4: ( r_expandStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:97:5: r_expandStatement
                    {
                    pushFollow(FOLLOW_r_expandStatement_in_r_simpleStatement757);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:98:4: ( r_expressionStmt )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:98:4: ( r_expressionStmt )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:98:5: r_expressionStmt
                    {
                    pushFollow(FOLLOW_r_expressionStmt_in_r_simpleStatement766);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:1: r_errorStatement returns [CompositeNode cn] : ( 'ERROR' ) (unnamed14= r_expression ) ;
    public CompositeNode r_errorStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed14 = null;


         cn = factory.createErrorStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:104:2: ( ( 'ERROR' ) (unnamed14= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:104:2: ( 'ERROR' ) (unnamed14= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:104:2: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:104:3: 'ERROR'
            {
            match(input,37,FOLLOW_37_in_r_errorStatement790); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:104:48: (unnamed14= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:104:49: unnamed14= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_errorStatement798);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:1: r_expandStatement returns [CompositeNode cn] : ( 'EXPAND' ) (unnamed15= r_simpleType ) ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )? ;
    public CompositeNode r_expandStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed15 = null;

        CompositeNode unnamed16 = null;

        CompositeNode unnamed17 = null;

        CompositeNode unnamed18 = null;

        CompositeNode unnamed19 = null;


         cn = factory.createExpandStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( ( 'EXPAND' ) (unnamed15= r_simpleType ) ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( 'EXPAND' ) (unnamed15= r_simpleType ) ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:2: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:3: 'EXPAND'
            {
            match(input,38,FOLLOW_38_in_r_expandStatement822); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:49: (unnamed15= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:50: unnamed15= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_expandStatement830);
            unnamed15=r_simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed15); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:108: ( ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:109: ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:109: ( ( '(' ) (unnamed16= r_parameterList ) ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:110: ( '(' ) (unnamed16= r_parameterList ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:110: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:111: '('
                    {
                    match(input,31,FOLLOW_31_in_r_expandStatement838); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:152: (unnamed16= r_parameterList )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:153: unnamed16= r_parameterList
                    {
                    pushFollow(FOLLOW_r_parameterList_in_r_expandStatement846);
                    unnamed16=r_parameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed16); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:214: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:215: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_expandStatement852); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:259: ( ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35||LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:260: ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:260: ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) )
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
                            new NoViableAltException("110:260: ( ( ( ( 'FOR' ) (unnamed17= r_expression ) ) ) | ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:261: ( ( ( 'FOR' ) (unnamed17= r_expression ) ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:261: ( ( ( 'FOR' ) (unnamed17= r_expression ) ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:262: ( ( 'FOR' ) (unnamed17= r_expression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:262: ( ( 'FOR' ) (unnamed17= r_expression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:263: ( 'FOR' ) (unnamed17= r_expression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:263: ( 'FOR' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:264: 'FOR'
                            {
                            match(input,35,FOLLOW_35_in_r_expandStatement865); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:307: (unnamed17= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:308: unnamed17= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement873);
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:4: ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:4: ( ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:5: ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:5: ( ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )? )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:6: ( 'FOREACH' ) (unnamed18= r_expression ) ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:6: ( 'FOREACH' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:7: 'FOREACH'
                            {
                            match(input,39,FOLLOW_39_in_r_expandStatement886); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:54: (unnamed18= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:55: unnamed18= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement894);
                            unnamed18=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed18); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:113: ( ( ( 'SEPARATOR' ) (unnamed19= r_expression ) ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==40) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:114: ( ( 'SEPARATOR' ) (unnamed19= r_expression ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:114: ( ( 'SEPARATOR' ) (unnamed19= r_expression ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:115: ( 'SEPARATOR' ) (unnamed19= r_expression )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:115: ( 'SEPARATOR' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:116: 'SEPARATOR'
                                    {
                                    match(input,40,FOLLOW_40_in_r_expandStatement902); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:165: (unnamed19= r_expression )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:166: unnamed19= r_expression
                                    {
                                    pushFollow(FOLLOW_r_expression_in_r_expandStatement910);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:114:1: r_expressionStmt returns [CompositeNode cn] : (unnamed20= r_expression ) ;
    public CompositeNode r_expressionStmt() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed20 = null;


         cn = factory.createExpressionStmtNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:2: ( (unnamed20= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:2: (unnamed20= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:2: (unnamed20= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:3: unnamed20= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_expressionStmt944);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:1: r_fileStatement returns [CompositeNode cn] : ( 'FILE' ) (unnamed21= r_expression ) ( ( (unnamed22= r_identifier ) ) )? (unnamed23= r_sequence ) ( 'ENDFILE' ) ;
    public CompositeNode r_fileStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed21 = null;

        CompositeNode unnamed22 = null;

        CompositeNode unnamed23 = null;


         cn = factory.createFileStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:2: ( ( 'FILE' ) (unnamed21= r_expression ) ( ( (unnamed22= r_identifier ) ) )? (unnamed23= r_sequence ) ( 'ENDFILE' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:2: ( 'FILE' ) (unnamed21= r_expression ) ( ( (unnamed22= r_identifier ) ) )? (unnamed23= r_sequence ) ( 'ENDFILE' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:2: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:3: 'FILE'
            {
            match(input,41,FOLLOW_41_in_r_fileStatement968); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:47: (unnamed21= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:48: unnamed21= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_fileStatement976);
            unnamed21=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed21); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:106: ( ( (unnamed22= r_identifier ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Identifier) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:107: ( (unnamed22= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:107: ( (unnamed22= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:108: (unnamed22= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:108: (unnamed22= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:109: unnamed22= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_fileStatement986);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:170: (unnamed23= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:171: unnamed23= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_fileStatement997);
            unnamed23=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed23); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:227: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:228: 'ENDFILE'
            {
            match(input,42,FOLLOW_42_in_r_fileStatement1003); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:126:1: r_foreachStatement returns [CompositeNode cn] : ( 'FOREACH' ) (unnamed24= r_expression ) ( 'AS' ) (unnamed25= r_identifier ) ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )? (unnamed28= r_sequence ) ( 'ENDFOREACH' ) ;
    public CompositeNode r_foreachStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed24 = null;

        CompositeNode unnamed25 = null;

        CompositeNode unnamed26 = null;

        CompositeNode unnamed27 = null;

        CompositeNode unnamed28 = null;


         cn = factory.createForeachStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:2: ( ( 'FOREACH' ) (unnamed24= r_expression ) ( 'AS' ) (unnamed25= r_identifier ) ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )? (unnamed28= r_sequence ) ( 'ENDFOREACH' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:2: ( 'FOREACH' ) (unnamed24= r_expression ) ( 'AS' ) (unnamed25= r_identifier ) ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )? (unnamed28= r_sequence ) ( 'ENDFOREACH' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:2: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:3: 'FOREACH'
            {
            match(input,39,FOLLOW_39_in_r_foreachStatement1027); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:50: (unnamed24= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:51: unnamed24= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_foreachStatement1035);
            unnamed24=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed24); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:109: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:110: 'AS'
            {
            match(input,43,FOLLOW_43_in_r_foreachStatement1041); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:152: (unnamed25= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:153: unnamed25= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1049);
            unnamed25=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed25); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:211: ( ( ( 'ITERATOR' ) (unnamed26= r_identifier ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:212: ( ( 'ITERATOR' ) (unnamed26= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:212: ( ( 'ITERATOR' ) (unnamed26= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:213: ( 'ITERATOR' ) (unnamed26= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:213: ( 'ITERATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:214: 'ITERATOR'
                    {
                    match(input,44,FOLLOW_44_in_r_foreachStatement1057); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:262: (unnamed26= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:263: unnamed26= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1065);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:324: ( ( ( 'SEPARATOR' ) (unnamed27= r_expression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:325: ( ( 'SEPARATOR' ) (unnamed27= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:325: ( ( 'SEPARATOR' ) (unnamed27= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:326: ( 'SEPARATOR' ) (unnamed27= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:326: ( 'SEPARATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:327: 'SEPARATOR'
                    {
                    match(input,40,FOLLOW_40_in_r_foreachStatement1076); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:376: (unnamed27= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:377: unnamed27= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_foreachStatement1084);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:438: (unnamed28= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:439: unnamed28= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_foreachStatement1095);
            unnamed28=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed28); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:495: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:496: 'ENDFOREACH'
            {
            match(input,45,FOLLOW_45_in_r_foreachStatement1101); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:1: r_ifStatement returns [CompositeNode cn] : ( 'IF' ) (unnamed29= r_expression ) (unnamed30= r_sequence ) (unnamed31= r_elseIfStatement )* (unnamed32= r_elseStatement )? ( 'ENDIF' ) ;
    public CompositeNode r_ifStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed29 = null;

        CompositeNode unnamed30 = null;

        CompositeNode unnamed31 = null;

        CompositeNode unnamed32 = null;


         cn = factory.createIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( ( 'IF' ) (unnamed29= r_expression ) (unnamed30= r_sequence ) (unnamed31= r_elseIfStatement )* (unnamed32= r_elseStatement )? ( 'ENDIF' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( 'IF' ) (unnamed29= r_expression ) (unnamed30= r_sequence ) (unnamed31= r_elseIfStatement )* (unnamed32= r_elseStatement )? ( 'ENDIF' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:2: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:3: 'IF'
            {
            match(input,46,FOLLOW_46_in_r_ifStatement1125); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:45: (unnamed29= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:46: unnamed29= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_ifStatement1133);
            unnamed29=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed29); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:104: (unnamed30= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:105: unnamed30= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_ifStatement1141);
            unnamed30=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed30); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:161: (unnamed31= r_elseIfStatement )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:162: unnamed31= r_elseIfStatement
            	    {
            	    pushFollow(FOLLOW_r_elseIfStatement_in_r_ifStatement1149);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:226: (unnamed32= r_elseStatement )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:227: unnamed32= r_elseStatement
                    {
                    pushFollow(FOLLOW_r_elseStatement_in_r_ifStatement1158);
                    unnamed32=r_elseStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed32); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:289: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:290: 'ENDIF'
            {
            match(input,47,FOLLOW_47_in_r_ifStatement1165); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:1: r_elseIfStatement returns [CompositeNode cn] : ( 'ELSEIF' ) (unnamed33= r_expression ) (unnamed34= r_sequence ) ;
    public CompositeNode r_elseIfStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed33 = null;

        CompositeNode unnamed34 = null;


         cn = factory.createElseIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:2: ( ( 'ELSEIF' ) (unnamed33= r_expression ) (unnamed34= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:2: ( 'ELSEIF' ) (unnamed33= r_expression ) (unnamed34= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:2: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:3: 'ELSEIF'
            {
            match(input,48,FOLLOW_48_in_r_elseIfStatement1189); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:49: (unnamed33= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:50: unnamed33= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_elseIfStatement1197);
            unnamed33=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed33); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:108: (unnamed34= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:109: unnamed34= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseIfStatement1205);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:1: r_elseStatement returns [CompositeNode cn] : ( 'ELSE' ) (unnamed35= r_sequence ) ;
    public CompositeNode r_elseStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed35 = null;


         cn = factory.createElseStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:2: ( ( 'ELSE' ) (unnamed35= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:2: ( 'ELSE' ) (unnamed35= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:2: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:3: 'ELSE'
            {
            match(input,49,FOLLOW_49_in_r_elseStatement1229); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:47: (unnamed35= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:48: unnamed35= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseStatement1237);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:1: r_letStatement returns [CompositeNode cn] : ( 'LET' ) (unnamed36= r_expression ) ( 'AS' ) (unnamed37= r_identifier ) (unnamed38= r_sequence ) ( 'ENDLET' ) ;
    public CompositeNode r_letStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed36 = null;

        CompositeNode unnamed37 = null;

        CompositeNode unnamed38 = null;


         cn = factory.createLetStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:2: ( ( 'LET' ) (unnamed36= r_expression ) ( 'AS' ) (unnamed37= r_identifier ) (unnamed38= r_sequence ) ( 'ENDLET' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:2: ( 'LET' ) (unnamed36= r_expression ) ( 'AS' ) (unnamed37= r_identifier ) (unnamed38= r_sequence ) ( 'ENDLET' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:2: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:3: 'LET'
            {
            match(input,50,FOLLOW_50_in_r_letStatement1261); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:46: (unnamed36= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:47: unnamed36= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_letStatement1269);
            unnamed36=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed36); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:105: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:106: 'AS'
            {
            match(input,43,FOLLOW_43_in_r_letStatement1275); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:148: (unnamed37= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:149: unnamed37= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_letStatement1283);
            unnamed37=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed37); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:207: (unnamed38= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:208: unnamed38= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_letStatement1291);
            unnamed38=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed38); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:264: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:265: 'ENDLET'
            {
            match(input,51,FOLLOW_51_in_r_letStatement1297); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:1: r_protectStatement returns [CompositeNode cn] : ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= r_expression ) ( 'CEND' ) (unnamed40= r_expression ) ( 'ID' ) (unnamed41= r_expression ) ( 'DISABLE' )? (unnamed42= r_sequence ) ( 'ENDPROTECT' ) ;
    public CompositeNode r_protectStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed39 = null;

        CompositeNode unnamed40 = null;

        CompositeNode unnamed41 = null;

        CompositeNode unnamed42 = null;


         cn = factory.createProtectStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:2: ( ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= r_expression ) ( 'CEND' ) (unnamed40= r_expression ) ( 'ID' ) (unnamed41= r_expression ) ( 'DISABLE' )? (unnamed42= r_sequence ) ( 'ENDPROTECT' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:2: ( 'PROTECT' ) ( 'CSTART' ) (unnamed39= r_expression ) ( 'CEND' ) (unnamed40= r_expression ) ( 'ID' ) (unnamed41= r_expression ) ( 'DISABLE' )? (unnamed42= r_sequence ) ( 'ENDPROTECT' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:2: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:3: 'PROTECT'
            {
            match(input,52,FOLLOW_52_in_r_protectStatement1321); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:50: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:51: 'CSTART'
            {
            match(input,53,FOLLOW_53_in_r_protectStatement1327); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:97: (unnamed39= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:98: unnamed39= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1335);
            unnamed39=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed39); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:156: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:157: 'CEND'
            {
            match(input,54,FOLLOW_54_in_r_protectStatement1341); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:201: (unnamed40= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:202: unnamed40= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1349);
            unnamed40=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed40); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:260: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:261: 'ID'
            {
            match(input,55,FOLLOW_55_in_r_protectStatement1355); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:303: (unnamed41= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:304: unnamed41= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1363);
            unnamed41=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed41); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:362: ( 'DISABLE' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:363: 'DISABLE'
                    {
                    match(input,56,FOLLOW_56_in_r_protectStatement1369); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:411: (unnamed42= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:412: unnamed42= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_protectStatement1378);
            unnamed42=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed42); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:468: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:469: 'ENDPROTECT'
            {
            match(input,57,FOLLOW_57_in_r_protectStatement1384); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:1: r_check returns [CompositeNode cn] : ( 'context' ) (unnamed43= r_type ) ( ( ( 'if' ) (unnamed44= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= r_expression ) ( ':' ) (unnamed46= r_expression ) ( ';' ) ;
    public CompositeNode r_check() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed43 = null;

        CompositeNode unnamed44 = null;

        CompositeNode unnamed45 = null;

        CompositeNode unnamed46 = null;


         cn = factory.createCheckNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( ( 'context' ) (unnamed43= r_type ) ( ( ( 'if' ) (unnamed44= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= r_expression ) ( ':' ) (unnamed46= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( 'context' ) (unnamed43= r_type ) ( ( ( 'if' ) (unnamed44= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (unnamed45= r_expression ) ( ':' ) (unnamed46= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:2: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:3: 'context'
            {
            match(input,58,FOLLOW_58_in_r_check1408); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:50: (unnamed43= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:51: unnamed43= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_check1416);
            unnamed43=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed43); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:103: ( ( ( 'if' ) (unnamed44= r_expression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==59) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:104: ( ( 'if' ) (unnamed44= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:104: ( ( 'if' ) (unnamed44= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:105: ( 'if' ) (unnamed44= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:105: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:106: 'if'
                    {
                    match(input,59,FOLLOW_59_in_r_check1424); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:148: (unnamed44= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:149: unnamed44= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_check1432);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:210: ( ( ( 'ERROR' ) | ( 'WARNING' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:211: ( ( 'ERROR' ) | ( 'WARNING' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:211: ( ( 'ERROR' ) | ( 'WARNING' ) )
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
                    new NoViableAltException("165:211: ( ( 'ERROR' ) | ( 'WARNING' ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:212: ( 'ERROR' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:212: ( 'ERROR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:213: 'ERROR'
                    {
                    match(input,37,FOLLOW_37_in_r_check1443); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:4: ( 'WARNING' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:4: ( 'WARNING' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:5: 'WARNING'
                    {
                    match(input,60,FOLLOW_60_in_r_check1452); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:54: (unnamed45= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:55: unnamed45= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1462);
            unnamed45=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed45); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:113: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:114: ':'
            {
            match(input,61,FOLLOW_61_in_r_check1468); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:155: (unnamed46= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:156: unnamed46= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1476);
            unnamed46=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed46); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:214: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:215: ';'
            {
            match(input,28,FOLLOW_28_in_r_check1482); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:1: r_around returns [CompositeNode cn] : ( 'around' ) (unnamed47= r_pointcut ) ( '(' ) ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= r_expression ) ( ';' ) ;
    public CompositeNode r_around() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed47 = null;

        CompositeNode unnamed48 = null;

        CompositeNode unnamed49 = null;


         cn = factory.createAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:2: ( ( 'around' ) (unnamed47= r_pointcut ) ( '(' ) ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:2: ( 'around' ) (unnamed47= r_pointcut ) ( '(' ) ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (unnamed49= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:2: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:3: 'around'
            {
            match(input,62,FOLLOW_62_in_r_around1506); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:49: (unnamed47= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:50: unnamed47= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_around1514);
            unnamed47=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed47); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:106: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:107: '('
            {
            match(input,31,FOLLOW_31_in_r_around1520); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:148: ( ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier||LA36_0==33||(LA36_0>=69 && LA36_0<=71)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:149: ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:149: ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                            new NoViableAltException("172:149: ( (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:150: (unnamed48= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:150: (unnamed48= r_declaredParameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:151: unnamed48= r_declaredParameterList
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_around1530);
                            unnamed48=r_declaredParameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed48); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:220: ( ( ( ',' )? ( '*' ) ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=32 && LA34_0<=33)) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:221: ( ( ',' )? ( '*' ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:221: ( ( ',' )? ( '*' ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:222: ( ',' )? ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:222: ( ',' )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==32) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:223: ','
                                            {
                                            match(input,32,FOLLOW_32_in_r_around1538); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }
                                            break;

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:265: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:266: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_around1545); if (failed) return cn;
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:4: ( '*' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:4: ( '*' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:5: '*'
                            {
                            match(input,33,FOLLOW_33_in_r_around1557); if (failed) return cn;
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:49: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:50: ')'
            {
            match(input,34,FOLLOW_34_in_r_around1566); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:91: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:92: ':'
            {
            match(input,61,FOLLOW_61_in_r_around1572); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:133: (unnamed49= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:134: unnamed49= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_around1580);
            unnamed49=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed49); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:192: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:173:193: ';'
            {
            match(input,28,FOLLOW_28_in_r_around1586); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:1: r_pointcut returns [CompositeNode cn] : ( ( ( '*' ) | (unnamed50= r_identifier ) ) ) ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )* ;
    public CompositeNode r_pointcut() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed50 = null;

        CompositeNode unnamed51 = null;


         cn = factory.createPointcutNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:2: ( ( ( ( '*' ) | (unnamed50= r_identifier ) ) ) ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:2: ( ( ( '*' ) | (unnamed50= r_identifier ) ) ) ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:2: ( ( ( '*' ) | (unnamed50= r_identifier ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:3: ( ( '*' ) | (unnamed50= r_identifier ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:3: ( ( '*' ) | (unnamed50= r_identifier ) )
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
                    new NoViableAltException("179:3: ( ( '*' ) | (unnamed50= r_identifier ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:4: ( '*' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:4: ( '*' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:5: '*'
                    {
                    match(input,33,FOLLOW_33_in_r_pointcut1612); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:4: (unnamed50= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:4: (unnamed50= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:5: unnamed50= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut1623);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:65: ( ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Identifier||LA39_0==33||LA39_0==63) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:66: ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:66: ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) )
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
            	            new NoViableAltException("180:66: ( ( '*' ) | (unnamed51= r_identifier ) | ( '::' ) )", 38, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:67: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:67: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:180:68: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_pointcut1633); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:4: (unnamed51= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:4: (unnamed51= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:5: unnamed51= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_pointcut1644);
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
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:4: ( '::' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:4: ( '::' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:5: '::'
            	            {
            	            match(input,63,FOLLOW_63_in_r_pointcut1653); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:185:1: r_extension returns [CompositeNode cn] : ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= r_type )? (name= r_identifier ) ( '(' ) (paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) ) ( ';' ) ;
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= r_type )? (name= r_identifier ) ( '(' ) (paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (returnType= r_type )? (name= r_identifier ) ( '(' ) (paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=64 && LA41_0<=66)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
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
            	            new NoViableAltException("188:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:4: ( 'private' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:4: ( 'private' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:5: 'private'
            	            {
            	            match(input,64,FOLLOW_64_in_r_extension1682); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "private"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:4: ( 'cached' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:4: ( 'cached' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:5: 'cached'
            	            {
            	            match(input,65,FOLLOW_65_in_r_extension1691); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "cached"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:4: ( 'create' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:4: ( 'create' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:5: 'create'
            	            {
            	            match(input,66,FOLLOW_66_in_r_extension1700); if (failed) return cn;
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:58: (returnType= r_type )?
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:59: returnType= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension1711);
                    returnType=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, returnType); ((ExtensionNode) cn).setReturnType(returnType); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:162: (name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:163: name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_extension1720);
            name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, name); ((ExtensionNode) cn).setName(name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:247: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:248: '('
            {
            match(input,31,FOLLOW_31_in_r_extension1726); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:289: (paramList= r_declaredParameterList )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Identifier||(LA43_0>=69 && LA43_0<=71)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:290: paramList= r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension1734);
                    paramList=r_declaredParameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, paramList); ((ExtensionNode) cn).setParamList(paramList); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:406: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:407: ')'
            {
            match(input,34,FOLLOW_34_in_r_extension1741); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:448: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:449: ':'
            {
            match(input,61,FOLLOW_61_in_r_extension1747); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:490: ( ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:491: ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:491: ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) )
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
                    new NoViableAltException("190:491: ( ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' ) | (extendBody= r_expression ) )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:492: ( 'JAVA' ) (javaReturnType= r_javaType ) ( '.' ) (javaName= r_identifier ) ( '(' ) ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:492: ( 'JAVA' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:493: 'JAVA'
                    {
                    match(input,67,FOLLOW_67_in_r_extension1755); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:537: (javaReturnType= r_javaType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:538: javaReturnType= r_javaType
                    {
                    pushFollow(FOLLOW_r_javaType_in_r_extension1763);
                    javaReturnType=r_javaType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, javaReturnType); ((ExtensionNode) cn).setJavaReturnType(javaReturnType); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:660: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:661: '.'
                    {
                    match(input,68,FOLLOW_68_in_r_extension1769); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:702: (javaName= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:703: javaName= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension1777);
                    javaName=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, javaName); ((ExtensionNode) cn).setJavaName(javaName); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:803: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:804: '('
                    {
                    match(input,31,FOLLOW_31_in_r_extension1783); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:845: ( ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==Identifier) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:846: ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:846: ( (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )* )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:847: (unnamed52= r_javaType ) ( ( ( ',' ) (unnamed53= r_javaType ) ) )*
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:847: (unnamed52= r_javaType )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:848: unnamed52= r_javaType
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension1793);
                            unnamed52=r_javaType();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed52); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:904: ( ( ( ',' ) (unnamed53= r_javaType ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==32) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:905: ( ( ',' ) (unnamed53= r_javaType ) )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:905: ( ( ',' ) (unnamed53= r_javaType ) )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:906: ( ',' ) (unnamed53= r_javaType )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:906: ( ',' )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:907: ','
                            	    {
                            	    match(input,32,FOLLOW_32_in_r_extension1801); if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addLeafNodeForToken(cn, null); 
                            	    }

                            	    }

                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:948: (unnamed53= r_javaType )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:949: unnamed53= r_javaType
                            	    {
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension1809);
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:1011: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:1012: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_extension1821); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:4: (extendBody= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:4: (extendBody= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:5: extendBody= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension1832);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:115: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:116: ';'
            {
            match(input,28,FOLLOW_28_in_r_extension1840); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:1: r_javaType returns [CompositeNode cn] : (unnamed54= r_identifier ) ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* ;
    public CompositeNode r_javaType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed54 = null;

        CompositeNode unnamed55 = null;


         cn = factory.createJavaTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: ( (unnamed54= r_identifier ) ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: (unnamed54= r_identifier ) ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: (unnamed54= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:3: unnamed54= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_javaType1866);
            unnamed54=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed54); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:61: ( ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:62: ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:62: ( ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:63: ( '.' ) ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:63: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:64: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_r_javaType1874); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:105: ( ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:106: ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:106: ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
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
            	            new NoViableAltException("197:106: ( (unnamed55= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 47, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt47) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:107: (unnamed55= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:107: (unnamed55= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:108: unnamed55= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType1884);
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
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:4: ( 'Collection' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:4: ( 'Collection' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:5: 'Collection'
            	            {
            	            match(input,69,FOLLOW_69_in_r_javaType1893); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:4: ( 'List' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:4: ( 'List' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:5: 'List'
            	            {
            	            match(input,70,FOLLOW_70_in_r_javaType1902); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:4: ( 'Set' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:4: ( 'Set' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:5: 'Set'
            	            {
            	            match(input,71,FOLLOW_71_in_r_javaType1911); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:203:1: r_test_expression returns [CompositeNode cn] : (unnamed56= r_expression ) ( EOF ) ;
    public CompositeNode r_test_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed56 = null;


         cn = factory.createTest_expressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: ( (unnamed56= r_expression ) ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: (unnamed56= r_expression ) ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: (unnamed56= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:3: unnamed56= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_test_expression1947);
            unnamed56=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed56); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:61: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:62: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_r_test_expression1953); if (failed) return cn;

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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:210:1: r_expression returns [CompositeNode cn] : (unnamed57= r_letExpression ) ;
    public CompositeNode r_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed57 = null;


         cn = factory.createExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: ( (unnamed57= r_letExpression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: (unnamed57= r_letExpression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:2: (unnamed57= r_letExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:214:3: unnamed57= r_letExpression
            {
            pushFollow(FOLLOW_r_letExpression_in_r_expression1982);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression ) | (unnamed61= r_castedExpression ) );
    public CompositeNode r_letExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed58 = null;

        CompositeNode unnamed59 = null;

        CompositeNode unnamed60 = null;

        CompositeNode unnamed61 = null;


         cn = factory.createLetExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression ) | (unnamed61= r_castedExpression ) )
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
                    new NoViableAltException("217:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression ) | (unnamed61= r_castedExpression ) );", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( 'let' ) (unnamed58= r_identifier ) ( '=' ) (unnamed59= r_castedExpression ) ( ':' ) (unnamed60= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( 'let' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:3: 'let'
                    {
                    match(input,72,FOLLOW_72_in_r_letExpression2011); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:46: (unnamed58= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:47: unnamed58= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression2019);
                    unnamed58=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed58); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:105: ( '=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:106: '='
                    {
                    match(input,73,FOLLOW_73_in_r_letExpression2025); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:147: (unnamed59= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:148: unnamed59= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2033);
                    unnamed59=r_castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed59); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:212: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:213: ':'
                    {
                    match(input,61,FOLLOW_61_in_r_letExpression2039); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:254: (unnamed60= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:255: unnamed60= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_letExpression2047);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: (unnamed61= r_castedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:4: (unnamed61= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:222:5: unnamed61= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2058);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:225:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) ) | (unnamed64= r_chainExpression ) );
    public CompositeNode r_castedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed62 = null;

        CompositeNode unnamed63 = null;

        CompositeNode unnamed64 = null;


         cn = factory.createCastedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:2: ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) ) | (unnamed64= r_chainExpression ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:2: ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:38: ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:39: ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:39: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:40: '('
                    {
                    match(input,31,FOLLOW_31_in_r_castedExpression2098); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:81: (unnamed62= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:82: unnamed62= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_castedExpression2106);
                    unnamed62=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed62); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:134: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:135: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_castedExpression2112); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:176: (unnamed63= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:177: unnamed63= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2120);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:230:4: (unnamed64= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:230:4: (unnamed64= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:230:5: unnamed64= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2132);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:233:1: r_chainExpression returns [CompositeNode cn] : (unnamed65= r_ifExpression ) ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )* ;
    public CompositeNode r_chainExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed65 = null;

        CompositeNode unnamed66 = null;


         cn = factory.createChainExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:2: ( (unnamed65= r_ifExpression ) ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:2: (unnamed65= r_ifExpression ) ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:2: (unnamed65= r_ifExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:3: unnamed65= r_ifExpression
            {
            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2163);
            unnamed65=r_ifExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed65); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:63: ( ( ( '->' ) (unnamed66= r_ifExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==74) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:64: ( ( '->' ) (unnamed66= r_ifExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:64: ( ( '->' ) (unnamed66= r_ifExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:65: ( '->' ) (unnamed66= r_ifExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:65: ( '->' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:66: '->'
            	    {
            	    match(input,74,FOLLOW_74_in_r_chainExpression2171); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:108: (unnamed66= r_ifExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:109: unnamed66= r_ifExpression
            	    {
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2179);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:240:1: r_ifExpression returns [CompositeNode cn] : ( (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )? | ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )? );
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:2: ( (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )? | ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )? )
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
                    new NoViableAltException("240:1: r_ifExpression returns [CompositeNode cn] : ( (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )? | ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )? );", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:2: (unnamed67= r_switchExpression ) ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:2: (unnamed67= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:3: unnamed67= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2213);
                    unnamed67=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed67); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:67: ( ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==75) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:68: ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:68: ( ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:69: ( '?' ) (unnamed68= r_expression ) ( ':' ) (unnamed69= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:69: ( '?' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:70: '?'
                            {
                            match(input,75,FOLLOW_75_in_r_ifExpression2221); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:111: (unnamed68= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:112: unnamed68= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression2229);
                            unnamed68=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed68); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:170: ( ':' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:171: ':'
                            {
                            match(input,61,FOLLOW_61_in_r_ifExpression2235); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:212: (unnamed69= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:213: unnamed69= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2243);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:4: ( 'if' ) (unnamed70= r_expression ) ( 'then' ) (unnamed71= r_switchExpression ) ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:4: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:5: 'if'
                    {
                    match(input,59,FOLLOW_59_in_r_ifExpression2255); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:47: (unnamed70= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:48: unnamed70= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression2263);
                    unnamed70=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed70); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:106: ( 'then' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:107: 'then'
                    {
                    match(input,76,FOLLOW_76_in_r_ifExpression2269); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:151: (unnamed71= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:152: unnamed71= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2277);
                    unnamed71=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed71); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:216: ( ( ( 'else' ) (unnamed72= r_switchExpression ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==77) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:217: ( ( 'else' ) (unnamed72= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:217: ( ( 'else' ) (unnamed72= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:218: ( 'else' ) (unnamed72= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:218: ( 'else' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:219: 'else'
                            {
                            match(input,77,FOLLOW_77_in_r_ifExpression2285); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:263: (unnamed72= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:245:264: unnamed72= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2293);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:248:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' ) | (unnamed76= r_orExpression ) );
    public CompositeNode r_switchExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed73 = null;

        CompositeNode unnamed74 = null;

        CompositeNode unnamed75 = null;

        CompositeNode unnamed76 = null;


         cn = factory.createSwitchExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:2: ( ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' ) | (unnamed76= r_orExpression ) )
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
                    new NoViableAltException("248:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' ) | (unnamed76= r_orExpression ) );", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:2: ( 'switch' ) ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )? ( '{' ) (unnamed74= r_casePart )* ( 'default' ) ( ':' ) (unnamed75= r_orExpression ) ( '}' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:2: ( 'switch' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:3: 'switch'
                    {
                    match(input,78,FOLLOW_78_in_r_switchExpression2325); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:49: ( ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==31) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:50: ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:50: ( ( '(' ) (unnamed73= r_orExpression ) ( ')' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:51: ( '(' ) (unnamed73= r_orExpression ) ( ')' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:51: ( '(' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:52: '('
                            {
                            match(input,31,FOLLOW_31_in_r_switchExpression2333); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:93: (unnamed73= r_orExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:94: unnamed73= r_orExpression
                            {
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2341);
                            unnamed73=r_orExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed73); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:154: ( ')' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:155: ')'
                            {
                            match(input,34,FOLLOW_34_in_r_switchExpression2347); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:199: ( '{' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:200: '{'
                    {
                    match(input,79,FOLLOW_79_in_r_switchExpression2356); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:241: (unnamed74= r_casePart )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==82) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:242: unnamed74= r_casePart
                    	    {
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression2364);
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:299: ( 'default' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:300: 'default'
                    {
                    match(input,80,FOLLOW_80_in_r_switchExpression2371); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:347: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:348: ':'
                    {
                    match(input,61,FOLLOW_61_in_r_switchExpression2377); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:389: (unnamed75= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:390: unnamed75= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2385);
                    unnamed75=r_orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed75); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:450: ( '}' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:451: '}'
                    {
                    match(input,81,FOLLOW_81_in_r_switchExpression2391); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:4: (unnamed76= r_orExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:4: (unnamed76= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:253:5: unnamed76= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2402);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:256:1: r_casePart returns [CompositeNode cn] : ( 'case' ) (unnamed77= r_expression ) ( ':' ) (unnamed78= r_expression ) ;
    public CompositeNode r_casePart() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed77 = null;

        CompositeNode unnamed78 = null;


         cn = factory.createCasePartNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:2: ( ( 'case' ) (unnamed77= r_expression ) ( ':' ) (unnamed78= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:2: ( 'case' ) (unnamed77= r_expression ) ( ':' ) (unnamed78= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:2: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:3: 'case'
            {
            match(input,82,FOLLOW_82_in_r_casePart2426); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:47: (unnamed77= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:48: unnamed77= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2434);
            unnamed77=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed77); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:106: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:107: ':'
            {
            match(input,61,FOLLOW_61_in_r_casePart2440); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:148: (unnamed78= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:149: unnamed78= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2448);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:1: r_orExpression returns [CompositeNode cn] : (unnamed79= r_andExpression ) ( ( ( '||' ) (unnamed80= r_andExpression ) ) )* ;
    public CompositeNode r_orExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed79 = null;

        CompositeNode unnamed80 = null;


         cn = factory.createOrExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:2: ( (unnamed79= r_andExpression ) ( ( ( '||' ) (unnamed80= r_andExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:2: (unnamed79= r_andExpression ) ( ( ( '||' ) (unnamed80= r_andExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:2: (unnamed79= r_andExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:3: unnamed79= r_andExpression
            {
            pushFollow(FOLLOW_r_andExpression_in_r_orExpression2479);
            unnamed79=r_andExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed79); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:64: ( ( ( '||' ) (unnamed80= r_andExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==83) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:65: ( ( '||' ) (unnamed80= r_andExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:65: ( ( '||' ) (unnamed80= r_andExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:66: ( '||' ) (unnamed80= r_andExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:66: ( '||' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:67: '||'
            	    {
            	    match(input,83,FOLLOW_83_in_r_orExpression2487); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:109: (unnamed80= r_andExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:110: unnamed80= r_andExpression
            	    {
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression2495);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:1: r_andExpression returns [CompositeNode cn] : (unnamed81= r_impliesExpression ) ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )* ;
    public CompositeNode r_andExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed81 = null;

        CompositeNode unnamed82 = null;


         cn = factory.createAndExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:2: ( (unnamed81= r_impliesExpression ) ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:2: (unnamed81= r_impliesExpression ) ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:2: (unnamed81= r_impliesExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:3: unnamed81= r_impliesExpression
            {
            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2529);
            unnamed81=r_impliesExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed81); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:68: ( ( ( '&&' ) (unnamed82= r_impliesExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==84) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:69: ( ( '&&' ) (unnamed82= r_impliesExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:69: ( ( '&&' ) (unnamed82= r_impliesExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:70: ( '&&' ) (unnamed82= r_impliesExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:70: ( '&&' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:71: '&&'
            	    {
            	    match(input,84,FOLLOW_84_in_r_andExpression2537); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:113: (unnamed82= r_impliesExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:114: unnamed82= r_impliesExpression
            	    {
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2545);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:1: r_impliesExpression returns [CompositeNode cn] : (unnamed83= r_relationalExpression ) ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )* ;
    public CompositeNode r_impliesExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed83 = null;

        CompositeNode unnamed84 = null;


         cn = factory.createImpliesExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: ( (unnamed83= r_relationalExpression ) ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: (unnamed83= r_relationalExpression ) ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: (unnamed83= r_relationalExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:3: unnamed83= r_relationalExpression
            {
            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2579);
            unnamed83=r_relationalExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed83); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:71: ( ( ( 'implies' ) (unnamed84= r_relationalExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==85) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:72: ( ( 'implies' ) (unnamed84= r_relationalExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:72: ( ( 'implies' ) (unnamed84= r_relationalExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:73: ( 'implies' ) (unnamed84= r_relationalExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:73: ( 'implies' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:74: 'implies'
            	    {
            	    match(input,85,FOLLOW_85_in_r_impliesExpression2587); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:121: (unnamed84= r_relationalExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:122: unnamed84= r_relationalExpression
            	    {
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2595);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:283:1: r_relationalExpression returns [CompositeNode cn] : (leftOperand= r_additiveExpression ) ( ( (operator= r_relationalOperator ) (rightOperand= r_additiveExpression ) ) )* ;
    public CompositeNode r_relationalExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode leftOperand = null;

        CompositeNode operator = null;

        CompositeNode rightOperand = null;


         cn = factory.createRelationalExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: ( (leftOperand= r_additiveExpression ) ( ( (operator= r_relationalOperator ) (rightOperand= r_additiveExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: (leftOperand= r_additiveExpression ) ( ( (operator= r_relationalOperator ) (rightOperand= r_additiveExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: (leftOperand= r_additiveExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:3: leftOperand= r_additiveExpression
            {
            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2629);
            leftOperand=r_additiveExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, leftOperand); ((RelationalExpressionNode) cn).setLeftOperand(leftOperand); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:134: ( ( (operator= r_relationalOperator ) (rightOperand= r_additiveExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=86 && LA61_0<=91)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:135: ( (operator= r_relationalOperator ) (rightOperand= r_additiveExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:135: ( (operator= r_relationalOperator ) (rightOperand= r_additiveExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:136: (operator= r_relationalOperator ) (rightOperand= r_additiveExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:136: (operator= r_relationalOperator )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:137: operator= r_relationalOperator
            	    {
            	    pushFollow(FOLLOW_r_relationalOperator_in_r_relationalExpression2639);
            	    operator=r_relationalOperator();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, operator); ((RelationalExpressionNode) cn).setOperator(operator); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:256: (rightOperand= r_additiveExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:257: rightOperand= r_additiveExpression
            	    {
            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2647);
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
    // $ANTLR end r_relationalExpression


    // $ANTLR start r_relationalOperator
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:290:1: r_relationalOperator returns [CompositeNode cn] : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public CompositeNode r_relationalOperator() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createRelationalOperatorNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
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
                    new NoViableAltException("290:1: r_relationalOperator returns [CompositeNode cn] : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: ( '==' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: ( '==' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:3: '=='
                    {
                    match(input,86,FOLLOW_86_in_r_relationalOperator2674); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:4: ( '!=' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:4: ( '!=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:5: '!='
                    {
                    match(input,87,FOLLOW_87_in_r_relationalOperator2683); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( '>=' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( '>=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:5: '>='
                    {
                    match(input,88,FOLLOW_88_in_r_relationalOperator2692); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:4: ( '<=' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:4: ( '<=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:5: '<='
                    {
                    match(input,89,FOLLOW_89_in_r_relationalOperator2701); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:4: ( '>' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:4: ( '>' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:5: '>'
                    {
                    match(input,90,FOLLOW_90_in_r_relationalOperator2710); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( '<' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( '<' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:5: '<'
                    {
                    match(input,91,FOLLOW_91_in_r_relationalOperator2719); if (failed) return cn;
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
    // $ANTLR end r_relationalOperator


    // $ANTLR start r_additiveExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:301:1: r_additiveExpression returns [CompositeNode cn] : (unnamed85= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )* ;
    public CompositeNode r_additiveExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed85 = null;

        CompositeNode unnamed86 = null;


         cn = factory.createAdditiveExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( (unnamed85= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: (unnamed85= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: (unnamed85= r_multiplicativeExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:3: unnamed85= r_multiplicativeExpression
            {
            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2750);
            unnamed85=r_multiplicativeExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed85); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:75: ( ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:76: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:76: ( ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:77: ( ( ( '+' ) | ( '-' ) ) ) (unnamed86= r_multiplicativeExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:77: ( ( ( '+' ) | ( '-' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:78: ( ( '+' ) | ( '-' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:78: ( ( '+' ) | ( '-' ) )
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
            	            new NoViableAltException("305:78: ( ( '+' ) | ( '-' ) )", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:79: ( '+' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:79: ( '+' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:80: '+'
            	            {
            	            match(input,92,FOLLOW_92_in_r_additiveExpression2760); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:4: ( '-' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:4: ( '-' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:5: '-'
            	            {
            	            match(input,36,FOLLOW_36_in_r_additiveExpression2769); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:48: (unnamed86= r_multiplicativeExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:49: unnamed86= r_multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2779);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:309:1: r_multiplicativeExpression returns [CompositeNode cn] : (unnamed87= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )* ;
    public CompositeNode r_multiplicativeExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed87 = null;

        CompositeNode unnamed88 = null;


         cn = factory.createMultiplicativeExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:2: ( (unnamed87= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:2: (unnamed87= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:2: (unnamed87= r_unaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:3: unnamed87= r_unaryExpression
            {
            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2813);
            unnamed87=r_unaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed87); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:66: ( ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==33||LA66_0==93) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:67: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:67: ( ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:68: ( ( ( '*' ) | ( '/' ) ) ) (unnamed88= r_unaryExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:68: ( ( ( '*' ) | ( '/' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:69: ( ( '*' ) | ( '/' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:69: ( ( '*' ) | ( '/' ) )
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
            	            new NoViableAltException("313:69: ( ( '*' ) | ( '/' ) )", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:70: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:70: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:71: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_multiplicativeExpression2823); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:4: ( '/' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:4: ( '/' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:5: '/'
            	            {
            	            match(input,93,FOLLOW_93_in_r_multiplicativeExpression2832); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:48: (unnamed88= r_unaryExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:49: unnamed88= r_unaryExpression
            	    {
            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2842);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:317:1: r_unaryExpression returns [CompositeNode cn] : ( (unnamed89= r_infixExpression ) | ( '!' ) (unnamed90= r_infixExpression ) | ( '-' ) (unnamed91= r_infixExpression ) );
    public CompositeNode r_unaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed89 = null;

        CompositeNode unnamed90 = null;

        CompositeNode unnamed91 = null;


         cn = factory.createUnaryExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: ( (unnamed89= r_infixExpression ) | ( '!' ) (unnamed90= r_infixExpression ) | ( '-' ) (unnamed91= r_infixExpression ) )
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
                    new NoViableAltException("317:1: r_unaryExpression returns [CompositeNode cn] : ( (unnamed89= r_infixExpression ) | ( '!' ) (unnamed90= r_infixExpression ) | ( '-' ) (unnamed91= r_infixExpression ) );", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: (unnamed89= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: (unnamed89= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:3: unnamed89= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2876);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:4: ( '!' ) (unnamed90= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:4: ( '!' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:5: '!'
                    {
                    match(input,94,FOLLOW_94_in_r_unaryExpression2885); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:46: (unnamed90= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:47: unnamed90= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2893);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: ( '-' ) (unnamed91= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: ( '-' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:5: '-'
                    {
                    match(input,36,FOLLOW_36_in_r_unaryExpression2902); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:46: (unnamed91= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:47: unnamed91= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2910);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:326:1: r_infixExpression returns [CompositeNode cn] : (target= r_primaryExpression ) ( ( ( '.' ) (calls= r_featureCall ) ) )* ;
    public CompositeNode r_infixExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode target = null;

        CompositeNode calls = null;


         cn = factory.createInfixExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: ( (target= r_primaryExpression ) ( ( ( '.' ) (calls= r_featureCall ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: (target= r_primaryExpression ) ( ( ( '.' ) (calls= r_featureCall ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: (target= r_primaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:3: target= r_primaryExpression
            {
            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression2941);
            target=r_primaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, target); ((InfixExpressionNode) cn).setTarget(target); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:108: ( ( ( '.' ) (calls= r_featureCall ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==68) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:109: ( ( '.' ) (calls= r_featureCall ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:109: ( ( '.' ) (calls= r_featureCall ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:110: ( '.' ) (calls= r_featureCall )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:110: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:111: '.'
            	    {
            	    match(input,68,FOLLOW_68_in_r_infixExpression2949); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:152: (calls= r_featureCall )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:153: calls= r_featureCall
            	    {
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression2957);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:2: ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) )
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
                    new NoViableAltException("333:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:2: ( r_stringLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:2: ( r_stringLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:3: r_stringLiteral
                    {
                    pushFollow(FOLLOW_r_stringLiteral_in_r_primaryExpression2979);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:4: ( r_featureCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:4: ( r_featureCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:5: r_featureCall
                    {
                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression2988);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:4: ( r_booleanLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:4: ( r_booleanLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:5: r_booleanLiteral
                    {
                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression2997);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:4: ( r_numberLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:4: ( r_numberLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:5: r_numberLiteral
                    {
                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression3006);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:4: ( r_nullLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:4: ( r_nullLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:5: r_nullLiteral
                    {
                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression3015);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( r_listLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( r_listLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:5: r_listLiteral
                    {
                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression3024);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:4: ( r_constructorCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:4: ( r_constructorCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:5: r_constructorCall
                    {
                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression3033);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:4: ( r_globalVarExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:4: ( r_globalVarExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:5: r_globalVarExpression
                    {
                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression3042);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:4: ( r_paranthesizedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:4: ( r_paranthesizedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:5: r_paranthesizedExpression
                    {
                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression3051);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:345:1: r_stringLiteral returns [CompositeNode cn] : ( StringLiteral ) ;
    public CompositeNode r_stringLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createStringLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:348:2: ( ( StringLiteral ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:348:2: ( StringLiteral )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:348:2: ( StringLiteral )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:348:3: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_r_stringLiteral3075); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:1: r_paranthesizedExpression returns [CompositeNode cn] : ( '(' ) (unnamed92= r_expression ) ( ')' ) ;
    public CompositeNode r_paranthesizedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed92 = null;


         cn = factory.createParanthesizedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:2: ( ( '(' ) (unnamed92= r_expression ) ( ')' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:2: ( '(' ) (unnamed92= r_expression ) ( ')' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:2: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:3: '('
            {
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression3099); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:44: (unnamed92= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:45: unnamed92= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression3107);
            unnamed92=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, unnamed92); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:103: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:104: ')'
            {
            match(input,34,FOLLOW_34_in_r_paranthesizedExpression3113); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:1: r_globalVarExpression returns [CompositeNode cn] : ( 'GLOBALVAR' ) (unnamed93= r_identifier ) ;
    public CompositeNode r_globalVarExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed93 = null;


         cn = factory.createGlobalVarExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:2: ( ( 'GLOBALVAR' ) (unnamed93= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:2: ( 'GLOBALVAR' ) (unnamed93= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:2: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:3: 'GLOBALVAR'
            {
            match(input,95,FOLLOW_95_in_r_globalVarExpression3137); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:52: (unnamed93= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:53: unnamed93= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression3145);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:1: r_featureCall returns [CompositeNode cn] : ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) );
    public CompositeNode r_featureCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode name = null;

        CompositeNode paramList = null;

        CompositeNode unnamed94 = null;

        CompositeNode unnamed95 = null;


         cn = factory.createFeatureCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:2: ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) )
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
                        new NoViableAltException("363:1: r_featureCall returns [CompositeNode cn] : ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) );", 71, 1, input);

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
                    new NoViableAltException("363:1: r_featureCall returns [CompositeNode cn] : ( (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' ) | (unnamed94= r_type ) | (unnamed95= r_collectionExpression ) );", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:2: (name= r_identifier ) ( '(' ) ( ( (paramList= r_parameterList ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:2: (name= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:3: name= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_featureCall3176);
                    name=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, name); ((FeatureCallNode) cn).setName(name); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:89: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:90: '('
                    {
                    match(input,31,FOLLOW_31_in_r_featureCall3182); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:131: ( ( (paramList= r_parameterList ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( ((LA70_0>=StringLiteral && LA70_0<=Identifier)||LA70_0==31||LA70_0==36||LA70_0==59||(LA70_0>=69 && LA70_0<=72)||(LA70_0>=78 && LA70_0<=79)||(LA70_0>=94 && LA70_0<=108)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:132: ( (paramList= r_parameterList ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:132: ( (paramList= r_parameterList ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:133: (paramList= r_parameterList )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:133: (paramList= r_parameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:134: paramList= r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall3192);
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:246: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:247: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_featureCall3201); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:4: (unnamed94= r_type )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:4: (unnamed94= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:5: unnamed94= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_featureCall3212);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:369:4: (unnamed95= r_collectionExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:369:4: (unnamed95= r_collectionExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:369:5: unnamed95= r_collectionExpression
                    {
                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall3223);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:372:1: r_listLiteral returns [CompositeNode cn] : ( '{' ) ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )? ( '}' ) ;
    public CompositeNode r_listLiteral() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed96 = null;

        CompositeNode unnamed97 = null;


         cn = factory.createListLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:2: ( ( '{' ) ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )? ( '}' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:2: ( '{' ) ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )? ( '}' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:2: ( '{' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:3: '{'
            {
            match(input,79,FOLLOW_79_in_r_listLiteral3247); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:44: ( ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=StringLiteral && LA73_0<=Identifier)||LA73_0==31||LA73_0==36||LA73_0==59||(LA73_0>=69 && LA73_0<=72)||(LA73_0>=78 && LA73_0<=79)||(LA73_0>=94 && LA73_0<=108)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:45: ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:45: ( (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )* )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:46: (unnamed96= r_expression ) ( ( ( ',' ) (unnamed97= r_expression ) ) )*
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:46: (unnamed96= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:47: unnamed96= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral3257);
                    unnamed96=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed96); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:105: ( ( ( ',' ) (unnamed97= r_expression ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==32) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:106: ( ( ',' ) (unnamed97= r_expression ) )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:106: ( ( ',' ) (unnamed97= r_expression ) )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:107: ( ',' ) (unnamed97= r_expression )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:107: ( ',' )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:108: ','
                    	    {
                    	    match(input,32,FOLLOW_32_in_r_listLiteral3265); if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addLeafNodeForToken(cn, null); 
                    	    }

                    	    }

                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:149: (unnamed97= r_expression )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:150: unnamed97= r_expression
                    	    {
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral3273);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:214: ( '}' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:215: '}'
            {
            match(input,81,FOLLOW_81_in_r_listLiteral3285); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:1: r_constructorCall returns [CompositeNode cn] : ( 'new' ) (unnamed98= r_simpleType ) ;
    public CompositeNode r_constructorCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed98 = null;


         cn = factory.createConstructorCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( ( 'new' ) (unnamed98= r_simpleType ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( 'new' ) (unnamed98= r_simpleType )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:3: 'new'
            {
            match(input,96,FOLLOW_96_in_r_constructorCall3309); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:46: (unnamed98= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:47: unnamed98= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall3317);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:384:1: r_booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );
    public CompositeNode r_booleanLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createBooleanLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( ( 'false' ) | ( 'true' ) )
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
                    new NoViableAltException("384:1: r_booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( 'false' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( 'false' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:3: 'false'
                    {
                    match(input,97,FOLLOW_97_in_r_booleanLiteral3341); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:388:4: ( 'true' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:388:4: ( 'true' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:388:5: 'true'
                    {
                    match(input,98,FOLLOW_98_in_r_booleanLiteral3350); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:391:1: r_nullLiteral returns [CompositeNode cn] : ( 'null' ) ;
    public CompositeNode r_nullLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNullLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: ( ( 'null' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: ( 'null' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:2: ( 'null' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:394:3: 'null'
            {
            match(input,99,FOLLOW_99_in_r_nullLiteral3374); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:397:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );
    public CompositeNode r_numberLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNumberLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:2: ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) )
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
                            new NoViableAltException("397:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA75_1==EOF||LA75_1==TEXT||LA75_1==Identifier||LA75_1==28||(LA75_1>=32 && LA75_1<=34)||(LA75_1>=36 && LA75_1<=37)||LA75_1==40||LA75_1==43||(LA75_1>=54 && LA75_1<=56)||(LA75_1>=60 && LA75_1<=61)||(LA75_1>=74 && LA75_1<=77)||(LA75_1>=80 && LA75_1<=93)) ) {
                    alt75=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("397:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("397:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:2: ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:2: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:3: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3398); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:4: ( IntLiteral ) ( '.' ) ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:4: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:5: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3407); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:53: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:54: '.'
                    {
                    match(input,68,FOLLOW_68_in_r_numberLiteral3413); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:95: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:96: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3419); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:404:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' ) );
    public CompositeNode r_collectionExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed99 = null;

        CompositeNode unnamed100 = null;

        CompositeNode unnamed101 = null;


         cn = factory.createCollectionExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:2: ( ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' ) )
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
                    new NoViableAltException("404:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' ) );", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:2: ( 'typeSelect' ) ( '(' ) (unnamed99= r_type ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:2: ( 'typeSelect' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:3: 'typeSelect'
                    {
                    match(input,100,FOLLOW_100_in_r_collectionExpression3443); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:54: '('
                    {
                    match(input,31,FOLLOW_31_in_r_collectionExpression3449); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:95: (unnamed99= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:96: unnamed99= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression3457);
                    unnamed99=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed99); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:148: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:149: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3463); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (unnamed100= r_identifier ) ( '|' ) ) )? (unnamed101= r_expression ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
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
                            new NoViableAltException("408:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:6: ( 'collect' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:6: ( 'collect' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:7: 'collect'
                            {
                            match(input,101,FOLLOW_101_in_r_collectionExpression3474); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:409:4: ( 'select' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:409:4: ( 'select' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:409:5: 'select'
                            {
                            match(input,102,FOLLOW_102_in_r_collectionExpression3483); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:410:4: ( 'selectFirst' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:410:4: ( 'selectFirst' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:410:5: 'selectFirst'
                            {
                            match(input,103,FOLLOW_103_in_r_collectionExpression3492); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:411:4: ( 'reject' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:411:4: ( 'reject' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:411:5: 'reject'
                            {
                            match(input,104,FOLLOW_104_in_r_collectionExpression3501); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:412:4: ( 'exists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:412:4: ( 'exists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:412:5: 'exists'
                            {
                            match(input,105,FOLLOW_105_in_r_collectionExpression3510); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 6 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:413:4: ( 'notExists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:413:4: ( 'notExists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:413:5: 'notExists'
                            {
                            match(input,106,FOLLOW_106_in_r_collectionExpression3519); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 7 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:4: ( 'sortBy' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:4: ( 'sortBy' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:5: 'sortBy'
                            {
                            match(input,107,FOLLOW_107_in_r_collectionExpression3528); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 8 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:4: ( 'forAll' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:4: ( 'forAll' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:5: 'forAll'
                            {
                            match(input,108,FOLLOW_108_in_r_collectionExpression3537); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;

                    }


                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:54: '('
                    {
                    match(input,31,FOLLOW_31_in_r_collectionExpression3545); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:95: ( ( (unnamed100= r_identifier ) ( '|' ) ) )?
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:96: ( (unnamed100= r_identifier ) ( '|' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:96: ( (unnamed100= r_identifier ) ( '|' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:97: (unnamed100= r_identifier ) ( '|' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:97: (unnamed100= r_identifier )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:98: unnamed100= r_identifier
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression3555);
                            unnamed100=r_identifier();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, unnamed100); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:158: ( '|' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:159: '|'
                            {
                            match(input,109,FOLLOW_109_in_r_collectionExpression3561); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:203: (unnamed101= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:204: unnamed101= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression3572);
                    unnamed101=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed101); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:264: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:265: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3578); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:418:1: r_declaredParameterList returns [CompositeNode cn] : (params= r_declaredParameter ) ( ( ( ',' ) (params= r_declaredParameter ) ) )* ;
    public CompositeNode r_declaredParameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode params = null;


         cn = factory.createDeclaredParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:2: ( (params= r_declaredParameter ) ( ( ( ',' ) (params= r_declaredParameter ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:2: (params= r_declaredParameter ) ( ( ( ',' ) (params= r_declaredParameter ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:2: (params= r_declaredParameter )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:3: params= r_declaredParameter
            {
            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3604);
            params=r_declaredParameter();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:120: ( ( ( ',' ) (params= r_declaredParameter ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:121: ( ( ',' ) (params= r_declaredParameter ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:121: ( ( ',' ) (params= r_declaredParameter ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:122: ( ',' ) (params= r_declaredParameter )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:122: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:123: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_declaredParameterList3612); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:164: (params= r_declaredParameter )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:165: params= r_declaredParameter
            	    {
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3620);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:424:1: r_declaredParameter returns [CompositeNode cn] : (ptype= r_type ) (name= r_identifier ) ;
    public CompositeNode r_declaredParameter() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode ptype = null;

        CompositeNode name = null;


         cn = factory.createDeclaredParameterNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:2: ( (ptype= r_type ) (name= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:2: (ptype= r_type ) (name= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:2: (ptype= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:3: ptype= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_declaredParameter3649);
            ptype=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, ptype); ((DeclaredParameterNode) cn).setPtype(ptype); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:93: (name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:94: name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter3657);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:430:1: r_parameterList returns [CompositeNode cn] : (params= r_expression ) ( ( ( ',' ) (params= r_expression ) ) )* ;
    public CompositeNode r_parameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode params = null;


         cn = factory.createParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:2: ( (params= r_expression ) ( ( ( ',' ) (params= r_expression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:2: (params= r_expression ) ( ( ( ',' ) (params= r_expression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:2: (params= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:3: params= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_parameterList3683);
            params=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:105: ( ( ( ',' ) (params= r_expression ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==32) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:106: ( ( ',' ) (params= r_expression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:106: ( ( ',' ) (params= r_expression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:107: ( ',' ) (params= r_expression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:107: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:108: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_parameterList3691); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:149: (params= r_expression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:150: params= r_expression
            	    {
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList3699);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:436:1: r_type returns [CompositeNode cn] : ( ( r_collectionType ) | ( r_simpleType ) );
    public CompositeNode r_type() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_collectionType24 = null;

        CompositeNode r_simpleType25 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:2: ( ( r_collectionType ) | ( r_simpleType ) )
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
                    new NoViableAltException("436:1: r_type returns [CompositeNode cn] : ( ( r_collectionType ) | ( r_simpleType ) );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:2: ( r_collectionType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:2: ( r_collectionType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:3: r_collectionType
                    {
                    pushFollow(FOLLOW_r_collectionType_in_r_type3721);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:438:4: ( r_simpleType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:438:4: ( r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:438:5: r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_type3730);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:441:1: r_collectionType returns [CompositeNode cn] : ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )? ;
    public CompositeNode r_collectionType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode unnamed102 = null;


         cn = factory.createCollectionTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:2: ( ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
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
                    new NoViableAltException("444:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:4: ( 'Collection' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:4: ( 'Collection' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:5: 'Collection'
                    {
                    match(input,69,FOLLOW_69_in_r_collectionType3756); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:4: ( 'List' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:4: ( 'List' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:5: 'List'
                    {
                    match(input,70,FOLLOW_70_in_r_collectionType3765); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:4: ( 'Set' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:4: ( 'Set' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:5: 'Set'
                    {
                    match(input,71,FOLLOW_71_in_r_collectionType3774); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:50: ( ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==110) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:51: ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:51: ( ( '[' ) (unnamed102= r_simpleType ) ( ']' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:52: ( '[' ) (unnamed102= r_simpleType ) ( ']' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:52: ( '[' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:53: '['
                    {
                    match(input,110,FOLLOW_110_in_r_collectionType3784); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:94: (unnamed102= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:95: unnamed102= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType3792);
                    unnamed102=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, unnamed102); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:155: ( ']' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:156: ']'
                    {
                    match(input,111,FOLLOW_111_in_r_collectionType3798); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:449:1: r_simpleType returns [CompositeNode cn] : (names= r_identifier ) ( ( ( '::' ) (names= r_identifier ) ) )* ;
    public CompositeNode r_simpleType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode names = null;


         cn = factory.createSimpleTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:2: ( (names= r_identifier ) ( ( ( '::' ) (names= r_identifier ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:2: (names= r_identifier ) ( ( ( '::' ) (names= r_identifier ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:2: (names= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:3: names= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_simpleType3827);
            names=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:98: ( ( ( '::' ) (names= r_identifier ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==63) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:99: ( ( '::' ) (names= r_identifier ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:99: ( ( '::' ) (names= r_identifier ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:100: ( '::' ) (names= r_identifier )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:100: ( '::' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:101: '::'
            	    {
            	    match(input,63,FOLLOW_63_in_r_simpleType3835); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:143: (names= r_identifier )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:144: names= r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType3843);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:455:1: r_identifier returns [CompositeNode cn] : ( Identifier ) ;
    public CompositeNode r_identifier() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createIdentifierNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:458:2: ( ( Identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:458:2: ( Identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:458:2: ( Identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:458:3: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier3870); if (failed) return cn;
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
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:2: ( '(' r_type ')' r_chainExpression )
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:3: '(' r_type ')' r_chainExpression
        {
        match(input,31,FOLLOW_31_in_synpred12087); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred12089);
        r_type();
        _fsp--;
        if (failed) return ;
        match(input,34,FOLLOW_34_in_synpred12091); if (failed) return ;
        pushFollow(FOLLOW_r_chainExpression_in_synpred12093);
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
            return "225:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (unnamed62= r_type ) ( ')' ) (unnamed63= r_chainExpression ) ) | (unnamed64= r_chainExpression ) );";
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
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file80 = new BitSet(new long[]{0x4400000028002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file93 = new BitSet(new long[]{0x4400000000002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_EOF_in_r_file102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_r_nsImport130 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_nsImport138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport153 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_nsImport159 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_nsImport167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_r_nsImport182 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport190 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_r_nsImport205 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport213 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_r_nsImport221 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definition_in_r_abstractDeclaration276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definitionAround_in_r_abstractDeclaration285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definition309 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_r_definition315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_definition323 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definition331 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definition341 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definition349 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definition356 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definition368 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definition377 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definition386 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definition394 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definition402 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_r_definition408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definition414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definitionAround438 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_r_definitionAround444 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_definitionAround452 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definitionAround460 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definitionAround470 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definitionAround478 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround485 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround497 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definitionAround506 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definitionAround515 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definitionAround523 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definitionAround531 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_r_definitionAround537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definitionAround543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence569 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_statement_in_r_sequence579 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence587 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_simpleStatement_in_r_statement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_fileStatement_in_r_statement618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_foreachStatement_in_r_statement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifStatement_in_r_statement636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letStatement_in_r_statement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_protectStatement_in_r_statement654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence685 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence695 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_r_text722 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_r_text729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_errorStatement_in_r_simpleStatement748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expandStatement_in_r_simpleStatement757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expressionStmt_in_r_simpleStatement766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_r_errorStatement790 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_errorStatement798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_r_expandStatement822 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_expandStatement830 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_r_expandStatement838 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_expandStatement846 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_expandStatement852 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_r_expandStatement865 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_expandStatement886 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement894 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_r_expandStatement902 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_expressionStmt944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_fileStatement968 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_fileStatement976 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_r_identifier_in_r_fileStatement986 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_fileStatement997 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_r_fileStatement1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_foreachStatement1027 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1035 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_foreachStatement1041 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1049 = new BitSet(new long[]{0x0000111000000400L});
    public static final BitSet FOLLOW_44_in_r_foreachStatement1057 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1065 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_r_foreachStatement1076 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1084 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_foreachStatement1095 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_r_foreachStatement1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_r_ifStatement1125 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifStatement1133 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_ifStatement1141 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseIfStatement_in_r_ifStatement1149 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseStatement_in_r_ifStatement1158 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_r_ifStatement1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_r_elseIfStatement1189 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_elseIfStatement1197 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseIfStatement1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_r_elseStatement1229 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseStatement1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_letStatement1261 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letStatement1269 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_letStatement1275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letStatement1283 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_letStatement1291 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_r_letStatement1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_r_protectStatement1321 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_r_protectStatement1327 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1335 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_r_protectStatement1341 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1349 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_r_protectStatement1355 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1363 = new BitSet(new long[]{0x0100001000000400L});
    public static final BitSet FOLLOW_56_in_r_protectStatement1369 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_protectStatement1378 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_r_protectStatement1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_r_check1408 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_check1416 = new BitSet(new long[]{0x1800002000000000L});
    public static final BitSet FOLLOW_59_in_r_check1424 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1432 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_37_in_r_check1443 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_60_in_r_check1452 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1462 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_check1468 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1476 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_check1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_r_around1506 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around1514 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around1520 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around1530 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_around1538 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_around1545 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_around1557 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_around1566 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_around1572 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_around1580 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_around1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_r_pointcut1612 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1623 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_33_in_r_pointcut1633 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1644 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_63_in_r_pointcut1653 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_64_in_r_extension1682 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_65_in_r_extension1691 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_66_in_r_extension1700 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_type_in_r_extension1711 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1720 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1726 = new BitSet(new long[]{0x0000000400002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension1734 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_extension1741 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_extension1747 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E8L});
    public static final BitSet FOLLOW_67_in_r_extension1755 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_extension1769 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1777 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1783 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1793 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_r_extension1801 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1809 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_r_extension1821 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension1832 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extension1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_javaType1874 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1884 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_r_javaType1893 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_r_javaType1902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_r_javaType1911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_expression_in_r_test_expression1947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_r_test_expression1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_r_letExpression2011 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_r_letExpression2025 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2033 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_letExpression2039 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_castedExpression2098 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression2106 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_castedExpression2112 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2163 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_r_chainExpression2171 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_r_ifExpression2221 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2229 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_ifExpression2235 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_r_ifExpression2255 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_r_ifExpression2269 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_r_ifExpression2285 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_r_switchExpression2325 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression2333 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2341 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_switchExpression2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_r_switchExpression2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_80_in_r_switchExpression2371 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_switchExpression2377 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_r_switchExpression2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_r_casePart2426 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2434 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_casePart2440 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_r_orExpression2487 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_r_andExpression2537 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_r_impliesExpression2587 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2629 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_r_relationalOperator_in_r_relationalExpression2639 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2647 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_86_in_r_relationalOperator2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_r_relationalOperator2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_r_relationalOperator2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_r_relationalOperator2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_r_relationalOperator2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_r_relationalOperator2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2750 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_r_additiveExpression2760 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_36_in_r_additiveExpression2769 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2779 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2813 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_33_in_r_multiplicativeExpression2823 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_93_in_r_multiplicativeExpression2832 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2842 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_r_unaryExpression2885 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_r_unaryExpression2902 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression2941 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_infixExpression2949 = new BitSet(new long[]{0x0000000000002000L,0x00001FF0000000E0L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression2957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_stringLiteral_in_r_primaryExpression2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_r_stringLiteral3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression3099 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression3107 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_paranthesizedExpression3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_r_globalVarExpression3137 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall3176 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall3182 = new BitSet(new long[]{0x0800001480003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall3192 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_featureCall3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_r_listLiteral3247 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC002C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3257 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_32_in_r_listLiteral3265 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3273 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_r_listLiteral3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_r_constructorCall3309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_r_booleanLiteral3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_r_booleanLiteral3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_r_nullLiteral3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_numberLiteral3413 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_r_collectionExpression3443 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3449 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression3457 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_r_collectionExpression3474 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_102_in_r_collectionExpression3483 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_103_in_r_collectionExpression3492 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_104_in_r_collectionExpression3501 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_105_in_r_collectionExpression3510 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_106_in_r_collectionExpression3519 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_107_in_r_collectionExpression3528 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_108_in_r_collectionExpression3537 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3545 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression3555 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_r_collectionExpression3561 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression3572 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3604 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_declaredParameterList3612 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3620 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter3649 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3683 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_parameterList3691 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3699 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_r_collectionType3756 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_70_in_r_collectionType3765 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_71_in_r_collectionType3774 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_r_collectionType3784 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType3792 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_r_collectionType3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3827 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_r_simpleType3835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3843 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred12087 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_synpred12089 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred12091 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_synpred12093 = new BitSet(new long[]{0x0000000000000002L});

}