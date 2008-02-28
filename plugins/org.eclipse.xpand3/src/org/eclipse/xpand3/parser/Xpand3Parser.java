// $ANTLR 3.0.1 src/org/eclipse/xpand3/parser/Xpand3.g 2008-02-28 17:18:31
 	
package org.eclipse.xpand3.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/** START EDITED 'abstract' added */
public abstract class Xpand3Parser extends Parser {
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

        public Xpand3Parser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[60+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }
    
    /* START EDITED */
    protected abstract void ruleEntered(String ruleName);
	protected abstract void ruleLeft(String ruleName);
	protected abstract void assignNextNodeTo(String alias);
	protected abstract void tokenConsumed(String name, CommonToken ct);
    /* END EDITED */

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "src/org/eclipse/xpand3/parser/Xpand3.g"; }


    public static class r_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_file
    // src/org/eclipse/xpand3/parser/Xpand3.g:17:1: r_file : (imp= r_nsImport )* (decl= r_abstractDeclaration )* EOF ;
    public final r_file_return r_file() throws RecognitionException {
        r_file_return retval = new r_file_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF1=null;
        r_nsImport_return imp = null;

        r_abstractDeclaration_return decl = null;


        Object EOF1_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_file");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:17:9: ( (imp= r_nsImport )* (decl= r_abstractDeclaration )* EOF )
            // src/org/eclipse/xpand3/parser/Xpand3.g:18:2: (imp= r_nsImport )* (decl= r_abstractDeclaration )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:18:2: (imp= r_nsImport )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:18:3: imp= r_nsImport
            	    {
            	    pushFollow(FOLLOW_r_nsImport_in_r_file51);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("imp");
            	    	}
            	    /** END EDITED */
            	    imp=r_nsImport();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, imp.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:19:2: (decl= r_abstractDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LG||LA2_0==Identifier||LA2_0==58||LA2_0==62||(LA2_0>=64 && LA2_0<=66)||(LA2_0>=69 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:19:3: decl= r_abstractDeclaration
            	    {
            	    pushFollow(FOLLOW_r_abstractDeclaration_in_r_file59);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("decl");
            	    	}
            	    /** END EDITED */
            	    decl=r_abstractDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, decl.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF1=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("EOF1", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,EOF,FOLLOW_EOF_in_r_file66); if (failed) return retval;
            if ( backtracking==0 ) {
            EOF1_tree = (Object)adaptor.create(EOF1);
            adaptor.addChild(root_0, EOF1_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_file");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_file

    public static class r_nsImport_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_nsImport
    // src/org/eclipse/xpand3/parser/Xpand3.g:23:1: r_nsImport : ( LG 'IMPORT' ns= r_type RG | LG 'EXTENSION' ns= r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );
    public final r_nsImport_return r_nsImport() throws RecognitionException {
        r_nsImport_return retval = new r_nsImport_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LG2=null;
        Token string_literal3=null;
        Token RG4=null;
        Token LG5=null;
        Token string_literal6=null;
        Token RG7=null;
        Token string_literal8=null;
        Token char_literal10=null;
        Token string_literal11=null;
        Token string_literal13=null;
        Token char_literal14=null;
        r_type_return ns = null;

        r_type_return r_type9 = null;

        r_type_return r_type12 = null;


        Object LG2_tree=null;
        Object string_literal3_tree=null;
        Object RG4_tree=null;
        Object LG5_tree=null;
        Object string_literal6_tree=null;
        Object RG7_tree=null;
        Object string_literal8_tree=null;
        Object char_literal10_tree=null;
        Object string_literal11_tree=null;
        Object string_literal13_tree=null;
        Object char_literal14_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_nsImport");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:23:11: ( LG 'IMPORT' ns= r_type RG | LG 'EXTENSION' ns= r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' )
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
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("23:1: r_nsImport : ( LG 'IMPORT' ns= r_type RG | LG 'EXTENSION' ns= r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );", 4, 1, input);

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
                    new NoViableAltException("23:1: r_nsImport : ( LG 'IMPORT' ns= r_type RG | LG 'EXTENSION' ns= r_type RG | 'import' r_type ';' | 'extension' r_type ( 'reexport' )? ';' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:24:2: LG 'IMPORT' ns= r_type RG
                    {
                    root_0 = (Object)adaptor.nil();

                    LG2=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("LG2", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,LG,FOLLOW_LG_in_r_nsImport75); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LG2_tree = (Object)adaptor.create(LG2);
                    adaptor.addChild(root_0, LG2_tree);
                    }
                    string_literal3=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal3", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,25,FOLLOW_25_in_r_nsImport77); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal3_tree = (Object)adaptor.create(string_literal3);
                    adaptor.addChild(root_0, string_literal3_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport81);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("ns");
                    	}
                    /** END EDITED */
                    ns=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ns.getTree());
                    RG4=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("RG4", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,RG,FOLLOW_RG_in_r_nsImport83); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RG4_tree = (Object)adaptor.create(RG4);
                    adaptor.addChild(root_0, RG4_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:25:2: LG 'EXTENSION' ns= r_type RG
                    {
                    root_0 = (Object)adaptor.nil();

                    LG5=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("LG5", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,LG,FOLLOW_LG_in_r_nsImport88); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LG5_tree = (Object)adaptor.create(LG5);
                    adaptor.addChild(root_0, LG5_tree);
                    }
                    string_literal6=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal6", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,26,FOLLOW_26_in_r_nsImport90); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal6_tree = (Object)adaptor.create(string_literal6);
                    adaptor.addChild(root_0, string_literal6_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport94);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("ns");
                    	}
                    /** END EDITED */
                    ns=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ns.getTree());
                    RG7=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("RG7", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,RG,FOLLOW_RG_in_r_nsImport96); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RG7_tree = (Object)adaptor.create(RG7);
                    adaptor.addChild(root_0, RG7_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:26:2: 'import' r_type ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal8=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal8", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,27,FOLLOW_27_in_r_nsImport101); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal8_tree = (Object)adaptor.create(string_literal8);
                    adaptor.addChild(root_0, string_literal8_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport103);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_type9");
                    	}
                    /** END EDITED */
                    r_type9=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type9.getTree());
                    char_literal10=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal10", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,28,FOLLOW_28_in_r_nsImport106); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal10_tree = (Object)adaptor.create(char_literal10);
                    adaptor.addChild(root_0, char_literal10_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:27:2: 'extension' r_type ( 'reexport' )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal11=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal11", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,29,FOLLOW_29_in_r_nsImport112); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal11_tree = (Object)adaptor.create(string_literal11);
                    adaptor.addChild(root_0, string_literal11_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_nsImport114);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_type12");
                    	}
                    /** END EDITED */
                    r_type12=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type12.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:27:21: ( 'reexport' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==30) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:27:22: 'reexport'
                            {
                            string_literal13=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("string_literal13", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,30,FOLLOW_30_in_r_nsImport117); if (failed) return retval;
                            if ( backtracking==0 ) {
                            string_literal13_tree = (Object)adaptor.create(string_literal13);
                            adaptor.addChild(root_0, string_literal13_tree);
                            }

                            }
                            break;

                    }

                    char_literal14=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal14", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,28,FOLLOW_28_in_r_nsImport121); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal14_tree = (Object)adaptor.create(char_literal14);
                    adaptor.addChild(root_0, char_literal14_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_nsImport");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_nsImport

    public static class r_abstractDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_abstractDeclaration
    // src/org/eclipse/xpand3/parser/Xpand3.g:30:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );
    public final r_abstractDeclaration_return r_abstractDeclaration() throws RecognitionException {
        r_abstractDeclaration_return retval = new r_abstractDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_check_return r_check15 = null;

        r_around_return r_around16 = null;

        r_extension_return r_extension17 = null;

        r_definition_return r_definition18 = null;

        r_definitionAround_return r_definitionAround19 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_abstractDeclaration");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:23: ( r_check | r_around | r_extension | r_definition | r_definitionAround )
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
                        new NoViableAltException("30:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("30:1: r_abstractDeclaration : ( r_check | r_around | r_extension | r_definition | r_definitionAround );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:31:2: r_check
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_check_in_r_abstractDeclaration132);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_check15");
                    	}
                    /** END EDITED */
                    r_check15=r_check();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_check15.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:32:2: r_around
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_around_in_r_abstractDeclaration137);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_around16");
                    	}
                    /** END EDITED */
                    r_around16=r_around();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_around16.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:33:2: r_extension
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_extension_in_r_abstractDeclaration142);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_extension17");
                    	}
                    /** END EDITED */
                    r_extension17=r_extension();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_extension17.getTree());

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:34:2: r_definition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_definition_in_r_abstractDeclaration147);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_definition18");
                    	}
                    /** END EDITED */
                    r_definition18=r_definition();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_definition18.getTree());

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:35:2: r_definitionAround
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_definitionAround_in_r_abstractDeclaration152);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_definitionAround19");
                    	}
                    /** END EDITED */
                    r_definitionAround19=r_definitionAround();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_definitionAround19.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_abstractDeclaration");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_abstractDeclaration

    public static class r_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_definition
    // src/org/eclipse/xpand3/parser/Xpand3.g:40:1: r_definition : LG DEFINE name= r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG ;
    public final r_definition_return r_definition() throws RecognitionException {
        r_definition_return retval = new r_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LG20=null;
        Token DEFINE21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token string_literal28=null;
        Token ENDDEFINE31=null;
        Token RG32=null;
        r_identifier_return name = null;

        r_declaredParameterList_return r_declaredParameterList23 = null;

        r_type_return r_type29 = null;

        r_sequence_return r_sequence30 = null;


        Object LG20_tree=null;
        Object DEFINE21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;
        Object string_literal28_tree=null;
        Object ENDDEFINE31_tree=null;
        Object RG32_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_definition");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:14: ( LG DEFINE name= r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG )
            // src/org/eclipse/xpand3/parser/Xpand3.g:41:2: LG DEFINE name= r_identifier ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDDEFINE RG
            {
            root_0 = (Object)adaptor.nil();

            LG20=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("LG20", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,LG,FOLLOW_LG_in_r_definition164); if (failed) return retval;
            if ( backtracking==0 ) {
            LG20_tree = (Object)adaptor.create(LG20);
            adaptor.addChild(root_0, LG20_tree);
            }
            DEFINE21=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("DEFINE21", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,DEFINE,FOLLOW_DEFINE_in_r_definition166); if (failed) return retval;
            if ( backtracking==0 ) {
            DEFINE21_tree = (Object)adaptor.create(DEFINE21);
            adaptor.addChild(root_0, DEFINE21_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_definition170);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("name");
            	}
            /** END EDITED */
            name=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, name.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:41:30: ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:41:31: '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')'
                    {
                    char_literal22=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal22", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_definition173); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal22_tree = (Object)adaptor.create(char_literal22);
                    adaptor.addChild(root_0, char_literal22_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:41:35: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
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
                            // src/org/eclipse/xpand3/parser/Xpand3.g:41:36: r_declaredParameterList ( ( ',' )? '*' )?
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_definition176);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_declaredParameterList23");
                            	}
                            /** END EDITED */
                            r_declaredParameterList23=r_declaredParameterList();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList23.getTree());
                            // src/org/eclipse/xpand3/parser/Xpand3.g:41:60: ( ( ',' )? '*' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:41:61: ( ',' )? '*'
                                    {
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:41:61: ( ',' )?
                                    int alt6=2;
                                    int LA6_0 = input.LA(1);

                                    if ( (LA6_0==32) ) {
                                        alt6=1;
                                    }
                                    switch (alt6) {
                                        case 1 :
                                            // src/org/eclipse/xpand3/parser/Xpand3.g:41:61: ','
                                            {
                                            char_literal24=(Token)input.LT(1);
                                            /** START EDITED */
                                            if(backtracking==0) {
                                              tokenConsumed("char_literal24", (CommonToken) input.LT(1));
                                            }
                                            /** END EDITED */
                                            match(input,32,FOLLOW_32_in_r_definition179); if (failed) return retval;
                                            if ( backtracking==0 ) {
                                            char_literal24_tree = (Object)adaptor.create(char_literal24);
                                            adaptor.addChild(root_0, char_literal24_tree);
                                            }

                                            }
                                            break;

                                    }

                                    char_literal25=(Token)input.LT(1);
                                    /** START EDITED */
                                    if(backtracking==0) {
                                      tokenConsumed("char_literal25", (CommonToken) input.LT(1));
                                    }
                                    /** END EDITED */
                                    match(input,33,FOLLOW_33_in_r_definition182); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal25_tree = (Object)adaptor.create(char_literal25);
                                    adaptor.addChild(root_0, char_literal25_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:41:74: '*'
                            {
                            char_literal26=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal26", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,33,FOLLOW_33_in_r_definition188); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal26_tree = (Object)adaptor.create(char_literal26);
                            adaptor.addChild(root_0, char_literal26_tree);
                            }

                            }
                            break;

                    }

                    char_literal27=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal27", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_definition192); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal27_tree = (Object)adaptor.create(char_literal27);
                    adaptor.addChild(root_0, char_literal27_tree);
                    }

                    }
                    break;

            }

            string_literal28=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal28", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,35,FOLLOW_35_in_r_definition196); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal28_tree = (Object)adaptor.create(string_literal28);
            adaptor.addChild(root_0, string_literal28_tree);
            }
            pushFollow(FOLLOW_r_type_in_r_definition198);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_type29");
            	}
            /** END EDITED */
            r_type29=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type29.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_definition201);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence30");
            	}
            /** END EDITED */
            r_sequence30=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence30.getTree());
            ENDDEFINE31=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("ENDDEFINE31", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,ENDDEFINE,FOLLOW_ENDDEFINE_in_r_definition204); if (failed) return retval;
            if ( backtracking==0 ) {
            ENDDEFINE31_tree = (Object)adaptor.create(ENDDEFINE31);
            adaptor.addChild(root_0, ENDDEFINE31_tree);
            }
            RG32=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("RG32", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,RG,FOLLOW_RG_in_r_definition206); if (failed) return retval;
            if ( backtracking==0 ) {
            RG32_tree = (Object)adaptor.create(RG32);
            adaptor.addChild(root_0, RG32_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_definition");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_definition

    public static class r_definitionAround_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_definitionAround
    // src/org/eclipse/xpand3/parser/Xpand3.g:46:1: r_definitionAround : LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG ;
    public final r_definitionAround_return r_definitionAround() throws RecognitionException {
        r_definitionAround_return retval = new r_definitionAround_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LG33=null;
        Token AROUND34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token string_literal42=null;
        Token ENDAROUND45=null;
        Token RG46=null;
        r_pointcut_return r_pointcut35 = null;

        r_declaredParameterList_return r_declaredParameterList37 = null;

        r_type_return r_type43 = null;

        r_sequence_return r_sequence44 = null;


        Object LG33_tree=null;
        Object AROUND34_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal40_tree=null;
        Object char_literal41_tree=null;
        Object string_literal42_tree=null;
        Object ENDAROUND45_tree=null;
        Object RG46_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_definitionAround");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:46:20: ( LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG )
            // src/org/eclipse/xpand3/parser/Xpand3.g:47:2: LG AROUND r_pointcut ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )? 'FOR' r_type r_sequence ENDAROUND RG
            {
            root_0 = (Object)adaptor.nil();

            LG33=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("LG33", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,LG,FOLLOW_LG_in_r_definitionAround218); if (failed) return retval;
            if ( backtracking==0 ) {
            LG33_tree = (Object)adaptor.create(LG33);
            adaptor.addChild(root_0, LG33_tree);
            }
            AROUND34=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("AROUND34", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,AROUND,FOLLOW_AROUND_in_r_definitionAround220); if (failed) return retval;
            if ( backtracking==0 ) {
            AROUND34_tree = (Object)adaptor.create(AROUND34);
            adaptor.addChild(root_0, AROUND34_tree);
            }
            pushFollow(FOLLOW_r_pointcut_in_r_definitionAround222);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_pointcut35");
            	}
            /** END EDITED */
            r_pointcut35=r_pointcut();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_pointcut35.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:47:23: ( '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:47:24: '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')'
                    {
                    char_literal36=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal36", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_definitionAround225); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:47:28: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
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
                            // src/org/eclipse/xpand3/parser/Xpand3.g:47:29: r_declaredParameterList ( ( ',' )? '*' )?
                            {
                            pushFollow(FOLLOW_r_declaredParameterList_in_r_definitionAround228);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_declaredParameterList37");
                            	}
                            /** END EDITED */
                            r_declaredParameterList37=r_declaredParameterList();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList37.getTree());
                            // src/org/eclipse/xpand3/parser/Xpand3.g:47:53: ( ( ',' )? '*' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( ((LA11_0>=32 && LA11_0<=33)) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:47:54: ( ',' )? '*'
                                    {
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:47:54: ( ',' )?
                                    int alt10=2;
                                    int LA10_0 = input.LA(1);

                                    if ( (LA10_0==32) ) {
                                        alt10=1;
                                    }
                                    switch (alt10) {
                                        case 1 :
                                            // src/org/eclipse/xpand3/parser/Xpand3.g:47:54: ','
                                            {
                                            char_literal38=(Token)input.LT(1);
                                            /** START EDITED */
                                            if(backtracking==0) {
                                              tokenConsumed("char_literal38", (CommonToken) input.LT(1));
                                            }
                                            /** END EDITED */
                                            match(input,32,FOLLOW_32_in_r_definitionAround231); if (failed) return retval;
                                            if ( backtracking==0 ) {
                                            char_literal38_tree = (Object)adaptor.create(char_literal38);
                                            adaptor.addChild(root_0, char_literal38_tree);
                                            }

                                            }
                                            break;

                                    }

                                    char_literal39=(Token)input.LT(1);
                                    /** START EDITED */
                                    if(backtracking==0) {
                                      tokenConsumed("char_literal39", (CommonToken) input.LT(1));
                                    }
                                    /** END EDITED */
                                    match(input,33,FOLLOW_33_in_r_definitionAround234); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal39_tree = (Object)adaptor.create(char_literal39);
                                    adaptor.addChild(root_0, char_literal39_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:47:67: '*'
                            {
                            char_literal40=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal40", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,33,FOLLOW_33_in_r_definitionAround240); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal40_tree = (Object)adaptor.create(char_literal40);
                            adaptor.addChild(root_0, char_literal40_tree);
                            }

                            }
                            break;

                    }

                    char_literal41=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal41", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_definitionAround244); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal41_tree = (Object)adaptor.create(char_literal41);
                    adaptor.addChild(root_0, char_literal41_tree);
                    }

                    }
                    break;

            }

            string_literal42=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal42", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,35,FOLLOW_35_in_r_definitionAround248); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal42_tree = (Object)adaptor.create(string_literal42);
            adaptor.addChild(root_0, string_literal42_tree);
            }
            pushFollow(FOLLOW_r_type_in_r_definitionAround250);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_type43");
            	}
            /** END EDITED */
            r_type43=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type43.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_definitionAround253);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence44");
            	}
            /** END EDITED */
            r_sequence44=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence44.getTree());
            ENDAROUND45=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("ENDAROUND45", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,ENDAROUND,FOLLOW_ENDAROUND_in_r_definitionAround256); if (failed) return retval;
            if ( backtracking==0 ) {
            ENDAROUND45_tree = (Object)adaptor.create(ENDAROUND45);
            adaptor.addChild(root_0, ENDAROUND45_tree);
            }
            RG46=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("RG46", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,RG,FOLLOW_RG_in_r_definitionAround258); if (failed) return retval;
            if ( backtracking==0 ) {
            RG46_tree = (Object)adaptor.create(RG46);
            adaptor.addChild(root_0, RG46_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_definitionAround");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_definitionAround

    public static class r_sequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_sequence
    // src/org/eclipse/xpand3/parser/Xpand3.g:52:1: r_sequence : r_textSequence ( r_statement r_textSequence )* ;
    public final r_sequence_return r_sequence() throws RecognitionException {
        r_sequence_return retval = new r_sequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_textSequence_return r_textSequence47 = null;

        r_statement_return r_statement48 = null;

        r_textSequence_return r_textSequence49 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_sequence");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:52:12: ( r_textSequence ( r_statement r_textSequence )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:53:3: r_textSequence ( r_statement r_textSequence )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_textSequence_in_r_sequence270);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_textSequence47");
            	}
            /** END EDITED */
            r_textSequence47=r_textSequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_textSequence47.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:54:3: ( r_statement r_textSequence )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=StringLiteral && LA14_0<=Identifier)||LA14_0==31||(LA14_0>=36 && LA14_0<=39)||LA14_0==41||LA14_0==46||LA14_0==50||LA14_0==52||LA14_0==59||(LA14_0>=69 && LA14_0<=72)||(LA14_0>=78 && LA14_0<=79)||(LA14_0>=94 && LA14_0<=108)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:54:4: r_statement r_textSequence
            	    {
            	    pushFollow(FOLLOW_r_statement_in_r_sequence276);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_statement48");
            	    	}
            	    /** END EDITED */
            	    r_statement48=r_statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_statement48.getTree());
            	    pushFollow(FOLLOW_r_textSequence_in_r_sequence282);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_textSequence49");
            	    	}
            	    /** END EDITED */
            	    r_textSequence49=r_textSequence();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_textSequence49.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_sequence");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_sequence

    public static class r_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_statement
    // src/org/eclipse/xpand3/parser/Xpand3.g:58:1: r_statement : ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement );
    public final r_statement_return r_statement() throws RecognitionException {
        r_statement_return retval = new r_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_simpleStatement_return r_simpleStatement50 = null;

        r_fileStatement_return r_fileStatement51 = null;

        r_foreachStatement_return r_foreachStatement52 = null;

        r_ifStatement_return r_ifStatement53 = null;

        r_letStatement_return r_letStatement54 = null;

        r_protectStatement_return r_protectStatement55 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_statement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:58:13: ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement )
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
                    new NoViableAltException("58:1: r_statement : ( r_simpleStatement | r_fileStatement | r_foreachStatement | r_ifStatement | r_letStatement | r_protectStatement );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:59:3: r_simpleStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_simpleStatement_in_r_statement297);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_simpleStatement50");
                    	}
                    /** END EDITED */
                    r_simpleStatement50=r_simpleStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleStatement50.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:60:3: r_fileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_fileStatement_in_r_statement302);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_fileStatement51");
                    	}
                    /** END EDITED */
                    r_fileStatement51=r_fileStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_fileStatement51.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:61:3: r_foreachStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_foreachStatement_in_r_statement307);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_foreachStatement52");
                    	}
                    /** END EDITED */
                    r_foreachStatement52=r_foreachStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_foreachStatement52.getTree());

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:62:3: r_ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_ifStatement_in_r_statement312);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_ifStatement53");
                    	}
                    /** END EDITED */
                    r_ifStatement53=r_ifStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_ifStatement53.getTree());

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:63:3: r_letStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_letStatement_in_r_statement317);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_letStatement54");
                    	}
                    /** END EDITED */
                    r_letStatement54=r_letStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_letStatement54.getTree());

                    }
                    break;
                case 6 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:64:3: r_protectStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_protectStatement_in_r_statement322);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_protectStatement55");
                    	}
                    /** END EDITED */
                    r_protectStatement55=r_protectStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_protectStatement55.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_statement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_statement

    public static class r_textSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_textSequence
    // src/org/eclipse/xpand3/parser/Xpand3.g:67:1: r_textSequence : r_text ( r_text )* ;
    public final r_textSequence_return r_textSequence() throws RecognitionException {
        r_textSequence_return retval = new r_textSequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_text_return r_text56 = null;

        r_text_return r_text57 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_textSequence");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:67:16: ( r_text ( r_text )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:68:2: r_text ( r_text )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_text_in_r_textSequence333);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_text56");
            	}
            /** END EDITED */
            r_text56=r_text();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_text56.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:68:9: ( r_text )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:68:10: r_text
            	    {
            	    pushFollow(FOLLOW_r_text_in_r_textSequence336);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_text57");
            	    	}
            	    /** END EDITED */
            	    r_text57=r_text();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_text57.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_textSequence");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_textSequence

    public static class r_text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_text
    // src/org/eclipse/xpand3/parser/Xpand3.g:71:1: r_text : ( '-' )? TEXT ;
    public final r_text_return r_text() throws RecognitionException {
        r_text_return retval = new r_text_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal58=null;
        Token TEXT59=null;

        Object char_literal58_tree=null;
        Object TEXT59_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_text");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:71:8: ( ( '-' )? TEXT )
            // src/org/eclipse/xpand3/parser/Xpand3.g:72:2: ( '-' )? TEXT
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:72:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:72:2: '-'
                    {
                    char_literal58=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal58", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,36,FOLLOW_36_in_r_text348); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal58_tree = (Object)adaptor.create(char_literal58);
                    adaptor.addChild(root_0, char_literal58_tree);
                    }

                    }
                    break;

            }

            TEXT59=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("TEXT59", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,TEXT,FOLLOW_TEXT_in_r_text351); if (failed) return retval;
            if ( backtracking==0 ) {
            TEXT59_tree = (Object)adaptor.create(TEXT59);
            adaptor.addChild(root_0, TEXT59_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_text");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_text

    public static class r_simpleStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_simpleStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:75:1: r_simpleStatement : ( r_errorStatement | r_expandStatement | r_expressionStmt );
    public final r_simpleStatement_return r_simpleStatement() throws RecognitionException {
        r_simpleStatement_return retval = new r_simpleStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_errorStatement_return r_errorStatement60 = null;

        r_expandStatement_return r_expandStatement61 = null;

        r_expressionStmt_return r_expressionStmt62 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_simpleStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:75:19: ( r_errorStatement | r_expandStatement | r_expressionStmt )
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
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("75:1: r_simpleStatement : ( r_errorStatement | r_expandStatement | r_expressionStmt );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:76:3: r_errorStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_errorStatement_in_r_simpleStatement362);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_errorStatement60");
                    	}
                    /** END EDITED */
                    r_errorStatement60=r_errorStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_errorStatement60.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:77:3: r_expandStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_expandStatement_in_r_simpleStatement366);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expandStatement61");
                    	}
                    /** END EDITED */
                    r_expandStatement61=r_expandStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expandStatement61.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:78:3: r_expressionStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_expressionStmt_in_r_simpleStatement370);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expressionStmt62");
                    	}
                    /** END EDITED */
                    r_expressionStmt62=r_expressionStmt();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expressionStmt62.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_simpleStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_simpleStatement

    public static class r_errorStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_errorStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:81:1: r_errorStatement : 'ERROR' r_expression ;
    public final r_errorStatement_return r_errorStatement() throws RecognitionException {
        r_errorStatement_return retval = new r_errorStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal63=null;
        r_expression_return r_expression64 = null;


        Object string_literal63_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_errorStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:81:18: ( 'ERROR' r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:82:3: 'ERROR' r_expression
            {
            root_0 = (Object)adaptor.nil();

            string_literal63=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal63", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,37,FOLLOW_37_in_r_errorStatement381); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal63_tree = (Object)adaptor.create(string_literal63);
            adaptor.addChild(root_0, string_literal63_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_errorStatement383);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression64");
            	}
            /** END EDITED */
            r_expression64=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression64.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_errorStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_errorStatement

    public static class r_expandStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_expandStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:85:1: r_expandStatement : 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )? ;
    public final r_expandStatement_return r_expandStatement() throws RecognitionException {
        r_expandStatement_return retval = new r_expandStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token string_literal70=null;
        Token string_literal72=null;
        Token string_literal74=null;
        r_simpleType_return r_simpleType66 = null;

        r_parameterList_return r_parameterList68 = null;

        r_expression_return r_expression71 = null;

        r_expression_return r_expression73 = null;

        r_expression_return r_expression75 = null;


        Object string_literal65_tree=null;
        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        Object string_literal70_tree=null;
        Object string_literal72_tree=null;
        Object string_literal74_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_expandStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:85:19: ( 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:86:3: 'EXPAND' r_simpleType ( '(' r_parameterList ')' )? ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal65=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal65", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,38,FOLLOW_38_in_r_expandStatement394); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal65_tree = (Object)adaptor.create(string_literal65);
            adaptor.addChild(root_0, string_literal65_tree);
            }
            pushFollow(FOLLOW_r_simpleType_in_r_expandStatement396);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_simpleType66");
            	}
            /** END EDITED */
            r_simpleType66=r_simpleType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType66.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:86:25: ( '(' r_parameterList ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:86:26: '(' r_parameterList ')'
                    {
                    char_literal67=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal67", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_expandStatement399); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal67_tree = (Object)adaptor.create(char_literal67);
                    adaptor.addChild(root_0, char_literal67_tree);
                    }
                    pushFollow(FOLLOW_r_parameterList_in_r_expandStatement401);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_parameterList68");
                    	}
                    /** END EDITED */
                    r_parameterList68=r_parameterList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_parameterList68.getTree());
                    char_literal69=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal69", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_expandStatement403); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal69_tree = (Object)adaptor.create(char_literal69);
                    adaptor.addChild(root_0, char_literal69_tree);
                    }

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:86:52: ( ( 'FOR' r_expression ) | ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? ) )?
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:86:53: ( 'FOR' r_expression )
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:86:53: ( 'FOR' r_expression )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:86:54: 'FOR' r_expression
                    {
                    string_literal70=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal70", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,35,FOLLOW_35_in_r_expandStatement409); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal70_tree = (Object)adaptor.create(string_literal70);
                    adaptor.addChild(root_0, string_literal70_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_expandStatement411);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression71");
                    	}
                    /** END EDITED */
                    r_expression71=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression71.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:87:5: ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? )
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:87:5: ( 'FOREACH' r_expression ( 'SEPARATOR' r_expression )? )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:87:6: 'FOREACH' r_expression ( 'SEPARATOR' r_expression )?
                    {
                    string_literal72=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal72", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,39,FOLLOW_39_in_r_expandStatement419); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal72_tree = (Object)adaptor.create(string_literal72);
                    adaptor.addChild(root_0, string_literal72_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_expandStatement420);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression73");
                    	}
                    /** END EDITED */
                    r_expression73=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression73.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:87:28: ( 'SEPARATOR' r_expression )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==40) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:87:29: 'SEPARATOR' r_expression
                            {
                            string_literal74=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("string_literal74", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,40,FOLLOW_40_in_r_expandStatement423); if (failed) return retval;
                            if ( backtracking==0 ) {
                            string_literal74_tree = (Object)adaptor.create(string_literal74);
                            adaptor.addChild(root_0, string_literal74_tree);
                            }
                            pushFollow(FOLLOW_r_expression_in_r_expandStatement425);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_expression75");
                            	}
                            /** END EDITED */
                            r_expression75=r_expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression75.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_expandStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_expandStatement

    public static class r_expressionStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_expressionStmt
    // src/org/eclipse/xpand3/parser/Xpand3.g:90:1: r_expressionStmt : r_expression ;
    public final r_expressionStmt_return r_expressionStmt() throws RecognitionException {
        r_expressionStmt_return retval = new r_expressionStmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_expression_return r_expression76 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_expressionStmt");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:90:19: ( r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:91:2: r_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_expression_in_r_expressionStmt441);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression76");
            	}
            /** END EDITED */
            r_expression76=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression76.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_expressionStmt");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_expressionStmt

    public static class r_fileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_fileStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:94:1: r_fileStatement : 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE' ;
    public final r_fileStatement_return r_fileStatement() throws RecognitionException {
        r_fileStatement_return retval = new r_fileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token string_literal81=null;
        r_expression_return r_expression78 = null;

        r_identifier_return r_identifier79 = null;

        r_sequence_return r_sequence80 = null;


        Object string_literal77_tree=null;
        Object string_literal81_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_fileStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:94:17: ( 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:95:2: 'FILE' r_expression ( r_identifier )? r_sequence 'ENDFILE'
            {
            root_0 = (Object)adaptor.nil();

            string_literal77=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal77", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,41,FOLLOW_41_in_r_fileStatement451); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal77_tree = (Object)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_fileStatement453);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression78");
            	}
            /** END EDITED */
            r_expression78=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression78.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:95:22: ( r_identifier )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identifier) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:95:23: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_fileStatement456);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_identifier79");
                    	}
                    /** END EDITED */
                    r_identifier79=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier79.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_fileStatement462);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence80");
            	}
            /** END EDITED */
            r_sequence80=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence80.getTree());
            string_literal81=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal81", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,42,FOLLOW_42_in_r_fileStatement466); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal81_tree = (Object)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_fileStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_fileStatement

    public static class r_foreachStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_foreachStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:100:1: r_foreachStatement : 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH' ;
    public final r_foreachStatement_return r_foreachStatement() throws RecognitionException {
        r_foreachStatement_return retval = new r_foreachStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        Token string_literal84=null;
        Token string_literal86=null;
        Token string_literal88=null;
        Token string_literal91=null;
        r_expression_return r_expression83 = null;

        r_identifier_return r_identifier85 = null;

        r_identifier_return r_identifier87 = null;

        r_expression_return r_expression89 = null;

        r_sequence_return r_sequence90 = null;


        Object string_literal82_tree=null;
        Object string_literal84_tree=null;
        Object string_literal86_tree=null;
        Object string_literal88_tree=null;
        Object string_literal91_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_foreachStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:100:20: ( 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:101:3: 'FOREACH' r_expression 'AS' r_identifier ( 'ITERATOR' r_identifier )? ( 'SEPARATOR' r_expression )? r_sequence 'ENDFOREACH'
            {
            root_0 = (Object)adaptor.nil();

            string_literal82=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal82", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,39,FOLLOW_39_in_r_foreachStatement478); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_foreachStatement480);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression83");
            	}
            /** END EDITED */
            r_expression83=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression83.getTree());
            string_literal84=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal84", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,43,FOLLOW_43_in_r_foreachStatement482); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal84_tree = (Object)adaptor.create(string_literal84);
            adaptor.addChild(root_0, string_literal84_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_foreachStatement484);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_identifier85");
            	}
            /** END EDITED */
            r_identifier85=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier85.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:101:44: ( 'ITERATOR' r_identifier )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:101:45: 'ITERATOR' r_identifier
                    {
                    string_literal86=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal86", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,44,FOLLOW_44_in_r_foreachStatement487); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal86_tree = (Object)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);
                    }
                    pushFollow(FOLLOW_r_identifier_in_r_foreachStatement489);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_identifier87");
                    	}
                    /** END EDITED */
                    r_identifier87=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier87.getTree());

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:101:71: ( 'SEPARATOR' r_expression )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:101:72: 'SEPARATOR' r_expression
                    {
                    string_literal88=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal88", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,40,FOLLOW_40_in_r_foreachStatement494); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal88_tree = (Object)adaptor.create(string_literal88);
                    adaptor.addChild(root_0, string_literal88_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_foreachStatement496);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression89");
                    	}
                    /** END EDITED */
                    r_expression89=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression89.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_foreachStatement504);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence90");
            	}
            /** END EDITED */
            r_sequence90=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence90.getTree());
            string_literal91=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal91", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,45,FOLLOW_45_in_r_foreachStatement509); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal91_tree = (Object)adaptor.create(string_literal91);
            adaptor.addChild(root_0, string_literal91_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_foreachStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_foreachStatement

    public static class r_ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_ifStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:106:1: r_ifStatement : 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF' ;
    public final r_ifStatement_return r_ifStatement() throws RecognitionException {
        r_ifStatement_return retval = new r_ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal92=null;
        Token string_literal97=null;
        r_expression_return r_expression93 = null;

        r_sequence_return r_sequence94 = null;

        r_elseIfStatement_return r_elseIfStatement95 = null;

        r_elseStatement_return r_elseStatement96 = null;


        Object string_literal92_tree=null;
        Object string_literal97_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_ifStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:106:15: ( 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:107:6: 'IF' r_expression r_sequence ( r_elseIfStatement )* ( r_elseStatement )? 'ENDIF'
            {
            root_0 = (Object)adaptor.nil();

            string_literal92=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal92", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,46,FOLLOW_46_in_r_ifStatement524); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal92_tree = (Object)adaptor.create(string_literal92);
            adaptor.addChild(root_0, string_literal92_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_ifStatement526);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression93");
            	}
            /** END EDITED */
            r_expression93=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression93.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_ifStatement530);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence94");
            	}
            /** END EDITED */
            r_sequence94=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence94.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:109:3: ( r_elseIfStatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:109:3: r_elseIfStatement
            	    {
            	    pushFollow(FOLLOW_r_elseIfStatement_in_r_ifStatement535);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_elseIfStatement95");
            	    	}
            	    /** END EDITED */
            	    r_elseIfStatement95=r_elseIfStatement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_elseIfStatement95.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:110:3: ( r_elseStatement )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:110:3: r_elseStatement
                    {
                    pushFollow(FOLLOW_r_elseStatement_in_r_ifStatement540);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_elseStatement96");
                    	}
                    /** END EDITED */
                    r_elseStatement96=r_elseStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_elseStatement96.getTree());

                    }
                    break;

            }

            string_literal97=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal97", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,47,FOLLOW_47_in_r_ifStatement545); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_ifStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_ifStatement

    public static class r_elseIfStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_elseIfStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:114:1: r_elseIfStatement : 'ELSEIF' r_expression r_sequence ;
    public final r_elseIfStatement_return r_elseIfStatement() throws RecognitionException {
        r_elseIfStatement_return retval = new r_elseIfStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal98=null;
        r_expression_return r_expression99 = null;

        r_sequence_return r_sequence100 = null;


        Object string_literal98_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_elseIfStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:114:19: ( 'ELSEIF' r_expression r_sequence )
            // src/org/eclipse/xpand3/parser/Xpand3.g:115:2: 'ELSEIF' r_expression r_sequence
            {
            root_0 = (Object)adaptor.nil();

            string_literal98=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal98", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,48,FOLLOW_48_in_r_elseIfStatement555); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal98_tree = (Object)adaptor.create(string_literal98);
            adaptor.addChild(root_0, string_literal98_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_elseIfStatement557);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression99");
            	}
            /** END EDITED */
            r_expression99=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression99.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_elseIfStatement561);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence100");
            	}
            /** END EDITED */
            r_sequence100=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence100.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_elseIfStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_elseIfStatement

    public static class r_elseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_elseStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:119:1: r_elseStatement : 'ELSE' r_sequence ;
    public final r_elseStatement_return r_elseStatement() throws RecognitionException {
        r_elseStatement_return retval = new r_elseStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        r_sequence_return r_sequence102 = null;


        Object string_literal101_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_elseStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:119:17: ( 'ELSE' r_sequence )
            // src/org/eclipse/xpand3/parser/Xpand3.g:120:2: 'ELSE' r_sequence
            {
            root_0 = (Object)adaptor.nil();

            string_literal101=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal101", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,49,FOLLOW_49_in_r_elseStatement573); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal101_tree = (Object)adaptor.create(string_literal101);
            adaptor.addChild(root_0, string_literal101_tree);
            }
            pushFollow(FOLLOW_r_sequence_in_r_elseStatement577);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence102");
            	}
            /** END EDITED */
            r_sequence102=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence102.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_elseStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_elseStatement

    public static class r_letStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_letStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:124:1: r_letStatement : 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET' ;
    public final r_letStatement_return r_letStatement() throws RecognitionException {
        r_letStatement_return retval = new r_letStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal103=null;
        Token string_literal105=null;
        Token string_literal108=null;
        r_expression_return r_expression104 = null;

        r_identifier_return r_identifier106 = null;

        r_sequence_return r_sequence107 = null;


        Object string_literal103_tree=null;
        Object string_literal105_tree=null;
        Object string_literal108_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_letStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:124:16: ( 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:125:3: 'LET' r_expression 'AS' r_identifier r_sequence 'ENDLET'
            {
            root_0 = (Object)adaptor.nil();

            string_literal103=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal103", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,50,FOLLOW_50_in_r_letStatement589); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal103_tree = (Object)adaptor.create(string_literal103);
            adaptor.addChild(root_0, string_literal103_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_letStatement591);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression104");
            	}
            /** END EDITED */
            r_expression104=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression104.getTree());
            string_literal105=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal105", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,43,FOLLOW_43_in_r_letStatement593); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal105_tree = (Object)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_letStatement595);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_identifier106");
            	}
            /** END EDITED */
            r_identifier106=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier106.getTree());
            pushFollow(FOLLOW_r_sequence_in_r_letStatement601);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence107");
            	}
            /** END EDITED */
            r_sequence107=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence107.getTree());
            string_literal108=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal108", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,51,FOLLOW_51_in_r_letStatement606); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal108_tree = (Object)adaptor.create(string_literal108);
            adaptor.addChild(root_0, string_literal108_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_letStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_letStatement

    public static class r_protectStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_protectStatement
    // src/org/eclipse/xpand3/parser/Xpand3.g:130:1: r_protectStatement : 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT' ;
    public final r_protectStatement_return r_protectStatement() throws RecognitionException {
        r_protectStatement_return retval = new r_protectStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal112=null;
        Token string_literal114=null;
        Token string_literal116=null;
        Token string_literal118=null;
        r_expression_return r_expression111 = null;

        r_expression_return r_expression113 = null;

        r_expression_return r_expression115 = null;

        r_sequence_return r_sequence117 = null;


        Object string_literal109_tree=null;
        Object string_literal110_tree=null;
        Object string_literal112_tree=null;
        Object string_literal114_tree=null;
        Object string_literal116_tree=null;
        Object string_literal118_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_protectStatement");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:130:20: ( 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:131:2: 'PROTECT' 'CSTART' r_expression 'CEND' r_expression 'ID' r_expression ( 'DISABLE' )? r_sequence 'ENDPROTECT'
            {
            root_0 = (Object)adaptor.nil();

            string_literal109=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal109", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,52,FOLLOW_52_in_r_protectStatement617); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal109_tree = (Object)adaptor.create(string_literal109);
            adaptor.addChild(root_0, string_literal109_tree);
            }
            string_literal110=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal110", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,53,FOLLOW_53_in_r_protectStatement622); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal110_tree = (Object)adaptor.create(string_literal110);
            adaptor.addChild(root_0, string_literal110_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_protectStatement624);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression111");
            	}
            /** END EDITED */
            r_expression111=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression111.getTree());
            string_literal112=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal112", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,54,FOLLOW_54_in_r_protectStatement629); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal112_tree = (Object)adaptor.create(string_literal112);
            adaptor.addChild(root_0, string_literal112_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_protectStatement631);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression113");
            	}
            /** END EDITED */
            r_expression113=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression113.getTree());
            string_literal114=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal114", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,55,FOLLOW_55_in_r_protectStatement644); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal114_tree = (Object)adaptor.create(string_literal114);
            adaptor.addChild(root_0, string_literal114_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_protectStatement646);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression115");
            	}
            /** END EDITED */
            r_expression115=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression115.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:134:29: ( 'DISABLE' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:134:29: 'DISABLE'
                    {
                    string_literal116=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal116", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,56,FOLLOW_56_in_r_protectStatement648); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal116_tree = (Object)adaptor.create(string_literal116);
                    adaptor.addChild(root_0, string_literal116_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_r_sequence_in_r_protectStatement654);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_sequence117");
            	}
            /** END EDITED */
            r_sequence117=r_sequence();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_sequence117.getTree());
            string_literal118=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal118", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,57,FOLLOW_57_in_r_protectStatement658); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal118_tree = (Object)adaptor.create(string_literal118);
            adaptor.addChild(root_0, string_literal118_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_protectStatement");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_protectStatement

    public static class r_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_check
    // src/org/eclipse/xpand3/parser/Xpand3.g:141:1: r_check : 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' ;
    public final r_check_return r_check() throws RecognitionException {
        r_check_return retval = new r_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal119=null;
        Token string_literal121=null;
        Token set123=null;
        Token char_literal125=null;
        Token char_literal127=null;
        r_type_return r_type120 = null;

        r_expression_return r_expression122 = null;

        r_expression_return r_expression124 = null;

        r_expression_return r_expression126 = null;


        Object string_literal119_tree=null;
        Object string_literal121_tree=null;
        Object set123_tree=null;
        Object char_literal125_tree=null;
        Object char_literal127_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_check");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:141:9: ( 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:142:2: 'context' r_type ( 'if' r_expression )? ( 'ERROR' | 'WARNING' ) r_expression ':' r_expression ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal119=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal119", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,58,FOLLOW_58_in_r_check670); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal119_tree = (Object)adaptor.create(string_literal119);
            adaptor.addChild(root_0, string_literal119_tree);
            }
            pushFollow(FOLLOW_r_type_in_r_check672);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_type120");
            	}
            /** END EDITED */
            r_type120=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type120.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:142:19: ( 'if' r_expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:142:20: 'if' r_expression
                    {
                    string_literal121=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal121", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,59,FOLLOW_59_in_r_check675); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal121_tree = (Object)adaptor.create(string_literal121);
                    adaptor.addChild(root_0, string_literal121_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_check677);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression122");
                    	}
                    /** END EDITED */
                    r_expression122=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression122.getTree());

                    }
                    break;

            }

            set123=(Token)input.LT(1);
            if ( input.LA(1)==37||input.LA(1)==60 ) {
                /** START EDITED */
                if(backtracking==0) {
            	  tokenConsumed("set123", (CommonToken) input.LT(1));
            	}  
            	/** END EDITED */    input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set123));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_check681);    throw mse;
            }

            pushFollow(FOLLOW_r_expression_in_r_check687);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression124");
            	}
            /** END EDITED */
            r_expression124=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression124.getTree());
            char_literal125=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal125", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_check689); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal125_tree = (Object)adaptor.create(char_literal125);
            adaptor.addChild(root_0, char_literal125_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_check693);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression126");
            	}
            /** END EDITED */
            r_expression126=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression126.getTree());
            char_literal127=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal127", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,28,FOLLOW_28_in_r_check695); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal127_tree = (Object)adaptor.create(char_literal127);
            adaptor.addChild(root_0, char_literal127_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_check");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_check

    public static class r_around_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_around
    // src/org/eclipse/xpand3/parser/Xpand3.g:146:1: r_around : 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' ;
    public final r_around_return r_around() throws RecognitionException {
        r_around_return retval = new r_around_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal128=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Token char_literal133=null;
        Token char_literal134=null;
        Token char_literal135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        r_pointcut_return r_pointcut129 = null;

        r_declaredParameterList_return r_declaredParameterList131 = null;

        r_expression_return r_expression137 = null;


        Object string_literal128_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;
        Object char_literal133_tree=null;
        Object char_literal134_tree=null;
        Object char_literal135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_around");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:146:11: ( 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:147:5: 'around' r_pointcut '(' ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )? ')' ':' r_expression ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal128=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal128", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,62,FOLLOW_62_in_r_around710); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal128_tree = (Object)adaptor.create(string_literal128);
            adaptor.addChild(root_0, string_literal128_tree);
            }
            pushFollow(FOLLOW_r_pointcut_in_r_around712);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_pointcut129");
            	}
            /** END EDITED */
            r_pointcut129=r_pointcut();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_pointcut129.getTree());
            char_literal130=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal130", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,31,FOLLOW_31_in_r_around714); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal130_tree = (Object)adaptor.create(char_literal130);
            adaptor.addChild(root_0, char_literal130_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:147:29: ( r_declaredParameterList ( ( ',' )? '*' )? | '*' )?
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:147:30: r_declaredParameterList ( ( ',' )? '*' )?
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_around717);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_declaredParameterList131");
                    	}
                    /** END EDITED */
                    r_declaredParameterList131=r_declaredParameterList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList131.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:147:54: ( ( ',' )? '*' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=32 && LA30_0<=33)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:147:55: ( ',' )? '*'
                            {
                            // src/org/eclipse/xpand3/parser/Xpand3.g:147:55: ( ',' )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==32) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // src/org/eclipse/xpand3/parser/Xpand3.g:147:55: ','
                                    {
                                    char_literal132=(Token)input.LT(1);
                                    /** START EDITED */
                                    if(backtracking==0) {
                                      tokenConsumed("char_literal132", (CommonToken) input.LT(1));
                                    }
                                    /** END EDITED */
                                    match(input,32,FOLLOW_32_in_r_around720); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    char_literal132_tree = (Object)adaptor.create(char_literal132);
                                    adaptor.addChild(root_0, char_literal132_tree);
                                    }

                                    }
                                    break;

                            }

                            char_literal133=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal133", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,33,FOLLOW_33_in_r_around723); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal133_tree = (Object)adaptor.create(char_literal133);
                            adaptor.addChild(root_0, char_literal133_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:147:68: '*'
                    {
                    char_literal134=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal134", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,33,FOLLOW_33_in_r_around729); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal134_tree = (Object)adaptor.create(char_literal134);
                    adaptor.addChild(root_0, char_literal134_tree);
                    }

                    }
                    break;

            }

            char_literal135=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal135", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,34,FOLLOW_34_in_r_around733); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal135_tree = (Object)adaptor.create(char_literal135);
            adaptor.addChild(root_0, char_literal135_tree);
            }
            char_literal136=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal136", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_around735); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal136_tree = (Object)adaptor.create(char_literal136);
            adaptor.addChild(root_0, char_literal136_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_around742);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression137");
            	}
            /** END EDITED */
            r_expression137=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression137.getTree());
            char_literal138=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal138", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,28,FOLLOW_28_in_r_around744); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal138_tree = (Object)adaptor.create(char_literal138);
            adaptor.addChild(root_0, char_literal138_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_around");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_around

    public static class r_pointcut_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_pointcut
    // src/org/eclipse/xpand3/parser/Xpand3.g:151:1: r_pointcut : ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* ;
    public final r_pointcut_return r_pointcut() throws RecognitionException {
        r_pointcut_return retval = new r_pointcut_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal139=null;
        Token char_literal141=null;
        Token string_literal143=null;
        r_identifier_return r_identifier140 = null;

        r_identifier_return r_identifier142 = null;


        Object char_literal139_tree=null;
        Object char_literal141_tree=null;
        Object string_literal143_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_pointcut");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:151:13: ( ( '*' | r_identifier ) ( '*' | r_identifier | '::' )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:152:2: ( '*' | r_identifier ) ( '*' | r_identifier | '::' )*
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:152:2: ( '*' | r_identifier )
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
                    new NoViableAltException("152:2: ( '*' | r_identifier )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:152:4: '*'
                    {
                    char_literal139=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal139", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,33,FOLLOW_33_in_r_pointcut761); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal139_tree = (Object)adaptor.create(char_literal139);
                    adaptor.addChild(root_0, char_literal139_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:153:4: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_pointcut767);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_identifier140");
                    	}
                    /** END EDITED */
                    r_identifier140=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier140.getTree());

                    }
                    break;

            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:154:4: ( '*' | r_identifier | '::' )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:154:6: '*'
            	    {
            	    char_literal141=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("char_literal141", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,33,FOLLOW_33_in_r_pointcut775); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal141_tree = (Object)adaptor.create(char_literal141);
            	    adaptor.addChild(root_0, char_literal141_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:155:6: r_identifier
            	    {
            	    pushFollow(FOLLOW_r_identifier_in_r_pointcut783);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_identifier142");
            	    	}
            	    /** END EDITED */
            	    r_identifier142=r_identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier142.getTree());

            	    }
            	    break;
            	case 3 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:156:6: '::'
            	    {
            	    string_literal143=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("string_literal143", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,63,FOLLOW_63_in_r_pointcut791); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal143_tree = (Object)adaptor.create(string_literal143);
            	    adaptor.addChild(root_0, string_literal143_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_pointcut");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_pointcut

    public static class r_extension_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_extension
    // src/org/eclipse/xpand3/parser/Xpand3.g:159:1: r_extension : ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' ;
    public final r_extension_return r_extension() throws RecognitionException {
        r_extension_return retval = new r_extension_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set144=null;
        Token char_literal148=null;
        Token char_literal150=null;
        Token char_literal151=null;
        Token string_literal152=null;
        Token char_literal154=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal160=null;
        Token char_literal162=null;
        r_type_return r_type145 = null;

        r_identifier_return r_identifier146 = null;

        r_identifier_return r_identifier147 = null;

        r_declaredParameterList_return r_declaredParameterList149 = null;

        r_javaType_return r_javaType153 = null;

        r_identifier_return r_identifier155 = null;

        r_javaType_return r_javaType157 = null;

        r_javaType_return r_javaType159 = null;

        r_expression_return r_expression161 = null;


        Object set144_tree=null;
        Object char_literal148_tree=null;
        Object char_literal150_tree=null;
        Object char_literal151_tree=null;
        Object string_literal152_tree=null;
        Object char_literal154_tree=null;
        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        Object char_literal160_tree=null;
        Object char_literal162_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_extension");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:159:14: ( ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:160:2: ( 'private' | 'cached' | 'create' )* ( r_type )? r_identifier ( r_identifier )? '(' ( r_declaredParameterList )? ')' ':' ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression ) ';'
            {
            root_0 = (Object)adaptor.nil();

            // src/org/eclipse/xpand3/parser/Xpand3.g:160:2: ( 'private' | 'cached' | 'create' )*
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
            	    set144=(Token)input.LT(1);
            	    if ( (input.LA(1)>=64 && input.LA(1)<=66) ) {
            	        /** START EDITED */
            	        if(backtracking==0) {
            	    	  tokenConsumed("set144", (CommonToken) input.LT(1));
            	    	}  
            	    	/** END EDITED */    input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set144));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_extension805);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:160:33: ( r_type )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=69 && LA35_0<=71)) ) {
                alt35=1;
            }
            else if ( (LA35_0==Identifier) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==Identifier||LA35_2==63) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:160:33: r_type
                    {
                    pushFollow(FOLLOW_r_type_in_r_extension814);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_type145");
                    	}
                    /** END EDITED */
                    r_type145=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type145.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_r_identifier_in_r_extension817);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_identifier146");
            	}
            /** END EDITED */
            r_identifier146=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier146.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:160:54: ( r_identifier )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Identifier) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:160:54: r_identifier
                    {
                    pushFollow(FOLLOW_r_identifier_in_r_extension819);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_identifier147");
                    	}
                    /** END EDITED */
                    r_identifier147=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier147.getTree());

                    }
                    break;

            }

            char_literal148=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal148", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,31,FOLLOW_31_in_r_extension822); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal148_tree = (Object)adaptor.create(char_literal148);
            adaptor.addChild(root_0, char_literal148_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:160:72: ( r_declaredParameterList )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Identifier||(LA37_0>=69 && LA37_0<=71)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:160:72: r_declaredParameterList
                    {
                    pushFollow(FOLLOW_r_declaredParameterList_in_r_extension824);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_declaredParameterList149");
                    	}
                    /** END EDITED */
                    r_declaredParameterList149=r_declaredParameterList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameterList149.getTree());

                    }
                    break;

            }

            char_literal150=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal150", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,34,FOLLOW_34_in_r_extension827); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal150_tree = (Object)adaptor.create(char_literal150);
            adaptor.addChild(root_0, char_literal150_tree);
            }
            char_literal151=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal151", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_extension829); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal151_tree = (Object)adaptor.create(char_literal151);
            adaptor.addChild(root_0, char_literal151_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:161:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==67) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=StringLiteral && LA40_0<=Identifier)||LA40_0==31||LA40_0==36||LA40_0==59||(LA40_0>=69 && LA40_0<=72)||(LA40_0>=78 && LA40_0<=79)||(LA40_0>=94 && LA40_0<=108)) ) {
                alt40=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("161:3: ( 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')' | r_expression )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:161:4: 'JAVA' r_javaType '.' r_identifier '(' ( r_javaType ( ',' r_javaType )* )? ')'
                    {
                    string_literal152=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal152", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,67,FOLLOW_67_in_r_extension834); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal152_tree = (Object)adaptor.create(string_literal152);
                    adaptor.addChild(root_0, string_literal152_tree);
                    }
                    pushFollow(FOLLOW_r_javaType_in_r_extension836);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_javaType153");
                    	}
                    /** END EDITED */
                    r_javaType153=r_javaType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_javaType153.getTree());
                    char_literal154=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal154", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,68,FOLLOW_68_in_r_extension838); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal154_tree = (Object)adaptor.create(char_literal154);
                    adaptor.addChild(root_0, char_literal154_tree);
                    }
                    pushFollow(FOLLOW_r_identifier_in_r_extension840);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_identifier155");
                    	}
                    /** END EDITED */
                    r_identifier155=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier155.getTree());
                    char_literal156=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal156", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_extension842); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal156_tree = (Object)adaptor.create(char_literal156);
                    adaptor.addChild(root_0, char_literal156_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:161:42: ( r_javaType ( ',' r_javaType )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==Identifier) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:161:43: r_javaType ( ',' r_javaType )*
                            {
                            pushFollow(FOLLOW_r_javaType_in_r_extension844);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_javaType157");
                            	}
                            /** END EDITED */
                            r_javaType157=r_javaType();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_javaType157.getTree());
                            // src/org/eclipse/xpand3/parser/Xpand3.g:161:54: ( ',' r_javaType )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==32) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // src/org/eclipse/xpand3/parser/Xpand3.g:161:55: ',' r_javaType
                            	    {
                            	    char_literal158=(Token)input.LT(1);
                            	    /** START EDITED */
                            	    if(backtracking==0) {
                            	      tokenConsumed("char_literal158", (CommonToken) input.LT(1));
                            	    }
                            	    /** END EDITED */
                            	    match(input,32,FOLLOW_32_in_r_extension847); if (failed) return retval;
                            	    if ( backtracking==0 ) {
                            	    char_literal158_tree = (Object)adaptor.create(char_literal158);
                            	    adaptor.addChild(root_0, char_literal158_tree);
                            	    }
                            	    pushFollow(FOLLOW_r_javaType_in_r_extension849);
                            	    /** START EDITED */
                            	    	if(backtracking==0) {
                            	    		assignNextNodeTo("r_javaType159");
                            	    	}
                            	    /** END EDITED */
                            	    r_javaType159=r_javaType();
                            	    _fsp--;
                            	    if (failed) return retval;
                            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_javaType159.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal160=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal160", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_extension856); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal160_tree = (Object)adaptor.create(char_literal160);
                    adaptor.addChild(root_0, char_literal160_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:162:4: r_expression
                    {
                    pushFollow(FOLLOW_r_expression_in_r_extension863);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression161");
                    	}
                    /** END EDITED */
                    r_expression161=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression161.getTree());

                    }
                    break;

            }

            char_literal162=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal162", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,28,FOLLOW_28_in_r_extension866); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal162_tree = (Object)adaptor.create(char_literal162);
            adaptor.addChild(root_0, char_literal162_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_extension");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_extension

    public static class r_javaType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_javaType
    // src/org/eclipse/xpand3/parser/Xpand3.g:165:1: r_javaType : r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* ;
    public final r_javaType_return r_javaType() throws RecognitionException {
        r_javaType_return retval = new r_javaType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal164=null;
        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;
        r_identifier_return r_identifier163 = null;

        r_identifier_return r_identifier165 = null;


        Object char_literal164_tree=null;
        Object string_literal166_tree=null;
        Object string_literal167_tree=null;
        Object string_literal168_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_javaType");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:165:13: ( r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:166:2: r_identifier ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_identifier_in_r_javaType877);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_identifier163");
            	}
            /** END EDITED */
            r_identifier163=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier163.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:167:2: ( '.' ( r_identifier | 'Collection' | 'List' | 'Set' ) )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:167:3: '.' ( r_identifier | 'Collection' | 'List' | 'Set' )
            	    {
            	    char_literal164=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("char_literal164", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,68,FOLLOW_68_in_r_javaType883); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal164_tree = (Object)adaptor.create(char_literal164);
            	    adaptor.addChild(root_0, char_literal164_tree);
            	    }
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:167:7: ( r_identifier | 'Collection' | 'List' | 'Set' )
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
            	            new NoViableAltException("167:7: ( r_identifier | 'Collection' | 'List' | 'Set' )", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:167:8: r_identifier
            	            {
            	            pushFollow(FOLLOW_r_identifier_in_r_javaType886);
            	            /** START EDITED */
            	            	if(backtracking==0) {
            	            		assignNextNodeTo("r_identifier165");
            	            	}
            	            /** END EDITED */
            	            r_identifier165=r_identifier();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier165.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:167:22: 'Collection'
            	            {
            	            string_literal166=(Token)input.LT(1);
            	            /** START EDITED */
            	            if(backtracking==0) {
            	              tokenConsumed("string_literal166", (CommonToken) input.LT(1));
            	            }
            	            /** END EDITED */
            	            match(input,69,FOLLOW_69_in_r_javaType889); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal166_tree = (Object)adaptor.create(string_literal166);
            	            adaptor.addChild(root_0, string_literal166_tree);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:168:2: 'List'
            	            {
            	            string_literal167=(Token)input.LT(1);
            	            /** START EDITED */
            	            if(backtracking==0) {
            	              tokenConsumed("string_literal167", (CommonToken) input.LT(1));
            	            }
            	            /** END EDITED */
            	            match(input,70,FOLLOW_70_in_r_javaType895); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal167_tree = (Object)adaptor.create(string_literal167);
            	            adaptor.addChild(root_0, string_literal167_tree);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // src/org/eclipse/xpand3/parser/Xpand3.g:168:10: 'Set'
            	            {
            	            string_literal168=(Token)input.LT(1);
            	            /** START EDITED */
            	            if(backtracking==0) {
            	              tokenConsumed("string_literal168", (CommonToken) input.LT(1));
            	            }
            	            /** END EDITED */
            	            match(input,71,FOLLOW_71_in_r_javaType898); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            string_literal168_tree = (Object)adaptor.create(string_literal168);
            	            adaptor.addChild(root_0, string_literal168_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_javaType");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_javaType

    public static class test_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start test_expression
    // src/org/eclipse/xpand3/parser/Xpand3.g:175:1: test_expression : r_expression EOF ;
    public final test_expression_return test_expression() throws RecognitionException {
        test_expression_return retval = new test_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF170=null;
        r_expression_return r_expression169 = null;


        Object EOF170_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("test_expression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:175:16: ( r_expression EOF )
            // src/org/eclipse/xpand3/parser/Xpand3.g:176:3: r_expression EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_expression_in_test_expression916);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression169");
            	}
            /** END EDITED */
            r_expression169=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression169.getTree());
            EOF170=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("EOF170", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,EOF,FOLLOW_EOF_in_test_expression918); if (failed) return retval;
            if ( backtracking==0 ) {
            EOF170_tree = (Object)adaptor.create(EOF170);
            adaptor.addChild(root_0, EOF170_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("test_expression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end test_expression

    public static class r_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_expression
    // src/org/eclipse/xpand3/parser/Xpand3.g:178:1: r_expression : r_letExpression ;
    public final r_expression_return r_expression() throws RecognitionException {
        r_expression_return retval = new r_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_letExpression_return r_letExpression171 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_expression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:178:14: ( r_letExpression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:179:2: r_letExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_letExpression_in_r_expression927);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_letExpression171");
            	}
            /** END EDITED */
            r_letExpression171=r_letExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_letExpression171.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_expression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_expression

    public static class r_letExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_letExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:182:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );
    public final r_letExpression_return r_letExpression() throws RecognitionException {
        r_letExpression_return retval = new r_letExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal172=null;
        Token char_literal174=null;
        Token char_literal176=null;
        r_identifier_return r_identifier173 = null;

        r_castedExpression_return r_castedExpression175 = null;

        r_expression_return r_expression177 = null;

        r_castedExpression_return r_castedExpression178 = null;


        Object string_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_letExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:182:18: ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=StringLiteral && LA43_0<=Identifier)||LA43_0==31||LA43_0==36||LA43_0==59||(LA43_0>=69 && LA43_0<=71)||(LA43_0>=78 && LA43_0<=79)||(LA43_0>=94 && LA43_0<=108)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("182:1: r_letExpression : ( 'let' r_identifier '=' r_castedExpression ':' r_expression | r_castedExpression );", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:183:4: 'let' r_identifier '=' r_castedExpression ':' r_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal172=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal172", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,72,FOLLOW_72_in_r_letExpression940); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal172_tree = (Object)adaptor.create(string_literal172);
                    adaptor.addChild(root_0, string_literal172_tree);
                    }
                    pushFollow(FOLLOW_r_identifier_in_r_letExpression942);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_identifier173");
                    	}
                    /** END EDITED */
                    r_identifier173=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier173.getTree());
                    char_literal174=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal174", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,73,FOLLOW_73_in_r_letExpression944); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal174_tree = (Object)adaptor.create(char_literal174);
                    adaptor.addChild(root_0, char_literal174_tree);
                    }
                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression946);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_castedExpression175");
                    	}
                    /** END EDITED */
                    r_castedExpression175=r_castedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_castedExpression175.getTree());
                    char_literal176=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal176", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,61,FOLLOW_61_in_r_letExpression948); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal176_tree = (Object)adaptor.create(char_literal176);
                    adaptor.addChild(root_0, char_literal176_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_letExpression950);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression177");
                    	}
                    /** END EDITED */
                    r_expression177=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression177.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:184:4: r_castedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_castedExpression_in_r_letExpression956);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_castedExpression178");
                    	}
                    /** END EDITED */
                    r_castedExpression178=r_castedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_castedExpression178.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_letExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_letExpression

    public static class r_castedExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_castedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:187:1: r_castedExpression : ( ( '(' r_type ')' r_chainExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression );
    public final r_castedExpression_return r_castedExpression() throws RecognitionException {
        r_castedExpression_return retval = new r_castedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal179=null;
        Token char_literal181=null;
        r_type_return r_type180 = null;

        r_chainExpression_return r_chainExpression182 = null;

        r_chainExpression_return r_chainExpression183 = null;


        Object char_literal179_tree=null;
        Object char_literal181_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_castedExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:187:20: ( ( '(' r_type ')' r_chainExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:188:5: ( '(' r_type ')' r_chainExpression )=> '(' r_type ')' r_chainExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal179=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal179", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_castedExpression982); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal179_tree = (Object)adaptor.create(char_literal179);
                    adaptor.addChild(root_0, char_literal179_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_castedExpression984);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_type180");
                    	}
                    /** END EDITED */
                    r_type180=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type180.getTree());
                    char_literal181=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal181", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_castedExpression986); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal181_tree = (Object)adaptor.create(char_literal181);
                    adaptor.addChild(root_0, char_literal181_tree);
                    }
                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression988);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_chainExpression182");
                    	}
                    /** END EDITED */
                    r_chainExpression182=r_chainExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_chainExpression182.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:190:4: r_chainExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_chainExpression_in_r_castedExpression994);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_chainExpression183");
                    	}
                    /** END EDITED */
                    r_chainExpression183=r_chainExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_chainExpression183.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_castedExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_castedExpression

    public static class r_chainExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_chainExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:193:1: r_chainExpression : r_ifExpression ( '->' r_ifExpression )* ;
    public final r_chainExpression_return r_chainExpression() throws RecognitionException {
        r_chainExpression_return retval = new r_chainExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal185=null;
        r_ifExpression_return r_ifExpression184 = null;

        r_ifExpression_return r_ifExpression186 = null;


        Object string_literal185_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_chainExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:193:20: ( r_ifExpression ( '->' r_ifExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:194:2: r_ifExpression ( '->' r_ifExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression1006);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_ifExpression184");
            	}
            /** END EDITED */
            r_ifExpression184=r_ifExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_ifExpression184.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:194:18: ( '->' r_ifExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==74) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:194:20: '->' r_ifExpression
            	    {
            	    string_literal185=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("string_literal185", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,74,FOLLOW_74_in_r_chainExpression1011); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal185_tree = (Object)adaptor.create(string_literal185);
            	    adaptor.addChild(root_0, string_literal185_tree);
            	    }
            	    pushFollow(FOLLOW_r_ifExpression_in_r_chainExpression1013);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_ifExpression186");
            	    	}
            	    /** END EDITED */
            	    r_ifExpression186=r_ifExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_ifExpression186.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_chainExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_chainExpression

    public static class r_ifExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_ifExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:197:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );
    public final r_ifExpression_return r_ifExpression() throws RecognitionException {
        r_ifExpression_return retval = new r_ifExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal188=null;
        Token char_literal190=null;
        Token string_literal192=null;
        Token string_literal194=null;
        Token string_literal196=null;
        r_switchExpression_return r_switchExpression187 = null;

        r_expression_return r_expression189 = null;

        r_switchExpression_return r_switchExpression191 = null;

        r_expression_return r_expression193 = null;

        r_switchExpression_return r_switchExpression195 = null;

        r_switchExpression_return r_switchExpression197 = null;


        Object char_literal188_tree=null;
        Object char_literal190_tree=null;
        Object string_literal192_tree=null;
        Object string_literal194_tree=null;
        Object string_literal196_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_ifExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:197:17: ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=StringLiteral && LA48_0<=Identifier)||LA48_0==31||LA48_0==36||(LA48_0>=69 && LA48_0<=71)||(LA48_0>=78 && LA48_0<=79)||(LA48_0>=94 && LA48_0<=108)) ) {
                alt48=1;
            }
            else if ( (LA48_0==59) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("197:1: r_ifExpression : ( r_switchExpression ( '?' r_expression ':' r_switchExpression )? | 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )? );", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:198:2: r_switchExpression ( '?' r_expression ':' r_switchExpression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1027);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_switchExpression187");
                    	}
                    /** END EDITED */
                    r_switchExpression187=r_switchExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression187.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:198:21: ( '?' r_expression ':' r_switchExpression )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==75) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:198:22: '?' r_expression ':' r_switchExpression
                            {
                            char_literal188=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal188", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,75,FOLLOW_75_in_r_ifExpression1030); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal188_tree = (Object)adaptor.create(char_literal188);
                            adaptor.addChild(root_0, char_literal188_tree);
                            }
                            pushFollow(FOLLOW_r_expression_in_r_ifExpression1032);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_expression189");
                            	}
                            /** END EDITED */
                            r_expression189=r_expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression189.getTree());
                            char_literal190=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal190", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,61,FOLLOW_61_in_r_ifExpression1034); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal190_tree = (Object)adaptor.create(char_literal190);
                            adaptor.addChild(root_0, char_literal190_tree);
                            }
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1036);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_switchExpression191");
                            	}
                            /** END EDITED */
                            r_switchExpression191=r_switchExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression191.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:199:3: 'if' r_expression 'then' r_switchExpression ( 'else' r_switchExpression )?
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal192=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal192", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,59,FOLLOW_59_in_r_ifExpression1043); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal192_tree = (Object)adaptor.create(string_literal192);
                    adaptor.addChild(root_0, string_literal192_tree);
                    }
                    pushFollow(FOLLOW_r_expression_in_r_ifExpression1045);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression193");
                    	}
                    /** END EDITED */
                    r_expression193=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression193.getTree());
                    string_literal194=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal194", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,76,FOLLOW_76_in_r_ifExpression1047); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal194_tree = (Object)adaptor.create(string_literal194);
                    adaptor.addChild(root_0, string_literal194_tree);
                    }
                    pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1049);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_switchExpression195");
                    	}
                    /** END EDITED */
                    r_switchExpression195=r_switchExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression195.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:199:47: ( 'else' r_switchExpression )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==77) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:199:48: 'else' r_switchExpression
                            {
                            string_literal196=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("string_literal196", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,77,FOLLOW_77_in_r_ifExpression1052); if (failed) return retval;
                            if ( backtracking==0 ) {
                            string_literal196_tree = (Object)adaptor.create(string_literal196);
                            adaptor.addChild(root_0, string_literal196_tree);
                            }
                            pushFollow(FOLLOW_r_switchExpression_in_r_ifExpression1054);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_switchExpression197");
                            	}
                            /** END EDITED */
                            r_switchExpression197=r_switchExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_switchExpression197.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_ifExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_ifExpression

    public static class r_switchExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_switchExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:202:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? '{' ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );
    public final r_switchExpression_return r_switchExpression() throws RecognitionException {
        r_switchExpression_return retval = new r_switchExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal198=null;
        Token char_literal199=null;
        Token char_literal201=null;
        Token char_literal202=null;
        Token string_literal204=null;
        Token char_literal205=null;
        Token char_literal207=null;
        r_orExpression_return r_orExpression200 = null;

        r_casePart_return r_casePart203 = null;

        r_orExpression_return r_orExpression206 = null;

        r_orExpression_return r_orExpression208 = null;


        Object string_literal198_tree=null;
        Object char_literal199_tree=null;
        Object char_literal201_tree=null;
        Object char_literal202_tree=null;
        Object string_literal204_tree=null;
        Object char_literal205_tree=null;
        Object char_literal207_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_switchExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:202:21: ( 'switch' ( '(' r_orExpression ')' )? '{' ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==78) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=StringLiteral && LA51_0<=Identifier)||LA51_0==31||LA51_0==36||(LA51_0>=69 && LA51_0<=71)||LA51_0==79||(LA51_0>=94 && LA51_0<=108)) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("202:1: r_switchExpression : ( 'switch' ( '(' r_orExpression ')' )? '{' ( r_casePart )* 'default' ':' r_orExpression '}' | r_orExpression );", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:203:4: 'switch' ( '(' r_orExpression ')' )? '{' ( r_casePart )* 'default' ':' r_orExpression '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal198=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal198", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,78,FOLLOW_78_in_r_switchExpression1070); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal198_tree = (Object)adaptor.create(string_literal198);
                    adaptor.addChild(root_0, string_literal198_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:203:13: ( '(' r_orExpression ')' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==31) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:203:14: '(' r_orExpression ')'
                            {
                            char_literal199=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal199", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,31,FOLLOW_31_in_r_switchExpression1073); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal199_tree = (Object)adaptor.create(char_literal199);
                            adaptor.addChild(root_0, char_literal199_tree);
                            }
                            pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1075);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_orExpression200");
                            	}
                            /** END EDITED */
                            r_orExpression200=r_orExpression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_orExpression200.getTree());
                            char_literal201=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal201", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,34,FOLLOW_34_in_r_switchExpression1077); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal201_tree = (Object)adaptor.create(char_literal201);
                            adaptor.addChild(root_0, char_literal201_tree);
                            }

                            }
                            break;

                    }

                    char_literal202=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal202", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,79,FOLLOW_79_in_r_switchExpression1081); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal202_tree = (Object)adaptor.create(char_literal202);
                    adaptor.addChild(root_0, char_literal202_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:204:2: ( r_casePart )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==82) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:204:2: r_casePart
                    	    {
                    	    pushFollow(FOLLOW_r_casePart_in_r_switchExpression1084);
                    	    /** START EDITED */
                    	    	if(backtracking==0) {
                    	    		assignNextNodeTo("r_casePart203");
                    	    	}
                    	    /** END EDITED */
                    	    r_casePart203=r_casePart();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, r_casePart203.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    string_literal204=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal204", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,80,FOLLOW_80_in_r_switchExpression1090); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal204_tree = (Object)adaptor.create(string_literal204);
                    adaptor.addChild(root_0, string_literal204_tree);
                    }
                    char_literal205=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal205", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,61,FOLLOW_61_in_r_switchExpression1092); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal205_tree = (Object)adaptor.create(char_literal205);
                    adaptor.addChild(root_0, char_literal205_tree);
                    }
                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1094);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_orExpression206");
                    	}
                    /** END EDITED */
                    r_orExpression206=r_orExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_orExpression206.getTree());
                    char_literal207=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal207", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,81,FOLLOW_81_in_r_switchExpression1099); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal207_tree = (Object)adaptor.create(char_literal207);
                    adaptor.addChild(root_0, char_literal207_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:207:4: r_orExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_orExpression_in_r_switchExpression1104);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_orExpression208");
                    	}
                    /** END EDITED */
                    r_orExpression208=r_orExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_orExpression208.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_switchExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_switchExpression

    public static class r_casePart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_casePart
    // src/org/eclipse/xpand3/parser/Xpand3.g:210:1: r_casePart : 'case' r_expression ':' r_expression ;
    public final r_casePart_return r_casePart() throws RecognitionException {
        r_casePart_return retval = new r_casePart_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal209=null;
        Token char_literal211=null;
        r_expression_return r_expression210 = null;

        r_expression_return r_expression212 = null;


        Object string_literal209_tree=null;
        Object char_literal211_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_casePart");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:210:12: ( 'case' r_expression ':' r_expression )
            // src/org/eclipse/xpand3/parser/Xpand3.g:211:2: 'case' r_expression ':' r_expression
            {
            root_0 = (Object)adaptor.nil();

            string_literal209=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal209", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,82,FOLLOW_82_in_r_casePart1115); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal209_tree = (Object)adaptor.create(string_literal209);
            adaptor.addChild(root_0, string_literal209_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_casePart1117);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression210");
            	}
            /** END EDITED */
            r_expression210=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression210.getTree());
            char_literal211=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal211", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,61,FOLLOW_61_in_r_casePart1119); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal211_tree = (Object)adaptor.create(char_literal211);
            adaptor.addChild(root_0, char_literal211_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_casePart1121);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression212");
            	}
            /** END EDITED */
            r_expression212=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression212.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_casePart");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_casePart

    public static class r_orExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_orExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:213:1: r_orExpression : r_andExpression ( '||' r_andExpression )* ;
    public final r_orExpression_return r_orExpression() throws RecognitionException {
        r_orExpression_return retval = new r_orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal214=null;
        r_andExpression_return r_andExpression213 = null;

        r_andExpression_return r_andExpression215 = null;


        Object string_literal214_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_orExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:213:16: ( r_andExpression ( '||' r_andExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:214:4: r_andExpression ( '||' r_andExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_andExpression_in_r_orExpression1133);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_andExpression213");
            	}
            /** END EDITED */
            r_andExpression213=r_andExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_andExpression213.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:214:21: ( '||' r_andExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==83) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:214:22: '||' r_andExpression
            	    {
            	    string_literal214=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("string_literal214", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,83,FOLLOW_83_in_r_orExpression1137); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal214_tree = (Object)adaptor.create(string_literal214);
            	    adaptor.addChild(root_0, string_literal214_tree);
            	    }
            	    pushFollow(FOLLOW_r_andExpression_in_r_orExpression1139);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_andExpression215");
            	    	}
            	    /** END EDITED */
            	    r_andExpression215=r_andExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_andExpression215.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_orExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_orExpression

    public static class r_andExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_andExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:217:1: r_andExpression : r_impliesExpression ( '&&' r_impliesExpression )* ;
    public final r_andExpression_return r_andExpression() throws RecognitionException {
        r_andExpression_return retval = new r_andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal217=null;
        r_impliesExpression_return r_impliesExpression216 = null;

        r_impliesExpression_return r_impliesExpression218 = null;


        Object string_literal217_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_andExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:217:18: ( r_impliesExpression ( '&&' r_impliesExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:218:2: r_impliesExpression ( '&&' r_impliesExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression1154);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_impliesExpression216");
            	}
            /** END EDITED */
            r_impliesExpression216=r_impliesExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_impliesExpression216.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:218:23: ( '&&' r_impliesExpression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==84) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:218:24: '&&' r_impliesExpression
            	    {
            	    string_literal217=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("string_literal217", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,84,FOLLOW_84_in_r_andExpression1158); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal217_tree = (Object)adaptor.create(string_literal217);
            	    adaptor.addChild(root_0, string_literal217_tree);
            	    }
            	    pushFollow(FOLLOW_r_impliesExpression_in_r_andExpression1160);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_impliesExpression218");
            	    	}
            	    /** END EDITED */
            	    r_impliesExpression218=r_impliesExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_impliesExpression218.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_andExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_andExpression

    public static class r_impliesExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_impliesExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:221:1: r_impliesExpression : r_relationalExpression ( 'implies' r_relationalExpression )* ;
    public final r_impliesExpression_return r_impliesExpression() throws RecognitionException {
        r_impliesExpression_return retval = new r_impliesExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal220=null;
        r_relationalExpression_return r_relationalExpression219 = null;

        r_relationalExpression_return r_relationalExpression221 = null;


        Object string_literal220_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_impliesExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:221:21: ( r_relationalExpression ( 'implies' r_relationalExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:222:2: r_relationalExpression ( 'implies' r_relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression1175);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_relationalExpression219");
            	}
            /** END EDITED */
            r_relationalExpression219=r_relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_relationalExpression219.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:222:26: ( 'implies' r_relationalExpression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==85) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:222:27: 'implies' r_relationalExpression
            	    {
            	    string_literal220=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("string_literal220", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,85,FOLLOW_85_in_r_impliesExpression1179); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal220_tree = (Object)adaptor.create(string_literal220);
            	    adaptor.addChild(root_0, string_literal220_tree);
            	    }
            	    pushFollow(FOLLOW_r_relationalExpression_in_r_impliesExpression1181);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_relationalExpression221");
            	    	}
            	    /** END EDITED */
            	    r_relationalExpression221=r_relationalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_relationalExpression221.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_impliesExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_impliesExpression

    public static class r_relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_relationalExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:225:1: r_relationalExpression : r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* ;
    public final r_relationalExpression_return r_relationalExpression() throws RecognitionException {
        r_relationalExpression_return retval = new r_relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set223=null;
        r_additiveExpression_return r_additiveExpression222 = null;

        r_additiveExpression_return r_additiveExpression224 = null;


        Object set223_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_relationalExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:225:24: ( r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:226:2: r_additiveExpression ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression1197);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_additiveExpression222");
            	}
            /** END EDITED */
            r_additiveExpression222=r_additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_additiveExpression222.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:227:2: ( ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=86 && LA55_0<=91)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:227:3: ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r_additiveExpression
            	    {
            	    set223=(Token)input.LT(1);
            	    if ( (input.LA(1)>=86 && input.LA(1)<=91) ) {
            	        /** START EDITED */
            	        if(backtracking==0) {
            	    	  tokenConsumed("set223", (CommonToken) input.LT(1));
            	    	}  
            	    	/** END EDITED */    input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set223));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_relationalExpression1202);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_additiveExpression_in_r_relationalExpression1226);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_additiveExpression224");
            	    	}
            	    /** END EDITED */
            	    r_additiveExpression224=r_additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_additiveExpression224.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_relationalExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_relationalExpression

    public static class r_additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_additiveExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:230:1: r_additiveExpression : r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* ;
    public final r_additiveExpression_return r_additiveExpression() throws RecognitionException {
        r_additiveExpression_return retval = new r_additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set226=null;
        r_multiplicativeExpression_return r_multiplicativeExpression225 = null;

        r_multiplicativeExpression_return r_multiplicativeExpression227 = null;


        Object set226_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_additiveExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:230:22: ( r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:231:2: r_multiplicativeExpression ( ( '+' | '-' ) r_multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1239);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_multiplicativeExpression225");
            	}
            /** END EDITED */
            r_multiplicativeExpression225=r_multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_multiplicativeExpression225.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:232:4: ( ( '+' | '-' ) r_multiplicativeExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==36) ) {
                    int LA56_2 = input.LA(2);

                    if ( ((LA56_2>=StringLiteral && LA56_2<=Identifier)||LA56_2==31||LA56_2==36||(LA56_2>=69 && LA56_2<=71)||LA56_2==79||(LA56_2>=94 && LA56_2<=108)) ) {
                        alt56=1;
                    }


                }
                else if ( (LA56_0==92) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:232:5: ( '+' | '-' ) r_multiplicativeExpression
            	    {
            	    set226=(Token)input.LT(1);
            	    if ( input.LA(1)==36||input.LA(1)==92 ) {
            	        /** START EDITED */
            	        if(backtracking==0) {
            	    	  tokenConsumed("set226", (CommonToken) input.LT(1));
            	    	}  
            	    	/** END EDITED */    input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set226));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_additiveExpression1246);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1253);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_multiplicativeExpression227");
            	    	}
            	    /** END EDITED */
            	    r_multiplicativeExpression227=r_multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_multiplicativeExpression227.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_additiveExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_additiveExpression

    public static class r_multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_multiplicativeExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:235:1: r_multiplicativeExpression : r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* ;
    public final r_multiplicativeExpression_return r_multiplicativeExpression() throws RecognitionException {
        r_multiplicativeExpression_return retval = new r_multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set229=null;
        r_unaryExpression_return r_unaryExpression228 = null;

        r_unaryExpression_return r_unaryExpression230 = null;


        Object set229_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_multiplicativeExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:235:28: ( r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:236:2: r_unaryExpression ( ( '*' | '/' ) r_unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1266);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_unaryExpression228");
            	}
            /** END EDITED */
            r_unaryExpression228=r_unaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_unaryExpression228.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:237:2: ( ( '*' | '/' ) r_unaryExpression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==33||LA57_0==93) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:237:3: ( '*' | '/' ) r_unaryExpression
            	    {
            	    set229=(Token)input.LT(1);
            	    if ( input.LA(1)==33||input.LA(1)==93 ) {
            	        /** START EDITED */
            	        if(backtracking==0) {
            	    	  tokenConsumed("set229", (CommonToken) input.LT(1));
            	    	}  
            	    	/** END EDITED */    input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set229));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_multiplicativeExpression1271);    throw mse;
            	    }

            	    pushFollow(FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1279);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_unaryExpression230");
            	    	}
            	    /** END EDITED */
            	    r_unaryExpression230=r_unaryExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_unaryExpression230.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_multiplicativeExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_multiplicativeExpression

    public static class r_unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_unaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:241:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );
    public final r_unaryExpression_return r_unaryExpression() throws RecognitionException {
        r_unaryExpression_return retval = new r_unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal232=null;
        Token char_literal234=null;
        r_infixExpression_return r_infixExpression231 = null;

        r_infixExpression_return r_infixExpression233 = null;

        r_infixExpression_return r_infixExpression235 = null;


        Object char_literal232_tree=null;
        Object char_literal234_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_unaryExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:241:19: ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression )
            int alt58=3;
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
                alt58=1;
                }
                break;
            case 94:
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
                    new NoViableAltException("241:1: r_unaryExpression : ( r_infixExpression | '!' r_infixExpression | '-' r_infixExpression );", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:242:2: r_infixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1293);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_infixExpression231");
                    	}
                    /** END EDITED */
                    r_infixExpression231=r_infixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_infixExpression231.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:243:3: '!' r_infixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal232=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal232", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,94,FOLLOW_94_in_r_unaryExpression1298); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal232_tree = (Object)adaptor.create(char_literal232);
                    adaptor.addChild(root_0, char_literal232_tree);
                    }
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1300);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_infixExpression233");
                    	}
                    /** END EDITED */
                    r_infixExpression233=r_infixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_infixExpression233.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:244:3: '-' r_infixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal234=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal234", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,36,FOLLOW_36_in_r_unaryExpression1305); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal234_tree = (Object)adaptor.create(char_literal234);
                    adaptor.addChild(root_0, char_literal234_tree);
                    }
                    pushFollow(FOLLOW_r_infixExpression_in_r_unaryExpression1307);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_infixExpression235");
                    	}
                    /** END EDITED */
                    r_infixExpression235=r_infixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_infixExpression235.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_unaryExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_unaryExpression

    public static class r_infixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_infixExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:247:1: r_infixExpression : r_primaryExpression ( '.' r_featureCall )* ;
    public final r_infixExpression_return r_infixExpression() throws RecognitionException {
        r_infixExpression_return retval = new r_infixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal237=null;
        r_primaryExpression_return r_primaryExpression236 = null;

        r_featureCall_return r_featureCall238 = null;


        Object char_literal237_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_infixExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:247:19: ( r_primaryExpression ( '.' r_featureCall )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:248:2: r_primaryExpression ( '.' r_featureCall )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_primaryExpression_in_r_infixExpression1318);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_primaryExpression236");
            	}
            /** END EDITED */
            r_primaryExpression236=r_primaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_primaryExpression236.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:248:23: ( '.' r_featureCall )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==68) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:248:25: '.' r_featureCall
            	    {
            	    char_literal237=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("char_literal237", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,68,FOLLOW_68_in_r_infixExpression1323); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal237_tree = (Object)adaptor.create(char_literal237);
            	    adaptor.addChild(root_0, char_literal237_tree);
            	    }
            	    pushFollow(FOLLOW_r_featureCall_in_r_infixExpression1325);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_featureCall238");
            	    	}
            	    /** END EDITED */
            	    r_featureCall238=r_featureCall();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_featureCall238.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_infixExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_infixExpression

    public static class r_primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_primaryExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:251:1: r_primaryExpression : ( r_stringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );
    public final r_primaryExpression_return r_primaryExpression() throws RecognitionException {
        r_primaryExpression_return retval = new r_primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_stringLiteral_return r_stringLiteral239 = null;

        r_featureCall_return r_featureCall240 = null;

        r_booleanLiteral_return r_booleanLiteral241 = null;

        r_numberLiteral_return r_numberLiteral242 = null;

        r_nullLiteral_return r_nullLiteral243 = null;

        r_listLiteral_return r_listLiteral244 = null;

        r_constructorCall_return r_constructorCall245 = null;

        r_globalVarExpression_return r_globalVarExpression246 = null;

        r_paranthesizedExpression_return r_paranthesizedExpression247 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_primaryExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:251:23: ( r_stringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression )
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
            case 79:
                {
                alt60=6;
                }
                break;
            case 96:
                {
                alt60=7;
                }
                break;
            case 95:
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
                    new NoViableAltException("251:1: r_primaryExpression : ( r_stringLiteral | r_featureCall | r_booleanLiteral | r_numberLiteral | r_nullLiteral | r_listLiteral | r_constructorCall | r_globalVarExpression | r_paranthesizedExpression );", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:252:5: r_stringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_stringLiteral_in_r_primaryExpression1344);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_stringLiteral239");
                    	}
                    /** END EDITED */
                    r_stringLiteral239=r_stringLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_stringLiteral239.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:253:5: r_featureCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_featureCall_in_r_primaryExpression1352);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_featureCall240");
                    	}
                    /** END EDITED */
                    r_featureCall240=r_featureCall();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_featureCall240.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:254:5: r_booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_booleanLiteral_in_r_primaryExpression1359);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_booleanLiteral241");
                    	}
                    /** END EDITED */
                    r_booleanLiteral241=r_booleanLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_booleanLiteral241.getTree());

                    }
                    break;
                case 4 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:255:5: r_numberLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_numberLiteral_in_r_primaryExpression1366);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_numberLiteral242");
                    	}
                    /** END EDITED */
                    r_numberLiteral242=r_numberLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_numberLiteral242.getTree());

                    }
                    break;
                case 5 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:256:5: r_nullLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_nullLiteral_in_r_primaryExpression1373);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_nullLiteral243");
                    	}
                    /** END EDITED */
                    r_nullLiteral243=r_nullLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_nullLiteral243.getTree());

                    }
                    break;
                case 6 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:257:5: r_listLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_listLiteral_in_r_primaryExpression1380);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_listLiteral244");
                    	}
                    /** END EDITED */
                    r_listLiteral244=r_listLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_listLiteral244.getTree());

                    }
                    break;
                case 7 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:258:5: r_constructorCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_constructorCall_in_r_primaryExpression1387);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_constructorCall245");
                    	}
                    /** END EDITED */
                    r_constructorCall245=r_constructorCall();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_constructorCall245.getTree());

                    }
                    break;
                case 8 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:259:5: r_globalVarExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_globalVarExpression_in_r_primaryExpression1394);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_globalVarExpression246");
                    	}
                    /** END EDITED */
                    r_globalVarExpression246=r_globalVarExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_globalVarExpression246.getTree());

                    }
                    break;
                case 9 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:260:5: r_paranthesizedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_paranthesizedExpression_in_r_primaryExpression1401);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_paranthesizedExpression247");
                    	}
                    /** END EDITED */
                    r_paranthesizedExpression247=r_paranthesizedExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_paranthesizedExpression247.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_primaryExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_primaryExpression

    public static class r_stringLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_stringLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:263:1: r_stringLiteral : StringLiteral ;
    public final r_stringLiteral_return r_stringLiteral() throws RecognitionException {
        r_stringLiteral_return retval = new r_stringLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral248=null;

        Object StringLiteral248_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_stringLiteral");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:263:17: ( StringLiteral )
            // src/org/eclipse/xpand3/parser/Xpand3.g:264:4: StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            StringLiteral248=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("StringLiteral248", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,StringLiteral,FOLLOW_StringLiteral_in_r_stringLiteral1414); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral248_tree = (Object)adaptor.create(StringLiteral248);
            adaptor.addChild(root_0, StringLiteral248_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_stringLiteral");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_stringLiteral

    public static class r_paranthesizedExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_paranthesizedExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:267:1: r_paranthesizedExpression : '(' r_expression ')' ;
    public final r_paranthesizedExpression_return r_paranthesizedExpression() throws RecognitionException {
        r_paranthesizedExpression_return retval = new r_paranthesizedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal249=null;
        Token char_literal251=null;
        r_expression_return r_expression250 = null;


        Object char_literal249_tree=null;
        Object char_literal251_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_paranthesizedExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:267:27: ( '(' r_expression ')' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:268:5: '(' r_expression ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal249=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal249", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,31,FOLLOW_31_in_r_paranthesizedExpression1427); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal249_tree = (Object)adaptor.create(char_literal249);
            adaptor.addChild(root_0, char_literal249_tree);
            }
            pushFollow(FOLLOW_r_expression_in_r_paranthesizedExpression1429);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression250");
            	}
            /** END EDITED */
            r_expression250=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression250.getTree());
            char_literal251=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal251", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,34,FOLLOW_34_in_r_paranthesizedExpression1431); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal251_tree = (Object)adaptor.create(char_literal251);
            adaptor.addChild(root_0, char_literal251_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_paranthesizedExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_paranthesizedExpression

    public static class r_globalVarExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_globalVarExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:271:1: r_globalVarExpression : 'GLOBALVAR' r_identifier ;
    public final r_globalVarExpression_return r_globalVarExpression() throws RecognitionException {
        r_globalVarExpression_return retval = new r_globalVarExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal252=null;
        r_identifier_return r_identifier253 = null;


        Object string_literal252_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_globalVarExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:271:24: ( 'GLOBALVAR' r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:272:5: 'GLOBALVAR' r_identifier
            {
            root_0 = (Object)adaptor.nil();

            string_literal252=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal252", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,95,FOLLOW_95_in_r_globalVarExpression1446); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal252_tree = (Object)adaptor.create(string_literal252);
            adaptor.addChild(root_0, string_literal252_tree);
            }
            pushFollow(FOLLOW_r_identifier_in_r_globalVarExpression1448);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_identifier253");
            	}
            /** END EDITED */
            r_identifier253=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier253.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_globalVarExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_globalVarExpression

    public static class r_featureCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_featureCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:274:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );
    public final r_featureCall_return r_featureCall() throws RecognitionException {
        r_featureCall_return retval = new r_featureCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal255=null;
        Token char_literal257=null;
        r_identifier_return r_identifier254 = null;

        r_parameterList_return r_parameterList256 = null;

        r_type_return r_type258 = null;

        r_collectionExpression_return r_collectionExpression259 = null;


        Object char_literal255_tree=null;
        Object char_literal257_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_featureCall");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:274:16: ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression )
            int alt62=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==EOF||LA62_1==TEXT||LA62_1==Identifier||LA62_1==28||(LA62_1>=32 && LA62_1<=34)||(LA62_1>=36 && LA62_1<=37)||LA62_1==40||LA62_1==43||(LA62_1>=54 && LA62_1<=56)||(LA62_1>=60 && LA62_1<=61)||LA62_1==63||LA62_1==68||(LA62_1>=74 && LA62_1<=77)||(LA62_1>=80 && LA62_1<=93)) ) {
                    alt62=2;
                }
                else if ( (LA62_1==31) ) {
                    alt62=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("274:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );", 62, 1, input);

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
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("274:1: r_featureCall : ( r_identifier '(' ( r_parameterList )? ')' | r_type | r_collectionExpression );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:275:5: r_identifier '(' ( r_parameterList )? ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_identifier_in_r_featureCall1462);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_identifier254");
                    	}
                    /** END EDITED */
                    r_identifier254=r_identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier254.getTree());
                    char_literal255=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal255", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_featureCall1464); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal255_tree = (Object)adaptor.create(char_literal255);
                    adaptor.addChild(root_0, char_literal255_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:275:22: ( r_parameterList )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=StringLiteral && LA61_0<=Identifier)||LA61_0==31||LA61_0==36||LA61_0==59||(LA61_0>=69 && LA61_0<=72)||(LA61_0>=78 && LA61_0<=79)||(LA61_0>=94 && LA61_0<=108)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:275:23: r_parameterList
                            {
                            pushFollow(FOLLOW_r_parameterList_in_r_featureCall1467);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_parameterList256");
                            	}
                            /** END EDITED */
                            r_parameterList256=r_parameterList();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_parameterList256.getTree());

                            }
                            break;

                    }

                    char_literal257=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal257", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_featureCall1471); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal257_tree = (Object)adaptor.create(char_literal257);
                    adaptor.addChild(root_0, char_literal257_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:276:5: r_type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_type_in_r_featureCall1478);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_type258");
                    	}
                    /** END EDITED */
                    r_type258=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type258.getTree());

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:277:5: r_collectionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_collectionExpression_in_r_featureCall1486);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_collectionExpression259");
                    	}
                    /** END EDITED */
                    r_collectionExpression259=r_collectionExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_collectionExpression259.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_featureCall");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_featureCall

    public static class r_listLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_listLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:280:1: r_listLiteral : '{' ( r_expression ( ',' r_expression )* )? '}' ;
    public final r_listLiteral_return r_listLiteral() throws RecognitionException {
        r_listLiteral_return retval = new r_listLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal260=null;
        Token char_literal262=null;
        Token char_literal264=null;
        r_expression_return r_expression261 = null;

        r_expression_return r_expression263 = null;


        Object char_literal260_tree=null;
        Object char_literal262_tree=null;
        Object char_literal264_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_listLiteral");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:280:16: ( '{' ( r_expression ( ',' r_expression )* )? '}' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:281:2: '{' ( r_expression ( ',' r_expression )* )? '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal260=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal260", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,79,FOLLOW_79_in_r_listLiteral1498); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal260_tree = (Object)adaptor.create(char_literal260);
            adaptor.addChild(root_0, char_literal260_tree);
            }
            // src/org/eclipse/xpand3/parser/Xpand3.g:281:5: ( r_expression ( ',' r_expression )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=StringLiteral && LA64_0<=Identifier)||LA64_0==31||LA64_0==36||LA64_0==59||(LA64_0>=69 && LA64_0<=72)||(LA64_0>=78 && LA64_0<=79)||(LA64_0>=94 && LA64_0<=108)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:281:6: r_expression ( ',' r_expression )*
                    {
                    pushFollow(FOLLOW_r_expression_in_r_listLiteral1500);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression261");
                    	}
                    /** END EDITED */
                    r_expression261=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression261.getTree());
                    // src/org/eclipse/xpand3/parser/Xpand3.g:281:19: ( ',' r_expression )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==32) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:281:20: ',' r_expression
                    	    {
                    	    char_literal262=(Token)input.LT(1);
                    	    /** START EDITED */
                    	    if(backtracking==0) {
                    	      tokenConsumed("char_literal262", (CommonToken) input.LT(1));
                    	    }
                    	    /** END EDITED */
                    	    match(input,32,FOLLOW_32_in_r_listLiteral1503); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    char_literal262_tree = (Object)adaptor.create(char_literal262);
                    	    adaptor.addChild(root_0, char_literal262_tree);
                    	    }
                    	    pushFollow(FOLLOW_r_expression_in_r_listLiteral1505);
                    	    /** START EDITED */
                    	    	if(backtracking==0) {
                    	    		assignNextNodeTo("r_expression263");
                    	    	}
                    	    /** END EDITED */
                    	    r_expression263=r_expression();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression263.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal264=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("char_literal264", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,81,FOLLOW_81_in_r_listLiteral1510); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal264_tree = (Object)adaptor.create(char_literal264);
            adaptor.addChild(root_0, char_literal264_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_listLiteral");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_listLiteral

    public static class r_constructorCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_constructorCall
    // src/org/eclipse/xpand3/parser/Xpand3.g:284:1: r_constructorCall : 'new' r_simpleType ;
    public final r_constructorCall_return r_constructorCall() throws RecognitionException {
        r_constructorCall_return retval = new r_constructorCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal265=null;
        r_simpleType_return r_simpleType266 = null;


        Object string_literal265_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_constructorCall");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:284:20: ( 'new' r_simpleType )
            // src/org/eclipse/xpand3/parser/Xpand3.g:285:2: 'new' r_simpleType
            {
            root_0 = (Object)adaptor.nil();

            string_literal265=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal265", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,96,FOLLOW_96_in_r_constructorCall1521); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal265_tree = (Object)adaptor.create(string_literal265);
            adaptor.addChild(root_0, string_literal265_tree);
            }
            pushFollow(FOLLOW_r_simpleType_in_r_constructorCall1523);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_simpleType266");
            	}
            /** END EDITED */
            r_simpleType266=r_simpleType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType266.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_constructorCall");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_constructorCall

    public static class r_booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_booleanLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:289:1: r_booleanLiteral : ( 'false' | 'true' );
    public final r_booleanLiteral_return r_booleanLiteral() throws RecognitionException {
        r_booleanLiteral_return retval = new r_booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set267=null;

        Object set267_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_booleanLiteral");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:289:19: ( 'false' | 'true' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:
            {
            root_0 = (Object)adaptor.nil();

            set267=(Token)input.LT(1);
            if ( (input.LA(1)>=97 && input.LA(1)<=98) ) {
                /** START EDITED */
                if(backtracking==0) {
            	  tokenConsumed("set267", (CommonToken) input.LT(1));
            	}  
            	/** END EDITED */    input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set267));
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_booleanLiteral");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_booleanLiteral

    public static class r_nullLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_nullLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:293:1: r_nullLiteral : 'null' ;
    public final r_nullLiteral_return r_nullLiteral() throws RecognitionException {
        r_nullLiteral_return retval = new r_nullLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal268=null;

        Object string_literal268_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_nullLiteral");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:293:16: ( 'null' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:294:2: 'null'
            {
            root_0 = (Object)adaptor.nil();

            string_literal268=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("string_literal268", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,99,FOLLOW_99_in_r_nullLiteral1549); if (failed) return retval;
            if ( backtracking==0 ) {
            string_literal268_tree = (Object)adaptor.create(string_literal268);
            adaptor.addChild(root_0, string_literal268_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_nullLiteral");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_nullLiteral

    public static class r_numberLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_numberLiteral
    // src/org/eclipse/xpand3/parser/Xpand3.g:297:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );
    public final r_numberLiteral_return r_numberLiteral() throws RecognitionException {
        r_numberLiteral_return retval = new r_numberLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IntLiteral269=null;
        Token IntLiteral270=null;
        Token char_literal271=null;
        Token IntLiteral272=null;

        Object IntLiteral269_tree=null;
        Object IntLiteral270_tree=null;
        Object char_literal271_tree=null;
        Object IntLiteral272_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_numberLiteral");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:297:18: ( IntLiteral | IntLiteral '.' IntLiteral )
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
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("297:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA65_1==EOF||LA65_1==TEXT||LA65_1==Identifier||LA65_1==28||(LA65_1>=32 && LA65_1<=34)||(LA65_1>=36 && LA65_1<=37)||LA65_1==40||LA65_1==43||(LA65_1>=54 && LA65_1<=56)||(LA65_1>=60 && LA65_1<=61)||(LA65_1>=74 && LA65_1<=77)||(LA65_1>=80 && LA65_1<=93)) ) {
                    alt65=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("297:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("297:1: r_numberLiteral : ( IntLiteral | IntLiteral '.' IntLiteral );", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:298:4: IntLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntLiteral269=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("IntLiteral269", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1562); if (failed) return retval;
                    if ( backtracking==0 ) {
                    IntLiteral269_tree = (Object)adaptor.create(IntLiteral269);
                    adaptor.addChild(root_0, IntLiteral269_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:299:4: IntLiteral '.' IntLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    IntLiteral270=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("IntLiteral270", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1568); if (failed) return retval;
                    if ( backtracking==0 ) {
                    IntLiteral270_tree = (Object)adaptor.create(IntLiteral270);
                    adaptor.addChild(root_0, IntLiteral270_tree);
                    }
                    char_literal271=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal271", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,68,FOLLOW_68_in_r_numberLiteral1570); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal271_tree = (Object)adaptor.create(char_literal271);
                    adaptor.addChild(root_0, char_literal271_tree);
                    }
                    IntLiteral272=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("IntLiteral272", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,IntLiteral,FOLLOW_IntLiteral_in_r_numberLiteral1572); if (failed) return retval;
                    if ( backtracking==0 ) {
                    IntLiteral272_tree = (Object)adaptor.create(IntLiteral272);
                    adaptor.addChild(root_0, IntLiteral272_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_numberLiteral");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_numberLiteral

    public static class r_collectionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_collectionExpression
    // src/org/eclipse/xpand3/parser/Xpand3.g:302:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );
    public final r_collectionExpression_return r_collectionExpression() throws RecognitionException {
        r_collectionExpression_return retval = new r_collectionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal273=null;
        Token char_literal274=null;
        Token char_literal276=null;
        Token set277=null;
        Token char_literal278=null;
        Token char_literal280=null;
        Token char_literal282=null;
        r_type_return r_type275 = null;

        r_identifier_return r_identifier279 = null;

        r_expression_return r_expression281 = null;


        Object string_literal273_tree=null;
        Object char_literal274_tree=null;
        Object char_literal276_tree=null;
        Object set277_tree=null;
        Object char_literal278_tree=null;
        Object char_literal280_tree=null;
        Object char_literal282_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_collectionExpression");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:302:25: ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==100) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=101 && LA67_0<=108)) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("302:1: r_collectionExpression : ( 'typeSelect' '(' r_type ')' | ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')' );", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:303:3: 'typeSelect' '(' r_type ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal273=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("string_literal273", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,100,FOLLOW_100_in_r_collectionExpression1585); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal273_tree = (Object)adaptor.create(string_literal273);
                    adaptor.addChild(root_0, string_literal273_tree);
                    }
                    char_literal274=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal274", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_collectionExpression1589); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal274_tree = (Object)adaptor.create(char_literal274);
                    adaptor.addChild(root_0, char_literal274_tree);
                    }
                    pushFollow(FOLLOW_r_type_in_r_collectionExpression1591);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_type275");
                    	}
                    /** END EDITED */
                    r_type275=r_type();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_type275.getTree());
                    char_literal276=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal276", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_collectionExpression1593); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal276_tree = (Object)adaptor.create(char_literal276);
                    adaptor.addChild(root_0, char_literal276_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:306:4: ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' ( r_identifier '|' )? r_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    set277=(Token)input.LT(1);
                    if ( (input.LA(1)>=101 && input.LA(1)<=108) ) {
                        /** START EDITED */
                        if(backtracking==0) {
                    	  tokenConsumed("set277", (CommonToken) input.LT(1));
                    	}  
                    	/** END EDITED */    input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set277));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionExpression1602);    throw mse;
                    }

                    char_literal278=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal278", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,31,FOLLOW_31_in_r_collectionExpression1652); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal278_tree = (Object)adaptor.create(char_literal278);
                    adaptor.addChild(root_0, char_literal278_tree);
                    }
                    // src/org/eclipse/xpand3/parser/Xpand3.g:313:19: ( r_identifier '|' )?
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
                            // src/org/eclipse/xpand3/parser/Xpand3.g:313:20: r_identifier '|'
                            {
                            pushFollow(FOLLOW_r_identifier_in_r_collectionExpression1655);
                            /** START EDITED */
                            	if(backtracking==0) {
                            		assignNextNodeTo("r_identifier279");
                            	}
                            /** END EDITED */
                            r_identifier279=r_identifier();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier279.getTree());
                            char_literal280=(Token)input.LT(1);
                            /** START EDITED */
                            if(backtracking==0) {
                              tokenConsumed("char_literal280", (CommonToken) input.LT(1));
                            }
                            /** END EDITED */
                            match(input,109,FOLLOW_109_in_r_collectionExpression1657); if (failed) return retval;
                            if ( backtracking==0 ) {
                            char_literal280_tree = (Object)adaptor.create(char_literal280);
                            adaptor.addChild(root_0, char_literal280_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_r_expression_in_r_collectionExpression1661);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_expression281");
                    	}
                    /** END EDITED */
                    r_expression281=r_expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression281.getTree());
                    char_literal282=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal282", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,34,FOLLOW_34_in_r_collectionExpression1663); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal282_tree = (Object)adaptor.create(char_literal282);
                    adaptor.addChild(root_0, char_literal282_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_collectionExpression");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_collectionExpression

    public static class r_declaredParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_declaredParameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:319:1: r_declaredParameterList : r_declaredParameter ( ',' r_declaredParameter )* ;
    public final r_declaredParameterList_return r_declaredParameterList() throws RecognitionException {
        r_declaredParameterList_return retval = new r_declaredParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal284=null;
        r_declaredParameter_return r_declaredParameter283 = null;

        r_declaredParameter_return r_declaredParameter285 = null;


        Object char_literal284_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_declaredParameterList");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:319:26: ( r_declaredParameter ( ',' r_declaredParameter )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:320:2: r_declaredParameter ( ',' r_declaredParameter )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1680);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_declaredParameter283");
            	}
            /** END EDITED */
            r_declaredParameter283=r_declaredParameter();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameter283.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:320:22: ( ',' r_declaredParameter )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:320:23: ',' r_declaredParameter
            	    {
            	    char_literal284=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("char_literal284", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,32,FOLLOW_32_in_r_declaredParameterList1683); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal284_tree = (Object)adaptor.create(char_literal284);
            	    adaptor.addChild(root_0, char_literal284_tree);
            	    }
            	    pushFollow(FOLLOW_r_declaredParameter_in_r_declaredParameterList1685);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_declaredParameter285");
            	    	}
            	    /** END EDITED */
            	    r_declaredParameter285=r_declaredParameter();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_declaredParameter285.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_declaredParameterList");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_declaredParameterList

    public static class r_declaredParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_declaredParameter
    // src/org/eclipse/xpand3/parser/Xpand3.g:323:1: r_declaredParameter : r_type r_identifier ;
    public final r_declaredParameter_return r_declaredParameter() throws RecognitionException {
        r_declaredParameter_return retval = new r_declaredParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_type_return r_type286 = null;

        r_identifier_return r_identifier287 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_declaredParameter");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:323:21: ( r_type r_identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:324:2: r_type r_identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_type_in_r_declaredParameter1698);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_type286");
            	}
            /** END EDITED */
            r_type286=r_type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_type286.getTree());
            pushFollow(FOLLOW_r_identifier_in_r_declaredParameter1700);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_identifier287");
            	}
            /** END EDITED */
            r_identifier287=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier287.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_declaredParameter");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_declaredParameter

    public static class r_parameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_parameterList
    // src/org/eclipse/xpand3/parser/Xpand3.g:327:1: r_parameterList : r_expression ( ',' r_expression )* ;
    public final r_parameterList_return r_parameterList() throws RecognitionException {
        r_parameterList_return retval = new r_parameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal289=null;
        r_expression_return r_expression288 = null;

        r_expression_return r_expression290 = null;


        Object char_literal289_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_parameterList");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:327:18: ( r_expression ( ',' r_expression )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:328:5: r_expression ( ',' r_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_expression_in_r_parameterList1715);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_expression288");
            	}
            /** END EDITED */
            r_expression288=r_expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_expression288.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:328:19: ( ',' r_expression )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==32) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:328:20: ',' r_expression
            	    {
            	    char_literal289=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("char_literal289", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,32,FOLLOW_32_in_r_parameterList1719); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal289_tree = (Object)adaptor.create(char_literal289);
            	    adaptor.addChild(root_0, char_literal289_tree);
            	    }
            	    pushFollow(FOLLOW_r_expression_in_r_parameterList1721);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_expression290");
            	    	}
            	    /** END EDITED */
            	    r_expression290=r_expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_expression290.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_parameterList");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_parameterList

    public static class r_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_type
    // src/org/eclipse/xpand3/parser/Xpand3.g:333:1: r_type : ( r_collectionType | r_simpleType );
    public final r_type_return r_type() throws RecognitionException {
        r_type_return retval = new r_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        r_collectionType_return r_collectionType291 = null;

        r_simpleType_return r_simpleType292 = null;



        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_type");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:333:8: ( r_collectionType | r_simpleType )
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
                    new NoViableAltException("333:1: r_type : ( r_collectionType | r_simpleType );", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:334:2: r_collectionType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_collectionType_in_r_type1738);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_collectionType291");
                    	}
                    /** END EDITED */
                    r_collectionType291=r_collectionType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_collectionType291.getTree());

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:335:2: r_simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_r_simpleType_in_r_type1743);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_simpleType292");
                    	}
                    /** END EDITED */
                    r_simpleType292=r_simpleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType292.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_type");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_type

    public static class r_collectionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_collectionType
    // src/org/eclipse/xpand3/parser/Xpand3.g:338:1: r_collectionType : ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? ;
    public final r_collectionType_return r_collectionType() throws RecognitionException {
        r_collectionType_return retval = new r_collectionType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set293=null;
        Token char_literal294=null;
        Token char_literal296=null;
        r_simpleType_return r_simpleType295 = null;


        Object set293_tree=null;
        Object char_literal294_tree=null;
        Object char_literal296_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_collectionType");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:338:19: ( ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:339:3: ( 'Collection' | 'List' | 'Set' ) ( '[' r_simpleType ']' )?
            {
            root_0 = (Object)adaptor.nil();

            set293=(Token)input.LT(1);
            if ( (input.LA(1)>=69 && input.LA(1)<=71) ) {
                /** START EDITED */
                if(backtracking==0) {
            	  tokenConsumed("set293", (CommonToken) input.LT(1));
            	}  
            	/** END EDITED */    input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set293));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_r_collectionType1758);    throw mse;
            }

            // src/org/eclipse/xpand3/parser/Xpand3.g:340:3: ( '[' r_simpleType ']' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==110) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:340:4: '[' r_simpleType ']'
                    {
                    char_literal294=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal294", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,110,FOLLOW_110_in_r_collectionType1776); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal294_tree = (Object)adaptor.create(char_literal294);
                    adaptor.addChild(root_0, char_literal294_tree);
                    }
                    pushFollow(FOLLOW_r_simpleType_in_r_collectionType1778);
                    /** START EDITED */
                    	if(backtracking==0) {
                    		assignNextNodeTo("r_simpleType295");
                    	}
                    /** END EDITED */
                    r_simpleType295=r_simpleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, r_simpleType295.getTree());
                    char_literal296=(Token)input.LT(1);
                    /** START EDITED */
                    if(backtracking==0) {
                      tokenConsumed("char_literal296", (CommonToken) input.LT(1));
                    }
                    /** END EDITED */
                    match(input,111,FOLLOW_111_in_r_collectionType1780); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal296_tree = (Object)adaptor.create(char_literal296);
                    adaptor.addChild(root_0, char_literal296_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_collectionType");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_collectionType

    public static class r_simpleType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_simpleType
    // src/org/eclipse/xpand3/parser/Xpand3.g:343:1: r_simpleType : r_identifier ( '::' r_identifier )* ;
    public final r_simpleType_return r_simpleType() throws RecognitionException {
        r_simpleType_return retval = new r_simpleType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal298=null;
        r_identifier_return r_identifier297 = null;

        r_identifier_return r_identifier299 = null;


        Object string_literal298_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_simpleType");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:343:14: ( r_identifier ( '::' r_identifier )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:344:2: r_identifier ( '::' r_identifier )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_r_identifier_in_r_simpleType1793);
            /** START EDITED */
            	if(backtracking==0) {
            		assignNextNodeTo("r_identifier297");
            	}
            /** END EDITED */
            r_identifier297=r_identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier297.getTree());
            // src/org/eclipse/xpand3/parser/Xpand3.g:345:2: ( '::' r_identifier )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==63) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:345:3: '::' r_identifier
            	    {
            	    string_literal298=(Token)input.LT(1);
            	    /** START EDITED */
            	    if(backtracking==0) {
            	      tokenConsumed("string_literal298", (CommonToken) input.LT(1));
            	    }
            	    /** END EDITED */
            	    match(input,63,FOLLOW_63_in_r_simpleType1798); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    string_literal298_tree = (Object)adaptor.create(string_literal298);
            	    adaptor.addChild(root_0, string_literal298_tree);
            	    }
            	    pushFollow(FOLLOW_r_identifier_in_r_simpleType1800);
            	    /** START EDITED */
            	    	if(backtracking==0) {
            	    		assignNextNodeTo("r_identifier299");
            	    	}
            	    /** END EDITED */
            	    r_identifier299=r_identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, r_identifier299.getTree());

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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_simpleType");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_simpleType

    public static class r_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start r_identifier
    // src/org/eclipse/xpand3/parser/Xpand3.g:348:1: r_identifier : Identifier ;
    public final r_identifier_return r_identifier() throws RecognitionException {
        r_identifier_return retval = new r_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier300=null;

        Object Identifier300_tree=null;

        try {
        	/** START EDITED */
        	if(backtracking ==0) {
    		   ruleEntered("r_identifier");
    		}
    		/** END EDITED */
            // src/org/eclipse/xpand3/parser/Xpand3.g:348:14: ( Identifier )
            // src/org/eclipse/xpand3/parser/Xpand3.g:349:4: Identifier
            {
            root_0 = (Object)adaptor.nil();

            Identifier300=(Token)input.LT(1);
            /** START EDITED */
            if(backtracking==0) {
              tokenConsumed("Identifier300", (CommonToken) input.LT(1));
            }
            /** END EDITED */
            match(input,Identifier,FOLLOW_Identifier_in_r_identifier1816); if (failed) return retval;
            if ( backtracking==0 ) {
            Identifier300_tree = (Object)adaptor.create(Identifier300);
            adaptor.addChild(root_0, Identifier300_tree);
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
        	/** START EDITED */
        	if(backtracking==0) {
    		  ruleLeft("r_identifier");
    		}
    		/** END EDITED */
        }
        return retval;
    }
    // $ANTLR end r_identifier

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // src/org/eclipse/xpand3/parser/Xpand3.g:188:5: ( '(' r_type ')' r_chainExpression )
        // src/org/eclipse/xpand3/parser/Xpand3.g:188:6: '(' r_type ')' r_chainExpression
        {
        /** START EDITED */
        if(backtracking==0) {
          tokenConsumed(null, (CommonToken) input.LT(1));
        }
        /** END EDITED */
        match(input,31,FOLLOW_31_in_synpred1971); if (failed) return ;
        pushFollow(FOLLOW_r_type_in_synpred1973);
        r_type();
        _fsp--;
        if (failed) return ;
        /** START EDITED */
        if(backtracking==0) {
          tokenConsumed(null, (CommonToken) input.LT(1));
        }
        /** END EDITED */
        match(input,34,FOLLOW_34_in_synpred1975); if (failed) return ;
        pushFollow(FOLLOW_r_chainExpression_in_synpred1977);
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
        "\2\154\1\uffff\1\156\1\135\1\15\1\154\1\15\1\157\2\uffff\1\0\13"+
        "\uffff\1\154\1\uffff\1\135\1\15\1\135\3\0\2\37\4\0\2\15\1\0\1\157"+
        "\1\107\3\0\1\156\1\77\1\15\1\0\1\15\1\157\1\77\1\15\1\42\1\157";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\6\uffff\2\1\1\uffff\13\1\1\uffff\1\1\36\uffff";
    static final String DFA44_specialS =
        "\6\uffff\1\13\4\uffff\1\3\20\uffff\1\14\1\1\1\15\2\uffff\1\4\1\2"+
        "\1\12\1\5\2\uffff\1\6\2\uffff\1\11\1\10\1\7\3\uffff\1\0\6\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\2\21\uffff\1\1\4\uffff\1\2\26\uffff\1\2\11\uffff\3\2\6\uffff"+
            "\2\2\16\uffff\17\2",
            "\2\2\1\4\21\uffff\1\2\4\uffff\1\2\26\uffff\1\2\11\uffff\3\3"+
            "\1\2\5\uffff\2\2\16\uffff\17\2",
            "",
            "\1\2\1\6\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2\20"+
            "\uffff\1\5",
            "\1\2\1\uffff\1\2\1\6\1\uffff\1\2\32\uffff\1\7\4\uffff\1\2\5"+
            "\uffff\2\2\7\uffff\13\2",
            "\1\10",
            "\1\2\1\12\1\20\1\13\16\uffff\1\2\2\uffff\1\25\3\2\1\uffff\1"+
            "\27\1\2\2\uffff\1\2\2\uffff\1\2\12\uffff\3\2\2\uffff\1\30\2"+
            "\2\6\uffff\1\2\3\14\2\uffff\3\2\1\uffff\1\11\1\22\16\2\1\26"+
            "\1\24\1\23\2\17\1\21\1\15\10\16",
            "\1\31",
            "\1\32\57\uffff\1\33",
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
            "\7\uffff\1\44\16\uffff\1\2\1\46\1\45\2\41\1\43\1\37\10\40",
            "",
            "\1\2\1\6\1\uffff\1\2\32\uffff\1\7\4\uffff\1\2\5\uffff\2\2\7"+
            "\uffff\13\2",
            "\1\50",
            "\1\2\1\6\1\uffff\1\2\37\uffff\1\2\5\uffff\2\2\7\uffff\13\2",
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
            "\1\32\57\uffff\1\33",
            "\1\56\67\uffff\3\55",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "187:1: r_castedExpression : ( ( '(' r_type ')' r_chainExpression )=> '(' r_type ')' r_chainExpression | r_chainExpression );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_48 = input.LA(1);

                         
                        int index44_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_48);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_29 = input.LA(1);

                         
                        int index44_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_29);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_34 = input.LA(1);

                         
                        int index44_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_34);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_33 = input.LA(1);

                         
                        int index44_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_33);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_36 = input.LA(1);

                         
                        int index44_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_36);
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
                        int LA44_44 = input.LA(1);

                         
                        int index44_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_44);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_43 = input.LA(1);

                         
                        int index44_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_43);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_42 = input.LA(1);

                         
                        int index44_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_42);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_35 = input.LA(1);

                         
                        int index44_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 24;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_35);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_6==78) && (synpred1())) {s = 9;}

                        else if ( (LA44_6==StringLiteral) && (synpred1())) {s = 10;}

                        else if ( (LA44_6==Identifier) ) {s = 11;}

                        else if ( ((LA44_6>=69 && LA44_6<=71)) && (synpred1())) {s = 12;}

                        else if ( (LA44_6==100) && (synpred1())) {s = 13;}

                        else if ( ((LA44_6>=101 && LA44_6<=108)) && (synpred1())) {s = 14;}

                        else if ( ((LA44_6>=97 && LA44_6<=98)) && (synpred1())) {s = 15;}

                        else if ( (LA44_6==IntLiteral) && (synpred1())) {s = 16;}

                        else if ( (LA44_6==99) && (synpred1())) {s = 17;}

                        else if ( (LA44_6==79) && (synpred1())) {s = 18;}

                        else if ( (LA44_6==96) && (synpred1())) {s = 19;}

                        else if ( (LA44_6==95) && (synpred1())) {s = 20;}

                        else if ( (LA44_6==31) && (synpred1())) {s = 21;}

                        else if ( (LA44_6==94) && (synpred1())) {s = 22;}

                        else if ( (LA44_6==36) ) {s = 23;}

                        else if ( (LA44_6==59) && (synpred1())) {s = 24;}

                        else if ( (LA44_6==EOF||LA44_6==TEXT||LA44_6==28||(LA44_6>=32 && LA44_6<=34)||LA44_6==37||LA44_6==40||LA44_6==43||(LA44_6>=54 && LA44_6<=56)||(LA44_6>=60 && LA44_6<=61)||LA44_6==68||(LA44_6>=74 && LA44_6<=76)||(LA44_6>=80 && LA44_6<=93)) ) {s = 2;}

                         
                        input.seek(index44_6);
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
 

    public static final BitSet FOLLOW_r_nsImport_in_r_file51 = new BitSet(new long[]{0x4400000028002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_abstractDeclaration_in_r_file59 = new BitSet(new long[]{0x4400000000002010L,0x00000000000000E7L});
    public static final BitSet FOLLOW_EOF_in_r_file66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport75 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_r_nsImport77 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport81 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_nsImport88 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_r_nsImport90 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_nsImport96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_r_nsImport101 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport103 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_r_nsImport112 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_nsImport114 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30_in_r_nsImport117 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_nsImport121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_check_in_r_abstractDeclaration132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_around_in_r_abstractDeclaration137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_extension_in_r_abstractDeclaration142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definition_in_r_abstractDeclaration147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_definitionAround_in_r_abstractDeclaration152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definition164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEFINE_in_r_definition166 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_definition170 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definition173 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definition176 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definition179 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definition182 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definition188 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definition192 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definition196 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definition198 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definition201 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDDEFINE_in_r_definition204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definition206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LG_in_r_definitionAround218 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AROUND_in_r_definitionAround220 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_definitionAround222 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_r_definitionAround225 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_definitionAround228 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_definitionAround231 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround234 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_definitionAround240 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_definitionAround244 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_r_definitionAround248 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_definitionAround250 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_definitionAround253 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDAROUND_in_r_definitionAround256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RG_in_r_definitionAround258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence270 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_statement_in_r_sequence276 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_textSequence_in_r_sequence282 = new BitSet(new long[]{0x081442F080003802L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_simpleStatement_in_r_statement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_fileStatement_in_r_statement302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_foreachStatement_in_r_statement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifStatement_in_r_statement312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letStatement_in_r_statement317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_protectStatement_in_r_statement322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence333 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_r_text_in_r_textSequence336 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_r_text348 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TEXT_in_r_text351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_errorStatement_in_r_simpleStatement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expandStatement_in_r_simpleStatement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expressionStmt_in_r_simpleStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_r_errorStatement381 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_errorStatement383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_r_expandStatement394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_expandStatement396 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_31_in_r_expandStatement399 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_expandStatement401 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_expandStatement403 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_r_expandStatement409 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_expandStatement419 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement420 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_r_expandStatement423 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_expandStatement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_expressionStmt441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_r_fileStatement451 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_fileStatement453 = new BitSet(new long[]{0x0000001000002400L});
    public static final BitSet FOLLOW_r_identifier_in_r_fileStatement456 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_fileStatement462 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_r_fileStatement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_r_foreachStatement478 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement480 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_foreachStatement482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement484 = new BitSet(new long[]{0x0000111000000400L});
    public static final BitSet FOLLOW_44_in_r_foreachStatement487 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_foreachStatement489 = new BitSet(new long[]{0x0000011000000400L});
    public static final BitSet FOLLOW_40_in_r_foreachStatement494 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_foreachStatement496 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_foreachStatement504 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_r_foreachStatement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_r_ifStatement524 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifStatement526 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_ifStatement530 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseIfStatement_in_r_ifStatement535 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_r_elseStatement_in_r_ifStatement540 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_r_ifStatement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_r_elseIfStatement555 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_elseIfStatement557 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseIfStatement561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_r_elseStatement573 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_elseStatement577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_r_letStatement589 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letStatement591 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_r_letStatement593 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letStatement595 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_letStatement601 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_r_letStatement606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_r_protectStatement617 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_r_protectStatement622 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement624 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_r_protectStatement629 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement631 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_r_protectStatement644 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_protectStatement646 = new BitSet(new long[]{0x0100001000000400L});
    public static final BitSet FOLLOW_56_in_r_protectStatement648 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_r_sequence_in_r_protectStatement654 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_r_protectStatement658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_r_check670 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_check672 = new BitSet(new long[]{0x1800002000000000L});
    public static final BitSet FOLLOW_59_in_r_check675 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check677 = new BitSet(new long[]{0x1000002000000000L});
    public static final BitSet FOLLOW_set_in_r_check681 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check687 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_check689 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_check693 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_check695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_r_around710 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_r_pointcut_in_r_around712 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_around714 = new BitSet(new long[]{0x0000000600002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_around717 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_r_around720 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_r_around723 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33_in_r_around729 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_around733 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_around735 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_around742 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_around744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_r_pointcut761 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut767 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_33_in_r_pointcut775 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_r_identifier_in_r_pointcut783 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_63_in_r_pointcut791 = new BitSet(new long[]{0x8000000200002002L});
    public static final BitSet FOLLOW_set_in_r_extension805 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E7L});
    public static final BitSet FOLLOW_r_type_in_r_extension814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension817 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension819 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension822 = new BitSet(new long[]{0x0000000400002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameterList_in_r_extension824 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_extension827 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_extension829 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E8L});
    public static final BitSet FOLLOW_67_in_r_extension834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_extension838 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_extension840 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_extension842 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension844 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_32_in_r_extension847 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_javaType_in_r_extension849 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_34_in_r_extension856 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_r_expression_in_r_extension863 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_r_extension866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_javaType883 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_javaType886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_69_in_r_javaType889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_70_in_r_javaType895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_71_in_r_javaType898 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_expression_in_test_expression916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_test_expression918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_letExpression_in_r_expression927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_r_letExpression940 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_letExpression942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_r_letExpression944 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression946 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_letExpression948 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_letExpression950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_castedExpression_in_r_letExpression956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_castedExpression982 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_castedExpression984 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_castedExpression986 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_chainExpression_in_r_castedExpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression1006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_r_chainExpression1011 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_ifExpression_in_r_chainExpression1013 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_r_ifExpression1030 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression1032 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_ifExpression1034 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_r_ifExpression1043 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_ifExpression1045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_r_ifExpression1047 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1049 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_r_ifExpression1052 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_switchExpression_in_r_ifExpression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_r_switchExpression1070 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_31_in_r_switchExpression1073 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1075 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_switchExpression1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_r_switchExpression1081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_r_casePart_in_r_switchExpression1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_80_in_r_switchExpression1090 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_switchExpression1092 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_r_switchExpression1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_orExpression_in_r_switchExpression1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_r_casePart1115 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart1117 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_r_casePart1119 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_casePart1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression1133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_r_orExpression1137 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_andExpression_in_r_orExpression1139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression1154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_r_andExpression1158 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_impliesExpression_in_r_andExpression1160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression1175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_r_impliesExpression1179 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_relationalExpression_in_r_impliesExpression1181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression1197 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_set_in_r_relationalExpression1202 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_additiveExpression_in_r_relationalExpression1226 = new BitSet(new long[]{0x0000000000000002L,0x000000000FC00000L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1239 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_set_in_r_additiveExpression1246 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_multiplicativeExpression_in_r_additiveExpression1253 = new BitSet(new long[]{0x0000001000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1266 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_set_in_r_multiplicativeExpression1271 = new BitSet(new long[]{0x0000001080003800L,0x00001FFFC00080E0L});
    public static final BitSet FOLLOW_r_unaryExpression_in_r_multiplicativeExpression1279 = new BitSet(new long[]{0x0000000200000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_r_unaryExpression1298 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_r_unaryExpression1305 = new BitSet(new long[]{0x0000000080003800L,0x00001FFF800080E0L});
    public static final BitSet FOLLOW_r_infixExpression_in_r_unaryExpression1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_primaryExpression_in_r_infixExpression1318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_infixExpression1323 = new BitSet(new long[]{0x0000000000002000L,0x00001FF0000000E0L});
    public static final BitSet FOLLOW_r_featureCall_in_r_infixExpression1325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_r_stringLiteral_in_r_primaryExpression1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_featureCall_in_r_primaryExpression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_booleanLiteral_in_r_primaryExpression1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_numberLiteral_in_r_primaryExpression1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_nullLiteral_in_r_primaryExpression1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_listLiteral_in_r_primaryExpression1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_constructorCall_in_r_primaryExpression1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_globalVarExpression_in_r_primaryExpression1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_paranthesizedExpression_in_r_primaryExpression1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_r_stringLiteral1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_r_paranthesizedExpression1427 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_paranthesizedExpression1429 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_paranthesizedExpression1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_r_globalVarExpression1446 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_globalVarExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_featureCall1462 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_featureCall1464 = new BitSet(new long[]{0x0800001480003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_parameterList_in_r_featureCall1467 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_featureCall1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_type_in_r_featureCall1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_collectionExpression_in_r_featureCall1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_r_listLiteral1498 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC002C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral1500 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_32_in_r_listLiteral1503 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_listLiteral1505 = new BitSet(new long[]{0x0000000100000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_r_listLiteral1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_r_constructorCall1521 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_constructorCall1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_r_nullLiteral1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_r_numberLiteral1570 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IntLiteral_in_r_numberLiteral1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_r_collectionExpression1585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1589 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_r_collectionExpression1591 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionExpression1602 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_r_collectionExpression1652 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_identifier_in_r_collectionExpression1655 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_r_collectionExpression1657 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_collectionExpression1661 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_r_collectionExpression1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1680 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_declaredParameterList1683 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_declaredParameter_in_r_declaredParameterList1685 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_type_in_r_declaredParameter1698 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_declaredParameter1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1715 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_r_parameterList1719 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C1E0L});
    public static final BitSet FOLLOW_r_expression_in_r_parameterList1721 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_r_collectionType_in_r_type1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_simpleType_in_r_type1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_r_collectionType1758 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_r_collectionType1776 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_simpleType_in_r_collectionType1778 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_r_collectionType1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1793 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_r_simpleType1798 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_r_identifier_in_r_simpleType1800 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_r_identifier1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1971 = new BitSet(new long[]{0x0000000000002000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_r_type_in_synpred1973 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred1975 = new BitSet(new long[]{0x0800001080003800L,0x00001FFFC000C0E0L});
    public static final BitSet FOLLOW_r_chainExpression_in_synpred1977 = new BitSet(new long[]{0x0000000000000002L});

}