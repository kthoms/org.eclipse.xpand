// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g 2008-03-17 09:48:31
 	
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:2: ( ( ( (f_imports= r_nsImport ) ) )* ( ( (f_declarations= r_abstractDeclaration ) ) )* ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:2: ( ( (f_imports= r_nsImport ) ) )* ( ( (f_declarations= r_abstractDeclaration ) ) )* ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:2: ( ( (f_imports= r_nsImport ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:3: ( (f_imports= r_nsImport ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:3: ( (f_imports= r_nsImport ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:4: (f_imports= r_nsImport )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:4: (f_imports= r_nsImport )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:5: f_imports= r_nsImport
            	    {
            	    pushFollow(FOLLOW_r_nsImport_in_r_file75);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:109: ( ( (f_declarations= r_abstractDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==59||LA2_0==63||(LA2_0>=65 && LA2_0<=67)||(LA2_0>=70 && LA2_0<=72)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:110: ( (f_declarations= r_abstractDeclaration ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:110: ( (f_declarations= r_abstractDeclaration ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:111: (f_declarations= r_abstractDeclaration )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:111: (f_declarations= r_abstractDeclaration )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:112: f_declarations= r_abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_r_abstractDeclaration_in_r_file88);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:247: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:248: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_r_file97); if (failed) return cn;

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
    // $ANTLR end r_file


    // $ANTLR start r_nsImport
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:35:1: r_nsImport returns [CompositeNode cn] : ( ( r_import ) | ( r_extensionImport ) );
    public CompositeNode r_nsImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_import1 = null;

        CompositeNode r_extensionImport2 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:2: ( ( r_import ) | ( r_extensionImport ) )
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
                        new NoViableAltException("35:1: r_nsImport returns [CompositeNode cn] : ( ( r_import ) | ( r_extensionImport ) );", 3, 1, input);

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
                    new NoViableAltException("35:1: r_nsImport returns [CompositeNode cn] : ( ( r_import ) | ( r_extensionImport ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:2: ( r_import )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:2: ( r_import )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:3: r_import
                    {
                    pushFollow(FOLLOW_r_import_in_r_nsImport114);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:4: ( r_extensionImport )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:4: ( r_extensionImport )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:5: r_extensionImport
                    {
                    pushFollow(FOLLOW_r_extensionImport_in_r_nsImport123);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:1: r_import returns [CompositeNode cn] : ( ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'import' ) (f_type= r_type ) ( ';' ) );
    public CompositeNode r_import() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_namespace = null;

        CompositeNode f_type = null;


         cn = factory.createImportNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:2: ( ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'import' ) (f_type= r_type ) ( ';' ) )
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
                    new NoViableAltException("40:1: r_import returns [CompositeNode cn] : ( ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'import' ) (f_type= r_type ) ( ';' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:2: ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:2: ( ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:3: ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:3: ( ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:4: ( LG ) ( 'IMPORT' ) (f_namespace= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_import149); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:45: ( 'IMPORT' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:46: 'IMPORT'
                    {
                    match(input,25,FOLLOW_25_in_r_import155); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:92: (f_namespace= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:93: f_namespace= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_import163);
                    f_namespace=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_namespace); ((ImportNode) cn).setNamespace(f_namespace); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:200: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:201: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_import169); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:4: ( 'import' ) (f_type= r_type ) ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:4: ( 'import' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:5: 'import'
                    {
                    match(input,26,FOLLOW_26_in_r_import180); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:51: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:52: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_import188);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((ImportNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:133: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:134: ';'
                    {
                    match(input,27,FOLLOW_27_in_r_import194); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:1: r_extensionImport returns [CompositeNode cn] : ( ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' ) );
    public CompositeNode r_extensionImport() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_namespace = null;

        CompositeNode f_type = null;


         cn = factory.createExtensionImportNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:2: ( ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' ) )
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
                    new NoViableAltException("47:1: r_extensionImport returns [CompositeNode cn] : ( ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) ) | ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:2: ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:2: ( ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:3: ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:3: ( ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:4: ( LG ) ( 'EXTENSION' ) (f_namespace= r_simpleType ) ( RG )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:4: ( LG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:5: LG
                    {
                    match(input,LG,FOLLOW_LG_in_r_extensionImport220); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:45: ( 'EXTENSION' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:46: 'EXTENSION'
                    {
                    match(input,28,FOLLOW_28_in_r_extensionImport226); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:95: (f_namespace= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:96: f_namespace= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_extensionImport234);
                    f_namespace=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_namespace); ((ExtensionImportNode) cn).setNamespace(f_namespace); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:212: ( RG )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:213: RG
                    {
                    match(input,RG,FOLLOW_RG_in_r_extensionImport240); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:4: ( 'extension' ) (f_type= r_type ) ( 'reexport' )? ( ';' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:4: ( 'extension' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:5: 'extension'
                    {
                    match(input,29,FOLLOW_29_in_r_extensionImport251); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:54: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:55: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extensionImport259);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((ExtensionImportNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:145: ( 'reexport' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==30) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:146: 'reexport'
                            {
                            match(input,30,FOLLOW_30_in_r_extensionImport265); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:195: ( ';' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:196: ';'
                    {
                    match(input,27,FOLLOW_27_in_r_extensionImport272); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );
    public CompositeNode r_abstractDeclaration() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_check3 = null;

        CompositeNode r_around4 = null;

        CompositeNode r_extension5 = null;

        CompositeNode r_definition6 = null;

        CompositeNode r_definitionAround7 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:2: ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) )
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
                        new NoViableAltException("54:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("54:1: r_abstractDeclaration returns [CompositeNode cn] : ( ( r_check ) | ( r_around ) | ( r_extension ) | ( r_definition ) | ( r_definitionAround ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:2: ( r_check )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:2: ( r_check )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:3: r_check
                    {
                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration291);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:4: ( r_around )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:4: ( r_around )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:5: r_around
                    {
                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration300);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:4: ( r_extension )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:4: ( r_extension )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:5: r_extension
                    {
                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration309);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:4: ( r_definition )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:4: ( r_definition )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:5: r_definition
                    {
                    pushFollow(FOLLOW_r_definition_in_r_abstractDeclaration318);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:4: ( r_definitionAround )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:4: ( r_definitionAround )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:5: r_definitionAround
                    {
                    pushFollow(FOLLOW_r_definitionAround_in_r_abstractDeclaration327);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:62:1: r_definition returns [CompositeNode cn] : ( LG ) ( DEFINE ) (f_name= r_identifier ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDDEFINE ) ( RG ) ;
    public CompositeNode r_definition() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_name = null;

        CompositeNode f_paramList = null;

        CompositeNode f_type = null;

        CompositeNode f_sequence = null;


         cn = factory.createDefinitionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: ( ( LG ) ( DEFINE ) (f_name= r_identifier ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDDEFINE ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: ( LG ) ( DEFINE ) (f_name= r_identifier ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDDEFINE ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definition351); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:43: ( DEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:44: DEFINE
            {
            match(input,DEFINE,FOLLOW_DEFINE_in_r_definition357); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:88: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:89: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_definition365);
            f_name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((DefinitionNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:180: ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:181: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:181: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:182: ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:182: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:183: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definition373); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:224: ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Identifier||LA11_0==33||(LA11_0>=70 && LA11_0<=72)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:225: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:225: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("65:225: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 10, 0, input);

                                throw nvae;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:226: (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:226: (f_paramList= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:227: f_paramList= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definition383);
                                    f_paramList=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, f_paramList); ((DefinitionNode) cn).setParamList(f_paramList); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:349: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt9=2;
                                    int LA9_0 = input.LA(1);

                                    if ( ((LA9_0>=32 && LA9_0<=33)) ) {
                                        alt9=1;
                                    }
                                    switch (alt9) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:350: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:350: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:351: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:351: ( ',' )?
                                            int alt8=2;
                                            int LA8_0 = input.LA(1);

                                            if ( (LA8_0==32) ) {
                                                alt8=1;
                                            }
                                            switch (alt8) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:352: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definition391); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:394: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:395: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definition398); if (failed) return cn;
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_definition410); if (failed) return cn;
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_definition419); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_r_definition428); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:138: (f_type= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:139: f_type= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definition436);
            f_type=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_type); ((DefinitionNode) cn).setType(f_type); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:224: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:225: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definition444);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((DefinitionNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:330: ( ENDDEFINE )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:331: ENDDEFINE
            {
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_r_definition450); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:378: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:379: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definition456); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:1: r_definitionAround returns [CompositeNode cn] : ( LG ) ( AROUND ) (f_pointcut= r_pointcut ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDAROUND ) ( RG ) ;
    public CompositeNode r_definitionAround() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_pointcut = null;

        CompositeNode f_paramList = null;

        CompositeNode f_type = null;

        CompositeNode f_sequence = null;


         cn = factory.createDefinitionAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:2: ( ( LG ) ( AROUND ) (f_pointcut= r_pointcut ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDAROUND ) ( RG ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:2: ( LG ) ( AROUND ) (f_pointcut= r_pointcut ) ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )? ( 'FOR' ) (f_type= r_type ) (f_sequence= r_sequence ) ( ENDAROUND ) ( RG )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:2: ( LG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:3: LG
            {
            match(input,LG,FOLLOW_LG_in_r_definitionAround480); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:43: ( AROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:44: AROUND
            {
            match(input,AROUND,FOLLOW_AROUND_in_r_definitionAround486); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:88: (f_pointcut= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:89: f_pointcut= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_definitionAround494);
            f_pointcut=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_pointcut); ((DefinitionAroundNode) cn).setPointcut(f_pointcut); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:200: ( ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:201: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:201: ( ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:202: ( '(' ) ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:202: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:203: '('
                    {
                    match(input,31,FOLLOW_31_in_r_definitionAround502); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:244: ( ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==Identifier||LA16_0==33||(LA16_0>=70 && LA16_0<=72)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:245: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:245: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                                    new NoViableAltException("72:245: ( (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:246: (f_paramList= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:246: (f_paramList= r_declaredParameterList )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:247: f_paramList= r_declaredParameterList
                                    {
                                    pushFollow(FOLLOW_r_declaredParameterList_in_r_definitionAround512);
                                    f_paramList=r_declaredParameterList();
                                    _fsp--;
                                    if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addToChildren(cn, f_paramList); ((DefinitionAroundNode) cn).setParamList(f_paramList); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:375: ( ( ( ',' )? ( '*' ) ) )?
                                    int alt14=2;
                                    int LA14_0 = input.LA(1);

                                    if ( ((LA14_0>=32 && LA14_0<=33)) ) {
                                        alt14=1;
                                    }
                                    switch (alt14) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:376: ( ( ',' )? ( '*' ) )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:376: ( ( ',' )? ( '*' ) )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:377: ( ',' )? ( '*' )
                                            {
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:377: ( ',' )?
                                            int alt13=2;
                                            int LA13_0 = input.LA(1);

                                            if ( (LA13_0==32) ) {
                                                alt13=1;
                                            }
                                            switch (alt13) {
                                                case 1 :
                                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:378: ','
                                                    {
                                                    match(input,32,FOLLOW_32_in_r_definitionAround520); if (failed) return cn;
                                                    if ( backtracking==0 ) {
                                                       addLeafNodeForToken(cn, null); 
                                                    }

                                                    }
                                                    break;

                                            }

                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:420: ( '*' )
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:421: '*'
                                            {
                                            match(input,33,FOLLOW_33_in_r_definitionAround527); if (failed) return cn;
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
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:4: ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:4: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:5: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_definitionAround539); if (failed) return cn;
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:49: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:50: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_definitionAround548); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:94: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:95: 'FOR'
            {
            match(input,35,FOLLOW_35_in_r_definitionAround557); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:138: (f_type= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:139: f_type= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_definitionAround565);
            f_type=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_type); ((DefinitionAroundNode) cn).setType(f_type); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:230: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:231: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_definitionAround573);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((DefinitionAroundNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:342: ( ENDAROUND )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:343: ENDAROUND
            {
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_r_definitionAround579); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:390: ( RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:391: RG
            {
            match(input,RG,FOLLOW_RG_in_r_definitionAround585); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:76:1: r_sequence returns [CompositeNode cn] : (f_textSequences= r_textSequence ) ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )* ;
    public CompositeNode r_sequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_textSequences = null;

        CompositeNode f_statements = null;


         cn = factory.createSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: ( (f_textSequences= r_textSequence ) ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: (f_textSequences= r_textSequence ) ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:2: (f_textSequences= r_textSequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:3: f_textSequences= r_textSequence
            {
            pushFollow(FOLLOW_r_textSequence_in_r_sequence611);
            f_textSequences=r_textSequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_textSequences); ((SequenceNode) cn).getTextSequences().add(f_textSequences); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:136: ( ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=StringLiteral && LA18_0<=Identifier)||LA18_0==31||(LA18_0>=36 && LA18_0<=39)||LA18_0==41||LA18_0==47||LA18_0==51||LA18_0==53||LA18_0==60||(LA18_0>=70 && LA18_0<=73)||(LA18_0>=79 && LA18_0<=80)||(LA18_0>=95 && LA18_0<=109)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:137: ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:137: ( (f_statements= r_statement ) (f_textSequences= r_textSequence ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:138: (f_statements= r_statement ) (f_textSequences= r_textSequence )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:138: (f_statements= r_statement )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:139: f_statements= r_statement
            	    {
            	    pushFollow(FOLLOW_r_statement_in_r_sequence621);
            	    f_statements=r_statement();
            	    _fsp--;
            	    if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addToChildren(cn, f_statements); ((SequenceNode) cn).getStatements().add(f_statements); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:257: (f_textSequences= r_textSequence )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:258: f_textSequences= r_textSequence
            	    {
            	    pushFollow(FOLLOW_r_textSequence_in_r_sequence629);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:82:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );
    public CompositeNode r_statement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_simpleStatement8 = null;

        CompositeNode r_fileStatement9 = null;

        CompositeNode r_foreachStatement10 = null;

        CompositeNode r_ifStatement11 = null;

        CompositeNode r_letStatement12 = null;

        CompositeNode r_protectStatement13 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:83:2: ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) )
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
                    new NoViableAltException("82:1: r_statement returns [CompositeNode cn] : ( ( r_simpleStatement ) | ( r_fileStatement ) | ( r_foreachStatement ) | ( r_ifStatement ) | ( r_letStatement ) | ( r_protectStatement ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:83:2: ( r_simpleStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:83:2: ( r_simpleStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:83:3: r_simpleStatement
                    {
                    pushFollow(FOLLOW_r_simpleStatement_in_r_statement651);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:4: ( r_fileStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:4: ( r_fileStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:5: r_fileStatement
                    {
                    pushFollow(FOLLOW_r_fileStatement_in_r_statement660);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:4: ( r_foreachStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:4: ( r_foreachStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:5: r_foreachStatement
                    {
                    pushFollow(FOLLOW_r_foreachStatement_in_r_statement669);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:4: ( r_ifStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:4: ( r_ifStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:5: r_ifStatement
                    {
                    pushFollow(FOLLOW_r_ifStatement_in_r_statement678);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:4: ( r_letStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:4: ( r_letStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:5: r_letStatement
                    {
                    pushFollow(FOLLOW_r_letStatement_in_r_statement687);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( r_protectStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:4: ( r_protectStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:5: r_protectStatement
                    {
                    pushFollow(FOLLOW_r_protectStatement_in_r_statement696);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:1: r_textSequence returns [CompositeNode cn] : (f_texts= r_text ) ( ( (f_texts= r_text ) ) )* ;
    public CompositeNode r_textSequence() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_texts = null;


         cn = factory.createTextSequenceNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:2: ( (f_texts= r_text ) ( ( (f_texts= r_text ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:2: (f_texts= r_text ) ( ( (f_texts= r_text ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:2: (f_texts= r_text )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:3: f_texts= r_text
            {
            pushFollow(FOLLOW_r_text_in_r_textSequence727);
            f_texts=r_text();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_texts); ((TextSequenceNode) cn).getTexts().add(f_texts); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:100: ( ( (f_texts= r_text ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:101: ( (f_texts= r_text ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:101: ( (f_texts= r_text ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:102: (f_texts= r_text )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:102: (f_texts= r_text )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:103: f_texts= r_text
            	    {
            	    pushFollow(FOLLOW_r_text_in_r_textSequence737);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:98:1: r_text returns [CompositeNode cn] : ( '-' )? ( TEXT ) ;
    public CompositeNode r_text() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createTextNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:2: ( ( '-' )? ( TEXT ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:2: ( '-' )? ( TEXT )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:3: '-'
                    {
                    match(input,36,FOLLOW_36_in_r_text764); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:45: ( TEXT )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:101:46: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_r_text771); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:104:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );
    public CompositeNode r_simpleStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_errorStatement14 = null;

        CompositeNode r_expandStatement15 = null;

        CompositeNode r_expressionStmt16 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) )
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
                    new NoViableAltException("104:1: r_simpleStatement returns [CompositeNode cn] : ( ( r_errorStatement ) | ( r_expandStatement ) | ( r_expressionStmt ) );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: ( r_errorStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:2: ( r_errorStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:105:3: r_errorStatement
                    {
                    pushFollow(FOLLOW_r_errorStatement_in_r_simpleStatement790);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:106:4: ( r_expandStatement )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:106:4: ( r_expandStatement )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:106:5: r_expandStatement
                    {
                    pushFollow(FOLLOW_r_expandStatement_in_r_simpleStatement799);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:4: ( r_expressionStmt )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:4: ( r_expressionStmt )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:107:5: r_expressionStmt
                    {
                    pushFollow(FOLLOW_r_expressionStmt_in_r_simpleStatement808);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:110:1: r_errorStatement returns [CompositeNode cn] : ( 'ERROR' ) (f_expression= r_expression ) ;
    public CompositeNode r_errorStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;


         cn = factory.createErrorStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:113:2: ( ( 'ERROR' ) (f_expression= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:113:2: ( 'ERROR' ) (f_expression= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:113:2: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:113:3: 'ERROR'
            {
            match(input,37,FOLLOW_37_in_r_errorStatement832); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:113:48: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:113:49: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_errorStatement840);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:116:1: r_expandStatement returns [CompositeNode cn] : ( 'EXPAND' ) (f_name= r_simpleType ) ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )? ;
    public CompositeNode r_expandStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_name = null;

        CompositeNode f_paramList = null;

        CompositeNode f_forExpression = null;

        CompositeNode f_forEachExpression = null;

        CompositeNode f_separator = null;


         cn = factory.createExpandStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:2: ( ( 'EXPAND' ) (f_name= r_simpleType ) ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:2: ( 'EXPAND' ) (f_name= r_simpleType ) ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )? ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:2: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:3: 'EXPAND'
            {
            match(input,38,FOLLOW_38_in_r_expandStatement864); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:49: (f_name= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:50: f_name= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_expandStatement872);
            f_name=r_simpleType();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((ExpandStatementNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:146: ( ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:147: ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:147: ( ( '(' ) (f_paramList= r_parameterList ) ( ')' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:148: ( '(' ) (f_paramList= r_parameterList ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:148: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:149: '('
                    {
                    match(input,31,FOLLOW_31_in_r_expandStatement880); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:190: (f_paramList= r_parameterList )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:191: f_paramList= r_parameterList
                    {
                    pushFollow(FOLLOW_r_parameterList_in_r_expandStatement888);
                    f_paramList=r_parameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_paramList); ((ExpandStatementNode) cn).setParamList(f_paramList); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:310: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:311: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_expandStatement894); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:355: ( ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35||LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:356: ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:356: ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) )
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
                            new NoViableAltException("119:356: ( ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) ) | ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) ) )", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:357: ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:357: ( ( ( 'FOR' ) (f_forExpression= r_expression ) ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:358: ( ( 'FOR' ) (f_forExpression= r_expression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:358: ( ( 'FOR' ) (f_forExpression= r_expression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:359: ( 'FOR' ) (f_forExpression= r_expression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:359: ( 'FOR' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:360: 'FOR'
                            {
                            match(input,35,FOLLOW_35_in_r_expandStatement907); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:403: (f_forExpression= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:119:404: f_forExpression= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement915);
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:4: ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:4: ( ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:5: ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:5: ( ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )? )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:6: ( 'FOREACH' ) (f_forEachExpression= r_expression ) ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:6: ( 'FOREACH' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:7: 'FOREACH'
                            {
                            match(input,39,FOLLOW_39_in_r_expandStatement928); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:54: (f_forEachExpression= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:55: f_forEachExpression= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement936);
                            f_forEachExpression=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_forEachExpression); ((ExpandStatementNode) cn).setForEachExpression(f_forEachExpression); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:203: ( ( ( 'SEPARATOR' ) (f_separator= r_expression ) ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==40) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:204: ( ( 'SEPARATOR' ) (f_separator= r_expression ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:204: ( ( 'SEPARATOR' ) (f_separator= r_expression ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:205: ( 'SEPARATOR' ) (f_separator= r_expression )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:205: ( 'SEPARATOR' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:206: 'SEPARATOR'
                                    {
                                    match(input,40,FOLLOW_40_in_r_expandStatement944); if (failed) return cn;
                                    if ( backtracking==0 ) {
                                       addLeafNodeForToken(cn, null); 
                                    }

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:255: (f_separator= r_expression )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:120:256: f_separator= r_expression
                                    {
                                    pushFollow(FOLLOW_r_expression_in_r_expandStatement952);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:123:1: r_expressionStmt returns [CompositeNode cn] : (f_expression= r_expression ) ;
    public CompositeNode r_expressionStmt() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;


         cn = factory.createExpressionStmtNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:126:2: ( (f_expression= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:126:2: (f_expression= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:126:2: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:126:3: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_expressionStmt986);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:129:1: r_fileStatement returns [CompositeNode cn] : ( 'FILE' ) (f_nameExpression= r_expression ) ( ( ( 'ONCE' ) ) )? ( ( (f_identifier= r_identifier ) ) )? (f_sequence= r_sequence ) ( 'ENDFILE' ) ;
    public CompositeNode r_fileStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_nameExpression = null;

        CompositeNode f_identifier = null;

        CompositeNode f_sequence = null;


         cn = factory.createFileStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:2: ( ( 'FILE' ) (f_nameExpression= r_expression ) ( ( ( 'ONCE' ) ) )? ( ( (f_identifier= r_identifier ) ) )? (f_sequence= r_sequence ) ( 'ENDFILE' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:2: ( 'FILE' ) (f_nameExpression= r_expression ) ( ( ( 'ONCE' ) ) )? ( ( (f_identifier= r_identifier ) ) )? (f_sequence= r_sequence ) ( 'ENDFILE' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:2: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:3: 'FILE'
            {
            match(input,41,FOLLOW_41_in_r_fileStatement1010); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:47: (f_nameExpression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:48: f_nameExpression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_fileStatement1018);
            f_nameExpression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_nameExpression); ((FileStatementNode) cn).setNameExpression(f_nameExpression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:182: ( ( ( 'ONCE' ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:183: ( ( 'ONCE' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:183: ( ( 'ONCE' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:184: ( 'ONCE' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:184: ( 'ONCE' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:185: 'ONCE'
                    {
                    match(input,42,FOLLOW_42_in_r_fileStatement1026); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:232: ( ( (f_identifier= r_identifier ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Identifier) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:233: ( (f_identifier= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:233: ( (f_identifier= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:234: (f_identifier= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:234: (f_identifier= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:235: f_identifier= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_fileStatement1039);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:356: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:357: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_fileStatement1050);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((FileStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:465: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:132:466: 'ENDFILE'
            {
            match(input,43,FOLLOW_43_in_r_fileStatement1056); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:135:1: r_foreachStatement returns [CompositeNode cn] : ( 'FOREACH' ) (f_forExpression= r_expression ) ( 'AS' ) (f_identifier= r_identifier ) ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )? (f_sequence= r_sequence ) ( 'ENDFOREACH' ) ;
    public CompositeNode r_foreachStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_forExpression = null;

        CompositeNode f_identifier = null;

        CompositeNode f_iterator = null;

        CompositeNode f_separatorExpression = null;

        CompositeNode f_sequence = null;


         cn = factory.createForeachStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:2: ( ( 'FOREACH' ) (f_forExpression= r_expression ) ( 'AS' ) (f_identifier= r_identifier ) ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )? (f_sequence= r_sequence ) ( 'ENDFOREACH' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:2: ( 'FOREACH' ) (f_forExpression= r_expression ) ( 'AS' ) (f_identifier= r_identifier ) ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )? ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )? (f_sequence= r_sequence ) ( 'ENDFOREACH' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:2: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:3: 'FOREACH'
            {
            match(input,39,FOLLOW_39_in_r_foreachStatement1080); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:50: (f_forExpression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:51: f_forExpression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_foreachStatement1088);
            f_forExpression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_forExpression); ((ForeachStatementNode) cn).setForExpression(f_forExpression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:184: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:185: 'AS'
            {
            match(input,44,FOLLOW_44_in_r_foreachStatement1094); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:227: (f_identifier= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:228: f_identifier= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1102);
            f_identifier=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_identifier); ((ForeachStatementNode) cn).setIdentifier(f_identifier); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:349: ( ( ( 'ITERATOR' ) (f_iterator= r_identifier ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:350: ( ( 'ITERATOR' ) (f_iterator= r_identifier ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:350: ( ( 'ITERATOR' ) (f_iterator= r_identifier ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:351: ( 'ITERATOR' ) (f_iterator= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:351: ( 'ITERATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:352: 'ITERATOR'
                    {
                    match(input,45,FOLLOW_45_in_r_foreachStatement1110); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:400: (f_iterator= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:401: f_iterator= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_foreachStatement1118);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:517: ( ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:518: ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:518: ( ( 'SEPARATOR' ) (f_separatorExpression= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:519: ( 'SEPARATOR' ) (f_separatorExpression= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:519: ( 'SEPARATOR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:520: 'SEPARATOR'
                    {
                    match(input,40,FOLLOW_40_in_r_foreachStatement1129); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:569: (f_separatorExpression= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:570: f_separatorExpression= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_foreachStatement1137);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:730: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:731: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_foreachStatement1148);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((ForeachStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:842: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:138:843: 'ENDFOREACH'
            {
            match(input,46,FOLLOW_46_in_r_foreachStatement1154); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:141:1: r_ifStatement returns [CompositeNode cn] : ( 'IF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) (f_elseIfs= r_elseIfStatement )* (f_else= r_elseStatement )? ( 'ENDIF' ) ;
    public CompositeNode r_ifStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_sequence = null;

        CompositeNode f_elseIfs = null;

        CompositeNode f_else = null;


         cn = factory.createIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:2: ( ( 'IF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) (f_elseIfs= r_elseIfStatement )* (f_else= r_elseStatement )? ( 'ENDIF' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:2: ( 'IF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) (f_elseIfs= r_elseIfStatement )* (f_else= r_elseStatement )? ( 'ENDIF' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:2: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:3: 'IF'
            {
            match(input,47,FOLLOW_47_in_r_ifStatement1178); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:45: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:46: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_ifStatement1186);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((IfStatementNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:162: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:163: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_ifStatement1194);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((IfStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:269: (f_elseIfs= r_elseIfStatement )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:270: f_elseIfs= r_elseIfStatement
            	    {
            	    pushFollow(FOLLOW_r_elseIfStatement_in_r_ifStatement1202);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:386: (f_else= r_elseStatement )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:387: f_else= r_elseStatement
                    {
                    pushFollow(FOLLOW_r_elseStatement_in_r_ifStatement1211);
                    f_else=r_elseStatement();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_else); ((IfStatementNode) cn).setElse(f_else); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:483: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:144:484: 'ENDIF'
            {
            match(input,48,FOLLOW_48_in_r_ifStatement1218); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:147:1: r_elseIfStatement returns [CompositeNode cn] : ( 'ELSEIF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) ;
    public CompositeNode r_elseIfStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_sequence = null;


         cn = factory.createElseIfStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:2: ( ( 'ELSEIF' ) (f_expression= r_expression ) (f_sequence= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:2: ( 'ELSEIF' ) (f_expression= r_expression ) (f_sequence= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:2: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:3: 'ELSEIF'
            {
            match(input,49,FOLLOW_49_in_r_elseIfStatement1242); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:49: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:50: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_elseIfStatement1250);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((ElseIfStatementNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:170: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:150:171: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseIfStatement1258);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:153:1: r_elseStatement returns [CompositeNode cn] : ( 'ELSE' ) (f_sequence= r_sequence ) ;
    public CompositeNode r_elseStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_sequence = null;


         cn = factory.createElseStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:2: ( ( 'ELSE' ) (f_sequence= r_sequence ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:2: ( 'ELSE' ) (f_sequence= r_sequence )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:2: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:3: 'ELSE'
            {
            match(input,50,FOLLOW_50_in_r_elseStatement1282); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:47: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:156:48: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_elseStatement1290);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:159:1: r_letStatement returns [CompositeNode cn] : ( 'LET' ) (f_expression= r_expression ) ( 'AS' ) (f_name= r_identifier ) (f_sequence= r_sequence ) ( 'ENDLET' ) ;
    public CompositeNode r_letStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_name = null;

        CompositeNode f_sequence = null;


         cn = factory.createLetStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:2: ( ( 'LET' ) (f_expression= r_expression ) ( 'AS' ) (f_name= r_identifier ) (f_sequence= r_sequence ) ( 'ENDLET' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:2: ( 'LET' ) (f_expression= r_expression ) ( 'AS' ) (f_name= r_identifier ) (f_sequence= r_sequence ) ( 'ENDLET' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:2: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:3: 'LET'
            {
            match(input,51,FOLLOW_51_in_r_letStatement1314); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:46: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:47: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_letStatement1322);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((LetStatementNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:164: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:165: 'AS'
            {
            match(input,44,FOLLOW_44_in_r_letStatement1328); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:207: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:208: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_letStatement1336);
            f_name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((LetStatementNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:301: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:302: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_letStatement1344);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((LetStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:409: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:162:410: 'ENDLET'
            {
            match(input,52,FOLLOW_52_in_r_letStatement1350); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:165:1: r_protectStatement returns [CompositeNode cn] : ( 'PROTECT' ) ( 'CSTART' ) (f_cstart= r_expression ) ( 'CEND' ) (f_cend= r_expression ) ( 'ID' ) (f_id= r_expression ) ( 'DISABLE' )? (f_sequence= r_sequence ) ( 'ENDPROTECT' ) ;
    public CompositeNode r_protectStatement() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_cstart = null;

        CompositeNode f_cend = null;

        CompositeNode f_id = null;

        CompositeNode f_sequence = null;


         cn = factory.createProtectStatementNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:2: ( ( 'PROTECT' ) ( 'CSTART' ) (f_cstart= r_expression ) ( 'CEND' ) (f_cend= r_expression ) ( 'ID' ) (f_id= r_expression ) ( 'DISABLE' )? (f_sequence= r_sequence ) ( 'ENDPROTECT' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:2: ( 'PROTECT' ) ( 'CSTART' ) (f_cstart= r_expression ) ( 'CEND' ) (f_cend= r_expression ) ( 'ID' ) (f_id= r_expression ) ( 'DISABLE' )? (f_sequence= r_sequence ) ( 'ENDPROTECT' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:2: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:3: 'PROTECT'
            {
            match(input,53,FOLLOW_53_in_r_protectStatement1374); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:50: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:51: 'CSTART'
            {
            match(input,54,FOLLOW_54_in_r_protectStatement1380); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:97: (f_cstart= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:98: f_cstart= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1388);
            f_cstart=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_cstart); ((ProtectStatementNode) cn).setCstart(f_cstart); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:203: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:204: 'CEND'
            {
            match(input,55,FOLLOW_55_in_r_protectStatement1394); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:248: (f_cend= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:249: f_cend= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1402);
            f_cend=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_cend); ((ProtectStatementNode) cn).setCend(f_cend); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:346: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:347: 'ID'
            {
            match(input,56,FOLLOW_56_in_r_protectStatement1408); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:389: (f_id= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:390: f_id= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_protectStatement1416);
            f_id=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_id); ((ProtectStatementNode) cn).setId(f_id); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:479: ( 'DISABLE' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:480: 'DISABLE'
                    {
                    match(input,57,FOLLOW_57_in_r_protectStatement1422); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:528: (f_sequence= r_sequence )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:529: f_sequence= r_sequence
            {
            pushFollow(FOLLOW_r_sequence_in_r_protectStatement1431);
            f_sequence=r_sequence();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_sequence); ((ProtectStatementNode) cn).setSequence(f_sequence); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:640: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:168:641: 'ENDPROTECT'
            {
            match(input,58,FOLLOW_58_in_r_protectStatement1437); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:171:1: r_check returns [CompositeNode cn] : ( 'context' ) (f_type= r_type ) ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (f_message= r_expression ) ( ':' ) (f_constraint= r_expression ) ( ';' ) ;
    public CompositeNode r_check() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_type = null;

        CompositeNode f_ifExpression = null;

        CompositeNode f_message = null;

        CompositeNode f_constraint = null;


         cn = factory.createCheckNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:2: ( ( 'context' ) (f_type= r_type ) ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (f_message= r_expression ) ( ':' ) (f_constraint= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:2: ( 'context' ) (f_type= r_type ) ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )? ( ( ( 'ERROR' ) | ( 'WARNING' ) ) ) (f_message= r_expression ) ( ':' ) (f_constraint= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:2: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:3: 'context'
            {
            match(input,59,FOLLOW_59_in_r_check1461); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:50: (f_type= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:51: f_type= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_check1469);
            f_type=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_type); ((CheckNode) cn).setType(f_type); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:131: ( ( ( 'if' ) (f_ifExpression= r_expression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:132: ( ( 'if' ) (f_ifExpression= r_expression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:132: ( ( 'if' ) (f_ifExpression= r_expression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:133: ( 'if' ) (f_ifExpression= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:133: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:134: 'if'
                    {
                    match(input,60,FOLLOW_60_in_r_check1477); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:176: (f_ifExpression= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:177: f_ifExpression= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_check1485);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:298: ( ( ( 'ERROR' ) | ( 'WARNING' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:299: ( ( 'ERROR' ) | ( 'WARNING' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:299: ( ( 'ERROR' ) | ( 'WARNING' ) )
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
                    new NoViableAltException("174:299: ( ( 'ERROR' ) | ( 'WARNING' ) )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:300: ( 'ERROR' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:300: ( 'ERROR' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:174:301: 'ERROR'
                    {
                    match(input,37,FOLLOW_37_in_r_check1496); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "error"); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:4: ( 'WARNING' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:4: ( 'WARNING' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:5: 'WARNING'
                    {
                    match(input,61,FOLLOW_61_in_r_check1505); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "warning"); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:59: (f_message= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:60: f_message= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1515);
            f_message=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_message); ((CheckNode) cn).setMessage(f_message); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:158: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:159: ':'
            {
            match(input,62,FOLLOW_62_in_r_check1521); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:200: (f_constraint= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:201: f_constraint= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_check1529);
            f_constraint=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_constraint); ((CheckNode) cn).setConstraint(f_constraint); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:311: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:175:312: ';'
            {
            match(input,27,FOLLOW_27_in_r_check1535); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:178:1: r_around returns [CompositeNode cn] : ( 'around' ) (f_unnamed0= r_pointcut ) ( '(' ) ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (f_unnamed2= r_expression ) ( ';' ) ;
    public CompositeNode r_around() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed0 = null;

        CompositeNode f_unnamed1 = null;

        CompositeNode f_unnamed2 = null;


         cn = factory.createAroundNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:2: ( ( 'around' ) (f_unnamed0= r_pointcut ) ( '(' ) ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (f_unnamed2= r_expression ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:2: ( 'around' ) (f_unnamed0= r_pointcut ) ( '(' ) ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )? ( ')' ) ( ':' ) (f_unnamed2= r_expression ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:2: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:3: 'around'
            {
            match(input,63,FOLLOW_63_in_r_around1559); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:49: (f_unnamed0= r_pointcut )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:50: f_unnamed0= r_pointcut
            {
            pushFollow(FOLLOW_r_pointcut_in_r_around1567);
            f_unnamed0=r_pointcut();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed0); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:108: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:109: '('
            {
            match(input,31,FOLLOW_31_in_r_around1573); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:150: ( ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Identifier||LA39_0==33||(LA39_0>=70 && LA39_0<=72)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:151: ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:151: ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )
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
                            new NoViableAltException("181:151: ( (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )? | ( '*' ) )", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:152: (f_unnamed1= r_declaredParameterList ) ( ( ( ',' )? ( '*' ) ) )?
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:152: (f_unnamed1= r_declaredParameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:153: f_unnamed1= r_declaredParameterList
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_around1583);
                            f_unnamed1=r_declaredParameterList();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_unnamed1); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:224: ( ( ( ',' )? ( '*' ) ) )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( ((LA37_0>=32 && LA37_0<=33)) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:225: ( ( ',' )? ( '*' ) )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:225: ( ( ',' )? ( '*' ) )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:226: ( ',' )? ( '*' )
                                    {
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:226: ( ',' )?
                                    int alt36=2;
                                    int LA36_0 = input.LA(1);

                                    if ( (LA36_0==32) ) {
                                        alt36=1;
                                    }
                                    switch (alt36) {
                                        case 1 :
                                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:227: ','
                                            {
                                            match(input,32,FOLLOW_32_in_r_around1591); if (failed) return cn;
                                            if ( backtracking==0 ) {
                                               addLeafNodeForToken(cn, null); 
                                            }

                                            }
                                            break;

                                    }

                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:269: ( '*' )
                                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:181:270: '*'
                                    {
                                    match(input,33,FOLLOW_33_in_r_around1598); if (failed) return cn;
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:4: ( '*' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:4: ( '*' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:5: '*'
                            {
                            match(input,33,FOLLOW_33_in_r_around1610); if (failed) return cn;
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:49: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:50: ')'
            {
            match(input,34,FOLLOW_34_in_r_around1619); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:91: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:92: ':'
            {
            match(input,62,FOLLOW_62_in_r_around1625); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:133: (f_unnamed2= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:134: f_unnamed2= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_around1633);
            f_unnamed2=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed2); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:194: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:182:195: ';'
            {
            match(input,27,FOLLOW_27_in_r_around1639); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:185:1: r_pointcut returns [CompositeNode cn] : ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) ) ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )* ;
    public CompositeNode r_pointcut() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed3 = null;

        CompositeNode f_unnamed4 = null;


         cn = factory.createPointcutNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) ) ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) ) ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:2: ( ( ( '*' ) | (f_unnamed3= r_identifier ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:3: ( ( '*' ) | (f_unnamed3= r_identifier ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:3: ( ( '*' ) | (f_unnamed3= r_identifier ) )
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
                    new NoViableAltException("188:3: ( ( '*' ) | (f_unnamed3= r_identifier ) )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:4: ( '*' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:4: ( '*' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:188:5: '*'
                    {
                    match(input,33,FOLLOW_33_in_r_pointcut1665); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:4: (f_unnamed3= r_identifier )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:4: (f_unnamed3= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:5: f_unnamed3= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut1676);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:67: ( ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Identifier||LA42_0==33||LA42_0==64) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:68: ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:68: ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) )
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
            	            new NoViableAltException("189:68: ( ( '*' ) | (f_unnamed4= r_identifier ) | ( '::' ) )", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:69: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:69: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:189:70: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_pointcut1686); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:4: (f_unnamed4= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:4: (f_unnamed4= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:190:5: f_unnamed4= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_pointcut1697);
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
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:4: ( '::' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:4: ( '::' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:191:5: '::'
            	            {
            	            match(input,64,FOLLOW_64_in_r_pointcut1706); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:194:1: r_extension returns [CompositeNode cn] : ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (f_returnType= r_type )? (f_name= r_identifier ) ( '(' ) (f_paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) ) ( ';' ) ;
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: ( ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (f_returnType= r_type )? (f_name= r_identifier ) ( '(' ) (f_paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) ) ( ';' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )* (f_returnType= r_type )? (f_name= r_identifier ) ( '(' ) (f_paramList= r_declaredParameterList )? ( ')' ) ( ':' ) ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) ) ( ';' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:2: ( ( ( 'private' ) | ( 'cached' ) | ( 'create' ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=65 && LA44_0<=67)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )
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
            	            new NoViableAltException("197:3: ( ( 'private' ) | ( 'cached' ) | ( 'create' ) )", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:4: ( 'private' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:4: ( 'private' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:197:5: 'private'
            	            {
            	            match(input,65,FOLLOW_65_in_r_extension1735); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "private"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:4: ( 'cached' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:4: ( 'cached' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:198:5: 'cached'
            	            {
            	            match(input,66,FOLLOW_66_in_r_extension1744); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, "cached"); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:4: ( 'create' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:4: ( 'create' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:5: 'create'
            	            {
            	            match(input,67,FOLLOW_67_in_r_extension1753); if (failed) return cn;
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:58: (f_returnType= r_type )?
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:59: f_returnType= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension1764);
                    f_returnType=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_returnType); ((ExtensionNode) cn).setReturnType(f_returnType); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:168: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:169: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_extension1773);
            f_name=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_name); ((ExtensionNode) cn).setName(f_name); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:259: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:260: '('
            {
            match(input,31,FOLLOW_31_in_r_extension1779); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:301: (f_paramList= r_declaredParameterList )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Identifier||(LA46_0>=70 && LA46_0<=72)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:302: f_paramList= r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension1787);
                    f_paramList=r_declaredParameterList();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_paramList); ((ExtensionNode) cn).setParamList(f_paramList); 
                    }

                    }
                    break;

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:424: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:425: ')'
            {
            match(input,34,FOLLOW_34_in_r_extension1794); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:466: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:467: ':'
            {
            match(input,62,FOLLOW_62_in_r_extension1800); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:508: ( ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:509: ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:509: ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) )
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
                    new NoViableAltException("199:509: ( ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' ) | (f_extendBody= r_expression ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:510: ( 'JAVA' ) (f_javaReturnType= r_javaType ) ( '.' ) (f_javaName= r_identifier ) ( '(' ) ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:510: ( 'JAVA' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:511: 'JAVA'
                    {
                    match(input,68,FOLLOW_68_in_r_extension1808); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:555: (f_javaReturnType= r_javaType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:556: f_javaReturnType= r_javaType
                    {
                    pushFollow(FOLLOW_r_javaType_in_r_extension1816);
                    f_javaReturnType=r_javaType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_javaReturnType); ((ExtensionNode) cn).setJavaReturnType(f_javaReturnType); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:684: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:685: '.'
                    {
                    match(input,69,FOLLOW_69_in_r_extension1822); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:726: (f_javaName= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:727: f_javaName= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension1830);
                    f_javaName=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_javaName); ((ExtensionNode) cn).setJavaName(f_javaName); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:833: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:834: '('
                    {
                    match(input,31,FOLLOW_31_in_r_extension1836); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:875: ( ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==Identifier) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:876: ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:876: ( (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )* )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:877: (f_unnamed5= r_javaType ) ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )*
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:877: (f_unnamed5= r_javaType )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:878: f_unnamed5= r_javaType
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension1846);
                            f_unnamed5=r_javaType();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_unnamed5); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:936: ( ( ( ',' ) (f_unnamed6= r_javaType ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==32) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:937: ( ( ',' ) (f_unnamed6= r_javaType ) )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:937: ( ( ',' ) (f_unnamed6= r_javaType ) )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:938: ( ',' ) (f_unnamed6= r_javaType )
                            	    {
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:938: ( ',' )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:939: ','
                            	    {
                            	    match(input,32,FOLLOW_32_in_r_extension1854); if (failed) return cn;
                            	    if ( backtracking==0 ) {
                            	       addLeafNodeForToken(cn, null); 
                            	    }

                            	    }

                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:980: (f_unnamed6= r_javaType )
                            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:981: f_unnamed6= r_javaType
                            	    {
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension1862);
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:1045: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:199:1046: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_extension1874); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:4: (f_extendBody= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:4: (f_extendBody= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:5: f_extendBody= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension1885);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:121: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:200:122: ';'
            {
            match(input,27,FOLLOW_27_in_r_extension1893); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:203:1: r_javaType returns [CompositeNode cn] : (f_unnamed7= r_identifier ) ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* ;
    public CompositeNode r_javaType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed7 = null;

        CompositeNode f_unnamed8 = null;


         cn = factory.createJavaTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:2: ( (f_unnamed7= r_identifier ) ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:2: (f_unnamed7= r_identifier ) ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:2: (f_unnamed7= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:3: f_unnamed7= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_javaType1919);
            f_unnamed7=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed7); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:63: ( ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:64: ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:64: ( ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:65: ( '.' ) ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:65: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:66: '.'
            	    {
            	    match(input,69,FOLLOW_69_in_r_javaType1927); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:107: ( ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:108: ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:108: ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
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
            	            new NoViableAltException("206:108: ( (f_unnamed8= r_identifier ) | ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 50, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:109: (f_unnamed8= r_identifier )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:109: (f_unnamed8= r_identifier )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:206:110: f_unnamed8= r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType1937);
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
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:4: ( 'Collection' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:4: ( 'Collection' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:207:5: 'Collection'
            	            {
            	            match(input,70,FOLLOW_70_in_r_javaType1946); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:4: ( 'List' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:4: ( 'List' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:208:5: 'List'
            	            {
            	            match(input,71,FOLLOW_71_in_r_javaType1955); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:209:4: ( 'Set' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:209:4: ( 'Set' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:209:5: 'Set'
            	            {
            	            match(input,72,FOLLOW_72_in_r_javaType1964); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:212:1: r_test_expression returns [CompositeNode cn] : (f_unnamed9= r_expression ) ( EOF ) ;
    public CompositeNode r_test_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed9 = null;


         cn = factory.createTest_expressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:216:2: ( (f_unnamed9= r_expression ) ( EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:216:2: (f_unnamed9= r_expression ) ( EOF )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:216:2: (f_unnamed9= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:216:3: f_unnamed9= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_test_expression2000);
            f_unnamed9=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_unnamed9); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:216:63: ( EOF )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:216:64: EOF
            {
            match(input,EOF,FOLLOW_EOF_in_r_test_expression2006); if (failed) return cn;

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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:219:1: r_expression returns [CompositeNode cn] : ( r_letExpression ) ;
    public CompositeNode r_expression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_letExpression17 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:2: ( ( r_letExpression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:2: ( r_letExpression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:2: ( r_letExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:220:3: r_letExpression
            {
            pushFollow(FOLLOW_r_letExpression_in_r_expression2023);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:223:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression ) | (f_unnamed13= r_castedExpression ) );
    public CompositeNode r_letExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed10 = null;

        CompositeNode f_unnamed11 = null;

        CompositeNode f_unnamed12 = null;

        CompositeNode f_unnamed13 = null;


         cn = factory.createLetExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression ) | (f_unnamed13= r_castedExpression ) )
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
                    new NoViableAltException("223:1: r_letExpression returns [CompositeNode cn] : ( ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression ) | (f_unnamed13= r_castedExpression ) );", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( 'let' ) (f_unnamed10= r_identifier ) ( '=' ) (f_unnamed11= r_castedExpression ) ( ':' ) (f_unnamed12= r_expression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:2: ( 'let' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:3: 'let'
                    {
                    match(input,73,FOLLOW_73_in_r_letExpression2052); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:46: (f_unnamed10= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:47: f_unnamed10= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression2060);
                    f_unnamed10=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed10); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:109: ( '=' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:110: '='
                    {
                    match(input,74,FOLLOW_74_in_r_letExpression2066); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:151: (f_unnamed11= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:152: f_unnamed11= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2074);
                    f_unnamed11=r_castedExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_unnamed11); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:220: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:221: ':'
                    {
                    match(input,62,FOLLOW_62_in_r_letExpression2080); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:262: (f_unnamed12= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:227:263: f_unnamed12= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_letExpression2088);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:4: (f_unnamed13= r_castedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:4: (f_unnamed13= r_castedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:228:5: f_unnamed13= r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression2099);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:231:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) ) | (f_unnamed14= r_chainExpression ) );
    public CompositeNode r_castedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_type = null;

        CompositeNode f_target = null;

        CompositeNode f_unnamed14 = null;


         cn = factory.createCastedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:2: ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) ) | (f_unnamed14= r_chainExpression ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:2: ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:38: ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:39: ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:39: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:40: '('
                    {
                    match(input,31,FOLLOW_31_in_r_castedExpression2139); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:81: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:82: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_castedExpression2147);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((CastedExpressionNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:173: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:174: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_castedExpression2153); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:215: (f_target= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:216: f_target= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2161);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:4: (f_unnamed14= r_chainExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:4: (f_unnamed14= r_chainExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:236:5: f_unnamed14= r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression2173);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:239:1: r_chainExpression returns [CompositeNode cn] : (f_first= r_ifExpression ) ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )* ;
    public CompositeNode r_chainExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createChainExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:2: ( (f_first= r_ifExpression ) ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:2: (f_first= r_ifExpression ) ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:2: (f_first= r_ifExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:3: f_first= r_ifExpression
            {
            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2204);
            f_first=r_ifExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((ChainExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:105: ( ( ( '->' ) (f_nexts= r_ifExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==75) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:106: ( ( '->' ) (f_nexts= r_ifExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:106: ( ( '->' ) (f_nexts= r_ifExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:107: ( '->' ) (f_nexts= r_ifExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:107: ( '->' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:108: '->'
            	    {
            	    match(input,75,FOLLOW_75_in_r_chainExpression2212); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:150: (f_nexts= r_ifExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:243:151: f_nexts= r_ifExpression
            	    {
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression2220);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:246:1: r_ifExpression returns [CompositeNode cn] : ( (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )? | ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )? );
    public CompositeNode r_ifExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_condition0 = null;

        CompositeNode f_then = null;

        CompositeNode f_else = null;

        CompositeNode f_condition1 = null;


         cn = factory.createIfExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:2: ( (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )? | ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )? )
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
                    new NoViableAltException("246:1: r_ifExpression returns [CompositeNode cn] : ( (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )? | ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )? );", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:2: (f_condition0= r_switchExpression ) ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:2: (f_condition0= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:3: f_condition0= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2254);
                    f_condition0=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_condition0); ((IfExpressionNode) cn).setCondition0(f_condition0); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:126: ( ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==76) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:127: ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:127: ( ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:128: ( '?' ) (f_then= r_expression ) ( ':' ) (f_else= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:128: ( '?' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:129: '?'
                            {
                            match(input,76,FOLLOW_76_in_r_ifExpression2262); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:170: (f_then= r_expression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:171: f_then= r_expression
                            {
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression2270);
                            f_then=r_expression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_then); ((IfExpressionNode) cn).setThen(f_then); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:264: ( ':' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:265: ':'
                            {
                            match(input,62,FOLLOW_62_in_r_ifExpression2276); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:306: (f_else= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:250:307: f_else= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2284);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:4: ( 'if' ) (f_condition1= r_expression ) ( 'then' ) (f_then= r_switchExpression ) ( ( ( 'else' ) (f_else= r_switchExpression ) ) )?
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:4: ( 'if' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:5: 'if'
                    {
                    match(input,60,FOLLOW_60_in_r_ifExpression2296); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:47: (f_condition1= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:48: f_condition1= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression2304);
                    f_condition1=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_condition1); ((IfExpressionNode) cn).setCondition1(f_condition1); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:165: ( 'then' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:166: 'then'
                    {
                    match(input,77,FOLLOW_77_in_r_ifExpression2310); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:210: (f_then= r_switchExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:211: f_then= r_switchExpression
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2318);
                    f_then=r_switchExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_then); ((IfExpressionNode) cn).setThen(f_then); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:310: ( ( ( 'else' ) (f_else= r_switchExpression ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==78) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:311: ( ( 'else' ) (f_else= r_switchExpression ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:311: ( ( 'else' ) (f_else= r_switchExpression ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:312: ( 'else' ) (f_else= r_switchExpression )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:312: ( 'else' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:313: 'else'
                            {
                            match(input,78,FOLLOW_78_in_r_ifExpression2326); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:357: (f_else= r_switchExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:251:358: f_else= r_switchExpression
                            {
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression2334);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:254:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' ) | (f_unnamed15= r_orExpression ) );
    public CompositeNode r_switchExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;

        CompositeNode f_cases = null;

        CompositeNode f_default = null;

        CompositeNode f_unnamed15 = null;


         cn = factory.createSwitchExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:2: ( ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' ) | (f_unnamed15= r_orExpression ) )
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
                    new NoViableAltException("254:1: r_switchExpression returns [CompositeNode cn] : ( ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' ) | (f_unnamed15= r_orExpression ) );", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:2: ( 'switch' ) ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )? ( '{' ) (f_cases= r_casePart )* ( 'default' ) ( ':' ) (f_default= r_orExpression ) ( '}' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:2: ( 'switch' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:3: 'switch'
                    {
                    match(input,79,FOLLOW_79_in_r_switchExpression2366); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:49: ( ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==31) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:50: ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:50: ( ( '(' ) (f_expression= r_orExpression ) ( ')' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:51: ( '(' ) (f_expression= r_orExpression ) ( ')' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:51: ( '(' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:52: '('
                            {
                            match(input,31,FOLLOW_31_in_r_switchExpression2374); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:93: (f_expression= r_orExpression )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:94: f_expression= r_orExpression
                            {
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2382);
                            f_expression=r_orExpression();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_expression); ((SwitchExpressionNode) cn).setExpression(f_expression); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:217: ( ')' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:218: ')'
                            {
                            match(input,34,FOLLOW_34_in_r_switchExpression2388); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:262: ( '{' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:263: '{'
                    {
                    match(input,80,FOLLOW_80_in_r_switchExpression2397); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:304: (f_cases= r_casePart )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==83) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:305: f_cases= r_casePart
                    	    {
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression2405);
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:411: ( 'default' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:412: 'default'
                    {
                    match(input,81,FOLLOW_81_in_r_switchExpression2412); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:459: ( ':' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:460: ':'
                    {
                    match(input,62,FOLLOW_62_in_r_switchExpression2418); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:501: (f_default= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:502: f_default= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2426);
                    f_default=r_orExpression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_default); ((SwitchExpressionNode) cn).setDefault(f_default); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:613: ( '}' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:258:614: '}'
                    {
                    match(input,82,FOLLOW_82_in_r_switchExpression2432); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:4: (f_unnamed15= r_orExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:4: (f_unnamed15= r_orExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:259:5: f_unnamed15= r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression2443);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:262:1: r_casePart returns [CompositeNode cn] : ( 'case' ) (f_condition= r_expression ) ( ':' ) (f_expression= r_expression ) ;
    public CompositeNode r_casePart() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_condition = null;

        CompositeNode f_expression = null;


         cn = factory.createCasePartNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:2: ( ( 'case' ) (f_condition= r_expression ) ( ':' ) (f_expression= r_expression ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:2: ( 'case' ) (f_condition= r_expression ) ( ':' ) (f_expression= r_expression )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:2: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:3: 'case'
            {
            match(input,83,FOLLOW_83_in_r_casePart2467); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:47: (f_condition= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:48: f_condition= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2475);
            f_condition=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_condition); ((CasePartNode) cn).setCondition(f_condition); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:157: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:158: ':'
            {
            match(input,62,FOLLOW_62_in_r_casePart2481); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:199: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:265:200: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_casePart2489);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:268:1: r_orExpression returns [CompositeNode cn] : (f_first= r_andExpression ) ( ( ( '||' ) (f_nexts= r_andExpression ) ) )* ;
    public CompositeNode r_orExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createOrExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:2: ( (f_first= r_andExpression ) ( ( ( '||' ) (f_nexts= r_andExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:2: (f_first= r_andExpression ) ( ( ( '||' ) (f_nexts= r_andExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:2: (f_first= r_andExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:3: f_first= r_andExpression
            {
            pushFollow(FOLLOW_r_andExpression_in_r_orExpression2520);
            f_first=r_andExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((OrExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:103: ( ( ( '||' ) (f_nexts= r_andExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==84) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:104: ( ( '||' ) (f_nexts= r_andExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:104: ( ( '||' ) (f_nexts= r_andExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:105: ( '||' ) (f_nexts= r_andExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:105: ( '||' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:106: '||'
            	    {
            	    match(input,84,FOLLOW_84_in_r_orExpression2528); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:148: (f_nexts= r_andExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:272:149: f_nexts= r_andExpression
            	    {
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression2536);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:275:1: r_andExpression returns [CompositeNode cn] : (f_first= r_impliesExpression ) ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )* ;
    public CompositeNode r_andExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createAndExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:2: ( (f_first= r_impliesExpression ) ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:2: (f_first= r_impliesExpression ) ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:2: (f_first= r_impliesExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:3: f_first= r_impliesExpression
            {
            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2570);
            f_first=r_impliesExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((AndExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:108: ( ( ( '&&' ) (f_nexts= r_impliesExpression ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==85) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:109: ( ( '&&' ) (f_nexts= r_impliesExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:109: ( ( '&&' ) (f_nexts= r_impliesExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:110: ( '&&' ) (f_nexts= r_impliesExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:110: ( '&&' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:111: '&&'
            	    {
            	    match(input,85,FOLLOW_85_in_r_andExpression2578); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:153: (f_nexts= r_impliesExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:279:154: f_nexts= r_impliesExpression
            	    {
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression2586);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:282:1: r_impliesExpression returns [CompositeNode cn] : (f_first= r_relationalExpression ) ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )* ;
    public CompositeNode r_impliesExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createImpliesExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:2: ( (f_first= r_relationalExpression ) ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:2: (f_first= r_relationalExpression ) ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:2: (f_first= r_relationalExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:3: f_first= r_relationalExpression
            {
            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2620);
            f_first=r_relationalExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((ImpliesExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:115: ( ( ( 'implies' ) (f_nexts= r_relationalExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==86) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:116: ( ( 'implies' ) (f_nexts= r_relationalExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:116: ( ( 'implies' ) (f_nexts= r_relationalExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:117: ( 'implies' ) (f_nexts= r_relationalExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:117: ( 'implies' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:118: 'implies'
            	    {
            	    match(input,86,FOLLOW_86_in_r_impliesExpression2628); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:165: (f_nexts= r_relationalExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:286:166: f_nexts= r_relationalExpression
            	    {
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression2636);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:289:1: r_relationalExpression returns [CompositeNode cn] : (f_first= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )* ;
    public CompositeNode r_relationalExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createRelationalExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: ( (f_first= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: (f_first= r_additiveExpression ) ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:2: (f_first= r_additiveExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:3: f_first= r_additiveExpression
            {
            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2670);
            f_first=r_additiveExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((RelationalExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:116: ( ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=87 && LA65_0<=92)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:117: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:117: ( ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:118: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) ) (f_nexts= r_additiveExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:118: ( ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:119: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:119: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
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
            	            new NoViableAltException("293:119: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )", 64, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt64) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:120: ( '==' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:120: ( '==' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:293:121: '=='
            	            {
            	            match(input,87,FOLLOW_87_in_r_relationalExpression2680); if (failed) return cn;
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
            	            match(input,88,FOLLOW_88_in_r_relationalExpression2689); if (failed) return cn;
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
            	            match(input,89,FOLLOW_89_in_r_relationalExpression2698); if (failed) return cn;
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
            	            match(input,90,FOLLOW_90_in_r_relationalExpression2707); if (failed) return cn;
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
            	            match(input,91,FOLLOW_91_in_r_relationalExpression2716); if (failed) return cn;
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
            	            match(input,92,FOLLOW_92_in_r_relationalExpression2725); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:48: (f_nexts= r_additiveExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:298:49: f_nexts= r_additiveExpression
            	    {
            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression2735);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:301:1: r_additiveExpression returns [CompositeNode cn] : (f_first= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )* ;
    public CompositeNode r_additiveExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createAdditiveExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: ( (f_first= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: (f_first= r_multiplicativeExpression ) ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:2: (f_first= r_multiplicativeExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:3: f_first= r_multiplicativeExpression
            {
            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2769);
            f_first=r_multiplicativeExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((AdditiveExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:120: ( ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:121: ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:121: ( ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:122: ( ( ( '+' ) | ( '-' ) ) ) (f_nexts= r_multiplicativeExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:122: ( ( ( '+' ) | ( '-' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:123: ( ( '+' ) | ( '-' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:123: ( ( '+' ) | ( '-' ) )
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
            	            new NoViableAltException("305:123: ( ( '+' ) | ( '-' ) )", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:124: ( '+' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:124: ( '+' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:305:125: '+'
            	            {
            	            match(input,93,FOLLOW_93_in_r_additiveExpression2779); if (failed) return cn;
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
            	            match(input,36,FOLLOW_36_in_r_additiveExpression2788); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:48: (f_nexts= r_multiplicativeExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:306:49: f_nexts= r_multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2798);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:309:1: r_multiplicativeExpression returns [CompositeNode cn] : (f_first= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )* ;
    public CompositeNode r_multiplicativeExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_first = null;

        CompositeNode f_nexts = null;


         cn = factory.createMultiplicativeExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:2: ( (f_first= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:2: (f_first= r_unaryExpression ) ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:2: (f_first= r_unaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:3: f_first= r_unaryExpression
            {
            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2832);
            f_first=r_unaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_first); ((MultiplicativeExpressionNode) cn).setFirst(f_first); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:117: ( ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==33||LA69_0==94) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:118: ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:118: ( ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:119: ( ( ( '*' ) | ( '/' ) ) ) (f_nexts= r_unaryExpression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:119: ( ( ( '*' ) | ( '/' ) ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:120: ( ( '*' ) | ( '/' ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:120: ( ( '*' ) | ( '/' ) )
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
            	            new NoViableAltException("313:120: ( ( '*' ) | ( '/' ) )", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:121: ( '*' )
            	            {
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:121: ( '*' )
            	            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:313:122: '*'
            	            {
            	            match(input,33,FOLLOW_33_in_r_multiplicativeExpression2842); if (failed) return cn;
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
            	            match(input,94,FOLLOW_94_in_r_multiplicativeExpression2851); if (failed) return cn;
            	            if ( backtracking==0 ) {
            	               addLeafNodeForToken(cn, null); 
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:48: (f_nexts= r_unaryExpression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:314:49: f_nexts= r_unaryExpression
            	    {
            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2861);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:317:1: r_unaryExpression returns [CompositeNode cn] : ( (f_unnamed16= r_infixExpression ) | ( '!' ) (f_operand= r_infixExpression ) | ( '-' ) (f_operand= r_infixExpression ) );
    public CompositeNode r_unaryExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed16 = null;

        CompositeNode f_operand = null;


         cn = factory.createUnaryExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: ( (f_unnamed16= r_infixExpression ) | ( '!' ) (f_operand= r_infixExpression ) | ( '-' ) (f_operand= r_infixExpression ) )
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
                    new NoViableAltException("317:1: r_unaryExpression returns [CompositeNode cn] : ( (f_unnamed16= r_infixExpression ) | ( '!' ) (f_operand= r_infixExpression ) | ( '-' ) (f_operand= r_infixExpression ) );", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: (f_unnamed16= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:2: (f_unnamed16= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:321:3: f_unnamed16= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2895);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:4: ( '!' ) (f_operand= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:4: ( '!' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:5: '!'
                    {
                    match(input,95,FOLLOW_95_in_r_unaryExpression2904); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:46: (f_operand= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:322:47: f_operand= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2912);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: ( '-' ) (f_operand= r_infixExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:4: ( '-' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:5: '-'
                    {
                    match(input,36,FOLLOW_36_in_r_unaryExpression2921); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:46: (f_operand= r_infixExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:323:47: f_operand= r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression2929);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:326:1: r_infixExpression returns [CompositeNode cn] : (f_target= r_primaryExpression ) ( ( ( '.' ) (f_calls= r_featureCall ) ) )* ;
    public CompositeNode r_infixExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_target = null;

        CompositeNode f_calls = null;


         cn = factory.createInfixExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: ( (f_target= r_primaryExpression ) ( ( ( '.' ) (f_calls= r_featureCall ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: (f_target= r_primaryExpression ) ( ( ( '.' ) (f_calls= r_featureCall ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:2: (f_target= r_primaryExpression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:3: f_target= r_primaryExpression
            {
            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression2960);
            f_target=r_primaryExpression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_target); ((InfixExpressionNode) cn).setTarget(f_target); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:114: ( ( ( '.' ) (f_calls= r_featureCall ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==69) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:115: ( ( '.' ) (f_calls= r_featureCall ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:115: ( ( '.' ) (f_calls= r_featureCall ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:116: ( '.' ) (f_calls= r_featureCall )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:116: ( '.' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:117: '.'
            	    {
            	    match(input,69,FOLLOW_69_in_r_infixExpression2968); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:158: (f_calls= r_featureCall )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:330:159: f_calls= r_featureCall
            	    {
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression2976);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:333:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:2: ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) )
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
                    new NoViableAltException("333:1: r_primaryExpression returns [CompositeNode cn] : ( ( r_stringLiteral ) | ( r_featureCall ) | ( r_booleanLiteral ) | ( r_numberLiteral ) | ( r_nullLiteral ) | ( r_listLiteral ) | ( r_constructorCall ) | ( r_globalVarExpression ) | ( r_paranthesizedExpression ) );", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:2: ( r_stringLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:2: ( r_stringLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:334:3: r_stringLiteral
                    {
                    pushFollow(FOLLOW_r_stringLiteral_in_r_primaryExpression2998);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:4: ( r_featureCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:4: ( r_featureCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:335:5: r_featureCall
                    {
                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression3007);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:4: ( r_booleanLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:4: ( r_booleanLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:336:5: r_booleanLiteral
                    {
                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression3016);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:4: ( r_numberLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:4: ( r_numberLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:337:5: r_numberLiteral
                    {
                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression3025);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:4: ( r_nullLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:4: ( r_nullLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:338:5: r_nullLiteral
                    {
                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression3034);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( r_listLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:4: ( r_listLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:339:5: r_listLiteral
                    {
                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression3043);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:4: ( r_constructorCall )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:4: ( r_constructorCall )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:340:5: r_constructorCall
                    {
                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression3052);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:4: ( r_globalVarExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:4: ( r_globalVarExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:341:5: r_globalVarExpression
                    {
                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression3061);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:4: ( r_paranthesizedExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:4: ( r_paranthesizedExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:342:5: r_paranthesizedExpression
                    {
                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression3070);
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
            match(input,StringLiteral,FOLLOW_StringLiteral_in_r_stringLiteral3094); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:351:1: r_paranthesizedExpression returns [CompositeNode cn] : ( '(' ) (f_expression= r_expression ) ( ')' ) ;
    public CompositeNode r_paranthesizedExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_expression = null;


         cn = factory.createParanthesizedExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:2: ( ( '(' ) (f_expression= r_expression ) ( ')' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:2: ( '(' ) (f_expression= r_expression ) ( ')' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:2: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:3: '('
            {
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression3118); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:44: (f_expression= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:45: f_expression= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression3126);
            f_expression=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_expression); ((ParanthesizedExpressionNode) cn).setExpression(f_expression); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:173: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:354:174: ')'
            {
            match(input,34,FOLLOW_34_in_r_paranthesizedExpression3132); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:357:1: r_globalVarExpression returns [CompositeNode cn] : ( 'GLOBALVAR' ) (f_unnamed17= r_identifier ) ;
    public CompositeNode r_globalVarExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed17 = null;


         cn = factory.createGlobalVarExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:2: ( ( 'GLOBALVAR' ) (f_unnamed17= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:2: ( 'GLOBALVAR' ) (f_unnamed17= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:2: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:3: 'GLOBALVAR'
            {
            match(input,96,FOLLOW_96_in_r_globalVarExpression3156); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:52: (f_unnamed17= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:360:53: f_unnamed17= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression3164);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:363:1: r_featureCall returns [CompositeNode cn] : ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) );
    public CompositeNode r_featureCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed18 = null;

        CompositeNode f_name = null;

        CompositeNode f_paramList = null;

        CompositeNode f_type = null;


         cn = factory.createFeatureCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:366:2: ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) )
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
                        new NoViableAltException("363:1: r_featureCall returns [CompositeNode cn] : ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) );", 74, 2, input);

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
                    new NoViableAltException("363:1: r_featureCall returns [CompositeNode cn] : ( (f_unnamed18= r_collectionExpression ) | (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' ) | (f_type= r_type ) );", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:366:2: (f_unnamed18= r_collectionExpression )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:366:2: (f_unnamed18= r_collectionExpression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:366:3: f_unnamed18= r_collectionExpression
                    {
                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall3190);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:4: (f_name= r_identifier ) ( '(' ) ( ( (f_paramList= r_parameterList ) ) )? ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:4: (f_name= r_identifier )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:5: f_name= r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_featureCall3201);
                    f_name=r_identifier();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_name); ((FeatureCallNode) cn).setName(f_name); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:97: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:98: '('
                    {
                    match(input,31,FOLLOW_31_in_r_featureCall3207); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:139: ( ( (f_paramList= r_parameterList ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=StringLiteral && LA73_0<=Identifier)||LA73_0==31||LA73_0==36||LA73_0==60||(LA73_0>=70 && LA73_0<=73)||(LA73_0>=79 && LA73_0<=80)||(LA73_0>=95 && LA73_0<=109)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:140: ( (f_paramList= r_parameterList ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:140: ( (f_paramList= r_parameterList ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:141: (f_paramList= r_parameterList )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:141: (f_paramList= r_parameterList )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:142: f_paramList= r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall3217);
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

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:260: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:367:261: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_featureCall3226); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:4: (f_type= r_type )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:4: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:368:5: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_featureCall3237);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:371:1: r_listLiteral returns [CompositeNode cn] : ( '{' ) ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )? ( '}' ) ;
    public CompositeNode r_listLiteral() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_elements = null;


         cn = factory.createListLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:2: ( ( '{' ) ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )? ( '}' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:2: ( '{' ) ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )? ( '}' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:2: ( '{' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:3: '{'
            {
            match(input,80,FOLLOW_80_in_r_listLiteral3261); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:44: ( ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=StringLiteral && LA76_0<=Identifier)||LA76_0==31||LA76_0==36||LA76_0==60||(LA76_0>=70 && LA76_0<=73)||(LA76_0>=79 && LA76_0<=80)||(LA76_0>=95 && LA76_0<=109)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:45: ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:45: ( (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )* )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:46: (f_elements= r_expression ) ( ( ( ',' ) (f_elements= r_expression ) ) )*
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:46: (f_elements= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:47: f_elements= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral3271);
                    f_elements=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_elements); ((ListLiteralNode) cn).getElements().add(f_elements); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:161: ( ( ( ',' ) (f_elements= r_expression ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==32) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:162: ( ( ',' ) (f_elements= r_expression ) )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:162: ( ( ',' ) (f_elements= r_expression ) )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:163: ( ',' ) (f_elements= r_expression )
                    	    {
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:163: ( ',' )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:164: ','
                    	    {
                    	    match(input,32,FOLLOW_32_in_r_listLiteral3279); if (failed) return cn;
                    	    if ( backtracking==0 ) {
                    	       addLeafNodeForToken(cn, null); 
                    	    }

                    	    }

                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:205: (f_elements= r_expression )
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:206: f_elements= r_expression
                    	    {
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral3287);
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:326: ( '}' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:374:327: '}'
            {
            match(input,82,FOLLOW_82_in_r_listLiteral3299); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:377:1: r_constructorCall returns [CompositeNode cn] : ( 'new' ) (f_unnamed19= r_simpleType ) ;
    public CompositeNode r_constructorCall() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_unnamed19 = null;


         cn = factory.createConstructorCallNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:380:2: ( ( 'new' ) (f_unnamed19= r_simpleType ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:380:2: ( 'new' ) (f_unnamed19= r_simpleType )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:380:2: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:380:3: 'new'
            {
            match(input,97,FOLLOW_97_in_r_constructorCall3323); if (failed) return cn;
            if ( backtracking==0 ) {
               addLeafNodeForToken(cn, null); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:380:46: (f_unnamed19= r_simpleType )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:380:47: f_unnamed19= r_simpleType
            {
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall3331);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:383:1: r_booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );
    public CompositeNode r_booleanLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createBooleanLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:386:2: ( ( 'false' ) | ( 'true' ) )
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
                    new NoViableAltException("383:1: r_booleanLiteral returns [CompositeNode cn] : ( ( 'false' ) | ( 'true' ) );", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:386:2: ( 'false' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:386:2: ( 'false' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:386:3: 'false'
                    {
                    match(input,98,FOLLOW_98_in_r_booleanLiteral3355); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:4: ( 'true' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:4: ( 'true' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:387:5: 'true'
                    {
                    match(input,99,FOLLOW_99_in_r_booleanLiteral3364); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:390:1: r_nullLiteral returns [CompositeNode cn] : ( 'null' ) ;
    public CompositeNode r_nullLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNullLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:393:2: ( ( 'null' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:393:2: ( 'null' )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:393:2: ( 'null' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:393:3: 'null'
            {
            match(input,100,FOLLOW_100_in_r_nullLiteral3388); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:396:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );
    public CompositeNode r_numberLiteral() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createNumberLiteralNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:2: ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) )
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
                            new NoViableAltException("396:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 78, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA78_1==EOF||LA78_1==TEXT||LA78_1==Identifier||LA78_1==27||(LA78_1>=32 && LA78_1<=34)||(LA78_1>=36 && LA78_1<=37)||LA78_1==40||LA78_1==42||LA78_1==44||(LA78_1>=55 && LA78_1<=57)||(LA78_1>=61 && LA78_1<=62)||(LA78_1>=75 && LA78_1<=78)||(LA78_1>=81 && LA78_1<=94)) ) {
                    alt78=1;
                }
                else {
                    if (backtracking>0) {failed=true; return cn;}
                    NoViableAltException nvae =
                        new NoViableAltException("396:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return cn;}
                NoViableAltException nvae =
                    new NoViableAltException("396:1: r_numberLiteral returns [CompositeNode cn] : ( ( IntLiteral ) | ( IntLiteral ) ( '.' ) ( IntLiteral ) );", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:2: ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:2: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:399:3: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3412); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:4: ( IntLiteral ) ( '.' ) ( IntLiteral )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:4: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:5: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3421); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:53: ( '.' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:54: '.'
                    {
                    match(input,69,FOLLOW_69_in_r_numberLiteral3427); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:95: ( IntLiteral )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:400:96: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral3433); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:403:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' ) );
    public CompositeNode r_collectionExpression() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_type = null;

        CompositeNode f_variable = null;

        CompositeNode f_expression = null;


         cn = factory.createCollectionExpressionNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:2: ( ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' ) )
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
                    new NoViableAltException("403:1: r_collectionExpression returns [CompositeNode cn] : ( ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' ) | ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' ) );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:2: ( 'typeSelect' ) ( '(' ) (f_type= r_type ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:2: ( 'typeSelect' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:3: 'typeSelect'
                    {
                    match(input,101,FOLLOW_101_in_r_collectionExpression3457); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:54: '('
                    {
                    match(input,31,FOLLOW_31_in_r_collectionExpression3463); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:95: (f_type= r_type )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:96: f_type= r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression3471);
                    f_type=r_type();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_type); ((CollectionExpressionNode) cn).setType(f_type); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:191: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:406:192: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3477); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) ) ( '(' ) ( ( (f_variable= r_identifier ) ( '|' ) ) )? (f_expression= r_expression ) ( ')' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:4: ( ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )
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
                            new NoViableAltException("407:5: ( ( 'collect' ) | ( 'select' ) | ( 'selectFirst' ) | ( 'reject' ) | ( 'exists' ) | ( 'notExists' ) | ( 'sortBy' ) | ( 'forAll' ) )", 79, 0, input);

                        throw nvae;
                    }

                    switch (alt79) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:6: ( 'collect' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:6: ( 'collect' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:407:7: 'collect'
                            {
                            match(input,102,FOLLOW_102_in_r_collectionExpression3488); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:4: ( 'select' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:4: ( 'select' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:408:5: 'select'
                            {
                            match(input,103,FOLLOW_103_in_r_collectionExpression3497); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:409:4: ( 'selectFirst' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:409:4: ( 'selectFirst' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:409:5: 'selectFirst'
                            {
                            match(input,104,FOLLOW_104_in_r_collectionExpression3506); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:410:4: ( 'reject' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:410:4: ( 'reject' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:410:5: 'reject'
                            {
                            match(input,105,FOLLOW_105_in_r_collectionExpression3515); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:411:4: ( 'exists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:411:4: ( 'exists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:411:5: 'exists'
                            {
                            match(input,106,FOLLOW_106_in_r_collectionExpression3524); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 6 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:412:4: ( 'notExists' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:412:4: ( 'notExists' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:412:5: 'notExists'
                            {
                            match(input,107,FOLLOW_107_in_r_collectionExpression3533); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 7 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:413:4: ( 'sortBy' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:413:4: ( 'sortBy' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:413:5: 'sortBy'
                            {
                            match(input,108,FOLLOW_108_in_r_collectionExpression3542); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;
                        case 8 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:4: ( 'forAll' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:4: ( 'forAll' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:5: 'forAll'
                            {
                            match(input,109,FOLLOW_109_in_r_collectionExpression3551); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }
                            break;

                    }


                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:53: ( '(' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:54: '('
                    {
                    match(input,31,FOLLOW_31_in_r_collectionExpression3559); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:95: ( ( (f_variable= r_identifier ) ( '|' ) ) )?
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
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:96: ( (f_variable= r_identifier ) ( '|' ) )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:96: ( (f_variable= r_identifier ) ( '|' ) )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:97: (f_variable= r_identifier ) ( '|' )
                            {
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:97: (f_variable= r_identifier )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:98: f_variable= r_identifier
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression3569);
                            f_variable=r_identifier();
                            _fsp--;
                            if (failed) return cn;
                            if ( backtracking==0 ) {
                               addToChildren(cn, f_variable); ((CollectionExpressionNode) cn).setVariable(f_variable); 
                            }

                            }

                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:215: ( '|' )
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:216: '|'
                            {
                            match(input,110,FOLLOW_110_in_r_collectionExpression3575); if (failed) return cn;
                            if ( backtracking==0 ) {
                               addLeafNodeForToken(cn, null); 
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:260: (f_expression= r_expression )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:261: f_expression= r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression3586);
                    f_expression=r_expression();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_expression); ((CollectionExpressionNode) cn).setExpression(f_expression); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:386: ( ')' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:414:387: ')'
                    {
                    match(input,34,FOLLOW_34_in_r_collectionExpression3592); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:417:1: r_declaredParameterList returns [CompositeNode cn] : (f_params= r_declaredParameter ) ( ( ( ',' ) (f_params= r_declaredParameter ) ) )* ;
    public CompositeNode r_declaredParameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_params = null;


         cn = factory.createDeclaredParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:2: ( (f_params= r_declaredParameter ) ( ( ( ',' ) (f_params= r_declaredParameter ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:2: (f_params= r_declaredParameter ) ( ( ( ',' ) (f_params= r_declaredParameter ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:2: (f_params= r_declaredParameter )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:3: f_params= r_declaredParameter
            {
            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3618);
            f_params=r_declaredParameter();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_params); ((DeclaredParameterListNode) cn).getParams().add(f_params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:126: ( ( ( ',' ) (f_params= r_declaredParameter ) ) )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:127: ( ( ',' ) (f_params= r_declaredParameter ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:127: ( ( ',' ) (f_params= r_declaredParameter ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:128: ( ',' ) (f_params= r_declaredParameter )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:128: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:129: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_declaredParameterList3626); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:170: (f_params= r_declaredParameter )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:420:171: f_params= r_declaredParameter
            	    {
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList3634);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:423:1: r_declaredParameter returns [CompositeNode cn] : (f_ptype= r_type ) (f_name= r_identifier ) ;
    public CompositeNode r_declaredParameter() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_ptype = null;

        CompositeNode f_name = null;


         cn = factory.createDeclaredParameterNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:426:2: ( (f_ptype= r_type ) (f_name= r_identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:426:2: (f_ptype= r_type ) (f_name= r_identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:426:2: (f_ptype= r_type )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:426:3: f_ptype= r_type
            {
            pushFollow(FOLLOW_r_type_in_r_declaredParameter3663);
            f_ptype=r_type();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_ptype); ((DeclaredParameterNode) cn).setPtype(f_ptype); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:426:99: (f_name= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:426:100: f_name= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter3671);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:429:1: r_parameterList returns [CompositeNode cn] : (f_params= r_expression ) ( ( ( ',' ) (f_params= r_expression ) ) )* ;
    public CompositeNode r_parameterList() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_params = null;


         cn = factory.createParameterListNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:2: ( (f_params= r_expression ) ( ( ( ',' ) (f_params= r_expression ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:2: (f_params= r_expression ) ( ( ( ',' ) (f_params= r_expression ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:2: (f_params= r_expression )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:3: f_params= r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_parameterList3697);
            f_params=r_expression();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_params); ((ParameterListNode) cn).getParams().add(f_params); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:111: ( ( ( ',' ) (f_params= r_expression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==32) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:112: ( ( ',' ) (f_params= r_expression ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:112: ( ( ',' ) (f_params= r_expression ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:113: ( ',' ) (f_params= r_expression )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:113: ( ',' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:114: ','
            	    {
            	    match(input,32,FOLLOW_32_in_r_parameterList3705); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:155: (f_params= r_expression )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:432:156: f_params= r_expression
            	    {
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList3713);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:435:1: r_type returns [CompositeNode cn] : ( ( r_collectionType ) | ( r_simpleType ) );
    public CompositeNode r_type() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode r_collectionType27 = null;

        CompositeNode r_simpleType28 = null;


        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:436:2: ( ( r_collectionType ) | ( r_simpleType ) )
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
                    new NoViableAltException("435:1: r_type returns [CompositeNode cn] : ( ( r_collectionType ) | ( r_simpleType ) );", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:436:2: ( r_collectionType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:436:2: ( r_collectionType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:436:3: r_collectionType
                    {
                    pushFollow(FOLLOW_r_collectionType_in_r_type3735);
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:4: ( r_simpleType )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:4: ( r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:437:5: r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_type3744);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:440:1: r_collectionType returns [CompositeNode cn] : ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )? ;
    public CompositeNode r_collectionType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_elementType = null;


         cn = factory.createCollectionTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:2: ( ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) ) ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )?
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:2: ( ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )
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
                    new NoViableAltException("443:3: ( ( 'Collection' ) | ( 'List' ) | ( 'Set' ) )", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:4: ( 'Collection' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:4: ( 'Collection' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:443:5: 'Collection'
                    {
                    match(input,70,FOLLOW_70_in_r_collectionType3770); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "collectionType"); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:4: ( 'List' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:4: ( 'List' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:444:5: 'List'
                    {
                    match(input,71,FOLLOW_71_in_r_collectionType3779); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "collectionType"); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:4: ( 'Set' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:4: ( 'Set' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:5: 'Set'
                    {
                    match(input,72,FOLLOW_72_in_r_collectionType3788); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, "collectionType"); 
                    }

                    }


                    }
                    break;

            }


            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:62: ( ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==111) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:63: ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:63: ( ( '[' ) (f_elementType= r_simpleType ) ( ']' ) )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:64: ( '[' ) (f_elementType= r_simpleType ) ( ']' )
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:64: ( '[' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:65: '['
                    {
                    match(input,111,FOLLOW_111_in_r_collectionType3798); if (failed) return cn;
                    if ( backtracking==0 ) {
                       addLeafNodeForToken(cn, null); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:106: (f_elementType= r_simpleType )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:107: f_elementType= r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType3806);
                    f_elementType=r_simpleType();
                    _fsp--;
                    if (failed) return cn;
                    if ( backtracking==0 ) {
                       addToChildren(cn, f_elementType); ((CollectionTypeNode) cn).setElementType(f_elementType); 
                    }

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:230: ( ']' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:445:231: ']'
                    {
                    match(input,112,FOLLOW_112_in_r_collectionType3812); if (failed) return cn;
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:448:1: r_simpleType returns [CompositeNode cn] : (f_names= r_identifier ) ( ( ( '::' ) (f_names= r_identifier ) ) )* ;
    public CompositeNode r_simpleType() throws RecognitionException {
        CompositeNode cn = null;

        CompositeNode f_names = null;


         cn = factory.createSimpleTypeNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:2: ( (f_names= r_identifier ) ( ( ( '::' ) (f_names= r_identifier ) ) )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:2: (f_names= r_identifier ) ( ( ( '::' ) (f_names= r_identifier ) ) )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:2: (f_names= r_identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:3: f_names= r_identifier
            {
            pushFollow(FOLLOW_r_identifier_in_r_simpleType3841);
            f_names=r_identifier();
            _fsp--;
            if (failed) return cn;
            if ( backtracking==0 ) {
               addToChildren(cn, f_names); ((SimpleTypeNode) cn).getNames().add(f_names); 
            }

            }

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:104: ( ( ( '::' ) (f_names= r_identifier ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==64) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:105: ( ( '::' ) (f_names= r_identifier ) )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:105: ( ( '::' ) (f_names= r_identifier ) )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:106: ( '::' ) (f_names= r_identifier )
            	    {
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:106: ( '::' )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:107: '::'
            	    {
            	    match(input,64,FOLLOW_64_in_r_simpleType3849); if (failed) return cn;
            	    if ( backtracking==0 ) {
            	       addLeafNodeForToken(cn, null); 
            	    }

            	    }

            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:149: (f_names= r_identifier )
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:451:150: f_names= r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType3857);
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
    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:454:1: r_identifier returns [CompositeNode cn] : ( Identifier ) ;
    public CompositeNode r_identifier() throws RecognitionException {
        CompositeNode cn = null;

         cn = factory.createIdentifierNode();
        	    
        try {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:457:2: ( ( Identifier ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:457:2: ( Identifier )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:457:2: ( Identifier )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:457:3: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier3884); if (failed) return cn;
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
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:2: ( '(' r_type ')' r_chainExpression )
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:235:3: '(' r_type ')' r_chainExpression
        {
        match(input,31,FOLLOW_31_in_synpred12128); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred12130);
        r_type();
        _fsp--;
        if (failed) return ;
        match(input,34,FOLLOW_34_in_synpred12132); if (failed) return ;
        pushFollow(FOLLOW_r_chainExpression_in_synpred12134);
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
            return "231:1: r_castedExpression returns [CompositeNode cn] : ( ( '(' r_type ')' r_chainExpression )=> ( ( '(' ) (f_type= r_type ) ( ')' ) (f_target= r_chainExpression ) ) | (f_unnamed14= r_chainExpression ) );";
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
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file75 = new BitSet(new long[]{0x8800000024002010L,0x00000000000001CEL});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file88 = new BitSet(new long[]{0x8800000000002010L,0x00000000000001CEL});
    public static final BitSet FOLLOW_EOF_in_r_file97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_import_in_r_nsImport114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extensionImport_in_r_nsImport123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_import149 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_r_import155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_import163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_import169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_r_import180 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_import188 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_import194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_extensionImport220 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extensionImport226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_extensionImport234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_extensionImport240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_r_extensionImport251 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_extensionImport259 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_30_in_r_extensionImport265 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_extensionImport272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definition_in_r_abstractDeclaration318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definitionAround_in_r_abstractDeclaration327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definition351 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_r_definition357 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_definition365 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definition373 = new BitSet(new long[]{0x0000000600002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definition383 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definition391 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definition398 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definition410 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definition419 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definition428 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_definition436 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definition444 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_r_definition450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definition456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definitionAround480 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_r_definitionAround486 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_definitionAround494 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definitionAround502 = new BitSet(new long[]{0x0000000600002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definitionAround512 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definitionAround520 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround527 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround539 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definitionAround548 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definitionAround557 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_definitionAround565 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definitionAround573 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_r_definitionAround579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definitionAround585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence611 = new BitSet(new long[]{0x102882F080003802L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_statement_in_r_sequence621 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence629 = new BitSet(new long[]{0x102882F080003802L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_simpleStatement_in_r_statement651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_fileStatement_in_r_statement660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_foreachStatement_in_r_statement669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifStatement_in_r_statement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letStatement_in_r_statement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_protectStatement_in_r_statement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence727 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence737 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_r_text764 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_r_text771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_errorStatement_in_r_simpleStatement790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expandStatement_in_r_simpleStatement799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expressionStmt_in_r_simpleStatement808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_r_errorStatement832 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_errorStatement840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_r_expandStatement864 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_expandStatement872 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_r_expandStatement880 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_expandStatement888 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_expandStatement894 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_r_expandStatement907 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_expandStatement928 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement936 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_r_expandStatement944 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_expressionStmt986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_fileStatement1010 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_fileStatement1018 = new BitSet(new long[]{0x0000041000002400L});
    public static final BitSet FOLLOW_42_in_r_fileStatement1026 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_r_identifier_in_r_fileStatement1039 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_fileStatement1050 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_fileStatement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_foreachStatement1080 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1088 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_r_foreachStatement1094 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1102 = new BitSet(new long[]{0x0000211000000400L});
    public static final BitSet FOLLOW_45_in_r_foreachStatement1110 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement1118 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_r_foreachStatement1129 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement1137 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_foreachStatement1148 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_r_foreachStatement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_r_ifStatement1178 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifStatement1186 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_ifStatement1194 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_r_elseIfStatement_in_r_ifStatement1202 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_r_elseStatement_in_r_ifStatement1211 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_r_ifStatement1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_r_elseIfStatement1242 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_elseIfStatement1250 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseIfStatement1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_elseStatement1282 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseStatement1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_r_letStatement1314 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_letStatement1322 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_r_letStatement1328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letStatement1336 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_letStatement1344 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_r_letStatement1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_r_protectStatement1374 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_r_protectStatement1380 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1388 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_r_protectStatement1394 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1402 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_r_protectStatement1408 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement1416 = new BitSet(new long[]{0x0200001000000400L});
    public static final BitSet FOLLOW_57_in_r_protectStatement1422 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_protectStatement1431 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_r_protectStatement1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_r_check1461 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_check1469 = new BitSet(new long[]{0x3000002000000000L});
    public static final BitSet FOLLOW_60_in_r_check1477 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1485 = new BitSet(new long[]{0x2000002000000000L});
    public static final BitSet FOLLOW_37_in_r_check1496 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_61_in_r_check1505 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1515 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_check1521 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_check1529 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_check1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_r_around1559 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around1567 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around1573 = new BitSet(new long[]{0x0000000600002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around1583 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_around1591 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_around1598 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_around1610 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_around1619 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_around1625 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_around1633 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_around1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_r_pointcut1665 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1676 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_33_in_r_pointcut1686 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut1697 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_r_pointcut1706 = new BitSet(new long[]{0x0000000200002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_65_in_r_extension1735 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001CEL});
    public static final BitSet FOLLOW_66_in_r_extension1744 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001CEL});
    public static final BitSet FOLLOW_67_in_r_extension1753 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001CEL});
    public static final BitSet FOLLOW_r_type_in_r_extension1764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1773 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1779 = new BitSet(new long[]{0x0000000400002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension1787 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_extension1794 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_extension1800 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183D0L});
    public static final BitSet FOLLOW_68_in_r_extension1808 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_extension1822 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension1830 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension1836 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1846 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_r_extension1854 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension1862 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_r_extension1874 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension1885 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_r_extension1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1919 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_javaType1927 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType1937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_70_in_r_javaType1946 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_71_in_r_javaType1955 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_72_in_r_javaType1964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_r_expression_in_r_test_expression2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_r_test_expression2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_r_letExpression2052 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_r_letExpression2066 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2074 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_letExpression2080 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_castedExpression2139 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression2147 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_castedExpression2153 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_r_chainExpression2212 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression2220 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_r_ifExpression2262 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2270 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_ifExpression2276 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_r_ifExpression2296 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_r_ifExpression2310 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_r_ifExpression2326 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_r_switchExpression2366 = new BitSet(new long[]{0x0000000080000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression2374 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2382 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_switchExpression2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_r_switchExpression2397 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression2405 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
    public static final BitSet FOLLOW_81_in_r_switchExpression2412 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_switchExpression2418 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_r_switchExpression2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_r_casePart2467 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2475 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_r_casePart2481 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_r_orExpression2528 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression2536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_r_andExpression2578 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression2586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_r_impliesExpression2628 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression2636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2670 = new BitSet(new long[]{0x0000000000000002L,0x000000001F800000L});
    public static final BitSet FOLLOW_87_in_r_relationalExpression2680 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_88_in_r_relationalExpression2689 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_89_in_r_relationalExpression2698 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_90_in_r_relationalExpression2707 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_91_in_r_relationalExpression2716 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_92_in_r_relationalExpression2725 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression2735 = new BitSet(new long[]{0x0000000000000002L,0x000000001F800000L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2769 = new BitSet(new long[]{0x0000001000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_r_additiveExpression2779 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_36_in_r_additiveExpression2788 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression2798 = new BitSet(new long[]{0x0000001000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2832 = new BitSet(new long[]{0x0000000200000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_33_in_r_multiplicativeExpression2842 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_94_in_r_multiplicativeExpression2851 = new BitSet(new long[]{0x0000001080003800L,0x00003FFF800101C0L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression2861 = new BitSet(new long[]{0x0000000200000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_r_unaryExpression2904 = new BitSet(new long[]{0x0000000080003800L,0x00003FFF000101C0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_r_unaryExpression2921 = new BitSet(new long[]{0x0000000080003800L,0x00003FFF000101C0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression2960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_infixExpression2968 = new BitSet(new long[]{0x0000000000002000L,0x00003FE0000001C0L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression2976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_r_stringLiteral_in_r_primaryExpression2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_r_stringLiteral3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression3118 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression3126 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_paranthesizedExpression3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_r_globalVarExpression3156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall3201 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall3207 = new BitSet(new long[]{0x1000001480003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall3217 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_featureCall3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_r_listLiteral3261 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800583C0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3271 = new BitSet(new long[]{0x0000000100000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_32_in_r_listLiteral3279 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral3287 = new BitSet(new long[]{0x0000000100000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_r_listLiteral3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_r_constructorCall3323 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_r_booleanLiteral3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_r_booleanLiteral3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_r_nullLiteral3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_r_numberLiteral3427 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_r_collectionExpression3457 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3463 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression3471 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_r_collectionExpression3488 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_103_in_r_collectionExpression3497 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_104_in_r_collectionExpression3506 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_105_in_r_collectionExpression3515 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_106_in_r_collectionExpression3524 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_107_in_r_collectionExpression3533 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_108_in_r_collectionExpression3542 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_109_in_r_collectionExpression3551 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression3559 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression3569 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_r_collectionExpression3575 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression3586 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3618 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_declaredParameterList3626 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList3634 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter3663 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3697 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_parameterList3705 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800183C0L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList3713 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_r_collectionType3770 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_71_in_r_collectionType3779 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_72_in_r_collectionType3788 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_r_collectionType3798 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType3806 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_r_collectionType3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_r_simpleType3849 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType3857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred12128 = new BitSet(new long[]{0x0000000000002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_r_type_in_synpred12130 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred12132 = new BitSet(new long[]{0x1000001080003800L,0x00003FFF800181C0L});
    public static final BitSet FOLLOW_r_chainExpression_in_synpred12134 = new BitSet(new long[]{0x0000000000000002L});

}