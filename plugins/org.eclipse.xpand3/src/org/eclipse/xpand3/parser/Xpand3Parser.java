// $ANTLR 3.0 src/org/eclipse/xpand3/parser/Xpand3.g 2008-02-28 09:34:54
 	
package org.eclipse.xpand3.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Xpand3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LG", "RG", "DEFINE", "ENDDEFINE", "AROUND", "ENDAROUND", "TEXT", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "REM_COMMENT_OUT", "REM_COMMENT", "'IMPORT'", "'EXTENSION'", "'import'", "';'", "'extension'", "'reexport'", "'('", "','", "'*'", "')'", "'FOR'", "'-'", "'ERROR'", "'EXPAND'", "'FOREACH'", "'SEPARATOR'", "'FILE'", "'ENDFILE'", "'AS'", "'ITERATOR'", "'ENDFOREACH'", "'IF'", "'ENDIF'", "'ELSEIF'", "'ELSE'", "'LET'", "'ENDLET'", "'PROTECT'", "'CSTART'", "'CEND'", "'ID'", "'DISABLE'", "'ENDPROTECT'", "'context'", "'if'", "'WARNING'", "':'", "'around'", "'::'", "'private'", "'cached'", "'create'", "'JAVA'", "'.'", "'Collection'", "'List'", "'Set'", "'let'", "'='", "'->'", "'?'", "'then'", "'else'", "'switch'", "'default'", "'}'", "'case'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'/'", "'!'", "'GLOBALVAR'", "'['", "']'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'"
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

        public Xpand3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[58+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "src/org/eclipse/xpand3/parser/Xpand3.g"; }


    public static class r_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_file
    // src/org/eclipse/xpand3/parser/Xpand3.g:19:1: r_file : ( r_nsImport )* ( r_abstractDeclaration )* EOF ;
    public r_file_return r_file() throws RecognitionException {
        r_file_return retval = new r_file_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF3=null;
        r_nsImport_return r_nsImport1 = null;

        r_abstractDeclaration_return r_abstractDeclaration2 = null;


        Object EOF3_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:20:2: ( ( r_nsImport )* ( r_abstractDeclaration )* EOF )
            // src/org/eclipse/xpand3/parser/Xpand3.g:20:2: ( r_nsImport )* ( r_abstractDeclaration )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:20:2: ( r_nsImport )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:20:3: r_nsImport
            	    {
            	    pushFollow(FOLLOW_r_nsImport_in_r_file50);
            	    r_nsImport1=r_nsImport();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_nsImport1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:21:2: ( r_abstractDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==58||LA2_0==62||(LA2_0>=64 && LA2_0<=66)||(LA2_0>=69 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:21:3: r_abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_r_abstractDeclaration_in_r_file56);
            	    r_abstractDeclaration2=r_abstractDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_abstractDeclaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_r_file63); if (failed) return retval;
            if ( backtracking==0 ) {
            EOF3_tree = (Object)adaptor.create(EOF3);
            adaptor.addChild(root_0, EOF3_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_file

    public static class r_nsImport_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_nsImport
    // src/org/eclipse/xpand3/parser/Xpand3.g:25:1: r_nsImport : ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );
    public r_nsImport_return r_nsImport() throws RecognitionException {
        r_nsImport_return retval = new r_nsImport_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LG4=null;
        Token string_literal5=null;
        Token RG7=null;
        Token LG8=null;
        Token string_literal9=null;
        Token RG11=null;
        Token string_literal12=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token string_literal17=null;
        Token char_literal18=null;
        r_type_return r_type6 = null;

        r_type_return r_type10 = null;

        r_type_return r_type13 = null;

        r_type_return r_type16 = null;


        Object LG4_tree=null;
        Object string_literal5_tree=null;
        Object RG7_tree=null;
        Object LG8_tree=null;
        Object string_literal9_tree=null;
        Object RG11_tree=null;
        Object string_literal12_tree=null;
        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object string_literal17_tree=null;
        Object char_literal18_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:26:2: ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' )
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
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("25:1: r_nsImport : ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );", 4, 1, input);

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
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("25:1: r_nsImport : ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:26:2: LG 'IMPORT' r_type RG
                    {
                    root_0 = (Object)adaptor.nil();

                    LG4=(Token)input.LT(1);
                    match(input,LG,FOLLOW_LG_in_r_nsImport73); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LG4_tree = (Object)adaptor.create(LG4);
                    adaptor.addChild(root_0, LG4_tree);
                    }
                    string_literal5=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_r_nsImport75); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal5_tree = (Object)adaptor.create(string_literal5);
                    adaptor.addChild(root_0, string_literal5_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport77);
                    r_type6=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type6.getTree());
                    RG7=(Token)input.LT(1);
                    match(input,RG,FOLLOW_RG_in_r_nsImport79); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RG7_tree = (Object)adaptor.create(RG7);
                    adaptor.addChild(root_0, RG7_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:27:2: LG 'EXTENSION' r_type RG
                    {
                    root_0 = (Object)adaptor.nil();

                    LG8=(Token)input.LT(1);
                    match(input,LG,FOLLOW_LG_in_r_nsImport84); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LG8_tree = (Object)adaptor.create(LG8);
                    adaptor.addChild(root_0, LG8_tree);
                    }
                    string_literal9=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_r_nsImport86); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal9_tree = (Object)adaptor.create(string_literal9);
                    adaptor.addChild(root_0, string_literal9_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport88);
                    r_type10=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type10.getTree());
                    RG11=(Token)input.LT(1);
                    match(input,RG,FOLLOW_RG_in_r_nsImport90); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RG11_tree = (Object)adaptor.create(RG11);
                    adaptor.addChild(root_0, RG11_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:28:2: 'import' r_type ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal12=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_r_nsImport95); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal12_tree = (Object)adaptor.create(string_literal12);
                    adaptor.addChild(root_0, string_literal12_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport97);
                    r_type13=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type13.getTree());
                    char_literal14=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_r_nsImport100); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal14_tree = (Object)adaptor.create(char_literal14);
                    adaptor.addChild(root_0, char_literal14_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:29:2: 'extension' r_type ( 'reexport' )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal15=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_r_nsImport106); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal15_tree = (Object)adaptor.create(string_literal15);
                    adaptor.addChild(root_0, string_literal15_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport108);
                    r_type16=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type16.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:29:21: ( 'reexport' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:29:22: 'reexport'
                            {
                            string_literal17=(Token)input.LT(1);
                            match(input,30,FOLLOW_30_in_r_nsImport111); if (failed) return retval;
                            if ( backtracking==0 ) {
                            string_literal17_tree = (Object)adaptor.create(string_literal17);
                            adaptor.addChild(root_0, string_literal17_tree);
                            }

                            }
                            break;

                    }

                    char_literal18=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_r_nsImport115); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal18_tree = (Object)adaptor.create(char_literal18);
                    adaptor.addChild(root_0, char_literal18_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_nsImport

    public static class r_abstractDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_abstractDeclaration
    // src/org/eclipse/xpand3/parser/Xpand3.g:32:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );
    public r_abstractDeclaration_return r_abstractDeclaration() throws RecognitionException {
        r_abstractDeclaration_return retval = new r_abstractDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_check_return r_check19 = null;

        r_around_return r_around20 = null;

        r_extension_return r_extension21 = null;

        r_definition_return r_definition22 = null;

        r_definitionAround_return r_definitionAround23 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:33:2: ( r_check | r_around | r_extension | r_definition | r_definitionAround )
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
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("32:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("32:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:33:2: r_check
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration126);
                    r_check19=r_check();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_check19.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:34:2: r_around
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration131);
                    r_around20=r_around();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_around20.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:35:2: r_extension
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration136);
                    r_extension21=r_extension();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_extension21.getTree());

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:36:2: r_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_definition_in_r_abstractDeclaration141);
                    r_definition22=r_definition();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_definition22.getTree());

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:37:2: r_definitionAround
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_definitionAround_in_r_abstractDeclaration146);
                    r_definitionAround23=r_definitionAround();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_definitionAround23.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_abstractDeclaration

    public static class r_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_definition
    // src/org/eclipse/xpand3/parser/Xpand3.g:42:1: r_definition : LG DEFINE r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG ;
    public r_definition_return r_definition() throws RecognitionException {
        r_definition_return retval = new r_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LG24=null;
        Token DEFINE25=null;
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token char_literal32=null;
        Token string_literal33=null;
        Token ENDDEFINE36=null;
        Token RG37=null;
        r_identifier_return r_identifier26 = null;

        r_declaredParameterList_return r_declaredParameterList28 = null;

        r_type_return r_type34 = null;

        r_sequence_return r_sequence35 = null;


        Object LG24_tree=null;
        Object DEFINE25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal32_tree=null;
        Object string_literal33_tree=null;
        Object ENDDEFINE36_tree=null;
        Object RG37_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:43:2: ( LG DEFINE r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG )
            // src/org/eclipse/xpand3/parser/Xpand3.g:43:2: LG DEFINE r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG
            {
            root_0 = (Object)adaptor.nil();

            LG24=(Token)input.LT(1);
            match(input,LG,FOLLOW_LG_in_r_definition158); if (failed) return retval;
            if ( backtracking==0 ) {
            LG24_tree = (Object)adaptor.create(LG24);
            adaptor.addChild(root_0, LG24_tree);
            }
            DEFINE25=(Token)input.LT(1);
            match(input,DEFINE,FOLLOW_DEFINE_in_r_definition160); if (failed) return retval;
            if ( backtracking==0 ) {
            DEFINE25_tree = (Object)adaptor.create(DEFINE25);
            adaptor.addChild(root_0, DEFINE25_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_definition162);
            r_identifier26=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier26.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:43:25: ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:43:26: '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')'
                    {
                    char_literal27=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_definition165); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal27_tree = (Object)adaptor.create(char_literal27);
                    adaptor.addChild(root_0, char_literal27_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:43:30: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Identifier||(LA8_0>=69 && LA8_0<=71)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==33) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:43:31: r_declaredParameterList ( ( ',' )? '*' )?
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_definition168);
                            r_declaredParameterList28=r_declaredParameterList();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList28.getTree());
                            // src/org/eclipse/xpand3/parser/Xpand3.g:43:55: ( ( ',' )? '*' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:43:56: ( ',' )? '*'
                                    {
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:43:56: ( ',' )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);

                                    if ( (LA6_0==32) ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // src/org/eclipse/xpand3/parser/Xpand3.g:43:56: ','
                                            {
                                            char_literal29=(Token)input.LT(1);
                                            match(input,32,FOLLOW_32_in_r_definition171); if (failed) return retval;
                                            if ( backtracking==0 ) {
                                            char_literal29_tree = (Object)adaptor.create(char_literal29);
                                            adaptor.addChild(root_0, char_literal29_tree);
                                            }

                                            }
                                            break;

                                    }

                                    char_literal30=(Token)input.LT(1);
                                    match(input,33,FOLLOW_33_in_r_definition174); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal30_tree = (Object)adaptor.create(char_literal30);
                                    adaptor.addChild(root_0, char_literal30_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:43:69: '*'
                            {
                            char_literal31=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_r_definition180); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal31_tree = (Object)adaptor.create(char_literal31);
                            adaptor.addChild(root_0, char_literal31_tree);
                            }

                            }
                            break;

                    }

                    char_literal32=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_definition184); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal32_tree = (Object)adaptor.create(char_literal32);
                    adaptor.addChild(root_0, char_literal32_tree);
                    }

                    }
                    break;

            }

            string_literal33=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_r_definition188); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal33_tree = (Object)adaptor.create(string_literal33);
            adaptor.addChild(root_0, string_literal33_tree);
            }
            pushFollow(FOLLOW_r_type_in_r_definition190);
            r_type34=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type34.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_definition193);
            r_sequence35=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence35.getTree());
            ENDDEFINE36=(Token)input.LT(1);
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_r_definition196); if (failed) return retval;
            if ( backtracking==0 ) {
            ENDDEFINE36_tree = (Object)adaptor.create(ENDDEFINE36);
            adaptor.addChild(root_0, ENDDEFINE36_tree);
            }
            RG37=(Token)input.LT(1);
            match(input,RG,FOLLOW_RG_in_r_definition198); if (failed) return retval;
            if ( backtracking==0 ) {
            RG37_tree = (Object)adaptor.create(RG37);
            adaptor.addChild(root_0, RG37_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_definition

    public static class r_definitionAround_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_definitionAround
    // src/org/eclipse/xpand3/parser/Xpand3.g:48:1: r_definitionAround : LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG ;
    public r_definitionAround_return r_definitionAround() throws RecognitionException {
        r_definitionAround_return retval = new r_definitionAround_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LG38=null;
        Token AROUND39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token char_literal45=null;
        Token char_literal46=null;
        Token string_literal47=null;
        Token ENDAROUND50=null;
        Token RG51=null;
        r_pointcut_return r_pointcut40 = null;

        r_declaredParameterList_return r_declaredParameterList42 = null;

        r_type_return r_type48 = null;

        r_sequence_return r_sequence49 = null;


        Object LG38_tree=null;
        Object AROUND39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal45_tree=null;
        Object char_literal46_tree=null;
        Object string_literal47_tree=null;
        Object ENDAROUND50_tree=null;
        Object RG51_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:2: ( LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG )
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:2: LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG
            {
            root_0 = (Object)adaptor.nil();

            LG38=(Token)input.LT(1);
            match(input,LG,FOLLOW_LG_in_r_definitionAround210); if (failed) return retval;
            if ( backtracking==0 ) {
            LG38_tree = (Object)adaptor.create(LG38);
            adaptor.addChild(root_0, LG38_tree);
            }
            AROUND39=(Token)input.LT(1);
            match(input,AROUND,FOLLOW_AROUND_in_r_definitionAround212); if (failed) return retval;
            if ( backtracking==0 ) {
            AROUND39_tree = (Object)adaptor.create(AROUND39);
            adaptor.addChild(root_0, AROUND39_tree);
            }
            pushFollow(FOLLOW_r_pointcut_in_r_definitionAround214);
            r_pointcut40=r_pointcut();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_pointcut40.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:23: ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:49:24: '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')'
                    {
                    char_literal41=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_definitionAround217); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal41_tree = (Object)adaptor.create(char_literal41);
                    adaptor.addChild(root_0, char_literal41_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:49:28: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==Identifier||(LA12_0>=69 && LA12_0<=71)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==33) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:49:29: r_declaredParameterList ( ( ',' )? '*' )?
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_definitionAround220);
                            r_declaredParameterList42=r_declaredParameterList();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList42.getTree());
                            // src/org/eclipse/xpand3/parser/Xpand3.g:49:53: ( ( ',' )? '*' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( ((LA11_0>=32 && LA11_0<=33)) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:49:54: ( ',' )? '*'
                                    {
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:49:54: ( ',' )?
                                    int alt10=2;
                                    int LA10_0 = input.LA(1);

                                    if ( (LA10_0==32) ) {
                                        alt10=1;
                                    }
                                    switch (alt10) {
                                        case 1 :
                                            // src/org/eclipse/xpand3/parser/Xpand3.g:49:54: ','
                                            {
                                            char_literal43=(Token)input.LT(1);
                                            match(input,32,FOLLOW_32_in_r_definitionAround223); if (failed) return retval;
                                            if ( backtracking==0 ) {
                                            char_literal43_tree = (Object)adaptor.create(char_literal43);
                                            adaptor.addChild(root_0, char_literal43_tree);
                                            }

                                            }
                                            break;

                                    }

                                    char_literal44=(Token)input.LT(1);
                                    match(input,33,FOLLOW_33_in_r_definitionAround226); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal44_tree = (Object)adaptor.create(char_literal44);
                                    adaptor.addChild(root_0, char_literal44_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:49:67: '*'
                            {
                            char_literal45=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_r_definitionAround232); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal45_tree = (Object)adaptor.create(char_literal45);
                            adaptor.addChild(root_0, char_literal45_tree);
                            }

                            }
                            break;

                    }

                    char_literal46=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_definitionAround236); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal46_tree = (Object)adaptor.create(char_literal46);
                    adaptor.addChild(root_0, char_literal46_tree);
                    }

                    }
                    break;

            }

            string_literal47=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_r_definitionAround240); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal47_tree = (Object)adaptor.create(string_literal47);
            adaptor.addChild(root_0, string_literal47_tree);
            }
            pushFollow(FOLLOW_r_type_in_r_definitionAround242);
            r_type48=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type48.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_definitionAround245);
            r_sequence49=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence49.getTree());
            ENDAROUND50=(Token)input.LT(1);
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_r_definitionAround248); if (failed) return retval;
            if ( backtracking==0 ) {
            ENDAROUND50_tree = (Object)adaptor.create(ENDAROUND50);
            adaptor.addChild(root_0, ENDAROUND50_tree);
            }
            RG51=(Token)input.LT(1);
            match(input,RG,FOLLOW_RG_in_r_definitionAround250); if (failed) return retval;
            if ( backtracking==0 ) {
            RG51_tree = (Object)adaptor.create(RG51);
            adaptor.addChild(root_0, RG51_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_definitionAround

    public static class r_sequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_sequence
    // src/org/eclipse/xpand3/parser/Xpand3.g:54:1: r_sequence : r_textSequence ( r_statement r_textSequence )* ;
    public r_sequence_return r_sequence() throws RecognitionException {
        r_sequence_return retval = new r_sequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_textSequence_return r_textSequence52 = null;

        r_statement_return r_statement53 = null;

        r_textSequence_return r_textSequence54 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:55:3: ( r_textSequence ( r_statement r_textSequence )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:55:3: r_textSequence ( r_statement r_textSequence )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_textSequence_in_r_sequence262);
            r_textSequence52=r_textSequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_textSequence52.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:56:3: ( r_statement r_textSequence )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=StringLiteral && LA14_0<=Identifier)||LA14_0==31||(LA14_0>=36 && LA14_0<=39)||LA14_0==41||LA14_0==46||LA14_0==50||LA14_0==52||LA14_0==59||(LA14_0>=69 && LA14_0<=72)||LA14_0==78||(LA14_0>=93 && LA14_0<=95)||(LA14_0>=97 && LA14_0<=109)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:56:4: r_statement r_textSequence
            	    {
            	    pushFollow(FOLLOW_r_statement_in_r_sequence268);
            	    r_statement53=r_statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_statement53.getTree());
            	    pushFollow(FOLLOW_r_textSequence_in_r_sequence274);
            	    r_textSequence54=r_textSequence();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_textSequence54.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_sequence

    public static class r_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_statement
    // src/org/eclipse/xpand3/parser/Xpand3.g:60:1: r_statement : ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement );
    public r_statement_return r_statement() throws RecognitionException {
        r_statement_return retval = new r_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_simpleStatement_return r_simpleStatement55 = null;

        r_fileStatement_return r_fileStatement56 = null;

        r_foreachStatement_return r_foreachStatement57 = null;

        r_ifStatement_return r_ifStatement58 = null;

        r_letStatement_return r_letStatement59 = null;

        r_protectStatement_return r_protectStatement60 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:61:3: ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement )
            int alt15=6;
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
            case 93:
            case 94:
            case 95:
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
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 39:
                {
                alt15=3;
                }
                break;
            case 46:
                {
                alt15=4;
                }
                break;
            case 50:
                {
                alt15=5;
                }
                break;
            case 52:
                {
                alt15=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("60:1: r_statement : ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:61:3: r_simpleStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_simpleStatement_in_r_statement289);
                    r_simpleStatement55=r_simpleStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleStatement55.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:62:3: r_fileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_fileStatement_in_r_statement294);
                    r_fileStatement56=r_fileStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_fileStatement56.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:63:3: r_foreachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_foreachStatement_in_r_statement299);
                    r_foreachStatement57=r_foreachStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_foreachStatement57.getTree());

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:64:3: r_ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_ifStatement_in_r_statement304);
                    r_ifStatement58=r_ifStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_ifStatement58.getTree());

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:65:3: r_letStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_letStatement_in_r_statement309);
                    r_letStatement59=r_letStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_letStatement59.getTree());

                    }
                    break;
                case 6 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:66:3: r_protectStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_protectStatement_in_r_statement314);
                    r_protectStatement60=r_protectStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_protectStatement60.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_statement

    public static class r_textSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_textSequence
    // src/org/eclipse/xpand3/parser/Xpand3.g:69:1: r_textSequence : r_text ( r_text )* ;
    public r_textSequence_return r_textSequence() throws RecognitionException {
        r_textSequence_return retval = new r_textSequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_text_return r_text61 = null;

        r_text_return r_text62 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:2: ( r_text ( r_text )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:2: r_text ( r_text )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_text_in_r_textSequence325);
            r_text61=r_text();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_text61.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:9: ( r_text )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==TEXT) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==TEXT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:70:10: r_text
            	    {
            	    pushFollow(FOLLOW_r_text_in_r_textSequence328);
            	    r_text62=r_text();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_text62.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_textSequence

    public static class r_text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_text
    // src/org/eclipse/xpand3/parser/Xpand3.g:73:1: r_text : ( '-' )? TEXT ;
    public r_text_return r_text() throws RecognitionException {
        r_text_return retval = new r_text_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal63=null;
        Token TEXT64=null;

        Object char_literal63_tree=null;
        Object TEXT64_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:74:2: ( ( '-' )? TEXT )
            // src/org/eclipse/xpand3/parser/Xpand3.g:74:2: ( '-' )? TEXT
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:74:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:74:2: '-'
                    {
                    char_literal63=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_r_text340); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal63_tree = (Object)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);
                    }

                    }
                    break;

            }

            TEXT64=(Token)input.LT(1);
            match(input,TEXT,FOLLOW_TEXT_in_r_text343); if (failed) return retval;
            if ( backtracking==0 ) {
            TEXT64_tree = (Object)adaptor.create(TEXT64);
            adaptor.addChild(root_0, TEXT64_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_text

    public static class r_simpleStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_simpleStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:77:1: r_simpleStatement : ( r_errorStatement | r_expandStatement | r_expressionStmt );
    public r_simpleStatement_return r_simpleStatement() throws RecognitionException {
        r_simpleStatement_return retval = new r_simpleStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_errorStatement_return r_errorStatement65 = null;

        r_expandStatement_return r_expandStatement66 = null;

        r_expressionStmt_return r_expressionStmt67 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:3: ( r_errorStatement | r_expandStatement | r_expressionStmt )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
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
            case 93:
            case 94:
            case 95:
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
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("77:1: r_simpleStatement : ( r_errorStatement | r_expandStatement | r_expressionStmt );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:78:3: r_errorStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_errorStatement_in_r_simpleStatement354);
                    r_errorStatement65=r_errorStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_errorStatement65.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:79:3: r_expandStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_expandStatement_in_r_simpleStatement358);
                    r_expandStatement66=r_expandStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expandStatement66.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:80:3: r_expressionStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_expressionStmt_in_r_simpleStatement362);
                    r_expressionStmt67=r_expressionStmt();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expressionStmt67.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_simpleStatement

    public static class r_errorStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_errorStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:83:1: r_errorStatement : 'ERROR' r_expression ;
    public r_errorStatement_return r_errorStatement() throws RecognitionException {
        r_errorStatement_return retval = new r_errorStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal68=null;
        r_expression_return r_expression69 = null;


        Object string_literal68_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:3: ( 'ERROR' r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:3: 'ERROR' r_expression
            {
            root_0 = (Object)adaptor.nil();

            string_literal68=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_r_errorStatement373); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal68_tree = (Object)adaptor.create(string_literal68);
            adaptor.addChild(root_0, string_literal68_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_errorStatement375);
            r_expression69=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression69.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_errorStatement

    public static class r_expandStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_expandStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:87:1: r_expandStatement : 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )? ;
    public r_expandStatement_return r_expandStatement() throws RecognitionException {
        r_expandStatement_return retval = new r_expandStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token string_literal75=null;
        Token string_literal77=null;
        Token string_literal79=null;
        r_simpleType_return r_simpleType71 = null;

        r_parameterList_return r_parameterList73 = null;

        r_expression_return r_expression76 = null;

        r_expression_return r_expression78 = null;

        r_expression_return r_expression80 = null;


        Object string_literal70_tree=null;
        Object char_literal72_tree=null;
        Object char_literal74_tree=null;
        Object string_literal75_tree=null;
        Object string_literal77_tree=null;
        Object string_literal79_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:3: ( 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:3: 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal70=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_r_expandStatement386); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal70_tree = (Object)adaptor.create(string_literal70);
            adaptor.addChild(root_0, string_literal70_tree);
            }
            pushFollow(FOLLOW_r_simpleType_in_r_expandStatement388);
            r_simpleType71=r_simpleType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType71.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:25: ( '(' r_parameterList ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:88:26: '(' r_parameterList ')'
                    {
                    char_literal72=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_expandStatement391); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal72_tree = (Object)adaptor.create(char_literal72);
                    adaptor.addChild(root_0, char_literal72_tree);
                    }
                    pushFollow(FOLLOW_r_parameterList_in_r_expandStatement393);
                    r_parameterList73=r_parameterList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_parameterList73.getTree());
                    char_literal74=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_expandStatement395); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal74_tree = (Object)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);
                    }

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:88:52: ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:88:53: ( 'FOR' r_expression )
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:88:53: ( 'FOR' r_expression )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:88:54: 'FOR' r_expression
                    {
                    string_literal75=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_r_expandStatement401); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal75_tree = (Object)adaptor.create(string_literal75);
                    adaptor.addChild(root_0, string_literal75_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_expandStatement403);
                    r_expression76=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression76.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:89:5: ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? )
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:89:5: ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:89:6: 'FOREACH' r_expression ( 'SEPARATOR' r_expression )?
                    {
                    string_literal77=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_r_expandStatement411); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal77_tree = (Object)adaptor.create(string_literal77);
                    adaptor.addChild(root_0, string_literal77_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_expandStatement412);
                    r_expression78=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression78.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:89:28: ( 'SEPARATOR' r_expression )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==40) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:89:29: 'SEPARATOR' r_expression
                            {
                            string_literal79=(Token)input.LT(1);
                            match(input,40,FOLLOW_40_in_r_expandStatement415); if (failed) return retval;
                            if ( backtracking==0 ) {
                            string_literal79_tree = (Object)adaptor.create(string_literal79);
                            adaptor.addChild(root_0, string_literal79_tree);
                            }
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement417);
                            r_expression80=r_expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression80.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_expandStatement

    public static class r_expressionStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_expressionStmt
    // src/org/eclipse/xpand3/parser/Xpand3.g:92:1: r_expressionStmt : r_expression ;
    public r_expressionStmt_return r_expressionStmt() throws RecognitionException {
        r_expressionStmt_return retval = new r_expressionStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_expression_return r_expression81 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:2: ( r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:2: r_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_expression_in_r_expressionStmt433);
            r_expression81=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression81.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_expressionStmt

    public static class r_fileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_fileStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:96:1: r_fileStatement : 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE' ;
    public r_fileStatement_return r_fileStatement() throws RecognitionException {
        r_fileStatement_return retval = new r_fileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        Token string_literal86=null;
        r_expression_return r_expression83 = null;

        r_identifier_return r_identifier84 = null;

        r_sequence_return r_sequence85 = null;


        Object string_literal82_tree=null;
        Object string_literal86_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:97:2: ( 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:97:2: 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE'
            {
            root_0 = (Object)adaptor.nil();

            string_literal82=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_r_fileStatement443); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_fileStatement445);
            r_expression83=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression83.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:97:22: ( r_identifier )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identifier) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:97:23: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_fileStatement448);
                    r_identifier84=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier84.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_fileStatement454);
            r_sequence85=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence85.getTree());
            string_literal86=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_r_fileStatement458); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal86_tree = (Object)adaptor.create(string_literal86);
            adaptor.addChild(root_0, string_literal86_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_fileStatement

    public static class r_foreachStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_foreachStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:102:1: r_foreachStatement : 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH' ;
    public r_foreachStatement_return r_foreachStatement() throws RecognitionException {
        r_foreachStatement_return retval = new r_foreachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token string_literal89=null;
        Token string_literal91=null;
        Token string_literal93=null;
        Token string_literal96=null;
        r_expression_return r_expression88 = null;

        r_identifier_return r_identifier90 = null;

        r_identifier_return r_identifier92 = null;

        r_expression_return r_expression94 = null;

        r_sequence_return r_sequence95 = null;


        Object string_literal87_tree=null;
        Object string_literal89_tree=null;
        Object string_literal91_tree=null;
        Object string_literal93_tree=null;
        Object string_literal96_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:103:3: ( 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:103:3: 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH'
            {
            root_0 = (Object)adaptor.nil();

            string_literal87=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_r_foreachStatement470); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_foreachStatement472);
            r_expression88=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression88.getTree());
            string_literal89=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_r_foreachStatement474); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal89_tree = (Object)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_foreachStatement476);
            r_identifier90=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier90.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:103:44: ( 'ITERATOR' r_identifier )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:103:45: 'ITERATOR' r_identifier
                    {
                    string_literal91=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_r_foreachStatement479); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal91_tree = (Object)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);
                    }
                    pushFollow(FOLLOW_r_identifier_in_r_foreachStatement481);
                    r_identifier92=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier92.getTree());

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:103:71: ( 'SEPARATOR' r_expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:103:72: 'SEPARATOR' r_expression
                    {
                    string_literal93=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_r_foreachStatement486); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal93_tree = (Object)adaptor.create(string_literal93);
                    adaptor.addChild(root_0, string_literal93_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_foreachStatement488);
                    r_expression94=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression94.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_foreachStatement496);
            r_sequence95=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence95.getTree());
            string_literal96=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_r_foreachStatement501); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal96_tree = (Object)adaptor.create(string_literal96);
            adaptor.addChild(root_0, string_literal96_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_foreachStatement

    public static class r_ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_ifStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:108:1: r_ifStatement : 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF' ;
    public r_ifStatement_return r_ifStatement() throws RecognitionException {
        r_ifStatement_return retval = new r_ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token string_literal102=null;
        r_expression_return r_expression98 = null;

        r_sequence_return r_sequence99 = null;

        r_elseIfStatement_return r_elseIfStatement100 = null;

        r_elseStatement_return r_elseStatement101 = null;


        Object string_literal97_tree=null;
        Object string_literal102_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:109:6: ( 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:109:6: 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF'
            {
            root_0 = (Object)adaptor.nil();

            string_literal97=(Token)input.LT(1);
            match(input,46,FOLLOW_46_in_r_ifStatement516); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_ifStatement518);
            r_expression98=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression98.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_ifStatement522);
            r_sequence99=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence99.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:111:3: ( r_elseIfStatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:111:3: r_elseIfStatement
            	    {
            	    pushFollow(FOLLOW_r_elseIfStatement_in_r_ifStatement527);
            	    r_elseIfStatement100=r_elseIfStatement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_elseIfStatement100.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:112:3: ( r_elseStatement )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:112:3: r_elseStatement
                    {
                    pushFollow(FOLLOW_r_elseStatement_in_r_ifStatement532);
                    r_elseStatement101=r_elseStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_elseStatement101.getTree());

                    }
                    break;

            }

            string_literal102=(Token)input.LT(1);
            match(input,47,FOLLOW_47_in_r_ifStatement537); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal102_tree = (Object)adaptor.create(string_literal102);
            adaptor.addChild(root_0, string_literal102_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_ifStatement

    public static class r_elseIfStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_elseIfStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:116:1: r_elseIfStatement : 'ELSEIF' r_expression r_sequence ;
    public r_elseIfStatement_return r_elseIfStatement() throws RecognitionException {
        r_elseIfStatement_return retval = new r_elseIfStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal103=null;
        r_expression_return r_expression104 = null;

        r_sequence_return r_sequence105 = null;


        Object string_literal103_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:117:2: ( 'ELSEIF' r_expression r_sequence )
            // src/org/eclipse/xpand3/parser/Xpand3.g:117:2: 'ELSEIF' r_expression r_sequence
            {
            root_0 = (Object)adaptor.nil();

            string_literal103=(Token)input.LT(1);
            match(input,48,FOLLOW_48_in_r_elseIfStatement547); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal103_tree = (Object)adaptor.create(string_literal103);
            adaptor.addChild(root_0, string_literal103_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_elseIfStatement549);
            r_expression104=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression104.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_elseIfStatement553);
            r_sequence105=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence105.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_elseIfStatement

    public static class r_elseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_elseStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:121:1: r_elseStatement : 'ELSE' r_sequence ;
    public r_elseStatement_return r_elseStatement() throws RecognitionException {
        r_elseStatement_return retval = new r_elseStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal106=null;
        r_sequence_return r_sequence107 = null;


        Object string_literal106_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:122:2: ( 'ELSE' r_sequence )
            // src/org/eclipse/xpand3/parser/Xpand3.g:122:2: 'ELSE' r_sequence
            {
            root_0 = (Object)adaptor.nil();

            string_literal106=(Token)input.LT(1);
            match(input,49,FOLLOW_49_in_r_elseStatement565); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal106_tree = (Object)adaptor.create(string_literal106);
            adaptor.addChild(root_0, string_literal106_tree);
            }
            pushFollow(FOLLOW_r_sequence_in_r_elseStatement569);
            r_sequence107=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence107.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_elseStatement

    public static class r_letStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_letStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:126:1: r_letStatement : 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET' ;
    public r_letStatement_return r_letStatement() throws RecognitionException {
        r_letStatement_return retval = new r_letStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal108=null;
        Token string_literal110=null;
        Token string_literal113=null;
        r_expression_return r_expression109 = null;

        r_identifier_return r_identifier111 = null;

        r_sequence_return r_sequence112 = null;


        Object string_literal108_tree=null;
        Object string_literal110_tree=null;
        Object string_literal113_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:127:3: ( 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:127:3: 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET'
            {
            root_0 = (Object)adaptor.nil();

            string_literal108=(Token)input.LT(1);
            match(input,50,FOLLOW_50_in_r_letStatement581); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal108_tree = (Object)adaptor.create(string_literal108);
            adaptor.addChild(root_0, string_literal108_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_letStatement583);
            r_expression109=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression109.getTree());
            string_literal110=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_r_letStatement585); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal110_tree = (Object)adaptor.create(string_literal110);
            adaptor.addChild(root_0, string_literal110_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_letStatement587);
            r_identifier111=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier111.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_letStatement593);
            r_sequence112=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence112.getTree());
            string_literal113=(Token)input.LT(1);
            match(input,51,FOLLOW_51_in_r_letStatement598); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal113_tree = (Object)adaptor.create(string_literal113);
            adaptor.addChild(root_0, string_literal113_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_letStatement

    public static class r_protectStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_protectStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:132:1: r_protectStatement : 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT' ;
    public r_protectStatement_return r_protectStatement() throws RecognitionException {
        r_protectStatement_return retval = new r_protectStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal114=null;
        Token string_literal115=null;
        Token string_literal117=null;
        Token string_literal119=null;
        Token string_literal121=null;
        Token string_literal123=null;
        r_expression_return r_expression116 = null;

        r_expression_return r_expression118 = null;

        r_expression_return r_expression120 = null;

        r_sequence_return r_sequence122 = null;


        Object string_literal114_tree=null;
        Object string_literal115_tree=null;
        Object string_literal117_tree=null;
        Object string_literal119_tree=null;
        Object string_literal121_tree=null;
        Object string_literal123_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:133:2: ( 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:133:2: 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT'
            {
            root_0 = (Object)adaptor.nil();

            string_literal114=(Token)input.LT(1);
            match(input,52,FOLLOW_52_in_r_protectStatement609); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal114_tree = (Object)adaptor.create(string_literal114);
            adaptor.addChild(root_0, string_literal114_tree);
            }
            string_literal115=(Token)input.LT(1);
            match(input,53,FOLLOW_53_in_r_protectStatement614); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal115_tree = (Object)adaptor.create(string_literal115);
            adaptor.addChild(root_0, string_literal115_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_protectStatement616);
            r_expression116=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression116.getTree());
            string_literal117=(Token)input.LT(1);
            match(input,54,FOLLOW_54_in_r_protectStatement621); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal117_tree = (Object)adaptor.create(string_literal117);
            adaptor.addChild(root_0, string_literal117_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_protectStatement623);
            r_expression118=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression118.getTree());
            string_literal119=(Token)input.LT(1);
            match(input,55,FOLLOW_55_in_r_protectStatement636); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal119_tree = (Object)adaptor.create(string_literal119);
            adaptor.addChild(root_0, string_literal119_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_protectStatement638);
            r_expression120=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression120.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:136:29: ( 'DISABLE' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:136:29: 'DISABLE'
                    {
                    string_literal121=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_r_protectStatement640); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal121_tree = (Object)adaptor.create(string_literal121);
                    adaptor.addChild(root_0, string_literal121_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_protectStatement646);
            r_sequence122=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence122.getTree());
            string_literal123=(Token)input.LT(1);
            match(input,57,FOLLOW_57_in_r_protectStatement650); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            adaptor.addChild(root_0, string_literal123_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_protectStatement

    public static class r_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_check
    // src/org/eclipse/xpand3/parser/Xpand3.g:143:1: r_check : 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' ;
    public r_check_return r_check() throws RecognitionException {
        r_check_return retval = new r_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal124=null;
        Token string_literal126=null;
        Token set128=null;
        Token char_literal130=null;
        Token char_literal132=null;
        r_type_return r_type125 = null;

        r_expression_return r_expression127 = null;

        r_expression_return r_expression129 = null;

        r_expression_return r_expression131 = null;


        Object string_literal124_tree=null;
        Object string_literal126_tree=null;
        Object set128_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:144:2: ( 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:144:2: 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal124=(Token)input.LT(1);
            match(input,58,FOLLOW_58_in_r_check662); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal124_tree = (Object)adaptor.create(string_literal124);
            adaptor.addChild(root_0, string_literal124_tree);
            }
            pushFollow(FOLLOW_r_type_in_r_check664);
            r_type125=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type125.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:144:19: ( 'if' r_expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:144:20: 'if' r_expression
                    {
                    string_literal126=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_r_check667); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal126_tree = (Object)adaptor.create(string_literal126);
                    adaptor.addChild(root_0, string_literal126_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_check669);
                    r_expression127=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression127.getTree());

                    }
                    break;

            }

            set128=(Token)input.LT(1);
            if ( input.LA(1)==37||input.LA(1)==60 ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set128));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_check673);    throw mse;
            }

            pushFollow(FOLLOW_r_expression_in_r_check679);
            r_expression129=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression129.getTree());
            char_literal130=(Token)input.LT(1);
            match(input,61,FOLLOW_61_in_r_check681); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal130_tree = (Object)adaptor.create(char_literal130);
            adaptor.addChild(root_0, char_literal130_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_check685);
            r_expression131=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression131.getTree());
            char_literal132=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_r_check687); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal132_tree = (Object)adaptor.create(char_literal132);
            adaptor.addChild(root_0, char_literal132_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_check

    public static class r_around_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_around
    // src/org/eclipse/xpand3/parser/Xpand3.g:148:1: r_around : 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' ;
    public r_around_return r_around() throws RecognitionException {
        r_around_return retval = new r_around_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133=null;
        Token char_literal135=null;
        Token char_literal137=null;
        Token char_literal138=null;
        Token char_literal139=null;
        Token char_literal140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        r_pointcut_return r_pointcut134 = null;

        r_declaredParameterList_return r_declaredParameterList136 = null;

        r_expression_return r_expression142 = null;


        Object string_literal133_tree=null;
        Object char_literal135_tree=null;
        Object char_literal137_tree=null;
        Object char_literal138_tree=null;
        Object char_literal139_tree=null;
        Object char_literal140_tree=null;
        Object char_literal141_tree=null;
        Object char_literal143_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:149:5: ( 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:149:5: 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal133=(Token)input.LT(1);
            match(input,62,FOLLOW_62_in_r_around702); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal133_tree = (Object)adaptor.create(string_literal133);
            adaptor.addChild(root_0, string_literal133_tree);
            }
            pushFollow(FOLLOW_r_pointcut_in_r_around704);
            r_pointcut134=r_pointcut();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_pointcut134.getTree());
            char_literal135=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_r_around706); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal135_tree = (Object)adaptor.create(char_literal135);
            adaptor.addChild(root_0, char_literal135_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:149:29: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Identifier||(LA31_0>=69 && LA31_0<=71)) ) {
                alt31=1;
            }
            else if ( (LA31_0==33) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:149:30: r_declaredParameterList ( ( ',' )? '*' )?
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_around709);
                    r_declaredParameterList136=r_declaredParameterList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList136.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:149:54: ( ( ',' )? '*' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=32 && LA30_0<=33)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:149:55: ( ',' )? '*'
                            {
                            // src/org/eclipse/xpand3/parser/Xpand3.g:149:55: ( ',' )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==32) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:149:55: ','
                                    {
                                    char_literal137=(Token)input.LT(1);
                                    match(input,32,FOLLOW_32_in_r_around712); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal137_tree = (Object)adaptor.create(char_literal137);
                                    adaptor.addChild(root_0, char_literal137_tree);
                                    }

                                    }
                                    break;

                            }

                            char_literal138=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_r_around715); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal138_tree = (Object)adaptor.create(char_literal138);
                            adaptor.addChild(root_0, char_literal138_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:149:68: '*'
                    {
                    char_literal139=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_r_around721); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal139_tree = (Object)adaptor.create(char_literal139);
                    adaptor.addChild(root_0, char_literal139_tree);
                    }

                    }
                    break;

            }

            char_literal140=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_r_around725); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal140_tree = (Object)adaptor.create(char_literal140);
            adaptor.addChild(root_0, char_literal140_tree);
            }
            char_literal141=(Token)input.LT(1);
            match(input,61,FOLLOW_61_in_r_around727); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal141_tree = (Object)adaptor.create(char_literal141);
            adaptor.addChild(root_0, char_literal141_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_around734);
            r_expression142=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression142.getTree());
            char_literal143=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_r_around736); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal143_tree = (Object)adaptor.create(char_literal143);
            adaptor.addChild(root_0, char_literal143_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_around

    public static class r_pointcut_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_pointcut
    // src/org/eclipse/xpand3/parser/Xpand3.g:153:1: r_pointcut : ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* ;
    public r_pointcut_return r_pointcut() throws RecognitionException {
        r_pointcut_return retval = new r_pointcut_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal144=null;
        Token char_literal146=null;
        Token string_literal148=null;
        r_identifier_return r_identifier145 = null;

        r_identifier_return r_identifier147 = null;


        Object char_literal144_tree=null;
        Object char_literal146_tree=null;
        Object string_literal148_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:154:2: ( ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:154:2: ( '*' | r_identifier ) ( '*' | r_identifier | '::' )*
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:154:2: ( '*' | r_identifier )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            else if ( (LA32_0==Identifier) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("154:2: ( '*' | r_identifier )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:154:4: '*'
                    {
                    char_literal144=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_r_pointcut753); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal144_tree = (Object)adaptor.create(char_literal144);
                    adaptor.addChild(root_0, char_literal144_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:155:4: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut759);
                    r_identifier145=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier145.getTree());

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:156:4: ( '*' | r_identifier | '::' )*
            loop33:
            do {
                int alt33=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt33=1;
                    }
                    break;
                case Identifier:
                    {
                    alt33=2;
                    }
                    break;
                case 63:
                    {
                    alt33=3;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:156:6: '*'
            	    {
            	    char_literal146=(Token)input.LT(1);
            	    match(input,33,FOLLOW_33_in_r_pointcut767); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal146_tree = (Object)adaptor.create(char_literal146);
            	    adaptor.addChild(root_0, char_literal146_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:157:6: r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_pointcut775);
            	    r_identifier147=r_identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier147.getTree());

            	    }
            	    break;
            	case 3 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:158:6: '::'
            	    {
            	    string_literal148=(Token)input.LT(1);
            	    match(input,63,FOLLOW_63_in_r_pointcut783); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal148_tree = (Object)adaptor.create(string_literal148);
            	    adaptor.addChild(root_0, string_literal148_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_pointcut

    public static class r_extension_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_extension
    // src/org/eclipse/xpand3/parser/Xpand3.g:161:1: r_extension : ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' ;
    public r_extension_return r_extension() throws RecognitionException {
        r_extension_return retval = new r_extension_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set149=null;
        Token char_literal153=null;
        Token char_literal155=null;
        Token char_literal156=null;
        Token string_literal157=null;
        Token char_literal159=null;
        Token char_literal161=null;
        Token char_literal163=null;
        Token char_literal165=null;
        Token char_literal167=null;
        r_type_return r_type150 = null;

        r_identifier_return r_identifier151 = null;

        r_identifier_return r_identifier152 = null;

        r_declaredParameterList_return r_declaredParameterList154 = null;

        r_javaType_return r_javaType158 = null;

        r_identifier_return r_identifier160 = null;

        r_javaType_return r_javaType162 = null;

        r_javaType_return r_javaType164 = null;

        r_expression_return r_expression166 = null;


        Object set149_tree=null;
        Object char_literal153_tree=null;
        Object char_literal155_tree=null;
        Object char_literal156_tree=null;
        Object string_literal157_tree=null;
        Object char_literal159_tree=null;
        Object char_literal161_tree=null;
        Object char_literal163_tree=null;
        Object char_literal165_tree=null;
        Object char_literal167_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:162:2: ( ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:162:2: ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';'
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:162:2: ( 'private' | 'cached' | 'create' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=64 && LA34_0<=66)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:
            	    {
            	    set149=(Token)input.LT(1);
            	    if ( (input.LA(1)>=64 && input.LA(1)<=66) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set149));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_extension797);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:162:33: ( r_type )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=69 && LA35_0<=71)) ) {
                alt35=1;
            }
            else if ( (LA35_0==Identifier) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==63) ) {
                    alt35=1;
                }
                else if ( (LA35_2==Identifier) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:162:33: r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension806);
                    r_type150=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type150.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_r_identifier_in_r_extension809);
            r_identifier151=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier151.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:162:54: ( r_identifier )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:162:54: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension811);
                    r_identifier152=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier152.getTree());

                    }
                    break;

            }

            char_literal153=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_r_extension814); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal153_tree = (Object)adaptor.create(char_literal153);
            adaptor.addChild(root_0, char_literal153_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:162:72: ( r_declaredParameterList )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Identifier||(LA37_0>=69 && LA37_0<=71)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:162:72: r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension816);
                    r_declaredParameterList154=r_declaredParameterList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList154.getTree());

                    }
                    break;

            }

            char_literal155=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_r_extension819); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal155_tree = (Object)adaptor.create(char_literal155);
            adaptor.addChild(root_0, char_literal155_tree);
            }
            char_literal156=(Token)input.LT(1);
            match(input,61,FOLLOW_61_in_r_extension821); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal156_tree = (Object)adaptor.create(char_literal156);
            adaptor.addChild(root_0, char_literal156_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:163:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==67) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=StringLiteral && LA40_0<=Identifier)||LA40_0==31||LA40_0==36||LA40_0==59||(LA40_0>=69 && LA40_0<=72)||LA40_0==78||(LA40_0>=93 && LA40_0<=95)||(LA40_0>=97 && LA40_0<=109)) ) {
                alt40=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("163:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:163:4: 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')'
                    {
                    string_literal157=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_r_extension826); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal157_tree = (Object)adaptor.create(string_literal157);
                    adaptor.addChild(root_0, string_literal157_tree);
                    }
                    pushFollow(FOLLOW_r_javaType_in_r_extension828);
                    r_javaType158=r_javaType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_javaType158.getTree());
                    char_literal159=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_r_extension830); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal159_tree = (Object)adaptor.create(char_literal159);
                    adaptor.addChild(root_0, char_literal159_tree);
                    }
                    pushFollow(FOLLOW_r_identifier_in_r_extension832);
                    r_identifier160=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier160.getTree());
                    char_literal161=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_extension834); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal161_tree = (Object)adaptor.create(char_literal161);
                    adaptor.addChild(root_0, char_literal161_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:163:42: ( r_javaType ( ',' r_javaType )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==Identifier) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:163:43: r_javaType ( ',' r_javaType )*
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension836);
                            r_javaType162=r_javaType();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_javaType162.getTree());
                            // src/org/eclipse/xpand3/parser/Xpand3.g:163:54: ( ',' r_javaType )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==32) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // src/org/eclipse/xpand3/parser/Xpand3.g:163:55: ',' r_javaType
                            	    {
                            	    char_literal163=(Token)input.LT(1);
                            	    match(input,32,FOLLOW_32_in_r_extension839); if (failed) return retval;
                            	    if ( backtracking==0 ) {
                            	    char_literal163_tree = (Object)adaptor.create(char_literal163);
                            	    adaptor.addChild(root_0, char_literal163_tree);
                            	    }
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension841);
                            	    r_javaType164=r_javaType();
                            	    _fsp--;
                            	    if (failed) return retval;
                            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_javaType164.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal165=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_extension848); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal165_tree = (Object)adaptor.create(char_literal165);
                    adaptor.addChild(root_0, char_literal165_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:164:4: r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension855);
                    r_expression166=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression166.getTree());

                    }
                    break;

            }

            char_literal167=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_r_extension858); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal167_tree = (Object)adaptor.create(char_literal167);
            adaptor.addChild(root_0, char_literal167_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_extension

    public static class r_javaType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_javaType
    // src/org/eclipse/xpand3/parser/Xpand3.g:167:1: r_javaType : r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* ;
    public r_javaType_return r_javaType() throws RecognitionException {
        r_javaType_return retval = new r_javaType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal169=null;
        Token string_literal171=null;
        Token string_literal172=null;
        Token string_literal173=null;
        r_identifier_return r_identifier168 = null;

        r_identifier_return r_identifier170 = null;


        Object char_literal169_tree=null;
        Object string_literal171_tree=null;
        Object string_literal172_tree=null;
        Object string_literal173_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:168:2: ( r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:168:2: r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_identifier_in_r_javaType869);
            r_identifier168=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier168.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:169:2: ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==68) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==Identifier) ) {
                        int LA42_3 = input.LA(3);

                        if ( (LA42_3==32||LA42_3==34||LA42_3==68) ) {
                            alt42=1;
                        }


                    }
                    else if ( ((LA42_1>=69 && LA42_1<=71)) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:169:3: '.' ( r_identifier | 'Collection' | 'List' | 'Set' )
            	    {
            	    char_literal169=(Token)input.LT(1);
            	    match(input,68,FOLLOW_68_in_r_javaType875); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal169_tree = (Object)adaptor.create(char_literal169);
            	    adaptor.addChild(root_0, char_literal169_tree);
            	    }
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:169:7: ( r_identifier | 'Collection' | 'List' | 'Set' )
            	    int alt41=4;
            	    switch ( input.LA(1) ) {
            	    case Identifier:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt41=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("169:7: ( r_identifier | 'Collection' | 'List' | 'Set' )", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:169:8: r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType878);
            	            r_identifier170=r_identifier();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier170.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:169:22: 'Collection'
            	            {
            	            string_literal171=(Token)input.LT(1);
            	            match(input,69,FOLLOW_69_in_r_javaType881); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal171_tree = (Object)adaptor.create(string_literal171);
            	            adaptor.addChild(root_0, string_literal171_tree);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:170:2: 'List'
            	            {
            	            string_literal172=(Token)input.LT(1);
            	            match(input,70,FOLLOW_70_in_r_javaType887); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal172_tree = (Object)adaptor.create(string_literal172);
            	            adaptor.addChild(root_0, string_literal172_tree);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:170:10: 'Set'
            	            {
            	            string_literal173=(Token)input.LT(1);
            	            match(input,71,FOLLOW_71_in_r_javaType890); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal173_tree = (Object)adaptor.create(string_literal173);
            	            adaptor.addChild(root_0, string_literal173_tree);
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

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_javaType

    public static class r_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_expression
    // src/org/eclipse/xpand3/parser/Xpand3.g:176:1: r_expression : r_letExpression ;
    public r_expression_return r_expression() throws RecognitionException {
        r_expression_return retval = new r_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_letExpression_return r_letExpression174 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:177:2: ( r_letExpression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:177:2: r_letExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_letExpression_in_r_expression906);
            r_letExpression174=r_letExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_letExpression174.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_expression

    public static class r_letExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_letExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:180:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );
    public r_letExpression_return r_letExpression() throws RecognitionException {
        r_letExpression_return retval = new r_letExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal175=null;
        Token char_literal177=null;
        Token char_literal179=null;
        r_identifier_return r_identifier176 = null;

        r_castedExpression_return r_castedExpression178 = null;

        r_expression_return r_expression180 = null;

        r_castedExpression_return r_castedExpression181 = null;


        Object string_literal175_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:181:4: ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=StringLiteral && LA43_0<=Identifier)||LA43_0==31||LA43_0==36||LA43_0==59||(LA43_0>=69 && LA43_0<=71)||LA43_0==78||(LA43_0>=93 && LA43_0<=95)||(LA43_0>=97 && LA43_0<=109)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("180:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:181:4: 'let' r_identifier '=' r_castedExpression ':' r_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal175=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_r_letExpression920); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal175_tree = (Object)adaptor.create(string_literal175);
                    adaptor.addChild(root_0, string_literal175_tree);
                    }
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression922);
                    r_identifier176=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier176.getTree());
                    char_literal177=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_r_letExpression924); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal177_tree = (Object)adaptor.create(char_literal177);
                    adaptor.addChild(root_0, char_literal177_tree);
                    }
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression926);
                    r_castedExpression178=r_castedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_castedExpression178.getTree());
                    char_literal179=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_r_letExpression928); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal179_tree = (Object)adaptor.create(char_literal179);
                    adaptor.addChild(root_0, char_literal179_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_letExpression930);
                    r_expression180=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression180.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:182:4: r_castedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression936);
                    r_castedExpression181=r_castedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_castedExpression181.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_letExpression

    public static class r_castedExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_castedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:185:1: r_castedExpression : ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression );
    public r_castedExpression_return r_castedExpression() throws RecognitionException {
        r_castedExpression_return retval = new r_castedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal182=null;
        Token char_literal184=null;
        r_type_return r_type183 = null;

        r_chainExpression_return r_chainExpression185 = null;

        r_chainExpression_return r_chainExpression186 = null;


        Object char_literal182_tree=null;
        Object char_literal184_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:186:5: ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:186:5: ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal182=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_castedExpression962); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal182_tree = (Object)adaptor.create(char_literal182);
                    adaptor.addChild(root_0, char_literal182_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_castedExpression964);
                    r_type183=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type183.getTree());
                    char_literal184=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_castedExpression966); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal184_tree = (Object)adaptor.create(char_literal184);
                    adaptor.addChild(root_0, char_literal184_tree);
                    }
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression968);
                    r_chainExpression185=r_chainExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_chainExpression185.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:188:4: r_chainExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression974);
                    r_chainExpression186=r_chainExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_chainExpression186.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_castedExpression

    public static class r_chainExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_chainExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:191:1: r_chainExpression : r_ifExpression ( '->' r_ifExpression )* ;
    public r_chainExpression_return r_chainExpression() throws RecognitionException {
        r_chainExpression_return retval = new r_chainExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal188=null;
        r_ifExpression_return r_ifExpression187 = null;

        r_ifExpression_return r_ifExpression189 = null;


        Object string_literal188_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:192:2: ( r_ifExpression ( '->' r_ifExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:192:2: r_ifExpression ( '->' r_ifExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression986);
            r_ifExpression187=r_ifExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_ifExpression187.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:192:18: ( '->' r_ifExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==74) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:192:20: '->' r_ifExpression
            	    {
            	    string_literal188=(Token)input.LT(1);
            	    match(input,74,FOLLOW_74_in_r_chainExpression991); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal188_tree = (Object)adaptor.create(string_literal188);
            	    adaptor.addChild(root_0, string_literal188_tree);
            	    }
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression993);
            	    r_ifExpression189=r_ifExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_ifExpression189.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_chainExpression

    public static class r_ifExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_ifExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:195:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );
    public r_ifExpression_return r_ifExpression() throws RecognitionException {
        r_ifExpression_return retval = new r_ifExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal191=null;
        Token char_literal193=null;
        Token string_literal195=null;
        Token string_literal197=null;
        Token string_literal199=null;
        r_switchExpression_return r_switchExpression190 = null;

        r_expression_return r_expression192 = null;

        r_switchExpression_return r_switchExpression194 = null;

        r_expression_return r_expression196 = null;

        r_switchExpression_return r_switchExpression198 = null;

        r_switchExpression_return r_switchExpression200 = null;


        Object char_literal191_tree=null;
        Object char_literal193_tree=null;
        Object string_literal195_tree=null;
        Object string_literal197_tree=null;
        Object string_literal199_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:196:2: ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=StringLiteral && LA48_0<=Identifier)||LA48_0==31||LA48_0==36||(LA48_0>=69 && LA48_0<=71)||LA48_0==78||(LA48_0>=93 && LA48_0<=95)||(LA48_0>=97 && LA48_0<=109)) ) {
                alt48=1;
            }
            else if ( (LA48_0==59) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("195:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:196:2: r_switchExpression ( '?' r_expression ':' r_switchExpression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1007);
                    r_switchExpression190=r_switchExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression190.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:196:21: ( '?' r_expression ':' r_switchExpression )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==75) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:196:22: '?' r_expression ':' r_switchExpression
                            {
                            char_literal191=(Token)input.LT(1);
                            match(input,75,FOLLOW_75_in_r_ifExpression1010); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal191_tree = (Object)adaptor.create(char_literal191);
                            adaptor.addChild(root_0, char_literal191_tree);
                            }
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression1012);
                            r_expression192=r_expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression192.getTree());
                            char_literal193=(Token)input.LT(1);
                            match(input,61,FOLLOW_61_in_r_ifExpression1014); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal193_tree = (Object)adaptor.create(char_literal193);
                            adaptor.addChild(root_0, char_literal193_tree);
                            }
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1016);
                            r_switchExpression194=r_switchExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression194.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:197:3: 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal195=(Token)input.LT(1);
                    match(input,59,FOLLOW_59_in_r_ifExpression1023); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal195_tree = (Object)adaptor.create(string_literal195);
                    adaptor.addChild(root_0, string_literal195_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression1025);
                    r_expression196=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression196.getTree());
                    string_literal197=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_r_ifExpression1027); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal197_tree = (Object)adaptor.create(string_literal197);
                    adaptor.addChild(root_0, string_literal197_tree);
                    }
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1029);
                    r_switchExpression198=r_switchExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression198.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:197:47: ( 'else' r_switchExpression )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==77) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:197:48: 'else' r_switchExpression
                            {
                            string_literal199=(Token)input.LT(1);
                            match(input,77,FOLLOW_77_in_r_ifExpression1032); if (failed) return retval;
                            if ( backtracking==0 ) {
                            string_literal199_tree = (Object)adaptor.create(string_literal199);
                            adaptor.addChild(root_0, string_literal199_tree);
                            }
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1034);
                            r_switchExpression200=r_switchExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression200.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_ifExpression

    public static class r_switchExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_switchExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:200:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );
    public r_switchExpression_return r_switchExpression() throws RecognitionException {
        r_switchExpression_return retval = new r_switchExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal201=null;
        Token char_literal202=null;
        Token char_literal204=null;
        Token string_literal206=null;
        Token char_literal207=null;
        Token char_literal209=null;
        r_orExpression_return r_orExpression203 = null;

        r_casePart_return r_casePart205 = null;

        r_orExpression_return r_orExpression208 = null;

        r_orExpression_return r_orExpression210 = null;


        Object string_literal201_tree=null;
        Object char_literal202_tree=null;
        Object char_literal204_tree=null;
        Object string_literal206_tree=null;
        Object char_literal207_tree=null;
        Object char_literal209_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:201:4: ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==78) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=StringLiteral && LA51_0<=Identifier)||LA51_0==31||LA51_0==36||(LA51_0>=69 && LA51_0<=71)||(LA51_0>=93 && LA51_0<=95)||(LA51_0>=97 && LA51_0<=109)) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("200:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:201:4: 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal201=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_r_switchExpression1050); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal201_tree = (Object)adaptor.create(string_literal201);
                    adaptor.addChild(root_0, string_literal201_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:201:13: ( '(' r_orExpression ')' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==31) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:201:14: '(' r_orExpression ')'
                            {
                            char_literal202=(Token)input.LT(1);
                            match(input,31,FOLLOW_31_in_r_switchExpression1053); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal202_tree = (Object)adaptor.create(char_literal202);
                            adaptor.addChild(root_0, char_literal202_tree);
                            }
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1055);
                            r_orExpression203=r_orExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_orExpression203.getTree());
                            char_literal204=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_r_switchExpression1057); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal204_tree = (Object)adaptor.create(char_literal204);
                            adaptor.addChild(root_0, char_literal204_tree);
                            }

                            }
                            break;

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:202:2: ( r_casePart )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==81) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:202:2: r_casePart
                    	    {
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression1062);
                    	    r_casePart205=r_casePart();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, r_casePart205.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    string_literal206=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_r_switchExpression1068); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal206_tree = (Object)adaptor.create(string_literal206);
                    adaptor.addChild(root_0, string_literal206_tree);
                    }
                    char_literal207=(Token)input.LT(1);
                    match(input,61,FOLLOW_61_in_r_switchExpression1070); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal207_tree = (Object)adaptor.create(char_literal207);
                    adaptor.addChild(root_0, char_literal207_tree);
                    }
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1072);
                    r_orExpression208=r_orExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_orExpression208.getTree());
                    char_literal209=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_r_switchExpression1077); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal209_tree = (Object)adaptor.create(char_literal209);
                    adaptor.addChild(root_0, char_literal209_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:205:4: r_orExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1082);
                    r_orExpression210=r_orExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_orExpression210.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_switchExpression

    public static class r_casePart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_casePart
    // src/org/eclipse/xpand3/parser/Xpand3.g:208:1: r_casePart : 'case' r_expression ':' r_expression ;
    public r_casePart_return r_casePart() throws RecognitionException {
        r_casePart_return retval = new r_casePart_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal211=null;
        Token char_literal213=null;
        r_expression_return r_expression212 = null;

        r_expression_return r_expression214 = null;


        Object string_literal211_tree=null;
        Object char_literal213_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:209:2: ( 'case' r_expression ':' r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:209:2: 'case' r_expression ':' r_expression
            {
            root_0 = (Object)adaptor.nil();

            string_literal211=(Token)input.LT(1);
            match(input,81,FOLLOW_81_in_r_casePart1093); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal211_tree = (Object)adaptor.create(string_literal211);
            adaptor.addChild(root_0, string_literal211_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_casePart1095);
            r_expression212=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression212.getTree());
            char_literal213=(Token)input.LT(1);
            match(input,61,FOLLOW_61_in_r_casePart1097); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal213_tree = (Object)adaptor.create(char_literal213);
            adaptor.addChild(root_0, char_literal213_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_casePart1099);
            r_expression214=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression214.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_casePart

    public static class r_orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_orExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:211:1: r_orExpression : r_andExpression ( '||' r_andExpression )* ;
    public r_orExpression_return r_orExpression() throws RecognitionException {
        r_orExpression_return retval = new r_orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal216=null;
        r_andExpression_return r_andExpression215 = null;

        r_andExpression_return r_andExpression217 = null;


        Object string_literal216_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:212:4: ( r_andExpression ( '||' r_andExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:212:4: r_andExpression ( '||' r_andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_andExpression_in_r_orExpression1111);
            r_andExpression215=r_andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_andExpression215.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:212:21: ( '||' r_andExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==82) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:212:22: '||' r_andExpression
            	    {
            	    string_literal216=(Token)input.LT(1);
            	    match(input,82,FOLLOW_82_in_r_orExpression1115); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal216_tree = (Object)adaptor.create(string_literal216);
            	    adaptor.addChild(root_0, string_literal216_tree);
            	    }
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression1117);
            	    r_andExpression217=r_andExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_andExpression217.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_orExpression

    public static class r_andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_andExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:215:1: r_andExpression : r_impliesExpression ( '&&' r_impliesExpression )* ;
    public r_andExpression_return r_andExpression() throws RecognitionException {
        r_andExpression_return retval = new r_andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal219=null;
        r_impliesExpression_return r_impliesExpression218 = null;

        r_impliesExpression_return r_impliesExpression220 = null;


        Object string_literal219_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:216:2: ( r_impliesExpression ( '&&' r_impliesExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:216:2: r_impliesExpression ( '&&' r_impliesExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression1132);
            r_impliesExpression218=r_impliesExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_impliesExpression218.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:216:23: ( '&&' r_impliesExpression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==83) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:216:24: '&&' r_impliesExpression
            	    {
            	    string_literal219=(Token)input.LT(1);
            	    match(input,83,FOLLOW_83_in_r_andExpression1136); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal219_tree = (Object)adaptor.create(string_literal219);
            	    adaptor.addChild(root_0, string_literal219_tree);
            	    }
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression1138);
            	    r_impliesExpression220=r_impliesExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_impliesExpression220.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_andExpression

    public static class r_impliesExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_impliesExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:219:1: r_impliesExpression : r_relationalExpression ( 'implies' r_relationalExpression )* ;
    public r_impliesExpression_return r_impliesExpression() throws RecognitionException {
        r_impliesExpression_return retval = new r_impliesExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal222=null;
        r_relationalExpression_return r_relationalExpression221 = null;

        r_relationalExpression_return r_relationalExpression223 = null;


        Object string_literal222_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:220:2: ( r_relationalExpression ( 'implies' r_relationalExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:220:2: r_relationalExpression ( 'implies' r_relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression1153);
            r_relationalExpression221=r_relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_relationalExpression221.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:220:26: ( 'implies' r_relationalExpression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==84) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:220:27: 'implies' r_relationalExpression
            	    {
            	    string_literal222=(Token)input.LT(1);
            	    match(input,84,FOLLOW_84_in_r_impliesExpression1157); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal222_tree = (Object)adaptor.create(string_literal222);
            	    adaptor.addChild(root_0, string_literal222_tree);
            	    }
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression1159);
            	    r_relationalExpression223=r_relationalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_relationalExpression223.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_impliesExpression

    public static class r_relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_relationalExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:223:1: r_relationalExpression : r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* ;
    public r_relationalExpression_return r_relationalExpression() throws RecognitionException {
        r_relationalExpression_return retval = new r_relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set225=null;
        r_additiveExpression_return r_additiveExpression224 = null;

        r_additiveExpression_return r_additiveExpression226 = null;


        Object set225_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:224:2: ( r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:224:2: r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression1175);
            r_additiveExpression224=r_additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_additiveExpression224.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:225:2: ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=85 && LA55_0<=90)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:225:3: ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression
            	    {
            	    set225=(Token)input.LT(1);
            	    if ( (input.LA(1)>=85 && input.LA(1)<=90) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set225));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_relationalExpression1180);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression1204);
            	    r_additiveExpression226=r_additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_additiveExpression226.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_relationalExpression

    public static class r_additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_additiveExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:228:1: r_additiveExpression : r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* ;
    public r_additiveExpression_return r_additiveExpression() throws RecognitionException {
        r_additiveExpression_return retval = new r_additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set228=null;
        r_multiplicativeExpression_return r_multiplicativeExpression227 = null;

        r_multiplicativeExpression_return r_multiplicativeExpression229 = null;


        Object set228_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:229:2: ( r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:229:2: r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1217);
            r_multiplicativeExpression227=r_multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_multiplicativeExpression227.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:230:4: ( ( '+' | '-' ) r_multiplicativeExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==36) ) {
                    int LA56_2 = input.LA(2);

                    if ( ((LA56_2>=StringLiteral && LA56_2<=Identifier)||LA56_2==31||LA56_2==36||(LA56_2>=69 && LA56_2<=71)||(LA56_2>=93 && LA56_2<=95)||(LA56_2>=97 && LA56_2<=109)) ) {
                        alt56=1;
                    }


                }
                else if ( (LA56_0==91) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:230:5: ( '+' | '-' ) r_multiplicativeExpression
            	    {
            	    set228=(Token)input.LT(1);
            	    if ( input.LA(1)==36||input.LA(1)==91 ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set228));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_additiveExpression1224);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1231);
            	    r_multiplicativeExpression229=r_multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_multiplicativeExpression229.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_additiveExpression

    public static class r_multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_multiplicativeExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:233:1: r_multiplicativeExpression : r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* ;
    public r_multiplicativeExpression_return r_multiplicativeExpression() throws RecognitionException {
        r_multiplicativeExpression_return retval = new r_multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set231=null;
        r_unaryExpression_return r_unaryExpression230 = null;

        r_unaryExpression_return r_unaryExpression232 = null;


        Object set231_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:234:2: ( r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:234:2: r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1244);
            r_unaryExpression230=r_unaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_unaryExpression230.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:235:2: ( ( '*' | '/' ) r_unaryExpression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==33||LA57_0==92) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:235:3: ( '*' | '/' ) r_unaryExpression
            	    {
            	    set231=(Token)input.LT(1);
            	    if ( input.LA(1)==33||input.LA(1)==92 ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set231));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_multiplicativeExpression1249);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1257);
            	    r_unaryExpression232=r_unaryExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_unaryExpression232.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_multiplicativeExpression

    public static class r_unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_unaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:239:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );
    public r_unaryExpression_return r_unaryExpression() throws RecognitionException {
        r_unaryExpression_return retval = new r_unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal234=null;
        Token char_literal236=null;
        r_infixExpression_return r_infixExpression233 = null;

        r_infixExpression_return r_infixExpression235 = null;

        r_infixExpression_return r_infixExpression237 = null;


        Object char_literal234_tree=null;
        Object char_literal236_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:240:2: ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression )
            int alt58=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 31:
            case 69:
            case 70:
            case 71:
            case 94:
            case 95:
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
                alt58=1;
                }
                break;
            case 93:
                {
                alt58=2;
                }
                break;
            case 36:
                {
                alt58=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("239:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:240:2: r_infixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1271);
                    r_infixExpression233=r_infixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_infixExpression233.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:241:3: '!' r_infixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal234=(Token)input.LT(1);
                    match(input,93,FOLLOW_93_in_r_unaryExpression1276); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal234_tree = (Object)adaptor.create(char_literal234);
                    adaptor.addChild(root_0, char_literal234_tree);
                    }
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1278);
                    r_infixExpression235=r_infixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_infixExpression235.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:242:3: '-' r_infixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal236=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_r_unaryExpression1283); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal236_tree = (Object)adaptor.create(char_literal236);
                    adaptor.addChild(root_0, char_literal236_tree);
                    }
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1285);
                    r_infixExpression237=r_infixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_infixExpression237.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_unaryExpression

    public static class r_infixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_infixExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:245:1: r_infixExpression : r_primaryExpression ( '.' r_featureCall )* ;
    public r_infixExpression_return r_infixExpression() throws RecognitionException {
        r_infixExpression_return retval = new r_infixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal239=null;
        r_primaryExpression_return r_primaryExpression238 = null;

        r_featureCall_return r_featureCall240 = null;


        Object char_literal239_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:246:2: ( r_primaryExpression ( '.' r_featureCall )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:246:2: r_primaryExpression ( '.' r_featureCall )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression1296);
            r_primaryExpression238=r_primaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_primaryExpression238.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:246:23: ( '.' r_featureCall )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==68) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:246:25: '.' r_featureCall
            	    {
            	    char_literal239=(Token)input.LT(1);
            	    match(input,68,FOLLOW_68_in_r_infixExpression1301); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal239_tree = (Object)adaptor.create(char_literal239);
            	    adaptor.addChild(root_0, char_literal239_tree);
            	    }
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression1303);
            	    r_featureCall240=r_featureCall();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_featureCall240.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_infixExpression

    public static class r_primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_primaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:249:1: r_primaryExpression : ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );
    public r_primaryExpression_return r_primaryExpression() throws RecognitionException {
        r_primaryExpression_return retval = new r_primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral241=null;
        r_featureCall_return r_featureCall242 = null;

        r_booleanLiteral_return r_booleanLiteral243 = null;

        r_numberLiteral_return r_numberLiteral244 = null;

        r_nullLiteral_return r_nullLiteral245 = null;

        r_listLiteral_return r_listLiteral246 = null;

        r_constructorCall_return r_constructorCall247 = null;

        r_globalVarExpression_return r_globalVarExpression248 = null;

        r_paranthesizedExpression_return r_paranthesizedExpression249 = null;


        Object StringLiteral241_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:250:4: ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression )
            int alt60=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt60=1;
                }
                break;
            case Identifier:
            case 69:
            case 70:
            case 71:
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
                alt60=2;
                }
                break;
            case 98:
            case 99:
                {
                alt60=3;
                }
                break;
            case IntLiteral:
                {
                alt60=4;
                }
                break;
            case 100:
                {
                alt60=5;
                }
                break;
            case 95:
                {
                alt60=6;
                }
                break;
            case 97:
                {
                alt60=7;
                }
                break;
            case 94:
                {
                alt60=8;
                }
                break;
            case 31:
                {
                alt60=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("249:1: r_primaryExpression : ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:250:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral241=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_r_primaryExpression1321); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral241_tree = (Object)adaptor.create(StringLiteral241);
                    adaptor.addChild(root_0, StringLiteral241_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:251:5: r_featureCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression1329);
                    r_featureCall242=r_featureCall();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_featureCall242.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:252:5: r_booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression1336);
                    r_booleanLiteral243=r_booleanLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_booleanLiteral243.getTree());

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:253:5: r_numberLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression1343);
                    r_numberLiteral244=r_numberLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_numberLiteral244.getTree());

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:254:5: r_nullLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression1350);
                    r_nullLiteral245=r_nullLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_nullLiteral245.getTree());

                    }
                    break;
                case 6 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:255:5: r_listLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression1357);
                    r_listLiteral246=r_listLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_listLiteral246.getTree());

                    }
                    break;
                case 7 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:256:5: r_constructorCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression1364);
                    r_constructorCall247=r_constructorCall();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_constructorCall247.getTree());

                    }
                    break;
                case 8 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:257:5: r_globalVarExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression1371);
                    r_globalVarExpression248=r_globalVarExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_globalVarExpression248.getTree());

                    }
                    break;
                case 9 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:258:5: r_paranthesizedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression1378);
                    r_paranthesizedExpression249=r_paranthesizedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_paranthesizedExpression249.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_primaryExpression

    public static class r_paranthesizedExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_paranthesizedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:261:1: r_paranthesizedExpression : '(' r_expression ')' ;
    public r_paranthesizedExpression_return r_paranthesizedExpression() throws RecognitionException {
        r_paranthesizedExpression_return retval = new r_paranthesizedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal250=null;
        Token char_literal252=null;
        r_expression_return r_expression251 = null;


        Object char_literal250_tree=null;
        Object char_literal252_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:262:5: ( '(' r_expression ')' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:262:5: '(' r_expression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal250=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression1392); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal250_tree = (Object)adaptor.create(char_literal250);
            adaptor.addChild(root_0, char_literal250_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression1394);
            r_expression251=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression251.getTree());
            char_literal252=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_r_paranthesizedExpression1396); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal252_tree = (Object)adaptor.create(char_literal252);
            adaptor.addChild(root_0, char_literal252_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_paranthesizedExpression

    public static class r_globalVarExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_globalVarExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:265:1: r_globalVarExpression : 'GLOBALVAR' r_identifier ;
    public r_globalVarExpression_return r_globalVarExpression() throws RecognitionException {
        r_globalVarExpression_return retval = new r_globalVarExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal253=null;
        r_identifier_return r_identifier254 = null;


        Object string_literal253_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:266:5: ( 'GLOBALVAR' r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:266:5: 'GLOBALVAR' r_identifier
            {
            root_0 = (Object)adaptor.nil();

            string_literal253=(Token)input.LT(1);
            match(input,94,FOLLOW_94_in_r_globalVarExpression1411); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal253_tree = (Object)adaptor.create(string_literal253);
            adaptor.addChild(root_0, string_literal253_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression1413);
            r_identifier254=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier254.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_globalVarExpression

    public static class r_featureCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_featureCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:268:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );
    public r_featureCall_return r_featureCall() throws RecognitionException {
        r_featureCall_return retval = new r_featureCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal256=null;
        Token char_literal258=null;
        r_identifier_return r_identifier255 = null;

        r_parameterList_return r_parameterList257 = null;

        r_type_return r_type259 = null;

        r_collectionExpression_return r_collectionExpression260 = null;


        Object char_literal256_tree=null;
        Object char_literal258_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:269:5: ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression )
            int alt62=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==EOF||LA62_1==TEXT||LA62_1==Identifier||LA62_1==28||(LA62_1>=32 && LA62_1<=34)||(LA62_1>=36 && LA62_1<=37)||LA62_1==40||LA62_1==43||(LA62_1>=54 && LA62_1<=56)||(LA62_1>=60 && LA62_1<=61)||LA62_1==63||LA62_1==68||(LA62_1>=74 && LA62_1<=77)||(LA62_1>=79 && LA62_1<=92)||LA62_1==96) ) {
                    alt62=2;
                }
                else if ( (LA62_1==31) ) {
                    alt62=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("268:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );", 62, 1, input);

                    throw nvae;
                }
                }
                break;
            case 69:
            case 70:
            case 71:
                {
                alt62=2;
                }
                break;
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
                alt62=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("268:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:269:5: r_identifier '(' ( r_parameterList )? ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_identifier_in_r_featureCall1427);
                    r_identifier255=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier255.getTree());
                    char_literal256=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_featureCall1429); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal256_tree = (Object)adaptor.create(char_literal256);
                    adaptor.addChild(root_0, char_literal256_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:269:22: ( r_parameterList )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=StringLiteral && LA61_0<=Identifier)||LA61_0==31||LA61_0==36||LA61_0==59||(LA61_0>=69 && LA61_0<=72)||LA61_0==78||(LA61_0>=93 && LA61_0<=95)||(LA61_0>=97 && LA61_0<=109)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:269:23: r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall1432);
                            r_parameterList257=r_parameterList();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_parameterList257.getTree());

                            }
                            break;

                    }

                    char_literal258=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_featureCall1436); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal258_tree = (Object)adaptor.create(char_literal258);
                    adaptor.addChild(root_0, char_literal258_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:270:5: r_type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_type_in_r_featureCall1443);
                    r_type259=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type259.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:271:5: r_collectionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall1451);
                    r_collectionExpression260=r_collectionExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_collectionExpression260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_featureCall

    public static class r_listLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_listLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:274:1: r_listLiteral : '[' ( r_expression ( ',' r_expression )* )? ']' ;
    public r_listLiteral_return r_listLiteral() throws RecognitionException {
        r_listLiteral_return retval = new r_listLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal261=null;
        Token char_literal263=null;
        Token char_literal265=null;
        r_expression_return r_expression262 = null;

        r_expression_return r_expression264 = null;


        Object char_literal261_tree=null;
        Object char_literal263_tree=null;
        Object char_literal265_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:275:2: ( '[' ( r_expression ( ',' r_expression )* )? ']' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:275:2: '[' ( r_expression ( ',' r_expression )* )? ']'
            {
            root_0 = (Object)adaptor.nil();

            char_literal261=(Token)input.LT(1);
            match(input,95,FOLLOW_95_in_r_listLiteral1463); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal261_tree = (Object)adaptor.create(char_literal261);
            adaptor.addChild(root_0, char_literal261_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:275:5: ( r_expression ( ',' r_expression )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=StringLiteral && LA64_0<=Identifier)||LA64_0==31||LA64_0==36||LA64_0==59||(LA64_0>=69 && LA64_0<=72)||LA64_0==78||(LA64_0>=93 && LA64_0<=95)||(LA64_0>=97 && LA64_0<=109)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:275:6: r_expression ( ',' r_expression )*
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral1465);
                    r_expression262=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression262.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:275:19: ( ',' r_expression )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==32) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:275:20: ',' r_expression
                    	    {
                    	    char_literal263=(Token)input.LT(1);
                    	    match(input,32,FOLLOW_32_in_r_listLiteral1468); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal263_tree = (Object)adaptor.create(char_literal263);
                    	    adaptor.addChild(root_0, char_literal263_tree);
                    	    }
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral1470);
                    	    r_expression264=r_expression();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression264.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal265=(Token)input.LT(1);
            match(input,96,FOLLOW_96_in_r_listLiteral1475); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal265_tree = (Object)adaptor.create(char_literal265);
            adaptor.addChild(root_0, char_literal265_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_listLiteral

    public static class r_constructorCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_constructorCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:278:1: r_constructorCall : 'new' r_simpleType ;
    public r_constructorCall_return r_constructorCall() throws RecognitionException {
        r_constructorCall_return retval = new r_constructorCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal266=null;
        r_simpleType_return r_simpleType267 = null;


        Object string_literal266_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:279:2: ( 'new' r_simpleType )
            // src/org/eclipse/xpand3/parser/Xpand3.g:279:2: 'new' r_simpleType
            {
            root_0 = (Object)adaptor.nil();

            string_literal266=(Token)input.LT(1);
            match(input,97,FOLLOW_97_in_r_constructorCall1486); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal266_tree = (Object)adaptor.create(string_literal266);
            adaptor.addChild(root_0, string_literal266_tree);
            }
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall1488);
            r_simpleType267=r_simpleType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType267.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_constructorCall

    public static class r_booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_booleanLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:283:1: r_booleanLiteral : ( 'false' | 'true' );
    public r_booleanLiteral_return r_booleanLiteral() throws RecognitionException {
        r_booleanLiteral_return retval = new r_booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set268=null;

        Object set268_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:284:2: ( 'false' | 'true' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:
            {
            root_0 = (Object)adaptor.nil();

            set268=(Token)input.LT(1);
            if ( (input.LA(1)>=98 && input.LA(1)<=99) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set268));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_booleanLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_booleanLiteral

    public static class r_nullLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_nullLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:287:1: r_nullLiteral : 'null' ;
    public r_nullLiteral_return r_nullLiteral() throws RecognitionException {
        r_nullLiteral_return retval = new r_nullLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal269=null;

        Object string_literal269_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:288:2: ( 'null' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:288:2: 'null'
            {
            root_0 = (Object)adaptor.nil();

            string_literal269=(Token)input.LT(1);
            match(input,100,FOLLOW_100_in_r_nullLiteral1514); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal269_tree = (Object)adaptor.create(string_literal269);
            adaptor.addChild(root_0, string_literal269_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_nullLiteral

    public static class r_numberLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_numberLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );
    public r_numberLiteral_return r_numberLiteral() throws RecognitionException {
        r_numberLiteral_return retval = new r_numberLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IntLiteral270=null;
        Token IntLiteral271=null;
        Token char_literal272=null;
        Token IntLiteral273=null;

        Object IntLiteral270_tree=null;
        Object IntLiteral271_tree=null;
        Object char_literal272_tree=null;
        Object IntLiteral273_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:292:4: ( IntLiteral | IntLiteral '.' IntLiteral )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IntLiteral) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==68) ) {
                    int LA65_2 = input.LA(3);

                    if ( (LA65_2==IntLiteral) ) {
                        alt65=2;
                    }
                    else if ( (LA65_2==Identifier||(LA65_2>=69 && LA65_2<=71)||(LA65_2>=101 && LA65_2<=109)) ) {
                        alt65=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA65_1==EOF||LA65_1==TEXT||LA65_1==Identifier||LA65_1==28||(LA65_1>=32 && LA65_1<=34)||(LA65_1>=36 && LA65_1<=37)||LA65_1==40||LA65_1==43||(LA65_1>=54 && LA65_1<=56)||(LA65_1>=60 && LA65_1<=61)||(LA65_1>=74 && LA65_1<=77)||(LA65_1>=79 && LA65_1<=92)||LA65_1==96) ) {
                    alt65=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:292:4: IntLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntLiteral270=(Token)input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1527); if (failed) return retval;
                    if ( backtracking==0 ) {
                    IntLiteral270_tree = (Object)adaptor.create(IntLiteral270);
                    adaptor.addChild(root_0, IntLiteral270_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:293:4: IntLiteral '.' IntLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntLiteral271=(Token)input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1533); if (failed) return retval;
                    if ( backtracking==0 ) {
                    IntLiteral271_tree = (Object)adaptor.create(IntLiteral271);
                    adaptor.addChild(root_0, IntLiteral271_tree);
                    }
                    char_literal272=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_r_numberLiteral1535); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal272_tree = (Object)adaptor.create(char_literal272);
                    adaptor.addChild(root_0, char_literal272_tree);
                    }
                    IntLiteral273=(Token)input.LT(1);
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1537); if (failed) return retval;
                    if ( backtracking==0 ) {
                    IntLiteral273_tree = (Object)adaptor.create(IntLiteral273);
                    adaptor.addChild(root_0, IntLiteral273_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_numberLiteral

    public static class r_collectionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_collectionExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:296:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );
    public r_collectionExpression_return r_collectionExpression() throws RecognitionException {
        r_collectionExpression_return retval = new r_collectionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal274=null;
        Token char_literal275=null;
        Token char_literal277=null;
        Token set278=null;
        Token char_literal279=null;
        Token char_literal281=null;
        Token char_literal283=null;
        r_type_return r_type276 = null;

        r_identifier_return r_identifier280 = null;

        r_expression_return r_expression282 = null;


        Object string_literal274_tree=null;
        Object char_literal275_tree=null;
        Object char_literal277_tree=null;
        Object set278_tree=null;
        Object char_literal279_tree=null;
        Object char_literal281_tree=null;
        Object char_literal283_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:297:3: ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==101) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=102 && LA67_0<=109)) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("296:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:297:3: 'typeSelect' '(' r_type ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal274=(Token)input.LT(1);
                    match(input,101,FOLLOW_101_in_r_collectionExpression1550); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal274_tree = (Object)adaptor.create(string_literal274);
                    adaptor.addChild(root_0, string_literal274_tree);
                    }
                    char_literal275=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_collectionExpression1554); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal275_tree = (Object)adaptor.create(char_literal275);
                    adaptor.addChild(root_0, char_literal275_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression1556);
                    r_type276=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type276.getTree());
                    char_literal277=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_collectionExpression1558); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal277_tree = (Object)adaptor.create(char_literal277);
                    adaptor.addChild(root_0, char_literal277_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:300:4: ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    set278=(Token)input.LT(1);
                    if ( (input.LA(1)>=102 && input.LA(1)<=109) ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set278));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionExpression1567);    throw mse;
                    }

                    char_literal279=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_r_collectionExpression1617); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal279_tree = (Object)adaptor.create(char_literal279);
                    adaptor.addChild(root_0, char_literal279_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:307:19: ( r_identifier '|' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==Identifier) ) {
                        int LA66_1 = input.LA(2);

                        if ( (LA66_1==110) ) {
                            alt66=1;
                        }
                    }
                    switch (alt66) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:307:20: r_identifier '|'
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression1620);
                            r_identifier280=r_identifier();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier280.getTree());
                            char_literal281=(Token)input.LT(1);
                            match(input,110,FOLLOW_110_in_r_collectionExpression1622); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal281_tree = (Object)adaptor.create(char_literal281);
                            adaptor.addChild(root_0, char_literal281_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression1626);
                    r_expression282=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression282.getTree());
                    char_literal283=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_r_collectionExpression1628); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal283_tree = (Object)adaptor.create(char_literal283);
                    adaptor.addChild(root_0, char_literal283_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_collectionExpression

    public static class r_declaredParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_declaredParameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:313:1: r_declaredParameterList : r_declaredParameter ( ',' r_declaredParameter )* ;
    public r_declaredParameterList_return r_declaredParameterList() throws RecognitionException {
        r_declaredParameterList_return retval = new r_declaredParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal285=null;
        r_declaredParameter_return r_declaredParameter284 = null;

        r_declaredParameter_return r_declaredParameter286 = null;


        Object char_literal285_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:314:2: ( r_declaredParameter ( ',' r_declaredParameter )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:314:2: r_declaredParameter ( ',' r_declaredParameter )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1645);
            r_declaredParameter284=r_declaredParameter();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameter284.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:314:22: ( ',' r_declaredParameter )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==32) ) {
                    int LA68_1 = input.LA(2);

                    if ( (LA68_1==Identifier||(LA68_1>=69 && LA68_1<=71)) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:314:23: ',' r_declaredParameter
            	    {
            	    char_literal285=(Token)input.LT(1);
            	    match(input,32,FOLLOW_32_in_r_declaredParameterList1648); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal285_tree = (Object)adaptor.create(char_literal285);
            	    adaptor.addChild(root_0, char_literal285_tree);
            	    }
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1650);
            	    r_declaredParameter286=r_declaredParameter();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameter286.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_declaredParameterList

    public static class r_declaredParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_declaredParameter
    // src/org/eclipse/xpand3/parser/Xpand3.g:317:1: r_declaredParameter : r_type r_identifier ;
    public r_declaredParameter_return r_declaredParameter() throws RecognitionException {
        r_declaredParameter_return retval = new r_declaredParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_type_return r_type287 = null;

        r_identifier_return r_identifier288 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:318:2: ( r_type r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:318:2: r_type r_identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_type_in_r_declaredParameter1663);
            r_type287=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type287.getTree());
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter1665);
            r_identifier288=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier288.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_declaredParameter

    public static class r_parameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_parameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:321:1: r_parameterList : r_expression ( ',' r_expression )* ;
    public r_parameterList_return r_parameterList() throws RecognitionException {
        r_parameterList_return retval = new r_parameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal290=null;
        r_expression_return r_expression289 = null;

        r_expression_return r_expression291 = null;


        Object char_literal290_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:322:5: ( r_expression ( ',' r_expression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:322:5: r_expression ( ',' r_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_expression_in_r_parameterList1680);
            r_expression289=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression289.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:322:19: ( ',' r_expression )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==32) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:322:20: ',' r_expression
            	    {
            	    char_literal290=(Token)input.LT(1);
            	    match(input,32,FOLLOW_32_in_r_parameterList1684); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal290_tree = (Object)adaptor.create(char_literal290);
            	    adaptor.addChild(root_0, char_literal290_tree);
            	    }
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList1686);
            	    r_expression291=r_expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression291.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_parameterList

    public static class r_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_type
    // src/org/eclipse/xpand3/parser/Xpand3.g:327:1: r_type : ( r_collectionType | r_simpleType );
    public r_type_return r_type() throws RecognitionException {
        r_type_return retval = new r_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_collectionType_return r_collectionType292 = null;

        r_simpleType_return r_simpleType293 = null;



        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:328:2: ( r_collectionType | r_simpleType )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=69 && LA70_0<=71)) ) {
                alt70=1;
            }
            else if ( (LA70_0==Identifier) ) {
                alt70=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("327:1: r_type : ( r_collectionType | r_simpleType );", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:328:2: r_collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_collectionType_in_r_type1703);
                    r_collectionType292=r_collectionType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_collectionType292.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:329:2: r_simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_simpleType_in_r_type1708);
                    r_simpleType293=r_simpleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType293.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_type

    public static class r_collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_collectionType
    // src/org/eclipse/xpand3/parser/Xpand3.g:332:1: r_collectionType : ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? ;
    public r_collectionType_return r_collectionType() throws RecognitionException {
        r_collectionType_return retval = new r_collectionType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set294=null;
        Token char_literal295=null;
        Token char_literal297=null;
        r_simpleType_return r_simpleType296 = null;


        Object set294_tree=null;
        Object char_literal295_tree=null;
        Object char_literal297_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:333:3: ( ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:333:3: ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )?
            {
            root_0 = (Object)adaptor.nil();

            set294=(Token)input.LT(1);
            if ( (input.LA(1)>=69 && input.LA(1)<=71) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set294));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionType1723);    throw mse;
            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:334:3: ( '[' r_simpleType ']' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==95) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:334:4: '[' r_simpleType ']'
                    {
                    char_literal295=(Token)input.LT(1);
                    match(input,95,FOLLOW_95_in_r_collectionType1741); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal295_tree = (Object)adaptor.create(char_literal295);
                    adaptor.addChild(root_0, char_literal295_tree);
                    }
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType1743);
                    r_simpleType296=r_simpleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType296.getTree());
                    char_literal297=(Token)input.LT(1);
                    match(input,96,FOLLOW_96_in_r_collectionType1745); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal297_tree = (Object)adaptor.create(char_literal297);
                    adaptor.addChild(root_0, char_literal297_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_collectionType

    public static class r_simpleType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_simpleType
    // src/org/eclipse/xpand3/parser/Xpand3.g:337:1: r_simpleType : r_identifier ( '::' r_identifier )* ;
    public r_simpleType_return r_simpleType() throws RecognitionException {
        r_simpleType_return retval = new r_simpleType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal299=null;
        r_identifier_return r_identifier298 = null;

        r_identifier_return r_identifier300 = null;


        Object string_literal299_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:338:2: ( r_identifier ( '::' r_identifier )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:338:2: r_identifier ( '::' r_identifier )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_identifier_in_r_simpleType1758);
            r_identifier298=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier298.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:339:2: ( '::' r_identifier )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==63) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:339:3: '::' r_identifier
            	    {
            	    string_literal299=(Token)input.LT(1);
            	    match(input,63,FOLLOW_63_in_r_simpleType1763); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal299_tree = (Object)adaptor.create(string_literal299);
            	    adaptor.addChild(root_0, string_literal299_tree);
            	    }
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType1765);
            	    r_identifier300=r_identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier300.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_simpleType

    public static class r_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_identifier
    // src/org/eclipse/xpand3/parser/Xpand3.g:342:1: r_identifier : Identifier ;
    public r_identifier_return r_identifier() throws RecognitionException {
        r_identifier_return retval = new r_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier301=null;

        Object Identifier301_tree=null;

        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:343:4: ( Identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:343:4: Identifier
            {
            root_0 = (Object)adaptor.nil();

            Identifier301=(Token)input.LT(1);
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier1781); if (failed) return retval;
            if ( backtracking==0 ) {
            Identifier301_tree = (Object)adaptor.create(Identifier301);
            adaptor.addChild(root_0, Identifier301_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end r_identifier

    // $ANTLR start synpred1
    public void synpred1_fragment() throws RecognitionException {   
        // src/org/eclipse/xpand3/parser/Xpand3.g:186:5: ( '(' r_type ')' r_castedExpression )
        // src/org/eclipse/xpand3/parser/Xpand3.g:186:6: '(' r_type ')' r_castedExpression
        {
        match(input,31,FOLLOW_31_in_synpred1951); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred1953);
        r_type();
        _fsp--;
        if (failed) return ;
        match(input,34,FOLLOW_34_in_synpred1955); if (failed) return ;
        pushFollow(FOLLOW_r_castedExpression_in_synpred1957);
        r_castedExpression();
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


    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA44_eotS =
        "\67\uffff";
    static final String DFA44_eofS =
        "\6\uffff\1\2\60\uffff";
    static final String DFA44_minS =
        "\2\13\1\uffff\1\41\1\37\1\15\1\12\1\15\1\77\2\uffff\1\0\13\uffff"+
        "\1\12\1\uffff\1\41\1\15\1\41\3\0\2\37\4\0\2\15\1\0\1\77\1\15\3\0"+
        "\2\42\1\15\1\0\1\15\1\77\1\42\1\15\1\42\1\77";
    static final String DFA44_maxS =
        "\2\155\1\uffff\1\137\1\134\1\15\1\155\1\15\1\140\2\uffff\1\0\13"+
        "\uffff\1\155\1\uffff\1\134\1\15\1\134\3\0\2\37\4\0\2\15\1\0\1\140"+
        "\1\107\3\0\1\137\1\77\1\15\1\0\1\15\1\140\1\77\1\15\1\42\1\140";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\6\uffff\2\1\1\uffff\13\1\1\uffff\1\1\36\uffff";
    static final String DFA44_specialS =
        "\6\uffff\1\10\4\uffff\1\13\20\uffff\1\4\1\3\1\15\2\uffff\1\7\1\14"+
        "\1\5\1\0\2\uffff\1\6\2\uffff\1\2\1\1\1\11\3\uffff\1\12\6\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\2\21\uffff\1\1\4\uffff\1\2\26\uffff\1\2\11\uffff\3\2\6\uffff"+
            "\1\2\16\uffff\3\2\1\uffff\15\2",
            "\2\2\1\4\21\uffff\1\2\4\uffff\1\2\26\uffff\1\2\11\uffff\3\3"+
            "\1\2\5\uffff\1\2\16\uffff\3\2\1\uffff\15\2",
            "",
            "\1\2\1\6\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\6\uffff\13\2\2"+
            "\uffff\1\5",
            "\1\2\1\uffff\1\2\1\6\1\uffff\1\2\32\uffff\1\7\4\uffff\1\2\5"+
            "\uffff\2\2\6\uffff\13\2",
            "\1\10",
            "\1\2\1\12\1\20\1\13\16\uffff\1\2\2\uffff\1\25\3\2\1\uffff\1"+
            "\27\1\2\2\uffff\1\2\2\uffff\1\2\12\uffff\3\2\2\uffff\1\30\2"+
            "\2\6\uffff\1\2\3\14\2\uffff\3\2\1\uffff\1\11\1\2\1\uffff\14"+
            "\2\1\26\1\24\1\22\1\2\1\23\2\17\1\21\1\15\10\16",
            "\1\31",
            "\1\32\40\uffff\1\33",
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
            "\1\2\1\34\1\42\1\35\21\uffff\1\47\4\uffff\1\2\40\uffff\3\36"+
            "\25\uffff\1\2\1\46\1\44\1\uffff\1\45\2\41\1\43\1\37\10\40",
            "",
            "\1\2\1\6\1\uffff\1\2\32\uffff\1\7\4\uffff\1\2\5\uffff\2\2\6"+
            "\uffff\13\2",
            "\1\50",
            "\1\2\1\6\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\6\uffff\13\2",
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
            "\1\32\40\uffff\1\33",
            "\1\56\67\uffff\3\55",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\60\74\uffff\1\57",
            "\1\60\34\uffff\1\61",
            "\1\62",
            "\1\uffff",
            "\1\63",
            "\1\64\40\uffff\1\65",
            "\1\60\34\uffff\1\61",
            "\1\66",
            "\1\60",
            "\1\64\40\uffff\1\65"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "185:1: r_castedExpression : ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_36 = input.LA(1);

                         
                        int index44_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_43 = input.LA(1);

                         
                        int index44_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_43);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_42 = input.LA(1);

                         
                        int index44_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_42);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_29 = input.LA(1);

                         
                        int index44_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_29);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_28 = input.LA(1);

                         
                        int index44_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_28);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_35 = input.LA(1);

                         
                        int index44_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_35);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_39 = input.LA(1);

                         
                        int index44_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_39);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_33 = input.LA(1);

                         
                        int index44_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_33);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_6==78) && (synpred1())) {s = 9;}

                        else if ( (LA44_6==StringLiteral) && (synpred1())) {s = 10;}

                        else if ( (LA44_6==Identifier) ) {s = 11;}

                        else if ( ((LA44_6>=69 && LA44_6<=71)) && (synpred1())) {s = 12;}

                        else if ( (LA44_6==101) && (synpred1())) {s = 13;}

                        else if ( ((LA44_6>=102 && LA44_6<=109)) && (synpred1())) {s = 14;}

                        else if ( ((LA44_6>=98 && LA44_6<=99)) && (synpred1())) {s = 15;}

                        else if ( (LA44_6==IntLiteral) && (synpred1())) {s = 16;}

                        else if ( (LA44_6==100) && (synpred1())) {s = 17;}

                        else if ( (LA44_6==95) && (synpred1())) {s = 18;}

                        else if ( (LA44_6==97) && (synpred1())) {s = 19;}

                        else if ( (LA44_6==94) && (synpred1())) {s = 20;}

                        else if ( (LA44_6==31) && (synpred1())) {s = 21;}

                        else if ( (LA44_6==93) && (synpred1())) {s = 22;}

                        else if ( (LA44_6==36) ) {s = 23;}

                        else if ( (LA44_6==59) && (synpred1())) {s = 24;}

                        else if ( (LA44_6==EOF||LA44_6==TEXT||LA44_6==28||(LA44_6>=32 && LA44_6<=34)||LA44_6==37||LA44_6==40||LA44_6==43||(LA44_6>=54 && LA44_6<=56)||(LA44_6>=60 && LA44_6<=61)||LA44_6==68||(LA44_6>=74 && LA44_6<=76)||LA44_6==79||(LA44_6>=81 && LA44_6<=92)||LA44_6==96) ) {s = 2;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_44 = input.LA(1);

                         
                        int index44_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_44);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_48 = input.LA(1);

                         
                        int index44_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_48);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA44_34 = input.LA(1);

                         
                        int index44_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_34);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA44_30 = input.LA(1);

                         
                        int index44_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file50 = new BitSet(new long[]{0x4400000028002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file56 = new BitSet(new long[]{0x4400000000002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_EOF_in_r_file63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport73 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_r_nsImport75 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport77 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport84 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_nsImport86 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport88 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_r_nsImport95 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport97 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_r_nsImport106 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport108 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_r_nsImport111 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definition_in_r_abstractDeclaration141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definitionAround_in_r_abstractDeclaration146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definition158 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_r_definition160 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_definition162 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definition165 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definition168 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definition171 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definition174 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definition180 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definition184 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definition188 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definition190 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definition193 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_r_definition196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definition198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definitionAround210 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_r_definitionAround212 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_definitionAround214 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definitionAround217 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definitionAround220 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definitionAround223 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround226 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround232 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definitionAround236 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definitionAround240 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definitionAround242 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definitionAround245 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_r_definitionAround248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definitionAround250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence262 = new BitSet(new long[]{0x081442F080003802L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_statement_in_r_sequence268 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence274 = new BitSet(new long[]{0x081442F080003802L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_simpleStatement_in_r_statement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_fileStatement_in_r_statement294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_foreachStatement_in_r_statement299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifStatement_in_r_statement304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letStatement_in_r_statement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_protectStatement_in_r_statement314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence325 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence328 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_r_text340 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_r_text343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_errorStatement_in_r_simpleStatement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expandStatement_in_r_simpleStatement358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expressionStmt_in_r_simpleStatement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_r_errorStatement373 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_errorStatement375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_r_expandStatement386 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_expandStatement388 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_r_expandStatement391 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_expandStatement393 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_expandStatement395 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_r_expandStatement401 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_expandStatement411 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement412 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_r_expandStatement415 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_expressionStmt433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_fileStatement443 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_fileStatement445 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_r_identifier_in_r_fileStatement448 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_fileStatement454 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_r_fileStatement458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_foreachStatement470 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement472 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_foreachStatement474 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement476 = new BitSet(new long[]{0x0000111000000400L});
    public static final BitSet FOLLOW_44_in_r_foreachStatement479 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement481 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_r_foreachStatement486 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement488 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_foreachStatement496 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_r_foreachStatement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_r_ifStatement516 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifStatement518 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_ifStatement522 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseIfStatement_in_r_ifStatement527 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseStatement_in_r_ifStatement532 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_r_ifStatement537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_r_elseIfStatement547 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_elseIfStatement549 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseIfStatement553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_r_elseStatement565 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseStatement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_letStatement581 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letStatement583 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_letStatement585 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letStatement587 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_letStatement593 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_r_letStatement598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_r_protectStatement609 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_r_protectStatement614 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement616 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_r_protectStatement621 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement623 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_r_protectStatement636 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement638 = new BitSet(new long[]{0x0100001000000400L});
    public static final BitSet FOLLOW_56_in_r_protectStatement640 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_protectStatement646 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_r_protectStatement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_r_check662 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_check664 = new BitSet(new long[]{0x1800002000000000L});
    public static final BitSet FOLLOW_59_in_r_check667 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check669 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_set_in_r_check673 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check679 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_check681 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check685 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_check687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_r_around702 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around704 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around706 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around709 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_around712 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_around715 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_around721 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_around725 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_around727 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_around734 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_around736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_r_pointcut753 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut759 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_33_in_r_pointcut767 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut775 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_63_in_r_pointcut783 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_set_in_r_extension797 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_type_in_r_extension806 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension809 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension811 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension814 = new BitSet(new long[]{0x0000000400002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension816 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_extension819 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_extension821 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E8L});
    public static final BitSet FOLLOW_67_in_r_extension826 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_extension830 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension832 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension834 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension836 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_r_extension839 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension841 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_r_extension848 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension855 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extension858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_javaType875 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_r_javaType881 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_r_javaType887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_r_javaType890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_r_letExpression920 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_r_letExpression924 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00040E0L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression926 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_letExpression928 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_castedExpression962 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression964 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_castedExpression966 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00040E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_r_chainExpression991 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00040E0L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_r_ifExpression1010 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression1012 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_ifExpression1014 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00040E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_r_ifExpression1023 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_r_ifExpression1027 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00040E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1029 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_r_ifExpression1032 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00040E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_r_switchExpression1050 = new BitSet(new long[]{0x0000000080000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression1053 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1055 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_switchExpression1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_79_in_r_switchExpression1068 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_switchExpression1070 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_r_switchExpression1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_r_casePart1093 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart1095 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_casePart1097 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression1111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_r_orExpression1115 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression1117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression1132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_r_andExpression1136 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression1138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression1153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_r_impliesExpression1157 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression1159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression1175 = new BitSet(new long[]{0x0000000000000002L,0x0000000007E00000L});
    public static final BitSet FOLLOW_set_in_r_relationalExpression1180 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression1204 = new BitSet(new long[]{0x0000000000000002L,0x0000000007E00000L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1217 = new BitSet(new long[]{0x0000001000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_r_additiveExpression1224 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1231 = new BitSet(new long[]{0x0000001000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1244 = new BitSet(new long[]{0x0000000200000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_set_in_r_multiplicativeExpression1249 = new BitSet(new long[]{0x0000001080003800L,0x00003FFEE00000E0L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1257 = new BitSet(new long[]{0x0000000200000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_r_unaryExpression1276 = new BitSet(new long[]{0x0000000080003800L,0x00003FFEC00000E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_r_unaryExpression1283 = new BitSet(new long[]{0x0000000080003800L,0x00003FFEC00000E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression1296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_infixExpression1301 = new BitSet(new long[]{0x0000000000002000L,0x00003FE0000000E0L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression1303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_StringLiteral_in_r_primaryExpression1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression1392 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression1394 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_paranthesizedExpression1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_r_globalVarExpression1411 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall1427 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall1429 = new BitSet(new long[]{0x0800001480003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall1432 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_featureCall1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_r_listLiteral1463 = new BitSet(new long[]{0x0800001080003800L,0x00003FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral1465 = new BitSet(new long[]{0x0000000100000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_r_listLiteral1468 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral1470 = new BitSet(new long[]{0x0000000100000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_r_listLiteral1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_r_constructorCall1486 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_r_nullLiteral1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_numberLiteral1535 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_r_collectionExpression1550 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1554 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression1556 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionExpression1567 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1617 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression1620 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_r_collectionExpression1622 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression1626 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1645 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_declaredParameterList1648 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1650 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter1663 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1680 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_parameterList1684 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1686 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionType1723 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_r_collectionType1741 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_r_collectionType1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1758 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_r_simpleType1763 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1765 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1951 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_synpred1953 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred1955 = new BitSet(new long[]{0x0800001080003800L,0x00003FFEE00040E0L});
    public static final BitSet FOLLOW_r_castedExpression_in_synpred1957 = new BitSet(new long[]{0x0000000000000002L});

}