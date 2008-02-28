// $ANTLR 3.0.1 src/org/eclipse/xpand3/parser/Xpand3.g 2008-02-28 13:17:13
 	
package org.eclipse.xpand3.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/** START EDITED 'abstract' added */
public abstract class Xpand3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LG", "RG", "DEFINE", "ENDDEFINE", "AROUND", "ENDAROUND", "TEXT", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "REM_COMMENT_OUT", "REM_COMMENT", "'IMPORT'", "'EXTENSION'", "'import'", "';'", "'extension'", "'reexport'", "'('", "','", "'*'", "')'", "'FOR'", "'-'", "'ERROR'", "'EXPAND'", "'FOREACH'", "'SEPARATOR'", "'FILE'", "'ENDFILE'", "'AS'", "'ITERATOR'", "'ENDFOREACH'", "'IF'", "'ENDIF'", "'ELSEIF'", "'ELSE'", "'LET'", "'ENDLET'", "'PROTECT'", "'CSTART'", "'CEND'", "'ID'", "'DISABLE'", "'ENDPROTECT'", "'context'", "'if'", "'WARNING'", "':'", "'around'", "'::'", "'private'", "'cached'", "'create'", "'JAVA'", "'.'", "'Collection'", "'List'", "'Set'", "'let'", "'='", "'->'", "'?'", "'then'", "'else'", "'switch'", "'default'", "'}'", "'case'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'/'", "'!'", "'GLOBALVAR'", "'{'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'", "'['", "']'"
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
            ruleMemo = new HashMap[59+1];
         }
        
    
    /* START EDITED */
    protected abstract void ruleEntered(String ruleName);
	protected abstract void ruleLeft(String ruleName);
	protected abstract void tokenConsumed(String name, CommonToken ct);
    /* END EDITED */

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "src/org/eclipse/xpand3/parser/Xpand3.g"; }



    // $ANTLR start r_file
    // src/org/eclipse/xpand3/parser/Xpand3.g:15:1: r_file : ( r_nsImport )* ( r_abstractDeclaration )* EOF ;
    public final void r_file() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_file");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:15:9: ( ( r_nsImport )* ( r_abstractDeclaration )* EOF )
            // src/org/eclipse/xpand3/parser/Xpand3.g:16:2: ( r_nsImport )* ( r_abstractDeclaration )* EOF
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:16:2: ( r_nsImport )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:16:3: r_nsImport
            	    {
            	    pushFollow(FOLLOW_r_nsImport_in_r_file40);
            	    r_nsImport();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:17:2: ( r_abstractDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==58||LA2_0==62||(LA2_0>=64 && LA2_0<=66)||(LA2_0>=69 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:17:3: r_abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_r_abstractDeclaration_in_r_file46);
            	    r_abstractDeclaration();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,EOF,FOLLOW_EOF_in_r_file53); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_file");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_file


    // $ANTLR start r_nsImport
    // src/org/eclipse/xpand3/parser/Xpand3.g:21:1: r_nsImport : ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );
    public final void r_nsImport() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_nsImport");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:21:12: ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case LG:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=1;
                }
                else if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("21:1: r_nsImport : ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );", 4, 1, input);

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
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("21:1: r_nsImport : ( LG 'IMPORT' r_type RG | LG 'EXTENSION' r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:22:2: LG 'IMPORT' r_type RG
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,LG,FOLLOW_LG_in_r_nsImport63); if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,25,FOLLOW_25_in_r_nsImport65); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_nsImport67);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,RG,FOLLOW_RG_in_r_nsImport69); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:23:2: LG 'EXTENSION' r_type RG
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,LG,FOLLOW_LG_in_r_nsImport74); if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,26,FOLLOW_26_in_r_nsImport76); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_nsImport78);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,RG,FOLLOW_RG_in_r_nsImport80); if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:24:2: 'import' r_type ';'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,27,FOLLOW_27_in_r_nsImport85); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_nsImport87);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,28,FOLLOW_28_in_r_nsImport90); if (failed) return ;

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:25:2: 'extension' r_type ( 'reexport' )? ';'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,29,FOLLOW_29_in_r_nsImport96); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_nsImport98);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:25:21: ( 'reexport' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:25:22: 'reexport'
                            {
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,30,FOLLOW_30_in_r_nsImport101); if (failed) return ;

                            }
                            break;

                    }

                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,28,FOLLOW_28_in_r_nsImport105); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_nsImport");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_nsImport


    // $ANTLR start r_abstractDeclaration
    // src/org/eclipse/xpand3/parser/Xpand3.g:28:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );
    public final void r_abstractDeclaration() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_abstractDeclaration");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:28:23: ( r_check | r_around | r_extension | r_definition | r_definitionAround )
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
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("28:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("28:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:29:2: r_check
                    {
                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration116);
                    r_check();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:30:2: r_around
                    {
                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration121);
                    r_around();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:31:2: r_extension
                    {
                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration126);
                    r_extension();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:32:2: r_definition
                    {
                    pushFollow(FOLLOW_r_definition_in_r_abstractDeclaration131);
                    r_definition();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:33:2: r_definitionAround
                    {
                    pushFollow(FOLLOW_r_definitionAround_in_r_abstractDeclaration136);
                    r_definitionAround();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_abstractDeclaration");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_abstractDeclaration


    // $ANTLR start r_definition
    // src/org/eclipse/xpand3/parser/Xpand3.g:38:1: r_definition : LG DEFINE r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG ;
    public final void r_definition() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_definition");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:38:14: ( LG DEFINE r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG )
            // src/org/eclipse/xpand3/parser/Xpand3.g:39:2: LG DEFINE r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,LG,FOLLOW_LG_in_r_definition148); if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,DEFINE,FOLLOW_DEFINE_in_r_definition150); if (failed) return ;
            pushFollow(FOLLOW_r_identifier_in_r_definition152);
            r_identifier();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:39:25: ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:39:26: '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_definition155); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:39:30: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
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
                            // src/org/eclipse/xpand3/parser/Xpand3.g:39:31: r_declaredParameterList ( ( ',' )? '*' )?
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_definition158);
                            r_declaredParameterList();
                            _fsp--;
                            if (failed) return ;
                            // src/org/eclipse/xpand3/parser/Xpand3.g:39:55: ( ( ',' )? '*' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:39:56: ( ',' )? '*'
                                    {
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:39:56: ( ',' )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);

                                    if ( (LA6_0==32) ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // src/org/eclipse/xpand3/parser/Xpand3.g:39:56: ','
                                            {
                                            /** START EDITED */
                                            tokenConsumed(null, (CommonToken) input.LT(1));
                                            /** END EDITED */
                                            match(input,32,FOLLOW_32_in_r_definition161); if (failed) return ;

                                            }
                                            break;

                                    }

                                    /** START EDITED */
                                    tokenConsumed(null, (CommonToken) input.LT(1));
                                    /** END EDITED */
                                    match(input,33,FOLLOW_33_in_r_definition164); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:39:69: '*'
                            {
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,33,FOLLOW_33_in_r_definition170); if (failed) return ;

                            }
                            break;

                    }

                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_definition174); if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,35,FOLLOW_35_in_r_definition178); if (failed) return ;
            pushFollow(FOLLOW_r_type_in_r_definition180);
            r_type();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_r_sequence_in_r_definition183);
            r_sequence();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_r_definition186); if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,RG,FOLLOW_RG_in_r_definition188); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_definition");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_definition


    // $ANTLR start r_definitionAround
    // src/org/eclipse/xpand3/parser/Xpand3.g:44:1: r_definitionAround : LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG ;
    public final void r_definitionAround() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_definitionAround");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:44:20: ( LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG )
            // src/org/eclipse/xpand3/parser/Xpand3.g:45:2: LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,LG,FOLLOW_LG_in_r_definitionAround200); if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,AROUND,FOLLOW_AROUND_in_r_definitionAround202); if (failed) return ;
            pushFollow(FOLLOW_r_pointcut_in_r_definitionAround204);
            r_pointcut();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:45:23: ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:45:24: '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_definitionAround207); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:45:28: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
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
                            // src/org/eclipse/xpand3/parser/Xpand3.g:45:29: r_declaredParameterList ( ( ',' )? '*' )?
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_definitionAround210);
                            r_declaredParameterList();
                            _fsp--;
                            if (failed) return ;
                            // src/org/eclipse/xpand3/parser/Xpand3.g:45:53: ( ( ',' )? '*' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( ((LA11_0>=32 && LA11_0<=33)) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:45:54: ( ',' )? '*'
                                    {
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:45:54: ( ',' )?
                                    int alt10=2;
                                    int LA10_0 = input.LA(1);

                                    if ( (LA10_0==32) ) {
                                        alt10=1;
                                    }
                                    switch (alt10) {
                                        case 1 :
                                            // src/org/eclipse/xpand3/parser/Xpand3.g:45:54: ','
                                            {
                                            /** START EDITED */
                                            tokenConsumed(null, (CommonToken) input.LT(1));
                                            /** END EDITED */
                                            match(input,32,FOLLOW_32_in_r_definitionAround213); if (failed) return ;

                                            }
                                            break;

                                    }

                                    /** START EDITED */
                                    tokenConsumed(null, (CommonToken) input.LT(1));
                                    /** END EDITED */
                                    match(input,33,FOLLOW_33_in_r_definitionAround216); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:45:67: '*'
                            {
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,33,FOLLOW_33_in_r_definitionAround222); if (failed) return ;

                            }
                            break;

                    }

                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_definitionAround226); if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,35,FOLLOW_35_in_r_definitionAround230); if (failed) return ;
            pushFollow(FOLLOW_r_type_in_r_definitionAround232);
            r_type();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_r_sequence_in_r_definitionAround235);
            r_sequence();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_r_definitionAround238); if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,RG,FOLLOW_RG_in_r_definitionAround240); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_definitionAround");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_definitionAround


    // $ANTLR start r_sequence
    // src/org/eclipse/xpand3/parser/Xpand3.g:50:1: r_sequence : r_textSequence ( r_statement r_textSequence )* ;
    public final void r_sequence() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_sequence");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:50:12: ( r_textSequence ( r_statement r_textSequence )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:51:3: r_textSequence ( r_statement r_textSequence )*
            {
            pushFollow(FOLLOW_r_textSequence_in_r_sequence252);
            r_textSequence();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:52:3: ( r_statement r_textSequence )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=StringLiteral && LA14_0<=Identifier)||LA14_0==31||(LA14_0>=36 && LA14_0<=39)||LA14_0==41||LA14_0==46||LA14_0==50||LA14_0==52||LA14_0==59||(LA14_0>=69 && LA14_0<=72)||LA14_0==78||(LA14_0>=93 && LA14_0<=108)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:52:4: r_statement r_textSequence
            	    {
            	    pushFollow(FOLLOW_r_statement_in_r_sequence258);
            	    r_statement();
            	    _fsp--;
            	    if (failed) return ;
            	    pushFollow(FOLLOW_r_textSequence_in_r_sequence264);
            	    r_textSequence();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_sequence");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_sequence


    // $ANTLR start r_statement
    // src/org/eclipse/xpand3/parser/Xpand3.g:56:1: r_statement : ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement );
    public final void r_statement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_statement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:56:13: ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement )
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
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("56:1: r_statement : ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:57:3: r_simpleStatement
                    {
                    pushFollow(FOLLOW_r_simpleStatement_in_r_statement279);
                    r_simpleStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:58:3: r_fileStatement
                    {
                    pushFollow(FOLLOW_r_fileStatement_in_r_statement284);
                    r_fileStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:59:3: r_foreachStatement
                    {
                    pushFollow(FOLLOW_r_foreachStatement_in_r_statement289);
                    r_foreachStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:60:3: r_ifStatement
                    {
                    pushFollow(FOLLOW_r_ifStatement_in_r_statement294);
                    r_ifStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:61:3: r_letStatement
                    {
                    pushFollow(FOLLOW_r_letStatement_in_r_statement299);
                    r_letStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:62:3: r_protectStatement
                    {
                    pushFollow(FOLLOW_r_protectStatement_in_r_statement304);
                    r_protectStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_statement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_statement


    // $ANTLR start r_textSequence
    // src/org/eclipse/xpand3/parser/Xpand3.g:65:1: r_textSequence : r_text ( r_text )* ;
    public final void r_textSequence() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_textSequence");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:65:16: ( r_text ( r_text )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:66:2: r_text ( r_text )*
            {
            pushFollow(FOLLOW_r_text_in_r_textSequence315);
            r_text();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:66:9: ( r_text )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:66:10: r_text
            	    {
            	    pushFollow(FOLLOW_r_text_in_r_textSequence318);
            	    r_text();
            	    _fsp--;
            	    if (failed) return ;

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
        	/** START EDITED */
    		ruleLeft("r_textSequence");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_textSequence


    // $ANTLR start r_text
    // src/org/eclipse/xpand3/parser/Xpand3.g:69:1: r_text : ( '-' )? TEXT ;
    public final void r_text() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_text");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:69:8: ( ( '-' )? TEXT )
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:2: ( '-' )? TEXT
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:70:2: '-'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,36,FOLLOW_36_in_r_text330); if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,TEXT,FOLLOW_TEXT_in_r_text333); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_text");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_text


    // $ANTLR start r_simpleStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:73:1: r_simpleStatement : ( r_errorStatement | r_expandStatement | r_expressionStmt );
    public final void r_simpleStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_simpleStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:73:19: ( r_errorStatement | r_expandStatement | r_expressionStmt )
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
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("73:1: r_simpleStatement : ( r_errorStatement | r_expandStatement | r_expressionStmt );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:74:3: r_errorStatement
                    {
                    pushFollow(FOLLOW_r_errorStatement_in_r_simpleStatement344);
                    r_errorStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:75:3: r_expandStatement
                    {
                    pushFollow(FOLLOW_r_expandStatement_in_r_simpleStatement348);
                    r_expandStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:76:3: r_expressionStmt
                    {
                    pushFollow(FOLLOW_r_expressionStmt_in_r_simpleStatement352);
                    r_expressionStmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_simpleStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_simpleStatement


    // $ANTLR start r_errorStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:79:1: r_errorStatement : 'ERROR' r_expression ;
    public final void r_errorStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_errorStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:79:18: ( 'ERROR' r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:80:3: 'ERROR' r_expression
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,37,FOLLOW_37_in_r_errorStatement363); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_errorStatement365);
            r_expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_errorStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_errorStatement


    // $ANTLR start r_expandStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:83:1: r_expandStatement : 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )? ;
    public final void r_expandStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_expandStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:83:19: ( 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:3: 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )?
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,38,FOLLOW_38_in_r_expandStatement376); if (failed) return ;
            pushFollow(FOLLOW_r_simpleType_in_r_expandStatement378);
            r_simpleType();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:25: ( '(' r_parameterList ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:84:26: '(' r_parameterList ')'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_expandStatement381); if (failed) return ;
                    pushFollow(FOLLOW_r_parameterList_in_r_expandStatement383);
                    r_parameterList();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_expandStatement385); if (failed) return ;

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:84:52: ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )?
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:84:53: ( 'FOR' r_expression )
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:84:53: ( 'FOR' r_expression )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:84:54: 'FOR' r_expression
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,35,FOLLOW_35_in_r_expandStatement391); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_expandStatement393);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:85:5: ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? )
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:85:5: ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:85:6: 'FOREACH' r_expression ( 'SEPARATOR' r_expression )?
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,39,FOLLOW_39_in_r_expandStatement401); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_expandStatement402);
                    r_expression();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:85:28: ( 'SEPARATOR' r_expression )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==40) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:85:29: 'SEPARATOR' r_expression
                            {
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,40,FOLLOW_40_in_r_expandStatement405); if (failed) return ;
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement407);
                            r_expression();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

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
        	/** START EDITED */
    		ruleLeft("r_expandStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_expandStatement


    // $ANTLR start r_expressionStmt
    // src/org/eclipse/xpand3/parser/Xpand3.g:88:1: r_expressionStmt : r_expression ;
    public final void r_expressionStmt() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_expressionStmt");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:19: ( r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:89:2: r_expression
            {
            pushFollow(FOLLOW_r_expression_in_r_expressionStmt423);
            r_expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_expressionStmt");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_expressionStmt


    // $ANTLR start r_fileStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:92:1: r_fileStatement : 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE' ;
    public final void r_fileStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_fileStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:92:17: ( 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:2: 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,41,FOLLOW_41_in_r_fileStatement433); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_fileStatement435);
            r_expression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:22: ( r_identifier )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identifier) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:93:23: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_fileStatement438);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_fileStatement444);
            r_sequence();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,42,FOLLOW_42_in_r_fileStatement448); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_fileStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_fileStatement


    // $ANTLR start r_foreachStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:98:1: r_foreachStatement : 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH' ;
    public final void r_foreachStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_foreachStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:98:20: ( 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:99:3: 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,39,FOLLOW_39_in_r_foreachStatement460); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_foreachStatement462);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,43,FOLLOW_43_in_r_foreachStatement464); if (failed) return ;
            pushFollow(FOLLOW_r_identifier_in_r_foreachStatement466);
            r_identifier();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:99:44: ( 'ITERATOR' r_identifier )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:99:45: 'ITERATOR' r_identifier
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,44,FOLLOW_44_in_r_foreachStatement469); if (failed) return ;
                    pushFollow(FOLLOW_r_identifier_in_r_foreachStatement471);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:99:71: ( 'SEPARATOR' r_expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:99:72: 'SEPARATOR' r_expression
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,40,FOLLOW_40_in_r_foreachStatement476); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_foreachStatement478);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_foreachStatement486);
            r_sequence();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,45,FOLLOW_45_in_r_foreachStatement491); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_foreachStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_foreachStatement


    // $ANTLR start r_ifStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:104:1: r_ifStatement : 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF' ;
    public final void r_ifStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_ifStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:104:15: ( 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:105:6: 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,46,FOLLOW_46_in_r_ifStatement506); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_ifStatement508);
            r_expression();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_r_sequence_in_r_ifStatement512);
            r_sequence();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:107:3: ( r_elseIfStatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:107:3: r_elseIfStatement
            	    {
            	    pushFollow(FOLLOW_r_elseIfStatement_in_r_ifStatement517);
            	    r_elseIfStatement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:108:3: ( r_elseStatement )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:108:3: r_elseStatement
                    {
                    pushFollow(FOLLOW_r_elseStatement_in_r_ifStatement522);
                    r_elseStatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,47,FOLLOW_47_in_r_ifStatement527); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_ifStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_ifStatement


    // $ANTLR start r_elseIfStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:112:1: r_elseIfStatement : 'ELSEIF' r_expression r_sequence ;
    public final void r_elseIfStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_elseIfStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:112:19: ( 'ELSEIF' r_expression r_sequence )
            // src/org/eclipse/xpand3/parser/Xpand3.g:113:2: 'ELSEIF' r_expression r_sequence
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,48,FOLLOW_48_in_r_elseIfStatement537); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_elseIfStatement539);
            r_expression();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_r_sequence_in_r_elseIfStatement543);
            r_sequence();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_elseIfStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_elseIfStatement


    // $ANTLR start r_elseStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:117:1: r_elseStatement : 'ELSE' r_sequence ;
    public final void r_elseStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_elseStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:117:17: ( 'ELSE' r_sequence )
            // src/org/eclipse/xpand3/parser/Xpand3.g:118:2: 'ELSE' r_sequence
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,49,FOLLOW_49_in_r_elseStatement555); if (failed) return ;
            pushFollow(FOLLOW_r_sequence_in_r_elseStatement559);
            r_sequence();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_elseStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_elseStatement


    // $ANTLR start r_letStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:122:1: r_letStatement : 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET' ;
    public final void r_letStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_letStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:122:16: ( 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:123:3: 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,50,FOLLOW_50_in_r_letStatement571); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_letStatement573);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,43,FOLLOW_43_in_r_letStatement575); if (failed) return ;
            pushFollow(FOLLOW_r_identifier_in_r_letStatement577);
            r_identifier();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_r_sequence_in_r_letStatement583);
            r_sequence();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,51,FOLLOW_51_in_r_letStatement588); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_letStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_letStatement


    // $ANTLR start r_protectStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:128:1: r_protectStatement : 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT' ;
    public final void r_protectStatement() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_protectStatement");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:128:20: ( 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:129:2: 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,52,FOLLOW_52_in_r_protectStatement599); if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,53,FOLLOW_53_in_r_protectStatement604); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_protectStatement606);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,54,FOLLOW_54_in_r_protectStatement611); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_protectStatement613);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,55,FOLLOW_55_in_r_protectStatement626); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_protectStatement628);
            r_expression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:132:29: ( 'DISABLE' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:132:29: 'DISABLE'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,56,FOLLOW_56_in_r_protectStatement630); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_protectStatement636);
            r_sequence();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,57,FOLLOW_57_in_r_protectStatement640); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_protectStatement");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_protectStatement


    // $ANTLR start r_check
    // src/org/eclipse/xpand3/parser/Xpand3.g:139:1: r_check : 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' ;
    public final void r_check() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_check");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:139:9: ( 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:140:2: 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,58,FOLLOW_58_in_r_check652); if (failed) return ;
            pushFollow(FOLLOW_r_type_in_r_check654);
            r_type();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:140:19: ( 'if' r_expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:140:20: 'if' r_expression
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,59,FOLLOW_59_in_r_check657); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_check659);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( input.LA(1)==37||input.LA(1)==60 ) {
                /** START EDITED */
            	tokenConsumed(null, (CommonToken) input.LT(1));
            	/** END EDITED */    input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_check663);    throw mse;
            }

            pushFollow(FOLLOW_r_expression_in_r_check669);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_check671); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_check675);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,28,FOLLOW_28_in_r_check677); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_check");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_check


    // $ANTLR start r_around
    // src/org/eclipse/xpand3/parser/Xpand3.g:144:1: r_around : 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' ;
    public final void r_around() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_around");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:144:11: ( 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:145:5: 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,62,FOLLOW_62_in_r_around692); if (failed) return ;
            pushFollow(FOLLOW_r_pointcut_in_r_around694);
            r_pointcut();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,31,FOLLOW_31_in_r_around696); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:145:29: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:145:30: r_declaredParameterList ( ( ',' )? '*' )?
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_around699);
                    r_declaredParameterList();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:145:54: ( ( ',' )? '*' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=32 && LA30_0<=33)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:145:55: ( ',' )? '*'
                            {
                            // src/org/eclipse/xpand3/parser/Xpand3.g:145:55: ( ',' )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==32) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:145:55: ','
                                    {
                                    /** START EDITED */
                                    tokenConsumed(null, (CommonToken) input.LT(1));
                                    /** END EDITED */
                                    match(input,32,FOLLOW_32_in_r_around702); if (failed) return ;

                                    }
                                    break;

                            }

                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,33,FOLLOW_33_in_r_around705); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:145:68: '*'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,33,FOLLOW_33_in_r_around711); if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,34,FOLLOW_34_in_r_around715); if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_around717); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_around724);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,28,FOLLOW_28_in_r_around726); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_around");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_around


    // $ANTLR start r_pointcut
    // src/org/eclipse/xpand3/parser/Xpand3.g:149:1: r_pointcut : ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* ;
    public final void r_pointcut() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_pointcut");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:149:13: ( ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:150:2: ( '*' | r_identifier ) ( '*' | r_identifier | '::' )*
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:150:2: ( '*' | r_identifier )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            else if ( (LA32_0==Identifier) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("150:2: ( '*' | r_identifier )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:150:4: '*'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,33,FOLLOW_33_in_r_pointcut743); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:151:4: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut749);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:152:4: ( '*' | r_identifier | '::' )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:152:6: '*'
            	    {
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,33,FOLLOW_33_in_r_pointcut757); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:153:6: r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_pointcut765);
            	    r_identifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:154:6: '::'
            	    {
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,63,FOLLOW_63_in_r_pointcut773); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_pointcut");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_pointcut


    // $ANTLR start r_extension
    // src/org/eclipse/xpand3/parser/Xpand3.g:157:1: r_extension : ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' ;
    public final void r_extension() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_extension");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:157:14: ( ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:158:2: ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';'
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:158:2: ( 'private' | 'cached' | 'create' )*
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
            	    if ( (input.LA(1)>=64 && input.LA(1)<=66) ) {
            	        /** START EDITED */
            	    	tokenConsumed(null, (CommonToken) input.LT(1));
            	    	/** END EDITED */    input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_extension787);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:158:33: ( r_type )?
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:158:33: r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension796);
                    r_type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_r_identifier_in_r_extension799);
            r_identifier();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:158:54: ( r_identifier )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:158:54: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension801);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,31,FOLLOW_31_in_r_extension804); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:158:72: ( r_declaredParameterList )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Identifier||(LA37_0>=69 && LA37_0<=71)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:158:72: r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension806);
                    r_declaredParameterList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,34,FOLLOW_34_in_r_extension809); if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_extension811); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:159:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==67) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=StringLiteral && LA40_0<=Identifier)||LA40_0==31||LA40_0==36||LA40_0==59||(LA40_0>=69 && LA40_0<=72)||LA40_0==78||(LA40_0>=93 && LA40_0<=108)) ) {
                alt40=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("159:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:159:4: 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,67,FOLLOW_67_in_r_extension816); if (failed) return ;
                    pushFollow(FOLLOW_r_javaType_in_r_extension818);
                    r_javaType();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,68,FOLLOW_68_in_r_extension820); if (failed) return ;
                    pushFollow(FOLLOW_r_identifier_in_r_extension822);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_extension824); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:159:42: ( r_javaType ( ',' r_javaType )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==Identifier) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:159:43: r_javaType ( ',' r_javaType )*
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension826);
                            r_javaType();
                            _fsp--;
                            if (failed) return ;
                            // src/org/eclipse/xpand3/parser/Xpand3.g:159:54: ( ',' r_javaType )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==32) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // src/org/eclipse/xpand3/parser/Xpand3.g:159:55: ',' r_javaType
                            	    {
                            	    /** START EDITED */
                            	    tokenConsumed(null, (CommonToken) input.LT(1));
                            	    /** END EDITED */
                            	    match(input,32,FOLLOW_32_in_r_extension829); if (failed) return ;
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension831);
                            	    r_javaType();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_extension838); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:160:4: r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension845);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,28,FOLLOW_28_in_r_extension848); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_extension");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_extension


    // $ANTLR start r_javaType
    // src/org/eclipse/xpand3/parser/Xpand3.g:163:1: r_javaType : r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* ;
    public final void r_javaType() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_javaType");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:163:13: ( r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:164:2: r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
            {
            pushFollow(FOLLOW_r_identifier_in_r_javaType859);
            r_identifier();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:165:2: ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:165:3: '.' ( r_identifier | 'Collection' | 'List' | 'Set' )
            	    {
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,68,FOLLOW_68_in_r_javaType865); if (failed) return ;
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:165:7: ( r_identifier | 'Collection' | 'List' | 'Set' )
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
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("165:7: ( r_identifier | 'Collection' | 'List' | 'Set' )", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:165:8: r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType868);
            	            r_identifier();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:165:22: 'Collection'
            	            {
            	            /** START EDITED */
            	            tokenConsumed(null, (CommonToken) input.LT(1));
            	            /** END EDITED */
            	            match(input,69,FOLLOW_69_in_r_javaType871); if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:166:2: 'List'
            	            {
            	            /** START EDITED */
            	            tokenConsumed(null, (CommonToken) input.LT(1));
            	            /** END EDITED */
            	            match(input,70,FOLLOW_70_in_r_javaType877); if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:166:10: 'Set'
            	            {
            	            /** START EDITED */
            	            tokenConsumed(null, (CommonToken) input.LT(1));
            	            /** END EDITED */
            	            match(input,71,FOLLOW_71_in_r_javaType880); if (failed) return ;

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
        	/** START EDITED */
    		ruleLeft("r_javaType");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_javaType


    // $ANTLR start test_expression
    // src/org/eclipse/xpand3/parser/Xpand3.g:173:1: test_expression : r_expression EOF ;
    public final void test_expression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("test_expression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:173:16: ( r_expression EOF )
            // src/org/eclipse/xpand3/parser/Xpand3.g:174:3: r_expression EOF
            {
            pushFollow(FOLLOW_r_expression_in_test_expression898);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,EOF,FOLLOW_EOF_in_test_expression900); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("test_expression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end test_expression


    // $ANTLR start r_expression
    // src/org/eclipse/xpand3/parser/Xpand3.g:176:1: r_expression : r_letExpression ;
    public final void r_expression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_expression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:176:14: ( r_letExpression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:177:2: r_letExpression
            {
            pushFollow(FOLLOW_r_letExpression_in_r_expression909);
            r_letExpression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_expression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_expression


    // $ANTLR start r_letExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:180:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );
    public final void r_letExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_letExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:180:18: ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=StringLiteral && LA43_0<=Identifier)||LA43_0==31||LA43_0==36||LA43_0==59||(LA43_0>=69 && LA43_0<=71)||LA43_0==78||(LA43_0>=93 && LA43_0<=108)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("180:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:181:4: 'let' r_identifier '=' r_castedExpression ':' r_expression
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,72,FOLLOW_72_in_r_letExpression922); if (failed) return ;
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression924);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,73,FOLLOW_73_in_r_letExpression926); if (failed) return ;
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression928);
                    r_castedExpression();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,61,FOLLOW_61_in_r_letExpression930); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_letExpression932);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:182:4: r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression938);
                    r_castedExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_letExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_letExpression


    // $ANTLR start r_castedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:185:1: r_castedExpression : ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression );
    public final void r_castedExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_castedExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:185:20: ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:186:5: ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_castedExpression964); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_castedExpression966);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_castedExpression968); if (failed) return ;
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression970);
                    r_chainExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:188:4: r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression976);
                    r_chainExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_castedExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_castedExpression


    // $ANTLR start r_chainExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:191:1: r_chainExpression : r_ifExpression ( '->' r_ifExpression )* ;
    public final void r_chainExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_chainExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:191:20: ( r_ifExpression ( '->' r_ifExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:192:2: r_ifExpression ( '->' r_ifExpression )*
            {
            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression988);
            r_ifExpression();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,74,FOLLOW_74_in_r_chainExpression993); if (failed) return ;
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression995);
            	    r_ifExpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_chainExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_chainExpression


    // $ANTLR start r_ifExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:195:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );
    public final void r_ifExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_ifExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:195:17: ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=StringLiteral && LA48_0<=Identifier)||LA48_0==31||LA48_0==36||(LA48_0>=69 && LA48_0<=71)||LA48_0==78||(LA48_0>=93 && LA48_0<=108)) ) {
                alt48=1;
            }
            else if ( (LA48_0==59) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("195:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:196:2: r_switchExpression ( '?' r_expression ':' r_switchExpression )?
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1009);
                    r_switchExpression();
                    _fsp--;
                    if (failed) return ;
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
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,75,FOLLOW_75_in_r_ifExpression1012); if (failed) return ;
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression1014);
                            r_expression();
                            _fsp--;
                            if (failed) return ;
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,61,FOLLOW_61_in_r_ifExpression1016); if (failed) return ;
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1018);
                            r_switchExpression();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:197:3: 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )?
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,59,FOLLOW_59_in_r_ifExpression1025); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression1027);
                    r_expression();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,76,FOLLOW_76_in_r_ifExpression1029); if (failed) return ;
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1031);
                    r_switchExpression();
                    _fsp--;
                    if (failed) return ;
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
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,77,FOLLOW_77_in_r_ifExpression1034); if (failed) return ;
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1036);
                            r_switchExpression();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

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
        	/** START EDITED */
    		ruleLeft("r_ifExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_ifExpression


    // $ANTLR start r_switchExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:200:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );
    public final void r_switchExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_switchExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:200:21: ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==78) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=StringLiteral && LA51_0<=Identifier)||LA51_0==31||LA51_0==36||(LA51_0>=69 && LA51_0<=71)||(LA51_0>=93 && LA51_0<=108)) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("200:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:201:4: 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,78,FOLLOW_78_in_r_switchExpression1052); if (failed) return ;
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
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,31,FOLLOW_31_in_r_switchExpression1055); if (failed) return ;
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1057);
                            r_orExpression();
                            _fsp--;
                            if (failed) return ;
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,34,FOLLOW_34_in_r_switchExpression1059); if (failed) return ;

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
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression1064);
                    	    r_casePart();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,79,FOLLOW_79_in_r_switchExpression1070); if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,61,FOLLOW_61_in_r_switchExpression1072); if (failed) return ;
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1074);
                    r_orExpression();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,80,FOLLOW_80_in_r_switchExpression1079); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:205:4: r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1084);
                    r_orExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_switchExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_switchExpression


    // $ANTLR start r_casePart
    // src/org/eclipse/xpand3/parser/Xpand3.g:208:1: r_casePart : 'case' r_expression ':' r_expression ;
    public final void r_casePart() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_casePart");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:208:12: ( 'case' r_expression ':' r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:209:2: 'case' r_expression ':' r_expression
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,81,FOLLOW_81_in_r_casePart1095); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_casePart1097);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_casePart1099); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_casePart1101);
            r_expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_casePart");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_casePart


    // $ANTLR start r_orExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:211:1: r_orExpression : r_andExpression ( '||' r_andExpression )* ;
    public final void r_orExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_orExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:211:16: ( r_andExpression ( '||' r_andExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:212:4: r_andExpression ( '||' r_andExpression )*
            {
            pushFollow(FOLLOW_r_andExpression_in_r_orExpression1113);
            r_andExpression();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,82,FOLLOW_82_in_r_orExpression1117); if (failed) return ;
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression1119);
            	    r_andExpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_orExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_orExpression


    // $ANTLR start r_andExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:215:1: r_andExpression : r_impliesExpression ( '&&' r_impliesExpression )* ;
    public final void r_andExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_andExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:215:18: ( r_impliesExpression ( '&&' r_impliesExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:216:2: r_impliesExpression ( '&&' r_impliesExpression )*
            {
            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression1134);
            r_impliesExpression();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,83,FOLLOW_83_in_r_andExpression1138); if (failed) return ;
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression1140);
            	    r_impliesExpression();
            	    _fsp--;
            	    if (failed) return ;

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
        	/** START EDITED */
    		ruleLeft("r_andExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_andExpression


    // $ANTLR start r_impliesExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:219:1: r_impliesExpression : r_relationalExpression ( 'implies' r_relationalExpression )* ;
    public final void r_impliesExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_impliesExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:219:21: ( r_relationalExpression ( 'implies' r_relationalExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:220:2: r_relationalExpression ( 'implies' r_relationalExpression )*
            {
            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression1155);
            r_relationalExpression();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,84,FOLLOW_84_in_r_impliesExpression1159); if (failed) return ;
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression1161);
            	    r_relationalExpression();
            	    _fsp--;
            	    if (failed) return ;

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
        	/** START EDITED */
    		ruleLeft("r_impliesExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_impliesExpression


    // $ANTLR start r_relationalExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:223:1: r_relationalExpression : r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* ;
    public final void r_relationalExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_relationalExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:223:24: ( r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:224:2: r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )*
            {
            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression1177);
            r_additiveExpression();
            _fsp--;
            if (failed) return ;
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
            	    if ( (input.LA(1)>=85 && input.LA(1)<=90) ) {
            	        /** START EDITED */
            	    	tokenConsumed(null, (CommonToken) input.LT(1));
            	    	/** END EDITED */    input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_relationalExpression1182);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression1206);
            	    r_additiveExpression();
            	    _fsp--;
            	    if (failed) return ;

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
        	/** START EDITED */
    		ruleLeft("r_relationalExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_relationalExpression


    // $ANTLR start r_additiveExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:228:1: r_additiveExpression : r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* ;
    public final void r_additiveExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_additiveExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:228:22: ( r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:229:2: r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )*
            {
            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1219);
            r_multiplicativeExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:230:4: ( ( '+' | '-' ) r_multiplicativeExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==36) ) {
                    int LA56_2 = input.LA(2);

                    if ( ((LA56_2>=StringLiteral && LA56_2<=Identifier)||LA56_2==31||LA56_2==36||(LA56_2>=69 && LA56_2<=71)||(LA56_2>=93 && LA56_2<=108)) ) {
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
            	    if ( input.LA(1)==36||input.LA(1)==91 ) {
            	        /** START EDITED */
            	    	tokenConsumed(null, (CommonToken) input.LT(1));
            	    	/** END EDITED */    input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_additiveExpression1226);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1233);
            	    r_multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_additiveExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_additiveExpression


    // $ANTLR start r_multiplicativeExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:233:1: r_multiplicativeExpression : r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* ;
    public final void r_multiplicativeExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_multiplicativeExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:233:28: ( r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:234:2: r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )*
            {
            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1246);
            r_unaryExpression();
            _fsp--;
            if (failed) return ;
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
            	    if ( input.LA(1)==33||input.LA(1)==92 ) {
            	        /** START EDITED */
            	    	tokenConsumed(null, (CommonToken) input.LT(1));
            	    	/** END EDITED */    input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_multiplicativeExpression1251);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1259);
            	    r_unaryExpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_multiplicativeExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_multiplicativeExpression


    // $ANTLR start r_unaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:239:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );
    public final void r_unaryExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_unaryExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:239:19: ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression )
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
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("239:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:240:2: r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1273);
                    r_infixExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:241:3: '!' r_infixExpression
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,93,FOLLOW_93_in_r_unaryExpression1278); if (failed) return ;
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1280);
                    r_infixExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:242:3: '-' r_infixExpression
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,36,FOLLOW_36_in_r_unaryExpression1285); if (failed) return ;
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1287);
                    r_infixExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_unaryExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_unaryExpression


    // $ANTLR start r_infixExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:245:1: r_infixExpression : r_primaryExpression ( '.' r_featureCall )* ;
    public final void r_infixExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_infixExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:245:19: ( r_primaryExpression ( '.' r_featureCall )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:246:2: r_primaryExpression ( '.' r_featureCall )*
            {
            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression1298);
            r_primaryExpression();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,68,FOLLOW_68_in_r_infixExpression1303); if (failed) return ;
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression1305);
            	    r_featureCall();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_infixExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_infixExpression


    // $ANTLR start r_primaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:249:1: r_primaryExpression : ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );
    public final void r_primaryExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_primaryExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:249:23: ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression )
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
                alt60=2;
                }
                break;
            case 97:
            case 98:
                {
                alt60=3;
                }
                break;
            case IntLiteral:
                {
                alt60=4;
                }
                break;
            case 99:
                {
                alt60=5;
                }
                break;
            case 95:
                {
                alt60=6;
                }
                break;
            case 96:
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
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("249:1: r_primaryExpression : ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:250:4: StringLiteral
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_r_primaryExpression1323); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:251:5: r_featureCall
                    {
                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression1331);
                    r_featureCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:252:5: r_booleanLiteral
                    {
                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression1338);
                    r_booleanLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:253:5: r_numberLiteral
                    {
                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression1345);
                    r_numberLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:254:5: r_nullLiteral
                    {
                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression1352);
                    r_nullLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:255:5: r_listLiteral
                    {
                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression1359);
                    r_listLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:256:5: r_constructorCall
                    {
                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression1366);
                    r_constructorCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:257:5: r_globalVarExpression
                    {
                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression1373);
                    r_globalVarExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:258:5: r_paranthesizedExpression
                    {
                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression1380);
                    r_paranthesizedExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_primaryExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_primaryExpression


    // $ANTLR start r_paranthesizedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:261:1: r_paranthesizedExpression : '(' r_expression ')' ;
    public final void r_paranthesizedExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_paranthesizedExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:261:27: ( '(' r_expression ')' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:262:5: '(' r_expression ')'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression1394); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression1396);
            r_expression();
            _fsp--;
            if (failed) return ;
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,34,FOLLOW_34_in_r_paranthesizedExpression1398); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_paranthesizedExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_paranthesizedExpression


    // $ANTLR start r_globalVarExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:265:1: r_globalVarExpression : 'GLOBALVAR' r_identifier ;
    public final void r_globalVarExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_globalVarExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:265:24: ( 'GLOBALVAR' r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:266:5: 'GLOBALVAR' r_identifier
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,94,FOLLOW_94_in_r_globalVarExpression1413); if (failed) return ;
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression1415);
            r_identifier();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_globalVarExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_globalVarExpression


    // $ANTLR start r_featureCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:268:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );
    public final void r_featureCall() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_featureCall");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:268:16: ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression )
            int alt62=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==31) ) {
                    alt62=1;
                }
                else if ( (LA62_1==EOF||LA62_1==TEXT||LA62_1==Identifier||LA62_1==28||(LA62_1>=32 && LA62_1<=34)||(LA62_1>=36 && LA62_1<=37)||LA62_1==40||LA62_1==43||(LA62_1>=54 && LA62_1<=56)||(LA62_1>=60 && LA62_1<=61)||LA62_1==63||LA62_1==68||(LA62_1>=74 && LA62_1<=77)||(LA62_1>=79 && LA62_1<=92)) ) {
                    alt62=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
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
                alt62=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("268:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:269:5: r_identifier '(' ( r_parameterList )? ')'
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_featureCall1429);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_featureCall1431); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:269:22: ( r_parameterList )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=StringLiteral && LA61_0<=Identifier)||LA61_0==31||LA61_0==36||LA61_0==59||(LA61_0>=69 && LA61_0<=72)||LA61_0==78||(LA61_0>=93 && LA61_0<=108)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:269:23: r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall1434);
                            r_parameterList();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_featureCall1438); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:270:5: r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_featureCall1445);
                    r_type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:271:5: r_collectionExpression
                    {
                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall1453);
                    r_collectionExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_featureCall");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_featureCall


    // $ANTLR start r_listLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:274:1: r_listLiteral : '{' ( r_expression ( ',' r_expression )* )? '}' ;
    public final void r_listLiteral() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_listLiteral");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:274:16: ( '{' ( r_expression ( ',' r_expression )* )? '}' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:275:2: '{' ( r_expression ( ',' r_expression )* )? '}'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,95,FOLLOW_95_in_r_listLiteral1465); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:275:5: ( r_expression ( ',' r_expression )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=StringLiteral && LA64_0<=Identifier)||LA64_0==31||LA64_0==36||LA64_0==59||(LA64_0>=69 && LA64_0<=72)||LA64_0==78||(LA64_0>=93 && LA64_0<=108)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:275:6: r_expression ( ',' r_expression )*
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral1467);
                    r_expression();
                    _fsp--;
                    if (failed) return ;
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
                    	    /** START EDITED */
                    	    tokenConsumed(null, (CommonToken) input.LT(1));
                    	    /** END EDITED */
                    	    match(input,32,FOLLOW_32_in_r_listLiteral1470); if (failed) return ;
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral1472);
                    	    r_expression();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,80,FOLLOW_80_in_r_listLiteral1477); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_listLiteral");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_listLiteral


    // $ANTLR start r_constructorCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:278:1: r_constructorCall : 'new' r_simpleType ;
    public final void r_constructorCall() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_constructorCall");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:278:20: ( 'new' r_simpleType )
            // src/org/eclipse/xpand3/parser/Xpand3.g:279:2: 'new' r_simpleType
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,96,FOLLOW_96_in_r_constructorCall1488); if (failed) return ;
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall1490);
            r_simpleType();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_constructorCall");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_constructorCall


    // $ANTLR start r_booleanLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:283:1: r_booleanLiteral : ( 'false' | 'true' );
    public final void r_booleanLiteral() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_booleanLiteral");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:283:19: ( 'false' | 'true' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:
            {
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                /** START EDITED */
            	tokenConsumed(null, (CommonToken) input.LT(1));
            	/** END EDITED */    input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_booleanLiteral0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_booleanLiteral");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_booleanLiteral


    // $ANTLR start r_nullLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:287:1: r_nullLiteral : 'null' ;
    public final void r_nullLiteral() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_nullLiteral");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:287:16: ( 'null' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:288:2: 'null'
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,99,FOLLOW_99_in_r_nullLiteral1516); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_nullLiteral");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_nullLiteral


    // $ANTLR start r_numberLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );
    public final void r_numberLiteral() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_numberLiteral");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:291:18: ( IntLiteral | IntLiteral '.' IntLiteral )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IntLiteral) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==68) ) {
                    int LA65_2 = input.LA(3);

                    if ( (LA65_2==IntLiteral) ) {
                        alt65=2;
                    }
                    else if ( (LA65_2==Identifier||(LA65_2>=69 && LA65_2<=71)||(LA65_2>=100 && LA65_2<=108)) ) {
                        alt65=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA65_1==EOF||LA65_1==TEXT||LA65_1==Identifier||LA65_1==28||(LA65_1>=32 && LA65_1<=34)||(LA65_1>=36 && LA65_1<=37)||LA65_1==40||LA65_1==43||(LA65_1>=54 && LA65_1<=56)||(LA65_1>=60 && LA65_1<=61)||(LA65_1>=74 && LA65_1<=77)||(LA65_1>=79 && LA65_1<=92)) ) {
                    alt65=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("291:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:292:4: IntLiteral
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1529); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:293:4: IntLiteral '.' IntLiteral
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1535); if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,68,FOLLOW_68_in_r_numberLiteral1537); if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1539); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_numberLiteral");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_numberLiteral


    // $ANTLR start r_collectionExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:296:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );
    public final void r_collectionExpression() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_collectionExpression");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:296:25: ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==100) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=101 && LA67_0<=108)) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("296:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:297:3: 'typeSelect' '(' r_type ')'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,100,FOLLOW_100_in_r_collectionExpression1552); if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_collectionExpression1556); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression1558);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_collectionExpression1560); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:300:4: ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')'
                    {
                    if ( (input.LA(1)>=101 && input.LA(1)<=108) ) {
                        /** START EDITED */
                    	tokenConsumed(null, (CommonToken) input.LT(1));
                    	/** END EDITED */    input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionExpression1569);    throw mse;
                    }

                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_collectionExpression1619); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:307:19: ( r_identifier '|' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==Identifier) ) {
                        int LA66_1 = input.LA(2);

                        if ( (LA66_1==109) ) {
                            alt66=1;
                        }
                    }
                    switch (alt66) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:307:20: r_identifier '|'
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression1622);
                            r_identifier();
                            _fsp--;
                            if (failed) return ;
                            /** START EDITED */
                            tokenConsumed(null, (CommonToken) input.LT(1));
                            /** END EDITED */
                            match(input,109,FOLLOW_109_in_r_collectionExpression1624); if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression1628);
                    r_expression();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_collectionExpression1630); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_collectionExpression");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_collectionExpression


    // $ANTLR start r_declaredParameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:313:1: r_declaredParameterList : r_declaredParameter ( ',' r_declaredParameter )* ;
    public final void r_declaredParameterList() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_declaredParameterList");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:313:26: ( r_declaredParameter ( ',' r_declaredParameter )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:314:2: r_declaredParameter ( ',' r_declaredParameter )*
            {
            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1647);
            r_declaredParameter();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,32,FOLLOW_32_in_r_declaredParameterList1650); if (failed) return ;
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1652);
            	    r_declaredParameter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_declaredParameterList");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_declaredParameterList


    // $ANTLR start r_declaredParameter
    // src/org/eclipse/xpand3/parser/Xpand3.g:317:1: r_declaredParameter : r_type r_identifier ;
    public final void r_declaredParameter() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_declaredParameter");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:317:21: ( r_type r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:318:2: r_type r_identifier
            {
            pushFollow(FOLLOW_r_type_in_r_declaredParameter1665);
            r_type();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter1667);
            r_identifier();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_declaredParameter");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_declaredParameter


    // $ANTLR start r_parameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:321:1: r_parameterList : r_expression ( ',' r_expression )* ;
    public final void r_parameterList() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_parameterList");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:321:18: ( r_expression ( ',' r_expression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:322:5: r_expression ( ',' r_expression )*
            {
            pushFollow(FOLLOW_r_expression_in_r_parameterList1682);
            r_expression();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,32,FOLLOW_32_in_r_parameterList1686); if (failed) return ;
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList1688);
            	    r_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_parameterList");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_parameterList


    // $ANTLR start r_type
    // src/org/eclipse/xpand3/parser/Xpand3.g:327:1: r_type : ( r_collectionType | r_simpleType );
    public final void r_type() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_type");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:327:8: ( r_collectionType | r_simpleType )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=69 && LA70_0<=71)) ) {
                alt70=1;
            }
            else if ( (LA70_0==Identifier) ) {
                alt70=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("327:1: r_type : ( r_collectionType | r_simpleType );", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:328:2: r_collectionType
                    {
                    pushFollow(FOLLOW_r_collectionType_in_r_type1705);
                    r_collectionType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:329:2: r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_type1710);
                    r_simpleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_type");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_type


    // $ANTLR start r_collectionType
    // src/org/eclipse/xpand3/parser/Xpand3.g:332:1: r_collectionType : ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? ;
    public final void r_collectionType() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_collectionType");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:332:19: ( ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:333:3: ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )?
            {
            if ( (input.LA(1)>=69 && input.LA(1)<=71) ) {
                /** START EDITED */
            	tokenConsumed(null, (CommonToken) input.LT(1));
            	/** END EDITED */    input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionType1725);    throw mse;
            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:334:3: ( '[' r_simpleType ']' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==110) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:334:4: '[' r_simpleType ']'
                    {
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,110,FOLLOW_110_in_r_collectionType1743); if (failed) return ;
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType1745);
                    r_simpleType();
                    _fsp--;
                    if (failed) return ;
                    /** START EDITED */
                    tokenConsumed(null, (CommonToken) input.LT(1));
                    /** END EDITED */
                    match(input,111,FOLLOW_111_in_r_collectionType1747); if (failed) return ;

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
        	/** START EDITED */
    		ruleLeft("r_collectionType");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_collectionType


    // $ANTLR start r_simpleType
    // src/org/eclipse/xpand3/parser/Xpand3.g:337:1: r_simpleType : r_identifier ( '::' r_identifier )* ;
    public final void r_simpleType() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_simpleType");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:337:14: ( r_identifier ( '::' r_identifier )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:338:2: r_identifier ( '::' r_identifier )*
            {
            pushFollow(FOLLOW_r_identifier_in_r_simpleType1760);
            r_identifier();
            _fsp--;
            if (failed) return ;
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
            	    /** START EDITED */
            	    tokenConsumed(null, (CommonToken) input.LT(1));
            	    /** END EDITED */
            	    match(input,63,FOLLOW_63_in_r_simpleType1765); if (failed) return ;
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType1767);
            	    r_identifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_simpleType");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_simpleType


    // $ANTLR start r_identifier
    // src/org/eclipse/xpand3/parser/Xpand3.g:342:1: r_identifier : Identifier ;
    public final void r_identifier() throws RecognitionException {
        try {
        	/** START EDITED */
    		ruleEntered("r_identifier");
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:342:14: ( Identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:343:4: Identifier
            {
            /** START EDITED */
            tokenConsumed(null, (CommonToken) input.LT(1));
            /** END EDITED */
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier1783); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	/** START EDITED */
    		ruleLeft("r_identifier");
    		/** END EDITED */
        }
        return ;
    }
    // $ANTLR end r_identifier

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // src/org/eclipse/xpand3/parser/Xpand3.g:186:5: ( '(' r_type ')' r_castedExpression )
        // src/org/eclipse/xpand3/parser/Xpand3.g:186:6: '(' r_type ')' r_castedExpression
        {
        /** START EDITED */
        tokenConsumed(null, (CommonToken) input.LT(1));
        /** END EDITED */
        match(input,31,FOLLOW_31_in_synpred1953); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred1955);
        r_type();
        _fsp--;
        if (failed) return ;
        /** START EDITED */
        tokenConsumed(null, (CommonToken) input.LT(1));
        /** END EDITED */
        match(input,34,FOLLOW_34_in_synpred1957); if (failed) return ;
        pushFollow(FOLLOW_r_castedExpression_in_synpred1959);
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
        "\2\13\1\uffff\1\37\1\41\1\15\1\12\1\15\1\41\1\12\1\0\16\uffff\1"+
        "\77\3\0\2\37\4\0\2\15\1\0\1\15\1\41\1\15\3\0\1\77\2\42\1\15\1\0"+
        "\1\15\1\77\1\42\1\15\1\42\1\77";
    static final String DFA44_maxS =
        "\2\154\1\uffff\1\134\1\156\1\15\1\154\1\15\1\134\1\154\1\0\16\uffff"+
        "\1\157\3\0\2\37\4\0\2\15\1\0\1\15\1\134\1\107\3\0\1\157\1\156\1"+
        "\77\1\15\1\0\1\15\1\157\1\77\1\15\1\42\1\157";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\10\uffff\16\1\36\uffff";
    static final String DFA44_specialS =
        "\6\uffff\1\7\3\uffff\1\12\17\uffff\1\10\1\11\1\14\2\uffff\1\0\1"+
        "\1\1\13\1\5\2\uffff\1\6\3\uffff\1\4\1\2\1\15\4\uffff\1\3\6\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\2\21\uffff\1\1\4\uffff\1\2\26\uffff\1\2\11\uffff\3\2\6\uffff"+
            "\1\2\16\uffff\20\2",
            "\2\2\1\3\21\uffff\1\2\4\uffff\1\2\26\uffff\1\2\11\uffff\3\4"+
            "\1\2\5\uffff\1\2\16\uffff\20\2",
            "",
            "\1\2\1\uffff\1\2\1\6\1\uffff\1\2\32\uffff\1\5\4\uffff\1\2\5"+
            "\uffff\2\2\6\uffff\13\2",
            "\1\2\1\6\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\6\uffff\13\2\21"+
            "\uffff\1\7",
            "\1\10",
            "\1\2\1\14\1\21\1\12\16\uffff\1\2\2\uffff\1\26\3\2\1\uffff\1"+
            "\11\1\2\2\uffff\1\2\2\uffff\1\2\12\uffff\3\2\2\uffff\1\30\2"+
            "\2\6\uffff\1\2\3\15\2\uffff\3\2\1\uffff\1\13\16\2\1\27\1\25"+
            "\1\23\1\24\2\20\1\22\1\16\10\17",
            "\1\31",
            "\1\2\1\6\1\uffff\1\2\32\uffff\1\5\4\uffff\1\2\5\uffff\2\2\6"+
            "\uffff\13\2",
            "\1\2\1\32\1\40\1\33\21\uffff\1\45\4\uffff\1\2\40\uffff\3\34"+
            "\25\uffff\1\2\1\44\1\42\1\43\2\37\1\41\1\35\10\36",
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
            "\1\46\57\uffff\1\47",
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
            "\1\2\1\6\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\6\uffff\13\2",
            "\1\56\67\uffff\3\55",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\46\57\uffff\1\47",
            "\1\60\113\uffff\1\57",
            "\1\60\34\uffff\1\61",
            "\1\62",
            "\1\uffff",
            "\1\63",
            "\1\64\57\uffff\1\65",
            "\1\60\34\uffff\1\61",
            "\1\66",
            "\1\60",
            "\1\64\57\uffff\1\65"
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
                        int LA44_31 = input.LA(1);

                         
                        int index44_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_31);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_32 = input.LA(1);

                         
                        int index44_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_32);
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
                        int LA44_48 = input.LA(1);

                         
                        int index44_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_48);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_41 = input.LA(1);

                         
                        int index44_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_41);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_34 = input.LA(1);

                         
                        int index44_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_34);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_37 = input.LA(1);

                         
                        int index44_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_37);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_6==EOF||LA44_6==TEXT||LA44_6==28||(LA44_6>=32 && LA44_6<=34)||LA44_6==37||LA44_6==40||LA44_6==43||(LA44_6>=54 && LA44_6<=56)||(LA44_6>=60 && LA44_6<=61)||LA44_6==68||(LA44_6>=74 && LA44_6<=76)||(LA44_6>=79 && LA44_6<=92)) ) {s = 2;}

                        else if ( (LA44_6==36) ) {s = 9;}

                        else if ( (LA44_6==Identifier) ) {s = 10;}

                        else if ( (LA44_6==78) && (synpred1())) {s = 11;}

                        else if ( (LA44_6==StringLiteral) && (synpred1())) {s = 12;}

                        else if ( ((LA44_6>=69 && LA44_6<=71)) && (synpred1())) {s = 13;}

                        else if ( (LA44_6==100) && (synpred1())) {s = 14;}

                        else if ( ((LA44_6>=101 && LA44_6<=108)) && (synpred1())) {s = 15;}

                        else if ( ((LA44_6>=97 && LA44_6<=98)) && (synpred1())) {s = 16;}

                        else if ( (LA44_6==IntLiteral) && (synpred1())) {s = 17;}

                        else if ( (LA44_6==99) && (synpred1())) {s = 18;}

                        else if ( (LA44_6==95) && (synpred1())) {s = 19;}

                        else if ( (LA44_6==96) && (synpred1())) {s = 20;}

                        else if ( (LA44_6==94) && (synpred1())) {s = 21;}

                        else if ( (LA44_6==31) && (synpred1())) {s = 22;}

                        else if ( (LA44_6==93) && (synpred1())) {s = 23;}

                        else if ( (LA44_6==59) && (synpred1())) {s = 24;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_26 = input.LA(1);

                         
                        int index44_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_27 = input.LA(1);

                         
                        int index44_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_27);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_33 = input.LA(1);

                         
                        int index44_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_33);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA44_28 = input.LA(1);

                         
                        int index44_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_28);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA44_43 = input.LA(1);

                         
                        int index44_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_43);
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
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file40 = new BitSet(new long[]{0x4400000028002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file46 = new BitSet(new long[]{0x4400000000002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_EOF_in_r_file53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport63 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_r_nsImport65 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport67 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport74 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_nsImport76 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport78 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_r_nsImport85 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport87 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_r_nsImport96 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport98 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_r_nsImport101 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definition_in_r_abstractDeclaration131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definitionAround_in_r_abstractDeclaration136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definition148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_r_definition150 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_definition152 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definition155 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definition158 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definition161 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definition164 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definition170 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definition174 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definition178 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definition180 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definition183 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_r_definition186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definitionAround200 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_r_definitionAround202 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_definitionAround204 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definitionAround207 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definitionAround210 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definitionAround213 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround216 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround222 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definitionAround226 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definitionAround230 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definitionAround232 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definitionAround235 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_r_definitionAround238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definitionAround240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence252 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_statement_in_r_sequence258 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence264 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_simpleStatement_in_r_statement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_fileStatement_in_r_statement284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_foreachStatement_in_r_statement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifStatement_in_r_statement294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letStatement_in_r_statement299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_protectStatement_in_r_statement304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence315 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence318 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_r_text330 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_r_text333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_errorStatement_in_r_simpleStatement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expandStatement_in_r_simpleStatement348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expressionStmt_in_r_simpleStatement352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_r_errorStatement363 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_errorStatement365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_r_expandStatement376 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_expandStatement378 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_r_expandStatement381 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_expandStatement383 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_expandStatement385 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_r_expandStatement391 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_expandStatement401 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement402 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_r_expandStatement405 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_expressionStmt423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_fileStatement433 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_fileStatement435 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_r_identifier_in_r_fileStatement438 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_fileStatement444 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_r_fileStatement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_foreachStatement460 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement462 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_foreachStatement464 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement466 = new BitSet(new long[]{0x0000111000000400L});
    public static final BitSet FOLLOW_44_in_r_foreachStatement469 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement471 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_r_foreachStatement476 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement478 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_foreachStatement486 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_r_foreachStatement491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_r_ifStatement506 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifStatement508 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_ifStatement512 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseIfStatement_in_r_ifStatement517 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseStatement_in_r_ifStatement522 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_r_ifStatement527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_r_elseIfStatement537 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_elseIfStatement539 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseIfStatement543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_r_elseStatement555 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseStatement559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_letStatement571 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letStatement573 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_letStatement575 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letStatement577 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_letStatement583 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_r_letStatement588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_r_protectStatement599 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_r_protectStatement604 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement606 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_r_protectStatement611 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement613 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_r_protectStatement626 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement628 = new BitSet(new long[]{0x0100001000000400L});
    public static final BitSet FOLLOW_56_in_r_protectStatement630 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_protectStatement636 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_r_protectStatement640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_r_check652 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_check654 = new BitSet(new long[]{0x1800002000000000L});
    public static final BitSet FOLLOW_59_in_r_check657 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check659 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_set_in_r_check663 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check669 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_check671 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check675 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_check677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_r_around692 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around694 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around696 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around699 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_around702 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_around705 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_around711 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_around715 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_around717 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_around724 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_around726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_r_pointcut743 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut749 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_33_in_r_pointcut757 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut765 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_63_in_r_pointcut773 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_set_in_r_extension787 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_type_in_r_extension796 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension799 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension801 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension804 = new BitSet(new long[]{0x0000000400002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension806 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_extension809 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_extension811 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E8L});
    public static final BitSet FOLLOW_67_in_r_extension816 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_extension820 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension822 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension824 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension826 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_r_extension829 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension831 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_r_extension838 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension845 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extension848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType859 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_javaType865 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_r_javaType871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_r_javaType877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_r_javaType880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_expression_in_test_expression898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_test_expression900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_r_letExpression922 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_r_letExpression926 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00040E0L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression928 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_letExpression930 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_castedExpression964 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression966 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_castedExpression968 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00040E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_r_chainExpression993 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00040E0L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_r_ifExpression1012 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression1014 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_ifExpression1016 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00040E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_r_ifExpression1025 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_r_ifExpression1029 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00040E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_r_ifExpression1034 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00040E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_r_switchExpression1052 = new BitSet(new long[]{0x0000000080000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression1055 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1057 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_switchExpression1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
    public static final BitSet FOLLOW_79_in_r_switchExpression1070 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_switchExpression1072 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_r_switchExpression1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_r_casePart1095 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart1097 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_casePart1099 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression1113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_r_orExpression1117 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression1119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression1134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_r_andExpression1138 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression1140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression1155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_r_impliesExpression1159 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression1161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression1177 = new BitSet(new long[]{0x0000000000000002L,0x0000000007E00000L});
    public static final BitSet FOLLOW_set_in_r_relationalExpression1182 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression1206 = new BitSet(new long[]{0x0000000000000002L,0x0000000007E00000L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1219 = new BitSet(new long[]{0x0000001000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_r_additiveExpression1226 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1233 = new BitSet(new long[]{0x0000001000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1246 = new BitSet(new long[]{0x0000000200000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_set_in_r_multiplicativeExpression1251 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFE00000E0L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1259 = new BitSet(new long[]{0x0000000200000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_r_unaryExpression1278 = new BitSet(new long[]{0x0000000080003800L,0x00001FFFC00000E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_r_unaryExpression1285 = new BitSet(new long[]{0x0000000080003800L,0x00001FFFC00000E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression1298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_infixExpression1303 = new BitSet(new long[]{0x0000000000002000L,0x00001FF0000000E0L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression1305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_StringLiteral_in_r_primaryExpression1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression1394 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression1396 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_paranthesizedExpression1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_r_globalVarExpression1413 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall1429 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall1431 = new BitSet(new long[]{0x0800001480003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall1434 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_featureCall1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_r_listLiteral1465 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00141E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral1467 = new BitSet(new long[]{0x0000000100000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_32_in_r_listLiteral1470 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral1472 = new BitSet(new long[]{0x0000000100000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_r_listLiteral1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_r_constructorCall1488 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_r_nullLiteral1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_numberLiteral1537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_r_collectionExpression1552 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1556 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression1558 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionExpression1569 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1619 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression1622 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_r_collectionExpression1624 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression1628 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1647 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_declaredParameterList1650 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1652 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter1665 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1682 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_parameterList1686 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00041E0L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1688 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionType1725 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_r_collectionType1743 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType1745 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_r_collectionType1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1760 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_r_simpleType1765 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1767 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1953 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_synpred1955 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred1957 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFE00040E0L});
    public static final BitSet FOLLOW_r_castedExpression_in_synpred1959 = new BitSet(new long[]{0x0000000000000002L});

}