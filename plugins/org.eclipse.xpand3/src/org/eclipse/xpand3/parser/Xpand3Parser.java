// $ANTLR 3.0 src/org/eclipse/xpand3/parser/Xpand3.g 2008-02-27 13:36:49
 	
package org.eclipse.xpand3.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Xpand3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "XPAND_TAG_OPEN", "XPAND_TAG_CLOSE", "'import'", "';'", "'extension'", "'reexport'", "'context'", "'if'", "'ERROR'", "'WARNING'", "':'", "'around'", "'('", "','", "'*'", "')'", "'::'", "'private'", "'cached'", "'create'", "'JAVA'", "'.'", "'Collection'", "'List'", "'Set'", "'let'", "'='", "'->'", "'?'", "'then'", "'else'", "'switch'", "'default'", "'}'", "'case'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'/'", "'!'", "'GLOBALVAR'", "'['", "']'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'"
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

        public Xpand3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[41+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "src/org/eclipse/xpand3/parser/Xpand3.g"; }



    // $ANTLR start r_file
    // src/org/eclipse/xpand3/parser/Xpand3.g:12:1: r_file : ( r_nsImport )* ( r_abstractDeclaration )* EOF ;
    public void r_file() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:13:2: ( ( r_nsImport )* ( r_abstractDeclaration )* EOF )
            // src/org/eclipse/xpand3/parser/Xpand3.g:13:2: ( r_nsImport )* ( r_abstractDeclaration )* EOF
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:13:2: ( r_nsImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:13:3: r_nsImport
            	    {
            	    pushFollow(FOLLOW_r_nsImport_in_r_file32);
            	    r_nsImport();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:14:2: ( r_abstractDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==22||LA2_0==27||(LA2_0>=33 && LA2_0<=35)||(LA2_0>=38 && LA2_0<=40)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:14:3: r_abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_r_abstractDeclaration_in_r_file38);
            	    r_abstractDeclaration();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_r_file45); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_file


    // $ANTLR start r_nsImport
    // src/org/eclipse/xpand3/parser/Xpand3.g:18:1: r_nsImport : ( 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );
    public void r_nsImport() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:19:2: ( 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("18:1: r_nsImport : ( 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:19:2: 'import' r_type ';'
                    {
                    match(input,18,FOLLOW_18_in_r_nsImport55); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_nsImport57);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    match(input,19,FOLLOW_19_in_r_nsImport60); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:20:3: 'extension' r_type ( 'reexport' )? ';'
                    {
                    match(input,20,FOLLOW_20_in_r_nsImport65); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_nsImport67);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:20:22: ( 'reexport' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==21) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:20:23: 'reexport'
                            {
                            match(input,21,FOLLOW_21_in_r_nsImport70); if (failed) return ;

                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_r_nsImport74); if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_nsImport


    // $ANTLR start r_abstractDeclaration
    // src/org/eclipse/xpand3/parser/Xpand3.g:23:1: r_abstractDeclaration : ( r_check | r_around | r_extension );
    public void r_abstractDeclaration() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:24:2: ( r_check | r_around | r_extension )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case Identifier:
            case 33:
            case 34:
            case 35:
            case 38:
            case 39:
            case 40:
                {
                alt5=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("23:1: r_abstractDeclaration : ( r_check | r_around | r_extension );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:24:2: r_check
                    {
                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration85);
                    r_check();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:25:2: r_around
                    {
                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration90);
                    r_around();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:26:2: r_extension
                    {
                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration95);
                    r_extension();
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
        }
        return ;
    }
    // $ANTLR end r_abstractDeclaration


    // $ANTLR start r_check
    // src/org/eclipse/xpand3/parser/Xpand3.g:29:1: r_check : 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' ;
    public void r_check() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:2: ( 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:2: 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';'
            {
            match(input,22,FOLLOW_22_in_r_check106); if (failed) return ;
            pushFollow(FOLLOW_r_type_in_r_check108);
            r_type();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:19: ( 'if' r_expression )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:30:20: 'if' r_expression
                    {
                    match(input,23,FOLLOW_23_in_r_check111); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_check113);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( (input.LA(1)>=24 && input.LA(1)<=25) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_check117);    throw mse;
            }

            pushFollow(FOLLOW_r_expression_in_r_check123);
            r_expression();
            _fsp--;
            if (failed) return ;
            match(input,26,FOLLOW_26_in_r_check125); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_check129);
            r_expression();
            _fsp--;
            if (failed) return ;
            match(input,19,FOLLOW_19_in_r_check131); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_check


    // $ANTLR start r_around
    // src/org/eclipse/xpand3/parser/Xpand3.g:34:1: r_around : 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' ;
    public void r_around() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:35:5: ( 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:35:5: 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';'
            {
            match(input,27,FOLLOW_27_in_r_around146); if (failed) return ;
            pushFollow(FOLLOW_r_pointcut_in_r_around148);
            r_pointcut();
            _fsp--;
            if (failed) return ;
            match(input,28,FOLLOW_28_in_r_around150); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:35:29: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:35:30: r_declaredParameterList ( ( ',' )? '*' )?
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_around153);
                    r_declaredParameterList();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:35:54: ( ( ',' )? '*' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=29 && LA8_0<=30)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:35:55: ( ',' )? '*'
                            {
                            // src/org/eclipse/xpand3/parser/Xpand3.g:35:55: ( ',' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==29) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:35:55: ','
                                    {
                                    match(input,29,FOLLOW_29_in_r_around156); if (failed) return ;

                                    }
                                    break;

                            }

                            match(input,30,FOLLOW_30_in_r_around159); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:35:68: '*'
                    {
                    match(input,30,FOLLOW_30_in_r_around165); if (failed) return ;

                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_r_around169); if (failed) return ;
            match(input,26,FOLLOW_26_in_r_around171); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_around178);
            r_expression();
            _fsp--;
            if (failed) return ;
            match(input,19,FOLLOW_19_in_r_around180); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_around


    // $ANTLR start r_pointcut
    // src/org/eclipse/xpand3/parser/Xpand3.g:39:1: r_pointcut : ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* ;
    public void r_pointcut() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:2: ( ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:2: ( '*' | r_identifier ) ( '*' | r_identifier | '::' )*
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:2: ( '*' | r_identifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==Identifier) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("40:2: ( '*' | r_identifier )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:40:4: '*'
                    {
                    match(input,30,FOLLOW_30_in_r_pointcut197); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:41:4: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut203);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:42:4: ( '*' | r_identifier | '::' )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:42:6: '*'
            	    {
            	    match(input,30,FOLLOW_30_in_r_pointcut211); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:43:6: r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_pointcut219);
            	    r_identifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:44:6: '::'
            	    {
            	    match(input,32,FOLLOW_32_in_r_pointcut227); if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_pointcut


    // $ANTLR start r_extension
    // src/org/eclipse/xpand3/parser/Xpand3.g:47:1: r_extension : ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' ;
    public void r_extension() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:2: ( ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:2: ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';'
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:2: ( 'private' | 'cached' | 'create' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=33 && LA12_0<=35)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:
            	    {
            	    if ( (input.LA(1)>=33 && input.LA(1)<=35) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_extension241);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:48:33: ( r_type )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=38 && LA13_0<=40)) ) {
                alt13=1;
            }
            else if ( (LA13_0==Identifier) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==32) ) {
                    alt13=1;
                }
                else if ( (LA13_2==Identifier) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:48:33: r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension250);
                    r_type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_r_identifier_in_r_extension253);
            r_identifier();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:54: ( r_identifier )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Identifier) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:48:54: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension255);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_r_extension258); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:72: ( r_declaredParameterList )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Identifier||(LA15_0>=38 && LA15_0<=40)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:48:72: r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension260);
                    r_declaredParameterList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_r_extension263); if (failed) return ;
            match(input,26,FOLLOW_26_in_r_extension265); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=StringLiteral && LA18_0<=Identifier)||LA18_0==23||LA18_0==28||(LA18_0>=38 && LA18_0<=41)||LA18_0==47||LA18_0==61||(LA18_0>=63 && LA18_0<=65)||(LA18_0>=67 && LA18_0<=79)) ) {
                alt18=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("49:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:49:4: 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')'
                    {
                    match(input,36,FOLLOW_36_in_r_extension270); if (failed) return ;
                    pushFollow(FOLLOW_r_javaType_in_r_extension272);
                    r_javaType();
                    _fsp--;
                    if (failed) return ;
                    match(input,37,FOLLOW_37_in_r_extension274); if (failed) return ;
                    pushFollow(FOLLOW_r_identifier_in_r_extension276);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;
                    match(input,28,FOLLOW_28_in_r_extension278); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:49:42: ( r_javaType ( ',' r_javaType )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==Identifier) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:49:43: r_javaType ( ',' r_javaType )*
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension280);
                            r_javaType();
                            _fsp--;
                            if (failed) return ;
                            // src/org/eclipse/xpand3/parser/Xpand3.g:49:54: ( ',' r_javaType )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==29) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // src/org/eclipse/xpand3/parser/Xpand3.g:49:55: ',' r_javaType
                            	    {
                            	    match(input,29,FOLLOW_29_in_r_extension283); if (failed) return ;
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension285);
                            	    r_javaType();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_r_extension292); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:50:4: r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension299);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_r_extension302); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_extension


    // $ANTLR start r_javaType
    // src/org/eclipse/xpand3/parser/Xpand3.g:53:1: r_javaType : r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* ;
    public void r_javaType() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:54:2: ( r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:54:2: r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
            {
            pushFollow(FOLLOW_r_identifier_in_r_javaType313);
            r_identifier();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:55:2: ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==Identifier) ) {
                        int LA20_3 = input.LA(3);

                        if ( (LA20_3==29||LA20_3==31||LA20_3==37) ) {
                            alt20=1;
                        }


                    }
                    else if ( ((LA20_1>=38 && LA20_1<=40)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:55:3: '.' ( r_identifier | 'Collection' | 'List' | 'Set' )
            	    {
            	    match(input,37,FOLLOW_37_in_r_javaType319); if (failed) return ;
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:55:7: ( r_identifier | 'Collection' | 'List' | 'Set' )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case Identifier:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("55:7: ( r_identifier | 'Collection' | 'List' | 'Set' )", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:55:8: r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType322);
            	            r_identifier();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:55:22: 'Collection'
            	            {
            	            match(input,38,FOLLOW_38_in_r_javaType325); if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:56:2: 'List'
            	            {
            	            match(input,39,FOLLOW_39_in_r_javaType331); if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:56:10: 'Set'
            	            {
            	            match(input,40,FOLLOW_40_in_r_javaType334); if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
        return ;
    }
    // $ANTLR end r_javaType


    // $ANTLR start r_expression
    // src/org/eclipse/xpand3/parser/Xpand3.g:62:1: r_expression : r_letExpression ;
    public void r_expression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:63:2: ( r_letExpression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:63:2: r_letExpression
            {
            pushFollow(FOLLOW_r_letExpression_in_r_expression350);
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
        }
        return ;
    }
    // $ANTLR end r_expression


    // $ANTLR start r_letExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:66:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );
    public void r_letExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:67:4: ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=StringLiteral && LA21_0<=Identifier)||LA21_0==23||LA21_0==28||(LA21_0>=38 && LA21_0<=40)||LA21_0==47||LA21_0==61||(LA21_0>=63 && LA21_0<=65)||(LA21_0>=67 && LA21_0<=79)) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("66:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:67:4: 'let' r_identifier '=' r_castedExpression ':' r_expression
                    {
                    match(input,41,FOLLOW_41_in_r_letExpression364); if (failed) return ;
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression366);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;
                    match(input,42,FOLLOW_42_in_r_letExpression368); if (failed) return ;
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression370);
                    r_castedExpression();
                    _fsp--;
                    if (failed) return ;
                    match(input,26,FOLLOW_26_in_r_letExpression372); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_letExpression374);
                    r_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:68:4: r_castedExpression
                    {
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression380);
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
        }
        return ;
    }
    // $ANTLR end r_letExpression


    // $ANTLR start r_castedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:71:1: r_castedExpression : ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression );
    public void r_castedExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:72:5: ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:72:5: ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression
                    {
                    match(input,28,FOLLOW_28_in_r_castedExpression406); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_castedExpression408);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    match(input,31,FOLLOW_31_in_r_castedExpression410); if (failed) return ;
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression412);
                    r_chainExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:74:4: r_chainExpression
                    {
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression418);
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
        }
        return ;
    }
    // $ANTLR end r_castedExpression


    // $ANTLR start r_chainExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:77:1: r_chainExpression : r_ifExpression ( '->' r_ifExpression )* ;
    public void r_chainExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:2: ( r_ifExpression ( '->' r_ifExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:2: r_ifExpression ( '->' r_ifExpression )*
            {
            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression430);
            r_ifExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:18: ( '->' r_ifExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:78:20: '->' r_ifExpression
            	    {
            	    match(input,43,FOLLOW_43_in_r_chainExpression435); if (failed) return ;
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression437);
            	    r_ifExpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
        return ;
    }
    // $ANTLR end r_chainExpression


    // $ANTLR start r_ifExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:81:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );
    public void r_ifExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:82:2: ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=StringLiteral && LA26_0<=Identifier)||LA26_0==28||(LA26_0>=38 && LA26_0<=40)||LA26_0==47||LA26_0==61||(LA26_0>=63 && LA26_0<=65)||(LA26_0>=67 && LA26_0<=79)) ) {
                alt26=1;
            }
            else if ( (LA26_0==23) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("81:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:82:2: r_switchExpression ( '?' r_expression ':' r_switchExpression )?
                    {
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression451);
                    r_switchExpression();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:82:21: ( '?' r_expression ':' r_switchExpression )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==44) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:82:22: '?' r_expression ':' r_switchExpression
                            {
                            match(input,44,FOLLOW_44_in_r_ifExpression454); if (failed) return ;
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression456);
                            r_expression();
                            _fsp--;
                            if (failed) return ;
                            match(input,26,FOLLOW_26_in_r_ifExpression458); if (failed) return ;
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression460);
                            r_switchExpression();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:83:3: 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )?
                    {
                    match(input,23,FOLLOW_23_in_r_ifExpression467); if (failed) return ;
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression469);
                    r_expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,45,FOLLOW_45_in_r_ifExpression471); if (failed) return ;
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression473);
                    r_switchExpression();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:83:47: ( 'else' r_switchExpression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==46) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:83:48: 'else' r_switchExpression
                            {
                            match(input,46,FOLLOW_46_in_r_ifExpression476); if (failed) return ;
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression478);
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
        }
        return ;
    }
    // $ANTLR end r_ifExpression


    // $ANTLR start r_switchExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:86:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );
    public void r_switchExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:87:4: ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=StringLiteral && LA29_0<=Identifier)||LA29_0==28||(LA29_0>=38 && LA29_0<=40)||LA29_0==61||(LA29_0>=63 && LA29_0<=65)||(LA29_0>=67 && LA29_0<=79)) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("86:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:87:4: 'switch' ( '(' r_orExpression ')' )? ( r_casePart )* 'default' ':' r_orExpression '}'
                    {
                    match(input,47,FOLLOW_47_in_r_switchExpression494); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:87:13: ( '(' r_orExpression ')' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==28) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:87:14: '(' r_orExpression ')'
                            {
                            match(input,28,FOLLOW_28_in_r_switchExpression497); if (failed) return ;
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression499);
                            r_orExpression();
                            _fsp--;
                            if (failed) return ;
                            match(input,31,FOLLOW_31_in_r_switchExpression501); if (failed) return ;

                            }
                            break;

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:88:2: ( r_casePart )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==50) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:88:2: r_casePart
                    	    {
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression506);
                    	    r_casePart();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match(input,48,FOLLOW_48_in_r_switchExpression512); if (failed) return ;
                    match(input,26,FOLLOW_26_in_r_switchExpression514); if (failed) return ;
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression516);
                    r_orExpression();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_r_switchExpression521); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:91:4: r_orExpression
                    {
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression526);
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
        }
        return ;
    }
    // $ANTLR end r_switchExpression


    // $ANTLR start r_casePart
    // src/org/eclipse/xpand3/parser/Xpand3.g:94:1: r_casePart : 'case' r_expression ':' r_expression ;
    public void r_casePart() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:95:2: ( 'case' r_expression ':' r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:95:2: 'case' r_expression ':' r_expression
            {
            match(input,50,FOLLOW_50_in_r_casePart537); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_casePart539);
            r_expression();
            _fsp--;
            if (failed) return ;
            match(input,26,FOLLOW_26_in_r_casePart541); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_casePart543);
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
        }
        return ;
    }
    // $ANTLR end r_casePart


    // $ANTLR start r_orExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:97:1: r_orExpression : r_andExpression ( '||' r_andExpression )* ;
    public void r_orExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:98:4: ( r_andExpression ( '||' r_andExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:98:4: r_andExpression ( '||' r_andExpression )*
            {
            pushFollow(FOLLOW_r_andExpression_in_r_orExpression555);
            r_andExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:98:21: ( '||' r_andExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:98:22: '||' r_andExpression
            	    {
            	    match(input,51,FOLLOW_51_in_r_orExpression559); if (failed) return ;
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression561);
            	    r_andExpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
        return ;
    }
    // $ANTLR end r_orExpression


    // $ANTLR start r_andExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:101:1: r_andExpression : r_impliesExpression ( '&&' r_impliesExpression )* ;
    public void r_andExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:102:2: ( r_impliesExpression ( '&&' r_impliesExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:102:2: r_impliesExpression ( '&&' r_impliesExpression )*
            {
            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression576);
            r_impliesExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:102:23: ( '&&' r_impliesExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==52) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:102:24: '&&' r_impliesExpression
            	    {
            	    match(input,52,FOLLOW_52_in_r_andExpression580); if (failed) return ;
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression582);
            	    r_impliesExpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
        return ;
    }
    // $ANTLR end r_andExpression


    // $ANTLR start r_impliesExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:105:1: r_impliesExpression : r_relationalExpression ( 'implies' r_relationalExpression )* ;
    public void r_impliesExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:106:2: ( r_relationalExpression ( 'implies' r_relationalExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:106:2: r_relationalExpression ( 'implies' r_relationalExpression )*
            {
            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression597);
            r_relationalExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:106:26: ( 'implies' r_relationalExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==53) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:106:27: 'implies' r_relationalExpression
            	    {
            	    match(input,53,FOLLOW_53_in_r_impliesExpression601); if (failed) return ;
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression603);
            	    r_relationalExpression();
            	    _fsp--;
            	    if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_impliesExpression


    // $ANTLR start r_relationalExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:109:1: r_relationalExpression : r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* ;
    public void r_relationalExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:110:2: ( r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:110:2: r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )*
            {
            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression619);
            r_additiveExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:111:2: ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=54 && LA33_0<=59)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:111:3: ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression
            	    {
            	    if ( (input.LA(1)>=54 && input.LA(1)<=59) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_relationalExpression624);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression648);
            	    r_additiveExpression();
            	    _fsp--;
            	    if (failed) return ;

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
        }
        return ;
    }
    // $ANTLR end r_relationalExpression


    // $ANTLR start r_additiveExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:114:1: r_additiveExpression : r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* ;
    public void r_additiveExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:115:2: ( r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:115:2: r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )*
            {
            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression661);
            r_multiplicativeExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:116:4: ( ( '+' | '-' ) r_multiplicativeExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=60 && LA34_0<=61)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:116:5: ( '+' | '-' ) r_multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_additiveExpression668);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression675);
            	    r_multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_additiveExpression


    // $ANTLR start r_multiplicativeExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:119:1: r_multiplicativeExpression : r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* ;
    public void r_multiplicativeExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:120:2: ( r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:120:2: r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )*
            {
            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression688);
            r_unaryExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:121:2: ( ( '*' | '/' ) r_unaryExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30||LA35_0==62) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:121:3: ( '*' | '/' ) r_unaryExpression
            	    {
            	    if ( input.LA(1)==30||input.LA(1)==62 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_multiplicativeExpression693);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression701);
            	    r_unaryExpression();
            	    _fsp--;
            	    if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_multiplicativeExpression


    // $ANTLR start r_unaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:125:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );
    public void r_unaryExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:126:2: ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression )
            int alt36=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 28:
            case 38:
            case 39:
            case 40:
            case 64:
            case 65:
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
            case 79:
                {
                alt36=1;
                }
                break;
            case 63:
                {
                alt36=2;
                }
                break;
            case 61:
                {
                alt36=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("125:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:126:2: r_infixExpression
                    {
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression715);
                    r_infixExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:127:3: '!' r_infixExpression
                    {
                    match(input,63,FOLLOW_63_in_r_unaryExpression720); if (failed) return ;
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression722);
                    r_infixExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:128:3: '-' r_infixExpression
                    {
                    match(input,61,FOLLOW_61_in_r_unaryExpression727); if (failed) return ;
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression729);
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
        }
        return ;
    }
    // $ANTLR end r_unaryExpression


    // $ANTLR start r_infixExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:131:1: r_infixExpression : r_primaryExpression ( '.' r_featureCall )* ;
    public void r_infixExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:132:2: ( r_primaryExpression ( '.' r_featureCall )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:132:2: r_primaryExpression ( '.' r_featureCall )*
            {
            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression740);
            r_primaryExpression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:132:23: ( '.' r_featureCall )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==37) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:132:25: '.' r_featureCall
            	    {
            	    match(input,37,FOLLOW_37_in_r_infixExpression745); if (failed) return ;
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression747);
            	    r_featureCall();
            	    _fsp--;
            	    if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_infixExpression


    // $ANTLR start r_primaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:135:1: r_primaryExpression : ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );
    public void r_primaryExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:136:4: ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression )
            int alt38=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt38=1;
                }
                break;
            case Identifier:
            case 38:
            case 39:
            case 40:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt38=2;
                }
                break;
            case 68:
            case 69:
                {
                alt38=3;
                }
                break;
            case IntLiteral:
                {
                alt38=4;
                }
                break;
            case 70:
                {
                alt38=5;
                }
                break;
            case 65:
                {
                alt38=6;
                }
                break;
            case 67:
                {
                alt38=7;
                }
                break;
            case 64:
                {
                alt38=8;
                }
                break;
            case 28:
                {
                alt38=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("135:1: r_primaryExpression : ( StringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:136:4: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_r_primaryExpression765); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:137:5: r_featureCall
                    {
                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression773);
                    r_featureCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:138:5: r_booleanLiteral
                    {
                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression780);
                    r_booleanLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:139:5: r_numberLiteral
                    {
                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression787);
                    r_numberLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:140:5: r_nullLiteral
                    {
                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression794);
                    r_nullLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:141:5: r_listLiteral
                    {
                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression801);
                    r_listLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:142:5: r_constructorCall
                    {
                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression808);
                    r_constructorCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:143:5: r_globalVarExpression
                    {
                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression815);
                    r_globalVarExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:144:5: r_paranthesizedExpression
                    {
                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression822);
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
        }
        return ;
    }
    // $ANTLR end r_primaryExpression


    // $ANTLR start r_paranthesizedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:147:1: r_paranthesizedExpression : '(' r_expression ')' ;
    public void r_paranthesizedExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:148:5: ( '(' r_expression ')' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:148:5: '(' r_expression ')'
            {
            match(input,28,FOLLOW_28_in_r_paranthesizedExpression836); if (failed) return ;
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression838);
            r_expression();
            _fsp--;
            if (failed) return ;
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression840); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_paranthesizedExpression


    // $ANTLR start r_globalVarExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:151:1: r_globalVarExpression : 'GLOBALVAR' r_identifier ;
    public void r_globalVarExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:152:5: ( 'GLOBALVAR' r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:152:5: 'GLOBALVAR' r_identifier
            {
            match(input,64,FOLLOW_64_in_r_globalVarExpression855); if (failed) return ;
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression857);
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
        }
        return ;
    }
    // $ANTLR end r_globalVarExpression


    // $ANTLR start r_featureCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:154:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );
    public void r_featureCall() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:155:5: ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression )
            int alt40=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==EOF||LA40_1==19||(LA40_1>=24 && LA40_1<=26)||(LA40_1>=29 && LA40_1<=32)||LA40_1==37||(LA40_1>=43 && LA40_1<=46)||(LA40_1>=48 && LA40_1<=62)||LA40_1==66) ) {
                    alt40=2;
                }
                else if ( (LA40_1==28) ) {
                    alt40=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("154:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt40=2;
                }
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt40=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("154:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:155:5: r_identifier '(' ( r_parameterList )? ')'
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_featureCall871);
                    r_identifier();
                    _fsp--;
                    if (failed) return ;
                    match(input,28,FOLLOW_28_in_r_featureCall873); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:155:22: ( r_parameterList )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=StringLiteral && LA39_0<=Identifier)||LA39_0==23||LA39_0==28||(LA39_0>=38 && LA39_0<=41)||LA39_0==47||LA39_0==61||(LA39_0>=63 && LA39_0<=65)||(LA39_0>=67 && LA39_0<=79)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:155:23: r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall876);
                            r_parameterList();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    match(input,31,FOLLOW_31_in_r_featureCall880); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:156:5: r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_featureCall887);
                    r_type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:157:5: r_collectionExpression
                    {
                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall895);
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
        }
        return ;
    }
    // $ANTLR end r_featureCall


    // $ANTLR start r_listLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:160:1: r_listLiteral : '[' ( r_expression ( ',' r_expression )* )? ']' ;
    public void r_listLiteral() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:161:2: ( '[' ( r_expression ( ',' r_expression )* )? ']' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:161:2: '[' ( r_expression ( ',' r_expression )* )? ']'
            {
            match(input,65,FOLLOW_65_in_r_listLiteral907); if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:161:5: ( r_expression ( ',' r_expression )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=StringLiteral && LA42_0<=Identifier)||LA42_0==23||LA42_0==28||(LA42_0>=38 && LA42_0<=41)||LA42_0==47||LA42_0==61||(LA42_0>=63 && LA42_0<=65)||(LA42_0>=67 && LA42_0<=79)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:161:6: r_expression ( ',' r_expression )*
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral909);
                    r_expression();
                    _fsp--;
                    if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:161:19: ( ',' r_expression )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==29) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:161:20: ',' r_expression
                    	    {
                    	    match(input,29,FOLLOW_29_in_r_listLiteral912); if (failed) return ;
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral914);
                    	    r_expression();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,66,FOLLOW_66_in_r_listLiteral919); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_listLiteral


    // $ANTLR start r_constructorCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:164:1: r_constructorCall : 'new' r_simpleType ;
    public void r_constructorCall() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:165:2: ( 'new' r_simpleType )
            // src/org/eclipse/xpand3/parser/Xpand3.g:165:2: 'new' r_simpleType
            {
            match(input,67,FOLLOW_67_in_r_constructorCall930); if (failed) return ;
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall932);
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
        }
        return ;
    }
    // $ANTLR end r_constructorCall


    // $ANTLR start r_booleanLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:169:1: r_booleanLiteral : ( 'false' | 'true' );
    public void r_booleanLiteral() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:170:2: ( 'false' | 'true' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:
            {
            if ( (input.LA(1)>=68 && input.LA(1)<=69) ) {
                input.consume();
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
        }
        return ;
    }
    // $ANTLR end r_booleanLiteral


    // $ANTLR start r_nullLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:173:1: r_nullLiteral : 'null' ;
    public void r_nullLiteral() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:174:2: ( 'null' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:174:2: 'null'
            {
            match(input,70,FOLLOW_70_in_r_nullLiteral958); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_nullLiteral


    // $ANTLR start r_numberLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:177:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );
    public void r_numberLiteral() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:178:4: ( IntLiteral | IntLiteral '.' IntLiteral )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==IntLiteral) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==37) ) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==IntLiteral) ) {
                        alt43=2;
                    }
                    else if ( (LA43_2==Identifier||(LA43_2>=38 && LA43_2<=40)||(LA43_2>=71 && LA43_2<=79)) ) {
                        alt43=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("177:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 43, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA43_1==EOF||LA43_1==19||(LA43_1>=24 && LA43_1<=26)||(LA43_1>=29 && LA43_1<=31)||(LA43_1>=43 && LA43_1<=46)||(LA43_1>=48 && LA43_1<=62)||LA43_1==66) ) {
                    alt43=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("177:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("177:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:178:4: IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral971); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:179:4: IntLiteral '.' IntLiteral
                    {
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral977); if (failed) return ;
                    match(input,37,FOLLOW_37_in_r_numberLiteral979); if (failed) return ;
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral981); if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_numberLiteral


    // $ANTLR start r_collectionExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:182:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );
    public void r_collectionExpression() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:183:3: ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==71) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=72 && LA45_0<=79)) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("182:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:183:3: 'typeSelect' '(' r_type ')'
                    {
                    match(input,71,FOLLOW_71_in_r_collectionExpression994); if (failed) return ;
                    match(input,28,FOLLOW_28_in_r_collectionExpression998); if (failed) return ;
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression1000);
                    r_type();
                    _fsp--;
                    if (failed) return ;
                    match(input,31,FOLLOW_31_in_r_collectionExpression1002); if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:186:4: ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')'
                    {
                    if ( (input.LA(1)>=72 && input.LA(1)<=79) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionExpression1011);    throw mse;
                    }

                    match(input,28,FOLLOW_28_in_r_collectionExpression1061); if (failed) return ;
                    // src/org/eclipse/xpand3/parser/Xpand3.g:193:19: ( r_identifier '|' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==Identifier) ) {
                        int LA44_1 = input.LA(2);

                        if ( (LA44_1==80) ) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:193:20: r_identifier '|'
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression1064);
                            r_identifier();
                            _fsp--;
                            if (failed) return ;
                            match(input,80,FOLLOW_80_in_r_collectionExpression1066); if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression1070);
                    r_expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,31,FOLLOW_31_in_r_collectionExpression1072); if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_collectionExpression


    // $ANTLR start r_declaredParameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:199:1: r_declaredParameterList : r_declaredParameter ( ',' r_declaredParameter )* ;
    public void r_declaredParameterList() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:200:2: ( r_declaredParameter ( ',' r_declaredParameter )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:200:2: r_declaredParameter ( ',' r_declaredParameter )*
            {
            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1089);
            r_declaredParameter();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:200:22: ( ',' r_declaredParameter )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==29) ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==Identifier||(LA46_1>=38 && LA46_1<=40)) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:200:23: ',' r_declaredParameter
            	    {
            	    match(input,29,FOLLOW_29_in_r_declaredParameterList1092); if (failed) return ;
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1094);
            	    r_declaredParameter();
            	    _fsp--;
            	    if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_declaredParameterList


    // $ANTLR start r_declaredParameter
    // src/org/eclipse/xpand3/parser/Xpand3.g:203:1: r_declaredParameter : r_type r_identifier ;
    public void r_declaredParameter() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:204:2: ( r_type r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:204:2: r_type r_identifier
            {
            pushFollow(FOLLOW_r_type_in_r_declaredParameter1107);
            r_type();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter1109);
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
        }
        return ;
    }
    // $ANTLR end r_declaredParameter


    // $ANTLR start r_parameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:207:1: r_parameterList : r_expression ( ',' r_expression )* ;
    public void r_parameterList() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:208:5: ( r_expression ( ',' r_expression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:208:5: r_expression ( ',' r_expression )*
            {
            pushFollow(FOLLOW_r_expression_in_r_parameterList1124);
            r_expression();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:208:19: ( ',' r_expression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==29) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:208:20: ',' r_expression
            	    {
            	    match(input,29,FOLLOW_29_in_r_parameterList1128); if (failed) return ;
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList1130);
            	    r_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
        return ;
    }
    // $ANTLR end r_parameterList


    // $ANTLR start r_type
    // src/org/eclipse/xpand3/parser/Xpand3.g:213:1: r_type : ( r_collectionType | r_simpleType );
    public void r_type() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:214:2: ( r_collectionType | r_simpleType )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=38 && LA48_0<=40)) ) {
                alt48=1;
            }
            else if ( (LA48_0==Identifier) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("213:1: r_type : ( r_collectionType | r_simpleType );", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:214:2: r_collectionType
                    {
                    pushFollow(FOLLOW_r_collectionType_in_r_type1147);
                    r_collectionType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:215:2: r_simpleType
                    {
                    pushFollow(FOLLOW_r_simpleType_in_r_type1152);
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
        }
        return ;
    }
    // $ANTLR end r_type


    // $ANTLR start r_collectionType
    // src/org/eclipse/xpand3/parser/Xpand3.g:218:1: r_collectionType : ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? ;
    public void r_collectionType() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:219:3: ( ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:219:3: ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )?
            {
            if ( (input.LA(1)>=38 && input.LA(1)<=40) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionType1167);    throw mse;
            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:220:3: ( '[' r_simpleType ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:220:4: '[' r_simpleType ']'
                    {
                    match(input,65,FOLLOW_65_in_r_collectionType1185); if (failed) return ;
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType1187);
                    r_simpleType();
                    _fsp--;
                    if (failed) return ;
                    match(input,66,FOLLOW_66_in_r_collectionType1189); if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_collectionType


    // $ANTLR start r_simpleType
    // src/org/eclipse/xpand3/parser/Xpand3.g:223:1: r_simpleType : r_identifier ( '::' r_identifier )* ;
    public void r_simpleType() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:224:2: ( r_identifier ( '::' r_identifier )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:224:2: r_identifier ( '::' r_identifier )*
            {
            pushFollow(FOLLOW_r_identifier_in_r_simpleType1202);
            r_identifier();
            _fsp--;
            if (failed) return ;
            // src/org/eclipse/xpand3/parser/Xpand3.g:225:2: ( '::' r_identifier )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==32) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:225:3: '::' r_identifier
            	    {
            	    match(input,32,FOLLOW_32_in_r_simpleType1207); if (failed) return ;
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType1209);
            	    r_identifier();
            	    _fsp--;
            	    if (failed) return ;

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
        return ;
    }
    // $ANTLR end r_simpleType


    // $ANTLR start r_identifier
    // src/org/eclipse/xpand3/parser/Xpand3.g:228:1: r_identifier : Identifier ;
    public void r_identifier() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:229:4: ( Identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:229:4: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier1225); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end r_identifier

    // $ANTLR start synpred1
    public void synpred1_fragment() throws RecognitionException {   
        // src/org/eclipse/xpand3/parser/Xpand3.g:72:5: ( '(' r_type ')' r_castedExpression )
        // src/org/eclipse/xpand3/parser/Xpand3.g:72:6: '(' r_type ')' r_castedExpression
        {
        match(input,28,FOLLOW_28_in_synpred1395); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred1397);
        r_type();
        _fsp--;
        if (failed) return ;
        match(input,31,FOLLOW_31_in_synpred1399); if (failed) return ;
        pushFollow(FOLLOW_r_castedExpression_in_synpred1401);
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


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\67\uffff";
    static final String DFA22_eofS =
        "\6\uffff\1\2\60\uffff";
    static final String DFA22_minS =
        "\2\4\1\uffff\1\34\1\36\1\6\1\4\1\6\1\36\1\4\17\uffff\1\40\3\0\2"+
        "\34\4\0\2\6\1\0\1\6\1\36\1\6\3\0\1\40\2\37\1\6\1\0\1\6\1\40\1\37"+
        "\1\6\1\37\1\40";
    static final String DFA22_maxS =
        "\2\117\1\uffff\1\76\1\101\1\6\1\117\1\6\1\76\1\117\17\uffff\1\102"+
        "\3\0\2\34\4\0\2\6\1\0\1\6\1\76\1\50\3\0\1\102\1\101\1\40\1\6\1\0"+
        "\1\6\1\102\1\40\1\6\1\37\1\102";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\7\uffff\17\1\36\uffff";
    static final String DFA22_specialS =
        "\6\uffff\1\10\23\uffff\1\7\1\14\1\0\2\uffff\1\3\1\1\1\11\1\13\2"+
        "\uffff\1\4\3\uffff\1\5\1\2\1\6\4\uffff\1\12\6\uffff}>";
    static final String[] DFA22_transitionS = {
            "\3\2\20\uffff\1\2\4\uffff\1\1\11\uffff\3\2\6\uffff\1\2\15\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\15\2",
            "\2\2\1\3\20\uffff\1\2\4\uffff\1\2\11\uffff\3\4\1\2\5\uffff\1"+
            "\2\15\uffff\1\2\1\uffff\3\2\1\uffff\15\2",
            "",
            "\1\2\1\uffff\1\2\1\6\1\5\4\uffff\1\2\5\uffff\2\2\6\uffff\14"+
            "\2",
            "\1\2\1\6\5\uffff\1\2\5\uffff\2\2\6\uffff\14\2\2\uffff\1\7",
            "\1\10",
            "\1\13\1\21\1\14\14\uffff\1\2\3\uffff\1\30\3\2\1\uffff\1\26\3"+
            "\2\5\uffff\1\2\3\15\2\uffff\3\2\1\uffff\1\12\1\2\1\uffff\13"+
            "\2\1\11\1\2\1\27\1\25\1\23\1\2\1\24\2\20\1\22\1\16\10\17",
            "\1\31",
            "\1\2\1\6\1\5\4\uffff\1\2\5\uffff\2\2\6\uffff\14\2",
            "\1\32\1\40\1\33\25\uffff\1\45\11\uffff\3\34\24\uffff\1\2\1\uffff"+
            "\1\2\1\44\1\42\1\uffff\1\43\2\37\1\41\1\35\10\36",
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
            "\1\46\41\uffff\1\47",
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
            "\1\2\1\6\5\uffff\1\2\5\uffff\2\2\6\uffff\14\2",
            "\1\56\37\uffff\3\55",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\46\41\uffff\1\47",
            "\1\60\41\uffff\1\57",
            "\1\60\1\61",
            "\1\62",
            "\1\uffff",
            "\1\63",
            "\1\64\41\uffff\1\65",
            "\1\60\1\61",
            "\1\66",
            "\1\60",
            "\1\64\41\uffff\1\65"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "71:1: r_castedExpression : ( ( '(' r_type ')' r_castedExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_28 = input.LA(1);

                         
                        int index22_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_28);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_32 = input.LA(1);

                         
                        int index22_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_32);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_42 = input.LA(1);

                         
                        int index22_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_42);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_31 = input.LA(1);

                         
                        int index22_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_31);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_37 = input.LA(1);

                         
                        int index22_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_37);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_41 = input.LA(1);

                         
                        int index22_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_41);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_43 = input.LA(1);

                         
                        int index22_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_43);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_26 = input.LA(1);

                         
                        int index22_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_6==EOF||LA22_6==19||(LA22_6>=24 && LA22_6<=26)||(LA22_6>=29 && LA22_6<=31)||LA22_6==37||(LA22_6>=43 && LA22_6<=45)||LA22_6==48||(LA22_6>=50 && LA22_6<=60)||LA22_6==62||LA22_6==66) ) {s = 2;}

                        else if ( (LA22_6==61) ) {s = 9;}

                        else if ( (LA22_6==47) && (synpred1())) {s = 10;}

                        else if ( (LA22_6==StringLiteral) && (synpred1())) {s = 11;}

                        else if ( (LA22_6==Identifier) && (synpred1())) {s = 12;}

                        else if ( ((LA22_6>=38 && LA22_6<=40)) && (synpred1())) {s = 13;}

                        else if ( (LA22_6==71) && (synpred1())) {s = 14;}

                        else if ( ((LA22_6>=72 && LA22_6<=79)) && (synpred1())) {s = 15;}

                        else if ( ((LA22_6>=68 && LA22_6<=69)) && (synpred1())) {s = 16;}

                        else if ( (LA22_6==IntLiteral) && (synpred1())) {s = 17;}

                        else if ( (LA22_6==70) && (synpred1())) {s = 18;}

                        else if ( (LA22_6==65) && (synpred1())) {s = 19;}

                        else if ( (LA22_6==67) && (synpred1())) {s = 20;}

                        else if ( (LA22_6==64) && (synpred1())) {s = 21;}

                        else if ( (LA22_6==28) && (synpred1())) {s = 22;}

                        else if ( (LA22_6==63) && (synpred1())) {s = 23;}

                        else if ( (LA22_6==23) && (synpred1())) {s = 24;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_33 = input.LA(1);

                         
                        int index22_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_33);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_48 = input.LA(1);

                         
                        int index22_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_48);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_34 = input.LA(1);

                         
                        int index22_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_34);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_27 = input.LA(1);

                         
                        int index22_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file32 = new BitSet(new long[]{0x000001CE08540040L});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file38 = new BitSet(new long[]{0x000001CE08400040L});
    public static final BitSet FOLLOW_EOF_in_r_file45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_r_nsImport55 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport57 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_r_nsImport60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_r_nsImport65 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport67 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_r_nsImport70 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_r_nsImport74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_r_check106 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_type_in_r_check108 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_r_check111 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_check113 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_set_in_r_check117 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_check123 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_check125 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_check129 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_r_check131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_r_around146 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around148 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_around150 = new BitSet(new long[]{0x000001C0C0000040L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around153 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29_in_r_around156 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_r_around159 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30_in_r_around165 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around169 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_around171 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_around178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_r_around180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_r_pointcut197 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut203 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_30_in_r_pointcut211 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut219 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_32_in_r_pointcut227 = new BitSet(new long[]{0x0000000140000042L});
    public static final BitSet FOLLOW_set_in_r_extension241 = new BitSet(new long[]{0x000001CE00000040L});
    public static final BitSet FOLLOW_r_type_in_r_extension250 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension253 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension255 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extension258 = new BitSet(new long[]{0x000001C080000040L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension260 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension263 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_extension265 = new BitSet(new long[]{0xA00083D010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_36_in_r_extension270 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension272 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_r_extension274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension276 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extension278 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension280 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_29_in_r_extension283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension285 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_31_in_r_extension292 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension299 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_r_extension302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType313 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_r_javaType319 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType322 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_38_in_r_javaType325 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_39_in_r_javaType331 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_40_in_r_javaType334 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_letExpression364 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression366 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_r_letExpression368 = new BitSet(new long[]{0xA00081C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression370 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_letExpression372 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_r_castedExpression406 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression408 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_castedExpression410 = new BitSet(new long[]{0xA00081C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression430 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_r_chainExpression435 = new BitSet(new long[]{0xA00081C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression437 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression451 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_r_ifExpression454 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression456 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_ifExpression458 = new BitSet(new long[]{0xA00081C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_r_ifExpression467 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression469 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_r_ifExpression471 = new BitSet(new long[]{0xA00081C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression473 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_r_ifExpression476 = new BitSet(new long[]{0xA00081C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_r_switchExpression494 = new BitSet(new long[]{0x0005000010000000L});
    public static final BitSet FOLLOW_28_in_r_switchExpression497 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression499 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression501 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression506 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_r_switchExpression512 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_switchExpression514 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression516 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_r_switchExpression521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_casePart537 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_casePart539 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_casePart541 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_casePart543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression555 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_r_orExpression559 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression561 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression576 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_r_andExpression580 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression582 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression597 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_r_impliesExpression601 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression603 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression619 = new BitSet(new long[]{0x0FC0000000000002L});
    public static final BitSet FOLLOW_set_in_r_relationalExpression624 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression648 = new BitSet(new long[]{0x0FC0000000000002L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression661 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_set_in_r_additiveExpression668 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression675 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression688 = new BitSet(new long[]{0x4000000040000002L});
    public static final BitSet FOLLOW_set_in_r_multiplicativeExpression693 = new BitSet(new long[]{0xA00001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression701 = new BitSet(new long[]{0x4000000040000002L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_r_unaryExpression720 = new BitSet(new long[]{0x000001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_r_unaryExpression727 = new BitSet(new long[]{0x000001C010000070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression740 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_r_infixExpression745 = new BitSet(new long[]{0x000001C000000040L,0x000000000000FF80L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression747 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_r_primaryExpression765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_r_paranthesizedExpression836 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression838 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_r_globalVarExpression855 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall871 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_featureCall873 = new BitSet(new long[]{0xA00083C090800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall876 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_r_listLiteral907 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral909 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_29_in_r_listLiteral912 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral914 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_r_listLiteral919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_r_constructorCall930 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_r_nullLiteral958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral977 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_r_numberLiteral979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_r_collectionExpression994 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_collectionExpression998 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression1000 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionExpression1011 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_collectionExpression1061 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_r_collectionExpression1066 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression1070 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1089 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_r_declaredParameterList1092 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1094 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter1107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1124 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_r_parameterList1128 = new BitSet(new long[]{0xA00083C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1130 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionType1167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_r_collectionType1185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType1187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_r_collectionType1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1202 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_simpleType1207 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1209 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred1395 = new BitSet(new long[]{0x000001C000000040L});
    public static final BitSet FOLLOW_r_type_in_synpred1397 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred1399 = new BitSet(new long[]{0xA00081C010800070L,0x000000000000FFFBL});
    public static final BitSet FOLLOW_r_castedExpression_in_synpred1401 = new BitSet(new long[]{0x0000000000000002L});

}