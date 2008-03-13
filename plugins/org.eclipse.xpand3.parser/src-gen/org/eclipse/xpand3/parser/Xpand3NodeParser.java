// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g 2008-03-13 07:58:06
 	
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LG", "RG", "DEFINE", "ENDDEFINE", "AROUND", "ENDAROUND", "TEXT", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "REM_COMMENT_OUT", "REM_COMMENT", "'IMPORT'", "'import'", "';'", "'EXTENSION'", "'extension'", "'reexport'", "'('", "','", "'*'", "')'", "'FOR'", "'-'", "'ERROR'", "'EXPAND'", "'FOREACH'", "'SEPARATOR'", "'FILE'", "'ONCE'", "'ENDFILE'", "'AS'", "'ITERATOR'", "'ENDFOREACH'", "'IF'", "'ENDIF'", "'ELSEIF'", "'ELSE'", "'LET'", "'ENDLET'", "'PROTECT'", "'CSTART'", "'CEND'", "'ID'", "'DISABLE'", "'ENDPROTECT'", "'context'", "'if'", "'WARNING'", "':'", "'around'", "'::'", "'private'", "'cached'", "'create'", "'JAVA'", "'.'", "'Collection'", "'List'", "'Set'", "'let'", "'='", "'->'", "'?'", "'then'", "'else'", "'switch'", "'{'", "'default'", "'}'", "'case'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'/'", "'!'", "'GLOBALVAR'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'", "'['", "']'"
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
            ruleMemo = new HashMap[62+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g"; }


    	protected Xpand3nodeFactory factory = Xpand3nodeFactory.eINSTANCE;



    // $ANTLR start r_file
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:29:1: r_file returns [CompositeNode cn] : ( ( (f_imports= r_nsImport ) ) )* ( ( (f_declarations= r_abstractDeclaration ) ) )* ( EOF ) ;
    public CompositeNode r_file() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_imports = null;

        CompositeNode f_declarations = null;


         cn = factory.createFileNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( ( (f_imports= r_nsImport ) ) )* ( ( (f_declarations= r_abstractDeclaration ) ) )* ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( (f_imports= r_nsImport ) ) )* ( ( (f_declarations= r_abstractDeclaration ) ) )* ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:2: ( ( (f_imports= r_nsImport ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LG) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==25||LA1_2==28) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==26||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:3: ( (f_imports= r_nsImport ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:3: ( (f_imports= r_nsImport ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:4: (f_imports= r_nsImport )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:4: (f_imports= r_nsImport )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:5: f_imports= r_nsImport
            	    {
            	    pushFollow(FOLLOW_r_nsImport_in_r_file80);
            	    f_imports=r_nsImport();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_imports); ((FileNode) cn).getImports().add(f_imports); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:109: ( ( (f_declarations= r_abstractDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==59||LA2_0==63||(LA2_0>=65 && LA2_0<=67)||(LA2_0>=70 && LA2_0<=72)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:110: ( (f_declarations= r_abstractDeclaration ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:110: ( (f_declarations= r_abstractDeclaration ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:111: (f_declarations= r_abstractDeclaration )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:111: (f_declarations= r_abstractDeclaration )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:112: f_declarations= r_abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_r_abstractDeclaration_in_r_file93);
            	    f_declarations=r_abstractDeclaration();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_declarations); ((FileNode) cn).getDeclarations().add(f_declarations); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:247: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:248: EOF
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:1: r_nsImport returns [CompositeNode cn] : ( ( r_import ) | ( r_extensionImport ) );
    public CompositeNode r_nsImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_import1 = null;

        CompositeNode r_extensionImport2 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:2: ( ( r_import ) | ( r_extensionImport ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case LG:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else if ( (LA3_1==25) ) {
                    alt3=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("36:1: r_nsImport returns [CompositeNode cn] : ( ( r_import ) | ( r_extensionImport ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("36:1: r_nsImport returns [CompositeNode cn] : ( ( r_import ) | ( r_extensionImport ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:2: ( r_import )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:2: ( r_import )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:3: r_import
                    {
                    pushFollow(FOLLOW_r_import_in_r_nsImport119);
                    r_import1=r_import();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_import1; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:4: ( r_extensionImport )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:4: ( r_extensionImport )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:5: r_extensionImport
                    {
                    pushFollow(FOLLOW_r_extensionImport_in_r_nsImport128);
                    r_extensionImport2=r_extensionImport();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_extensionImport2; 
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


    // $ANTLR start r_import
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:1: r_import returns [CompositeNode cn] : ( ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'import' ) (f_type= r_type ) ( ';' ) );
    public CompositeNode r_import() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_namespace = null;

        CompositeNode f_type = null;


         cn = factory.createImportNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'import' ) (f_type= r_type ) ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LG) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("41:1: r_import returns [CompositeNode cn] : ( ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'import' ) (f_type= r_type ) ( ';' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:2: ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:3: ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:3: ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:4: ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_import154); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:45: ( 'IMPORT' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:46: 'IMPORT'
                    {
                    match(input,25,FOLLOW_25_in_r_import160); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:92: (f_namespace= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:93: f_namespace= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_import168);
                    f_namespace=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_namespace); ((ImportNode) cn).setNamespace(f_namespace); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:200: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:201: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_import174); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( 'import' ) (f_type= r_type ) ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:4: ( 'import' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:5: 'import'
                    {
                    match(input,26,FOLLOW_26_in_r_import185); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:51: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:52: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_import193);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((ImportNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:133: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:134: ';'
                    {
                    match(input,27,FOLLOW_27_in_r_import199); if (failed) return cn;
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
    // $ANTLR end r_import


    // $ANTLR start r_extensionImport
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:1: r_extensionImport returns [CompositeNode cn] : ( ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' ) );
    public CompositeNode r_extensionImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_namespace = null;

        CompositeNode f_type = null;


         cn = factory.createExtensionImportNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:2: ( ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LG) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("48:1: r_extensionImport returns [CompositeNode cn] : ( ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:2: ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:2: ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:3: ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:3: ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:4: ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_extensionImport225); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:45: ( 'EXTENSION' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:46: 'EXTENSION'
                    {
                    match(input,28,FOLLOW_28_in_r_extensionImport231); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:95: (f_namespace= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:96: f_namespace= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_extensionImport239);
                    f_namespace=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_namespace); ((ExtensionImportNode) cn).setNamespace(f_namespace); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:212: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:213: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_extensionImport245); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:4: ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:4: ( 'extension' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:5: 'extension'
                    {
                    match(input,29,FOLLOW_29_in_r_extensionImport256); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:54: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:55: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extensionImport264);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((ExtensionImportNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:145: ( 'reexport' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==30) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:146: 'reexport'
                            {
                            match(input,30,FOLLOW_30_in_r_extensionImport270); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:195: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:196: ';'
                    {
                    match(input,27,FOLLOW_27_in_r_extensionImport277); if (failed) return cn;
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
    // $ANTLR end r_extensionImport


    // $ANTLR start r_abstractDeclaration
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );
    public CompositeNode r_abstractDeclaration() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_check3 = null;

        CompositeNode r_around4 = null;

        CompositeNode r_extension5 = null;

        CompositeNode r_definition6 = null;

        CompositeNode r_definitionAround7 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:2: ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt7=1;
                }
                break;
            case 63:
                {
                alt7=2;
                }
                break;
            case Identifier:
            case 65:
            case 66:
            case 67:
            case 70:
            case 71:
            case 72:
                {
                alt7=3;
                }
                break;
            case LG:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==DEFINE) ) {
                    alt7=4;
                }
                else if ( (LA7_4==AROUND) ) {
                    alt7=5;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("55:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("55:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:2: ( r_check )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:2: ( r_check )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:3: r_check
                    {
                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration296);
                    r_check3=r_check();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_check3; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:4: ( r_around )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:4: ( r_around )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:5: r_around
                    {
                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration305);
                    r_around4=r_around();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_around4; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:4: ( r_extension )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:4: ( r_extension )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:5: r_extension
                    {
                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration314);
                    r_extension5=r_extension();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_extension5; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:4: ( r_definition )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:4: ( r_definition )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:5: r_definition
                    {
                    pushFollow(FOLLOW_r_definition_in_r_abstractDeclaration323);
                    r_definition6=r_definition();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_definition6; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:4: ( r_definitionAround )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:4: ( r_definitionAround )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:5: r_definitionAround
                    {
                    pushFollow(FOLLOW_r_definitionAround_in_r_abstractDeclaration332);
                    r_definitionAround7=r_definitionAround();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_definitionAround7; 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:1: r_definition returns [CompositeNode cn] : ( LG ) ( DEFINE ) (f_name= r_identifier ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDDEFINE ) ( RG ) ;
    public CompositeNode r_definition() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_name = null;

        CompositeNode f_paramList = null;

        CompositeNode f_type = null;

        CompositeNode f_sequence = null;


         cn = factory.createDefinitionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:2: ( ( LG ) ( DEFINE ) (f_name= r_identifier ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDDEFINE ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:2: ( LG ) ( DEFINE ) (f_name= r_identifier ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDDEFINE ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definition356); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:43: ( DEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:44: DEFINE
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_r_definition362); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:88: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:89: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_definition370);
            f_name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((DefinitionNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:180: ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:181: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:181: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:182: ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:182: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:183: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definition378); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:224: ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Identifier||LA11_0==33||(LA11_0>=70 && LA11_0<=72)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:225: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:225: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==Identifier||(LA10_0>=70 && LA10_0<=72)) ) {
                                alt10=1;
                            }
                            else if ( (LA10_0==33) ) {
                                alt10=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return cn;}
                                NoViableAltException nvae =
                                    new NoViableAltException("66:225: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 10, 0, input);

                                throw nvae;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:226: (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:226: (f_paramList= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:227: f_paramList= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definition388);
                                    f_paramList=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, f_paramList); ((DefinitionNode) cn).setParamList(f_paramList); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:349: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt9=2;
                                    int LA9_0 = input.LA(1);

                                    if ( ((LA9_0>=32 && LA9_0<=33)) ) {
                                        alt9=1;
                                    }
                                    switch (alt9) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:350: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:350: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:351: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:351: ( ',' )?
                                            int alt8=2;
                                            int LA8_0 = input.LA(1);

                                            if ( (LA8_0==32) ) {
                                                alt8=1;
                                            }
                                            switch (alt8) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:352: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definition396); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:394: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:395: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definition403); if (failed) return cn;
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_definition415); if (failed) return cn;
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_definition424); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_r_definition433); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:138: (f_type= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:139: f_type= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definition441);
            f_type=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_type); ((DefinitionNode) cn).setType(f_type); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:224: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:225: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definition449);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((DefinitionNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:330: ( ENDDEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:331: ENDDEFINE
            {
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_r_definition455); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:378: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:379: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definition461); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:1: r_definitionAround returns [CompositeNode cn] : ( LG ) ( AROUND ) (f_pointcut= r_pointcut ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDAROUND ) ( RG ) ;
    public CompositeNode r_definitionAround() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_pointcut = null;

        CompositeNode f_paramList = null;

        CompositeNode f_type = null;

        CompositeNode f_sequence = null;


         cn = factory.createDefinitionAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:2: ( ( LG ) ( AROUND ) (f_pointcut= r_pointcut ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDAROUND ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:2: ( LG ) ( AROUND ) (f_pointcut= r_pointcut ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDAROUND ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definitionAround485); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:43: ( AROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:44: AROUND
            {
            match(input,AROUND,FOLLOW_AROUND_in_r_definitionAround491); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:88: (f_pointcut= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:89: f_pointcut= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_definitionAround499);
            f_pointcut=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_pointcut); ((DefinitionAroundNode) cn).setPointcut(f_pointcut); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:200: ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:201: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:201: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:202: ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:202: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:203: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definitionAround507); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:244: ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==Identifier||LA16_0==33||(LA16_0>=70 && LA16_0<=72)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:245: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:245: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==Identifier||(LA15_0>=70 && LA15_0<=72)) ) {
                                alt15=1;
                            }
                            else if ( (LA15_0==33) ) {
                                alt15=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return cn;}
                                NoViableAltException nvae =
                                    new NoViableAltException("73:245: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:246: (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:246: (f_paramList= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:247: f_paramList= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definitionAround517);
                                    f_paramList=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, f_paramList); ((DefinitionAroundNode) cn).setParamList(f_paramList); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:375: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt14=2;
                                    int LA14_0 = input.LA(1);

                                    if ( ((LA14_0>=32 && LA14_0<=33)) ) {
                                        alt14=1;
                                    }
                                    switch (alt14) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:376: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:376: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:377: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:377: ( ',' )?
                                            int alt13=2;
                                            int LA13_0 = input.LA(1);

                                            if ( (LA13_0==32) ) {
                                                alt13=1;
                                            }
                                            switch (alt13) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:378: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definitionAround525); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:420: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:421: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definitionAround532); if (failed) return cn;
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_definitionAround544); if (failed) return cn;
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_definitionAround553); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_r_definitionAround562); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:138: (f_type= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:139: f_type= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definitionAround570);
            f_type=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_type); ((DefinitionAroundNode) cn).setType(f_type); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:230: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:231: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definitionAround578);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((DefinitionAroundNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:342: ( ENDAROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:343: ENDAROUND
            {
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_r_definitionAround584); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:390: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:391: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definitionAround590); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:1: r_sequence returns [CompositeNode cn] : (f_textSequences= r_textSequence ) ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )* ;
    public CompositeNode r_sequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_textSequences = null;

        CompositeNode f_statements = null;


         cn = factory.createSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:2: ( (f_textSequences= r_textSequence ) ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:2: (f_textSequences= r_textSequence ) ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:2: (f_textSequences= r_textSequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:3: f_textSequences= r_textSequence
            {
            pushFollow(FOLLOW_r_textSequence_in_r_sequence616);
            f_textSequences=r_textSequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_textSequences); ((SequenceNode) cn).getTextSequences().add(f_textSequences); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:136: ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=StringLiteral && LA18_0<=Identifier)||LA18_0==31||(LA18_0>=36 && LA18_0<=39)||LA18_0==41||LA18_0==47||LA18_0==51||LA18_0==53||LA18_0==60||(LA18_0>=70 && LA18_0<=73)||(LA18_0>=79 && LA18_0<=80)||(LA18_0>=95 && LA18_0<=109)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:137: ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:137: ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:138: (f_statements= r_statement ) (f_textSequences= r_textSequence )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:138: (f_statements= r_statement )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:139: f_statements= r_statement
            	    {
            	    pushFollow(FOLLOW_r_statement_in_r_sequence626);
            	    f_statements=r_statement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_statements); ((SequenceNode) cn).getStatements().add(f_statements); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:257: (f_textSequences= r_textSequence )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:258: f_textSequences= r_textSequence
            	    {
            	    pushFollow(FOLLOW_r_textSequence_in_r_sequence634);
            	    f_textSequences=r_textSequence();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_textSequences); ((SequenceNode) cn).getTextSequences().add(f_textSequences); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:83:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );
    public CompositeNode r_statement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_simpleStatement8 = null;

        CompositeNode r_fileStatement9 = null;

        CompositeNode r_foreachStatement10 = null;

        CompositeNode r_ifStatement11 = null;

        CompositeNode r_letStatement12 = null;

        CompositeNode r_protectStatement13 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:2: ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 31:
            case 36:
            case 37:
            case 38:
            case 60:
            case 70:
            case 71:
            case 72:
            case 73:
            case 79:
            case 80:
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
            case 109:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            case 47:
                {
                alt19=4;
                }
                break;
            case 51:
                {
                alt19=5;
                }
                break;
            case 53:
                {
                alt19=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("83:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:2: ( r_simpleStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:2: ( r_simpleStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:3: r_simpleStatement
                    {
                    pushFollow(FOLLOW_r_simpleStatement_in_r_statement656);
                    r_simpleStatement8=r_simpleStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_simpleStatement8; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:4: ( r_fileStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:4: ( r_fileStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:5: r_fileStatement
                    {
                    pushFollow(FOLLOW_r_fileStatement_in_r_statement665);
                    r_fileStatement9=r_fileStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_fileStatement9; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:4: ( r_foreachStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:4: ( r_foreachStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:5: r_foreachStatement
                    {
                    pushFollow(FOLLOW_r_foreachStatement_in_r_statement674);
                    r_foreachStatement10=r_foreachStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_foreachStatement10; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:4: ( r_ifStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:4: ( r_ifStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:5: r_ifStatement
                    {
                    pushFollow(FOLLOW_r_ifStatement_in_r_statement683);
                    r_ifStatement11=r_ifStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_ifStatement11; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( r_letStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( r_letStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:5: r_letStatement
                    {
                    pushFollow(FOLLOW_r_letStatement_in_r_statement692);
                    r_letStatement12=r_letStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_letStatement12; 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:4: ( r_protectStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:4: ( r_protectStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:5: r_protectStatement
                    {
                    pushFollow(FOLLOW_r_protectStatement_in_r_statement701);
                    r_protectStatement13=r_protectStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_protectStatement13; 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:1: r_textSequence returns [CompositeNode cn] : (f_texts= r_text ) ( ( (f_texts= r_text ) ) )* ;
    public CompositeNode r_textSequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_texts = null;


         cn = factory.createTextSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:2: ( (f_texts= r_text ) ( ( (f_texts= r_text ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:2: (f_texts= r_text ) ( ( (f_texts= r_text ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:2: (f_texts= r_text )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:3: f_texts= r_text
            {
            pushFollow(FOLLOW_r_text_in_r_textSequence732);
            f_texts=r_text();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_texts); ((TextSequenceNode) cn).getTexts().add(f_texts); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:100: ( ( (f_texts= r_text ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==TEXT) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==TEXT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:101: ( (f_texts= r_text ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:101: ( (f_texts= r_text ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:102: (f_texts= r_text )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:102: (f_texts= r_text )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:103: f_texts= r_text
            	    {
            	    pushFollow(FOLLOW_r_text_in_r_textSequence742);
            	    f_texts=r_text();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_texts); ((TextSequenceNode) cn).getTexts().add(f_texts); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:99:1: r_text returns [CompositeNode cn] : ( '-' )? ( TEXT ) ;
    public CompositeNode r_text() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createTextNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:2: ( ( '-' )? ( TEXT ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:2: ( '-' )? ( TEXT )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:3: '-'
                    {
                    match(input,36,FOLLOW_36_in_r_text769); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:45: ( TEXT )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:102:46: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_r_text776); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );
    public CompositeNode r_simpleStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_errorStatement14 = null;

        CompositeNode r_expandStatement15 = null;

        CompositeNode r_expressionStmt16 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:106:2: ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt22=1;
                }
                break;
            case 38:
                {
                alt22=2;
                }
                break;
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 31:
            case 36:
            case 60:
            case 70:
            case 71:
            case 72:
            case 73:
            case 79:
            case 80:
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
            case 109:
                {
                alt22=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("105:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:106:2: ( r_errorStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:106:2: ( r_errorStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:106:3: r_errorStatement
                    {
                    pushFollow(FOLLOW_r_errorStatement_in_r_simpleStatement795);
                    r_errorStatement14=r_errorStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_errorStatement14; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:4: ( r_expandStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:4: ( r_expandStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:5: r_expandStatement
                    {
                    pushFollow(FOLLOW_r_expandStatement_in_r_simpleStatement804);
                    r_expandStatement15=r_expandStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_expandStatement15; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:108:4: ( r_expressionStmt )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:108:4: ( r_expressionStmt )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:108:5: r_expressionStmt
                    {
                    pushFollow(FOLLOW_r_expressionStmt_in_r_simpleStatement813);
                    r_expressionStmt16=r_expressionStmt();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_expressionStmt16; 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:111:1: r_errorStatement returns [CompositeNode cn] : ( 'ERROR' ) (f_expression= r_expression ) ;
    public CompositeNode r_errorStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;


         cn = factory.createErrorStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:114:2: ( ( 'ERROR' ) (f_expression= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:114:2: ( 'ERROR' ) (f_expression= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:114:2: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:114:3: 'ERROR'
            {
            match(input,37,FOLLOW_37_in_r_errorStatement837); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:114:48: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:114:49: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_errorStatement845);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((ErrorStatementNode) cn).setExpression(f_expression); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:117:1: r_expandStatement returns [CompositeNode cn] : ( 'EXPAND' ) (f_name= r_simpleType ) ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )? ;
    public CompositeNode r_expandStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_name = null;

        CompositeNode f_paramList = null;

        CompositeNode f_forExpression = null;

        CompositeNode f_forEachExpression = null;

        CompositeNode f_separator = null;


         cn = factory.createExpandStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( ( 'EXPAND' ) (f_name= r_simpleType ) ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( 'EXPAND' ) (f_name= r_simpleType ) ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:2: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:3: 'EXPAND'
            {
            match(input,38,FOLLOW_38_in_r_expandStatement869); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:49: (f_name= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:50: f_name= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_expandStatement877);
            f_name=r_simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((ExpandStatementNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:146: ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:147: ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:147: ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:148: ( '(' ) (f_paramList= r_parameterList ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:148: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:149: '('
                    {
                    match(input,31,FOLLOW_31_in_r_expandStatement885); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:190: (f_paramList= r_parameterList )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:191: f_paramList= r_parameterList
                    {
                    pushFollow(FOLLOW_r_parameterList_in_r_expandStatement893);
                    f_paramList=r_parameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_paramList); ((ExpandStatementNode) cn).setParamList(f_paramList); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:310: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:311: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_expandStatement899); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:355: ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35||LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:356: ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:356: ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==35) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==39) ) {
                        alt25=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("120:356: ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) )", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:357: ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:357: ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:358: ( ( 'FOR' ) (f_forExpression= r_expression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:358: ( ( 'FOR' ) (f_forExpression= r_expression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:359: ( 'FOR' ) (f_forExpression= r_expression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:359: ( 'FOR' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:360: 'FOR'
                            {
                            match(input,35,FOLLOW_35_in_r_expandStatement912); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:403: (f_forExpression= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:404: f_forExpression= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement920);
                            f_forExpression=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_forExpression); ((ExpandStatementNode) cn).setForExpression(f_forExpression); 
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:4: ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:4: ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:5: ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:5: ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:6: ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:6: ( 'FOREACH' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:7: 'FOREACH'
                            {
                            match(input,39,FOLLOW_39_in_r_expandStatement933); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:54: (f_forEachExpression= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:55: f_forEachExpression= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement941);
                            f_forEachExpression=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_forEachExpression); ((ExpandStatementNode) cn).setForEachExpression(f_forEachExpression); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:203: ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==40) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:204: ( ( 'SEPARATOR' ) (f_separator= r_expression ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:204: ( ( 'SEPARATOR' ) (f_separator= r_expression ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:205: ( 'SEPARATOR' ) (f_separator= r_expression )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:205: ( 'SEPARATOR' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:206: 'SEPARATOR'
                                    {
                                    match(input,40,FOLLOW_40_in_r_expandStatement949); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:255: (f_separator= r_expression )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:121:256: f_separator= r_expression
                                    {
                                    pushFollow(FOLLOW_r_expression_in_r_expandStatement957);
                                    f_separator=r_expression();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, f_separator); ((ExpandStatementNode) cn).setSeparator(f_separator); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:124:1: r_expressionStmt returns [CompositeNode cn] : (f_expression= r_expression ) ;
    public CompositeNode r_expressionStmt() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;


         cn = factory.createExpressionStmtNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:2: ( (f_expression= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:2: (f_expression= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:2: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:127:3: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_expressionStmt991);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((ExpressionStmtNode) cn).setExpression(f_expression); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:130:1: r_fileStatement returns [CompositeNode cn] : ( 'FILE' ) (f_nameExpression= r_expression ) ( ( ( 'ONCE' ) ) )? ( ( (f_identifier= r_identifier ) ) )? (f_sequence= r_sequence ) ( 'ENDFILE' ) ;
    public CompositeNode r_fileStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_nameExpression = null;

        CompositeNode f_identifier = null;

        CompositeNode f_sequence = null;


         cn = factory.createFileStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:2: ( ( 'FILE' ) (f_nameExpression= r_expression ) ( ( ( 'ONCE' ) ) )? ( ( (f_identifier= r_identifier ) ) )? (f_sequence= r_sequence ) ( 'ENDFILE' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:2: ( 'FILE' ) (f_nameExpression= r_expression ) ( ( ( 'ONCE' ) ) )? ( ( (f_identifier= r_identifier ) ) )? (f_sequence= r_sequence ) ( 'ENDFILE' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:2: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:3: 'FILE'
            {
            match(input,41,FOLLOW_41_in_r_fileStatement1015); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:47: (f_nameExpression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:48: f_nameExpression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_fileStatement1023);
            f_nameExpression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_nameExpression); ((FileStatementNode) cn).setNameExpression(f_nameExpression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:182: ( ( ( 'ONCE' ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:183: ( ( 'ONCE' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:183: ( ( 'ONCE' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:184: ( 'ONCE' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:184: ( 'ONCE' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:185: 'ONCE'
                    {
                    match(input,42,FOLLOW_42_in_r_fileStatement1031); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:232: ( ( (f_identifier= r_identifier ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Identifier) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:233: ( (f_identifier= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:233: ( (f_identifier= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:234: (f_identifier= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:234: (f_identifier= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:235: f_identifier= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_fileStatement1044);
                    f_identifier=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_identifier); ((FileStatementNode) cn).setIdentifier(f_identifier); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:356: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:357: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_fileStatement1055);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((FileStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:465: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:133:466: 'ENDFILE'
            {
            match(input,43,FOLLOW_43_in_r_fileStatement1061); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:136:1: r_foreachStatement returns [CompositeNode cn] : ( 'FOREACH' ) (f_forExpression= r_expression ) ( 'AS' ) (f_identifier= r_identifier ) ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )? (f_sequence= r_sequence ) ( 'ENDFOREACH' ) ;
    public CompositeNode r_foreachStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_forExpression = null;

        CompositeNode f_identifier = null;

        CompositeNode f_iterator = null;

        CompositeNode f_separatorExpression = null;

        CompositeNode f_sequence = null;


         cn = factory.createForeachStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:2: ( ( 'FOREACH' ) (f_forExpression= r_expression ) ( 'AS' ) (f_identifier= r_identifier ) ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )? (f_sequence= r_sequence ) ( 'ENDFOREACH' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:2: ( 'FOREACH' ) (f_forExpression= r_expression ) ( 'AS' ) (f_identifier= r_identifier ) ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )? (f_sequence= r_sequence ) ( 'ENDFOREACH' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:2: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:3: 'FOREACH'
            {
            match(input,39,FOLLOW_39_in_r_foreachStatement1085); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:50: (f_forExpression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:51: f_forExpression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_foreachStatement1093);
            f_forExpression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_forExpression); ((ForeachStatementNode) cn).setForExpression(f_forExpression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:184: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:185: 'AS'
            {
            match(input,44,FOLLOW_44_in_r_foreachStatement1099); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:227: (f_identifier= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:228: f_identifier= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1107);
            f_identifier=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_identifier); ((ForeachStatementNode) cn).setIdentifier(f_identifier); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:349: ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:350: ( ( 'ITERATOR' ) (f_iterator= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:350: ( ( 'ITERATOR' ) (f_iterator= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:351: ( 'ITERATOR' ) (f_iterator= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:351: ( 'ITERATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:352: 'ITERATOR'
                    {
                    match(input,45,FOLLOW_45_in_r_foreachStatement1115); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:400: (f_iterator= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:401: f_iterator= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1123);
                    f_iterator=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_iterator); ((ForeachStatementNode) cn).setIterator(f_iterator); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:517: ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:518: ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:518: ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:519: ( 'SEPARATOR' ) (f_separatorExpression= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:519: ( 'SEPARATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:520: 'SEPARATOR'
                    {
                    match(input,40,FOLLOW_40_in_r_foreachStatement1134); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:569: (f_separatorExpression= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:570: f_separatorExpression= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_foreachStatement1142);
                    f_separatorExpression=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_separatorExpression); ((ForeachStatementNode) cn).setSeparatorExpression(f_separatorExpression); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:730: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:731: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_foreachStatement1153);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((ForeachStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:842: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:139:843: 'ENDFOREACH'
            {
            match(input,46,FOLLOW_46_in_r_foreachStatement1159); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:142:1: r_ifStatement returns [CompositeNode cn] : ( 'IF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) (f_elseIfs= r_elseIfStatement )* (f_else= r_elseStatement )? ( 'ENDIF' ) ;
    public CompositeNode r_ifStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_sequence = null;

        CompositeNode f_elseIfs = null;

        CompositeNode f_else = null;


         cn = factory.createIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( ( 'IF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) (f_elseIfs= r_elseIfStatement )* (f_else= r_elseStatement )? ( 'ENDIF' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( 'IF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) (f_elseIfs= r_elseIfStatement )* (f_else= r_elseStatement )? ( 'ENDIF' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:2: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:3: 'IF'
            {
            match(input,47,FOLLOW_47_in_r_ifStatement1183); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:45: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:46: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_ifStatement1191);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((IfStatementNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:162: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:163: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_ifStatement1199);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((IfStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:269: (f_elseIfs= r_elseIfStatement )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:270: f_elseIfs= r_elseIfStatement
            	    {
            	    pushFollow(FOLLOW_r_elseIfStatement_in_r_ifStatement1207);
            	    f_elseIfs=r_elseIfStatement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_elseIfs); ((IfStatementNode) cn).getElseIfs().add(f_elseIfs); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:386: (f_else= r_elseStatement )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:387: f_else= r_elseStatement
                    {
                    pushFollow(FOLLOW_r_elseStatement_in_r_ifStatement1216);
                    f_else=r_elseStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_else); ((IfStatementNode) cn).setElse(f_else); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:483: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:145:484: 'ENDIF'
            {
            match(input,48,FOLLOW_48_in_r_ifStatement1223); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:148:1: r_elseIfStatement returns [CompositeNode cn] : ( 'ELSEIF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) ;
    public CompositeNode r_elseIfStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_sequence = null;


         cn = factory.createElseIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( ( 'ELSEIF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( 'ELSEIF' ) (f_expression= r_expression ) (f_sequence= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:2: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:3: 'ELSEIF'
            {
            match(input,49,FOLLOW_49_in_r_elseIfStatement1247); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:49: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:50: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_elseIfStatement1255);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((ElseIfStatementNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:170: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:151:171: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseIfStatement1263);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((ElseIfStatementNode) cn).setSequence(f_sequence); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:154:1: r_elseStatement returns [CompositeNode cn] : ( 'ELSE' ) (f_sequence= r_sequence ) ;
    public CompositeNode r_elseStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_sequence = null;


         cn = factory.createElseStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( ( 'ELSE' ) (f_sequence= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( 'ELSE' ) (f_sequence= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:2: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:3: 'ELSE'
            {
            match(input,50,FOLLOW_50_in_r_elseStatement1287); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:47: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:157:48: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseStatement1295);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((ElseStatementNode) cn).setSequence(f_sequence); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:160:1: r_letStatement returns [CompositeNode cn] : ( 'LET' ) (f_expression= r_expression ) ( 'AS' ) (f_name= r_identifier ) (f_sequence= r_sequence ) ( 'ENDLET' ) ;
    public CompositeNode r_letStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_name = null;

        CompositeNode f_sequence = null;


         cn = factory.createLetStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:2: ( ( 'LET' ) (f_expression= r_expression ) ( 'AS' ) (f_name= r_identifier ) (f_sequence= r_sequence ) ( 'ENDLET' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:2: ( 'LET' ) (f_expression= r_expression ) ( 'AS' ) (f_name= r_identifier ) (f_sequence= r_sequence ) ( 'ENDLET' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:2: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:3: 'LET'
            {
            match(input,51,FOLLOW_51_in_r_letStatement1319); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:46: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:47: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_letStatement1327);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((LetStatementNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:164: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:165: 'AS'
            {
            match(input,44,FOLLOW_44_in_r_letStatement1333); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:207: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:208: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_letStatement1341);
            f_name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((LetStatementNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:301: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:302: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_letStatement1349);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((LetStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:409: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:163:410: 'ENDLET'
            {
            match(input,52,FOLLOW_52_in_r_letStatement1355); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:166:1: r_protectStatement returns [CompositeNode cn] : ( 'PROTECT' ) ( 'CSTART' ) (f_cstart= r_expression ) ( 'CEND' ) (f_cend= r_expression ) ( 'ID' ) (f_id= r_expression ) ( 'DISABLE' )? (f_sequence= r_sequence ) ( 'ENDPROTECT' ) ;
    public CompositeNode r_protectStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_cstart = null;

        CompositeNode f_cend = null;

        CompositeNode f_id = null;

        CompositeNode f_sequence = null;


         cn = factory.createProtectStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:2: ( ( 'PROTECT' ) ( 'CSTART' ) (f_cstart= r_expression ) ( 'CEND' ) (f_cend= r_expression ) ( 'ID' ) (f_id= r_expression ) ( 'DISABLE' )? (f_sequence= r_sequence ) ( 'ENDPROTECT' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:2: ( 'PROTECT' ) ( 'CSTART' ) (f_cstart= r_expression ) ( 'CEND' ) (f_cend= r_expression ) ( 'ID' ) (f_id= r_expression ) ( 'DISABLE' )? (f_sequence= r_sequence ) ( 'ENDPROTECT' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:2: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:3: 'PROTECT'
            {
            match(input,53,FOLLOW_53_in_r_protectStatement1379); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:50: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:51: 'CSTART'
            {
            match(input,54,FOLLOW_54_in_r_protectStatement1385); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:97: (f_cstart= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:98: f_cstart= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1393);
            f_cstart=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_cstart); ((ProtectStatementNode) cn).setCstart(f_cstart); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:203: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:204: 'CEND'
            {
            match(input,55,FOLLOW_55_in_r_protectStatement1399); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:248: (f_cend= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:249: f_cend= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1407);
            f_cend=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_cend); ((ProtectStatementNode) cn).setCend(f_cend); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:346: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:347: 'ID'
            {
            match(input,56,FOLLOW_56_in_r_protectStatement1413); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:389: (f_id= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:390: f_id= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1421);
            f_id=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_id); ((ProtectStatementNode) cn).setId(f_id); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:479: ( 'DISABLE' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:480: 'DISABLE'
                    {
                    match(input,57,FOLLOW_57_in_r_protectStatement1427); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:528: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:529: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_protectStatement1436);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((ProtectStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:640: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:169:641: 'ENDPROTECT'
            {
            match(input,58,FOLLOW_58_in_r_protectStatement1442); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:172:1: r_check returns [CompositeNode cn] : ( 'context' ) (f_type= r_type ) ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (f_message= r_expression ) ( ':' ) (f_constraint= r_expression ) ( ';' ) ;
    public CompositeNode r_check() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_type = null;

        CompositeNode f_ifExpression = null;

        CompositeNode f_message = null;

        CompositeNode f_constraint = null;


         cn = factory.createCheckNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:2: ( ( 'context' ) (f_type= r_type ) ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (f_message= r_expression ) ( ':' ) (f_constraint= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:2: ( 'context' ) (f_type= r_type ) ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (f_message= r_expression ) ( ':' ) (f_constraint= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:2: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:3: 'context'
            {
            match(input,59,FOLLOW_59_in_r_check1466); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:50: (f_type= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:51: f_type= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_check1474);
            f_type=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_type); ((CheckNode) cn).setType(f_type); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:131: ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:132: ( ( 'if' ) (f_ifExpression= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:132: ( ( 'if' ) (f_ifExpression= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:133: ( 'if' ) (f_ifExpression= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:133: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:134: 'if'
                    {
                    match(input,60,FOLLOW_60_in_r_check1482); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:176: (f_ifExpression= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:177: f_ifExpression= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_check1490);
                    f_ifExpression=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_ifExpression); ((CheckNode) cn).setIfExpression(f_ifExpression); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:298: ( ( ( 'ERROR' ) | ( 'WARNING' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:299: ( ( 'ERROR' ) | ( 'WARNING' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:299: ( ( 'ERROR' ) | ( 'WARNING' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            else if ( (LA35_0==61) ) {
                alt35=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("175:299: ( ( 'ERROR' ) | ( 'WARNING' ) )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:300: ( 'ERROR' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:300: ( 'ERROR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:301: 'ERROR'
                    {
                    match(input,37,FOLLOW_37_in_r_check1501); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "error"); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:4: ( 'WARNING' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:4: ( 'WARNING' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:5: 'WARNING'
                    {
                    match(input,61,FOLLOW_61_in_r_check1510); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "warning"); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:59: (f_message= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:60: f_message= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1520);
            f_message=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_message); ((CheckNode) cn).setMessage(f_message); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:158: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:159: ':'
            {
            match(input,62,FOLLOW_62_in_r_check1526); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:200: (f_constraint= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:201: f_constraint= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1534);
            f_constraint=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_constraint); ((CheckNode) cn).setConstraint(f_constraint); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:311: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:176:312: ';'
            {
            match(input,27,FOLLOW_27_in_r_check1540); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:179:1: r_around returns [CompositeNode cn] : ( 'around' ) (f_unnamed0= r_pointcut ) ( '(' ) ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (f_unnamed2= r_expression ) ( ';' ) ;
    public CompositeNode r_around() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed0 = null;

        CompositeNode f_unnamed1 = null;

        CompositeNode f_unnamed2 = null;


         cn = factory.createAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: ( ( 'around' ) (f_unnamed0= r_pointcut ) ( '(' ) ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (f_unnamed2= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: ( 'around' ) (f_unnamed0= r_pointcut ) ( '(' ) ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (f_unnamed2= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:2: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:3: 'around'
            {
            match(input,63,FOLLOW_63_in_r_around1564); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:49: (f_unnamed0= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:50: f_unnamed0= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_around1572);
            f_unnamed0=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed0); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:108: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:109: '('
            {
            match(input,31,FOLLOW_31_in_r_around1578); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:150: ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Identifier||LA39_0==33||(LA39_0>=70 && LA39_0<=72)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:151: ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:151: ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==Identifier||(LA38_0>=70 && LA38_0<=72)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==33) ) {
                        alt38=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("182:151: ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:152: (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:152: (f_unnamed1= r_declaredParameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:153: f_unnamed1= r_declaredParameterList
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_around1588);
                            f_unnamed1=r_declaredParameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_unnamed1); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:224: ( ( ( ',' )? ( '*' ) ) )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( ((LA37_0>=32 && LA37_0<=33)) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:225: ( ( ',' )? ( '*' ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:225: ( ( ',' )? ( '*' ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:226: ( ',' )? ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:226: ( ',' )?
                                    int alt36=2;
                                    int LA36_0 = input.LA(1);

                                    if ( (LA36_0==32) ) {
                                        alt36=1;
                                    }
                                    switch (alt36) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:227: ','
                                            {
                                            match(input,32,FOLLOW_32_in_r_around1596); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }
                                            break;

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:269: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:270: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_around1603); if (failed) return cn;
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:4: ( '*' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:4: ( '*' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:5: '*'
                            {
                            match(input,33,FOLLOW_33_in_r_around1615); if (failed) return cn;
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:49: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:50: ')'
            {
            match(input,34,FOLLOW_34_in_r_around1624); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:91: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:92: ':'
            {
            match(input,62,FOLLOW_62_in_r_around1630); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:133: (f_unnamed2= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:134: f_unnamed2= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_around1638);
            f_unnamed2=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed2); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:194: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:183:195: ';'
            {
            match(input,27,FOLLOW_27_in_r_around1644); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:186:1: r_pointcut returns [CompositeNode cn] : ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) ) ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )* ;
    public CompositeNode r_pointcut() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed3 = null;

        CompositeNode f_unnamed4 = null;


         cn = factory.createPointcutNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:2: ( ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) ) ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:2: ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) ) ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:2: ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:3: ( ( '*' ) | (f_unnamed3= r_identifier ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:3: ( ( '*' ) | (f_unnamed3= r_identifier ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            else if ( (LA40_0==Identifier) ) {
                alt40=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("189:3: ( ( '*' ) | (f_unnamed3= r_identifier ) )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:4: ( '*' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:4: ( '*' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:5: '*'
                    {
                    match(input,33,FOLLOW_33_in_r_pointcut1670); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:4: (f_unnamed3= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:4: (f_unnamed3= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:5: f_unnamed3= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut1681);
                    f_unnamed3=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed3); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:67: ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Identifier||LA42_0==33||LA42_0==64) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:68: ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:68: ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) )
            	    int alt41=3;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case Identifier:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("190:68: ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) )", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:69: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:69: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:70: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_pointcut1691); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:4: (f_unnamed4= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:4: (f_unnamed4= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:5: f_unnamed4= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_pointcut1702);
            	            f_unnamed4=r_identifier();
            	            _fsp--;
            	            if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addToChildren(cn, f_unnamed4); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:4: ( '::' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:4: ( '::' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:192:5: '::'
            	            {
            	            match(input,64,FOLLOW_64_in_r_pointcut1711); if (failed) return cn;
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
        return cn;
    }
    // $ANTLR end r_pointcut


    // $ANTLR start r_extension
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:195:1: r_extension returns [CompositeNode cn] : ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (f_returnType= r_type )? (f_name= r_identifier ) ( '(' ) (f_paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) ) ( ';' ) ;
    public CompositeNode r_extension() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_returnType = null;

        CompositeNode f_name = null;

        CompositeNode f_paramList = null;

        CompositeNode f_javaReturnType = null;

        CompositeNode f_javaName = null;

        CompositeNode f_unnamed5 = null;

        CompositeNode f_unnamed6 = null;

        CompositeNode f_extendBody = null;


         cn = factory.createExtensionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:2: ( ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (f_returnType= r_type )? (f_name= r_identifier ) ( '(' ) (f_paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (f_returnType= r_type )? (f_name= r_identifier ) ( '(' ) (f_paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=65 && LA44_0<=67)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
            	    int alt43=3;
            	    switch ( input.LA(1) ) {
            	    case 65:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("198:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:4: ( 'private' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:4: ( 'private' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:5: 'private'
            	            {
            	            match(input,65,FOLLOW_65_in_r_extension1740); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "private"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:4: ( 'cached' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:4: ( 'cached' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:5: 'cached'
            	            {
            	            match(input,66,FOLLOW_66_in_r_extension1749); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "cached"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:4: ( 'create' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:4: ( 'create' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:5: 'create'
            	            {
            	            match(input,67,FOLLOW_67_in_r_extension1758); if (failed) return cn;
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
            	    break loop44;
                }
            } while (true);

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:58: (f_returnType= r_type )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=70 && LA45_0<=72)) ) {
                alt45=1;
            }
            else if ( (LA45_0==Identifier) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==Identifier||LA45_2==64) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:59: f_returnType= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension1769);
                    f_returnType=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_returnType); ((ExtensionNode) cn).setReturnType(f_returnType); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:168: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:169: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_extension1778);
            f_name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((ExtensionNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:259: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:260: '('
            {
            match(input,31,FOLLOW_31_in_r_extension1784); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:301: (f_paramList= r_declaredParameterList )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Identifier||(LA46_0>=70 && LA46_0<=72)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:302: f_paramList= r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension1792);
                    f_paramList=r_declaredParameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_paramList); ((ExtensionNode) cn).setParamList(f_paramList); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:424: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:425: ')'
            {
            match(input,34,FOLLOW_34_in_r_extension1799); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:466: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:467: ':'
            {
            match(input,62,FOLLOW_62_in_r_extension1805); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:508: ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:509: ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:509: ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==68) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=StringLiteral && LA49_0<=Identifier)||LA49_0==31||LA49_0==36||LA49_0==60||(LA49_0>=70 && LA49_0<=73)||(LA49_0>=79 && LA49_0<=80)||(LA49_0>=95 && LA49_0<=109)) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("200:509: ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:510: ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:510: ( 'JAVA' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:511: 'JAVA'
                    {
                    match(input,68,FOLLOW_68_in_r_extension1813); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:555: (f_javaReturnType= r_javaType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:556: f_javaReturnType= r_javaType
                    {
                    pushFollow(FOLLOW_r_javaType_in_r_extension1821);
                    f_javaReturnType=r_javaType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_javaReturnType); ((ExtensionNode) cn).setJavaReturnType(f_javaReturnType); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:684: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:685: '.'
                    {
                    match(input,69,FOLLOW_69_in_r_extension1827); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:726: (f_javaName= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:727: f_javaName= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension1835);
                    f_javaName=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_javaName); ((ExtensionNode) cn).setJavaName(f_javaName); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:833: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:834: '('
                    {
                    match(input,31,FOLLOW_31_in_r_extension1841); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:875: ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==Identifier) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:876: ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:876: ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:877: (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )*
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:877: (f_unnamed5= r_javaType )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:878: f_unnamed5= r_javaType
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension1851);
                            f_unnamed5=r_javaType();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_unnamed5); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:936: ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==32) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:937: ( ( ',' ) (f_unnamed6= r_javaType ) )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:937: ( ( ',' ) (f_unnamed6= r_javaType ) )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:938: ( ',' ) (f_unnamed6= r_javaType )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:938: ( ',' )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:939: ','
                            	    {
                            	    match(input,32,FOLLOW_32_in_r_extension1859); if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addLeafNodeForToken(cn, null); 
                            	    }

                            	    }

                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:980: (f_unnamed6= r_javaType )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:981: f_unnamed6= r_javaType
                            	    {
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension1867);
                            	    f_unnamed6=r_javaType();
                            	    _fsp--;
                            	    if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addToChildren(cn, f_unnamed6); 
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:1045: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:1046: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_extension1879); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:4: (f_extendBody= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:4: (f_extendBody= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:5: f_extendBody= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension1890);
                    f_extendBody=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_extendBody); ((ExtensionNode) cn).setExtendBody(f_extendBody); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:121: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:201:122: ';'
            {
            match(input,27,FOLLOW_27_in_r_extension1898); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:204:1: r_javaType returns [CompositeNode cn] : (f_unnamed7= r_identifier ) ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* ;
    public CompositeNode r_javaType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed7 = null;

        CompositeNode f_unnamed8 = null;


         cn = factory.createJavaTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: ( (f_unnamed7= r_identifier ) ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: (f_unnamed7= r_identifier ) ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:2: (f_unnamed7= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:3: f_unnamed7= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_javaType1924);
            f_unnamed7=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed7); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:63: ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==69) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==Identifier) ) {
                        int LA51_3 = input.LA(3);

                        if ( (LA51_3==32||LA51_3==34||LA51_3==69) ) {
                            alt51=1;
                        }


                    }
                    else if ( ((LA51_1>=70 && LA51_1<=72)) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:64: ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:64: ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:65: ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:65: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:66: '.'
            	    {
            	    match(input,69,FOLLOW_69_in_r_javaType1932); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:107: ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:108: ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:108: ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    int alt50=4;
            	    switch ( input.LA(1) ) {
            	    case Identifier:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt50=3;
            	        }
            	        break;
            	    case 72:
            	        {
            	        alt50=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("207:108: ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 50, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:109: (f_unnamed8= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:109: (f_unnamed8= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:110: f_unnamed8= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType1942);
            	            f_unnamed8=r_identifier();
            	            _fsp--;
            	            if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addToChildren(cn, f_unnamed8); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:4: ( 'Collection' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:4: ( 'Collection' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:5: 'Collection'
            	            {
            	            match(input,70,FOLLOW_70_in_r_javaType1951); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:209:4: ( 'List' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:209:4: ( 'List' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:209:5: 'List'
            	            {
            	            match(input,71,FOLLOW_71_in_r_javaType1960); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:210:4: ( 'Set' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:210:4: ( 'Set' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:210:5: 'Set'
            	            {
            	            match(input,72,FOLLOW_72_in_r_javaType1969); if (failed) return cn;
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
            	    break loop51;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:213:1: r_test_expression returns [CompositeNode cn] : (f_unnamed9= r_expression ) ( EOF ) ;
    public CompositeNode r_test_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed9 = null;


         cn = factory.createTest_expressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:2: ( (f_unnamed9= r_expression ) ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:2: (f_unnamed9= r_expression ) ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:2: (f_unnamed9= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:3: f_unnamed9= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_test_expression2005);
            f_unnamed9=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed9); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:63: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:217:64: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_r_test_expression2011); if (failed) return cn;

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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:1: r_expression returns [CompositeNode cn] : ( r_letExpression ) ;
    public CompositeNode r_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_letExpression17 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( ( r_letExpression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( r_letExpression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:2: ( r_letExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:221:3: r_letExpression
            {
            pushFollow(FOLLOW_r_letExpression_in_r_expression2028);
            r_letExpression17=r_letExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               cn = r_letExpression17; 
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
    // $ANTLR end r_expression


    // $ANTLR start r_letExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:224:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression ) | (f_unnamed13= r_castedExpression ) );
    public CompositeNode r_letExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed10 = null;

        CompositeNode f_unnamed11 = null;

        CompositeNode f_unnamed12 = null;

        CompositeNode f_unnamed13 = null;


         cn = factory.createLetExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:2: ( ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression ) | (f_unnamed13= r_castedExpression ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=StringLiteral && LA52_0<=Identifier)||LA52_0==31||LA52_0==36||LA52_0==60||(LA52_0>=70 && LA52_0<=72)||(LA52_0>=79 && LA52_0<=80)||(LA52_0>=95 && LA52_0<=109)) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("224:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression ) | (f_unnamed13= r_castedExpression ) );", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:2: ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:2: ( 'let' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:3: 'let'
                    {
                    match(input,73,FOLLOW_73_in_r_letExpression2057); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:46: (f_unnamed10= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:47: f_unnamed10= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression2065);
                    f_unnamed10=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed10); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:109: ( '=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:110: '='
                    {
                    match(input,74,FOLLOW_74_in_r_letExpression2071); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:151: (f_unnamed11= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:152: f_unnamed11= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2079);
                    f_unnamed11=r_castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed11); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:220: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:221: ':'
                    {
                    match(input,62,FOLLOW_62_in_r_letExpression2085); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:262: (f_unnamed12= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:263: f_unnamed12= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_letExpression2093);
                    f_unnamed12=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed12); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:4: (f_unnamed13= r_castedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:4: (f_unnamed13= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:229:5: f_unnamed13= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2104);
                    f_unnamed13=r_castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed13); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:232:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) ) | (f_unnamed14= r_chainExpression ) );
    public CompositeNode r_castedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_type = null;

        CompositeNode f_target = null;

        CompositeNode f_unnamed14 = null;


         cn = factory.createCastedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:2: ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) ) | (f_unnamed14= r_chainExpression ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:2: ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:38: ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:39: ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:39: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:40: '('
                    {
                    match(input,31,FOLLOW_31_in_r_castedExpression2144); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:81: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:82: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_castedExpression2152);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((CastedExpressionNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:173: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:174: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_castedExpression2158); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:215: (f_target= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:216: f_target= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2166);
                    f_target=r_chainExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_target); ((CastedExpressionNode) cn).setTarget(f_target); 
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:4: (f_unnamed14= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:4: (f_unnamed14= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:237:5: f_unnamed14= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2178);
                    f_unnamed14=r_chainExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed14); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:240:1: r_chainExpression returns [CompositeNode cn] : (f_first= r_ifExpression ) ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )* ;
    public CompositeNode r_chainExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createChainExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:2: ( (f_first= r_ifExpression ) ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:2: (f_first= r_ifExpression ) ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:2: (f_first= r_ifExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:3: f_first= r_ifExpression
            {
            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2209);
            f_first=r_ifExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((ChainExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:105: ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==75) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:106: ( ( '->' ) (f_nexts= r_ifExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:106: ( ( '->' ) (f_nexts= r_ifExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:107: ( '->' ) (f_nexts= r_ifExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:107: ( '->' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:108: '->'
            	    {
            	    match(input,75,FOLLOW_75_in_r_chainExpression2217); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:150: (f_nexts= r_ifExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:244:151: f_nexts= r_ifExpression
            	    {
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2225);
            	    f_nexts=r_ifExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_nexts); ((ChainExpressionNode) cn).getNexts().add(f_nexts); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:247:1: r_ifExpression returns [CompositeNode cn] : ( (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )? | ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )? );
    public CompositeNode r_ifExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_condition0 = null;

        CompositeNode f_then = null;

        CompositeNode f_else = null;

        CompositeNode f_condition1 = null;


         cn = factory.createIfExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: ( (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )? | ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )? )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=StringLiteral && LA57_0<=Identifier)||LA57_0==31||LA57_0==36||(LA57_0>=70 && LA57_0<=72)||(LA57_0>=79 && LA57_0<=80)||(LA57_0>=95 && LA57_0<=109)) ) {
                alt57=1;
            }
            else if ( (LA57_0==60) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("247:1: r_ifExpression returns [CompositeNode cn] : ( (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )? | ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )? );", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:2: (f_condition0= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:3: f_condition0= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2259);
                    f_condition0=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_condition0); ((IfExpressionNode) cn).setCondition0(f_condition0); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:126: ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==76) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:127: ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:127: ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:128: ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:128: ( '?' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:129: '?'
                            {
                            match(input,76,FOLLOW_76_in_r_ifExpression2267); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:170: (f_then= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:171: f_then= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression2275);
                            f_then=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_then); ((IfExpressionNode) cn).setThen(f_then); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:264: ( ':' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:265: ':'
                            {
                            match(input,62,FOLLOW_62_in_r_ifExpression2281); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:306: (f_else= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:307: f_else= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2289);
                            f_else=r_switchExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_else); ((IfExpressionNode) cn).setElse(f_else); 
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:4: ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:4: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:5: 'if'
                    {
                    match(input,60,FOLLOW_60_in_r_ifExpression2301); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:47: (f_condition1= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:48: f_condition1= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression2309);
                    f_condition1=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_condition1); ((IfExpressionNode) cn).setCondition1(f_condition1); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:165: ( 'then' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:166: 'then'
                    {
                    match(input,77,FOLLOW_77_in_r_ifExpression2315); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:210: (f_then= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:211: f_then= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2323);
                    f_then=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_then); ((IfExpressionNode) cn).setThen(f_then); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:310: ( ( ( 'else' ) (f_else= r_switchExpression ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==78) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:311: ( ( 'else' ) (f_else= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:311: ( ( 'else' ) (f_else= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:312: ( 'else' ) (f_else= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:312: ( 'else' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:313: 'else'
                            {
                            match(input,78,FOLLOW_78_in_r_ifExpression2331); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:357: (f_else= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:252:358: f_else= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2339);
                            f_else=r_switchExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_else); ((IfExpressionNode) cn).setElse(f_else); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:255:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' ) | (f_unnamed15= r_orExpression ) );
    public CompositeNode r_switchExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_cases = null;

        CompositeNode f_default = null;

        CompositeNode f_unnamed15 = null;


         cn = factory.createSwitchExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:2: ( ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' ) | (f_unnamed15= r_orExpression ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==79) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=StringLiteral && LA60_0<=Identifier)||LA60_0==31||LA60_0==36||(LA60_0>=70 && LA60_0<=72)||LA60_0==80||(LA60_0>=95 && LA60_0<=109)) ) {
                alt60=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("255:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' ) | (f_unnamed15= r_orExpression ) );", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:2: ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:2: ( 'switch' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:3: 'switch'
                    {
                    match(input,79,FOLLOW_79_in_r_switchExpression2371); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:49: ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==31) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:50: ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:50: ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:51: ( '(' ) (f_expression= r_orExpression ) ( ')' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:51: ( '(' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:52: '('
                            {
                            match(input,31,FOLLOW_31_in_r_switchExpression2379); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:93: (f_expression= r_orExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:94: f_expression= r_orExpression
                            {
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2387);
                            f_expression=r_orExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_expression); ((SwitchExpressionNode) cn).setExpression(f_expression); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:217: ( ')' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:218: ')'
                            {
                            match(input,34,FOLLOW_34_in_r_switchExpression2393); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:262: ( '{' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:263: '{'
                    {
                    match(input,80,FOLLOW_80_in_r_switchExpression2402); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:304: (f_cases= r_casePart )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==83) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:305: f_cases= r_casePart
                    	    {
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression2410);
                    	    f_cases=r_casePart();
                    	    _fsp--;
                    	    if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addToChildren(cn, f_cases); ((SwitchExpressionNode) cn).getCases().add(f_cases); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:411: ( 'default' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:412: 'default'
                    {
                    match(input,81,FOLLOW_81_in_r_switchExpression2417); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:459: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:460: ':'
                    {
                    match(input,62,FOLLOW_62_in_r_switchExpression2423); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:501: (f_default= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:502: f_default= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2431);
                    f_default=r_orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_default); ((SwitchExpressionNode) cn).setDefault(f_default); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:613: ( '}' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:614: '}'
                    {
                    match(input,82,FOLLOW_82_in_r_switchExpression2437); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:260:4: (f_unnamed15= r_orExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:260:4: (f_unnamed15= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:260:5: f_unnamed15= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2448);
                    f_unnamed15=r_orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed15); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:263:1: r_casePart returns [CompositeNode cn] : ( 'case' ) (f_condition= r_expression ) ( ':' ) (f_expression= r_expression ) ;
    public CompositeNode r_casePart() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_condition = null;

        CompositeNode f_expression = null;


         cn = factory.createCasePartNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:2: ( ( 'case' ) (f_condition= r_expression ) ( ':' ) (f_expression= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:2: ( 'case' ) (f_condition= r_expression ) ( ':' ) (f_expression= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:2: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:3: 'case'
            {
            match(input,83,FOLLOW_83_in_r_casePart2472); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:47: (f_condition= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:48: f_condition= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2480);
            f_condition=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_condition); ((CasePartNode) cn).setCondition(f_condition); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:157: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:158: ':'
            {
            match(input,62,FOLLOW_62_in_r_casePart2486); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:199: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:266:200: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2494);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((CasePartNode) cn).setExpression(f_expression); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:269:1: r_orExpression returns [CompositeNode cn] : (f_first= r_andExpression ) ( ( ( '||' ) (f_nexts= r_andExpression ) ) )* ;
    public CompositeNode r_orExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createOrExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:2: ( (f_first= r_andExpression ) ( ( ( '||' ) (f_nexts= r_andExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:2: (f_first= r_andExpression ) ( ( ( '||' ) (f_nexts= r_andExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:2: (f_first= r_andExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:3: f_first= r_andExpression
            {
            pushFollow(FOLLOW_r_andExpression_in_r_orExpression2525);
            f_first=r_andExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((OrExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:103: ( ( ( '||' ) (f_nexts= r_andExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==84) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:104: ( ( '||' ) (f_nexts= r_andExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:104: ( ( '||' ) (f_nexts= r_andExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:105: ( '||' ) (f_nexts= r_andExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:105: ( '||' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:106: '||'
            	    {
            	    match(input,84,FOLLOW_84_in_r_orExpression2533); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:148: (f_nexts= r_andExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:273:149: f_nexts= r_andExpression
            	    {
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression2541);
            	    f_nexts=r_andExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_nexts); ((OrExpressionNode) cn).getNexts().add(f_nexts); 
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
    // $ANTLR end r_orExpression


    // $ANTLR start r_andExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:276:1: r_andExpression returns [CompositeNode cn] : (f_first= r_impliesExpression ) ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )* ;
    public CompositeNode r_andExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createAndExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: ( (f_first= r_impliesExpression ) ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: (f_first= r_impliesExpression ) ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:2: (f_first= r_impliesExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:3: f_first= r_impliesExpression
            {
            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2575);
            f_first=r_impliesExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((AndExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:108: ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==85) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:109: ( ( '&&' ) (f_nexts= r_impliesExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:109: ( ( '&&' ) (f_nexts= r_impliesExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:110: ( '&&' ) (f_nexts= r_impliesExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:110: ( '&&' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:111: '&&'
            	    {
            	    match(input,85,FOLLOW_85_in_r_andExpression2583); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:153: (f_nexts= r_impliesExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:280:154: f_nexts= r_impliesExpression
            	    {
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2591);
            	    f_nexts=r_impliesExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_nexts); ((AndExpressionNode) cn).getNexts().add(f_nexts); 
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
    // $ANTLR end r_andExpression


    // $ANTLR start r_impliesExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:283:1: r_impliesExpression returns [CompositeNode cn] : (f_first= r_relationalExpression ) ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )* ;
    public CompositeNode r_impliesExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createImpliesExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: ( (f_first= r_relationalExpression ) ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: (f_first= r_relationalExpression ) ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:2: (f_first= r_relationalExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:3: f_first= r_relationalExpression
            {
            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2625);
            f_first=r_relationalExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((ImpliesExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:115: ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==86) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:116: ( ( 'implies' ) (f_nexts= r_relationalExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:116: ( ( 'implies' ) (f_nexts= r_relationalExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:117: ( 'implies' ) (f_nexts= r_relationalExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:117: ( 'implies' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:118: 'implies'
            	    {
            	    match(input,86,FOLLOW_86_in_r_impliesExpression2633); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:165: (f_nexts= r_relationalExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:287:166: f_nexts= r_relationalExpression
            	    {
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2641);
            	    f_nexts=r_relationalExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_nexts); ((ImpliesExpressionNode) cn).getNexts().add(f_nexts); 
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
    // $ANTLR end r_impliesExpression


    // $ANTLR start r_relationalExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:290:1: r_relationalExpression returns [CompositeNode cn] : (f_first= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )* ;
    public CompositeNode r_relationalExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createRelationalExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:2: ( (f_first= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:2: (f_first= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:2: (f_first= r_additiveExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:3: f_first= r_additiveExpression
            {
            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2675);
            f_first=r_additiveExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((RelationalExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:116: ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=87 && LA65_0<=92)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:117: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:117: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:118: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:118: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:119: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:119: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            	    int alt64=6;
            	    switch ( input.LA(1) ) {
            	    case 87:
            	        {
            	        alt64=1;
            	        }
            	        break;
            	    case 88:
            	        {
            	        alt64=2;
            	        }
            	        break;
            	    case 89:
            	        {
            	        alt64=3;
            	        }
            	        break;
            	    case 90:
            	        {
            	        alt64=4;
            	        }
            	        break;
            	    case 91:
            	        {
            	        alt64=5;
            	        }
            	        break;
            	    case 92:
            	        {
            	        alt64=6;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("294:119: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )", 64, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt64) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:120: ( '==' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:120: ( '==' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:294:121: '=='
            	            {
            	            match(input,87,FOLLOW_87_in_r_relationalExpression2685); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( '!=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:4: ( '!=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:295:5: '!='
            	            {
            	            match(input,88,FOLLOW_88_in_r_relationalExpression2694); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:4: ( '>=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:4: ( '>=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:296:5: '>='
            	            {
            	            match(input,89,FOLLOW_89_in_r_relationalExpression2703); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:4: ( '<=' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:4: ( '<=' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:297:5: '<='
            	            {
            	            match(input,90,FOLLOW_90_in_r_relationalExpression2712); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( '>' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:4: ( '>' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:5: '>'
            	            {
            	            match(input,91,FOLLOW_91_in_r_relationalExpression2721); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:4: ( '<' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:4: ( '<' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:5: '<'
            	            {
            	            match(input,92,FOLLOW_92_in_r_relationalExpression2730); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:48: (f_nexts= r_additiveExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:299:49: f_nexts= r_additiveExpression
            	    {
            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2740);
            	    f_nexts=r_additiveExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_nexts); ((RelationalExpressionNode) cn).getNexts().add(f_nexts); 
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
    // $ANTLR end r_relationalExpression


    // $ANTLR start r_additiveExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:302:1: r_additiveExpression returns [CompositeNode cn] : (f_first= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )* ;
    public CompositeNode r_additiveExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createAdditiveExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:2: ( (f_first= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:2: (f_first= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:2: (f_first= r_multiplicativeExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:3: f_first= r_multiplicativeExpression
            {
            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2774);
            f_first=r_multiplicativeExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((AdditiveExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:120: ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==36) ) {
                    int LA67_2 = input.LA(2);

                    if ( ((LA67_2>=StringLiteral && LA67_2<=Identifier)||LA67_2==31||LA67_2==36||(LA67_2>=70 && LA67_2<=72)||LA67_2==80||(LA67_2>=95 && LA67_2<=109)) ) {
                        alt67=1;
                    }


                }
                else if ( (LA67_0==93) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:121: ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:121: ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:122: ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:122: ( ( ( '+' ) | ( '-' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:123: ( ( '+' ) | ( '-' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:123: ( ( '+' ) | ( '-' ) )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==93) ) {
            	        alt66=1;
            	    }
            	    else if ( (LA66_0==36) ) {
            	        alt66=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("306:123: ( ( '+' ) | ( '-' ) )", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:124: ( '+' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:124: ( '+' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:125: '+'
            	            {
            	            match(input,93,FOLLOW_93_in_r_additiveExpression2784); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:4: ( '-' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:4: ( '-' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:5: '-'
            	            {
            	            match(input,36,FOLLOW_36_in_r_additiveExpression2793); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:48: (f_nexts= r_multiplicativeExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:307:49: f_nexts= r_multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2803);
            	    f_nexts=r_multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_nexts); ((AdditiveExpressionNode) cn).getNexts().add(f_nexts); 
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
    // $ANTLR end r_additiveExpression


    // $ANTLR start r_multiplicativeExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:310:1: r_multiplicativeExpression returns [CompositeNode cn] : (f_first= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )* ;
    public CompositeNode r_multiplicativeExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createMultiplicativeExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:2: ( (f_first= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:2: (f_first= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:2: (f_first= r_unaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:3: f_first= r_unaryExpression
            {
            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2837);
            f_first=r_unaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((MultiplicativeExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:117: ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==33||LA69_0==94) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:118: ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:118: ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:119: ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:119: ( ( ( '*' ) | ( '/' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:120: ( ( '*' ) | ( '/' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:120: ( ( '*' ) | ( '/' ) )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==33) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==94) ) {
            	        alt68=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return cn;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("314:120: ( ( '*' ) | ( '/' ) )", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:121: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:121: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:122: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_multiplicativeExpression2847); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:4: ( '/' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:4: ( '/' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:5: '/'
            	            {
            	            match(input,94,FOLLOW_94_in_r_multiplicativeExpression2856); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:48: (f_nexts= r_unaryExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:315:49: f_nexts= r_unaryExpression
            	    {
            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2866);
            	    f_nexts=r_unaryExpression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_nexts); ((MultiplicativeExpressionNode) cn).getNexts().add(f_nexts); 
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
    // $ANTLR end r_multiplicativeExpression


    // $ANTLR start r_unaryExpression
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:318:1: r_unaryExpression returns [CompositeNode cn] : ( (f_unnamed16= r_infixExpression ) | ( '!' ) (f_operand= r_infixExpression ) | ( '-' ) (f_operand= r_infixExpression ) );
    public CompositeNode r_unaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed16 = null;

        CompositeNode f_operand = null;


         cn = factory.createUnaryExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:2: ( (f_unnamed16= r_infixExpression ) | ( '!' ) (f_operand= r_infixExpression ) | ( '-' ) (f_operand= r_infixExpression ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 31:
            case 70:
            case 71:
            case 72:
            case 80:
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
            case 109:
                {
                alt70=1;
                }
                break;
            case 95:
                {
                alt70=2;
                }
                break;
            case 36:
                {
                alt70=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("318:1: r_unaryExpression returns [CompositeNode cn] : ( (f_unnamed16= r_infixExpression ) | ( '!' ) (f_operand= r_infixExpression ) | ( '-' ) (f_operand= r_infixExpression ) );", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:2: (f_unnamed16= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:2: (f_unnamed16= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:3: f_unnamed16= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2900);
                    f_unnamed16=r_infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed16); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: ( '!' ) (f_operand= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: ( '!' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:5: '!'
                    {
                    match(input,95,FOLLOW_95_in_r_unaryExpression2909); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:46: (f_operand= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:47: f_operand= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2917);
                    f_operand=r_infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_operand); ((UnaryExpressionNode) cn).setOperand(f_operand); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:324:4: ( '-' ) (f_operand= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:324:4: ( '-' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:324:5: '-'
                    {
                    match(input,36,FOLLOW_36_in_r_unaryExpression2926); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:324:46: (f_operand= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:324:47: f_operand= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2934);
                    f_operand=r_infixExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_operand); ((UnaryExpressionNode) cn).setOperand(f_operand); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:327:1: r_infixExpression returns [CompositeNode cn] : (f_target= r_primaryExpression ) ( ( ( '.' ) (f_calls= r_featureCall ) ) )* ;
    public CompositeNode r_infixExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_target = null;

        CompositeNode f_calls = null;


         cn = factory.createInfixExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:2: ( (f_target= r_primaryExpression ) ( ( ( '.' ) (f_calls= r_featureCall ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:2: (f_target= r_primaryExpression ) ( ( ( '.' ) (f_calls= r_featureCall ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:2: (f_target= r_primaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:3: f_target= r_primaryExpression
            {
            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression2965);
            f_target=r_primaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_target); ((InfixExpressionNode) cn).setTarget(f_target); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:114: ( ( ( '.' ) (f_calls= r_featureCall ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==69) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:115: ( ( '.' ) (f_calls= r_featureCall ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:115: ( ( '.' ) (f_calls= r_featureCall ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:116: ( '.' ) (f_calls= r_featureCall )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:116: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:117: '.'
            	    {
            	    match(input,69,FOLLOW_69_in_r_infixExpression2973); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:158: (f_calls= r_featureCall )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:331:159: f_calls= r_featureCall
            	    {
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression2981);
            	    f_calls=r_featureCall();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_calls); ((InfixExpressionNode) cn).getCalls().add(f_calls); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );
    public CompositeNode r_primaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_stringLiteral18 = null;

        CompositeNode r_featureCall19 = null;

        CompositeNode r_booleanLiteral20 = null;

        CompositeNode r_numberLiteral21 = null;

        CompositeNode r_nullLiteral22 = null;

        CompositeNode r_listLiteral23 = null;

        CompositeNode r_constructorCall24 = null;

        CompositeNode r_globalVarExpression25 = null;

        CompositeNode r_paranthesizedExpression26 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:2: ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) )
            int alt72=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt72=1;
                }
                break;
            case Identifier:
            case 70:
            case 71:
            case 72:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
                {
                alt72=2;
                }
                break;
            case 98:
            case 99:
                {
                alt72=3;
                }
                break;
            case IntLiteral:
                {
                alt72=4;
                }
                break;
            case 100:
                {
                alt72=5;
                }
                break;
            case 80:
                {
                alt72=6;
                }
                break;
            case 97:
                {
                alt72=7;
                }
                break;
            case 96:
                {
                alt72=8;
                }
                break;
            case 31:
                {
                alt72=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("334:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:2: ( r_stringLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:2: ( r_stringLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:3: r_stringLiteral
                    {
                    pushFollow(FOLLOW_r_stringLiteral_in_r_primaryExpression3003);
                    r_stringLiteral18=r_stringLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_stringLiteral18; 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:4: ( r_featureCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:4: ( r_featureCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:5: r_featureCall
                    {
                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression3012);
                    r_featureCall19=r_featureCall();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_featureCall19; 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:4: ( r_booleanLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:4: ( r_booleanLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:5: r_booleanLiteral
                    {
                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression3021);
                    r_booleanLiteral20=r_booleanLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_booleanLiteral20; 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:4: ( r_numberLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:4: ( r_numberLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:5: r_numberLiteral
                    {
                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression3030);
                    r_numberLiteral21=r_numberLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_numberLiteral21; 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( r_nullLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( r_nullLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:5: r_nullLiteral
                    {
                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression3039);
                    r_nullLiteral22=r_nullLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_nullLiteral22; 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:4: ( r_listLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:4: ( r_listLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:5: r_listLiteral
                    {
                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression3048);
                    r_listLiteral23=r_listLiteral();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_listLiteral23; 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:4: ( r_constructorCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:4: ( r_constructorCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:5: r_constructorCall
                    {
                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression3057);
                    r_constructorCall24=r_constructorCall();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_constructorCall24; 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:4: ( r_globalVarExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:4: ( r_globalVarExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:5: r_globalVarExpression
                    {
                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression3066);
                    r_globalVarExpression25=r_globalVarExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_globalVarExpression25; 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:343:4: ( r_paranthesizedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:343:4: ( r_paranthesizedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:343:5: r_paranthesizedExpression
                    {
                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression3075);
                    r_paranthesizedExpression26=r_paranthesizedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_paranthesizedExpression26; 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:346:1: r_stringLiteral returns [CompositeNode cn] : ( StringLiteral ) ;
    public CompositeNode r_stringLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createStringLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:2: ( ( StringLiteral ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:2: ( StringLiteral )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:2: ( StringLiteral )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:349:3: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_r_stringLiteral3099); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:352:1: r_paranthesizedExpression returns [CompositeNode cn] : ( '(' ) (f_expression= r_expression ) ( ')' ) ;
    public CompositeNode r_paranthesizedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;


         cn = factory.createParanthesizedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:2: ( ( '(' ) (f_expression= r_expression ) ( ')' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:2: ( '(' ) (f_expression= r_expression ) ( ')' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:2: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:3: '('
            {
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression3123); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:44: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:45: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression3131);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((ParanthesizedExpressionNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:173: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:355:174: ')'
            {
            match(input,34,FOLLOW_34_in_r_paranthesizedExpression3137); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:358:1: r_globalVarExpression returns [CompositeNode cn] : ( 'GLOBALVAR' ) (f_unnamed17= r_identifier ) ;
    public CompositeNode r_globalVarExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed17 = null;


         cn = factory.createGlobalVarExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:2: ( ( 'GLOBALVAR' ) (f_unnamed17= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:2: ( 'GLOBALVAR' ) (f_unnamed17= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:2: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:3: 'GLOBALVAR'
            {
            match(input,96,FOLLOW_96_in_r_globalVarExpression3161); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:52: (f_unnamed17= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:361:53: f_unnamed17= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression3169);
            f_unnamed17=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed17); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:364:1: r_featureCall returns [CompositeNode cn] : ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) );
    public CompositeNode r_featureCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed18 = null;

        CompositeNode f_name = null;

        CompositeNode f_paramList = null;

        CompositeNode f_type = null;


         cn = factory.createFeatureCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:2: ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
                {
                alt74=1;
                }
                break;
            case Identifier:
                {
                int LA74_2 = input.LA(2);

                if ( (LA74_2==31) ) {
                    alt74=2;
                }
                else if ( (LA74_2==EOF||LA74_2==TEXT||LA74_2==Identifier||LA74_2==27||(LA74_2>=32 && LA74_2<=34)||(LA74_2>=36 && LA74_2<=37)||LA74_2==40||LA74_2==42||LA74_2==44||(LA74_2>=55 && LA74_2<=57)||(LA74_2>=61 && LA74_2<=62)||LA74_2==64||LA74_2==69||(LA74_2>=75 && LA74_2<=78)||(LA74_2>=81 && LA74_2<=94)) ) {
                    alt74=3;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("364:1: r_featureCall returns [CompositeNode cn] : ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) );", 74, 2, input);

                    throw nvae;
                }
                }
                break;
            case 70:
            case 71:
            case 72:
                {
                alt74=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("364:1: r_featureCall returns [CompositeNode cn] : ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) );", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:2: (f_unnamed18= r_collectionExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:2: (f_unnamed18= r_collectionExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:3: f_unnamed18= r_collectionExpression
                    {
                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall3195);
                    f_unnamed18=r_collectionExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed18); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:4: (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:4: (f_name= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:5: f_name= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_featureCall3206);
                    f_name=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_name); ((FeatureCallNode) cn).setName(f_name); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:97: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:98: '('
                    {
                    match(input,31,FOLLOW_31_in_r_featureCall3212); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:139: ( ( (f_paramList= r_parameterList ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=StringLiteral && LA73_0<=Identifier)||LA73_0==31||LA73_0==36||LA73_0==60||(LA73_0>=70 && LA73_0<=73)||(LA73_0>=79 && LA73_0<=80)||(LA73_0>=95 && LA73_0<=109)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:140: ( (f_paramList= r_parameterList ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:140: ( (f_paramList= r_parameterList ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:141: (f_paramList= r_parameterList )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:141: (f_paramList= r_parameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:142: f_paramList= r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall3222);
                            f_paramList=r_parameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_paramList); ((FeatureCallNode) cn).setParamList(f_paramList); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:260: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:261: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_featureCall3231); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:369:4: (f_type= r_type )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:369:4: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:369:5: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_featureCall3242);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((FeatureCallNode) cn).setType(f_type); 
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
    // $ANTLR end r_featureCall


    // $ANTLR start r_listLiteral
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:372:1: r_listLiteral returns [CompositeNode cn] : ( '{' ) ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )? ( '}' ) ;
    public CompositeNode r_listLiteral() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_elements = null;


         cn = factory.createListLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:2: ( ( '{' ) ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )? ( '}' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:2: ( '{' ) ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )? ( '}' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:2: ( '{' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:3: '{'
            {
            match(input,80,FOLLOW_80_in_r_listLiteral3266); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:44: ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=StringLiteral && LA76_0<=Identifier)||LA76_0==31||LA76_0==36||LA76_0==60||(LA76_0>=70 && LA76_0<=73)||(LA76_0>=79 && LA76_0<=80)||(LA76_0>=95 && LA76_0<=109)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:45: ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:45: ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:46: (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )*
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:46: (f_elements= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:47: f_elements= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral3276);
                    f_elements=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_elements); ((ListLiteralNode) cn).getElements().add(f_elements); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:161: ( ( ( ',' ) (f_elements= r_expression ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==32) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:162: ( ( ',' ) (f_elements= r_expression ) )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:162: ( ( ',' ) (f_elements= r_expression ) )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:163: ( ',' ) (f_elements= r_expression )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:163: ( ',' )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:164: ','
                    	    {
                    	    match(input,32,FOLLOW_32_in_r_listLiteral3284); if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addLeafNodeForToken(cn, null); 
                    	    }

                    	    }

                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:205: (f_elements= r_expression )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:206: f_elements= r_expression
                    	    {
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral3292);
                    	    f_elements=r_expression();
                    	    _fsp--;
                    	    if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addToChildren(cn, f_elements); ((ListLiteralNode) cn).getElements().add(f_elements); 
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:326: ( '}' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:375:327: '}'
            {
            match(input,82,FOLLOW_82_in_r_listLiteral3304); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:378:1: r_constructorCall returns [CompositeNode cn] : ( 'new' ) (f_unnamed19= r_simpleType ) ;
    public CompositeNode r_constructorCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed19 = null;


         cn = factory.createConstructorCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( ( 'new' ) (f_unnamed19= r_simpleType ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( 'new' ) (f_unnamed19= r_simpleType )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:2: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:3: 'new'
            {
            match(input,97,FOLLOW_97_in_r_constructorCall3328); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:46: (f_unnamed19= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:381:47: f_unnamed19= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall3336);
            f_unnamed19=r_simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed19); 
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
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==98) ) {
                alt77=1;
            }
            else if ( (LA77_0==99) ) {
                alt77=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("384:1: r_booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( 'false' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:2: ( 'false' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:3: 'false'
                    {
                    match(input,98,FOLLOW_98_in_r_booleanLiteral3360); if (failed) return cn;
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
                    match(input,99,FOLLOW_99_in_r_booleanLiteral3369); if (failed) return cn;
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
            match(input,100,FOLLOW_100_in_r_nullLiteral3393); if (failed) return cn;
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
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==IntLiteral) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==69) ) {
                    int LA78_2 = input.LA(3);

                    if ( (LA78_2==Identifier||(LA78_2>=70 && LA78_2<=72)||(LA78_2>=101 && LA78_2<=109)) ) {
                        alt78=1;
                    }
                    else if ( (LA78_2==IntLiteral) ) {
                        alt78=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("397:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 78, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA78_1==EOF||LA78_1==TEXT||LA78_1==Identifier||LA78_1==27||(LA78_1>=32 && LA78_1<=34)||(LA78_1>=36 && LA78_1<=37)||LA78_1==40||LA78_1==42||LA78_1==44||(LA78_1>=55 && LA78_1<=57)||(LA78_1>=61 && LA78_1<=62)||(LA78_1>=75 && LA78_1<=78)||(LA78_1>=81 && LA78_1<=94)) ) {
                    alt78=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("397:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("397:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:2: ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:2: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:3: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3417); if (failed) return cn;
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
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3426); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:53: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:54: '.'
                    {
                    match(input,69,FOLLOW_69_in_r_numberLiteral3432); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:95: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:401:96: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3438); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:404:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' ) );
    public CompositeNode r_collectionExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_type = null;

        CompositeNode f_variable = null;

        CompositeNode f_expression = null;


         cn = factory.createCollectionExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:2: ( ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==101) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=102 && LA81_0<=109)) ) {
                alt81=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("404:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' ) );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:2: ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:2: ( 'typeSelect' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:3: 'typeSelect'
                    {
                    match(input,101,FOLLOW_101_in_r_collectionExpression3462); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:54: '('
                    {
                    match(input,31,FOLLOW_31_in_r_collectionExpression3468); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:95: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:96: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression3476);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((CollectionExpressionNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:191: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:192: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3482); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    int alt79=8;
                    switch ( input.LA(1) ) {
                    case 102:
                        {
                        alt79=1;
                        }
                        break;
                    case 103:
                        {
                        alt79=2;
                        }
                        break;
                    case 104:
                        {
                        alt79=3;
                        }
                        break;
                    case 105:
                        {
                        alt79=4;
                        }
                        break;
                    case 106:
                        {
                        alt79=5;
                        }
                        break;
                    case 107:
                        {
                        alt79=6;
                        }
                        break;
                    case 108:
                        {
                        alt79=7;
                        }
                        break;
                    case 109:
                        {
                        alt79=8;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return cn;}
                        NoViableAltException nvae =
                            new NoViableAltException("408:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )", 79, 0, input);

                        throw nvae;
                    }

                    switch (alt79) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:6: ( 'collect' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:6: ( 'collect' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:7: 'collect'
                            {
                            match(input,102,FOLLOW_102_in_r_collectionExpression3493); if (failed) return cn;
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
                            match(input,103,FOLLOW_103_in_r_collectionExpression3502); if (failed) return cn;
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
                            match(input,104,FOLLOW_104_in_r_collectionExpression3511); if (failed) return cn;
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
                            match(input,105,FOLLOW_105_in_r_collectionExpression3520); if (failed) return cn;
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
                            match(input,106,FOLLOW_106_in_r_collectionExpression3529); if (failed) return cn;
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
                            match(input,107,FOLLOW_107_in_r_collectionExpression3538); if (failed) return cn;
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
                            match(input,108,FOLLOW_108_in_r_collectionExpression3547); if (failed) return cn;
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
                            match(input,109,FOLLOW_109_in_r_collectionExpression3556); if (failed) return cn;
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
                    match(input,31,FOLLOW_31_in_r_collectionExpression3564); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:95: ( ( (f_variable= r_identifier ) ( '|' ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==Identifier) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==110) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:96: ( (f_variable= r_identifier ) ( '|' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:96: ( (f_variable= r_identifier ) ( '|' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:97: (f_variable= r_identifier ) ( '|' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:97: (f_variable= r_identifier )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:98: f_variable= r_identifier
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression3574);
                            f_variable=r_identifier();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_variable); ((CollectionExpressionNode) cn).setVariable(f_variable); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:215: ( '|' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:216: '|'
                            {
                            match(input,110,FOLLOW_110_in_r_collectionExpression3580); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:260: (f_expression= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:261: f_expression= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression3591);
                    f_expression=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_expression); ((CollectionExpressionNode) cn).setExpression(f_expression); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:386: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:415:387: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3597); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:418:1: r_declaredParameterList returns [CompositeNode cn] : (f_params= r_declaredParameter ) ( ( ( ',' ) (f_params= r_declaredParameter ) ) )* ;
    public CompositeNode r_declaredParameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_params = null;


         cn = factory.createDeclaredParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:2: ( (f_params= r_declaredParameter ) ( ( ( ',' ) (f_params= r_declaredParameter ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:2: (f_params= r_declaredParameter ) ( ( ( ',' ) (f_params= r_declaredParameter ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:2: (f_params= r_declaredParameter )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:3: f_params= r_declaredParameter
            {
            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3623);
            f_params=r_declaredParameter();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_params); ((DeclaredParameterListNode) cn).getParams().add(f_params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:126: ( ( ( ',' ) (f_params= r_declaredParameter ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==32) ) {
                    int LA82_1 = input.LA(2);

                    if ( (LA82_1==Identifier||(LA82_1>=70 && LA82_1<=72)) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:127: ( ( ',' ) (f_params= r_declaredParameter ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:127: ( ( ',' ) (f_params= r_declaredParameter ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:128: ( ',' ) (f_params= r_declaredParameter )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:128: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:129: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_declaredParameterList3631); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:170: (f_params= r_declaredParameter )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:421:171: f_params= r_declaredParameter
            	    {
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3639);
            	    f_params=r_declaredParameter();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_params); ((DeclaredParameterListNode) cn).getParams().add(f_params); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:424:1: r_declaredParameter returns [CompositeNode cn] : (f_ptype= r_type ) (f_name= r_identifier ) ;
    public CompositeNode r_declaredParameter() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_ptype = null;

        CompositeNode f_name = null;


         cn = factory.createDeclaredParameterNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:2: ( (f_ptype= r_type ) (f_name= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:2: (f_ptype= r_type ) (f_name= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:2: (f_ptype= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:3: f_ptype= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_declaredParameter3668);
            f_ptype=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_ptype); ((DeclaredParameterNode) cn).setPtype(f_ptype); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:99: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:427:100: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter3676);
            f_name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((DeclaredParameterNode) cn).setName(f_name); 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:430:1: r_parameterList returns [CompositeNode cn] : (f_params= r_expression ) ( ( ( ',' ) (f_params= r_expression ) ) )* ;
    public CompositeNode r_parameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_params = null;


         cn = factory.createParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:2: ( (f_params= r_expression ) ( ( ( ',' ) (f_params= r_expression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:2: (f_params= r_expression ) ( ( ( ',' ) (f_params= r_expression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:2: (f_params= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:3: f_params= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_parameterList3702);
            f_params=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_params); ((ParameterListNode) cn).getParams().add(f_params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:111: ( ( ( ',' ) (f_params= r_expression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==32) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:112: ( ( ',' ) (f_params= r_expression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:112: ( ( ',' ) (f_params= r_expression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:113: ( ',' ) (f_params= r_expression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:113: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:114: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_parameterList3710); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:155: (f_params= r_expression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:433:156: f_params= r_expression
            	    {
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList3718);
            	    f_params=r_expression();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_params); ((ParameterListNode) cn).getParams().add(f_params); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
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

        CompositeNode r_collectionType27 = null;

        CompositeNode r_simpleType28 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:2: ( ( r_collectionType ) | ( r_simpleType ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=70 && LA84_0<=72)) ) {
                alt84=1;
            }
            else if ( (LA84_0==Identifier) ) {
                alt84=2;
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("436:1: r_type returns [CompositeNode cn] : ( ( r_collectionType ) | ( r_simpleType ) );", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:2: ( r_collectionType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:2: ( r_collectionType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:3: r_collectionType
                    {
                    pushFollow(FOLLOW_r_collectionType_in_r_type3740);
                    r_collectionType27=r_collectionType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_collectionType27; 
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
                    pushFollow(FOLLOW_r_simpleType_in_r_type3749);
                    r_simpleType28=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       cn = r_simpleType28; 
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:441:1: r_collectionType returns [CompositeNode cn] : ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )? ;
    public CompositeNode r_collectionType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_elementType = null;


         cn = factory.createCollectionTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:2: ( ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt85=1;
                }
                break;
            case 71:
                {
                alt85=2;
                }
                break;
            case 72:
                {
                alt85=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("444:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:4: ( 'Collection' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:4: ( 'Collection' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:5: 'Collection'
                    {
                    match(input,70,FOLLOW_70_in_r_collectionType3775); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "collectionType"); 
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
                    match(input,71,FOLLOW_71_in_r_collectionType3784); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "collectionType"); 
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
                    match(input,72,FOLLOW_72_in_r_collectionType3793); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "collectionType"); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:62: ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==111) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:63: ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:63: ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:64: ( '[' ) (f_elementType= r_simpleType ) ( ']' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:64: ( '[' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:65: '['
                    {
                    match(input,111,FOLLOW_111_in_r_collectionType3803); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:106: (f_elementType= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:107: f_elementType= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType3811);
                    f_elementType=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_elementType); ((CollectionTypeNode) cn).setElementType(f_elementType); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:230: ( ']' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:446:231: ']'
                    {
                    match(input,112,FOLLOW_112_in_r_collectionType3817); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:449:1: r_simpleType returns [CompositeNode cn] : (f_names= r_identifier ) ( ( ( '::' ) (f_names= r_identifier ) ) )* ;
    public CompositeNode r_simpleType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_names = null;


         cn = factory.createSimpleTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:2: ( (f_names= r_identifier ) ( ( ( '::' ) (f_names= r_identifier ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:2: (f_names= r_identifier ) ( ( ( '::' ) (f_names= r_identifier ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:2: (f_names= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:3: f_names= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_simpleType3846);
            f_names=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_names); ((SimpleTypeNode) cn).getNames().add(f_names); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:104: ( ( ( '::' ) (f_names= r_identifier ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==64) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:105: ( ( '::' ) (f_names= r_identifier ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:105: ( ( '::' ) (f_names= r_identifier ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:106: ( '::' ) (f_names= r_identifier )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:106: ( '::' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:107: '::'
            	    {
            	    match(input,64,FOLLOW_64_in_r_simpleType3854); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:149: (f_names= r_identifier )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:452:150: f_names= r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType3862);
            	    f_names=r_identifier();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_names); ((SimpleTypeNode) cn).getNames().add(f_names); 
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
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
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier3889); if (failed) return cn;
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
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:2: ( '(' r_type ')' r_chainExpression )
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:3: '(' r_type ')' r_chainExpression
        {
        match(input,31,FOLLOW_31_in_synpred12133); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred12135);
        r_type();
        _fsp--;
        if (failed) return ;
        match(input,34,FOLLOW_34_in_synpred12137); if (failed) return ;
        pushFollow(FOLLOW_r_chainExpression_in_synpred12139);
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


    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA53_eotS =
        "\101\uffff";
    static final String DFA53_eofS =
        "\10\uffff\1\2\70\uffff";
    static final String DFA53_minS =
        "\2\13\1\uffff\3\41\1\37\1\15\1\12\1\15\1\100\1\12\1\0\30\uffff\1"+
        "\41\1\15\1\41\1\0\3\37\25\0";
    static final String DFA53_maxS =
        "\2\155\1\uffff\3\157\1\136\1\15\1\155\1\15\1\160\1\155\1\0\30\uffff"+
        "\1\136\1\15\1\136\1\0\3\37\25\0";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\12\uffff\30\1\34\uffff";
    static final String DFA53_specialS =
        "\10\uffff\1\0\3\uffff\1\2\33\uffff\1\1\30\uffff}>";
    static final String[] DFA53_transitionS = {
            "\3\2\21\uffff\1\1\4\uffff\1\2\27\uffff\1\2\11\uffff\3\2\6\uffff"+
            "\2\2\16\uffff\17\2",
            "\2\2\1\6\21\uffff\1\2\4\uffff\1\2\27\uffff\1\2\11\uffff\1\3"+
            "\1\4\1\5\1\2\5\uffff\2\2\16\uffff\17\2",
            "",
            "\1\2\1\10\1\uffff\1\2\40\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\7",
            "\1\2\1\10\1\uffff\1\2\40\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\7",
            "\1\2\1\10\1\uffff\1\2\40\uffff\1\2\5\uffff\2\2\7\uffff\13\2"+
            "\20\uffff\1\7",
            "\1\2\1\uffff\1\2\1\10\1\uffff\1\2\33\uffff\1\11\4\uffff\1\2"+
            "\5\uffff\2\2\7\uffff\13\2",
            "\1\12",
            "\1\2\1\16\1\35\1\14\15\uffff\1\2\3\uffff\1\42\3\2\1\uffff\1"+
            "\13\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\12\uffff\3\2\2\uffff"+
            "\1\44\2\2\6\uffff\1\2\1\30\1\31\1\32\2\uffff\3\2\1\uffff\1\15"+
            "\1\37\16\2\1\43\1\41\1\40\1\33\1\34\1\36\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27",
            "\1\45",
            "\1\46\57\uffff\1\47",
            "\1\2\1\50\1\70\1\62\21\uffff\1\75\4\uffff\1\2\41\uffff\1\63"+
            "\1\64\1\65\7\uffff\1\72\16\uffff\1\2\1\74\1\73\1\66\1\67\1\71"+
            "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
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
            "\1\2\1\10\1\uffff\1\2\33\uffff\1\11\4\uffff\1\2\5\uffff\2\2"+
            "\7\uffff\13\2",
            "\1\76",
            "\1\2\1\10\1\uffff\1\2\40\uffff\1\2\5\uffff\2\2\7\uffff\13\2",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "232:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) ) | (f_unnamed14= r_chainExpression ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_8==EOF||LA53_8==TEXT||LA53_8==27||(LA53_8>=32 && LA53_8<=34)||LA53_8==37||LA53_8==40||LA53_8==42||LA53_8==44||(LA53_8>=55 && LA53_8<=57)||(LA53_8>=61 && LA53_8<=62)||LA53_8==69||(LA53_8>=75 && LA53_8<=77)||(LA53_8>=81 && LA53_8<=94)) ) {s = 2;}

                        else if ( (LA53_8==36) ) {s = 11;}

                        else if ( (LA53_8==Identifier) ) {s = 12;}

                        else if ( (LA53_8==79) && (synpred1())) {s = 13;}

                        else if ( (LA53_8==StringLiteral) && (synpred1())) {s = 14;}

                        else if ( (LA53_8==101) && (synpred1())) {s = 15;}

                        else if ( (LA53_8==102) && (synpred1())) {s = 16;}

                        else if ( (LA53_8==103) && (synpred1())) {s = 17;}

                        else if ( (LA53_8==104) && (synpred1())) {s = 18;}

                        else if ( (LA53_8==105) && (synpred1())) {s = 19;}

                        else if ( (LA53_8==106) && (synpred1())) {s = 20;}

                        else if ( (LA53_8==107) && (synpred1())) {s = 21;}

                        else if ( (LA53_8==108) && (synpred1())) {s = 22;}

                        else if ( (LA53_8==109) && (synpred1())) {s = 23;}

                        else if ( (LA53_8==70) && (synpred1())) {s = 24;}

                        else if ( (LA53_8==71) && (synpred1())) {s = 25;}

                        else if ( (LA53_8==72) && (synpred1())) {s = 26;}

                        else if ( (LA53_8==98) && (synpred1())) {s = 27;}

                        else if ( (LA53_8==99) && (synpred1())) {s = 28;}

                        else if ( (LA53_8==IntLiteral) && (synpred1())) {s = 29;}

                        else if ( (LA53_8==100) && (synpred1())) {s = 30;}

                        else if ( (LA53_8==80) && (synpred1())) {s = 31;}

                        else if ( (LA53_8==97) && (synpred1())) {s = 32;}

                        else if ( (LA53_8==96) && (synpred1())) {s = 33;}

                        else if ( (LA53_8==31) && (synpred1())) {s = 34;}

                        else if ( (LA53_8==95) && (synpred1())) {s = 35;}

                        else if ( (LA53_8==60) && (synpred1())) {s = 36;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_40 = input.LA(1);

                         
                        int index53_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index53_40);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 36;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index53_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file80 = new BitSet(new long[]{0x8800000024002010L,0x00000000000001CEL});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file93 = new BitSet(new long[]{0x8800000000002010L,0x00000000000001CEL});
    public static final BitSet FOLLOW_EOF_in_r_file102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_import_in_r_nsImport119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extensionImport_in_r_nsImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_import154 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_r_import160 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_import168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_import174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_r_import185 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_import193 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_import199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_extensionImport225 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extensionImport231 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_extensionImport239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_extensionImport245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_r_extensionImport256 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_extensionImport264 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_30_in_r_extensionImport270 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_extensionImport277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definition_in_r_abstractDeclaration323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definitionAround_in_r_abstractDeclaration332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definition356 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_r_definition362 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_definition370 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definition378 = new BitSet(new long[]{0x0000000600002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definition388 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definition396 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definition403 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definition415 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definition424 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definition433 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_definition441 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definition449 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_r_definition455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definition461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definitionAround485 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_r_definitionAround491 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_definitionAround499 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definitionAround507 = new BitSet(new long[]{0x0000000600002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definitionAround517 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definitionAround525 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround532 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround544 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definitionAround553 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definitionAround562 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_definitionAround570 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definitionAround578 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_r_definitionAround584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definitionAround590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence616 = new BitSet(new long[]{0x102882F080003802L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_statement_in_r_sequence626 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence634 = new BitSet(new long[]{0x102882F080003802L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_simpleStatement_in_r_statement656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_fileStatement_in_r_statement665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_foreachStatement_in_r_statement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifStatement_in_r_statement683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letStatement_in_r_statement692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_protectStatement_in_r_statement701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence732 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence742 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_r_text769 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_r_text776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_errorStatement_in_r_simpleStatement795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expandStatement_in_r_simpleStatement804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expressionStmt_in_r_simpleStatement813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_r_errorStatement837 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_errorStatement845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_r_expandStatement869 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_expandStatement877 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_r_expandStatement885 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_expandStatement893 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_expandStatement899 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_r_expandStatement912 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_expandStatement933 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement941 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_r_expandStatement949 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_expressionStmt991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_fileStatement1015 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_fileStatement1023 = new BitSet(new long[]{0x0000041000002400L});
    public static final BitSet FOLLOW_42_in_r_fileStatement1031 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_r_identifier_in_r_fileStatement1044 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_fileStatement1055 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_fileStatement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_foreachStatement1085 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1093 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_r_foreachStatement1099 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1107 = new BitSet(new long[]{0x0000211000000400L});
    public static final BitSet FOLLOW_45_in_r_foreachStatement1115 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1123 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_r_foreachStatement1134 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1142 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_foreachStatement1153 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_r_foreachStatement1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_r_ifStatement1183 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifStatement1191 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_ifStatement1199 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_r_elseIfStatement_in_r_ifStatement1207 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_r_elseStatement_in_r_ifStatement1216 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_r_ifStatement1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_r_elseIfStatement1247 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_elseIfStatement1255 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseIfStatement1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_elseStatement1287 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseStatement1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_r_letStatement1319 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_letStatement1327 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_r_letStatement1333 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letStatement1341 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_letStatement1349 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_r_letStatement1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_r_protectStatement1379 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_r_protectStatement1385 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1393 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_r_protectStatement1399 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1407 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_r_protectStatement1413 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1421 = new BitSet(new long[]{0x0200001000000400L});
    public static final BitSet FOLLOW_57_in_r_protectStatement1427 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_protectStatement1436 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_r_protectStatement1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_r_check1466 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_check1474 = new BitSet(new long[]{0x3000002000000000L});
    public static final BitSet FOLLOW_60_in_r_check1482 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1490 = new BitSet(new long[]{0x2000002000000000L});
    public static final BitSet FOLLOW_37_in_r_check1501 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_61_in_r_check1510 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1520 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_check1526 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1534 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_check1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_r_around1564 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around1572 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around1578 = new BitSet(new long[]{0x0000000600002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around1588 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_around1596 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_around1603 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_around1615 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_around1624 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_around1630 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_around1638 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_around1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_r_pointcut1670 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1681 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_33_in_r_pointcut1691 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1702 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_r_pointcut1711 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_65_in_r_extension1740 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001CEL});
    public static final BitSet FOLLOW_66_in_r_extension1749 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001CEL});
    public static final BitSet FOLLOW_67_in_r_extension1758 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001CEL});
    public static final BitSet FOLLOW_r_type_in_r_extension1769 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1778 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1784 = new BitSet(new long[]{0x0000000400002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension1792 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_extension1799 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_extension1805 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183D0L});
    public static final BitSet FOLLOW_68_in_r_extension1813 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_extension1827 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1835 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1841 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1851 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_r_extension1859 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1867 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_r_extension1879 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension1890 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_extension1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_javaType1932 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_70_in_r_javaType1951 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_71_in_r_javaType1960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_72_in_r_javaType1969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_r_expression_in_r_test_expression2005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_r_test_expression2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_r_letExpression2057 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_r_letExpression2071 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2079 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_letExpression2085 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_castedExpression2144 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression2152 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_castedExpression2158 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_r_chainExpression2217 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2259 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_r_ifExpression2267 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2275 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_ifExpression2281 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_r_ifExpression2301 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_r_ifExpression2315 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_r_ifExpression2331 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_r_switchExpression2371 = new BitSet(new long[]{0x0000000080000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression2379 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2387 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_switchExpression2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_r_switchExpression2402 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression2410 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_81_in_r_switchExpression2417 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_switchExpression2423 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_r_switchExpression2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_r_casePart2472 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2480 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_casePart2486 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_r_orExpression2533 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_r_andExpression2583 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_r_impliesExpression2633 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2675 = new BitSet(new long[]{0x0000000000000002L,0x000000001F800000L});
    public static final BitSet FOLLOW_87_in_r_relationalExpression2685 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_88_in_r_relationalExpression2694 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_89_in_r_relationalExpression2703 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_90_in_r_relationalExpression2712 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_91_in_r_relationalExpression2721 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_92_in_r_relationalExpression2730 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2740 = new BitSet(new long[]{0x0000000000000002L,0x000000001F800000L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2774 = new BitSet(new long[]{0x0000001000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_r_additiveExpression2784 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_36_in_r_additiveExpression2793 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2803 = new BitSet(new long[]{0x0000001000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2837 = new BitSet(new long[]{0x0000000200000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_33_in_r_multiplicativeExpression2847 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_94_in_r_multiplicativeExpression2856 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2866 = new BitSet(new long[]{0x0000000200000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_r_unaryExpression2909 = new BitSet(new long[]{0x0000000080003800L,0x00003FFF000101C0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_r_unaryExpression2926 = new BitSet(new long[]{0x0000000080003800L,0x00003FFF000101C0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression2965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_infixExpression2973 = new BitSet(new long[]{0x0000000000002000L,0x00003FE0000001C0L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression2981 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_r_stringLiteral_in_r_primaryExpression3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_r_stringLiteral3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression3123 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression3131 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_paranthesizedExpression3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_r_globalVarExpression3161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall3206 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall3212 = new BitSet(new long[]{0x1000001480003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall3222 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_featureCall3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_r_listLiteral3266 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800583C0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3276 = new BitSet(new long[]{0x0000000100000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_32_in_r_listLiteral3284 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3292 = new BitSet(new long[]{0x0000000100000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_r_listLiteral3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_r_constructorCall3328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_r_booleanLiteral3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_r_booleanLiteral3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_r_nullLiteral3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_numberLiteral3432 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_r_collectionExpression3462 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3468 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression3476 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_r_collectionExpression3493 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_103_in_r_collectionExpression3502 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_104_in_r_collectionExpression3511 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_105_in_r_collectionExpression3520 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_106_in_r_collectionExpression3529 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_107_in_r_collectionExpression3538 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_108_in_r_collectionExpression3547 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_109_in_r_collectionExpression3556 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3564 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression3574 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_r_collectionExpression3580 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression3591 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3623 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_declaredParameterList3631 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3639 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter3668 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3702 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_parameterList3710 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3718 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_r_collectionType3775 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_71_in_r_collectionType3784 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_72_in_r_collectionType3793 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_r_collectionType3803 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType3811 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_r_collectionType3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_r_simpleType3854 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred12133 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_synpred12135 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred12137 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_chainExpression_in_synpred12139 = new BitSet(new long[]{0x0000000000000002L});

}